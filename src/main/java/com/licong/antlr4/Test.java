package com.licong.antlr4;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by lctm2005 on 2016/12/15.
 */
public class Test {
    public static void main(String[] args) {
        ANTLRInputStream in = new ANTLRInputStream("knowledge in [\"642ed4e1-893b-452e-833a-8a1beb9c1290\", \"642ed4e1-893b-452e-833a-8a1beb9c1290\"] && hard == 3 ");
        StrategyLexer lexer = new StrategyLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        StrategyParser parser = new StrategyParser(tokens);
        ParseTree parseTree = parser.prog();
        System.out.println(parseTree.toStringTree(parser));
    }
}
