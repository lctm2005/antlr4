package com.licong.antlr4;// Generated from D:/workspace/antlr4/src/main/resources\Strategy.g4 by ANTLR 4.7
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
	 * Visit a parse tree produced by {@link StrategyParser#gqlExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGqlExpr(StrategyParser.GqlExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code filter}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(StrategyParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code select}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(StrategyParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code limit}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit(StrategyParser.LimitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code offset}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset(StrategyParser.OffsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code order}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(StrategyParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code result}
	 * labeled alternative in {@link StrategyParser#gqlParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult(StrategyParser.ResultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracket}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket(StrategyParser.BracketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(StrategyParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(StrategyParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minus}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(StrategyParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link StrategyParser#filterExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(StrategyParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrategyParser#section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSection(StrategyParser.SectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condition}
	 * labeled alternative in {@link StrategyParser#conditionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(StrategyParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code like}
	 * labeled alternative in {@link StrategyParser#conditionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(StrategyParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in}
	 * labeled alternative in {@link StrategyParser#conditionExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(StrategyParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrategyParser#selectExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpr(StrategyParser.SelectExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrategyParser#orderExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderExpr(StrategyParser.OrderExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code asc}
	 * labeled alternative in {@link StrategyParser#orderItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsc(StrategyParser.AscContext ctx);
	/**
	 * Visit a parse tree produced by the {@code desc}
	 * labeled alternative in {@link StrategyParser#orderItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesc(StrategyParser.DescContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrategyParser#memberLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberLiteral(StrategyParser.MemberLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code null}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(StrategyParser.NullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(StrategyParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(StrategyParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(StrategyParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimal}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(StrategyParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code date}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate(StrategyParser.DateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code datetime}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime(StrategyParser.DatetimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uuid}
	 * labeled alternative in {@link StrategyParser#constantLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUuid(StrategyParser.UuidContext ctx);
	/**
	 * Visit a parse tree produced by {@link StrategyParser#constantLiteralList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantLiteralList(StrategyParser.ConstantLiteralListContext ctx);
}