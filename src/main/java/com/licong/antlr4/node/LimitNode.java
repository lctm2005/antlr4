package com.licong.antlr4.node;

/**
 * Created by vime on 2015/12/11.
 */
public class LimitNode implements StrategyNode {
    private int value;

    public LimitNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "$limit=" + value;
    }
}
