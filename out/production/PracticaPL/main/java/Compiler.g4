grammar Compiler;

@parser::header{
    import java.io.*;
    import java.nio.file.Paths;
}

@parser::members{
    // Where the final HTML is saved
    private StringBuilder sb = new StringBuilder();
    // args passed from input main
    private String args = "";
    // This variable controls the identation of the code
    private double ident_tab = 0.5;
    // check if the funlist declaration is finished
    private boolean funlist_finished = false;
    // check if the funccall is made from main
    private boolean funccall_main = false;
    // check if it is necessary to color the funclist or not
    private boolean funclist_color = false;
    // to set args passed from main
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
/********* INFO: 'h' attribute is an inherited attribute and 'v' is a synthesized attribute both in all rules *********/
program: // Axiom
   {
    final String STDIN_NAME = (new File(args)).getName().replaceFirst("[.][^.]+$", "");
    final String FILE_SEP = System.getProperty("file.separator");
    final String PATH_VARIABLE = Paths.get(args).getParent().toString() + FILE_SEP;
    sb.append("<!DOCTYPE html><html><head><title>").append(STDIN_NAME).append("</title>" +
        "<style>.cte{color:rgb(107, 211, 26);} .palres{color:rgb(0, 0, 0); font-weight: bold;}" +
        ".ident{color:rgb(77, 77, 255);} .idfunc{color:rgb(26, 26, 255); text-decoration: underline;}</style>" +
        "</head>").append("<body><h1 id=\"funciones\">").append("Programa: ").append(STDIN_NAME).append("</h1>")
        .append("<h2>Funciones</h2>").append("<ul>");
   } dcllist["programa_principal"] J* funlist["funciones"] {sb.append($funlist.v +
        ($funlist.v == "<li><a href=\"#programa_principal\">Programa principal</a></li>" ? "</ul>" : "") +
        "<hr/><a id=\"programa_principal\"><h2>Programa Principal</h2>" + $dcllist.v + ($dcllist.v == "" ? "" :
        "<br><br>"));} J* sentlist["programa_principal:Main"]
        <EOF>
        {
            sb.append($sentlist.v + "<br><a href=\"#programa_principal\">Inicio del programa principal</a> "
            + " <a href=\"#funciones\">Inicio del programa</a>" + "</a><hr/></body></html>");
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
dcllist[String a] returns [String v]: dcllist_R["", $a] {$v = $dcllist_R.v;};
// Changed recursion
dcllist_R[String h, String a] returns [String v] : dcl[$a] J* dcllist_R[$h += $dcl.v + ($J.text == null ? "<br>" : $J.text), $a]
    {$v = $dcllist_R.v;} | {$v = $h;};
dcl[String a] returns [String v] : ctedef[$a] {$v = $ctedef.v;} | vardef[$a] ';' J {$v = $vardef.v + ";" + $J.text;};
// Numeric cte showed visually as a numbers without double semi-colon -> #define CODE 3
ctedef[String a] returns [String v] : '#define' (SPACE)CONST_DEF_IDENTIFIER(SPACE) simpvalue J {$v =
    "<span class=\"palres\">#define</span>" + $SPACE.text + "<a id=\"" + $a + ":"
    + $CONST_DEF_IDENTIFIER.text + "\"><span class=\"ident\">" + $CONST_DEF_IDENTIFIER.text + "</span></a>" + $SPACE.text + $simpvalue.v + $J.text;};
simpvalue returns [String v] : NUMERIC_INTEGER_CONST {$v = "<span class=\"cte\">" + $NUMERIC_INTEGER_CONST.text
    + "</span>";}
    | NUMERIC_REAL_CONST {$v = "<span class=\"cte\">" + $NUMERIC_REAL_CONST.text + "</span>";}
    | STRING_CONST {$v = "<span class=\"cte\">" + $STRING_CONST.text + "</span>";} ;
struct returns [String v] : 'struct' '{'(J | SPACE)* varlist[""] (J | SPACE)*'}'(SPACE)? {$v = "<br>" +
    "<span class=\"palres\">struct</span>{<div style=\"text-indent: 0.5cm\">" + $varlist.v + "</div>}";};
varlist[String h] returns [String v] : vardef["programa_principal"] ';' {$v = $h + "<div>" + $vardef.v + ";" + "</div>";}
    | vardef["programa_principal"] ';'(J | SPACE)* varlist[$h += "<div>" + $vardef.v + ";" + "</div>"] {$v = $varlist.v;};
vardef[String a] returns [String v] : tbas (SPACE)IDENTIFIER {$v = $tbas.v + $SPACE.text
    + "<a id=\"" + $a + ":" + $IDENTIFIER.text + "\"><span class=\"ident\">" + $IDENTIFIER.text + "</span></a>";}
    | tbas (SPACE)IDENTIFIER (SPACE)?'='(SPACE)? simpvalue {$v = $tbas.v + $SPACE.text + "<a id=\"" + $a + ":"
        + $IDENTIFIER.text + "\"><span class=\"ident\">" + $IDENTIFIER.text + "</span></a>" + ($SPACE.text == null ? ""
        : $SPACE.text) + "=" + ($SPACE.text == null ? "" : $SPACE.text) + $simpvalue.v;
    };
tbas returns [String v] : 'integer' {$v = (funclist_color ? "integer" : "<span class=\"palres\">integer</span>");}
    | 'float' {$v = (funclist_color ? "float" : "<span class=\"palres\">float</span>");}
    | 'string' {$v = (funclist_color ? "string" : "<span class=\"palres\">string</span>");}
    | tvoid {$v = $tvoid.v;}
    | struct {$v = $struct.v;};
tvoid returns [String v] : 'void' {$v = (funclist_color ? "void" : "<span class=\"palres\">void</span>");} ;
/********* Functions Zone *********/
funlist[String a] returns [String v] : funlist_R["<li><a href=\"#programa_principal\">Programa principal</a></li>", $a]
    {$v = $funlist_R.v;};
funlist_R[String h, String a] returns [String v] : funcdef[$a] J*
    funlist_R[$h += $funcdef.v + ($J.text == null ? "<br>" : $J.text), $a] {$v = $funlist_R.v;}
    | {$v = $h;};
// Allowed to declare functions without body such us C lenguage -> integer patata(void);
// funlist_finished boolean controller that help us to know where to close the unsigned list of the function's headers
funcdef[String a] returns [String v] : {funclist_color = true;} funchead[$a] ';' {$v = "<li><a href=\"#"
        + $a + ":" + $funchead.id + "\">" + $funchead.v + "</a></li>";}
    | {funclist_color = false;} funchead[$a] '{' (J | SPACE)* code[$a += ":" + $funchead.id] (J | SPACE)* '}' {$v = ""; $v += (funlist_finished ? ""
        : "</ul>"); funlist_finished = true; $v += "<hr/><a id=\"" + $a + "\">" + $funchead.v + "<br>"
        + "{<div style=\"text-indent: 0.5cm\">" + $code.v + "</div>}<br></a>" +
        "<a href=\"#" + $a + "\">Inicio de la funci&oacute;n</a> " +
        " <a href=\"#funciones\">Inicio del programa</a>"; } ;
funchead[String a] returns [String v, String id] : tbas (SPACE)IDENTIFIER(SPACE)? '(' typedef1[$a] ')' {
    $v = $tbas.v + $SPACE.text + (funclist_color ? $IDENTIFIER.text : "<span class=\"ident\">" + $IDENTIFIER.text
    + "</span>") + ($SPACE.text == null ? "" : $SPACE.text) + "(" + $typedef1.v + ")";
    $id = $IDENTIFIER.text;
};
// Added rule to allow "funcheader(void)" if you don't have args
typedef1[String a] returns [String v] : typedef2[$a] {$v = $typedef2.v;} | {$v = "";};
// Changed recursion
typedef2[String a] returns [String v] : tbas (SPACE)IDENTIFIER typedef2_R[$tbas.v + $SPACE.text + (funclist_color ?
        $IDENTIFIER.text : "<a id=\"" + $a + ":" + $IDENTIFIER.text + "\"><span class=\"ident\">" + $IDENTIFIER.text
        + "</span></a>"), $a]{
        $v = $typedef2_R.v;}
    | tvoid ((SPACE)IDENTIFIER)? {$v = $tvoid.v + ($IDENTIFIER.text == null ? "" : (" "+(funclist_color ?
        $IDENTIFIER.text : "<span class=\"ident\">" + $IDENTIFIER.text + "</span>")));} ;
typedef2_R [String h, String a] returns [String v] : ','(SPACE)? tbas (SPACE)?IDENTIFIER
    typedef2_R[$h += "," + ($SPACE.text == null ? "" : $SPACE.text) + $tbas.v +
        ($SPACE.text == null ? "" : $SPACE.text) + (funclist_color ? $IDENTIFIER.text : "<span class=\"ident\">"
        + $IDENTIFIER.text + "</span>"), $a]
        {$v = $typedef2_R.v;}
    | {$v = $h;};
/********* Sentences Zone *********/
sentlist[String a] returns [String v] : mainhead[$a] {funccall_main = true;} '{' (J | SPACE)* code[$a] (J | SPACE)* '}'
{   $v = $mainhead.v + "<br>{" + ($J.text == null ? "<br>" : $J.text) + ($SPACE.text == null ? "" : $SPACE.text) +
    "<div style=\"text-indent: 0.5cm\">" + $code.v + "</div>" + ($SPACE.text == null ? "" : $SPACE.text) + "}"; } ;
mainhead[String a] returns [String v] : tvoid (SPACE)'Main'(SPACE)? '(' typedef1[$a] ')' {$v = $tvoid.v + $SPACE.text +
    "<a id=\"" + $a + ":Main\"><span class=\"ident\">Main</span></a>" + ($SPACE.text == null ? "" : $SPACE.text)
    + "(" + $typedef1.v + ")"; };
// Changed recursion
code[String a] returns [String v] : code_R["", $a] {$v = $code_R.v;} ;
// Using <div> to jump to a new line because <br> does not apply text-ident style
code_R[String h, String a] returns [String v] : sent[$a] (J | SPACE)* code_R[$h += "<div>" + $sent.v + "</div>", $a] {$v = $code_R.v;}
    | {$v = $h;} ;
sent[String a] returns [String v] : asig[$a] ';' {$v = $asig.v + ";";}
    | funccall["funciones"] ';' {$v = $funccall.v + ";";}
    | vardef[$a] ';' J {$v = $vardef.v + ";" + $J.text;} | return_m[$a] ';' {$v = $return_m.v + ";";}
    | {ident_tab += 0.5;}if_[$a] {ident_tab -= 0.5;$v = $if_.v;}
    | {ident_tab += 0.5;} while_[$a] {ident_tab -= 0.5;$v = $while_.v;}
    | {ident_tab += 0.5;} dowhile_[$a] {ident_tab -= 0.5;$v = $dowhile_.v;}
    | {ident_tab += 0.5;} for_[$a] {ident_tab -= 0.5;$v = $for_.v;} ;
// Renamed rules adding a '_' because we can't use java keywords or Parser would not compile
if_[String a] returns [String v] : 'if'(SPACE)? expcond[$a] '{' (J | SPACE)* code[$a] (J | SPACE)* '}'
    (J | SPACE)* else_["<span class=\"palres\">if</span>" + $expcond.v + "{<br>" +
    "<div style=\"text-indent: " + String.valueOf(ident_tab) + "cm\">" + $code.v + "</div>" + "<div>}"
    + ($SPACE.text == null ? "": $SPACE.text) + ($J.text == null ? "": "<br>"), $a] {$v = $else_.v;} ;
else_[String h, String a] returns [String v] : 'else'(J | SPACE)* '{' (J | SPACE)* code[$a] (J | SPACE)* '}'
    {$v = $h + "<span class=\"palres\">else</span>" + ($SPACE.text == null ? "" : $SPACE.text)
    + ($J.text == null ? "": "<br>") + "{</div>" + "<div style=\"text-indent: " + String.valueOf(ident_tab) + "cm\">"
    + $code.v + "</div>" + "<div>}</div>";}
    | 'else'(SPACE)? if_[$a] {$v = $h + "<span class=\"palres\">else</span>" + $if_.v;} | {$v = $h;};
while_[String a] returns [String v] : 'while' '(' expcond[$a] ')' '{' (J | SPACE)* code[$a] (J | SPACE)* '}'
    {$v = "<span class=\"palres\">while</span>" + "(" + $expcond.v + ")" + "{<br>" + "<div style=\"text-indent: " +
    String.valueOf(ident_tab) + "cm\">" + $code.v + "</div>" + "<div>}</div>";};
dowhile_[String a] returns [String v] : 'do' '{' (J | SPACE)* code[$a] (J | SPACE)* '}' (J | SPACE)* 'while' '(' expcond[$a] ')' ';'
    {$v = "<span class=\"palres\">do</span>" + "{<br>" + "<div style=\"text-indent: " +
    String.valueOf(ident_tab) + "cm\">" + $code.v + "</div>" + "<div>}" + ($SPACE.text == null ? "" :
    $SPACE.text) + ($J.text == null ? "": "<br>") + "<span class=\"palres\">while</span>" + "(" + $expcond.v + ")"
    + ";</div>";};
for_[String a] returns [String v] : 'for' (SPACE)? '(' vardef[$a] ';' (SPACE)? expcond[$a] ';' (SPACE)? asig[$a] ')' '{' (J | SPACE)* code[$a]
    (J | SPACE)* '}'{$v = "<span class=\"palres\">for</span>" + "(" + $vardef.v + ";" +
     ($SPACE.text == null ? "" : $SPACE.text) + $expcond.v + ";" + ($SPACE.text == null ? "" : $SPACE.text) + $asig.v
     + ")" + "{<br>" + "<div style=\"text-indent: " + String.valueOf(ident_tab) + "cm\">" + $code.v + "</div>"
     + "<div>}</div>";}
    | 'for' (SPACE)? '(' asig[$a] ';' (SPACE)? expcond[$a] ';' (SPACE)? asig[$a] ')' '{' (J | SPACE)* code[$a] (J | SPACE)* '}'
    {$v = "<span class=\"palres\">for</span>" + ($SPACE.text == null ? "" : $SPACE.text) + "(" + $asig.v + ";" +
    ($SPACE.text == null ? "" : $SPACE.text) + $expcond.v + ";" + ($SPACE.text == null ? "" : $SPACE.text) + $asig.v
    + ")" + "{<br>" + "<div style=\"text-indent: " + String.valueOf(ident_tab) + "cm\">" + $code.v + "</div>"
     + "<div>}</div>"; } ;
// Changed recursion
expcond[String a] returns [String v] : factorcond["", $a] expcond_R[$factorcond.v, $a] {$v = $expcond_R.v;};
expcond_R[String h, String a] returns [String v] : (SPACE)?oplog(SPACE)? expcond[$a] expcond_R[$h += ($SPACE.text == null ? "" :
    $SPACE.text) + $oplog.v + ($SPACE.text == null ? "" : $SPACE.text) + $expcond.v, $a] {$v = $expcond_R.v;} | {$v = $h;};
oplog returns [String v] : '||' {$v = "||";} | '&' {$v = "&";};
factorcond[String h, String a] returns [String v] : exp[$a](SPACE)? {$v = $exp.v;} opcomp(SPACE)? exp[$a] {$v += ($SPACE.text == null
    ? "" : $SPACE.text) + $opcomp.v + ($SPACE.text == null ? "" : $SPACE.text) + $exp.v;}
    | '(' expcond[$a] ')' {$v = "(" + $expcond.v + ")";} | '!' factorcond["!", $a] {$v = $factorcond.v;};
opcomp returns [String v] : '<' {$v = "<";} | '>' {$v = ">";} | '<=' {$v = "<=";} | '>=' {$v = ">=";}
    | '==' {$v = "==";} ;
// Changed the rule 'return' to 'return_m' due to problems in Java with the 'return' keyword
return_m[String a] returns [String v] : 'return' exp[$a] {$v = "<span class=\"palres\">return</span>" + $exp.v;} ;
asig[String a] returns [String v] : IDENTIFIER (SPACE)?'='(SPACE)? exp[$a] {$v = "<a href=\"#" + $a + ":" + $IDENTIFIER.text + "\">" + "<span class=\"ident\">"
    + $IDENTIFIER.text + "</span></a>" + ($SPACE.text == null ? "": $SPACE.text) + "=" + ($SPACE.text == null ? "" : $SPACE.text) + $exp.v;} ;
// Changed recursion
exp[String a] returns [String v] : factor[$a](SPACE)? exp_R[$factor.v + ($SPACE.text == null ? "" : $SPACE.text), $a] {$v = $exp_R.v;} ;
exp_R[String h, String a] returns [String v] : op(SPACE)? exp[$a] exp_R[$h += $op.v + ($SPACE.text == null ? "" : $SPACE.text)
    + $exp.v, $a] {$v = $exp_R.v;} | {$v = $h;};
op returns [String v] : '+' {$v = "<span class=\"palres\">+</span>";} | '-' {$v = "<span class=\"palres\">-</span>";}
    | '*' {$v = "<span class=\"palres\">*</span>";} | 'DIV' {$v = "<span class=\"palres\">DIV</span>";}
    | 'MOD' {$v = "<span class=\"palres\">MOD</span>";} ;
// Allowed to use IDENTIFER and CONST_DEF_IDENTIFIER inside expressions, asigns and operations
factor[String a] returns [String v] : simpvalue(SPACE)? {$v = $simpvalue.v;} | '(' exp[$a] ')' {$v = "(" + $exp.v + ")";}
    | funccall[(funccall_main ? "funciones" : $a)] {$v = $funccall.v;} | IDENTIFIER {$v = "<a href=\"#" + $a + ":" + $IDENTIFIER.text + "\">" + "<span class=\"ident\">"
    + $IDENTIFIER.text + "</span></a>";}
    | CONST_DEF_IDENTIFIER {$v = "<a href=\"#" + $a + ":" + $CONST_DEF_IDENTIFIER.text + "\">" + "<span class=\"ident\">"
    + $CONST_DEF_IDENTIFIER.text + "</span></a>";} ;
funccall[String a] returns [String v] : IDENTIFIER subparamlist {$v = (funccall_main ? ("<a href=\"#" + $a + ":" + $IDENTIFIER.text + "\">" + "<span class=\"ident\">"
    + $IDENTIFIER.text + "</span></a>") : ("<span class=\"ident\">" + $IDENTIFIER.text
        + "</span>")) + $subparamlist.v;}
    | CONST_DEF_IDENTIFIER subparamlist {$v = (funccall_main ? ("<a href=\"#" + $a + ":" + $CONST_DEF_IDENTIFIER.text + "\">" + "<span class=\"ident\">"
    + $CONST_DEF_IDENTIFIER.text + "</span></a>") :
        ("<span class=\"ident\">" + $CONST_DEF_IDENTIFIER.text + "</span>")) + $subparamlist.v;} ;
subparamlist returns [String v] : '(' explist[""] ')' {$v = "(" + $explist.v + ")";} ;
explist[String h] returns [String v] : exp["programa_principal"] {$v = $h + $exp.v;} | exp["programa_principal"] (SPACE)?','(SPACE)? explist[$h += $exp.v +
    ($SPACE.text == null ? "" : $SPACE.text) + "," + ($SPACE.text == null ? "" : $SPACE.text)] {$v = $explist.v;};