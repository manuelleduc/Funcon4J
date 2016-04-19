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
		T__25=1, T__24=2, T__23=3, T__22=4, T__21=5, T__20=6, T__19=7, T__18=8, 
		T__17=9, T__16=10, T__15=11, T__14=12, T__13=13, T__12=14, T__11=15, T__10=16, 
		T__9=17, T__8=18, T__7=19, T__6=20, T__5=21, T__4=22, T__3=23, T__2=24, 
		T__1=25, T__0=26, WS=27, NUM=28, BOOL=29, ID=30;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'||'", "'while'", "';'", "'&&'", "'='", "'if'", "'for'", "'<='", "'&'", 
		"'print'", "'('", "'do'", "'*'", "'done'", "'to'", "'>='", "'<'", "'>'", 
		"'or'", "'begin'", "'else'", "'end'", "')'", "'+'", "'then'", "'not'", 
		"WS", "NUM", "BOOL", "ID"
	};
	public static final String[] ruleNames = {
		"T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", "T__18", 
		"T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", "T__10", 
		"T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", "T__1", 
		"T__0", "WS", "NUM", "BOOL", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2 \u00b2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\6\34\u0098\n\34\r\34"+
		"\16\34\u0099\3\34\3\34\3\35\6\35\u009f\n\35\r\35\16\35\u00a0\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00ac\n\36\3\37\6\37\u00af\n"+
		"\37\r\37\16\37\u00b0\2\2 \3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= \3\2\5\3\2\"\"\3\2\62;\3\2c|\u00b5\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\3?\3\2\2\2\5B\3\2\2\2\7H\3\2\2\2\tJ\3\2\2\2\13M\3\2\2\2\rO\3"+
		"\2\2\2\17R\3\2\2\2\21V\3\2\2\2\23Y\3\2\2\2\25[\3\2\2\2\27a\3\2\2\2\31"+
		"c\3\2\2\2\33f\3\2\2\2\35h\3\2\2\2\37m\3\2\2\2!p\3\2\2\2#s\3\2\2\2%u\3"+
		"\2\2\2\'w\3\2\2\2)z\3\2\2\2+\u0080\3\2\2\2-\u0085\3\2\2\2/\u0089\3\2\2"+
		"\2\61\u008b\3\2\2\2\63\u008d\3\2\2\2\65\u0092\3\2\2\2\67\u0097\3\2\2\2"+
		"9\u009e\3\2\2\2;\u00ab\3\2\2\2=\u00ae\3\2\2\2?@\7~\2\2@A\7~\2\2A\4\3\2"+
		"\2\2BC\7y\2\2CD\7j\2\2DE\7k\2\2EF\7n\2\2FG\7g\2\2G\6\3\2\2\2HI\7=\2\2"+
		"I\b\3\2\2\2JK\7(\2\2KL\7(\2\2L\n\3\2\2\2MN\7?\2\2N\f\3\2\2\2OP\7k\2\2"+
		"PQ\7h\2\2Q\16\3\2\2\2RS\7h\2\2ST\7q\2\2TU\7t\2\2U\20\3\2\2\2VW\7>\2\2"+
		"WX\7?\2\2X\22\3\2\2\2YZ\7(\2\2Z\24\3\2\2\2[\\\7r\2\2\\]\7t\2\2]^\7k\2"+
		"\2^_\7p\2\2_`\7v\2\2`\26\3\2\2\2ab\7*\2\2b\30\3\2\2\2cd\7f\2\2de\7q\2"+
		"\2e\32\3\2\2\2fg\7,\2\2g\34\3\2\2\2hi\7f\2\2ij\7q\2\2jk\7p\2\2kl\7g\2"+
		"\2l\36\3\2\2\2mn\7v\2\2no\7q\2\2o \3\2\2\2pq\7@\2\2qr\7?\2\2r\"\3\2\2"+
		"\2st\7>\2\2t$\3\2\2\2uv\7@\2\2v&\3\2\2\2wx\7q\2\2xy\7t\2\2y(\3\2\2\2z"+
		"{\7d\2\2{|\7g\2\2|}\7i\2\2}~\7k\2\2~\177\7p\2\2\177*\3\2\2\2\u0080\u0081"+
		"\7g\2\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2\2\u0083\u0084\7g\2\2\u0084"+
		",\3\2\2\2\u0085\u0086\7g\2\2\u0086\u0087\7p\2\2\u0087\u0088\7f\2\2\u0088"+
		".\3\2\2\2\u0089\u008a\7+\2\2\u008a\60\3\2\2\2\u008b\u008c\7-\2\2\u008c"+
		"\62\3\2\2\2\u008d\u008e\7v\2\2\u008e\u008f\7j\2\2\u008f\u0090\7g\2\2\u0090"+
		"\u0091\7p\2\2\u0091\64\3\2\2\2\u0092\u0093\7p\2\2\u0093\u0094\7q\2\2\u0094"+
		"\u0095\7v\2\2\u0095\66\3\2\2\2\u0096\u0098\t\2\2\2\u0097\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009c\b\34\2\2\u009c8\3\2\2\2\u009d\u009f\t\3\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1:\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5"+
		"\7n\2\2\u00a5\u00a6\7u\2\2\u00a6\u00ac\7g\2\2\u00a7\u00a8\7v\2\2\u00a8"+
		"\u00a9\7t\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ac\7g\2\2\u00ab\u00a2\3\2\2"+
		"\2\u00ab\u00a7\3\2\2\2\u00ac<\3\2\2\2\u00ad\u00af\t\4\2\2\u00ae\u00ad"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1"+
		">\3\2\2\2\7\2\u0099\u00a0\u00ab\u00b0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}