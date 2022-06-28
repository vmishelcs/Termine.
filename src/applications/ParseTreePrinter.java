package applications;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import lexicalAnalysis.LexicalAnalysis;
import syntacticAnalysis.SyntacticAnalysis;

public class ParseTreePrinter {
    public static void main(String args[]) {
        LexicalAnalysis lexer = new LexicalAnalysis(CharStreams.fromString("main { const x = 1 + 1. }"));
        SyntacticAnalysis parser = new SyntacticAnalysis(new CommonTokenStream(lexer));
        ParseTree parseTree = parser.programStart();
        treePrinter(parseTree);
    }

    private static void treePrinter(ParseTree root) {
        preOrderPrint(root, 0);
    }

    private static void preOrderPrint(ParseTree node, int depth) {
        printIndentedLine(node, depth);

        int childCount = node.getChildCount();
        for (int i = 0; i < childCount; ++i) {
            preOrderPrint(node.getChild(i), depth + 1);
        }
    }

    private static void printIndentedLine(ParseTree node, int depth) {
        // Indent by 4 * depth spaces.
        for (int i = 0; i < depth; ++i) {
            System.out.print("    ");
        }
        System.out.println(node);
    }
}
