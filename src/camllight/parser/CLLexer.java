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
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, WS=24, 
		NUM=25, BOOL=26, ID=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'done'", "'to'", "'||'", "'>='", "'while'", "'&&'", "'<'", "'='", "'>'", 
		"'for'", "'if'", "'or'", "'<='", "'&'", "'begin'", "'else'", "'end'", 
		"'('", "'do'", "')'", "'*'", "'+'", "'then'", "WS", "NUM", "BOOL", "ID"
	};
	public static final String[] ruleNames = {
		"T__22", "T__21", "T__20", "T__19", "T__18", "T__17", "T__16", "T__15", 
		"T__14", "T__13", "T__12", "T__11", "T__10", "T__9", "T__8", "T__7", "T__6", 
		"T__5", "T__4", "T__3", "T__2", "T__1", "T__0", "WS", "NUM", "BOOL", "ID"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\6\31\u0086\n\31\r\31\16\31\u0087\3\31\3"+
		"\31\3\32\6\32\u008d\n\32\r\32\16\32\u008e\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u009a\n\33\3\34\6\34\u009d\n\34\r\34\16\34\u009e"+
		"\2\2\35\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"\3\2\5\3\2\"\"\3\2\62;\3\2c|\u00a3\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\39\3\2\2\2\5>\3\2\2\2\7A\3\2\2\2\tD\3\2\2\2\13G\3\2"+
		"\2\2\rM\3\2\2\2\17P\3\2\2\2\21R\3\2\2\2\23T\3\2\2\2\25V\3\2\2\2\27Z\3"+
		"\2\2\2\31]\3\2\2\2\33`\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!k\3\2\2\2#p\3\2"+
		"\2\2%t\3\2\2\2\'v\3\2\2\2)y\3\2\2\2+{\3\2\2\2-}\3\2\2\2/\177\3\2\2\2\61"+
		"\u0085\3\2\2\2\63\u008c\3\2\2\2\65\u0099\3\2\2\2\67\u009c\3\2\2\29:\7"+
		"f\2\2:;\7q\2\2;<\7p\2\2<=\7g\2\2=\4\3\2\2\2>?\7v\2\2?@\7q\2\2@\6\3\2\2"+
		"\2AB\7~\2\2BC\7~\2\2C\b\3\2\2\2DE\7@\2\2EF\7?\2\2F\n\3\2\2\2GH\7y\2\2"+
		"HI\7j\2\2IJ\7k\2\2JK\7n\2\2KL\7g\2\2L\f\3\2\2\2MN\7(\2\2NO\7(\2\2O\16"+
		"\3\2\2\2PQ\7>\2\2Q\20\3\2\2\2RS\7?\2\2S\22\3\2\2\2TU\7@\2\2U\24\3\2\2"+
		"\2VW\7h\2\2WX\7q\2\2XY\7t\2\2Y\26\3\2\2\2Z[\7k\2\2[\\\7h\2\2\\\30\3\2"+
		"\2\2]^\7q\2\2^_\7t\2\2_\32\3\2\2\2`a\7>\2\2ab\7?\2\2b\34\3\2\2\2cd\7("+
		"\2\2d\36\3\2\2\2ef\7d\2\2fg\7g\2\2gh\7i\2\2hi\7k\2\2ij\7p\2\2j \3\2\2"+
		"\2kl\7g\2\2lm\7n\2\2mn\7u\2\2no\7g\2\2o\"\3\2\2\2pq\7g\2\2qr\7p\2\2rs"+
		"\7f\2\2s$\3\2\2\2tu\7*\2\2u&\3\2\2\2vw\7f\2\2wx\7q\2\2x(\3\2\2\2yz\7+"+
		"\2\2z*\3\2\2\2{|\7,\2\2|,\3\2\2\2}~\7-\2\2~.\3\2\2\2\177\u0080\7v\2\2"+
		"\u0080\u0081\7j\2\2\u0081\u0082\7g\2\2\u0082\u0083\7p\2\2\u0083\60\3\2"+
		"\2\2\u0084\u0086\t\2\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\b\31"+
		"\2\2\u008a\62\3\2\2\2\u008b\u008d\t\3\2\2\u008c\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\64\3\2\2\2\u0090"+
		"\u0091\7h\2\2\u0091\u0092\7c\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2"+
		"\u0094\u009a\7g\2\2\u0095\u0096\7v\2\2\u0096\u0097\7t\2\2\u0097\u0098"+
		"\7w\2\2\u0098\u009a\7g\2\2\u0099\u0090\3\2\2\2\u0099\u0095\3\2\2\2\u009a"+
		"\66\3\2\2\2\u009b\u009d\t\4\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2"+
		"\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f8\3\2\2\2\7\2\u0087\u008e"+
		"\u0099\u009e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}