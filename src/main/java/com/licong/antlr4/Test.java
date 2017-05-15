package com.licong.antlr4;

import com.licong.antlr4.gen.StrategyBaseVisitor;
import com.licong.antlr4.gen.StrategyLexer;
import com.licong.antlr4.gen.StrategyParser;
import com.licong.antlr4.node.StrategyNode;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by lctm2005 on 2016/12/15.
 */
public class Test {
    public static void main(String[] args) {
        String qql = "$filter=({question.knowledge in ('642ed4e1-893b-452e-833a-8a1beb9c1290','642ed4e1-893b-452e-833a-8a1beb9c1291')}" +
                " and {question.type eq 2}) or {question.bank in ('642ed4e1-893b-452e-833a-8a1beb9c1290','642ed4e1-893b-452e-833a-8a1beb9c1291')}&$limit=10";
        String qql1 = "$filter={question.type eq 2}";
        StrategyLexer lexer = new StrategyLexer(new ANTLRInputStream(qql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        StrategyParser parser = new StrategyParser(tokens);
        ParseTree tree = parser.gqlExpr(); // parse
        StrategyBaseVisitor visitor = new StrategyVistorImpl();
        StrategyNode strategyNode = (StrategyNode) visitor.visit(tree);
        System.out.println(strategyNode);
    }
}
