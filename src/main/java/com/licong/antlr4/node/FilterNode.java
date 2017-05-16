package com.licong.antlr4.node;

/**
 * Created by vime on 2015/12/11.
 */
public class FilterNode extends StrategyNode {
    private SectionOperateNode body;

    public FilterNode(SectionOperateNode body) {
        this.body = body;
    }

    public SectionOperateNode getBody() {
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
