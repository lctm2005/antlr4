package com.licong.antlr4.node;


import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 逻辑操作节点
 * Created by LiCong on 2017/5/24.
 */
@Data
public class LogicalNode implements StrategyNode {

    private String desKey = UUID.randomUUID().toString();

    private LogicalType type;

    public LogicalNode(LogicalType type) {
        this.type = type;
    }

    private List<String> redisKeys = new ArrayList<String>();

    public void addRedisKey(String redisKey) {
        this.redisKeys.add(redisKey);
    }

    public void addRedisKeys(List<String> redisKeys) {
        this.redisKeys.addAll(redisKeys);
    }

    @Override
    public String toString() {
        String str = "BITOP " + type.toString() + " " + desKey;
        for (String key : redisKeys) {
            str += " " + key;
        }
        return str;
    }
}
