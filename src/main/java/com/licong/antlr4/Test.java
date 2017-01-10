package com.licong.antlr4;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Created by lctm2005 on 2016/12/15.
 */
public class Test {
    public static void main(String[] args) {
        //(question.knowledge in ["642ed4e1-893b-452e-833a-8a1beb9c1290", "642ed4e1-893b-452e-833a-8a1beb9c1294"] && question.hard == 2) || question.knowledge == "642ed4e1-893b-452e-833a-8a1beb9c1290" orderby user_question.update_time asc
        ANTLRInputStream in = new ANTLRInputStream("(question.knowledge in [\"642ed4e1-893b-452e-833a-8a1beb9c1290\",\"642ed4e1-893b-452e-833a-8a1beb9c1291\"] and question.type eq 2) or (question.bank in [\"642ed4e1-893b-452e-833a-8a1beb9c1290\",\"642ed4e1-893b-452e-833a-8a1beb9c1291\"] and question.hard gt 2) limit 10");
        StrategyLexer lexer = new StrategyLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        StrategyParser parser = new StrategyParser(tokens);
        ParseTree parseTree = parser.prog();

        StrategyBaseVisitor visitor = new StrategyBaseVisitor();
        visitor.visit(parseTree);
        System.out.println(parseTree.toStringTree(parser));
    }
}
