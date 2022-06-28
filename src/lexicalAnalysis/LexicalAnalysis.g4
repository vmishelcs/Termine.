lexer grammar LexicalAnalysis;

/** Keywords */
MAIN:
    'main';
CONST:
    'const';

/** Tokens */
WHITESPACE:
    [ \t\n]+ -> skip ;
IDENTIFIER:
    [_a-zA-Z]+[_a-zA-Z0-9]*;
INTEGER:
    [0-9]+;
TERMINATOR:
    '.';
OPEN_BRACE:
    '{';
CLOSE_BRACE:
    '}';
EQUAL:
    '=';
OPERATOR:
    PLUS | MINUS | MULTIPLY | DIVIDE;
PLUS:
    '+';
MINUS:
    '-';
MULTIPLY:
    '*';
DIVIDE:
    '/';
