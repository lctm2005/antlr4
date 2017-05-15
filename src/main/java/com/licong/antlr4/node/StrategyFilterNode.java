package com.licong.antlr4.node;

/**
 * Created by vime on 2015/12/11.
 */
public class StrategyFilterNode extends StrategyNode {
    private StrategyBooleanNode body;

    public StrategyFilterNode(StrategyBooleanNode body) {
        this.body = body;
    }

    public StrategyBooleanNode getBody() {
        return body;
    }


    @Override
    public StrategyNodeType getType() {
        return StrategyNodeType.Filter;
    }

    @Override
    public String toString() {
        return "$filter=" + body;
    }
}
