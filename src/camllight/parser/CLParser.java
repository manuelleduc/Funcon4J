// Generated from src/cl/parser/ by ANTLR 4.2.2

package camllight.parser;
import static noa.syntax.demo.Tokens.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NUM=2, WS=3;
	public static final String[] tokenNames = {
		"<INVALID>", "'+'", "NUM", "WS"
	};
	public static final int
		RULE_exp = 0, RULE_prog = 1;
	public static final String[] ruleNames = {
		"exp", "prog"
	};

	@Override
	public String getGrammarFileName() { return "parser"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	private camllight.algebras.IntAddAlg builder;
	public void setBuilder(camllight.algebras.IntAddAlg builder) { this.builder = builder; }
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
		public Token NUM_0;
		public ExpContext exp_1;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(5); ((ExpContext)_localctx).NUM_0 = match(NUM);
			((ExpContext)_localctx)._exp =  builder.lit(num((((ExpContext)_localctx).NUM_0!=null?((ExpContext)_localctx).NUM_0.getText():null)));
			}
			_ctx.stop = _input.LT(-1);
			setState(15);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					_localctx.exp_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(8);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(9); match(1);
					setState(10); ((ExpContext)_localctx).exp_1 = exp(2);
					((ExpContext)_localctx)._exp =  builder.add((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(17);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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
			setState(18); ((ProgContext)_localctx).exp_0 = exp(0);
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
		case 0: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\5\30\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\7\2\20\n\2\f\2\16\2\23\13\2\3"+
		"\3\3\3\3\3\3\3\2\3\2\4\2\4\2\2\26\2\6\3\2\2\2\4\24\3\2\2\2\6\7\b\2\1\2"+
		"\7\b\7\4\2\2\b\t\b\2\1\2\t\21\3\2\2\2\n\13\f\3\2\2\13\f\7\3\2\2\f\r\5"+
		"\2\2\4\r\16\b\2\1\2\16\20\3\2\2\2\17\n\3\2\2\2\20\23\3\2\2\2\21\17\3\2"+
		"\2\2\21\22\3\2\2\2\22\3\3\2\2\2\23\21\3\2\2\2\24\25\5\2\2\2\25\26\b\3"+
		"\1\2\26\5\3\2\2\2\3\21";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}