grammar Strategy; // TODO AND OR 存在优先级问题，需要考虑

prog: stat;

stat: filterExpr orderExpr?  limitExpr?;

filterExpr:expr((AND|OR) expr)?;

limitExpr:LIMIT INT;

orderExpr:ORDER KEYWORDS(COMMA KEYWORDS)* (ASC | DESC)?;

expr: BRACKET_OPEN expr((AND|OR) expr)+ BRACKET_CLOSE| expr((AND|OR) expr)+ | atom;

atom: KEYWORDS OPERATOR VALUE | KEYWORDS ARROPERATOR ARRAY;


KEYWORDS:  'question.knowledge'
        |  'question.hard'
        |  'question.type'
        |  'question.bank'
        |  'user_question.collect'
        |  'user_question.update_time'
        |  'user_question.key_wrong_question';

ARRAY: PARENTHESES_OPEN VALUE(COMMA VALUE)*  PARENTHESES_CLOSE;
OPERATOR: EQ | NE | GT | GE | LE | LT;
ARROPERATOR: IN | NOTIN;
VALUE: STRING | INT;

COMMA:',' | '%2C';
PARENTHESES_OPEN:'[' | '%5B';
PARENTHESES_CLOSE:']' | '%5D';
BRACKET_OPEN : '(' | '%28';
BRACKET_CLOSE : ')' | '%29';

ORDER:'order';
LIMIT:' limit';
AND:'and';
OR:'or';

ASC             : 'asc';
DESC            : 'desc';

GT              : 'gt';
GE              : 'ge';
LT              : 'lt';
LE              : 'le';

EQ              : 'eq';
NE              : 'ne';

NOTIN             : 'notin';
IN              : 'in';

STRING : '"' .*? '"' ;
ID : ('a'..'z' |'A'..'Z')+ ;
INT : '0'..'9'+ ;
WS : [ \t\r\n]+ -> skip ;// skip spaces, tabs, newlines, \r(Windows)

