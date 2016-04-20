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
		T__30=1, T__29=2, T__28=3, T__27=4, T__26=5, T__25=6, T__24=7, T__23=8, 
		T__22=9, T__21=10, T__20=11, T__19=12, T__18=13, T__17=14, T__16=15, T__15=16, 
		T__14=17, T__13=18, T__12=19, T__11=20, T__10=21, T__9=22, T__8=23, T__7=24, 
		T__6=25, T__5=26, T__4=27, T__3=28, T__2=29, T__1=30, T__0=31, WILDCARD=32, 
		WS=33, NUM=34, BOOL=35, ID=36;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'fun'", "'||'", "'while'", "';'", "'&&'", "'='", "'for'", "'if'", "'<='", 
		"'&'", "'print'", "'do'", "'('", "'*'", "','", "'->'", "'done'", "'to'", 
		"'>='", "'<'", "'|'", "'>'", "'or'", "'else'", "'begin'", "'function'", 
		"'end'", "')'", "'+'", "'then'", "'not'", "'_'", "WS", "NUM", "BOOL", 
		"ID"
	};
	public static final String[] ruleNames = {
		"T__30", "T__29", "T__28", "T__27", "T__26", "T__25", "T__24", "T__23", 
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WILDCARD", "WS", "NUM", 
		"BOOL", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2&\u00d4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\6\"\u00ba\n\"\r\"\16\"\u00bb\3\""+
		"\3\"\3#\6#\u00c1\n#\r#\16#\u00c2\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u00ce\n"+
		"$\3%\6%\u00d1\n%\r%\16%\u00d2\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\5\3\2\"\"\3\2"+
		"\62;\3\2c|\u00d7\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5O\3\2\2\2\7R\3\2\2\2\tX\3\2"+
		"\2\2\13Z\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21c\3\2\2\2\23f\3\2\2\2\25i\3"+
		"\2\2\2\27k\3\2\2\2\31q\3\2\2\2\33t\3\2\2\2\35v\3\2\2\2\37x\3\2\2\2!z\3"+
		"\2\2\2#}\3\2\2\2%\u0082\3\2\2\2\'\u0085\3\2\2\2)\u0088\3\2\2\2+\u008a"+
		"\3\2\2\2-\u008c\3\2\2\2/\u008e\3\2\2\2\61\u0091\3\2\2\2\63\u0096\3\2\2"+
		"\2\65\u009c\3\2\2\2\67\u00a5\3\2\2\29\u00a9\3\2\2\2;\u00ab\3\2\2\2=\u00ad"+
		"\3\2\2\2?\u00b2\3\2\2\2A\u00b6\3\2\2\2C\u00b9\3\2\2\2E\u00c0\3\2\2\2G"+
		"\u00cd\3\2\2\2I\u00d0\3\2\2\2KL\7h\2\2LM\7w\2\2MN\7p\2\2N\4\3\2\2\2OP"+
		"\7~\2\2PQ\7~\2\2Q\6\3\2\2\2RS\7y\2\2ST\7j\2\2TU\7k\2\2UV\7n\2\2VW\7g\2"+
		"\2W\b\3\2\2\2XY\7=\2\2Y\n\3\2\2\2Z[\7(\2\2[\\\7(\2\2\\\f\3\2\2\2]^\7?"+
		"\2\2^\16\3\2\2\2_`\7h\2\2`a\7q\2\2ab\7t\2\2b\20\3\2\2\2cd\7k\2\2de\7h"+
		"\2\2e\22\3\2\2\2fg\7>\2\2gh\7?\2\2h\24\3\2\2\2ij\7(\2\2j\26\3\2\2\2kl"+
		"\7r\2\2lm\7t\2\2mn\7k\2\2no\7p\2\2op\7v\2\2p\30\3\2\2\2qr\7f\2\2rs\7q"+
		"\2\2s\32\3\2\2\2tu\7*\2\2u\34\3\2\2\2vw\7,\2\2w\36\3\2\2\2xy\7.\2\2y "+
		"\3\2\2\2z{\7/\2\2{|\7@\2\2|\"\3\2\2\2}~\7f\2\2~\177\7q\2\2\177\u0080\7"+
		"p\2\2\u0080\u0081\7g\2\2\u0081$\3\2\2\2\u0082\u0083\7v\2\2\u0083\u0084"+
		"\7q\2\2\u0084&\3\2\2\2\u0085\u0086\7@\2\2\u0086\u0087\7?\2\2\u0087(\3"+
		"\2\2\2\u0088\u0089\7>\2\2\u0089*\3\2\2\2\u008a\u008b\7~\2\2\u008b,\3\2"+
		"\2\2\u008c\u008d\7@\2\2\u008d.\3\2\2\2\u008e\u008f\7q\2\2\u008f\u0090"+
		"\7t\2\2\u0090\60\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7n\2\2\u0093\u0094"+
		"\7u\2\2\u0094\u0095\7g\2\2\u0095\62\3\2\2\2\u0096\u0097\7d\2\2\u0097\u0098"+
		"\7g\2\2\u0098\u0099\7i\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b"+
		"\64\3\2\2\2\u009c\u009d\7h\2\2\u009d\u009e\7w\2\2\u009e\u009f\7p\2\2\u009f"+
		"\u00a0\7e\2\2\u00a0\u00a1\7v\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7q\2\2"+
		"\u00a3\u00a4\7p\2\2\u00a4\66\3\2\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a7\7"+
		"p\2\2\u00a7\u00a8\7f\2\2\u00a88\3\2\2\2\u00a9\u00aa\7+\2\2\u00aa:\3\2"+
		"\2\2\u00ab\u00ac\7-\2\2\u00ac<\3\2\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af"+
		"\7j\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7p\2\2\u00b1>\3\2\2\2\u00b2\u00b3"+
		"\7p\2\2\u00b3\u00b4\7q\2\2\u00b4\u00b5\7v\2\2\u00b5@\3\2\2\2\u00b6\u00b7"+
		"\7a\2\2\u00b7B\3\2\2\2\u00b8\u00ba\t\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb"+
		"\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00be\b\"\2\2\u00beD\3\2\2\2\u00bf\u00c1\t\3\2\2\u00c0\u00bf\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3F\3"+
		"\2\2\2\u00c4\u00c5\7h\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7"+
		"\u00c8\7u\2\2\u00c8\u00ce\7g\2\2\u00c9\u00ca\7v\2\2\u00ca\u00cb\7t\2\2"+
		"\u00cb\u00cc\7w\2\2\u00cc\u00ce\7g\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00c9"+
		"\3\2\2\2\u00ceH\3\2\2\2\u00cf\u00d1\t\4\2\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3J\3\2\2\2"+
		"\7\2\u00bb\u00c2\u00cd\u00d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}