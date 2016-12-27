// Generated from E:/github/antlr4/src/main/resources\Strategy.g4 by ANTLR 4.5.1
package com.licong.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StrategyParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StrategyVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StrategyParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(StrategyParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrategyParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(StrategyParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterExpr(StrategyParser.FilterExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrategyParser#limitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitExpr(StrategyParser.LimitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrategyParser#orderExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderExpr(StrategyParser.OrderExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrategyParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpr(StrategyParser.LogicExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrategyParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(StrategyParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrategyParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(StrategyParser.AtomContext ctx);
}