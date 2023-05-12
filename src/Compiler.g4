grammar Compiler;

@parser::header{
    import java.io.*;
}

@parser::members{
    StringBuilder sb = new StringBuilder();
    String args = "";

    public void setArgs(String args){
        this.args = args;
    }
}

/********* Utilities *********/
J: '\n';
SPACE: ' ';

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
    sb.append("<!DOCTYPE html><html><title>").append(STDIN_NAME).append("</title>").append("<h1>")
        .append("Programa: ").append(STDIN_NAME).append("</h1>").append("<h2>Funciones</h2>").append("<ul>");
   } dcllist J* funlist J* sentlist <EOF> {
        sb.append("</html>");
        PrintWriter fich = null;
        try{
            final String STDOUT_NAME = STDIN_NAME + ".html";
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
simpvalue returns [String v] : NUMERIC_INTEGER_CONST {$v = $NUMERIC_INTEGER_CONST.text;}
    | NUMERIC_REAL_CONST {$v = $NUMERIC_REAL_CONST.text;}
    | STRING_CONST {$v = $STRING_CONST.text;} ;
varlist : vardef ';' | vardef ';' varlist ;
vardef returns [String v] : tbas (SPACE)IDENTIFIER {$v = $tbas.v + $SPACE.text + $IDENTIFIER.text;}
    | tbas (SPACE)IDENTIFIER (SPACE)?'='(SPACE)? simpvalue {$v = $tbas.v + $SPACE.text + $IDENTIFIER.text + $SPACE.text
        + "=" + $SPACE.text + $simpvalue.v;
    };
tbas returns [String v] : 'integer' {$v = "integer";} | 'float' {$v = "float";} | 'string' {$v = "string";}
    | tvoid {$v = $tvoid.v;} ;
tvoid returns [String v] : 'void' {$v = "void";} ;
/********* Functions Zone *********/
funlist : {sb.append("<li><a href=\"#Main\">Programa principal</a></li>");} funlist_R ;
funlist_R : funcdef J* funlist_R | {sb.append("<hr/>");} ;
// Allowed to declare functions without body such us C lenguage -> integer patata(void);
funcdef : {sb.append("<li>");} funchead ';' {sb.append("<a href=\"#")
        .append($funchead.id).append("\">").append($funchead.v).append("</a></li>");
    }
    | funchead '{' (J | SPACE)* code (J | SPACE)* '}' {
        sb.append("</ul>").append("<a name=\"").append($funchead.id).append("\">").append($funchead.v)
            .append("<br>{").append("<div style=\"text-indent: 0.5cm\">" + $code.v + "</div>")
            .append("}</a><hr/>");
    } ;
funchead returns [String v, String id] : tbas (SPACE)IDENTIFIER(SPACE)? '(' typedef1 ')' {
    $v = $tbas.v + " " + $IDENTIFIER.text + "(" + $typedef1.v + ")";
    $id = $IDENTIFIER.text;
};
// Added rule to allow "funcheader(void)" if you don't have args
typedef1 returns [String v] : typedef2 {$v = $typedef2.v;} | {$v = "";};
// Changed recursion
typedef2 returns [String v] : tbas (SPACE)IDENTIFIER(SPACE)? typedef2_R[$tbas.v + $SPACE.text + $IDENTIFIER.text]{
        $v = $typedef2_R.v;
    }
    | tvoid ((SPACE)IDENTIFIER)? {$v = $tvoid.v + ($IDENTIFIER.text == null ? "" : (" "+$IDENTIFIER.text));} ;
typedef2_R [String h] returns [String v] : ','(SPACE)? tbas (SPACE)IDENTIFIER(SPACE)?
    typedef2_R[$h += "," + $tbas.v + $SPACE.text + $IDENTIFIER.text] {$v = $typedef2_R.v;}
    | {$v = $h;};
/********* Sentences Zone *********/
sentlist : mainhead '{' (J | SPACE)* code (J | SPACE)* '}' ;
mainhead : tvoid (SPACE)'Main'(SPACE)? '(' typedef1 ')' ;
// Changed recursion
code returns [String v] : code_R[""] {$v = $code_R.v;} ;
// Using <div> to jump to a new line because <br> does not apply text-ident style
code_R[String h] returns [String v] : sent (J | SPACE)* code_R[$h += "<div>" + $sent.v + "</div>"] {$v = $code_R.v;} | {$v = $h;};
sent returns [String v] : asig ';' {$v = $asig.v + ";";} | funccall ';' {$v = $funccall.v + ";";}
    | vardef ';' {$v = $vardef.v + ";";} | return_m ';' {$v = $return_m.v + ";";} ;
// Changed the rule 'return' to 'return_m' due to problems in Java with the 'return' keyword
return_m returns [String v] : 'return' exp {$v = "return" + $exp.v;} ;
asig returns [String v] : IDENTIFIER (SPACE)'='(SPACE) exp {$v = $IDENTIFIER.text + $SPACE.text + "=" + $SPACE.text
        + $exp.v;
    };
// Changed recursion
exp returns [String v] : factor (SPACE)? exp_R[$factor.v + $SPACE.text] {$v = $exp_R.v;} ;
exp_R[String h] returns [String v] : op(SPACE)? exp exp_R[$h += $op.v + $SPACE.text + $exp.v] {$v = $exp_R.v;} | {$v = $h;};
op returns [String v] : '+' {$v = "+";} | '-' {$v = "-";} | '*' {$v = "*";} | 'DIV' {$v = "DIV";}
    | 'MOD' {$v = "MOD";} ;
factor returns [String v] : simpvalue {$v = $simpvalue.v;} | '(' exp ')' {$v = "(" + $exp.v + ")";}
    | funccall {$v = $funccall.v;} ;
funccall returns [String v] : IDENTIFIER subparamlist {$v = $IDENTIFIER.text + $subparamlist.v;}
    | CONST_DEF_IDENTIFIER subparamlist {$v = $CONST_DEF_IDENTIFIER.text + $subparamlist.v;} ;
subparamlist returns [String v] : '(' explist[""] ')' {$v = "(" + $explist.v + ")";} | {$v = "";};
explist[String h] returns [String v] : exp {$v = $h + $exp.v;} | exp (SPACE)?','(SPACE)? explist[$h += $exp.v
    + $SPACE.text + "," + $SPACE.text] {$v = $explist.v;};