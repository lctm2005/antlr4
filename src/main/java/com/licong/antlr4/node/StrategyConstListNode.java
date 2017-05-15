package com.licong.antlr4.node;

import com.google.common.base.Joiner;

import java.util.List;

/**
 * Created by vime on 2015/12/15.
 */
public class StrategyConstListNode extends StrategyNode {
    private List<StrategyConstNode> consts;

    public StrategyConstListNode(List<StrategyConstNode> consts) {
        this.consts = consts;
    }

    @Override
    public StrategyNodeType getType() {
        return StrategyNodeType.ConstList;
    }

    public List<StrategyConstNode> getConsts() {
        return consts;
    }

    @Override
    public String toString() {
        return "(" + Joiner.on(",").join(consts) + ")";
    }
}
