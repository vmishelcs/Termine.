parser grammar SyntacticAnalysis;

options { tokenVocab=LexicalAnalysis; }

/** Grammar specification */
programStart:
    MAIN OPEN_BRACE statement* CLOSE_BRACE EOF
    ;

statement:
    declaration
    ;

declaration:
    CONST IDENTIFIER EQUAL expression TERMINATOR
    ;

expression:
    expression OPERATOR expression |
    INTEGER
    ;
