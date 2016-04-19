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
		T__30=1, T__29=2, T__28=3, T__27=4, T__26=5, T__25=6, T__24=7, T__23=8, 
		T__22=9, T__21=10, T__20=11, T__19=12, T__18=13, T__17=14, T__16=15, T__15=16, 
		T__14=17, T__13=18, T__12=19, T__11=20, T__10=21, T__9=22, T__8=23, T__7=24, 
		T__6=25, T__5=26, T__4=27, T__3=28, T__2=29, T__1=30, T__0=31, WS=32, 
		NUM=33, BOOL=34, ID=35;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'||'", "';'", "'while'", "'&&'", "'='", "'for'", 
		"'if'", "'<='", "'&'", "'print'", "'('", "'do'", "'*'", "'->'", "'done'", 
		"'to'", "'>='", "'<'", "'|'", "'>'", "'_'", "'or'", "'begin'", "'else'", 
		"'function'", "'end'", "')'", "'+'", "'then'", "'not'", "WS", "NUM", "BOOL", 
		"ID"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_patt = 2, RULE_ident = 3, 
		RULE_function = 4, RULE_exp = 5, RULE_pattmatchsingle = 6, RULE_pattmatchmultiple = 7, 
		RULE_prog = 8;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "patt", "ident", "function", "exp", "pattmatchsingle", 
		"pattmatchmultiple", "prog"
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
	public static class PattmatchContext extends ParserRuleContext {
		public Object _pattmatch;
		public PattmatchmultipleContext pattmatchmultiple_0;
		public PattmatchContext pattmatch_0;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchmultipleContext pattmatchmultiple() {
			return getRuleContext(PattmatchmultipleContext.class,0);
		}
		public PattmatchsingleContext pattmatchsingle() {
			return getRuleContext(PattmatchsingleContext.class,0);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public PattmatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatch; }
	}

	public final PattmatchContext pattmatch() throws RecognitionException {
		PattmatchContext _localctx = new PattmatchContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_pattmatch);
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18); ((PattmatchContext)_localctx).pattmatchmultiple_0 = pattmatchmultiple();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch2((((PattmatchContext)_localctx).pattmatchmultiple_0._pattmatchmultiple));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(21); match(20);
				setState(22); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(25); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch1((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;
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

	public static class ConstantContext extends ParserRuleContext {
		public Object _constant;
		public Token NUM_0;
		public Token BOOL_0;
		public TerminalNode BOOL() { return getToken(CLParser.BOOL, 0); }
		public TerminalNode NUM() { return getToken(CLParser.NUM, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constant);
		try {
			setState(34);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); ((ConstantContext)_localctx).NUM_0 = match(NUM);
				((ConstantContext)_localctx)._constant =  builder.int_(num((((ConstantContext)_localctx).NUM_0!=null?((ConstantContext)_localctx).NUM_0.getText():null)));
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(32); ((ConstantContext)_localctx).BOOL_0 = match(BOOL);
				((ConstantContext)_localctx)._constant =  builder.bool(bool((((ConstantContext)_localctx).BOOL_0!=null?((ConstantContext)_localctx).BOOL_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PattContext extends ParserRuleContext {
		public Object _patt;
		public IdentContext ident_0;
		public ConstantContext constant_0;
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public PattContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patt; }
	}

	public final PattContext patt() throws RecognitionException {
		PattContext _localctx = new PattContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_patt);
		try {
			setState(44);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(36); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); match(22);
				((PattContext)_localctx)._patt =  builder.pattWildcard();
				}
				break;
			case NUM:
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(41); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IdentContext extends ParserRuleContext {
		public Object _ident;
		public Token ID_0;
		public TerminalNode ID() { return getToken(CLParser.ID, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); ((IdentContext)_localctx).ID_0 = match(ID);
			((IdentContext)_localctx)._ident =  builder.id(id((((IdentContext)_localctx).ID_0!=null?((IdentContext)_localctx).ID_0.getText():null)));
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

	public static class FunctionContext extends ParserRuleContext {
		public Object _function;
		public PattmatchContext pattmatch_0;
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case 26:
				enterOuterAlt(_localctx, 1);
				{
				setState(49); match(26);
				setState(50); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;
			case 1:
				enterOuterAlt(_localctx, 2);
				{
				setState(53); match(1);
				setState(54); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpContext extends ParserRuleContext {
		public Object _exp;
		public ExpContext exp_0;
		public ExpContext exp_1;
		public ExpContext exp_2;
		public FunctionContext function_0;
		public IdentContext ident_0;
		public ExpContext exp_3;
		public ConstantContext constant_0;
		public Token op_80;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(60); match(11);
				setState(61); ((ExpContext)_localctx).exp_0 = exp(17);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(64); match(8);
				setState(65); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(66); match(30);
				setState(67); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(68); match(25);
				setState(69); ((ExpContext)_localctx).exp_2 = exp(16);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				{
				setState(72); match(8);
				setState(73); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(74); match(30);
				setState(75); ((ExpContext)_localctx).exp_1 = exp(12);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 4:
				{
				setState(78); ((ExpContext)_localctx).function_0 = function();
				setState(79); ((ExpContext)_localctx).exp_1 = exp(8);
				((ExpContext)_localctx)._exp =  builder.funcAplication((((ExpContext)_localctx).function_0._function),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 5:
				{
				setState(82); match(31);
				setState(83); ((ExpContext)_localctx).exp_0 = exp(3);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 6:
				{
				setState(86); match(4);
				setState(87); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(88); match(13);
				setState(89); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(90); match(16);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 7:
				{
				setState(93); match(7);
				setState(94); ((ExpContext)_localctx).ident_0 = ident();
				setState(95); match(6);
				setState(96); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(97); match(17);
				setState(98); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(99); match(13);
				setState(100); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(101); match(16);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 8:
				{
				setState(104); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 9:
				{
				setState(107); match(12);
				setState(108); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(109); match(28);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 10:
				{
				setState(112); match(24);
				setState(113); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(114); match(27);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 11:
				{
				setState(117); ((ExpContext)_localctx).function_0 = function();
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(122);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(123); match(3);
						setState(124); ((ExpContext)_localctx).exp_1 = exp(15);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(127);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(128); match(14);
						setState(129); ((ExpContext)_localctx).exp_1 = exp(7);
						((ExpContext)_localctx)._exp =  builder.intMultiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(132);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(133); match(29);
						setState(134); ((ExpContext)_localctx).exp_1 = exp(6);
						((ExpContext)_localctx)._exp =  builder.intAdd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(137);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(138);
						((ExpContext)_localctx).op_80 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 9) | (1L << 18) | (1L << 19) | (1L << 21))) != 0)) ) {
							((ExpContext)_localctx).op_80 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(139); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(142);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(143);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==10) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(144); ((ExpContext)_localctx).exp_1 = exp(3);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(147);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(148);
						_la = _input.LA(1);
						if ( !(_la==2 || _la==23) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(149); ((ExpContext)_localctx).exp_1 = exp(2);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class PattmatchsingleContext extends ParserRuleContext {
		public Object _pattmatchsingle;
		public PattContext patt_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public PattmatchsingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatchsingle; }
	}

	public final PattmatchsingleContext pattmatchsingle() throws RecognitionException {
		PattmatchsingleContext _localctx = new PattmatchsingleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pattmatchsingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); ((PattmatchsingleContext)_localctx).patt_0 = patt();
			setState(158); match(15);
			setState(159); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
			((PattmatchsingleContext)_localctx)._pattmatchsingle =  builder.pattMatchSingle((((PattmatchsingleContext)_localctx).patt_0._patt),(((PattmatchsingleContext)_localctx).exp_1._exp));
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

	public static class PattmatchmultipleContext extends ParserRuleContext {
		public Object _pattmatchmultiple;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchContext pattmatch_1;
		public PattmatchsingleContext pattmatchsingle() {
			return getRuleContext(PattmatchsingleContext.class,0);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public PattmatchmultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatchmultiple; }
	}

	public final PattmatchmultipleContext pattmatchmultiple() throws RecognitionException {
		PattmatchmultipleContext _localctx = new PattmatchmultipleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pattmatchmultiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); ((PattmatchmultipleContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
			setState(163); match(20);
			setState(164); ((PattmatchmultipleContext)_localctx).pattmatch_1 = pattmatch();
			((PattmatchmultipleContext)_localctx)._pattmatchmultiple =  builder.pattMatchMulti((((PattmatchmultipleContext)_localctx).pattmatchsingle_0._pattmatchsingle),(((PattmatchmultipleContext)_localctx).pattmatch_1._pattmatch));
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
		enterRule(_localctx, 16, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); ((ProgContext)_localctx).exp_0 = exp(0);
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
		case 5: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 14);

		case 1: return precpred(_ctx, 6);

		case 2: return precpred(_ctx, 5);

		case 3: return precpred(_ctx, 4);

		case 4: return precpred(_ctx, 2);

		case 5: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3%\u00ad\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\37\n\2\3\3\3\3\3\3\3\3\5\3%\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6<\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7{\n\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u009b\n\7\f\7\16"+
		"\7\u009e\13\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\2\3\f\13\2\4\6\b\n\f\16\20\22\2\5\6\2\b\b\13\13\24\25\27\27\4\2\7\7\f"+
		"\f\4\2\4\4\31\31\u00b9\2\36\3\2\2\2\4$\3\2\2\2\6.\3\2\2\2\b\60\3\2\2\2"+
		"\n;\3\2\2\2\fz\3\2\2\2\16\u009f\3\2\2\2\20\u00a4\3\2\2\2\22\u00a9\3\2"+
		"\2\2\24\25\5\20\t\2\25\26\b\2\1\2\26\37\3\2\2\2\27\30\7\26\2\2\30\31\5"+
		"\2\2\2\31\32\b\2\1\2\32\37\3\2\2\2\33\34\5\16\b\2\34\35\b\2\1\2\35\37"+
		"\3\2\2\2\36\24\3\2\2\2\36\27\3\2\2\2\36\33\3\2\2\2\37\3\3\2\2\2 !\7#\2"+
		"\2!%\b\3\1\2\"#\7$\2\2#%\b\3\1\2$ \3\2\2\2$\"\3\2\2\2%\5\3\2\2\2&\'\5"+
		"\b\5\2\'(\b\4\1\2(/\3\2\2\2)*\7\30\2\2*/\b\4\1\2+,\5\4\3\2,-\b\4\1\2-"+
		"/\3\2\2\2.&\3\2\2\2.)\3\2\2\2.+\3\2\2\2/\7\3\2\2\2\60\61\7%\2\2\61\62"+
		"\b\5\1\2\62\t\3\2\2\2\63\64\7\34\2\2\64\65\5\2\2\2\65\66\b\6\1\2\66<\3"+
		"\2\2\2\678\7\3\2\289\5\2\2\29:\b\6\1\2:<\3\2\2\2;\63\3\2\2\2;\67\3\2\2"+
		"\2<\13\3\2\2\2=>\b\7\1\2>?\7\r\2\2?@\5\f\7\23@A\b\7\1\2A{\3\2\2\2BC\7"+
		"\n\2\2CD\5\f\7\2DE\7 \2\2EF\5\f\7\2FG\7\33\2\2GH\5\f\7\22HI\b\7\1\2I{"+
		"\3\2\2\2JK\7\n\2\2KL\5\f\7\2LM\7 \2\2MN\5\f\7\16NO\b\7\1\2O{\3\2\2\2P"+
		"Q\5\n\6\2QR\5\f\7\nRS\b\7\1\2S{\3\2\2\2TU\7!\2\2UV\5\f\7\5VW\b\7\1\2W"+
		"{\3\2\2\2XY\7\6\2\2YZ\5\f\7\2Z[\7\17\2\2[\\\5\f\7\2\\]\7\22\2\2]^\b\7"+
		"\1\2^{\3\2\2\2_`\7\t\2\2`a\5\b\5\2ab\7\b\2\2bc\5\f\7\2cd\7\23\2\2de\5"+
		"\f\7\2ef\7\17\2\2fg\5\f\7\2gh\7\22\2\2hi\b\7\1\2i{\3\2\2\2jk\5\4\3\2k"+
		"l\b\7\1\2l{\3\2\2\2mn\7\16\2\2no\5\f\7\2op\7\36\2\2pq\b\7\1\2q{\3\2\2"+
		"\2rs\7\32\2\2st\5\f\7\2tu\7\35\2\2uv\b\7\1\2v{\3\2\2\2wx\5\n\6\2xy\b\7"+
		"\1\2y{\3\2\2\2z=\3\2\2\2zB\3\2\2\2zJ\3\2\2\2zP\3\2\2\2zT\3\2\2\2zX\3\2"+
		"\2\2z_\3\2\2\2zj\3\2\2\2zm\3\2\2\2zr\3\2\2\2zw\3\2\2\2{\u009c\3\2\2\2"+
		"|}\f\20\2\2}~\7\5\2\2~\177\5\f\7\21\177\u0080\b\7\1\2\u0080\u009b\3\2"+
		"\2\2\u0081\u0082\f\b\2\2\u0082\u0083\7\20\2\2\u0083\u0084\5\f\7\t\u0084"+
		"\u0085\b\7\1\2\u0085\u009b\3\2\2\2\u0086\u0087\f\7\2\2\u0087\u0088\7\37"+
		"\2\2\u0088\u0089\5\f\7\b\u0089\u008a\b\7\1\2\u008a\u009b\3\2\2\2\u008b"+
		"\u008c\f\6\2\2\u008c\u008d\t\2\2\2\u008d\u008e\5\f\7\7\u008e\u008f\b\7"+
		"\1\2\u008f\u009b\3\2\2\2\u0090\u0091\f\4\2\2\u0091\u0092\t\3\2\2\u0092"+
		"\u0093\5\f\7\5\u0093\u0094\b\7\1\2\u0094\u009b\3\2\2\2\u0095\u0096\f\3"+
		"\2\2\u0096\u0097\t\4\2\2\u0097\u0098\5\f\7\4\u0098\u0099\b\7\1\2\u0099"+
		"\u009b\3\2\2\2\u009a|\3\2\2\2\u009a\u0081\3\2\2\2\u009a\u0086\3\2\2\2"+
		"\u009a\u008b\3\2\2\2\u009a\u0090\3\2\2\2\u009a\u0095\3\2\2\2\u009b\u009e"+
		"\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\r\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009f\u00a0\5\6\4\2\u00a0\u00a1\7\21\2\2\u00a1\u00a2\5"+
		"\f\7\2\u00a2\u00a3\b\b\1\2\u00a3\17\3\2\2\2\u00a4\u00a5\5\16\b\2\u00a5"+
		"\u00a6\7\26\2\2\u00a6\u00a7\5\2\2\2\u00a7\u00a8\b\t\1\2\u00a8\21\3\2\2"+
		"\2\u00a9\u00aa\5\f\7\2\u00aa\u00ab\b\n\1\2\u00ab\23\3\2\2\2\t\36$.;z\u009a"+
		"\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}