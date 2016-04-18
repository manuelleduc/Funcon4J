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
		T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8, 
		T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16, 
		T__2=17, T__1=18, T__0=19, WS=20, NUM=21, BOOL=22, ID=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'done'", "'to'", "'||'", "'while'", "'&&'", "'='", "'for'", 
		"'if'", "'or'", "'&'", "'begin'", "'else'", "'end'", "'('", "'do'", "')'", 
		"'*'", "'+'", "'then'", "WS", "NUM", "BOOL", "ID"
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
			setState(51);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(5); match(8);
				setState(6); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(7); match(19);
				setState(8); ((ExpContext)_localctx).exp_1 = exp(12);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				{
				setState(11); match(8);
				setState(12); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(13); match(19);
				setState(14); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(15); match(12);
				setState(16); ((ExpContext)_localctx).exp_2 = exp(11);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				{
				setState(19); match(4);
				setState(20); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(21); match(15);
				setState(22); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(23); match(1);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 4:
				{
				setState(26); match(7);
				setState(27); ((ExpContext)_localctx).ID_0 = match(ID);
				setState(28); match(6);
				setState(29); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(30); match(2);
				setState(31); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(32); match(15);
				setState(33); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(34); match(1);
				((ExpContext)_localctx)._exp =  builder.for_(id((((ExpContext)_localctx).ID_0!=null?((ExpContext)_localctx).ID_0.getText():null)),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 5:
				{
				setState(37); ((ExpContext)_localctx).BOOL_0 = match(BOOL);
				((ExpContext)_localctx)._exp =  builder.bool(bool((((ExpContext)_localctx).BOOL_0!=null?((ExpContext)_localctx).BOOL_0.getText():null)));
				}
				break;

			case 6:
				{
				setState(39); match(14);
				setState(40); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(41); match(16);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 7:
				{
				setState(44); ((ExpContext)_localctx).NUM_0 = match(NUM);
				((ExpContext)_localctx)._exp =  builder.lit(num((((ExpContext)_localctx).NUM_0!=null?((ExpContext)_localctx).NUM_0.getText():null)));
				}
				break;

			case 8:
				{
				setState(46); match(11);
				setState(47); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(48); match(13);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(73);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(53);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(54); match(17);
						setState(55); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.multiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(58);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(59); match(18);
						setState(60); ((ExpContext)_localctx).exp_1 = exp(4);
						((ExpContext)_localctx)._exp =  builder.add((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(63);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(64);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==10) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(65); ((ExpContext)_localctx).exp_1 = exp(3);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(68);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(69);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==9) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(70); ((ExpContext)_localctx).exp_1 = exp(2);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(77);
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
			setState(78); ((ProgContext)_localctx).exp_0 = exp(0);
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
		case 0: return precpred(_ctx, 4);

		case 1: return precpred(_ctx, 3);

		case 2: return precpred(_ctx, 2);

		case 3: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31T\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\66\n\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\7\2L\n\2\f\2\16\2O\13\2\3\3\3\3\3\3\3\3\2\3\2\4\2\4\2\4\4\2\7\7\f\f"+
		"\4\2\5\5\13\13\\\2\65\3\2\2\2\4P\3\2\2\2\6\7\b\2\1\2\7\b\7\n\2\2\b\t\5"+
		"\2\2\2\t\n\7\25\2\2\n\13\5\2\2\16\13\f\b\2\1\2\f\66\3\2\2\2\r\16\7\n\2"+
		"\2\16\17\5\2\2\2\17\20\7\25\2\2\20\21\5\2\2\2\21\22\7\16\2\2\22\23\5\2"+
		"\2\r\23\24\b\2\1\2\24\66\3\2\2\2\25\26\7\6\2\2\26\27\5\2\2\2\27\30\7\21"+
		"\2\2\30\31\5\2\2\2\31\32\7\3\2\2\32\33\b\2\1\2\33\66\3\2\2\2\34\35\7\t"+
		"\2\2\35\36\7\31\2\2\36\37\7\b\2\2\37 \5\2\2\2 !\7\4\2\2!\"\5\2\2\2\"#"+
		"\7\21\2\2#$\5\2\2\2$%\7\3\2\2%&\b\2\1\2&\66\3\2\2\2\'(\7\30\2\2(\66\b"+
		"\2\1\2)*\7\20\2\2*+\5\2\2\2+,\7\22\2\2,-\b\2\1\2-\66\3\2\2\2./\7\27\2"+
		"\2/\66\b\2\1\2\60\61\7\r\2\2\61\62\5\2\2\2\62\63\7\17\2\2\63\64\b\2\1"+
		"\2\64\66\3\2\2\2\65\6\3\2\2\2\65\r\3\2\2\2\65\25\3\2\2\2\65\34\3\2\2\2"+
		"\65\'\3\2\2\2\65)\3\2\2\2\65.\3\2\2\2\65\60\3\2\2\2\66M\3\2\2\2\678\f"+
		"\6\2\289\7\23\2\29:\5\2\2\7:;\b\2\1\2;L\3\2\2\2<=\f\5\2\2=>\7\24\2\2>"+
		"?\5\2\2\6?@\b\2\1\2@L\3\2\2\2AB\f\4\2\2BC\t\2\2\2CD\5\2\2\5DE\b\2\1\2"+
		"EL\3\2\2\2FG\f\3\2\2GH\t\3\2\2HI\5\2\2\4IJ\b\2\1\2JL\3\2\2\2K\67\3\2\2"+
		"\2K<\3\2\2\2KA\3\2\2\2KF\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\3\3\2"+
		"\2\2OM\3\2\2\2PQ\5\2\2\2QR\b\3\1\2R\5\3\2\2\2\5\65KM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}