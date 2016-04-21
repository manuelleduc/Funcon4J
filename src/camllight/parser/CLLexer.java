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
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, WILDCARD=34, WS=35, NUM=36, BOOL=37, ID=38;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'fun'", "'||'", "';'", "'while'", "'&&'", "'='", "'for'", "'if'", "'<='", 
		"'&'", "'print'", "'do'", "'('", "'*'", "','", "'->'", "'done'", "'to'", 
		"'>='", "'<'", "'|'", "'>'", "'or'", "'let'", "'in'", "'else'", "'begin'", 
		"'function'", "'end'", "')'", "'+'", "'then'", "'not'", "'_'", "WS", "NUM", 
		"BOOL", "ID"
	};
	public static final String[] ruleNames = {
		"T__32", "T__31", "T__30", "T__29", "T__28", "T__27", "T__26", "T__25", 
		"T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", "T__17", 
		"T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", "T__9", 
		"T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", "T__0", 
		"WILDCARD", "WS", "NUM", "BOOL", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2(\u00df\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"#\3#\3$\6$\u00c5\n$\r$\16$\u00c6\3$\3$\3%\6%\u00cc\n%\r%\16%\u00cd\3&"+
		"\3&\3&\3&\3&\3&\3&\3&\3&\5&\u00d9\n&\3\'\6\'\u00dc\n\'\r\'\16\'\u00dd"+
		"\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(\3\2\5\3\2\"\"\3\2\62;\3\2c|\u00e2\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5S\3\2\2\2\7V\3\2\2\2\tX\3\2\2\2\13"+
		"^\3\2\2\2\ra\3\2\2\2\17c\3\2\2\2\21g\3\2\2\2\23j\3\2\2\2\25m\3\2\2\2\27"+
		"o\3\2\2\2\31u\3\2\2\2\33x\3\2\2\2\35z\3\2\2\2\37|\3\2\2\2!~\3\2\2\2#\u0081"+
		"\3\2\2\2%\u0086\3\2\2\2\'\u0089\3\2\2\2)\u008c\3\2\2\2+\u008e\3\2\2\2"+
		"-\u0090\3\2\2\2/\u0092\3\2\2\2\61\u0095\3\2\2\2\63\u0099\3\2\2\2\65\u009c"+
		"\3\2\2\2\67\u00a1\3\2\2\29\u00a7\3\2\2\2;\u00b0\3\2\2\2=\u00b4\3\2\2\2"+
		"?\u00b6\3\2\2\2A\u00b8\3\2\2\2C\u00bd\3\2\2\2E\u00c1\3\2\2\2G\u00c4\3"+
		"\2\2\2I\u00cb\3\2\2\2K\u00d8\3\2\2\2M\u00db\3\2\2\2OP\7h\2\2PQ\7w\2\2"+
		"QR\7p\2\2R\4\3\2\2\2ST\7~\2\2TU\7~\2\2U\6\3\2\2\2VW\7=\2\2W\b\3\2\2\2"+
		"XY\7y\2\2YZ\7j\2\2Z[\7k\2\2[\\\7n\2\2\\]\7g\2\2]\n\3\2\2\2^_\7(\2\2_`"+
		"\7(\2\2`\f\3\2\2\2ab\7?\2\2b\16\3\2\2\2cd\7h\2\2de\7q\2\2ef\7t\2\2f\20"+
		"\3\2\2\2gh\7k\2\2hi\7h\2\2i\22\3\2\2\2jk\7>\2\2kl\7?\2\2l\24\3\2\2\2m"+
		"n\7(\2\2n\26\3\2\2\2op\7r\2\2pq\7t\2\2qr\7k\2\2rs\7p\2\2st\7v\2\2t\30"+
		"\3\2\2\2uv\7f\2\2vw\7q\2\2w\32\3\2\2\2xy\7*\2\2y\34\3\2\2\2z{\7,\2\2{"+
		"\36\3\2\2\2|}\7.\2\2} \3\2\2\2~\177\7/\2\2\177\u0080\7@\2\2\u0080\"\3"+
		"\2\2\2\u0081\u0082\7f\2\2\u0082\u0083\7q\2\2\u0083\u0084\7p\2\2\u0084"+
		"\u0085\7g\2\2\u0085$\3\2\2\2\u0086\u0087\7v\2\2\u0087\u0088\7q\2\2\u0088"+
		"&\3\2\2\2\u0089\u008a\7@\2\2\u008a\u008b\7?\2\2\u008b(\3\2\2\2\u008c\u008d"+
		"\7>\2\2\u008d*\3\2\2\2\u008e\u008f\7~\2\2\u008f,\3\2\2\2\u0090\u0091\7"+
		"@\2\2\u0091.\3\2\2\2\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2\u0094\60\3"+
		"\2\2\2\u0095\u0096\7n\2\2\u0096\u0097\7g\2\2\u0097\u0098\7v\2\2\u0098"+
		"\62\3\2\2\2\u0099\u009a\7k\2\2\u009a\u009b\7p\2\2\u009b\64\3\2\2\2\u009c"+
		"\u009d\7g\2\2\u009d\u009e\7n\2\2\u009e\u009f\7u\2\2\u009f\u00a0\7g\2\2"+
		"\u00a0\66\3\2\2\2\u00a1\u00a2\7d\2\2\u00a2\u00a3\7g\2\2\u00a3\u00a4\7"+
		"i\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7p\2\2\u00a68\3\2\2\2\u00a7\u00a8"+
		"\7h\2\2\u00a8\u00a9\7w\2\2\u00a9\u00aa\7p\2\2\u00aa\u00ab\7e\2\2\u00ab"+
		"\u00ac\7v\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7p\2\2"+
		"\u00af:\3\2\2\2\u00b0\u00b1\7g\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7f\2"+
		"\2\u00b3<\3\2\2\2\u00b4\u00b5\7+\2\2\u00b5>\3\2\2\2\u00b6\u00b7\7-\2\2"+
		"\u00b7@\3\2\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7j\2\2\u00ba\u00bb\7g\2"+
		"\2\u00bb\u00bc\7p\2\2\u00bcB\3\2\2\2\u00bd\u00be\7p\2\2\u00be\u00bf\7"+
		"q\2\2\u00bf\u00c0\7v\2\2\u00c0D\3\2\2\2\u00c1\u00c2\7a\2\2\u00c2F\3\2"+
		"\2\2\u00c3\u00c5\t\2\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\b$"+
		"\2\2\u00c9H\3\2\2\2\u00ca\u00cc\t\3\2\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd"+
		"\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ceJ\3\2\2\2\u00cf"+
		"\u00d0\7h\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7u\2\2"+
		"\u00d3\u00d9\7g\2\2\u00d4\u00d5\7v\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7"+
		"\7w\2\2\u00d7\u00d9\7g\2\2\u00d8\u00cf\3\2\2\2\u00d8\u00d4\3\2\2\2\u00d9"+
		"L\3\2\2\2\u00da\u00dc\t\4\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2"+
		"\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00deN\3\2\2\2\7\2\u00c6\u00cd"+
		"\u00d8\u00dd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}