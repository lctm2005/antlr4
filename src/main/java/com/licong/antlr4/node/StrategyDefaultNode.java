package com.licong.antlr4.node;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vime on 2015/12/11.
 */
public class StrategyDefaultNode extends StrategyNode {
    private List<StrategyNode> nodes;

    public StrategyDefaultNode() {
        nodes = new ArrayList<StrategyNode>();
    }

    public List<StrategyNode> getNodes() {
        return nodes;
    }

    @Override
    public StrategyNodeType getType() {
        return StrategyNodeType.Default;
    }

    @Override
    public String toString() {
        return "StrategyDefaultNode{" +
                "nodes=" + nodes +
                '}';
    }
}
