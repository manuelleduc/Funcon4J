// Generated from  by ANTLR 4.2.2

package camllight.parser;
import static camllight.parser.Tokens.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__29=1, T__28=2, T__27=3, T__26=4, T__25=5, T__24=6, T__23=7, T__22=8, 
		T__21=9, T__20=10, T__19=11, T__18=12, T__17=13, T__16=14, T__15=15, T__14=16, 
		T__13=17, T__12=18, T__11=19, T__10=20, T__9=21, T__8=22, T__7=23, T__6=24, 
		T__5=25, T__4=26, T__3=27, T__2=28, T__1=29, T__0=30, WILDCARD=31, WS=32, 
		NUM=33, BOOL=34, ID=35;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'fun'", "'||'", "';'", "'while'", "'&&'", "'='", "'for'", "'if'", "'<='", 
		"'&'", "'print'", "'('", "'do'", "'*'", "'->'", "'done'", "'to'", "'>='", 
		"'<'", "'|'", "'>'", "'or'", "'begin'", "'else'", "'function'", "'end'", 
		"')'", "'+'", "'then'", "'not'", "'_'", "WS", "NUM", "BOOL", "ID"
	};
	public static final String[] ruleNames = {
		"T__29", "T__28", "T__27", "T__26", "T__25", "T__24", "T__23", "T__22", 
		"T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", "T__14", 
		"T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", 
		"T__4", "T__3", "T__2", "T__1", "T__0", "WILDCARD", "WS", "NUM", "BOOL", 
		"ID"
	};


	public CLLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return ""; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2%\u00d0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3 \3 \3!\6!\u00b6\n!\r!\16!\u00b7\3!\3!\3\"\6\"\u00bd"+
		"\n\"\r\"\16\"\u00be\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u00ca\n#\3$\6$\u00cd"+
		"\n$\r$\16$\u00ce\2\2%\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%\3\2\5\3\2\"\"\3\2\62;\3\2c|\u00d3\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2"+
		"\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2"+
		"\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2"+
		"\3I\3\2\2\2\5M\3\2\2\2\7P\3\2\2\2\tR\3\2\2\2\13X\3\2\2\2\r[\3\2\2\2\17"+
		"]\3\2\2\2\21a\3\2\2\2\23d\3\2\2\2\25g\3\2\2\2\27i\3\2\2\2\31o\3\2\2\2"+
		"\33q\3\2\2\2\35t\3\2\2\2\37v\3\2\2\2!y\3\2\2\2#~\3\2\2\2%\u0081\3\2\2"+
		"\2\'\u0084\3\2\2\2)\u0086\3\2\2\2+\u0088\3\2\2\2-\u008a\3\2\2\2/\u008d"+
		"\3\2\2\2\61\u0093\3\2\2\2\63\u0098\3\2\2\2\65\u00a1\3\2\2\2\67\u00a5\3"+
		"\2\2\29\u00a7\3\2\2\2;\u00a9\3\2\2\2=\u00ae\3\2\2\2?\u00b2\3\2\2\2A\u00b5"+
		"\3\2\2\2C\u00bc\3\2\2\2E\u00c9\3\2\2\2G\u00cc\3\2\2\2IJ\7h\2\2JK\7w\2"+
		"\2KL\7p\2\2L\4\3\2\2\2MN\7~\2\2NO\7~\2\2O\6\3\2\2\2PQ\7=\2\2Q\b\3\2\2"+
		"\2RS\7y\2\2ST\7j\2\2TU\7k\2\2UV\7n\2\2VW\7g\2\2W\n\3\2\2\2XY\7(\2\2YZ"+
		"\7(\2\2Z\f\3\2\2\2[\\\7?\2\2\\\16\3\2\2\2]^\7h\2\2^_\7q\2\2_`\7t\2\2`"+
		"\20\3\2\2\2ab\7k\2\2bc\7h\2\2c\22\3\2\2\2de\7>\2\2ef\7?\2\2f\24\3\2\2"+
		"\2gh\7(\2\2h\26\3\2\2\2ij\7r\2\2jk\7t\2\2kl\7k\2\2lm\7p\2\2mn\7v\2\2n"+
		"\30\3\2\2\2op\7*\2\2p\32\3\2\2\2qr\7f\2\2rs\7q\2\2s\34\3\2\2\2tu\7,\2"+
		"\2u\36\3\2\2\2vw\7/\2\2wx\7@\2\2x \3\2\2\2yz\7f\2\2z{\7q\2\2{|\7p\2\2"+
		"|}\7g\2\2}\"\3\2\2\2~\177\7v\2\2\177\u0080\7q\2\2\u0080$\3\2\2\2\u0081"+
		"\u0082\7@\2\2\u0082\u0083\7?\2\2\u0083&\3\2\2\2\u0084\u0085\7>\2\2\u0085"+
		"(\3\2\2\2\u0086\u0087\7~\2\2\u0087*\3\2\2\2\u0088\u0089\7@\2\2\u0089,"+
		"\3\2\2\2\u008a\u008b\7q\2\2\u008b\u008c\7t\2\2\u008c.\3\2\2\2\u008d\u008e"+
		"\7d\2\2\u008e\u008f\7g\2\2\u008f\u0090\7i\2\2\u0090\u0091\7k\2\2\u0091"+
		"\u0092\7p\2\2\u0092\60\3\2\2\2\u0093\u0094\7g\2\2\u0094\u0095\7n\2\2\u0095"+
		"\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\62\3\2\2\2\u0098\u0099\7h\2\2\u0099"+
		"\u009a\7w\2\2\u009a\u009b\7p\2\2\u009b\u009c\7e\2\2\u009c\u009d\7v\2\2"+
		"\u009d\u009e\7k\2\2\u009e\u009f\7q\2\2\u009f\u00a0\7p\2\2\u00a0\64\3\2"+
		"\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a4\7f\2\2\u00a4\66"+
		"\3\2\2\2\u00a5\u00a6\7+\2\2\u00a68\3\2\2\2\u00a7\u00a8\7-\2\2\u00a8:\3"+
		"\2\2\2\u00a9\u00aa\7v\2\2\u00aa\u00ab\7j\2\2\u00ab\u00ac\7g\2\2\u00ac"+
		"\u00ad\7p\2\2\u00ad<\3\2\2\2\u00ae\u00af\7p\2\2\u00af\u00b0\7q\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1>\3\2\2\2\u00b2\u00b3\7a\2\2\u00b3@\3\2\2\2\u00b4\u00b6"+
		"\t\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7"+
		"\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\b!\2\2\u00baB\3\2\2\2\u00bb"+
		"\u00bd\t\3\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2"+
		"\2\2\u00be\u00bf\3\2\2\2\u00bfD\3\2\2\2\u00c0\u00c1\7h\2\2\u00c1\u00c2"+
		"\7c\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c4\7u\2\2\u00c4\u00ca\7g\2\2\u00c5"+
		"\u00c6\7v\2\2\u00c6\u00c7\7t\2\2\u00c7\u00c8\7w\2\2\u00c8\u00ca\7g\2\2"+
		"\u00c9\u00c0\3\2\2\2\u00c9\u00c5\3\2\2\2\u00caF\3\2\2\2\u00cb\u00cd\t"+
		"\4\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cfH\3\2\2\2\7\2\u00b7\u00be\u00c9\u00ce\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}