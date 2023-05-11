grammar Compiler;

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
    dcllist J* funlist J* sentlist <EOF> ;

/********* Declaration Zone *********/
dcllist : dcl J* dcllist | ;
dcl : ctelist | varlist ;
ctelist : '#define' (SPACE)CONST_DEF_IDENTIFIER(SPACE) simpvalue J
    | '#define' (SPACE)CONST_DEF_IDENTIFIER(SPACE) simpvalue ctelist ;
simpvalue : NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST
    | STRING_CONST ;
varlist : vardef ';' | vardef ';' varlist ;
vardef : tbas (SPACE)IDENTIFIER | tbas (SPACE)IDENTIFIER (SPACE)?'='(SPACE)? simpvalue ;
tbas : 'integer' | 'float' | 'string' | tvoid ;
tvoid : 'void' ;
/********* Functions Zone *********/
funlist : funcdef J* funlist | ;
funcdef : funchead '{' (J | SPACE)* code (J | SPACE)* '}' ;
funchead : tbas (SPACE)IDENTIFIER(SPACE)? '(' typedef1 ')' ;
// Added rule to allow "funcheader(void)" if you don't have args
typedef1: typedef2 | ;
typedef2 : tbas (SPACE)IDENTIFIER | tbas (SPACE)IDENTIFIER(SPACE)?','(SPACE)? typedef2
 | tvoid ((SPACE)IDENTIFIER)? ;
/********* Sentences Zone *********/
sentlist : mainhead '{' (J | SPACE)* code (J | SPACE)* '}' ;
// Allowed 'Main' and 'main'
mainhead : tvoid (SPACE)('main' | 'Main')(SPACE)? '(' typedef1 ')' ;
code : sent (J | SPACE)* code | ;
sent : asig ';' | funccall ';' | vardef ';';
asig : IDENTIFIER (SPACE)'='(SPACE) exp ;
exp : factor (SPACE)?(op(SPACE)? exp)? ;
op : '+' | '-' | '*' | 'DIV' | 'MOD' ;
factor : simpvalue | '(' exp ')' | funccall ;
funccall : IDENTIFIER subparamlist | CONST_DEF_IDENTIFIER subparamlist ;
subparamlist : '(' explist ')' | ;
explist : exp | exp (SPACE)?','(SPACE)? explist ;