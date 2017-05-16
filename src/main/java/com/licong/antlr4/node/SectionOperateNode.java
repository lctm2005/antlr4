package com.licong.antlr4.node;

import java.util.Stack;

/**
 * Created by vime on 2015/12/11.
 */
public class SectionOperateNode extends StrategyNode {
    static ThreadLocal<Stack<SectionOperate>> operateLocal = new ThreadLocal<Stack<SectionOperate>>();

    private StrategyNode left;
    private SectionOperate sectionOperate;
    private StrategyNode right;

    public SectionOperateNode(StrategyNode left, SectionOperate sectionOperate, StrategyNode right) {
        this.left = left;
        this.sectionOperate = sectionOperate;
        this.right = right;
    }

    public StrategyNode getLeft() {
        return left;
    }

    public SectionOperate getSectionOperate() {
        return sectionOperate;
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
        Stack<SectionOperate> operates = operateLocal.get();
        if (operates == null) {
            operates = new Stack<SectionOperate>();
            operateLocal.set(operates);
        }
        boolean bracket = operates.size() > 0 && operates.peek() == SectionOperate.AND && sectionOperate == SectionOperate.OR;
        operates.push(sectionOperate);

        StringBuilder sb = new StringBuilder();
        if (bracket)
            sb.append("(");
        if (left != null) {
            sb.append(left);
        }
        if (sectionOperate != SectionOperate.NONE) {
            if (left != null) {
                sb.append(" ");
            }
            sb.append(sectionOperate.toString().toLowerCase());
        }
        if (right != null) {
            sb.append(" ");
            sb.append(right);
        }
        if (bracket)
            sb.append(")");
        operates.pop();

        return sb.toString();
    }
}
