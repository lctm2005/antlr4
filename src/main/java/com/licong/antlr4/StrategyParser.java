// Generated from E:/github/antlr4/src/main/resources\Strategy.g4 by ANTLR 4.5.1
package com.licong.antlr4;
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
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORDS=1, ARRAY=2, OPERATOR=3, ARROPERATOR=4, VALUE=5, COMMA=6, PARENTHESES_OPEN=7, 
		PARENTHESES_CLOSE=8, BRACKET_OPEN=9, BRACKET_CLOSE=10, ORDER=11, LIMIT=12, 
		AND=13, OR=14, ASC=15, DESC=16, GT=17, GE=18, LT=19, LE=20, EQ=21, NE=22, 
		NOTIN=23, IN=24, STRING=25, ID=26, INT=27, WS=28;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_filterExpr = 2, RULE_limitExpr = 3, 
		RULE_orderExpr = 4, RULE_logicExpr = 5, RULE_expr = 6, RULE_atom = 7;
	public static final String[] ruleNames = {
		"prog", "stat", "filterExpr", "limitExpr", "orderExpr", "logicExpr", "expr", 
		"atom"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "'order'", 
		"' limit'", "'and'", "'or'", "'asc'", "'desc'", "'gt'", "'ge'", "'lt'", 
		"'le'", "'eq'", "'ne'", "'notin'", "'in'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KEYWORDS", "ARRAY", "OPERATOR", "ARROPERATOR", "VALUE", "COMMA", 
		"PARENTHESES_OPEN", "PARENTHESES_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", 
		"ORDER", "LIMIT", "AND", "OR", "ASC", "DESC", "GT", "GE", "LT", "LE", 
		"EQ", "NE", "NOTIN", "IN", "STRING", "ID", "INT", "WS"
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
	public static class ProgContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			stat();
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

	public static class StatContext extends ParserRuleContext {
		public FilterExprContext filterExpr() {
			return getRuleContext(FilterExprContext.class,0);
		}
		public OrderExprContext orderExpr() {
			return getRuleContext(OrderExprContext.class,0);
		}
		public LimitExprContext limitExpr() {
			return getRuleContext(LimitExprContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			filterExpr();
			setState(20);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(19);
				orderExpr();
				}
			}

			setState(23);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(22);
				limitExpr();
				}
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

	public static class FilterExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(StrategyParser.AND, 0); }
		public TerminalNode OR() { return getToken(StrategyParser.OR, 0); }
		public FilterExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filterExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitFilterExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterExprContext filterExpr() throws RecognitionException {
		FilterExprContext _localctx = new FilterExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_filterExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			expr();
			setState(28);
			_la = _input.LA(1);
			if (_la==AND || _la==OR) {
				{
				setState(26);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(27);
				expr();
				}
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

	public static class LimitExprContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(StrategyParser.LIMIT, 0); }
		public TerminalNode INT() { return getToken(StrategyParser.INT, 0); }
		public LimitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitLimitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitExprContext limitExpr() throws RecognitionException {
		LimitExprContext _localctx = new LimitExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_limitExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(LIMIT);
			setState(31);
			match(INT);
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
		public TerminalNode ORDER() { return getToken(StrategyParser.ORDER, 0); }
		public TerminalNode KEYWORDS() { return getToken(StrategyParser.KEYWORDS, 0); }
		public TerminalNode ASC() { return getToken(StrategyParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(StrategyParser.DESC, 0); }
		public OrderExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitOrderExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderExprContext orderExpr() throws RecognitionException {
		OrderExprContext _localctx = new OrderExprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_orderExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(ORDER);
			setState(34);
			match(KEYWORDS);
			setState(36);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(35);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
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

	public static class LogicExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(StrategyParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(StrategyParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(StrategyParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(StrategyParser.OR, i);
		}
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitLogicExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		LogicExprContext _localctx = new LogicExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_logicExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			expr();
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(39);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(40);
				expr();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==AND || _la==OR );
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode BRACKET_OPEN() { return getToken(StrategyParser.BRACKET_OPEN, 0); }
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode BRACKET_CLOSE() { return getToken(StrategyParser.BRACKET_CLOSE, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(50);
			switch (_input.LA(1)) {
			case BRACKET_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(BRACKET_OPEN);
				setState(46);
				logicExpr();
				setState(47);
				match(BRACKET_CLOSE);
				}
				break;
			case KEYWORDS:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				atom();
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

	public static class AtomContext extends ParserRuleContext {
		public TerminalNode KEYWORDS() { return getToken(StrategyParser.KEYWORDS, 0); }
		public TerminalNode OPERATOR() { return getToken(StrategyParser.OPERATOR, 0); }
		public TerminalNode VALUE() { return getToken(StrategyParser.VALUE, 0); }
		public TerminalNode ARROPERATOR() { return getToken(StrategyParser.ARROPERATOR, 0); }
		public TerminalNode ARRAY() { return getToken(StrategyParser.ARRAY, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof StrategyVisitor ) return ((StrategyVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atom);
		try {
			setState(58);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(KEYWORDS);
				setState(53);
				match(OPERATOR);
				setState(54);
				match(VALUE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(KEYWORDS);
				setState(56);
				match(ARROPERATOR);
				setState(57);
				match(ARRAY);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36?\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3\5\3"+
		"\27\n\3\3\3\5\3\32\n\3\3\4\3\4\3\4\5\4\37\n\4\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\5\6\'\n\6\3\7\3\7\3\7\6\7,\n\7\r\7\16\7-\3\b\3\b\3\b\3\b\3\b\5\b\65\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t=\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\4\3"+
		"\2\17\20\3\2\21\22=\2\22\3\2\2\2\4\24\3\2\2\2\6\33\3\2\2\2\b \3\2\2\2"+
		"\n#\3\2\2\2\f(\3\2\2\2\16\64\3\2\2\2\20<\3\2\2\2\22\23\5\4\3\2\23\3\3"+
		"\2\2\2\24\26\5\6\4\2\25\27\5\n\6\2\26\25\3\2\2\2\26\27\3\2\2\2\27\31\3"+
		"\2\2\2\30\32\5\b\5\2\31\30\3\2\2\2\31\32\3\2\2\2\32\5\3\2\2\2\33\36\5"+
		"\16\b\2\34\35\t\2\2\2\35\37\5\16\b\2\36\34\3\2\2\2\36\37\3\2\2\2\37\7"+
		"\3\2\2\2 !\7\16\2\2!\"\7\35\2\2\"\t\3\2\2\2#$\7\r\2\2$&\7\3\2\2%\'\t\3"+
		"\2\2&%\3\2\2\2&\'\3\2\2\2\'\13\3\2\2\2(+\5\16\b\2)*\t\2\2\2*,\5\16\b\2"+
		"+)\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\r\3\2\2\2/\60\7\13\2\2\60\61"+
		"\5\f\7\2\61\62\7\f\2\2\62\65\3\2\2\2\63\65\5\20\t\2\64/\3\2\2\2\64\63"+
		"\3\2\2\2\65\17\3\2\2\2\66\67\7\3\2\2\678\7\5\2\28=\7\7\2\29:\7\3\2\2:"+
		";\7\6\2\2;=\7\4\2\2<\66\3\2\2\2<9\3\2\2\2=\21\3\2\2\2\t\26\31\36&-\64"+
		"<";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}