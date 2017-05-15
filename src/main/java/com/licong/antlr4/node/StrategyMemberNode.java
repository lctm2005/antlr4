package com.licong.antlr4.node;

/**
 * Created by vime on 2015/12/11.
 */
public class StrategyMemberNode extends StrategyNode {
    private String member;

    public StrategyMemberNode(String member) {
        this.member = member;
    }

    public String getMember() {
        return member;
    }

    @Override
    public StrategyNodeType getType() {
        return StrategyNodeType.Member;
    }

    @Override
    public String toString() {
        return member;
    }

}
