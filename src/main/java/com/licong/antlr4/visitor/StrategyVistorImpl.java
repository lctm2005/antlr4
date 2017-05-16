package com.licong.antlr4.visitor;

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
            if (gqlNode instanceof FilterNode)
                queryNode.setFilterNode((FilterNode) gqlNode);
            else if (gqlNode instanceof LimitNode)
                queryNode.setLimitNode((LimitNode) gqlNode);
        }
        return queryNode;
    }

    @Override
    public StrategyNode visitMember(StrategyParser.MemberContext ctx) {
        return visit(ctx.memberLiteral());
    }

    @Override
    public StrategyNode visitFilter(StrategyParser.FilterContext ctx) {
        StrategyNode strategyNode = visit(ctx.filterExpr());
        if (strategyNode instanceof SectionOperateNode) {
            return new FilterNode((SectionOperateNode) strategyNode);
        }
        if (strategyNode instanceof SectionNode) {
            return new FilterNode(new SectionOperateNode(strategyNode, SectionOperate.NONE, null));
        }
        return strategyNode;
    }

    @Override
    public StrategyNode visitLimit(StrategyParser.LimitContext ctx) {
        return new LimitNode(Integer.parseInt(ctx.INT().getText()));
    }

    @Override
    public StrategyNode visitOr(StrategyParser.OrContext ctx) {
        StrategyNode leftValue = visit(ctx.filterExpr(0));
        StrategyNode rightValue = visit(ctx.filterExpr(1));

        return new SectionOperateNode(leftValue, SectionOperate.OR, rightValue);
    }

    @Override
    public StrategyNode visitIn(StrategyParser.InContext ctx) {
        StrategyNode leftValue = visit(ctx.memberLiteral());
        List<ConstNode> consts = new ArrayList<ConstNode>();
        for (StrategyParser.ConstantLiteralContext constantLiteralContext : ctx.constantLiteralList().constantLiteral()) {
            consts.add((ConstNode) visit(constantLiteralContext));
        }
        return new ConditionNode(leftValue, Operate.IN, new ConstListNode(consts));
    }

    @Override
    public StrategyNode visitAnd(StrategyParser.AndContext ctx) {
        StrategyNode leftValue = visit(ctx.filterExpr(0));
        StrategyNode rightValue = visit(ctx.filterExpr(1));

        return new SectionOperateNode(leftValue, SectionOperate.AND, rightValue);
    }


    @Override
    public StrategyNode visitMemberLiteral(StrategyParser.MemberLiteralContext ctx) {
        return new MemberNode(ctx.getText());
    }

    @Override
    public StrategyNode visitNull(StrategyParser.NullContext ctx) {
        return new ConstNode(null);
    }

    @Override
    public StrategyNode visitBool(StrategyParser.BoolContext ctx) {
        return new ConstNode(Boolean.parseBoolean(ctx.getText()));
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
        return new ConstNode(text);
    }

    @Override
    public StrategyNode visitInt(StrategyParser.IntContext ctx) {
        return new ConstNode(Long.parseLong(ctx.getText()));
    }

    @Override
    public StrategyNode visitDecimal(StrategyParser.DecimalContext ctx) {
        return new ConstNode(Double.parseDouble(ctx.getText()));
    }

    @Override
    public StrategyNode visitDate(StrategyParser.DateContext ctx) {
        Calendar calendar = DatatypeConverter.parseDate(ctx.getText());
        return new ConstNode(calendar.getTime());
    }

    @Override
    public StrategyNode visitDatetime(StrategyParser.DatetimeContext ctx) {
        Calendar calendar = DatatypeConverter.parseDate(ctx.getText());
        return new ConstNode(calendar.getTime());
    }

    @Override
    public StrategyNode visitUuid(StrategyParser.UuidContext ctx) {
        return new ConstNode(UUID.fromString(ctx.getText()));
    }

    @Override
    public StrategyNode visitConstantLiteralList(StrategyParser.ConstantLiteralListContext ctx) {
        return super.visitConstantLiteralList(ctx);
    }

    @Override
    public StrategyNode visitMinus(StrategyParser.MinusContext ctx) {
        return new SectionOperateNode(visit(ctx.filterExpr(0)), SectionOperate.MINUS, visit(ctx.filterExpr(1)));
    }

    @Override
    public StrategyNode visitSection(StrategyParser.SectionContext ctx) {
        StrategyNode strategyNode = visit(ctx.conditionExpr());
        if (strategyNode instanceof ConditionNode) {
            return new SectionNode((ConditionNode) strategyNode);
        }
        if (strategyNode instanceof MemberNode) {
            return new SectionNode(new ConditionNode(strategyNode, Operate.NONE, null));
        }
        return strategyNode;
    }

    @Override
    public StrategyNode visitEq(StrategyParser.EqContext ctx) {
        return new ConditionNode(visit(ctx.memberLiteral()), Operate.EQ, visit(ctx.constantLiteral()));
    }


    @Override
    public StrategyNode visitNot(StrategyParser.NotContext ctx) {
        return new SectionOperateNode(null, SectionOperate.NOT, visit(ctx.filterExpr()));
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
