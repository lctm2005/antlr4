//Created by vime on 2015/12/16.

grammar Strategy;

gqlExpr
    :
    | gqlParam (AMPERSAND gqlParam)*
    ;

gqlParam
    : FILTER EQUAL filterExpr   #filter
    | LIMIT EQUAL INT           #limit
    | RESULT EQUAL RESULT_VALUE #result
    ;

filterExpr
    : OPEN WSP? filterExpr WSP? CLOSE         #bracket
    | filterExpr WSP AND WSP filterExpr       #and
    | filterExpr WSP OR WSP filterExpr        #or
    | filterExpr WSP MINUS WSP filterExpr     #minus
    | NOT WSP? filterExpr                     #not
    | BRACE_OPEN WSP? conditionExpr WSP? BRACE_CLOSE      #section
    ;


conditionExpr
    : memberLiteral WSP EQ WSP constantLiteral              #eq
    | memberLiteral WSP IN WSP? constantLiteralList         #in
    | memberLiteral                                         #member
    ;

memberLiteral: IDENTITY (DOT IDENTITY)*;

constantLiteral
    : NULL          #null
    | BOOLEAN       #bool
    | STRING        #string
    | INT           #int
    | DECIMAL       #decimal
    | DATE          #date
    | DATETIMEOFFSET#datetime
    | UUID          #uuid
    ;

constantLiteralList
    :  OPEN WSP? constantLiteral (WSP? COMMA WSP? constantLiteral)* WSP? CLOSE
    ;

//Letters for case insensitivity
fragment A    : 'A'|'a';
fragment B    : 'B'|'b';
fragment D    : 'D'|'d';
fragment E    : 'E'|'e';
fragment F    : 'F'|'f';
fragment G    : 'G'|'g';
fragment H    : 'H'|'h';
fragment I    : 'I'|'i';
fragment L    : 'L'|'l';
fragment M    : 'M'|'m';
fragment N    : 'N'|'n';
fragment O    : 'O'|'o';
fragment P    : 'P'|'p';
fragment R    : 'R'|'r';
fragment S    : 'S'|'s';
fragment T    : 'T'|'t';
fragment U    : 'U'|'u';
fragment Y    : 'Y'|'y';
fragment Z    : 'Z'|'z';

//special chars
BRACE_OPEN      : '{' | '%7B';
BRACE_CLOSE     : '}' | '%7D';
OPEN            : '(' | '%28';
CLOSE           : ')' | '%29';
COMMA           : ',' | '%2C';
AMPERSAND       : '&';
fragment WS     : ( ' ' | '%09' | '%20' | '%09' );
WSP             : WS+;
PLUS            : '+';
EQUAL           : '=';
MINUS           : 'minus';
DOT             : '.';

//alpha stuff
fragment ALPHA                : 'a'..'z' | 'A'..'Z';
fragment ALPHA_A_TO_F         : 'a'..'f' | 'A'..'F';
fragment DIGIT                : '0'..'9';
fragment DIGITS               : DIGIT+;
fragment HEXDIG               : DIGIT | ALPHA_A_TO_F;
fragment ODI_LEADINGCHARACTER : ALPHA | '_';
fragment ODI_CHARACTER        : ODI_LEADINGCHARACTER | DIGIT;

//helper for date/time values
fragment ONE_TO_NINE        : '1'..'9';
fragment ZERO_TO_FIFTYNINE  : ('0'..'5') DIGIT;
fragment FRACTIONALSECONDS  : DIGIT+;
fragment SECOND             : ZERO_TO_FIFTYNINE;
fragment MINUTE             : ZERO_TO_FIFTYNINE;
fragment HOUR               : ('0' | '1') DIGIT | '2' ( '0'..'3');
fragment DAY                : '0' '1'..'9' | ('1'|'2') DIGIT | '3' ('0'|'1');
fragment MONTH              : '0' ONE_TO_NINE | '1' ( '0' | '1' | '2' );
fragment YEAR               : ('-')? ( '0' DIGIT DIGIT DIGIT | ONE_TO_NINE DIGIT DIGIT DIGIT );
fragment TRUE               : 'true';
fragment FALSE              : 'false';

//primary types
NULL                    : 'null';
BOOLEAN                 : T R U E |  F A L S E | TRUE | FALSE;
SIGN                    : PLUS  | '%2B' | '-';
INT                     : SIGN? DIGITS;
DECIMAL                 : INT '.' DIGITS (('e'|'E') SIGN?  DIGITS)?;
NANINFINITY             : 'NaN' | '-INF' | 'INF';
DATE                    : YEAR '-' MONTH '-' DAY;
DATETIMEOFFSET          : YEAR '-' MONTH '-' DAY T HOUR ':' MINUTE  ':' SECOND ( '.' FRACTIONALSECONDS )? ( Z | SIGN HOUR ':' MINUTE )?;
fragment DUSECONDFRAG   : DIGITS ('.' DIGITS)? 'S';
fragment DUTIMEFRAG     : 'T' (
                          ( DIGITS 'H' (DIGITS 'M')? DUSECONDFRAG?)
                          | (DIGITS 'M' DUSECONDFRAG?)
                          | DUSECONDFRAG
                        )?;
fragment DUDAYTIMEFRAG  : DIGITS 'D' DUTIMEFRAG? | DUTIMEFRAG;
TIMEOFDAY               : HOUR ':' MINUTE ( ':' SECOND ( '.' FRACTIONALSECONDS )? )?;
fragment UUIDVALUE      : HEXDIG HEXDIG HEXDIG HEXDIG HEXDIG HEXDIG HEXDIG HEXDIG'-'
                          HEXDIG HEXDIG HEXDIG HEXDIG  '-'
                          HEXDIG HEXDIG HEXDIG HEXDIG  '-'
                          HEXDIG HEXDIG HEXDIG HEXDIG  '-'
                          HEXDIG HEXDIG HEXDIG HEXDIG HEXDIG HEXDIG HEXDIG HEXDIG HEXDIG HEXDIG HEXDIG HEXDIG;
UUID                    : UUIDVALUE;

EQ              : 'eq';

AND             : 'and';
OR              : 'or';

NOT             : 'not';
IN              : 'in';
FILTER          : '$filter';
LIMIT           : '$limit';
RESULT          : '$result';
RESULT_VALUE    : 'list'|'count';
IDENTITY        : ODI_LEADINGCHARACTER ODI_CHARACTER*;
STRING          : '\'' (ESC | .)*? '\'';
fragment ESC    : '\\' [btnr'\\];