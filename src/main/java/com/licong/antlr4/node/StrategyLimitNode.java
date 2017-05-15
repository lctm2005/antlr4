package com.licong.antlr4.node;

/**
 * Created by vime on 2015/12/11.
 */
public class StrategyLimitNode extends StrategyNode {
    private int value;

    public StrategyLimitNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public StrategyNodeType getType() {
        return StrategyNodeType.Limit;
    }

    @Override
    public String toString() {
        return "$limit=" + value;
    }
}
