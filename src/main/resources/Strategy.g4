grammar Strategy; // Define a grammar called Hello

prog: stat;

stat: logicExpr;

logicExpr: expr((('&&'|'||') expr)+ | (ORDERBY keywords (ASC | DESC)?) | (LIMIT INT));

expr: '(' logicExpr ')'| atom;

atom: keywords (operator value | arroperator array);

test: ASC | DESC;

keywords:  'question.knowledge'
        |  'question.hard'
        |  'question.type'
        |  'question.bank'
        |  'user_question.collect'
        |  'user_question.update_time'
        |  'user_question.key_wrong_question';

array: '[' value(','value)*  ']';

operator: EQ | NEQ | GT | GE | LE | LT;

arroperator: IN | NOTIN;

value: STRING | INT;



STRING : '"' .*? '"' ;
ID : ('a'..'z' |'A'..'Z')+ ;
INT : '0'..'9' + ;
WS : [ \t\r\n]+ -> skip ;// skip spaces, tabs, newlines, \r(Windows)

EQ:'==';
NEQ:'!=';
GT:'>';
GE:'>=';
LE:'<=';
LT:'<';

IN:'in';
NOTIN:'notin';

ORDERBY:'orderby';
ASC:'asc';
DESC:'desc';
LIMIT:'limit';

