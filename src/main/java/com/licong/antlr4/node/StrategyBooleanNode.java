package com.licong.antlr4.node;

import java.util.Stack;

/**
 * Created by vime on 2015/12/11.
 */
public class StrategyBooleanNode extends StrategyNode {
    static ThreadLocal<Stack<Operate>> operateLocal = new ThreadLocal<Stack<Operate>>();

    private StrategyNode left;
    private Operate operate;
    private StrategyNode right;

    public StrategyBooleanNode(StrategyNode left, Operate operate, StrategyNode right) {
        this.left = left;
        this.operate = operate;
        this.right = right;
    }

    public StrategyNode getLeft() {
        return left;
    }

    public Operate getOperate() {
        return operate;
    }

    public StrategyNode getRight() {
        return right;
    }

    @Override
    public StrategyNodeType getType() {
        return StrategyNodeType.Boolean;
    }

    @Override
    public String toString() {
        Stack<Operate> operates = operateLocal.get();
        if (operates == null) {
            operates = new Stack<Operate>();
            operateLocal.set(operates);
        }
        boolean bracket = operates.size() > 0 && operates.peek() == Operate.AND && operate == Operate.OR;
        operates.push(operate);

        StringBuilder sb = new StringBuilder();
        if (bracket)
            sb.append("(");
        sb.append(left);
        sb.append(" ");
        sb.append(operate.toString().toLowerCase());

        sb.append(" ");
        sb.append(right);
        if (bracket)
            sb.append(")");
        operates.pop();

        return sb.toString();
    }
}
