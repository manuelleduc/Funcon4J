// Generated from  by ANTLR 4.2.2

package camllight.parser;
import static camllight.parser.Tokens.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__24=1, T__23=2, T__22=3, T__21=4, T__20=5, T__19=6, T__18=7, T__17=8, 
		T__16=9, T__15=10, T__14=11, T__13=12, T__12=13, T__11=14, T__10=15, T__9=16, 
		T__8=17, T__7=18, T__6=19, T__5=20, T__4=21, T__3=22, T__2=23, T__1=24, 
		T__0=25, WS=26, NUM=27, BOOL=28, ID=29;
	public static final String[] tokenNames = {
		"<INVALID>", "'||'", "';'", "'while'", "'&&'", "'='", "'for'", "'if'", 
		"'<='", "'&'", "'print'", "'('", "'do'", "'*'", "'done'", "'to'", "'>='", 
		"'<'", "'>'", "'or'", "'begin'", "'else'", "'end'", "')'", "'+'", "'then'", 
		"WS", "NUM", "BOOL", "ID"
	};
	public static final int
		RULE_exp = 0, RULE_prog = 1;
	public static final String[] ruleNames = {
		"exp", "prog"
	};

	@Override
	public String getGrammarFileName() { return ""; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private camllight.algebras.AllAlg builder;
	public void setBuilder(camllight.algebras.AllAlg builder) { this.builder = builder; }
	private static <X> java.util.List<X> lift(String name, java.util.List<?> ctxs, X ...heads) {
	  java.util.List<X> l = new java.util.ArrayList<X>();
	  for (X h: heads) { l.add(h); }
	  for (Object ctx: ctxs) {
	    try {
	      l.add((X)ctx.getClass().getField(name).get(ctx));
	    } catch (Throwable e) {
	      throw new RuntimeException(e);
	    }
	  }
	  return l;
	}

	public CLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExpContext extends ParserRuleContext {
		public Object _exp;
		public ExpContext exp_0;
		public ExpContext exp_1;
		public ExpContext exp_2;
		public Token ID_0;
		public ExpContext exp_3;
		public Token BOOL_0;
		public Token NUM_0;
		public Token op_80;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode ID() { return getToken(CLParser.ID, 0); }
		public TerminalNode BOOL() { return getToken(CLParser.BOOL, 0); }
		public TerminalNode NUM() { return getToken(CLParser.NUM, 0); }
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 0;
		enterRecursionRule(_localctx, 0, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(5); match(7);
				setState(6); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(7); match(25);
				setState(8); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(9); match(21);
				setState(10); ((ExpContext)_localctx).exp_2 = exp(14);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				{
				setState(13); match(7);
				setState(14); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(15); match(25);
				setState(16); ((ExpContext)_localctx).exp_1 = exp(13);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 3:
				{
				setState(19); match(10);
				setState(20); ((ExpContext)_localctx).exp_0 = exp(9);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(23); ((ExpContext)_localctx).ID_0 = match(ID);
				((ExpContext)_localctx)._exp =  builder.id(id((((ExpContext)_localctx).ID_0!=null?((ExpContext)_localctx).ID_0.getText():null)));
				}
				break;

			case 5:
				{
				setState(25); match(3);
				setState(26); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(27); match(12);
				setState(28); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(29); match(14);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 6:
				{
				setState(32); match(6);
				setState(33); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(34); match(5);
				setState(35); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(36); match(15);
				setState(37); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(38); match(12);
				setState(39); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(40); match(14);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 7:
				{
				setState(43); ((ExpContext)_localctx).BOOL_0 = match(BOOL);
				((ExpContext)_localctx)._exp =  builder.bool(bool((((ExpContext)_localctx).BOOL_0!=null?((ExpContext)_localctx).BOOL_0.getText():null)));
				}
				break;

			case 8:
				{
				setState(45); match(11);
				setState(46); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(47); match(23);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 9:
				{
				setState(50); match(20);
				setState(51); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(52); match(22);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 10:
				{
				setState(55); ((ExpContext)_localctx).NUM_0 = match(NUM);
				((ExpContext)_localctx)._exp =  builder.lit(num((((ExpContext)_localctx).NUM_0!=null?((ExpContext)_localctx).NUM_0.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(91);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(89);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(59);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(60); match(2);
						setState(61); ((ExpContext)_localctx).exp_1 = exp(13);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(64);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(65); match(13);
						setState(66); ((ExpContext)_localctx).exp_1 = exp(6);
						((ExpContext)_localctx)._exp =  builder.intMultiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(69);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(70); match(24);
						setState(71); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.intAdd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(74);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(75);
						((ExpContext)_localctx).op_80 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 8) | (1L << 16) | (1L << 17) | (1L << 18))) != 0)) ) {
							((ExpContext)_localctx).op_80 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(76); ((ExpContext)_localctx).exp_1 = exp(4);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(79);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(80);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==9) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(81); ((ExpContext)_localctx).exp_1 = exp(3);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(84);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(85);
						_la = _input.LA(1);
						if ( !(_la==1 || _la==19) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(86); ((ExpContext)_localctx).exp_1 = exp(2);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(93);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ProgContext extends ParserRuleContext {
		public Object _prog;
		public ExpContext exp_0;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); ((ProgContext)_localctx).exp_0 = exp(0);
			((ProgContext)_localctx)._prog =  builder.start((((ProgContext)_localctx).exp_0._exp));
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 0: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 12);

		case 1: return precpred(_ctx, 5);

		case 2: return precpred(_ctx, 4);

		case 3: return precpred(_ctx, 3);

		case 4: return precpred(_ctx, 2);

		case 5: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\37d\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\5\2<\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\\"+
		"\n\2\f\2\16\2_\13\2\3\3\3\3\3\3\3\3\2\3\2\4\2\4\2\5\5\2\7\7\n\n\22\24"+
		"\4\2\6\6\13\13\4\2\3\3\25\25p\2;\3\2\2\2\4`\3\2\2\2\6\7\b\2\1\2\7\b\7"+
		"\t\2\2\b\t\5\2\2\2\t\n\7\33\2\2\n\13\5\2\2\2\13\f\7\27\2\2\f\r\5\2\2\20"+
		"\r\16\b\2\1\2\16<\3\2\2\2\17\20\7\t\2\2\20\21\5\2\2\2\21\22\7\33\2\2\22"+
		"\23\5\2\2\17\23\24\b\2\1\2\24<\3\2\2\2\25\26\7\f\2\2\26\27\5\2\2\13\27"+
		"\30\b\2\1\2\30<\3\2\2\2\31\32\7\37\2\2\32<\b\2\1\2\33\34\7\5\2\2\34\35"+
		"\5\2\2\2\35\36\7\16\2\2\36\37\5\2\2\2\37 \7\20\2\2 !\b\2\1\2!<\3\2\2\2"+
		"\"#\7\b\2\2#$\5\2\2\2$%\7\7\2\2%&\5\2\2\2&\'\7\21\2\2\'(\5\2\2\2()\7\16"+
		"\2\2)*\5\2\2\2*+\7\20\2\2+,\b\2\1\2,<\3\2\2\2-.\7\36\2\2.<\b\2\1\2/\60"+
		"\7\r\2\2\60\61\5\2\2\2\61\62\7\31\2\2\62\63\b\2\1\2\63<\3\2\2\2\64\65"+
		"\7\26\2\2\65\66\5\2\2\2\66\67\7\30\2\2\678\b\2\1\28<\3\2\2\29:\7\35\2"+
		"\2:<\b\2\1\2;\6\3\2\2\2;\17\3\2\2\2;\25\3\2\2\2;\31\3\2\2\2;\33\3\2\2"+
		"\2;\"\3\2\2\2;-\3\2\2\2;/\3\2\2\2;\64\3\2\2\2;9\3\2\2\2<]\3\2\2\2=>\f"+
		"\16\2\2>?\7\4\2\2?@\5\2\2\17@A\b\2\1\2A\\\3\2\2\2BC\f\7\2\2CD\7\17\2\2"+
		"DE\5\2\2\bEF\b\2\1\2F\\\3\2\2\2GH\f\6\2\2HI\7\32\2\2IJ\5\2\2\7JK\b\2\1"+
		"\2K\\\3\2\2\2LM\f\5\2\2MN\t\2\2\2NO\5\2\2\6OP\b\2\1\2P\\\3\2\2\2QR\f\4"+
		"\2\2RS\t\3\2\2ST\5\2\2\5TU\b\2\1\2U\\\3\2\2\2VW\f\3\2\2WX\t\4\2\2XY\5"+
		"\2\2\4YZ\b\2\1\2Z\\\3\2\2\2[=\3\2\2\2[B\3\2\2\2[G\3\2\2\2[L\3\2\2\2[Q"+
		"\3\2\2\2[V\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^\3\3\2\2\2_]\3\2\2\2"+
		"`a\5\2\2\2ab\b\3\1\2b\5\3\2\2\2\5;[]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}