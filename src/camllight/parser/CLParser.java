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
		T__22=1, T__21=2, T__20=3, T__19=4, T__18=5, T__17=6, T__16=7, T__15=8, 
		T__14=9, T__13=10, T__12=11, T__11=12, T__10=13, T__9=14, T__8=15, T__7=16, 
		T__6=17, T__5=18, T__4=19, T__3=20, T__2=21, T__1=22, T__0=23, WS=24, 
		NUM=25, BOOL=26, ID=27;
	public static final String[] tokenNames = {
		"<INVALID>", "'done'", "'to'", "'||'", "'>='", "'while'", "'&&'", "'<'", 
		"'='", "'>'", "'for'", "'if'", "'or'", "'<='", "'&'", "'begin'", "'else'", 
		"'end'", "'('", "'do'", "')'", "'*'", "'+'", "'then'", "WS", "NUM", "BOOL", 
		"ID"
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
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(5); match(11);
				setState(6); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(7); match(23);
				setState(8); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(9); match(16);
				setState(10); ((ExpContext)_localctx).exp_2 = exp(13);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				{
				setState(13); match(11);
				setState(14); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(15); match(23);
				setState(16); ((ExpContext)_localctx).exp_1 = exp(12);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 3:
				{
				setState(19); ((ExpContext)_localctx).ID_0 = match(ID);
				((ExpContext)_localctx)._exp =  builder.id(id((((ExpContext)_localctx).ID_0!=null?((ExpContext)_localctx).ID_0.getText():null)));
				}
				break;

			case 4:
				{
				setState(21); match(10);
				setState(22); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(23); match(8);
				setState(24); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(25); match(2);
				setState(26); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(27); match(19);
				setState(28); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(29); match(1);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 5:
				{
				setState(32); match(5);
				setState(33); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(34); match(19);
				setState(35); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(36); match(1);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 6:
				{
				setState(39); ((ExpContext)_localctx).BOOL_0 = match(BOOL);
				((ExpContext)_localctx)._exp =  builder.bool(bool((((ExpContext)_localctx).BOOL_0!=null?((ExpContext)_localctx).BOOL_0.getText():null)));
				}
				break;

			case 7:
				{
				setState(41); match(18);
				setState(42); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(43); match(20);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 8:
				{
				setState(46); match(15);
				setState(47); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(48); match(17);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 9:
				{
				setState(51); ((ExpContext)_localctx).NUM_0 = match(NUM);
				((ExpContext)_localctx)._exp =  builder.lit(num((((ExpContext)_localctx).NUM_0!=null?((ExpContext)_localctx).NUM_0.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(80);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(55);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(56); match(21);
						setState(57); ((ExpContext)_localctx).exp_1 = exp(6);
						((ExpContext)_localctx)._exp =  builder.intMultiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(60);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(61); match(22);
						setState(62); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.intAdd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(65);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(66);
						((ExpContext)_localctx).op_80 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 7) | (1L << 8) | (1L << 9) | (1L << 13))) != 0)) ) {
							((ExpContext)_localctx).op_80 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(67); ((ExpContext)_localctx).exp_1 = exp(4);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(70);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(71);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==14) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(72); ((ExpContext)_localctx).exp_1 = exp(3);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(75);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(76);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==12) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(77); ((ExpContext)_localctx).exp_1 = exp(2);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(84);
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
			setState(85); ((ProgContext)_localctx).exp_0 = exp(0);
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
		case 0: return precpred(_ctx, 5);

		case 1: return precpred(_ctx, 4);

		case 2: return precpred(_ctx, 3);

		case 3: return precpred(_ctx, 2);

		case 4: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\35[\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\28\n\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2S\n\2\f\2\16\2V\13\2\3\3\3\3\3\3\3\3\2"+
		"\3\2\4\2\4\2\5\5\2\6\6\t\13\17\17\4\2\b\b\20\20\4\2\5\5\16\16e\2\67\3"+
		"\2\2\2\4W\3\2\2\2\6\7\b\2\1\2\7\b\7\r\2\2\b\t\5\2\2\2\t\n\7\31\2\2\n\13"+
		"\5\2\2\2\13\f\7\22\2\2\f\r\5\2\2\17\r\16\b\2\1\2\168\3\2\2\2\17\20\7\r"+
		"\2\2\20\21\5\2\2\2\21\22\7\31\2\2\22\23\5\2\2\16\23\24\b\2\1\2\248\3\2"+
		"\2\2\25\26\7\35\2\2\268\b\2\1\2\27\30\7\f\2\2\30\31\5\2\2\2\31\32\7\n"+
		"\2\2\32\33\5\2\2\2\33\34\7\4\2\2\34\35\5\2\2\2\35\36\7\25\2\2\36\37\5"+
		"\2\2\2\37 \7\3\2\2 !\b\2\1\2!8\3\2\2\2\"#\7\7\2\2#$\5\2\2\2$%\7\25\2\2"+
		"%&\5\2\2\2&\'\7\3\2\2\'(\b\2\1\2(8\3\2\2\2)*\7\34\2\2*8\b\2\1\2+,\7\24"+
		"\2\2,-\5\2\2\2-.\7\26\2\2./\b\2\1\2/8\3\2\2\2\60\61\7\21\2\2\61\62\5\2"+
		"\2\2\62\63\7\23\2\2\63\64\b\2\1\2\648\3\2\2\2\65\66\7\33\2\2\668\b\2\1"+
		"\2\67\6\3\2\2\2\67\17\3\2\2\2\67\25\3\2\2\2\67\27\3\2\2\2\67\"\3\2\2\2"+
		"\67)\3\2\2\2\67+\3\2\2\2\67\60\3\2\2\2\67\65\3\2\2\28T\3\2\2\29:\f\7\2"+
		"\2:;\7\27\2\2;<\5\2\2\b<=\b\2\1\2=S\3\2\2\2>?\f\6\2\2?@\7\30\2\2@A\5\2"+
		"\2\7AB\b\2\1\2BS\3\2\2\2CD\f\5\2\2DE\t\2\2\2EF\5\2\2\6FG\b\2\1\2GS\3\2"+
		"\2\2HI\f\4\2\2IJ\t\3\2\2JK\5\2\2\5KL\b\2\1\2LS\3\2\2\2MN\f\3\2\2NO\t\4"+
		"\2\2OP\5\2\2\4PQ\b\2\1\2QS\3\2\2\2R9\3\2\2\2R>\3\2\2\2RC\3\2\2\2RH\3\2"+
		"\2\2RM\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\3\3\2\2\2VT\3\2\2\2WX\5"+
		"\2\2\2XY\b\3\1\2Y\5\3\2\2\2\5\67RT";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}