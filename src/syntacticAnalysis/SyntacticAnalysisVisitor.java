// Generated from /home/vmishel/Termine./src/syntacticAnalysis/SyntacticAnalysis.g4 by ANTLR 4.10.1
package syntacticAnalysis;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SyntacticAnalysis}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SyntacticAnalysisVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SyntacticAnalysis#programStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramStart(SyntacticAnalysis.ProgramStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntacticAnalysis#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SyntacticAnalysis.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntacticAnalysis#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SyntacticAnalysis.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SyntacticAnalysis#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SyntacticAnalysis.ExpressionContext ctx);
}