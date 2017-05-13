package com.licong.antlr4;// Generated from D:/workspace/antlr4/src/main/resources\Strategy.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StrategyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ConditionOperator=1, BRACE_OPEN=2, BRACE_CLOSE=3, OPEN=4, CLOSE=5, COMMA=6, 
		AMPERSAND=7, WSP=8, PLUS=9, EQUAL=10, MINUS=11, DOT=12, NULL=13, BOOLEAN=14, 
		SIGN=15, INT=16, DECIMAL=17, NANINFINITY=18, DATE=19, DATETIMEOFFSET=20, 
		TIMEOFDAY=21, UUID=22, ASC=23, DESC=24, GT=25, GE=26, LT=27, LE=28, EQ=29, 
		NE=30, AND=31, OR=32, NOT=33, IN=34, LIKE=35, FILTER=36, SELECT=37, LIMIT=38, 
		OFFSET=39, ORDER=40, RESULT=41, RESULT_VALUE=42, IDENTITY=43, STRING=44;
	public static final int
		RULE_gqlExpr = 0, RULE_gqlParam = 1, RULE_filterExpr = 2, RULE_section = 3, 
		RULE_conditionExpr = 4, RULE_selectExpr = 5, RULE_orderExpr = 6, RULE_orderItem = 7, 
		RULE_memberLiteral = 8, RULE_constantLiteral = 9, RULE_constantLiteralList = 10;
	public static final String[] ruleNames = {
		"gqlExpr", "gqlParam", "filterExpr", "section", "conditionExpr", "selectExpr", 
		"orderExpr", "orderItem", "memberLiteral", "constantLiteral", "constantLiteralList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, "'&'", null, "'+'", "'='", "'-'", 
		"'.'", "'null'", null, null, null, null, null, null, null, null, null, 
		"'asc'", "'desc'", "'gt'", "'ge'", "'lt'", "'le'", "'eq'", "'ne'", "'and'", 
		"'or'", "'not'", "'in'", "'like'", "'$filter'", "'$select'", "'$limit'", 
		"'$offset'", "'$order'", "'$result'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ConditionOperator", "BRACE_OPEN", "BRACE_CLOSE", "OPEN", "CLOSE", 
		"COMMA", "AMPERSAND", "WSP", "PLUS", "EQUAL", "MINUS", "DOT", "NULL", 
		"BOOLEAN", "SIGN", "INT", "DECIMAL", "NANINFINITY", "DATE", "DATETIMEOFFSET", 
		"TIMEOFDAY", "UUID", "ASC", "DESC", "GT", "GE", "LT", "LE", "EQ", "NE", 
		"AND", "OR", "NOT", "IN", "LIKE", "FILTER", "SELECT", "LIMIT", "OFFSET", 
		"ORDER", "RESULT", "RESULT_VALUE", "IDENTITY", "STRING"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Strategy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public StrategyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GqlExprContext extends ParserRuleContext {
		public List<GqlParamContext> gqlParam() {
			return getRuleContexts(GqlParamContext.class);
		}
		public GqlParamContext gqlParam(int i) {
			return getRuleContext(GqlParamContext.class,i);
		}
		public List<TerminalNode> AMPERSAND() { return getTokens(StrategyParser.AMPERSAND); }
		public TerminalNode AMPERSAND(int i) {
			return getToken(StrategyParser.AMPERSAND, i);
		}
		public GqlExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gqlExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterGqlExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitGqlExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitGqlExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GqlExprContext gqlExpr() throws RecognitionException {
		GqlExprContext _localctx = new GqlExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gqlExpr);
		int _la;
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case FILTER:
			case SELECT:
			case LIMIT:
			case OFFSET:
			case ORDER:
			case RESULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				gqlParam();
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AMPERSAND) {
					{
					{
					setState(24);
					match(AMPERSAND);
					setState(25);
					gqlParam();
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GqlParamContext extends ParserRuleContext {
		public GqlParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gqlParam; }
	 
		public GqlParamContext() { }
		public void copyFrom(GqlParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FilterContext extends GqlParamContext {
		public TerminalNode FILTER() { return getToken(StrategyParser.FILTER, 0); }
		public TerminalNode EQUAL() { return getToken(StrategyParser.EQUAL, 0); }
		public FilterExprContext filterExpr() {
			return getRuleContext(FilterExprContext.class,0);
		}
		public FilterContext(GqlParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResultContext extends GqlParamContext {
		public TerminalNode RESULT() { return getToken(StrategyParser.RESULT, 0); }
		public TerminalNode EQUAL() { return getToken(StrategyParser.EQUAL, 0); }
		public TerminalNode RESULT_VALUE() { return getToken(StrategyParser.RESULT_VALUE, 0); }
		public ResultContext(GqlParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitResult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitResult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectContext extends GqlParamContext {
		public TerminalNode SELECT() { return getToken(StrategyParser.SELECT, 0); }
		public TerminalNode EQUAL() { return getToken(StrategyParser.EQUAL, 0); }
		public SelectExprContext selectExpr() {
			return getRuleContext(SelectExprContext.class,0);
		}
		public SelectContext(GqlParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OffsetContext extends GqlParamContext {
		public TerminalNode OFFSET() { return getToken(StrategyParser.OFFSET, 0); }
		public TerminalNode EQUAL() { return getToken(StrategyParser.EQUAL, 0); }
		public TerminalNode INT() { return getToken(StrategyParser.INT, 0); }
		public OffsetContext(GqlParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterOffset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitOffset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LimitContext extends GqlParamContext {
		public TerminalNode LIMIT() { return getToken(StrategyParser.LIMIT, 0); }
		public TerminalNode EQUAL() { return getToken(StrategyParser.EQUAL, 0); }
		public TerminalNode INT() { return getToken(StrategyParser.INT, 0); }
		public LimitContext(GqlParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterLimit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitLimit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitLimit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrderContext extends GqlParamContext {
		public TerminalNode ORDER() { return getToken(StrategyParser.ORDER, 0); }
		public TerminalNode EQUAL() { return getToken(StrategyParser.EQUAL, 0); }
		public OrderExprContext orderExpr() {
			return getRuleContext(OrderExprContext.class,0);
		}
		public OrderContext(GqlParamContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GqlParamContext gqlParam() throws RecognitionException {
		GqlParamContext _localctx = new GqlParamContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_gqlParam);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FILTER:
				_localctx = new FilterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(FILTER);
				setState(34);
				match(EQUAL);
				setState(35);
				filterExpr();
				}
				break;
			case SELECT:
				_localctx = new SelectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				match(SELECT);
				setState(37);
				match(EQUAL);
				setState(38);
				selectExpr();
				}
				break;
			case LIMIT:
				_localctx = new LimitContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				match(LIMIT);
				setState(40);
				match(EQUAL);
				setState(41);
				match(INT);
				}
				break;
			case OFFSET:
				_localctx = new OffsetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				match(OFFSET);
				setState(43);
				match(EQUAL);
				setState(44);
				match(INT);
				}
				break;
			case ORDER:
				_localctx = new OrderContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				match(ORDER);
				setState(46);
				match(EQUAL);
				setState(47);
				orderExpr();
				}
				break;
			case RESULT:
				_localctx = new ResultContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				match(RESULT);
				setState(49);
				match(EQUAL);
				setState(50);
				match(RESULT_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterExprContext extends ParserRuleContext {
		public FilterExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterExpr; }
	 
		public FilterExprContext() { }
		public void copyFrom(FilterExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MinusContext extends FilterExprContext {
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public List<TerminalNode> WSP() { return getTokens(StrategyParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(StrategyParser.WSP, i);
		}
		public TerminalNode MINUS() { return getToken(StrategyParser.MINUS, 0); }
		public MinusContext(FilterExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends FilterExprContext {
		public TerminalNode NOT() { return getToken(StrategyParser.NOT, 0); }
		public TerminalNode WSP() { return getToken(StrategyParser.WSP, 0); }
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public NotContext(FilterExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends FilterExprContext {
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public List<TerminalNode> WSP() { return getTokens(StrategyParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(StrategyParser.WSP, i);
		}
		public TerminalNode OR() { return getToken(StrategyParser.OR, 0); }
		public OrContext(FilterExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends FilterExprContext {
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
		}
		public List<TerminalNode> WSP() { return getTokens(StrategyParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(StrategyParser.WSP, i);
		}
		public TerminalNode AND() { return getToken(StrategyParser.AND, 0); }
		public AndContext(FilterExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketContext extends FilterExprContext {
		public TerminalNode OPEN() { return getToken(StrategyParser.OPEN, 0); }
		public FilterExprContext filterExpr() {
			return getRuleContext(FilterExprContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(StrategyParser.CLOSE, 0); }
		public List<TerminalNode> WSP() { return getTokens(StrategyParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(StrategyParser.WSP, i);
		}
		public BracketContext(FilterExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterBracket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitBracket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitBracket(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterExprContext filterExpr() throws RecognitionException {
		FilterExprContext _localctx = new FilterExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_filterExpr);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new BracketContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(OPEN);
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WSP) {
					{
					setState(54);
					match(WSP);
					}
				}

				setState(57);
				filterExpr();
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WSP) {
					{
					setState(58);
					match(WSP);
					}
				}

				setState(61);
				match(CLOSE);
				}
				break;
			case 2:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				section();
				setState(64);
				match(WSP);
				setState(65);
				match(AND);
				setState(66);
				match(WSP);
				setState(67);
				section();
				}
				break;
			case 3:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				section();
				setState(70);
				match(WSP);
				setState(71);
				match(OR);
				setState(72);
				match(WSP);
				setState(73);
				section();
				}
				break;
			case 4:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				section();
				setState(76);
				match(WSP);
				setState(77);
				match(MINUS);
				setState(78);
				match(WSP);
				setState(79);
				section();
				}
				break;
			case 5:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				match(NOT);
				setState(82);
				match(WSP);
				setState(83);
				section();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SectionContext extends ParserRuleContext {
		public TerminalNode BRACE_OPEN() { return getToken(StrategyParser.BRACE_OPEN, 0); }
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public TerminalNode BRACE_CLOSE() { return getToken(StrategyParser.BRACE_CLOSE, 0); }
		public List<TerminalNode> WSP() { return getTokens(StrategyParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(StrategyParser.WSP, i);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(BRACE_OPEN);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSP) {
				{
				setState(87);
				match(WSP);
				}
			}

			setState(90);
			conditionExpr();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSP) {
				{
				setState(91);
				match(WSP);
				}
			}

			setState(94);
			match(BRACE_CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionExprContext extends ParserRuleContext {
		public ConditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpr; }
	 
		public ConditionExprContext() { }
		public void copyFrom(ConditionExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ConditionContext extends ConditionExprContext {
		public MemberLiteralContext memberLiteral() {
			return getRuleContext(MemberLiteralContext.class,0);
		}
		public List<TerminalNode> WSP() { return getTokens(StrategyParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(StrategyParser.WSP, i);
		}
		public TerminalNode ConditionOperator() { return getToken(StrategyParser.ConditionOperator, 0); }
		public ConstantLiteralContext constantLiteral() {
			return getRuleContext(ConstantLiteralContext.class,0);
		}
		public ConditionContext(ConditionExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends ConditionExprContext {
		public MemberLiteralContext memberLiteral() {
			return getRuleContext(MemberLiteralContext.class,0);
		}
		public List<TerminalNode> WSP() { return getTokens(StrategyParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(StrategyParser.WSP, i);
		}
		public TerminalNode LIKE() { return getToken(StrategyParser.LIKE, 0); }
		public ConstantLiteralContext constantLiteral() {
			return getRuleContext(ConstantLiteralContext.class,0);
		}
		public LikeContext(ConditionExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InContext extends ConditionExprContext {
		public MemberLiteralContext memberLiteral() {
			return getRuleContext(MemberLiteralContext.class,0);
		}
		public List<TerminalNode> WSP() { return getTokens(StrategyParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(StrategyParser.WSP, i);
		}
		public TerminalNode IN() { return getToken(StrategyParser.IN, 0); }
		public ConstantLiteralListContext constantLiteralList() {
			return getRuleContext(ConstantLiteralListContext.class,0);
		}
		public InContext(ConditionExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExprContext conditionExpr() throws RecognitionException {
		ConditionExprContext _localctx = new ConditionExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_conditionExpr);
		int _la;
		try {
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				memberLiteral();
				setState(97);
				match(WSP);
				setState(98);
				match(ConditionOperator);
				setState(99);
				match(WSP);
				setState(100);
				constantLiteral();
				}
				break;
			case 2:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				memberLiteral();
				setState(103);
				match(WSP);
				setState(104);
				match(LIKE);
				setState(105);
				match(WSP);
				setState(106);
				constantLiteral();
				}
				break;
			case 3:
				_localctx = new InContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				memberLiteral();
				setState(109);
				match(WSP);
				setState(110);
				match(IN);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WSP) {
					{
					setState(111);
					match(WSP);
					}
				}

				setState(114);
				constantLiteralList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectExprContext extends ParserRuleContext {
		public List<MemberLiteralContext> memberLiteral() {
			return getRuleContexts(MemberLiteralContext.class);
		}
		public MemberLiteralContext memberLiteral(int i) {
			return getRuleContext(MemberLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StrategyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StrategyParser.COMMA, i);
		}
		public List<TerminalNode> WSP() { return getTokens(StrategyParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(StrategyParser.WSP, i);
		}
		public SelectExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterSelectExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitSelectExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitSelectExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectExprContext selectExpr() throws RecognitionException {
		SelectExprContext _localctx = new SelectExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			memberLiteral();
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==WSP) {
				{
				{
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WSP) {
					{
					setState(119);
					match(WSP);
					}
				}

				setState(122);
				match(COMMA);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WSP) {
					{
					setState(123);
					match(WSP);
					}
				}

				setState(126);
				memberLiteral();
				}
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderExprContext extends ParserRuleContext {
		public List<OrderItemContext> orderItem() {
			return getRuleContexts(OrderItemContext.class);
		}
		public OrderItemContext orderItem(int i) {
			return getRuleContext(OrderItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StrategyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StrategyParser.COMMA, i);
		}
		public List<TerminalNode> WSP() { return getTokens(StrategyParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(StrategyParser.WSP, i);
		}
		public OrderExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterOrderExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitOrderExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitOrderExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExprContext orderExpr() throws RecognitionException {
		OrderExprContext _localctx = new OrderExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_orderExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			orderItem();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA || _la==WSP) {
				{
				{
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WSP) {
					{
					setState(133);
					match(WSP);
					}
				}

				setState(136);
				match(COMMA);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WSP) {
					{
					setState(137);
					match(WSP);
					}
				}

				setState(140);
				orderItem();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderItemContext extends ParserRuleContext {
		public OrderItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderItem; }
	 
		public OrderItemContext() { }
		public void copyFrom(OrderItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AscContext extends OrderItemContext {
		public MemberLiteralContext memberLiteral() {
			return getRuleContext(MemberLiteralContext.class,0);
		}
		public TerminalNode WSP() { return getToken(StrategyParser.WSP, 0); }
		public TerminalNode ASC() { return getToken(StrategyParser.ASC, 0); }
		public AscContext(OrderItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterAsc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitAsc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitAsc(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescContext extends OrderItemContext {
		public MemberLiteralContext memberLiteral() {
			return getRuleContext(MemberLiteralContext.class,0);
		}
		public TerminalNode WSP() { return getToken(StrategyParser.WSP, 0); }
		public TerminalNode DESC() { return getToken(StrategyParser.DESC, 0); }
		public DescContext(OrderItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterDesc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitDesc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitDesc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderItemContext orderItem() throws RecognitionException {
		OrderItemContext _localctx = new OrderItemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_orderItem);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new AscContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				memberLiteral();
				setState(149);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(147);
					match(WSP);
					setState(148);
					match(ASC);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new DescContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				memberLiteral();
				setState(152);
				match(WSP);
				setState(153);
				match(DESC);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberLiteralContext extends ParserRuleContext {
		public List<TerminalNode> IDENTITY() { return getTokens(StrategyParser.IDENTITY); }
		public TerminalNode IDENTITY(int i) {
			return getToken(StrategyParser.IDENTITY, i);
		}
		public List<TerminalNode> DOT() { return getTokens(StrategyParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(StrategyParser.DOT, i);
		}
		public MemberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterMemberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitMemberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitMemberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberLiteralContext memberLiteral() throws RecognitionException {
		MemberLiteralContext _localctx = new MemberLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_memberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(IDENTITY);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(158);
				match(DOT);
				setState(159);
				match(IDENTITY);
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantLiteralContext extends ParserRuleContext {
		public ConstantLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantLiteral; }
	 
		public ConstantLiteralContext() { }
		public void copyFrom(ConstantLiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DateContext extends ConstantLiteralContext {
		public TerminalNode DATE() { return getToken(StrategyParser.DATE, 0); }
		public DateContext(ConstantLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitDate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitDate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DatetimeContext extends ConstantLiteralContext {
		public TerminalNode DATETIMEOFFSET() { return getToken(StrategyParser.DATETIMEOFFSET, 0); }
		public DatetimeContext(ConstantLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterDatetime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitDatetime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitDatetime(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullContext extends ConstantLiteralContext {
		public TerminalNode NULL() { return getToken(StrategyParser.NULL, 0); }
		public NullContext(ConstantLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends ConstantLiteralContext {
		public TerminalNode BOOLEAN() { return getToken(StrategyParser.BOOLEAN, 0); }
		public BoolContext(ConstantLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ConstantLiteralContext {
		public TerminalNode STRING() { return getToken(StrategyParser.STRING, 0); }
		public StringContext(ConstantLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DecimalContext extends ConstantLiteralContext {
		public TerminalNode DECIMAL() { return getToken(StrategyParser.DECIMAL, 0); }
		public DecimalContext(ConstantLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitDecimal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UuidContext extends ConstantLiteralContext {
		public TerminalNode UUID() { return getToken(StrategyParser.UUID, 0); }
		public UuidContext(ConstantLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterUuid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitUuid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitUuid(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ConstantLiteralContext {
		public TerminalNode INT() { return getToken(StrategyParser.INT, 0); }
		public IntContext(ConstantLiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantLiteralContext constantLiteral() throws RecognitionException {
		ConstantLiteralContext _localctx = new ConstantLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constantLiteral);
		try {
			setState(173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(NULL);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(BOOLEAN);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(STRING);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				match(INT);
				}
				break;
			case DECIMAL:
				_localctx = new DecimalContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				match(DECIMAL);
				}
				break;
			case DATE:
				_localctx = new DateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				match(DATE);
				}
				break;
			case DATETIMEOFFSET:
				_localctx = new DatetimeContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				match(DATETIMEOFFSET);
				}
				break;
			case UUID:
				_localctx = new UuidContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(172);
				match(UUID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantLiteralListContext extends ParserRuleContext {
		public TerminalNode OPEN() { return getToken(StrategyParser.OPEN, 0); }
		public List<ConstantLiteralContext> constantLiteral() {
			return getRuleContexts(ConstantLiteralContext.class);
		}
		public ConstantLiteralContext constantLiteral(int i) {
			return getRuleContext(ConstantLiteralContext.class,i);
		}
		public TerminalNode CLOSE() { return getToken(StrategyParser.CLOSE, 0); }
		public List<TerminalNode> WSP() { return getTokens(StrategyParser.WSP); }
		public TerminalNode WSP(int i) {
			return getToken(StrategyParser.WSP, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(StrategyParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(StrategyParser.COMMA, i);
		}
		public ConstantLiteralListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantLiteralList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).enterConstantLiteralList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof StrategyListener ) ((StrategyListener)listener).exitConstantLiteralList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitConstantLiteralList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantLiteralListContext constantLiteralList() throws RecognitionException {
		ConstantLiteralListContext _localctx = new ConstantLiteralListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constantLiteralList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(OPEN);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSP) {
				{
				setState(176);
				match(WSP);
				}
			}

			setState(179);
			constantLiteral();
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(181);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WSP) {
						{
						setState(180);
						match(WSP);
						}
					}

					setState(183);
					match(COMMA);
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==WSP) {
						{
						setState(184);
						match(WSP);
						}
					}

					setState(187);
					constantLiteral();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WSP) {
				{
				setState(193);
				match(WSP);
				}
			}

			setState(196);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u00c9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\5\2\"\n\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"\66\n\3\3\4\3\4\5\4:\n\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4W"+
		"\n\4\3\5\3\5\5\5[\n\5\3\5\3\5\5\5_\n\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6s\n\6\3\6\3\6\5\6w\n\6\3\7"+
		"\3\7\5\7{\n\7\3\7\3\7\5\7\177\n\7\3\7\7\7\u0082\n\7\f\7\16\7\u0085\13"+
		"\7\3\b\3\b\5\b\u0089\n\b\3\b\3\b\5\b\u008d\n\b\3\b\7\b\u0090\n\b\f\b\16"+
		"\b\u0093\13\b\3\t\3\t\3\t\5\t\u0098\n\t\3\t\3\t\3\t\3\t\5\t\u009e\n\t"+
		"\3\n\3\n\3\n\7\n\u00a3\n\n\f\n\16\n\u00a6\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00b0\n\13\3\f\3\f\5\f\u00b4\n\f\3\f\3\f\5\f\u00b8"+
		"\n\f\3\f\3\f\5\f\u00bc\n\f\3\f\7\f\u00bf\n\f\f\f\16\f\u00c2\13\f\3\f\5"+
		"\f\u00c5\n\f\3\f\3\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2\u00e4"+
		"\2!\3\2\2\2\4\65\3\2\2\2\6V\3\2\2\2\bX\3\2\2\2\nv\3\2\2\2\fx\3\2\2\2\16"+
		"\u0086\3\2\2\2\20\u009d\3\2\2\2\22\u009f\3\2\2\2\24\u00af\3\2\2\2\26\u00b1"+
		"\3\2\2\2\30\"\3\2\2\2\31\36\5\4\3\2\32\33\7\t\2\2\33\35\5\4\3\2\34\32"+
		"\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37\"\3\2\2\2 \36\3\2"+
		"\2\2!\30\3\2\2\2!\31\3\2\2\2\"\3\3\2\2\2#$\7&\2\2$%\7\f\2\2%\66\5\6\4"+
		"\2&\'\7\'\2\2\'(\7\f\2\2(\66\5\f\7\2)*\7(\2\2*+\7\f\2\2+\66\7\22\2\2,"+
		"-\7)\2\2-.\7\f\2\2.\66\7\22\2\2/\60\7*\2\2\60\61\7\f\2\2\61\66\5\16\b"+
		"\2\62\63\7+\2\2\63\64\7\f\2\2\64\66\7,\2\2\65#\3\2\2\2\65&\3\2\2\2\65"+
		")\3\2\2\2\65,\3\2\2\2\65/\3\2\2\2\65\62\3\2\2\2\66\5\3\2\2\2\679\7\6\2"+
		"\28:\7\n\2\298\3\2\2\29:\3\2\2\2:;\3\2\2\2;=\5\6\4\2<>\7\n\2\2=<\3\2\2"+
		"\2=>\3\2\2\2>?\3\2\2\2?@\7\7\2\2@W\3\2\2\2AB\5\b\5\2BC\7\n\2\2CD\7!\2"+
		"\2DE\7\n\2\2EF\5\b\5\2FW\3\2\2\2GH\5\b\5\2HI\7\n\2\2IJ\7\"\2\2JK\7\n\2"+
		"\2KL\5\b\5\2LW\3\2\2\2MN\5\b\5\2NO\7\n\2\2OP\7\r\2\2PQ\7\n\2\2QR\5\b\5"+
		"\2RW\3\2\2\2ST\7#\2\2TU\7\n\2\2UW\5\b\5\2V\67\3\2\2\2VA\3\2\2\2VG\3\2"+
		"\2\2VM\3\2\2\2VS\3\2\2\2W\7\3\2\2\2XZ\7\4\2\2Y[\7\n\2\2ZY\3\2\2\2Z[\3"+
		"\2\2\2[\\\3\2\2\2\\^\5\n\6\2]_\7\n\2\2^]\3\2\2\2^_\3\2\2\2_`\3\2\2\2`"+
		"a\7\5\2\2a\t\3\2\2\2bc\5\22\n\2cd\7\n\2\2de\7\3\2\2ef\7\n\2\2fg\5\24\13"+
		"\2gw\3\2\2\2hi\5\22\n\2ij\7\n\2\2jk\7%\2\2kl\7\n\2\2lm\5\24\13\2mw\3\2"+
		"\2\2no\5\22\n\2op\7\n\2\2pr\7$\2\2qs\7\n\2\2rq\3\2\2\2rs\3\2\2\2st\3\2"+
		"\2\2tu\5\26\f\2uw\3\2\2\2vb\3\2\2\2vh\3\2\2\2vn\3\2\2\2w\13\3\2\2\2x\u0083"+
		"\5\22\n\2y{\7\n\2\2zy\3\2\2\2z{\3\2\2\2{|\3\2\2\2|~\7\b\2\2}\177\7\n\2"+
		"\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\5\22\n\2\u0081"+
		"z\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\r\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0091\5\20\t\2\u0087\u0089"+
		"\7\n\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008c\7\b\2\2\u008b\u008d\7\n\2\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u0090\5\20\t\2\u008f\u0088\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\17\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0094\u0097\5\22\n\2\u0095\u0096\7\n\2\2\u0096"+
		"\u0098\7\31\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009e\3"+
		"\2\2\2\u0099\u009a\5\22\n\2\u009a\u009b\7\n\2\2\u009b\u009c\7\32\2\2\u009c"+
		"\u009e\3\2\2\2\u009d\u0094\3\2\2\2\u009d\u0099\3\2\2\2\u009e\21\3\2\2"+
		"\2\u009f\u00a4\7-\2\2\u00a0\u00a1\7\16\2\2\u00a1\u00a3\7-\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\23\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00b0\7\17\2\2\u00a8\u00b0\7\20"+
		"\2\2\u00a9\u00b0\7.\2\2\u00aa\u00b0\7\22\2\2\u00ab\u00b0\7\23\2\2\u00ac"+
		"\u00b0\7\25\2\2\u00ad\u00b0\7\26\2\2\u00ae\u00b0\7\30\2\2\u00af\u00a7"+
		"\3\2\2\2\u00af\u00a8\3\2\2\2\u00af\u00a9\3\2\2\2\u00af\u00aa\3\2\2\2\u00af"+
		"\u00ab\3\2\2\2\u00af\u00ac\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00ae\3\2"+
		"\2\2\u00b0\25\3\2\2\2\u00b1\u00b3\7\6\2\2\u00b2\u00b4\7\n\2\2\u00b3\u00b2"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00c0\5\24\13\2"+
		"\u00b6\u00b8\7\n\2\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9"+
		"\3\2\2\2\u00b9\u00bb\7\b\2\2\u00ba\u00bc\7\n\2\2\u00bb\u00ba\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\5\24\13\2\u00be\u00b7\3"+
		"\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1"+
		"\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\7\n\2\2\u00c4\u00c3\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\7\2\2\u00c7"+
		"\27\3\2\2\2\33\36!\659=VZ^rvz~\u0083\u0088\u008c\u0091\u0097\u009d\u00a4"+
		"\u00af\u00b3\u00b7\u00bb\u00c0\u00c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}