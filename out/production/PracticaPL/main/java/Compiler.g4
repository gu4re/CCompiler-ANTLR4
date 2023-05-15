grammar Compiler;

@parser::header{
    import java.io.*;
    import java.nio.file.Paths;
}

@parser::members{
    private StringBuilder sb = new StringBuilder();
    private String args = "";
    private boolean funlist_finished = false;
    private boolean funccall_main = false;
    private boolean funclist_color = false;
    public void setArgs(String args){
        this.args = args;
    }
}

/********* Utilities *********/
J: '\n';
SPACE: ' ';
// TAB for us is equivalent to four SPACE
TAB: '\t' -> skip;
CR: '\r' -> skip;

/********* Identifiers *********/
CONST_DEF_IDENTIFIER:   ([_][A-Z_0-9[\]]+ | [A-Z][A-Z_0-9[\]]*);
IDENTIFIER:             ([_][a-z_0-9[\]]+ | [a-z][a-z_0-9[\]]*);

/********* Integer numbers *********/
NUMERIC_INTEGER_CONST:  [+-]?[0-9]+;

/********* Real numbers *********/
fragment STATIC:        [0-9]+'.'[0-9]+;
fragment INIT:          '.'[0-9]+;
fragment POW:           [0-9]+[eE][+-]?[0-9]+;
fragment MIX:           (STATIC | INIT)[eE][+-]?[0-9]+;

NUMERIC_REAL_CONST: [+-]?(STATIC | INIT | POW | MIX); // El '+' habria que probar a ver si es necesario

