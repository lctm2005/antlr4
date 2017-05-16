package com.licong.antlr4.node;

/**
 * Created by vime on 2015/12/11.
 */
public class SectionNode extends StrategyNode {
    private ConditionNode body;

    public SectionNode(ConditionNode body) {
        this.body = body;
    }

    public ConditionNode getBody() {
        return body;
    }


    @Override
    public StrategyNodeType getType() {
        return StrategyNodeType.Filter;
    }

    @Override
    public String toString() {
        return "{" + body + "}";
    }
}
