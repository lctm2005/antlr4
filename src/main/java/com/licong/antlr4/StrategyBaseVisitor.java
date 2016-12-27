// Generated from E:/github/antlr4/src/main/resources\Strategy.g4 by ANTLR 4.5.1
package com.licong.antlr4;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nd.gaea.core.utils.ObjectUtils;
import jdk.nashorn.internal.parser.JSONParser;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

import java.util.ArrayList;
import java.util.List;

/**
 * This class provides an empty implementation of {@link StrategyVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public class StrategyBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements StrategyVisitor<T> {

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitProg(StrategyParser.ProgContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitStat(StrategyParser.StatContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitFilterExpr(StrategyParser.FilterExprContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitLimitExpr(StrategyParser.LimitExprContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitOrderExpr(StrategyParser.OrderExprContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitLogicExpr(StrategyParser.LogicExprContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitExpr(StrategyParser.ExprContext ctx) {
        return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     * <p>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitAtom(StrategyParser.AtomContext ctx) {
//        String keyword = ctx.KEYWORDS().getText();
//        if (null != ctx.OPERATOR()) {
//
//        }
//        if (null != ctx.ARROPERATOR()) {
//            List<String> list = ObjectUtils.fromJson("{'array':" + ctx.ARRAY().getText() + "}", new ArrayList<String>().getClass());
//        }
        return visitChildren(ctx);
    }
}