package com.licong.antlr4;

import com.licong.antlr4.gen.StrategyBaseVisitor;
import com.licong.antlr4.gen.StrategyLexer;
import com.licong.antlr4.gen.StrategyParser;
import com.licong.antlr4.node.StrategyQueryNode;
import com.licong.antlr4.visitor.StrategyVistorImpl;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Queue;

/**
 * Created by LiCong on 2017/5/16.
 */
public class StrategyInterpreter {

    public static final StrategyQueryNode interpret(String qql) {
        if (null == qql) {
            qql = "";
        }
        StrategyLexer lexer = new StrategyLexer(new ANTLRInputStream(qql.trim()));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        StrategyParser parser = new StrategyParser(tokens);
        ParseTree tree = parser.gqlExpr(); // parse
        StrategyVistorImpl visitor = new StrategyVistorImpl();
        StrategyQueryNode strategyQueryNode = (StrategyQueryNode) visitor.visit(tree);
        Queue<String> queue = visitor.getQueue();
        String order;
        do {
            order = queue.poll();
            if (order != null) {
                System.out.println(order);
            }
        } while (null != order);
        return strategyQueryNode;
    }
}
