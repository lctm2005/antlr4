package com.licong.antlr4.node;

import lombok.Data;

import java.util.List;

/**
 * Created by vime on 2015/12/11.
 */
@Data
public class SectionNode implements StrategyNode {
    private StrategyNode left; //member
    private Operate operate;
    private StrategyNode right;

    public SectionNode(StrategyNode left, Operate operate, StrategyNode right) {
        this.left = left;
        this.operate = operate;
        this.right = right;

    }

    @Override
    public String toString() {
        if (operate == Operate.NONE) {
            return left.toString();
        }
        if (operate == Operate.EQ) {
            return left.toString() + "_" + right.toString();
        }
        if (operate == Operate.IN) {
            LogicalNode logicalNode = new LogicalNode(LogicalType.OR);
            List<ConstNode> constNodes = ((ConstListNode) right).getConsts();
            for (ConstNode constNode : constNodes) {
                logicalNode.addRedisKey(constNode.toString() + "_" + right.toString());
            }
            return logicalNode.toString() + "\nEXPIRE " + logicalNode.getDesKey() + " 10";
        }
        return "ERROR";
    }
}
