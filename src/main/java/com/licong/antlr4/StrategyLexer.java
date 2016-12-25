package com.licong.antlr4;// Generated from D:/git/antlr4/src/main/resources\Strategy.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class StrategyLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, STRING=12, INT=13, WS=14, EQ=15, NEQ=16, GT=17, GE=18, 
		LE=19, LT=20, IN=21, NOTIN=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "STRING", "INT", "WS", "EQ", "NEQ", "GT", "GE", "LE", 
		"LT", "IN", "NOTIN"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'&&'", "'||'", "'('", "')'", "'knowledge'", "'hard'", "'type'", 
		"'bank'", "'['", "','", "']'", null, null, null, "'=='", "'!='", "'>'", 
		"'>='", "'<='", "'<'", "'in'", "'notin'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"STRING", "INT", "WS", "EQ", "NEQ", "GT", "GE", "LE", "LT", "IN", "NOTIN"
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


	public StrategyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Strategy.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\7\r[\n\r\f\r\16\r^\13\r\3\r\3\r\3\16\6\16c\n\16"+
		"\r\16\16\16d\3\17\6\17h\n\17\r\17\16\17i\3\17\3\17\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\\\2\30\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30\3\2\3\5\2\13\f\17\17\"\"\u0088\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)"+
		"\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\62\3\2\2\2\7\65\3\2\2\2\t"+
		"\67\3\2\2\2\139\3\2\2\2\rC\3\2\2\2\17H\3\2\2\2\21M\3\2\2\2\23R\3\2\2\2"+
		"\25T\3\2\2\2\27V\3\2\2\2\31X\3\2\2\2\33b\3\2\2\2\35g\3\2\2\2\37m\3\2\2"+
		"\2!p\3\2\2\2#s\3\2\2\2%u\3\2\2\2\'x\3\2\2\2){\3\2\2\2+}\3\2\2\2-\u0080"+
		"\3\2\2\2/\60\7(\2\2\60\61\7(\2\2\61\4\3\2\2\2\62\63\7~\2\2\63\64\7~\2"+
		"\2\64\6\3\2\2\2\65\66\7*\2\2\66\b\3\2\2\2\678\7+\2\28\n\3\2\2\29:\7m\2"+
		"\2:;\7p\2\2;<\7q\2\2<=\7y\2\2=>\7n\2\2>?\7g\2\2?@\7f\2\2@A\7i\2\2AB\7"+
		"g\2\2B\f\3\2\2\2CD\7j\2\2DE\7c\2\2EF\7t\2\2FG\7f\2\2G\16\3\2\2\2HI\7v"+
		"\2\2IJ\7{\2\2JK\7r\2\2KL\7g\2\2L\20\3\2\2\2MN\7d\2\2NO\7c\2\2OP\7p\2\2"+
		"PQ\7m\2\2Q\22\3\2\2\2RS\7]\2\2S\24\3\2\2\2TU\7.\2\2U\26\3\2\2\2VW\7_\2"+
		"\2W\30\3\2\2\2X\\\7$\2\2Y[\13\2\2\2ZY\3\2\2\2[^\3\2\2\2\\]\3\2\2\2\\Z"+
		"\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7$\2\2`\32\3\2\2\2ac\4\62;\2ba\3\2\2\2"+
		"cd\3\2\2\2db\3\2\2\2de\3\2\2\2e\34\3\2\2\2fh\t\2\2\2gf\3\2\2\2hi\3\2\2"+
		"\2ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\b\17\2\2l\36\3\2\2\2mn\7?\2\2no\7?"+
		"\2\2o \3\2\2\2pq\7#\2\2qr\7?\2\2r\"\3\2\2\2st\7@\2\2t$\3\2\2\2uv\7@\2"+
		"\2vw\7?\2\2w&\3\2\2\2xy\7>\2\2yz\7?\2\2z(\3\2\2\2{|\7>\2\2|*\3\2\2\2}"+
		"~\7k\2\2~\177\7p\2\2\177,\3\2\2\2\u0080\u0081\7p\2\2\u0081\u0082\7q\2"+
		"\2\u0082\u0083\7v\2\2\u0083\u0084\7k\2\2\u0084\u0085\7p\2\2\u0085.\3\2"+
		"\2\2\6\2\\di\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}