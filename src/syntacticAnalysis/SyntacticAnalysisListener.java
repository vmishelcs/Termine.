// Generated from /home/vmishel/Termine./src/syntacticAnalysis/SyntacticAnalysis.g4 by ANTLR 4.10.1
package syntacticAnalysis;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SyntacticAnalysis}.
 */
public interface SyntacticAnalysisListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalysis#programStart}.
	 * @param ctx the parse tree
	 */
	void enterProgramStart(SyntacticAnalysis.ProgramStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalysis#programStart}.
	 * @param ctx the parse tree
	 */
	void exitProgramStart(SyntacticAnalysis.ProgramStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalysis#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SyntacticAnalysis.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalysis#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SyntacticAnalysis.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalysis#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SyntacticAnalysis.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalysis#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SyntacticAnalysis.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SyntacticAnalysis#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SyntacticAnalysis.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SyntacticAnalysis#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SyntacticAnalysis.ExpressionContext ctx);
}