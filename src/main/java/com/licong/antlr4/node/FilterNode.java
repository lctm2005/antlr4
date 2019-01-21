package com.licong.antlr4.node;

/**
 * Created by vime on 2015/12/11.
 */
public class FilterNode implements StrategyNode {
    private StrategyNode body;

    public FilterNode(StrategyNode body) {
        this.body = body;
    }

    public StrategyNode getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "$filter=" + body;
    }
}
