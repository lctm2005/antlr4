package com.licong.antlr4.node;

import com.google.common.base.Joiner;

import java.util.List;

/**
 * Created by vime on 2015/12/15.
 */
public class ConstListNode implements StrategyNode {
    private List<ConstNode> consts;

    public ConstListNode(List<ConstNode> consts) {
        this.consts = consts;
    }


    public List<ConstNode> getConsts() {
        return consts;
    }

    @Override
    public String toString() {
        return "(" + Joiner.on(",").join(consts) + ")";
    }
}
