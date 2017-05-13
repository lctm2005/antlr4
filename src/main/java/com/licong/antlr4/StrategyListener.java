package com.licong.antlr4;// Generated from D:/workspace/antlr4/src/main/resources\Strategy.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StrategyParser}.
 */
public interface StrategyListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StrategyParser#gqlExpr}.
	 * @param ctx the parse tree
	 */
	void enterGqlExpr(StrategyParser.GqlExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#gqlExpr}.
	 * @param ctx the parse tree
	 */
	void exitGqlExpr(StrategyParser.GqlExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code filter}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 */
	void enterFilter(StrategyParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code filter}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 */
	void exitFilter(StrategyParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code select}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 */
	void enterSelect(StrategyParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code select}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 */
	void exitSelect(StrategyParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code limit}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 */
	void enterLimit(StrategyParser.LimitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code limit}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 */
	void exitLimit(StrategyParser.LimitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code offset}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 */
	void enterOffset(StrategyParser.OffsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code offset}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 */
	void exitOffset(StrategyParser.OffsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code order}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 */
	void enterOrder(StrategyParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code order}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 */
	void exitOrder(StrategyParser.OrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code result}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 */
	void enterResult(StrategyParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code result}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 */
	void exitResult(StrategyParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracket}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 */
	void enterBracket(StrategyParser.BracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracket}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 */
	void exitBracket(StrategyParser.BracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(StrategyParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(StrategyParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code or}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 */
	void enterOr(StrategyParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code or}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 */
	void exitOr(StrategyParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minus}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinus(StrategyParser.MinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinus(StrategyParser.MinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 */
	void enterNot(StrategyParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 */
	void exitNot(StrategyParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrategyParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(StrategyParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(StrategyParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condition}
	 * labeled alternative in {@link StrategyParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondition(StrategyParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condition}
	 * labeled alternative in {@link StrategyParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondition(StrategyParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code like}
	 * labeled alternative in {@link StrategyParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void enterLike(StrategyParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code like}
	 * labeled alternative in {@link StrategyParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void exitLike(StrategyParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code in}
	 * labeled alternative in {@link StrategyParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void enterIn(StrategyParser.InContext ctx);
	/**
	 * Exit a parse tree produced by the {@code in}
	 * labeled alternative in {@link StrategyParser#conditionExpr}.
	 * @param ctx the parse tree
	 */
	void exitIn(StrategyParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrategyParser#selectExpr}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpr(StrategyParser.SelectExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#selectExpr}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpr(StrategyParser.SelectExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrategyParser#orderExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrderExpr(StrategyParser.OrderExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#orderExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrderExpr(StrategyParser.OrderExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code asc}
	 * labeled alternative in {@link StrategyParser#orderItem}.
	 * @param ctx the parse tree
	 */
	void enterAsc(StrategyParser.AscContext ctx);
	/**
	 * Exit a parse tree produced by the {@code asc}
	 * labeled alternative in {@link StrategyParser#orderItem}.
	 * @param ctx the parse tree
	 */
	void exitAsc(StrategyParser.AscContext ctx);
	/**
	 * Enter a parse tree produced by the {@code desc}
	 * labeled alternative in {@link StrategyParser#orderItem}.
	 * @param ctx the parse tree
	 */
	void enterDesc(StrategyParser.DescContext ctx);
	/**
	 * Exit a parse tree produced by the {@code desc}
	 * labeled alternative in {@link StrategyParser#orderItem}.
	 * @param ctx the parse tree
	 */
	void exitDesc(StrategyParser.DescContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrategyParser#memberLiteral}.
	 * @param ctx the parse tree
	 */
	void enterMemberLiteral(StrategyParser.MemberLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#memberLiteral}.
	 * @param ctx the parse tree
	 */
	void exitMemberLiteral(StrategyParser.MemberLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code null}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNull(StrategyParser.NullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code null}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNull(StrategyParser.NullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBool(StrategyParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBool(StrategyParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void enterString(StrategyParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void exitString(StrategyParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void enterInt(StrategyParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void exitInt(StrategyParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(StrategyParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(StrategyParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code date}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDate(StrategyParser.DateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code date}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDate(StrategyParser.DateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code datetime}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDatetime(StrategyParser.DatetimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code datetime}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDatetime(StrategyParser.DatetimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uuid}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void enterUuid(StrategyParser.UuidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uuid}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 */
	void exitUuid(StrategyParser.UuidContext ctx);
	/**
	 * Enter a parse tree produced by {@link StrategyParser#constantLiteralList}.
	 * @param ctx the parse tree
	 */
	void enterConstantLiteralList(StrategyParser.ConstantLiteralListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StrategyParser#constantLiteralList}.
	 * @param ctx the parse tree
	 */
	void exitConstantLiteralList(StrategyParser.ConstantLiteralListContext ctx);
}