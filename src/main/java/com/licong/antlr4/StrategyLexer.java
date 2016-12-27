// Generated from E:/github/antlr4/src/main/resources\Strategy.g4 by ANTLR 4.5.1
package com.licong.antlr4;
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
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KEYWORDS=1, ARRAY=2, OPERATOR=3, ARROPERATOR=4, VALUE=5, COMMA=6, PARENTHESES_OPEN=7, 
		PARENTHESES_CLOSE=8, BRACKET_OPEN=9, BRACKET_CLOSE=10, ORDER=11, LIMIT=12, 
		AND=13, OR=14, ASC=15, DESC=16, GT=17, GE=18, LT=19, LE=20, EQ=21, NE=22, 
		NOTIN=23, IN=24, STRING=25, ID=26, INT=27, WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"KEYWORDS", "ARRAY", "OPERATOR", "ARROPERATOR", "VALUE", "COMMA", "PARENTHESES_OPEN", 
		"PARENTHESES_CLOSE", "BRACKET_OPEN", "BRACKET_CLOSE", "ORDER", "LIMIT", 
		"AND", "OR", "ASC", "DESC", "GT", "GE", "LT", "LE", "EQ", "NE", "NOTIN", 
		"IN", "STRING", "ID", "INT", "WS"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u0150\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\u00c3\n\2\3\3\3\3\3\3\3\3\3\3\7\3\u00ca"+
		"\n\3\f\3\16\3\u00cd\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00d7\n\4"+
		"\3\5\3\5\5\5\u00db\n\5\3\6\3\6\5\6\u00df\n\6\3\7\3\7\3\7\3\7\5\7\u00e5"+
		"\n\7\3\b\3\b\3\b\3\b\5\b\u00eb\n\b\3\t\3\t\3\t\3\t\5\t\u00f1\n\t\3\n\3"+
		"\n\3\n\3\n\5\n\u00f7\n\n\3\13\3\13\3\13\3\13\5\13\u00fd\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\7\32\u0139"+
		"\n\32\f\32\16\32\u013c\13\32\3\32\3\32\3\33\6\33\u0141\n\33\r\33\16\33"+
		"\u0142\3\34\6\34\u0146\n\34\r\34\16\34\u0147\3\35\6\35\u014b\n\35\r\35"+
		"\16\35\u014c\3\35\3\35\3\u013a\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36\3\2\4\4\2C\\c|\5\2\13\f\17\17\"\"\u0166"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\3\u00c2"+
		"\3\2\2\2\5\u00c4\3\2\2\2\7\u00d6\3\2\2\2\t\u00da\3\2\2\2\13\u00de\3\2"+
		"\2\2\r\u00e4\3\2\2\2\17\u00ea\3\2\2\2\21\u00f0\3\2\2\2\23\u00f6\3\2\2"+
		"\2\25\u00fc\3\2\2\2\27\u00fe\3\2\2\2\31\u0104\3\2\2\2\33\u010b\3\2\2\2"+
		"\35\u010f\3\2\2\2\37\u0112\3\2\2\2!\u0116\3\2\2\2#\u011b\3\2\2\2%\u011e"+
		"\3\2\2\2\'\u0121\3\2\2\2)\u0124\3\2\2\2+\u0127\3\2\2\2-\u012a\3\2\2\2"+
		"/\u012d\3\2\2\2\61\u0133\3\2\2\2\63\u0136\3\2\2\2\65\u0140\3\2\2\2\67"+
		"\u0145\3\2\2\29\u014a\3\2\2\2;<\7s\2\2<=\7w\2\2=>\7g\2\2>?\7u\2\2?@\7"+
		"v\2\2@A\7k\2\2AB\7q\2\2BC\7p\2\2CD\7\60\2\2DE\7m\2\2EF\7p\2\2FG\7q\2\2"+
		"GH\7y\2\2HI\7n\2\2IJ\7g\2\2JK\7f\2\2KL\7i\2\2L\u00c3\7g\2\2MN\7s\2\2N"+
		"O\7w\2\2OP\7g\2\2PQ\7u\2\2QR\7v\2\2RS\7k\2\2ST\7q\2\2TU\7p\2\2UV\7\60"+
		"\2\2VW\7j\2\2WX\7c\2\2XY\7t\2\2Y\u00c3\7f\2\2Z[\7s\2\2[\\\7w\2\2\\]\7"+
		"g\2\2]^\7u\2\2^_\7v\2\2_`\7k\2\2`a\7q\2\2ab\7p\2\2bc\7\60\2\2cd\7v\2\2"+
		"de\7{\2\2ef\7r\2\2f\u00c3\7g\2\2gh\7s\2\2hi\7w\2\2ij\7g\2\2jk\7u\2\2k"+
		"l\7v\2\2lm\7k\2\2mn\7q\2\2no\7p\2\2op\7\60\2\2pq\7d\2\2qr\7c\2\2rs\7p"+
		"\2\2s\u00c3\7m\2\2tu\7w\2\2uv\7u\2\2vw\7g\2\2wx\7t\2\2xy\7a\2\2yz\7s\2"+
		"\2z{\7w\2\2{|\7g\2\2|}\7u\2\2}~\7v\2\2~\177\7k\2\2\177\u0080\7q\2\2\u0080"+
		"\u0081\7p\2\2\u0081\u0082\7\60\2\2\u0082\u0083\7e\2\2\u0083\u0084\7q\2"+
		"\2\u0084\u0085\7n\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087\u0088"+
		"\7e\2\2\u0088\u00c3\7v\2\2\u0089\u008a\7w\2\2\u008a\u008b\7u\2\2\u008b"+
		"\u008c\7g\2\2\u008c\u008d\7t\2\2\u008d\u008e\7a\2\2\u008e\u008f\7s\2\2"+
		"\u008f\u0090\7w\2\2\u0090\u0091\7g\2\2\u0091\u0092\7u\2\2\u0092\u0093"+
		"\7v\2\2\u0093\u0094\7k\2\2\u0094\u0095\7q\2\2\u0095\u0096\7p\2\2\u0096"+
		"\u0097\7\60\2\2\u0097\u0098\7w\2\2\u0098\u0099\7r\2\2\u0099\u009a\7f\2"+
		"\2\u009a\u009b\7c\2\2\u009b\u009c\7v\2\2\u009c\u009d\7g\2\2\u009d\u009e"+
		"\7a\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7o\2\2\u00a1"+
		"\u00c3\7g\2\2\u00a2\u00a3\7w\2\2\u00a3\u00a4\7u\2\2\u00a4\u00a5\7g\2\2"+
		"\u00a5\u00a6\7t\2\2\u00a6\u00a7\7a\2\2\u00a7\u00a8\7s\2\2\u00a8\u00a9"+
		"\7w\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7v\2\2\u00ac"+
		"\u00ad\7k\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7\60\2"+
		"\2\u00b0\u00b1\7m\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3\7{\2\2\u00b3\u00b4"+
		"\7a\2\2\u00b4\u00b5\7y\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7q\2\2\u00b7"+
		"\u00b8\7p\2\2\u00b8\u00b9\7i\2\2\u00b9\u00ba\7a\2\2\u00ba\u00bb\7s\2\2"+
		"\u00bb\u00bc\7w\2\2\u00bc\u00bd\7g\2\2\u00bd\u00be\7u\2\2\u00be\u00bf"+
		"\7v\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c3\7p\2\2\u00c2"+
		";\3\2\2\2\u00c2M\3\2\2\2\u00c2Z\3\2\2\2\u00c2g\3\2\2\2\u00c2t\3\2\2\2"+
		"\u00c2\u0089\3\2\2\2\u00c2\u00a2\3\2\2\2\u00c3\4\3\2\2\2\u00c4\u00c5\5"+
		"\17\b\2\u00c5\u00cb\5\13\6\2\u00c6\u00c7\5\r\7\2\u00c7\u00c8\5\13\6\2"+
		"\u00c8\u00ca\3\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9"+
		"\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"\u00cf\5\21\t\2\u00cf\6\3\2\2\2\u00d0\u00d7\5+\26\2\u00d1\u00d7\5-\27"+
		"\2\u00d2\u00d7\5#\22\2\u00d3\u00d7\5%\23\2\u00d4\u00d7\5)\25\2\u00d5\u00d7"+
		"\5\'\24\2\u00d6\u00d0\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d6\u00d2\3\2\2\2"+
		"\u00d6\u00d3\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7\b\3"+
		"\2\2\2\u00d8\u00db\5\61\31\2\u00d9\u00db\5/\30\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00d9\3\2\2\2\u00db\n\3\2\2\2\u00dc\u00df\5\63\32\2\u00dd\u00df\5\67"+
		"\34\2\u00de\u00dc\3\2\2\2\u00de\u00dd\3\2\2\2\u00df\f\3\2\2\2\u00e0\u00e5"+
		"\7.\2\2\u00e1\u00e2\7\'\2\2\u00e2\u00e3\7\64\2\2\u00e3\u00e5\7E\2\2\u00e4"+
		"\u00e0\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\16\3\2\2\2\u00e6\u00eb\7]\2\2"+
		"\u00e7\u00e8\7\'\2\2\u00e8\u00e9\7\67\2\2\u00e9\u00eb\7D\2\2\u00ea\u00e6"+
		"\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\20\3\2\2\2\u00ec\u00f1\7_\2\2\u00ed"+
		"\u00ee\7\'\2\2\u00ee\u00ef\7\67\2\2\u00ef\u00f1\7F\2\2\u00f0\u00ec\3\2"+
		"\2\2\u00f0\u00ed\3\2\2\2\u00f1\22\3\2\2\2\u00f2\u00f7\7*\2\2\u00f3\u00f4"+
		"\7\'\2\2\u00f4\u00f5\7\64\2\2\u00f5\u00f7\7:\2\2\u00f6\u00f2\3\2\2\2\u00f6"+
		"\u00f3\3\2\2\2\u00f7\24\3\2\2\2\u00f8\u00fd\7+\2\2\u00f9\u00fa\7\'\2\2"+
		"\u00fa\u00fb\7\64\2\2\u00fb\u00fd\7;\2\2\u00fc\u00f8\3\2\2\2\u00fc\u00f9"+
		"\3\2\2\2\u00fd\26\3\2\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7t\2\2\u0100"+
		"\u0101\7f\2\2\u0101\u0102\7g\2\2\u0102\u0103\7t\2\2\u0103\30\3\2\2\2\u0104"+
		"\u0105\7\"\2\2\u0105\u0106\7n\2\2\u0106\u0107\7k\2\2\u0107\u0108\7o\2"+
		"\2\u0108\u0109\7k\2\2\u0109\u010a\7v\2\2\u010a\32\3\2\2\2\u010b\u010c"+
		"\7c\2\2\u010c\u010d\7p\2\2\u010d\u010e\7f\2\2\u010e\34\3\2\2\2\u010f\u0110"+
		"\7q\2\2\u0110\u0111\7t\2\2\u0111\36\3\2\2\2\u0112\u0113\7c\2\2\u0113\u0114"+
		"\7u\2\2\u0114\u0115\7e\2\2\u0115 \3\2\2\2\u0116\u0117\7f\2\2\u0117\u0118"+
		"\7g\2\2\u0118\u0119\7u\2\2\u0119\u011a\7e\2\2\u011a\"\3\2\2\2\u011b\u011c"+
		"\7i\2\2\u011c\u011d\7v\2\2\u011d$\3\2\2\2\u011e\u011f\7i\2\2\u011f\u0120"+
		"\7g\2\2\u0120&\3\2\2\2\u0121\u0122\7n\2\2\u0122\u0123\7v\2\2\u0123(\3"+
		"\2\2\2\u0124\u0125\7n\2\2\u0125\u0126\7g\2\2\u0126*\3\2\2\2\u0127\u0128"+
		"\7g\2\2\u0128\u0129\7s\2\2\u0129,\3\2\2\2\u012a\u012b\7p\2\2\u012b\u012c"+
		"\7g\2\2\u012c.\3\2\2\2\u012d\u012e\7p\2\2\u012e\u012f\7q\2\2\u012f\u0130"+
		"\7v\2\2\u0130\u0131\7k\2\2\u0131\u0132\7p\2\2\u0132\60\3\2\2\2\u0133\u0134"+
		"\7k\2\2\u0134\u0135\7p\2\2\u0135\62\3\2\2\2\u0136\u013a\7$\2\2\u0137\u0139"+
		"\13\2\2\2\u0138\u0137\3\2\2\2\u0139\u013c\3\2\2\2\u013a\u013b\3\2\2\2"+
		"\u013a\u0138\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u013e"+
		"\7$\2\2\u013e\64\3\2\2\2\u013f\u0141\t\2\2\2\u0140\u013f\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143\66\3\2\2"+
		"\2\u0144\u0146\4\62;\2\u0145\u0144\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0145"+
		"\3\2\2\2\u0147\u0148\3\2\2\2\u01488\3\2\2\2\u0149\u014b\t\3\2\2\u014a"+
		"\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u014f\b\35\2\2\u014f:\3\2\2\2\21\2\u00c2"+
		"\u00cb\u00d6\u00da\u00de\u00e4\u00ea\u00f0\u00f6\u00fc\u013a\u0142\u0147"+
		"\u014c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}