/********* Strings *********/
//fragment STRING_DOUBLE: '"'([A-Za-z0-9'"\\%._]+ | SPACE)*'"';
fragment STRING_DOUBLE:  '"' ( ~["] | '\\"' | SPACE)* '"';
fragment STRING_SIMPLE: '\''(~['] | '\'' | SPACE)* '\'';
//fragment STRING_SIMPLE: '\''([A-Za-z0-9\\'"._]+ | SPACE)*'\'';

STRING_CONST:   (STRING_DOUBLE | STRING_SIMPLE){getText().replaceAll("\\\\", "");};

/********* Comments *********/
fragment ONE_LINE:      '//'(.*? | SPACE*) J;
fragment MORE_LINE:     '/*'(J | SPACE | ('*'~[/]) | .+?)+'*/' J*;

COMMENTS:   (ONE_LINE | MORE_LINE)+ -> skip;

/********* Main program *********/
program:
   {
    final String STDIN_NAME = (new File(args)).getName().replaceFirst("[.][^.]+$", "");
    final String FILE_SEP = System.getProperty("file.separator");
    final String PATH_VARIABLE = Paths.get(args).getParent().toString() + FILE_SEP;
    sb.append("<!DOCTYPE html><html><head><title>").append(STDIN_NAME).append("</title>" +
        "<style>.cte{color:rgb(107, 211, 26);} .palres{color:rgb(0, 0, 0); font-weight: bold;}" +
        ".ident{color:rgb(77, 77, 255);} .idfunc{color:rgb(26, 26, 255); text-decoration: underline;}</style>" +
        "</head>").append("<body><h1 id=\"inicio\">").append("Programa: ").append(STDIN_NAME).append("</h1>")
        .append("<h2>Funciones</h2>").append("<ul>");
   } dcllist J* funlist {sb.append($funlist.v + "<hr/><a id=\"Main\"><h2>Programa Principal</h2>" + $dcllist.v
    + "<br><br>");} J* sentlist <EOF>
   {
        sb.append($sentlist.v + "<br><a href=\"#Main\">Inicio del programa principal</a> "
        + " <a href=\"#inicio\">Inicio del programa</a>" + "</a><hr/></body></html>");
        PrintWriter fich = null;
        try{
            final String STDOUT_NAME = PATH_VARIABLE + STDIN_NAME + ".html";
            fich = new PrintWriter(new BufferedWriter(new FileWriter(STDOUT_NAME)));
            fich.print(sb.toString());
        }
        catch(IOException e){
            System.err.println("Bad file creator.\n" + e.getMessage());
            throw new RuntimeException();
        }
        finally{
            if (fich != null)
                fich.close();
        }
   };

/********* Declaration Zone *********/
dcllist returns [String v]: dcllist_R[""] {$v = $dcllist_R.v;};
// Changed recursion
dcllist_R[String h] returns [String v] : dcl J* dcllist_R[$h += $dcl.v + ($J.text == null ? "<br>" : $J.text)]
    {$v = $dcllist_R.v;} | {$v = $h;};
dcl returns [String v] : ctedef {$v = $ctedef.v;} | vardef ';' J {$v = $vardef.v + ";" + $J.text;};
// Numeric cte showed visually as a numbers without double semi-colon -> #define CODE 3
ctedef returns [String v] : '#define' (SPACE)CONST_DEF_IDENTIFIER(SPACE) simpvalue J {$v =
    "<span class=\"palres\">#define</span>" + $SPACE.text + "<span class=\"ident\">" + $CONST_DEF_IDENTIFIER.text +
    "</span>" + $SPACE.text + $simpvalue.v + $J.text;};
simpvalue returns [String v] : NUMERIC_INTEGER_CONST {$v = "<span class=\"cte\">" + $NUMERIC_INTEGER_CONST.text
    + "</span>";}
    | NUMERIC_REAL_CONST {$v = "<span class=\"cte\">" + $NUMERIC_REAL_CONST.text + "</span>";}
    | STRING_CONST {$v = "<span class=\"cte\">" + $STRING_CONST.text + "</span>";} ;
varlist : vardef ';' | vardef ';' varlist ;
vardef returns [String v] : tbas (SPACE)IDENTIFIER {$v = $tbas.v + $SPACE.text + "<span class=\"ident\">"
        + $IDENTIFIER.text + "</span>";}
    | tbas (SPACE)IDENTIFIER (SPACE)?'='(SPACE)? simpvalue {$v = $tbas.v + $SPACE.text + "<span class=\"ident\">"
        + $IDENTIFIER.text + "</span>" + ($SPACE.text == null ? "" : $SPACE.text) + "=" +
        ($SPACE.text == null ? "" : $SPACE.text) + $simpvalue.v;
    };
tbas returns [String v] : 'integer' {$v = (funclist_color ? "integer" : "<span class=\"palres\">integer</span>");}
    | 'float' {$v = (funclist_color ? "float" : "<span class=\"palres\">float</span>");}
    | 'string' {$v = (funclist_color ? "string" : "<span class=\"palres\">string</span>");}
    | tvoid {$v = $tvoid.v;}
    | struct ;
struct : 'struct' '{' varlist '}' ;
tvoid returns [String v] : 'void' {$v = (funclist_color ? "void" : "<span class=\"palres\">void</span>");} ;
/********* Functions Zone *********/
funlist returns [String v] : funlist_R["<li><a href=\"#Main\">Programa principal</a></li>"]
    {$v = $funlist_R.v;};
funlist_R[String h] returns [String v] : funcdef J*
    funlist_R[$h += $funcdef.v + ($J.text == null ? "<br>" : $J.text)] {$v = $funlist_R.v;}
    | {$v = $h;};
// Allowed to declare functions without body such us C lenguage -> integer patata(void);
// funlist_finished boolean controller that help us to know where to close the unsigned list of the function's headers
funcdef returns [String v] : {funclist_color = true;} funchead ';' {$v = "<li><a href=\"#"
        + $funchead.id + "\">" + $funchead.v + "</a></li>";}
    | {funclist_color = false;} funchead '{' (J | SPACE)* code (J | SPACE)* '}' {$v = ""; $v += (funlist_finished ? ""
        : "</ul>"); funlist_finished = true; $v += "<hr/><a id=\"" + $funchead.id + "\">" + $funchead.v + "<br>"
        + "{<div style=\"text-indent: 0.5cm\">" + $code.v + "</div>}<br></a>" +
        "<a href=\"#" + $funchead.id + "\">Inicio de la funci&oacute;n</a> " +
        " <a href=\"#inicio\">Inicio del programa</a>"; } ;
funchead returns [String v, String id] : tbas (SPACE)IDENTIFIER(SPACE)? '(' typedef1 ')' {
    $v = $tbas.v + $SPACE.text + (funclist_color ? $IDENTIFIER.text : "<span class=\"ident\">" + $IDENTIFIER.text
    + "</span>") + ($SPACE.text == null ? "" : $SPACE.text) + "(" + $typedef1.v + ")";
    $id = $IDENTIFIER.text;
};
// Added rule to allow "funcheader(void)" if you don't have args
typedef1 returns [String v] : typedef2 {$v = $typedef2.v;} | {$v = "";};
// Changed recursion
typedef2 returns [String v] : tbas (SPACE)IDENTIFIER typedef2_R[$tbas.v + $SPACE.text + (funclist_color ?
        $IDENTIFIER.text : "<span class=\"ident\">" + $IDENTIFIER.text + "</span>")]{
        $v = $typedef2_R.v;}
    | tvoid ((SPACE)IDENTIFIER)? {$v = $tvoid.v + ($IDENTIFIER.text == null ? "" : (" "+(funclist_color ?
        $IDENTIFIER.text : "<span class=\"ident\">" + $IDENTIFIER.text + "</span>")));} ;
typedef2_R [String h] returns [String v] : ','(SPACE)? tbas (SPACE)?IDENTIFIER
    typedef2_R[$h += "," + ($SPACE.text == null ? "" : $SPACE.text) + $tbas.v +
        ($SPACE.text == null ? "" : $SPACE.text) + (funclist_color ? $IDENTIFIER.text : "<span class=\"ident\">"
        + $IDENTIFIER.text + "</span>")]
        {$v = $typedef2_R.v;}
    | {$v = $h;};
/********* Sentences Zone *********/
sentlist returns [String v] : mainhead {funccall_main = true;} '{' (J | SPACE)* code (J | SPACE)* '}'
{   $v = $mainhead.v + "<br>{" + ($J.text == null ? "<br>" : $J.text) + ($SPACE.text == null ? "" : $SPACE.text) +
    "<div style=\"text-indent: 0.5cm\">" + $code.v + "</div>" + ($SPACE.text == null ? "" : $SPACE.text) + "}"; } ;
mainhead returns [String v] : tvoid (SPACE)'Main'(SPACE)? '(' typedef1 ')' {$v = $tvoid.v + $SPACE.text +
    "<span class=\"ident\">Main</span>" + ($SPACE.text == null ? "" : $SPACE.text) + "(" + $typedef1.v + ")"; };
// Changed recursion
code returns [String v] : code_R[""] {$v = $code_R.v;} ;
// Using <div> to jump to a new line because <br> does not apply text-ident style
code_R[String h] returns [String v] : sent (J | SPACE)* code_R[$h += "<div>" + $sent.v + "</div>"] {$v = $code_R.v;}
    | {$v = $h;} ;
sent returns [String v] : asig ';' {$v = $asig.v + ";";}
    | funccall ';' {$v = $funccall.v + ";";}
    | vardef ';' J {$v = $vardef.v + ";" + $J.text;} | return_m ';' {$v = $return_m.v + ";";}
    | if_ {$v = $if_.v;}
    | while_ {$v = $while_.v;}
    | dowhile_ {$v = $dowhile_.v;}
    | for_ {$v = $for_.v;} ;
// Renamed rules adding a '_' because we can't use java keywords or Parser would not compile
if_ returns [String v] : 'if'(SPACE)? expcond '{' (J | SPACE)* code (J | SPACE)* '}'(J | SPACE)* else_["if" +
    $expcond.v + "{<br>" + $code.v + "}" + ($SPACE.text == null ? "" : $SPACE.text) + ($J.text == null ? ""
    : "<br>")] {$v = $else_.v;} ;
else_[String h] returns [String v] : 'else'(J | SPACE)* '{' (J | SPACE)* code (J | SPACE)* '}' {$v = $h + "else" +
    ($SPACE.text == null ? "" : $SPACE.text) + ($J.text == null ? "": "<br>") + "{<br>" + $code.v + "}";}
    | 'else' if_ {$v = $h + "else" + $if_.v;} | {$v = $h;};
while_ returns [String v] : 'while' '(' expcond ')' '{' (J | SPACE)* code (J | SPACE)* '}' {$v = "while" + "("
    + $expcond.v + ")" + "{<br>" + $code.v + "}";};
dowhile_ returns [String v] : 'do' '{' (J | SPACE)* code (J | SPACE)* '}' (J | SPACE)* 'while' '(' expcond ')' ';'
    {$v = "do" + "{<br>" + $code.v + "}" + ($SPACE.text == null ? "" : $SPACE.text) + ($J.text == null ? "": "<br>")
    + "while" + "(" + $expcond.v + ")" + ";";};
for_ returns [String v] : 'for' '(' vardef ';' expcond ';' asig ')' '{' (J | SPACE)* code (J | SPACE)* '}' {$v = "for"
    + "(" + $vardef.v + ";" + $expcond.v + ";" + $asig.v + ")" + "{<br>" + $code.v + "}";}
    | 'for' '(' asig ';' expcond ';' asig ')' '{' (J | SPACE)* code (J | SPACE)* '}' {$v = "for" + "(" + $asig.v + ";"
        + $expcond.v + ";" + $asig.v + ")" + "{<br>" + $code.v + "}"; } ;
// Changed recursion
expcond returns [String v] : factorcond[""] expcond_R[$factorcond.v] {$v = $expcond_R.v;};
expcond_R[String h] returns [String v] : (SPACE)?oplog(SPACE)? expcond expcond_R[$h += ($SPACE.text == null ? "" :
    $SPACE.text) + $oplog.v + ($SPACE.text == null ? "" : $SPACE.text) + $expcond.v] {$v = $expcond_R.v;} | {$v = $h;};
oplog returns [String v] : '||' {$v = "||";} | '&' {$v = "&";};
factorcond[String h] returns [String v] : exp(SPACE)? opcomp(SPACE)? exp {$v = $exp.v + ($SPACE.text == null ? "" :
    $SPACE.text) + $opcomp.v + ($SPACE.text == null ? "" : $SPACE.text) + $exp.v;}
    | '(' expcond ')' {$v = "(" + $expcond.v + ")";} | '!' factorcond["!"] {$v = $factorcond.v;};
opcomp returns [String v] : '<' {$v = "<";} | '>' {$v = ">";} | '<=' {$v = "<=";} | '>=' {$v = ">=";}
    | '==' {$v = "==";} ;
// Changed the rule 'return' to 'return_m' due to problems in Java with the 'return' keyword
return_m returns [String v] : 'return' exp {$v = "<span class=\"palres\">return</span>" + $exp.v;} ;
asig returns [String v] : IDENTIFIER (SPACE)?'='(SPACE)? exp {$v = "<span class=\"ident\">" + $IDENTIFIER.text
    + "</span>" + ($SPACE.text == null ? "": $SPACE.text) + "=" + ($SPACE.text == null ? "" : $SPACE.text) + $exp.v;} ;
// Changed recursion
exp returns [String v] : factor(SPACE)? exp_R[$factor.v + ($SPACE.text == null ? "" : $SPACE.text)] {$v = $exp_R.v;} ;
exp_R[String h] returns [String v] : op(SPACE)? exp exp_R[$h += $op.v + ($SPACE.text == null ? "" : $SPACE.text)
    + $exp.v] {$v = $exp_R.v;} | {$v = $h;};
op returns [String v] : '+' {$v = "<span class=\"palres\">+</span>";} | '-' {$v = "<span class=\"palres\">-</span>";}
    | '*' {$v = "<span class=\"palres\">*</span>";} | 'DIV' {$v = "<span class=\"palres\">DIV</span>";}
    | 'MOD' {$v = "<span class=\"palres\">MOD</span>";} ;
// Allowed to use IDENTIFER and CONST_DEF_IDENTIFIER inside expressions, asigns and operations
factor returns [String v] : simpvalue(SPACE)? {$v = $simpvalue.v;} | '(' exp ')' {$v = "(" + $exp.v + ")";}
    | funccall {$v = $funccall.v;} | IDENTIFIER {$v = "<span class=\"ident\">" + $IDENTIFIER.text + "</span>";}
    | CONST_DEF_IDENTIFIER {$v = "<span class=\"ident\">" + $CONST_DEF_IDENTIFIER.text + "</span>";} ;
funccall returns [String v] : IDENTIFIER subparamlist {$v = (funccall_main ? ("<a href=\"#" + $IDENTIFIER.text
        + "\">" + $IDENTIFIER.text + "</a>") : ("<span class=\"ident\">" + $IDENTIFIER.text
        + "</span>")) + $subparamlist.v;}
    | CONST_DEF_IDENTIFIER subparamlist {$v = (funccall_main ? ("<a href=\"#" + $CONST_DEF_IDENTIFIER.text
        + "\">" + $CONST_DEF_IDENTIFIER.text + "</a>") :
        ("<span class=\"ident\">" + $CONST_DEF_IDENTIFIER.text + "</span>")) + $subparamlist.v;} ;
subparamlist returns [String v] : '(' explist[""] ')' {$v = "(" + $explist.v + ")";} ;
explist[String h] returns [String v] : exp {$v = $h + $exp.v;} | exp (SPACE)?','(SPACE)? explist[$h += $exp.v +
    ($SPACE.text == null ? "" : $SPACE.text) + "," + ($SPACE.text == null ? "" : $SPACE.text)] {$v = $explist.v;};