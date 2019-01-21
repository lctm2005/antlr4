package com.licong.antlr4.node;

/**
 * Created by vime on 2015/12/11.
 */
public class ResultNode implements StrategyNode {
    private ResultMode resultMode;

    public ResultNode(ResultMode resultMode) {
        this.resultMode = resultMode;
    }

    public ResultMode getResultMode() {
        return resultMode;
    }

    @Override
    public String toString() {
        return "$result=" + resultMode.toString().toLowerCase();
    }
}
