package com.licong.antlr4;

import com.licong.antlr4.gen.StrategyBaseVisitor;
import com.licong.antlr4.gen.StrategyParser;
import com.licong.antlr4.gen.StrategyVisitor;
import com.licong.antlr4.node.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import javax.xml.bind.DatatypeConverter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

/**
 * Created by vime on 2015/12/11.
 */
public class StrategyVistorImpl extends StrategyBaseVisitor<StrategyNode> implements StrategyVisitor<StrategyNode> {

    @Override
    public StrategyNode visitGqlExpr(StrategyParser.GqlExprContext ctx) {
        StrategyDefaultNode defaultNode = (StrategyDefaultNode) super.visitGqlExpr(ctx);

        StrategyQueryNode queryNode = new StrategyQueryNode();
        for (StrategyNode gqlNode : defaultNode.getNodes()) {
            if (gqlNode instanceof StrategyFilterNode)
                queryNode.setFilterNode((StrategyFilterNode) gqlNode);
            else if (gqlNode instanceof StrategyLimitNode)
                queryNode.setLimitNode((StrategyLimitNode) gqlNode);
        }
        return queryNode;
    }

    @Override
    public StrategyNode visitFilter(StrategyParser.FilterContext ctx) {
        StrategyNode node = visit(ctx.filterExpr());
        return new StrategyFilterNode((StrategyBooleanNode) node);
    }

    @Override
    public StrategyNode visitLimit(StrategyParser.LimitContext ctx) {
        return new StrategyLimitNode(Integer.parseInt(ctx.INT().getText()));
    }

    @Override
    public StrategyNode visitOr(StrategyParser.OrContext ctx) {
        StrategyNode leftValue = visit(ctx.section(0));
        StrategyNode rightValue = visit(ctx.section(1));

        return new StrategyBooleanNode(leftValue, Operate.OR, rightValue);
    }

    @Override
    public StrategyNode visitIn(StrategyParser.InContext ctx) {
        StrategyNode leftValue = visit(ctx.memberLiteral());
        List<StrategyConstNode> consts = new ArrayList<StrategyConstNode>();
        for (StrategyParser.ConstantLiteralContext constantLiteralContext : ctx.constantLiteralList().constantLiteral()) {
            consts.add((StrategyConstNode) visit(constantLiteralContext));
        }
        return new StrategyBooleanNode(leftValue, Operate.IN, new StrategyConstListNode(consts));
    }

    @Override
    public StrategyNode visitAnd(StrategyParser.AndContext ctx) {
        StrategyNode leftValue = visit(ctx.section(0));
        StrategyNode rightValue = visit(ctx.section(1));

        return new StrategyBooleanNode(leftValue, Operate.AND, rightValue);
    }


    @Override
    public StrategyNode visitMemberLiteral(StrategyParser.MemberLiteralContext ctx) {
        return new StrategyMemberNode(ctx.getText());
    }

    @Override
    public StrategyNode visitNull(StrategyParser.NullContext ctx) {
        return new StrategyConstNode(null);
    }

    @Override
    public StrategyNode visitBool(StrategyParser.BoolContext ctx) {
        return new StrategyConstNode(Boolean.parseBoolean(ctx.getText()));
    }

    @Override
    public StrategyNode visitString(StrategyParser.StringContext ctx) {
        String text = ctx.getText();
        text = text.substring(1, text.length() - 1);
        text = text.replace("\\'", "'");
        text = text.replace("\\b", "\b");
        text = text.replace("\\t", "\t");
        text = text.replace("\\n", "\n");
        text = text.replace("\\r", "\r");
        text = text.replaceAll("(?<!\\\\)\\\\(?!\\\\)", "");
        text = text.replace("\\\\", "\\");
        return new StrategyConstNode(text);
    }

    @Override
    public StrategyNode visitInt(StrategyParser.IntContext ctx) {
        return new StrategyConstNode(Long.parseLong(ctx.getText()));
    }

    @Override
    public StrategyNode visitDecimal(StrategyParser.DecimalContext ctx) {
        return new StrategyConstNode(Double.parseDouble(ctx.getText()));
    }

    @Override
    public StrategyNode visitDate(StrategyParser.DateContext ctx) {
        Calendar calendar = DatatypeConverter.parseDate(ctx.getText());
        return new StrategyConstNode(calendar.getTime());
    }

    @Override
    public StrategyNode visitDatetime(StrategyParser.DatetimeContext ctx) {
        Calendar calendar = DatatypeConverter.parseDate(ctx.getText());
        return new StrategyConstNode(calendar.getTime());
    }

    @Override
    public StrategyNode visitUuid(StrategyParser.UuidContext ctx) {
        return new StrategyConstNode(UUID.fromString(ctx.getText()));
    }

    @Override
    public StrategyNode visitConstantLiteralList(StrategyParser.ConstantLiteralListContext ctx) {
        return super.visitConstantLiteralList(ctx);
    }

    @Override
    public StrategyNode visitMinus(StrategyParser.MinusContext ctx) {
        return new StrategyBooleanNode(visit(ctx.section(0)), Operate.MINUS, visit(ctx.section(1)));
    }

    @Override
    public StrategyNode visitSectionOnly(StrategyParser.SectionOnlyContext ctx) {
        return visit(ctx.section());
    }

    @Override
    public StrategyNode visitSection(StrategyParser.SectionContext ctx) {
        return new StrategySectionNode((StrategyBooleanNode) visit(ctx.conditionExpr()));
    }

    @Override
    public StrategyNode visitEq(StrategyParser.EqContext ctx) {
        return new StrategyBooleanNode(visit(ctx.memberLiteral()), Operate.EQ, visit(ctx.constantLiteral()));
    }

    @Override
    public StrategyNode visitMemberOnly(StrategyParser.MemberOnlyContext ctx) {
        return super.visit(ctx.memberLiteral());
    }

    @Override
    public StrategyNode visitNot(StrategyParser.NotContext ctx) {
        return new StrategyBooleanNode(null, Operate.NOT, visit(ctx.memberLiteral()));
    }

    @Override
    public StrategyNode visitBracket(StrategyParser.BracketContext ctx) {
        return visit(ctx.filterExpr());
    }

    @Override
    protected StrategyNode defaultResult() {
        return new StrategyDefaultNode();
    }

    @Override
    protected StrategyNode aggregateResult(StrategyNode aggregate, StrategyNode nextResult) {
        if (aggregate != null && aggregate instanceof StrategyDefaultNode) {
            if (nextResult != null) {
                ((StrategyDefaultNode) aggregate).getNodes().add(nextResult);
            }
            return aggregate;
        }
        return super.aggregateResult(aggregate, nextResult);
    }

    @Override
    public StrategyNode visitTerminal(TerminalNode node) {
        return null;
    }
}
