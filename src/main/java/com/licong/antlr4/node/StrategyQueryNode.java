package com.licong.antlr4.node;

import com.google.common.base.Joiner;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vime on 2015/12/11.
 */
@Data
public class StrategyQueryNode implements StrategyNode {
    private FilterNode filterNode;
    private LimitNode limitNode;
    private ResultNode resultNode;

    @Override
    public String toString() {
        List<String> params = new ArrayList<String>();
        if (filterNode != null)
            params.add(filterNode.toString());
        if (limitNode != null)
            params.add(limitNode.toString());
        if (resultNode != null)
            params.add(resultNode.toString());
        return Joiner.on("&").join(params);
    }
}
