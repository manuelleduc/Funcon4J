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
		T__6=25, T__5=26, T__4=27, T__3=28, T__2=29, T__1=30, T__0=31, WILDCARD=32, 
		WS=33, NUM=34, BOOL=35, ID=36;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'||'", "';'", "'while'", "'&&'", "'='", "'for'", 
		"'if'", "'<='", "'&'", "'print'", "'do'", "'('", "'*'", "','", "'->'", 
		"'done'", "'to'", "'>='", "'<'", "'|'", "'>'", "'or'", "'else'", "'begin'", 
		"'function'", "'end'", "')'", "'+'", "'then'", "'not'", "'_'", "WS", "NUM", 
		"BOOL", "ID"
	};
	public static final int
		RULE_exptuple = 0, RULE_pattmatch = 1, RULE_constant = 2, RULE_pattmatchcurried = 3, 
		RULE_patt = 4, RULE_ident = 5, RULE_patttuple = 6, RULE_function = 7, 
		RULE_exp = 8, RULE_pattmatchsingle = 9, RULE_pattmatchmultiple = 10, RULE_prog = 11;
	public static final String[] ruleNames = {
		"exptuple", "pattmatch", "constant", "pattmatchcurried", "patt", "ident", 
		"patttuple", "function", "exp", "pattmatchsingle", "pattmatchmultiple", 
		"prog"
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
	public static class ExptupleContext extends ParserRuleContext {
		public Object _exptuple;
		public ExpContext exp_0;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExptupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exptuple; }
	}

	public final ExptupleContext exptuple() throws RecognitionException {
		ExptupleContext _localctx = new ExptupleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_exptuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(15);
			setState(25); ((ExptupleContext)_localctx).exp_0 = exp(0);
			((ExptupleContext)_localctx)._exptuple =  builder.exprTupleSingle((((ExptupleContext)_localctx).exp_0._exp));
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

	public static class PattmatchContext extends ParserRuleContext {
		public Object _pattmatch;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchmultipleContext pattmatchmultiple_0;
		public PattmatchContext pattmatch_0;
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
		enterRule(_localctx, 2, RULE_pattmatch);
		try {
			setState(38);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch1((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31); ((PattmatchContext)_localctx).pattmatchmultiple_0 = pattmatchmultiple();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch2((((PattmatchContext)_localctx).pattmatchmultiple_0._pattmatchmultiple));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(34); match(21);
				setState(35); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
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
		enterRule(_localctx, 4, RULE_constant);
		try {
			setState(44);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(40); ((ConstantContext)_localctx).NUM_0 = match(NUM);
				((ConstantContext)_localctx)._constant =  builder.int_(num((((ConstantContext)_localctx).NUM_0!=null?((ConstantContext)_localctx).NUM_0.getText():null)));
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); ((ConstantContext)_localctx).BOOL_0 = match(BOOL);
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

	public static class PattmatchcurriedContext extends ParserRuleContext {
		public Object _pattmatchcurried;
		public PattContext patt;
		public List<PattContext> patt_0_list = new ArrayList<PattContext>();
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public PattmatchcurriedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatchcurried; }
	}

	public final PattmatchcurriedContext pattmatchcurried() throws RecognitionException {
		PattmatchcurriedContext _localctx = new PattmatchcurriedContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46); ((PattmatchcurriedContext)_localctx).patt = patt();
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << WILDCARD) | (1L << NUM) | (1L << BOOL) | (1L << ID))) != 0) );
			setState(51); match(16);
			setState(52); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
			((PattmatchcurriedContext)_localctx)._pattmatchcurried =  builder.pattMatchCurriedMulti(lift("_patt", ((PattmatchcurriedContext)_localctx).patt_0_list),(((PattmatchcurriedContext)_localctx).exp_1._exp));
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
		public PattContext patt_0;
		public PatttupleContext patttuple;
		public List<PatttupleContext> patttuple_1_list = new ArrayList<PatttupleContext>();
		public ConstantContext constant_0;
		public Token WILDCARD_0;
		public IdentContext ident_0;
		public PatttupleContext patttuple(int i) {
			return getRuleContext(PatttupleContext.class,i);
		}
		public List<PatttupleContext> patttuple() {
			return getRuleContexts(PatttupleContext.class);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public TerminalNode WILDCARD() { return getToken(CLParser.WILDCARD, 0); }
		public PattContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patt; }
	}

	public final PattContext patt() throws RecognitionException {
		PattContext _localctx = new PattContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_patt);
		int _la;
		try {
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); match(13);
				setState(56); ((PattContext)_localctx).patt_0 = patt();
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(57); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(60); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==15 );
				setState(62); match(28);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68); ((PattContext)_localctx).WILDCARD_0 = match(WILDCARD);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcard((((PattContext)_localctx).WILDCARD_0!=null?((PattContext)_localctx).WILDCARD_0.getText():null)));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(70); match(13);
				setState(71); ((PattContext)_localctx).patt_0 = patt();
				setState(72); match(28);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(75); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
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
		enterRule(_localctx, 10, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); ((IdentContext)_localctx).ID_0 = match(ID);
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

	public static class PatttupleContext extends ParserRuleContext {
		public Object _patttuple;
		public PattContext patt_0;
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public PatttupleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patttuple; }
	}

	public final PatttupleContext patttuple() throws RecognitionException {
		PatttupleContext _localctx = new PatttupleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83); match(15);
			setState(84); ((PatttupleContext)_localctx).patt_0 = patt();
			((PatttupleContext)_localctx)._patttuple =  builder.pattTupleSingle((((PatttupleContext)_localctx).patt_0._patt));
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
		public FunctionContext function_0;
		public PattmatchContext pattmatch_0;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchcurriedContext pattmatchcurried_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PattmatchsingleContext pattmatchsingle() {
			return getRuleContext(PattmatchsingleContext.class,0);
		}
		public PattmatchcurriedContext pattmatchcurried() {
			return getRuleContext(PattmatchcurriedContext.class,0);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		return function(0);
	}

	private FunctionContext function(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctionContext _localctx = new FunctionContext(_ctx, _parentState);
		FunctionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(88); match(26);
				setState(89); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(92); match(13);
				setState(93); ((FunctionContext)_localctx).function_0 = function(0);
				setState(94); match(28);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(97); match(25);
				setState(98); ((FunctionContext)_localctx).function_0 = function(0);
				setState(99); match(27);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 4:
				{
				setState(102); match(1);
				setState(103); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 5:
				{
				setState(106); match(1);
				setState(107); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(112);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(113); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(120);
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

	public static class ExpContext extends ParserRuleContext {
		public Object _exp;
		public ExpContext exp_0;
		public ExpContext exp_1;
		public ExpContext exp_2;
		public IdentContext ident_0;
		public ExpContext exp_3;
		public ConstantContext constant_0;
		public FunctionContext function_0;
		public ExptupleContext exptuple;
		public List<ExptupleContext> exptuple_1_list = new ArrayList<ExptupleContext>();
		public Token op_80;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExptupleContext exptuple(int i) {
			return getRuleContext(ExptupleContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<ExptupleContext> exptuple() {
			return getRuleContexts(ExptupleContext.class);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(122); match(11);
				setState(123); ((ExpContext)_localctx).exp_0 = exp(18);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(126); match(8);
				setState(127); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(128); match(30);
				setState(129); ((ExpContext)_localctx).exp_1 = exp(17);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 3:
				{
				setState(132); match(8);
				setState(133); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(134); match(30);
				setState(135); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(136); match(24);
				setState(137); ((ExpContext)_localctx).exp_2 = exp(15);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 4:
				{
				setState(140); match(31);
				setState(141); ((ExpContext)_localctx).exp_0 = exp(3);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(144); match(7);
				setState(145); ((ExpContext)_localctx).ident_0 = ident();
				setState(146); match(6);
				setState(147); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(148); match(18);
				setState(149); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(150); match(12);
				setState(151); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(152); match(17);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 6:
				{
				setState(155); match(4);
				setState(156); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(157); match(12);
				setState(158); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(159); match(17);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 7:
				{
				setState(162); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 8:
				{
				setState(165); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 9:
				{
				setState(168); match(13);
				setState(169); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(170); match(28);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 10:
				{
				setState(173); match(25);
				setState(174); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(175); match(27);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 11:
				{
				setState(178); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 12:
				{
				setState(181); match(13);
				setState(182); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(184); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(183); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(186); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==15 );
				setState(188); match(28);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(193);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(194); match(3);
						setState(195); ((ExpContext)_localctx).exp_1 = exp(14);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(198);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(199); match(14);
						setState(200); ((ExpContext)_localctx).exp_1 = exp(7);
						((ExpContext)_localctx)._exp =  builder.intMultiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(203);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(204); match(29);
						setState(205); ((ExpContext)_localctx).exp_1 = exp(6);
						((ExpContext)_localctx)._exp =  builder.intAdd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(208);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(209);
						((ExpContext)_localctx).op_80 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 9) | (1L << 19) | (1L << 20) | (1L << 22))) != 0)) ) {
							((ExpContext)_localctx).op_80 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(210); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(213);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(214);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==10) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(215); ((ExpContext)_localctx).exp_1 = exp(3);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(218);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(219);
						_la = _input.LA(1);
						if ( !(_la==2 || _la==23) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(220); ((ExpContext)_localctx).exp_1 = exp(2);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 18, RULE_pattmatchsingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228); ((PattmatchsingleContext)_localctx).patt_0 = patt();
			setState(229); match(16);
			setState(230); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 20, RULE_pattmatchmultiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); ((PattmatchmultipleContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
			setState(234); match(21);
			setState(235); ((PattmatchmultipleContext)_localctx).pattmatch_1 = pattmatch();
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
		enterRule(_localctx, 22, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); ((ProgContext)_localctx).exp_0 = exp(0);
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
		case 7: return function_sempred((FunctionContext)_localctx, predIndex);

		case 8: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 13);

		case 2: return precpred(_ctx, 6);

		case 3: return precpred(_ctx, 5);

		case 4: return precpred(_ctx, 4);

		case 5: return precpred(_ctx, 2);

		case 6: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3&\u00f4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3)\n\3\3\4\3\4\3\4\3\4\5\4/\n\4\3\5\6\5\62\n\5\r\5\16\5\63\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\6\6=\n\6\r\6\16\6>\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Q\n\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tq\n\t\3\t\3\t\3\t\3\t\7\tw\n\t\f\t\16"+
		"\tz\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u00bb\n\n\r\n\16"+
		"\n\u00bc\3\n\3\n\3\n\5\n\u00c2\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u00e2\n\n\f\n\16\n\u00e5\13\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\2\4\20\22\16\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\2\5\6\2\b\b\13\13\25\26\30\30\4\2\7\7\f\f\4\2\4\4\31\31\u0107"+
		"\2\32\3\2\2\2\4(\3\2\2\2\6.\3\2\2\2\b\61\3\2\2\2\nP\3\2\2\2\fR\3\2\2\2"+
		"\16U\3\2\2\2\20p\3\2\2\2\22\u00c1\3\2\2\2\24\u00e6\3\2\2\2\26\u00eb\3"+
		"\2\2\2\30\u00f0\3\2\2\2\32\33\7\21\2\2\33\34\5\22\n\2\34\35\b\2\1\2\35"+
		"\3\3\2\2\2\36\37\5\24\13\2\37 \b\3\1\2 )\3\2\2\2!\"\5\26\f\2\"#\b\3\1"+
		"\2#)\3\2\2\2$%\7\27\2\2%&\5\4\3\2&\'\b\3\1\2\')\3\2\2\2(\36\3\2\2\2(!"+
		"\3\2\2\2($\3\2\2\2)\5\3\2\2\2*+\7$\2\2+/\b\4\1\2,-\7%\2\2-/\b\4\1\2.*"+
		"\3\2\2\2.,\3\2\2\2/\7\3\2\2\2\60\62\5\n\6\2\61\60\3\2\2\2\62\63\3\2\2"+
		"\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\7\22\2\2\66\67\5\22"+
		"\n\2\678\b\5\1\28\t\3\2\2\29:\7\17\2\2:<\5\n\6\2;=\5\16\b\2<;\3\2\2\2"+
		"=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?@\3\2\2\2@A\7\36\2\2AB\b\6\1\2BQ\3\2\2"+
		"\2CD\5\6\4\2DE\b\6\1\2EQ\3\2\2\2FG\7\"\2\2GQ\b\6\1\2HI\7\17\2\2IJ\5\n"+
		"\6\2JK\7\36\2\2KL\b\6\1\2LQ\3\2\2\2MN\5\f\7\2NO\b\6\1\2OQ\3\2\2\2P9\3"+
		"\2\2\2PC\3\2\2\2PF\3\2\2\2PH\3\2\2\2PM\3\2\2\2Q\13\3\2\2\2RS\7&\2\2ST"+
		"\b\7\1\2T\r\3\2\2\2UV\7\21\2\2VW\5\n\6\2WX\b\b\1\2X\17\3\2\2\2YZ\b\t\1"+
		"\2Z[\7\34\2\2[\\\5\4\3\2\\]\b\t\1\2]q\3\2\2\2^_\7\17\2\2_`\5\20\t\2`a"+
		"\7\36\2\2ab\b\t\1\2bq\3\2\2\2cd\7\33\2\2de\5\20\t\2ef\7\35\2\2fg\b\t\1"+
		"\2gq\3\2\2\2hi\7\3\2\2ij\5\24\13\2jk\b\t\1\2kq\3\2\2\2lm\7\3\2\2mn\5\b"+
		"\5\2no\b\t\1\2oq\3\2\2\2pY\3\2\2\2p^\3\2\2\2pc\3\2\2\2ph\3\2\2\2pl\3\2"+
		"\2\2qx\3\2\2\2rs\f\6\2\2st\5\22\n\2tu\b\t\1\2uw\3\2\2\2vr\3\2\2\2wz\3"+
		"\2\2\2xv\3\2\2\2xy\3\2\2\2y\21\3\2\2\2zx\3\2\2\2{|\b\n\1\2|}\7\r\2\2}"+
		"~\5\22\n\24~\177\b\n\1\2\177\u00c2\3\2\2\2\u0080\u0081\7\n\2\2\u0081\u0082"+
		"\5\22\n\2\u0082\u0083\7 \2\2\u0083\u0084\5\22\n\23\u0084\u0085\b\n\1\2"+
		"\u0085\u00c2\3\2\2\2\u0086\u0087\7\n\2\2\u0087\u0088\5\22\n\2\u0088\u0089"+
		"\7 \2\2\u0089\u008a\5\22\n\2\u008a\u008b\7\32\2\2\u008b\u008c\5\22\n\21"+
		"\u008c\u008d\b\n\1\2\u008d\u00c2\3\2\2\2\u008e\u008f\7!\2\2\u008f\u0090"+
		"\5\22\n\5\u0090\u0091\b\n\1\2\u0091\u00c2\3\2\2\2\u0092\u0093\7\t\2\2"+
		"\u0093\u0094\5\f\7\2\u0094\u0095\7\b\2\2\u0095\u0096\5\22\n\2\u0096\u0097"+
		"\7\24\2\2\u0097\u0098\5\22\n\2\u0098\u0099\7\16\2\2\u0099\u009a\5\22\n"+
		"\2\u009a\u009b\7\23\2\2\u009b\u009c\b\n\1\2\u009c\u00c2\3\2\2\2\u009d"+
		"\u009e\7\6\2\2\u009e\u009f\5\22\n\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\5"+
		"\22\n\2\u00a1\u00a2\7\23\2\2\u00a2\u00a3\b\n\1\2\u00a3\u00c2\3\2\2\2\u00a4"+
		"\u00a5\5\6\4\2\u00a5\u00a6\b\n\1\2\u00a6\u00c2\3\2\2\2\u00a7\u00a8\5\f"+
		"\7\2\u00a8\u00a9\b\n\1\2\u00a9\u00c2\3\2\2\2\u00aa\u00ab\7\17\2\2\u00ab"+
		"\u00ac\5\22\n\2\u00ac\u00ad\7\36\2\2\u00ad\u00ae\b\n\1\2\u00ae\u00c2\3"+
		"\2\2\2\u00af\u00b0\7\33\2\2\u00b0\u00b1\5\22\n\2\u00b1\u00b2\7\35\2\2"+
		"\u00b2\u00b3\b\n\1\2\u00b3\u00c2\3\2\2\2\u00b4\u00b5\5\20\t\2\u00b5\u00b6"+
		"\b\n\1\2\u00b6\u00c2\3\2\2\2\u00b7\u00b8\7\17\2\2\u00b8\u00ba\5\22\n\2"+
		"\u00b9\u00bb\5\2\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7\36\2\2"+
		"\u00bf\u00c0\b\n\1\2\u00c0\u00c2\3\2\2\2\u00c1{\3\2\2\2\u00c1\u0080\3"+
		"\2\2\2\u00c1\u0086\3\2\2\2\u00c1\u008e\3\2\2\2\u00c1\u0092\3\2\2\2\u00c1"+
		"\u009d\3\2\2\2\u00c1\u00a4\3\2\2\2\u00c1\u00a7\3\2\2\2\u00c1\u00aa\3\2"+
		"\2\2\u00c1\u00af\3\2\2\2\u00c1\u00b4\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c2"+
		"\u00e3\3\2\2\2\u00c3\u00c4\f\17\2\2\u00c4\u00c5\7\5\2\2\u00c5\u00c6\5"+
		"\22\n\20\u00c6\u00c7\b\n\1\2\u00c7\u00e2\3\2\2\2\u00c8\u00c9\f\b\2\2\u00c9"+
		"\u00ca\7\20\2\2\u00ca\u00cb\5\22\n\t\u00cb\u00cc\b\n\1\2\u00cc\u00e2\3"+
		"\2\2\2\u00cd\u00ce\f\7\2\2\u00ce\u00cf\7\37\2\2\u00cf\u00d0\5\22\n\b\u00d0"+
		"\u00d1\b\n\1\2\u00d1\u00e2\3\2\2\2\u00d2\u00d3\f\6\2\2\u00d3\u00d4\t\2"+
		"\2\2\u00d4\u00d5\5\22\n\7\u00d5\u00d6\b\n\1\2\u00d6\u00e2\3\2\2\2\u00d7"+
		"\u00d8\f\4\2\2\u00d8\u00d9\t\3\2\2\u00d9\u00da\5\22\n\5\u00da\u00db\b"+
		"\n\1\2\u00db\u00e2\3\2\2\2\u00dc\u00dd\f\3\2\2\u00dd\u00de\t\4\2\2\u00de"+
		"\u00df\5\22\n\4\u00df\u00e0\b\n\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00c3\3"+
		"\2\2\2\u00e1\u00c8\3\2\2\2\u00e1\u00cd\3\2\2\2\u00e1\u00d2\3\2\2\2\u00e1"+
		"\u00d7\3\2\2\2\u00e1\u00dc\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2"+
		"\2\2\u00e3\u00e4\3\2\2\2\u00e4\23\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7"+
		"\5\n\6\2\u00e7\u00e8\7\22\2\2\u00e8\u00e9\5\22\n\2\u00e9\u00ea\b\13\1"+
		"\2\u00ea\25\3\2\2\2\u00eb\u00ec\5\24\13\2\u00ec\u00ed\7\27\2\2\u00ed\u00ee"+
		"\5\4\3\2\u00ee\u00ef\b\f\1\2\u00ef\27\3\2\2\2\u00f0\u00f1\5\22\n\2\u00f1"+
		"\u00f2\b\r\1\2\u00f2\31\3\2\2\2\r(.\63>Ppx\u00bc\u00c1\u00e1\u00e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}