package com.licong.antlr4;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lctm2005 on 2016/12/15.
 */
public class Test {
    public static void main(String[] args) {
        String qql = "$filter=({question.knowledge in ('642ed4e1-893b-452e-833a-8a1beb9c1290','642ed4e1-893b-452e-833a-8a1beb9c1291')}" +
                " and {question.type eq 2}) or {question.bank in ('642ed4e1-893b-452e-833a-8a1beb9c1290','642ed4e1-893b-452e-833a-8a1beb9c1291')}&limit=10";
        StrategyLexer lexer = new StrategyLexer(new ANTLRInputStream(qql));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        StrategyParser parser = new StrategyParser(tokens);
        ParseTree tree = parser.gqlExpr(); // parse
        System.out.println(tree.toStringTree(parser));
        StrategyBaseVisitor visitor = new StrategyBaseVisitor();
        visitor.visit(tree);
    }
}
