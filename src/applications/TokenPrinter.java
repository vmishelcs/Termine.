package applications;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStreams;
import lexicalAnalysis.LexicalAnalysis;
import org.antlr.v4.runtime.Token;

import java.util.List;

public class TokenPrinter {
    public static void main(String args[]) {
        LexicalAnalysis lexer = new LexicalAnalysis(CharStreams.fromString("a = 9 + 10."));

    }
}
