package com.licong.antlr4;// Generated from D:/git/antlr4/src/main/resources\Strategy.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StrategyParser}.
 */
public interface StrategyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StrategyParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(StrategyParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(StrategyParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrategyParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(StrategyParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(StrategyParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrategyParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpr(StrategyParser.LogicExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpr(StrategyParser.LogicExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrategyParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(StrategyParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(StrategyParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrategyParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(StrategyParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(StrategyParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrategyParser#keywords}.
	 * @param ctx the parse tree
	 */
	void enterKeywords(StrategyParser.KeywordsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#keywords}.
	 * @param ctx the parse tree
	 */
	void exitKeywords(StrategyParser.KeywordsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrategyParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(StrategyParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(StrategyParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrategyParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(StrategyParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(StrategyParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrategyParser#arroperator}.
	 * @param ctx the parse tree
	 */
	void enterArroperator(StrategyParser.ArroperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#arroperator}.
	 * @param ctx the parse tree
	 */
	void exitArroperator(StrategyParser.ArroperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrategyParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(StrategyParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(StrategyParser.ValueContext ctx);
}