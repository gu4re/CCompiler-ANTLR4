grammar Compiler;

@parser::header{
    import java.io.*;
}

@parser::members{
    StringBuilder sb = new StringBuilder();
    String args = "";
    boolean funlist_finished = false;

    public void setArgs(String args){
        this.args = args;
    }
}

/********* Utilities *********/
J: '\n';
SPACE: ' ';
// TAB for us is equivalent to four SPACE

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
fragment STRING_DOUBLE: '"'([A-Za-z0-9'"\\%._]+ | SPACE)*'"';
fragment STRING_SIMPLE: '\''([A-Za-z0-9\\'"._]+ | SPACE)*'\'';

STRING_CONST:   (STRING_DOUBLE | STRING_SIMPLE){getText().replaceAll("\\\\", "");};

/********* Comments *********/
fragment ONE_LINE:      '//'([A-Za-z0-9'"\\*] | SPACE)*J;
fragment MORE_LINE:     '/*'([A-Za-z0-9'"\\*] | J | SPACE | ~[(*/)])+'*/';

COMMENTS:   (ONE_LINE | MORE_LINE)+;

/********* Main program *********/
program :
   {
    final String STDIN_NAME = (((args.split("/"))[(args.split("/")).length - 1]).split("\\."))[0];
    sb.append("<!DOCTYPE html><html><head><title>").append(STDIN_NAME).append("</title>" +
        "<style>.cte{color:rgb(107, 211, 26);} .palres{color:rgb(0, 0, 0); font-weight: bold;}" +
        ".ident{color:rgb(77, 77, 255);} .idfunc{color:rgb(26, 26, 255); text-decoration: underline;}</style>" +
        "</head>").append("<body><h1 id=\"inicio\">").append("Programa: ").append(STDIN_NAME).append("</h1>")
        .append("<h2>Funciones</h2>").append("<ul>");
   } dcllist J* funlist {sb.append($funlist.v + "<hr/><a id=\"Main\"><h2>Programa Principal</h2>" + $dcclist.v);}
   J* sentlist <EOF>
   {
        sb.append($sentlist.v + "<br><a href=\"#Main\">Inicio del programa principal</a> "
        + " <a href=\"#inicio\">Inicio del programa</a>" + "</a><hr/></body></html>");
        PrintWriter fich = null;
        try{
            final String STDOUT_NAME = "src/main/resources/export/" + STDIN_NAME + ".html";
            fich = new PrintWriter(new BufferedWriter(new FileWriter(STDOUT_NAME)));
            fich.print(sb.toString());
        }
        catch(IOException e){
            System.err.println("Bad file creator.\n" + e.getMessage());
        }
        finally{
            if (fich != null)
                fich.close();
        }
   };

/********* Declaration Zone *********/
dcllist : dcllist_R ;
// Changed recursion
dcllist_R : dcl J* dcllist_R | ;
dcl : ctedef | vardef ';' ;
ctedef : '#define' (SPACE)CONST_DEF_IDENTIFIER(SPACE) simpvalue J ;
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
tbas returns [String v] : 'integer' {$v = "<span class=\"palres\">integer</span>";}
    | 'float' {$v = "<span class=\"palres\">float</span>";} | 'string' {$v = "<span class=\"palres\">string</span>";}
    | tvoid {$v = $tvoid.v;} ;
tvoid returns [String v] : 'void' {$v = "<span class=\"palres\">void</span>";} ;
/********* Functions Zone *********/
funlist returns [String v] : funlist_R["<li><a href=\"#Main\">Programa principal</a></li>"]
    {$v = $funlist_R.v;};
funlist_R[String h] returns [String v] : funcdef J*
    funlist_R[$h += $funcdef.v + ($J.text == null ? "<br>" : $J.text)] {$v = $funlist_R.v;}
    | {$v = $h;};
// Allowed to declare functions without body such us C lenguage -> integer patata(void);
// funlist_finished boolean controller that help us to know where to close the unsigned list of the function's headers
funcdef returns [String v] : funchead ';' {$v = "<li><a href=\"#" + $funchead.id + "\">" + $funchead.v + "</a></li>";}
    | funchead '{' (J | SPACE)* code (J | SPACE)* '}' {$v = ""; $v += (funlist_finished ? "" : "</ul>");
        funlist_finished = true; $v += "<hr/><a id=\"" + $funchead.id + "\">" + $funchead.v + "<br>"
        + "{<div style=\"text-indent: 0.5cm\">" + $code.v + "</div>}<br></a>" +
        "<a href=\"#" + $funchead.id + "\">Inicio de la funci&oacute;n</a> " +
        " <a href=\"#inicio\">Inicio del programa</a>"; } ;
funchead returns [String v, String id] : tbas (SPACE)IDENTIFIER(SPACE)? '(' typedef1 ')' {
    $v = $tbas.v + $SPACE.text + "<span class=\"ident\">" + $IDENTIFIER.text + "</span>" +
    ($SPACE.text == null ? "" : $SPACE.text) + "(" + $typedef1.v + ")";
    $id = $IDENTIFIER.text;
};
// Added rule to allow "funcheader(void)" if you don't have args
typedef1 returns [String v] : typedef2 {$v = $typedef2.v;} | {$v = "";};
// Changed recursion
typedef2 returns [String v] : tbas (SPACE)IDENTIFIER typedef2_R[$tbas.v + $SPACE.text + "<span class=\"ident\">"
        + $IDENTIFIER.text + "</span>"]{
        $v = $typedef2_R.v;}
    | tvoid ((SPACE)IDENTIFIER)? {$v = $tvoid.v + ($IDENTIFIER.text == null ? "" : (" "+"<span class=\"ident\">"
        + $IDENTIFIER.text + "</span>"));} ;
typedef2_R [String h] returns [String v] : ','(SPACE)? tbas (SPACE)?IDENTIFIER
    typedef2_R[$h += "," + ($SPACE.text == null ? "" : $SPACE.text) + $tbas.v +
        ($SPACE.text == null ? "" : $SPACE.text) + "<span class=\"ident\">" + $IDENTIFIER.text + "</span>"]
        {$v = $typedef2_R.v;}
    | {$v = $h;};
/********* Sentences Zone *********/
sentlist returns [String v] : mainhead '{' (J | SPACE)* code (J | SPACE)* '}' { $v = $mainhead.v + "<br>{" +
    ($J.text == null ? "<br>" : $J.text) + ($SPACE.text == null ? "" : $SPACE.text) +
    "<div style=\"text-indent: 0.5cm\">" + $code.v + "</div>" + ($SPACE.text == null ? "" : $SPACE.text) + "}"; } ;
mainhead returns [String v] : tvoid (SPACE)'Main'(SPACE)? '(' typedef1 ')' {$v = $tvoid.v + $SPACE.text +
    "<span class=\"ident\">Main</span>" + ($SPACE.text == null ? "" : $SPACE.text) + "(" + $typedef1.v + ")"; };
// Changed recursion
code returns [String v] : code_R[""] {$v = $code_R.v;} ;
// Using <div> to jump to a new line because <br> does not apply text-ident style
code_R[String h] returns [String v] : sent (J | SPACE)* code_R[$h += "<div>" + $sent.v + "</div>"] {$v = $code_R.v;}
    | {$v = $h;};
sent returns [String v] : asig ';' {$v = $asig.v + ";";} | funccall ';' {$v = $funccall.v + ";";}
    | vardef ';' {$v = $vardef.v + ";";} | return_m ';' {$v = $return_m.v + ";";} ;
// Changed the rule 'return' to 'return_m' due to problems in Java with the 'return' keyword
return_m returns [String v] : 'return' exp {$v = "<span class=\"palres\">return</span>" + $exp.v;} ;
asig returns [String v] : IDENTIFIER (SPACE)?'='(SPACE)? exp {$v = "<span class=\"ident\">" + $IDENTIFIER.text
    + "</span>" + ($SPACE.text == null ? "": $SPACE.text) + "=" + ($SPACE.text == null ? "" : $SPACE.text) + $exp.v;} ;
// Changed recursion
exp returns [String v] : factor(SPACE)? exp_R[$factor.v + ($SPACE.text == null ? "" : $SPACE.text)] {$v = $exp_R.v;} ;
exp_R[String h] returns [String v] : op(SPACE)? exp exp_R[$h += $op.v + ($SPACE.text == null ? "" : $SPACE.text)
    + $exp.v] {$v = $exp_R.v;} | {$v = $h;};
op returns [String v] : '+' {$v = "+";} | '-' {$v = "-";} | '*' {$v = "*";} | 'DIV' {$v = "DIV";}
    | 'MOD' {$v = "MOD";} ;
// Allowed to use IDENTIFER and CONST_DEF_IDENTIFIER inside expressions, asigns and operations
factor returns [String v] : simpvalue(SPACE)? {$v = $simpvalue.v;} | '(' exp ')' {$v = "(" + $exp.v + ")";}
    | funccall {$v = $funccall.v;} | IDENTIFIER {$v = "<span class=\"ident\">" + $IDENTIFIER.text + "</span>";}
    | CONST_DEF_IDENTIFIER {$v = "<span class=\"cte\">" + $CONST_DEF_IDENTIFIER.text + "</span>";} ;
funccall returns [String v] : IDENTIFIER subparamlist {$v = "<span class=\"ident\">" + $IDENTIFIER.text + "</span>"
    + $subparamlist.v;}
    | CONST_DEF_IDENTIFIER subparamlist {$v = $CONST_DEF_IDENTIFIER.text + $subparamlist.v;} ;
subparamlist returns [String v] : '(' explist[""] ')' {$v = "(" + $explist.v + ")";} ;
explist[String h] returns [String v] : exp {$v = $h + $exp.v;} | exp (SPACE)?','(SPACE)? explist[$h += $exp.v +
    ($SPACE.text == null ? "" : $SPACE.text) + "," + ($SPACE.text == null ? "" : $SPACE.text)] {$v = $explist.v;};