package com.licong.antlr4.node;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vime on 2015/12/11.
 */
public class StrategyQueryNode extends StrategyNode {
    private FilterNode filterNode;
    private LimitNode limitNode;

    public FilterNode getFilterNode() {
        return filterNode;
    }

    public void setFilterNode(FilterNode filterNode) {
        this.filterNode = filterNode;
    }


    public LimitNode getLimitNode() {
        return limitNode;
    }

    public void setLimitNode(LimitNode limitNode) {
        this.limitNode = limitNode;
    }

    @Override
    public StrategyNodeType getType() {
        return StrategyNodeType.Query;
    }

    @Override
    public String toString() {
        List<String> params = new ArrayList<String>();
        if (filterNode != null)
            params.add(filterNode.toString());
        if (limitNode != null)
            params.add(limitNode.toString());
        return Joiner.on("&").join(params);
    }
}
