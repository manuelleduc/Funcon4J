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
		T__43=1, T__42=2, T__41=3, T__40=4, T__39=5, T__38=6, T__37=7, T__36=8, 
		T__35=9, T__34=10, T__33=11, T__32=12, T__31=13, T__30=14, T__29=15, T__28=16, 
		T__27=17, T__26=18, T__25=19, T__24=20, T__23=21, T__22=22, T__21=23, 
		T__20=24, T__19=25, T__18=26, T__17=27, T__16=28, T__15=29, T__14=30, 
		T__13=31, T__12=32, T__11=33, T__10=34, T__9=35, T__8=36, T__7=37, T__6=38, 
		T__5=39, T__4=40, T__3=41, T__2=42, T__1=43, T__0=44, WS=45, NULLTOKEN=46, 
		EMPTYLISTTOKEN=47, WILDCARDTOKEN=48, BOOLTOKEN=49, NUMTOKEN=50, IDTOKEN=51, 
		CONSTRTOKEN=52;
	public static final String[] tokenNames = {
		"<INVALID>", "'as'", "'of'", "'fun'", "'while'", "'||'", "';'", "'&&'", 
		"'::'", "'='", "'for'", "'if'", "'<='", "'&'", "'print'", "'do'", "'''", 
		"'('", "'*'", "','", "'->'", "'done'", "'to'", "':'", "'>='", "'['", "'<'", 
		"'|'", "'with'", "']'", "'>'", "'or'", "'let'", "'match'", "'else'", "'begin'", 
		"'in'", "'function'", "'end'", "')'", "'downto'", "'and'", "'then'", "'+'", 
		"'not'", "WS", "NULLTOKEN", "EMPTYLISTTOKEN", "'_'", "BOOLTOKEN", "NUMTOKEN", 
		"IDTOKEN", "CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decl = 2, RULE_headtaillistexp = 3, 
		RULE_patt = 4, RULE_ident = 5, RULE_pattlist = 6, RULE_emptylist = 7, 
		RULE_pattmatchsingle = 8, RULE_explist = 9, RULE_type = 10, RULE_headtaillistpatt = 11, 
		RULE_declmono = 12, RULE_letExp = 13, RULE_patttuple = 14, RULE_function = 15, 
		RULE_exp = 16, RULE_decllabelsandvariants = 17, RULE_varianttype = 18, 
		RULE_optionalpattremainder = 19, RULE_pattmatchcurried = 20, RULE_pattmatchmultiple = 21, 
		RULE_prog = 22, RULE_exptuple = 23, RULE_tupletypelist = 24;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decl", "headtaillistexp", "patt", "ident", "pattlist", 
		"emptylist", "pattmatchsingle", "explist", "type", "headtaillistpatt", 
		"declmono", "letExp", "patttuple", "function", "exp", "decllabelsandvariants", 
		"varianttype", "optionalpattremainder", "pattmatchcurried", "pattmatchmultiple", 
		"prog", "exptuple", "tupletypelist"
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
		public PattmatchContext pattmatch_0;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchmultipleContext pattmatchmultiple_0;
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
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); match(27);
				setState(51); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch1((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57); ((PattmatchContext)_localctx).pattmatchmultiple_0 = pattmatchmultiple();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch2((((PattmatchContext)_localctx).pattmatchmultiple_0._pattmatchmultiple));
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
		public EmptylistContext emptylist_0;
		public Token BOOLTOKEN_0;
		public Token NUMTOKEN_0;
		public Token NULLTOKEN_0;
		public TerminalNode NULLTOKEN() { return getToken(CLParser.NULLTOKEN, 0); }
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public TerminalNode BOOLTOKEN() { return getToken(CLParser.BOOLTOKEN, 0); }
		public TerminalNode NUMTOKEN() { return getToken(CLParser.NUMTOKEN, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constant);
		try {
			setState(71);
			switch (_input.LA(1)) {
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(62); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(65); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case NUMTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); ((ConstantContext)_localctx).NUMTOKEN_0 = match(NUMTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(numtoken((((ConstantContext)_localctx).NUMTOKEN_0!=null?((ConstantContext)_localctx).NUMTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(69); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
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

	public static class DeclContext extends ParserRuleContext {
		public Object _decl;
		public DeclmonoContext declmono_0;
		public DeclContext decl_0;
		public DeclContext decl_1;
		public DeclmonoContext declmono() {
			return getRuleContext(DeclmonoContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); match(32);
				setState(77); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(81); match(41);
				setState(82); ((DeclContext)_localctx).decl_1 = decl();
				((DeclContext)_localctx)._decl =  builder.andDecl((((DeclContext)_localctx).declmono_0._declmono),(((DeclContext)_localctx).decl_1._decl));
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

	public static class HeadtaillistexpContext extends ParserRuleContext {
		public Object _headtaillistexp;
		public ExpContext exp_0;
		public HeadtaillistexpContext headtaillistexp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public HeadtaillistexpContext headtaillistexp() {
			return getRuleContext(HeadtaillistexpContext.class,0);
		}
		public HeadtaillistexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headtaillistexp; }
	}

	public final HeadtaillistexpContext headtaillistexp() throws RecognitionException {
		HeadtaillistexpContext _localctx = new HeadtaillistexpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_headtaillistexp);
		try {
			setState(95);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87); ((HeadtaillistexpContext)_localctx).exp_0 = exp(0);
				setState(88); match(8);
				setState(89); ((HeadtaillistexpContext)_localctx).headtaillistexp_1 = headtaillistexp();
				((HeadtaillistexpContext)_localctx)._headtaillistexp =  builder.headTailListExpMulti((((HeadtaillistexpContext)_localctx).exp_0._exp),(((HeadtaillistexpContext)_localctx).headtaillistexp_1._headtaillistexp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92); ((HeadtaillistexpContext)_localctx).exp_0 = exp(0);
				((HeadtaillistexpContext)_localctx)._headtaillistexp =  builder.headTailListExpSingle((((HeadtaillistexpContext)_localctx).exp_0._exp));
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

	public static class PattContext extends ParserRuleContext {
		public Object _patt;
		public PattContext patt_0;
		public HeadtaillistpattContext headtaillistpatt_0;
		public EmptylistContext emptylist_0;
		public PattlistContext pattlist_0;
		public PatttupleContext patttuple;
		public List<PatttupleContext> patttuple_1_list = new ArrayList<PatttupleContext>();
		public IdentContext ident_0;
		public ConstantContext constant_0;
		public OptionalpattremainderContext optionalpattremainder_0;
		public Token WILDCARDTOKEN_0;
		public TypeContext type_1;
		public IdentContext ident_1;
		public PatttupleContext patttuple(int i) {
			return getRuleContext(PatttupleContext.class,i);
		}
		public PattlistContext pattlist() {
			return getRuleContext(PattlistContext.class,0);
		}
		public List<PatttupleContext> patttuple() {
			return getRuleContexts(PatttupleContext.class);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public HeadtaillistpattContext headtaillistpatt() {
			return getRuleContext(HeadtaillistpattContext.class,0);
		}
		public TerminalNode WILDCARDTOKEN() { return getToken(CLParser.WILDCARDTOKEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public OptionalpattremainderContext optionalpattremainder() {
			return getRuleContext(OptionalpattremainderContext.class,0);
		}
		public PattContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patt; }
	}

	public final PattContext patt() throws RecognitionException {
		return patt(0);
	}

	private PattContext patt(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PattContext _localctx = new PattContext(_ctx, _parentState);
		PattContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_patt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(98); match(25);
				setState(99); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(100); match(29);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;

			case 2:
				{
				setState(103); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 3:
				{
				setState(106); match(25);
				setState(107); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(108); match(29);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 4:
				{
				setState(111); match(25);
				setState(112); ((PattContext)_localctx).patt_0 = patt(0);
				setState(113); match(29);
				((PattContext)_localctx)._patt =  builder.singleElementListPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 5:
				{
				setState(116); match(17);
				setState(117); ((PattContext)_localctx).patt_0 = patt(0);
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(118); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(121); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==19 );
				setState(123); match(39);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 6:
				{
				setState(126); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 7:
				{
				setState(129); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 8:
				{
				setState(132); match(17);
				setState(133); ((PattContext)_localctx).optionalpattremainder_0 = optionalpattremainder();
				setState(134); match(39);
				((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).optionalpattremainder_0._optionalpattremainder));
				}
				break;

			case 9:
				{
				setState(137); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 10:
				{
				setState(139); match(17);
				setState(140); ((PattContext)_localctx).patt_0 = patt(0);
				setState(141); match(39);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 11:
				{
				setState(144); match(17);
				setState(145); ((PattContext)_localctx).patt_0 = patt(0);
				setState(146); match(23);
				setState(147); ((PattContext)_localctx).type_1 = type(0);
				setState(148); match(39);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PattContext(_parentctx, _parentState);
					_localctx.patt_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_patt);
					setState(153);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(154); match(1);
					setState(155); ((PattContext)_localctx).ident_1 = ident();
					((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
					}
					} 
				}
				setState(162);
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

	public static class IdentContext extends ParserRuleContext {
		public Object _ident;
		public Token IDTOKEN_0;
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
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
			setState(163); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			((IdentContext)_localctx)._ident =  builder.id(idtoken((((IdentContext)_localctx).IDTOKEN_0!=null?((IdentContext)_localctx).IDTOKEN_0.getText():null)));
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

	public static class PattlistContext extends ParserRuleContext {
		public Object _pattlist;
		public PattContext patt_0;
		public PattlistContext pattlist_1;
		public PattlistContext pattlist() {
			return getRuleContext(PattlistContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public PattlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattlist; }
	}

	public final PattlistContext pattlist() throws RecognitionException {
		PattlistContext _localctx = new PattlistContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pattlist);
		try {
			setState(174);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(167); match(6);
				setState(168); ((PattlistContext)_localctx).pattlist_1 = pattlist();
				((PattlistContext)_localctx)._pattlist =  builder.pattListMulti((((PattlistContext)_localctx).patt_0._patt),(((PattlistContext)_localctx).pattlist_1._pattlist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171); ((PattlistContext)_localctx).patt_0 = patt(0);
				((PattlistContext)_localctx)._pattlist =  builder.pattListSingle((((PattlistContext)_localctx).patt_0._patt));
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

	public static class EmptylistContext extends ParserRuleContext {
		public Object _emptylist;
		public Token EMPTYLISTTOKEN_0;
		public TerminalNode EMPTYLISTTOKEN() { return getToken(CLParser.EMPTYLISTTOKEN, 0); }
		public EmptylistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptylist; }
	}

	public final EmptylistContext emptylist() throws RecognitionException {
		EmptylistContext _localctx = new EmptylistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_emptylist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
			((EmptylistContext)_localctx)._emptylist =  builder.emptyList(emptylisttoken((((EmptylistContext)_localctx).EMPTYLISTTOKEN_0!=null?((EmptylistContext)_localctx).EMPTYLISTTOKEN_0.getText():null)));
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
		enterRule(_localctx, 16, RULE_pattmatchsingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(180); match(20);
			setState(181); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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

	public static class ExplistContext extends ParserRuleContext {
		public Object _explist;
		public ExpContext exp_0;
		public ExplistContext explist_1;
		public ExpContext exp_1;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExplistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explist; }
	}

	public final ExplistContext explist() throws RecognitionException {
		ExplistContext _localctx = new ExplistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_explist);
		try {
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(184); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(185); match(6);
				setState(186); ((ExplistContext)_localctx).explist_1 = explist();
				((ExplistContext)_localctx)._explist =  builder.expListMulti((((ExplistContext)_localctx).exp_0._exp),(((ExplistContext)_localctx).explist_1._explist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(190); match(6);
				setState(191); ((ExplistContext)_localctx).exp_1 = exp(0);
				((ExplistContext)_localctx)._explist =  builder.expListDouble((((ExplistContext)_localctx).exp_0._exp),(((ExplistContext)_localctx).exp_1._exp));
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

	public static class TypeContext extends ParserRuleContext {
		public Object _type;
		public TypeContext type_0;
		public Token IDTOKEN_0;
		public TypeContext type_1;
		public TupletypelistContext tupletypelist;
		public List<TupletypelistContext> tupletypelist_1_list = new ArrayList<TupletypelistContext>();
		public TupletypelistContext tupletypelist(int i) {
			return getRuleContext(TupletypelistContext.class,i);
		}
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public List<TupletypelistContext> tupletypelist() {
			return getRuleContexts(TupletypelistContext.class);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			switch (_input.LA(1)) {
			case IDTOKEN:
				{
				setState(197); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			case 16:
				{
				setState(199); match(16);
				setState(200); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.varType(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			case 17:
				{
				setState(202); match(17);
				setState(203); ((TypeContext)_localctx).type_0 = type(0);
				setState(204); match(39);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(209);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(210); match(20);
						setState(211); ((TypeContext)_localctx).type_1 = type(3);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(214);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(216); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(215); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(218); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.doubleTupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;
					}
					} 
				}
				setState(226);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class HeadtaillistpattContext extends ParserRuleContext {
		public Object _headtaillistpatt;
		public PattContext patt_0;
		public HeadtaillistpattContext headtaillistpatt_1;
		public HeadtaillistpattContext headtaillistpatt() {
			return getRuleContext(HeadtaillistpattContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public HeadtaillistpattContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headtaillistpatt; }
	}

	public final HeadtaillistpattContext headtaillistpatt() throws RecognitionException {
		HeadtaillistpattContext _localctx = new HeadtaillistpattContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_headtaillistpatt);
		try {
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattSingle((((HeadtaillistpattContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(231); match(8);
				setState(232); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
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

	public static class DeclmonoContext extends ParserRuleContext {
		public Object _declmono;
		public PattContext patt_0;
		public ExpContext exp_1;
		public IdentContext ident_0;
		public PattContext patt;
		public List<PattContext> patt_1_list = new ArrayList<PattContext>();
		public ExpContext exp_2;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public DeclmonoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declmono; }
	}

	public final DeclmonoContext declmono() throws RecognitionException {
		DeclmonoContext _localctx = new DeclmonoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declmono);
		int _la;
		try {
			setState(252);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(238); match(9);
				setState(239); ((DeclmonoContext)_localctx).exp_1 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMono((((DeclmonoContext)_localctx).patt_0._patt),(((DeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(242); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(243); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(246); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 25) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN))) != 0) );
				setState(248); match(9);
				setState(249); ((DeclmonoContext)_localctx).exp_2 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMonoFunc((((DeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((DeclmonoContext)_localctx).patt_1_list),(((DeclmonoContext)_localctx).exp_2._exp));
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

	public static class LetExpContext extends ParserRuleContext {
		public Object _letExp;
		public DeclContext decl_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public LetExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letExp; }
	}

	public final LetExpContext letExp() throws RecognitionException {
		LetExpContext _localctx = new LetExpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254); ((LetExpContext)_localctx).decl_0 = decl();
			setState(255); match(36);
			setState(256); ((LetExpContext)_localctx).exp_1 = exp(0);
			((LetExpContext)_localctx)._letExp =  builder.letInExp((((LetExpContext)_localctx).decl_0._decl),(((LetExpContext)_localctx).exp_1._exp));
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
		enterRule(_localctx, 28, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(19);
			setState(260); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
		public IdentContext ident_0;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchcurriedContext pattmatchcurried_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(264); match(37);
				setState(265); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(268); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 3:
				{
				setState(271); match(35);
				setState(272); ((FunctionContext)_localctx).function_0 = function(0);
				setState(273); match(38);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 4:
				{
				setState(276); match(17);
				setState(277); ((FunctionContext)_localctx).function_0 = function(0);
				setState(278); match(39);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(281); match(3);
				setState(282); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(285); match(3);
				setState(286); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(291);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(292); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		public ConstantContext constant_0;
		public TypeContext type_1;
		public ExptupleContext exptuple;
		public List<ExptupleContext> exptuple_1_list = new ArrayList<ExptupleContext>();
		public ExplistContext explist_0;
		public HeadtaillistexpContext headtaillistexp_0;
		public ExpContext exp_3;
		public PattmatchContext pattmatch_1;
		public FunctionContext function_0;
		public LetExpContext letExp_0;
		public Token op_1508;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExptupleContext exptuple(int i) {
			return getRuleContext(ExptupleContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public LetExpContext letExp() {
			return getRuleContext(LetExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExptupleContext> exptuple() {
			return getRuleContexts(ExptupleContext.class);
		}
		public HeadtaillistexpContext headtaillistexp() {
			return getRuleContext(HeadtaillistexpContext.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(301); match(14);
				setState(302); ((ExpContext)_localctx).exp_0 = exp(25);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(305); match(44);
				setState(306); ((ExpContext)_localctx).exp_0 = exp(15);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 3:
				{
				setState(309); match(11);
				setState(310); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(311); match(42);
				setState(312); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(313); match(34);
				setState(314); ((ExpContext)_localctx).exp_2 = exp(9);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 4:
				{
				setState(317); match(11);
				setState(318); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(319); match(42);
				setState(320); ((ExpContext)_localctx).exp_1 = exp(8);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 5:
				{
				setState(323); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 6:
				{
				setState(326); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 7:
				{
				setState(329); match(17);
				setState(330); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(331); match(39);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 8:
				{
				setState(334); match(35);
				setState(335); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(336); match(38);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 9:
				{
				setState(339); match(17);
				setState(340); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(341); match(23);
				setState(342); ((ExpContext)_localctx).type_1 = type(0);
				setState(343); match(39);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 10:
				{
				setState(346); match(17);
				setState(347); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(349); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(348); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(351); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==19 );
				setState(353); match(39);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;

			case 11:
				{
				setState(356); match(25);
				setState(357); ((ExpContext)_localctx).explist_0 = explist();
				setState(358); match(29);
				((ExpContext)_localctx)._exp =  builder.expList((((ExpContext)_localctx).explist_0._explist));
				}
				break;

			case 12:
				{
				setState(361); match(25);
				setState(362); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(363); match(29);
				((ExpContext)_localctx)._exp =  builder.singleElementListExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(366); match(25);
				setState(367); ((ExpContext)_localctx).headtaillistexp_0 = headtaillistexp();
				setState(368); match(29);
				((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).headtaillistexp_0._headtaillistexp));
				}
				break;

			case 14:
				{
				setState(371); match(4);
				setState(372); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(373); match(15);
				setState(374); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(375); match(21);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 15:
				{
				setState(378); match(10);
				setState(379); ((ExpContext)_localctx).ident_0 = ident();
				setState(380); match(9);
				setState(381); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(382); match(40);
				setState(383); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(384); match(15);
				setState(385); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(386); match(21);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 16:
				{
				setState(389); match(10);
				setState(390); ((ExpContext)_localctx).ident_0 = ident();
				setState(391); match(9);
				setState(392); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(393); match(22);
				setState(394); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(395); match(15);
				setState(396); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(397); match(21);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 17:
				{
				setState(400); match(33);
				setState(401); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(402); match(28);
				setState(403); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 18:
				{
				setState(406); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 19:
				{
				setState(409); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(444);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(414);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(415); match(18);
						setState(416); ((ExpContext)_localctx).exp_1 = exp(15);
						((ExpContext)_localctx)._exp =  builder.intMultiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(419);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(420); match(43);
						setState(421); ((ExpContext)_localctx).exp_1 = exp(14);
						((ExpContext)_localctx)._exp =  builder.intAdd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(424);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(425);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 12) | (1L << 24) | (1L << 26) | (1L << 30))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(426); ((ExpContext)_localctx).exp_1 = exp(13);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(429);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(430);
						_la = _input.LA(1);
						if ( !(_la==7 || _la==13) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(431); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(434);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(435);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==31) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(436); ((ExpContext)_localctx).exp_1 = exp(11);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(439);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(440); match(6);
						setState(441); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public static class DecllabelsandvariantsContext extends ParserRuleContext {
		public Object _decllabelsandvariants;
		public IdentContext ident_0;
		public Token IDTOKEN_1;
		public TypeContext type_2;
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DecllabelsandvariantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decllabelsandvariants; }
	}

	public final DecllabelsandvariantsContext decllabelsandvariants() throws RecognitionException {
		DecllabelsandvariantsContext _localctx = new DecllabelsandvariantsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_decllabelsandvariants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); ((DecllabelsandvariantsContext)_localctx).ident_0 = ident();
			setState(450); match(9);
			setState(451); ((DecllabelsandvariantsContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
			setState(452); match(2);
			setState(453); ((DecllabelsandvariantsContext)_localctx).type_2 = type(0);
			((DecllabelsandvariantsContext)_localctx)._decllabelsandvariants =  builder.declLabelsAndVariantsDecl((((DecllabelsandvariantsContext)_localctx).ident_0._ident),idtoken((((DecllabelsandvariantsContext)_localctx).IDTOKEN_1!=null?((DecllabelsandvariantsContext)_localctx).IDTOKEN_1.getText():null)),(((DecllabelsandvariantsContext)_localctx).type_2._type));
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

	public static class VarianttypeContext extends ParserRuleContext {
		public Object _varianttype;
		public Token CONSTRTOKEN_0;
		public TypeContext type_1;
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarianttypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varianttype; }
	}

	public final VarianttypeContext varianttype() throws RecognitionException {
		VarianttypeContext _localctx = new VarianttypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_varianttype);
		try {
			setState(463);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(457); match(2);
				setState(458); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)));
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

	public static class OptionalpattremainderContext extends ParserRuleContext {
		public Object _optionalpattremainder;
		public PattContext patt_0;
		public OptionalpattremainderContext optionalpattremainder_1;
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public OptionalpattremainderContext optionalpattremainder() {
			return getRuleContext(OptionalpattremainderContext.class,0);
		}
		public OptionalpattremainderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalpattremainder; }
	}

	public final OptionalpattremainderContext optionalpattremainder() throws RecognitionException {
		OptionalpattremainderContext _localctx = new OptionalpattremainderContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_optionalpattremainder);
		try {
			setState(473);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465); ((OptionalpattremainderContext)_localctx).patt_0 = patt(0);
				((OptionalpattremainderContext)_localctx)._optionalpattremainder =  builder.optionalPattRemainderSingle((((OptionalpattremainderContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468); ((OptionalpattremainderContext)_localctx).patt_0 = patt(0);
				setState(469); match(27);
				setState(470); ((OptionalpattremainderContext)_localctx).optionalpattremainder_1 = optionalpattremainder();
				((OptionalpattremainderContext)_localctx)._optionalpattremainder =  builder.optionalPattRemainderMulti((((OptionalpattremainderContext)_localctx).patt_0._patt),(((OptionalpattremainderContext)_localctx).optionalpattremainder_1._optionalpattremainder));
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
		enterRule(_localctx, 40, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(475); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(478); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 25) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN))) != 0) );
			setState(480); match(20);
			setState(481); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 42, RULE_pattmatchmultiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484); ((PattmatchmultipleContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
			setState(485); match(27);
			setState(486); ((PattmatchmultipleContext)_localctx).pattmatch_1 = pattmatch();
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
		enterRule(_localctx, 44, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489); ((ProgContext)_localctx).exp_0 = exp(0);
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
		enterRule(_localctx, 46, RULE_exptuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492); match(19);
			setState(493); ((ExptupleContext)_localctx).exp_0 = exp(0);
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

	public static class TupletypelistContext extends ParserRuleContext {
		public Object _tupletypelist;
		public TypeContext type_0;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TupletypelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupletypelist; }
	}

	public final TupletypelistContext tupletypelist() throws RecognitionException {
		TupletypelistContext _localctx = new TupletypelistContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tupletypelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496); match(18);
			setState(497); ((TupletypelistContext)_localctx).type_0 = type(0);
			((TupletypelistContext)_localctx)._tupletypelist =  builder.tupleTypeSingle((((TupletypelistContext)_localctx).type_0._type));
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
		case 4: return patt_sempred((PattContext)_localctx, predIndex);

		case 10: return type_sempred((TypeContext)_localctx, predIndex);

		case 15: return function_sempred((FunctionContext)_localctx, predIndex);

		case 16: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean patt_sempred(PattContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 2);

		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 14);

		case 5: return precpred(_ctx, 13);

		case 6: return precpred(_ctx, 12);

		case 7: return precpred(_ctx, 11);

		case 8: return precpred(_ctx, 10);

		case 9: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\66\u01f7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2?\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3J\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4X\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5b\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\6\6z\n\6\r\6\16\6{\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u009a\n\6\3\6\3\6\3\6\3\6\3\6\7\6\u00a1\n\6\f\6\16\6\u00a4\13"+
		"\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b1\n\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00c5\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00d2"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00db\n\f\r\f\16\f\u00dc\3\f\3\f"+
		"\7\f\u00e1\n\f\f\f\16\f\u00e4\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r"+
		"\u00ee\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u00f7\n\16\r\16\16"+
		"\16\u00f8\3\16\3\16\3\16\3\16\5\16\u00ff\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u0124\n\21\3\21\3\21\3\21\3\21\7\21\u012a\n\21\f\21\16"+
		"\21\u012d\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u0160\n\22\r\22"+
		"\16\22\u0161\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\5\22\u019f\n\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01bf\n\22"+
		"\f\22\16\22\u01c2\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\5\24\u01d2\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u01dc\n\25\3\26\6\26\u01df\n\26\r\26\16\26\u01e0\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\2\6\n\26 \"\33\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\2\5\7\2\13\13\16\16\32\32\34\34  \4\2\t"+
		"\t\17\17\4\2\7\7!!\u021d\2>\3\2\2\2\4I\3\2\2\2\6W\3\2\2\2\ba\3\2\2\2\n"+
		"\u0099\3\2\2\2\f\u00a5\3\2\2\2\16\u00b0\3\2\2\2\20\u00b2\3\2\2\2\22\u00b5"+
		"\3\2\2\2\24\u00c4\3\2\2\2\26\u00d1\3\2\2\2\30\u00ed\3\2\2\2\32\u00fe\3"+
		"\2\2\2\34\u0100\3\2\2\2\36\u0105\3\2\2\2 \u0123\3\2\2\2\"\u019e\3\2\2"+
		"\2$\u01c3\3\2\2\2&\u01d1\3\2\2\2(\u01db\3\2\2\2*\u01de\3\2\2\2,\u01e6"+
		"\3\2\2\2.\u01eb\3\2\2\2\60\u01ee\3\2\2\2\62\u01f2\3\2\2\2\64\65\7\35\2"+
		"\2\65\66\5\2\2\2\66\67\b\2\1\2\67?\3\2\2\289\5\22\n\29:\b\2\1\2:?\3\2"+
		"\2\2;<\5,\27\2<=\b\2\1\2=?\3\2\2\2>\64\3\2\2\2>8\3\2\2\2>;\3\2\2\2?\3"+
		"\3\2\2\2@A\5\20\t\2AB\b\3\1\2BJ\3\2\2\2CD\7\63\2\2DJ\b\3\1\2EF\7\64\2"+
		"\2FJ\b\3\1\2GH\7\60\2\2HJ\b\3\1\2I@\3\2\2\2IC\3\2\2\2IE\3\2\2\2IG\3\2"+
		"\2\2J\5\3\2\2\2KL\5\32\16\2LM\b\4\1\2MX\3\2\2\2NO\7\"\2\2OP\5\6\4\2PQ"+
		"\b\4\1\2QX\3\2\2\2RS\5\32\16\2ST\7+\2\2TU\5\6\4\2UV\b\4\1\2VX\3\2\2\2"+
		"WK\3\2\2\2WN\3\2\2\2WR\3\2\2\2X\7\3\2\2\2YZ\5\"\22\2Z[\7\n\2\2[\\\5\b"+
		"\5\2\\]\b\5\1\2]b\3\2\2\2^_\5\"\22\2_`\b\5\1\2`b\3\2\2\2aY\3\2\2\2a^\3"+
		"\2\2\2b\t\3\2\2\2cd\b\6\1\2de\7\33\2\2ef\5\30\r\2fg\7\37\2\2gh\b\6\1\2"+
		"h\u009a\3\2\2\2ij\5\20\t\2jk\b\6\1\2k\u009a\3\2\2\2lm\7\33\2\2mn\5\16"+
		"\b\2no\7\37\2\2op\b\6\1\2p\u009a\3\2\2\2qr\7\33\2\2rs\5\n\6\2st\7\37\2"+
		"\2tu\b\6\1\2u\u009a\3\2\2\2vw\7\23\2\2wy\5\n\6\2xz\5\36\20\2yx\3\2\2\2"+
		"z{\3\2\2\2{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7)\2\2~\177\b\6\1\2\177\u009a"+
		"\3\2\2\2\u0080\u0081\5\f\7\2\u0081\u0082\b\6\1\2\u0082\u009a\3\2\2\2\u0083"+
		"\u0084\5\4\3\2\u0084\u0085\b\6\1\2\u0085\u009a\3\2\2\2\u0086\u0087\7\23"+
		"\2\2\u0087\u0088\5(\25\2\u0088\u0089\7)\2\2\u0089\u008a\b\6\1\2\u008a"+
		"\u009a\3\2\2\2\u008b\u008c\7\62\2\2\u008c\u009a\b\6\1\2\u008d\u008e\7"+
		"\23\2\2\u008e\u008f\5\n\6\2\u008f\u0090\7)\2\2\u0090\u0091\b\6\1\2\u0091"+
		"\u009a\3\2\2\2\u0092\u0093\7\23\2\2\u0093\u0094\5\n\6\2\u0094\u0095\7"+
		"\31\2\2\u0095\u0096\5\26\f\2\u0096\u0097\7)\2\2\u0097\u0098\b\6\1\2\u0098"+
		"\u009a\3\2\2\2\u0099c\3\2\2\2\u0099i\3\2\2\2\u0099l\3\2\2\2\u0099q\3\2"+
		"\2\2\u0099v\3\2\2\2\u0099\u0080\3\2\2\2\u0099\u0083\3\2\2\2\u0099\u0086"+
		"\3\2\2\2\u0099\u008b\3\2\2\2\u0099\u008d\3\2\2\2\u0099\u0092\3\2\2\2\u009a"+
		"\u00a2\3\2\2\2\u009b\u009c\f\5\2\2\u009c\u009d\7\3\2\2\u009d\u009e\5\f"+
		"\7\2\u009e\u009f\b\6\1\2\u009f\u00a1\3\2\2\2\u00a0\u009b\3\2\2\2\u00a1"+
		"\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\13\3\2\2"+
		"\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\65\2\2\u00a6\u00a7\b\7\1\2\u00a7"+
		"\r\3\2\2\2\u00a8\u00a9\5\n\6\2\u00a9\u00aa\7\b\2\2\u00aa\u00ab\5\16\b"+
		"\2\u00ab\u00ac\b\b\1\2\u00ac\u00b1\3\2\2\2\u00ad\u00ae\5\n\6\2\u00ae\u00af"+
		"\b\b\1\2\u00af\u00b1\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1"+
		"\17\3\2\2\2\u00b2\u00b3\7\61\2\2\u00b3\u00b4\b\t\1\2\u00b4\21\3\2\2\2"+
		"\u00b5\u00b6\5\n\6\2\u00b6\u00b7\7\26\2\2\u00b7\u00b8\5\"\22\2\u00b8\u00b9"+
		"\b\n\1\2\u00b9\23\3\2\2\2\u00ba\u00bb\5\"\22\2\u00bb\u00bc\7\b\2\2\u00bc"+
		"\u00bd\5\24\13\2\u00bd\u00be\b\13\1\2\u00be\u00c5\3\2\2\2\u00bf\u00c0"+
		"\5\"\22\2\u00c0\u00c1\7\b\2\2\u00c1\u00c2\5\"\22\2\u00c2\u00c3\b\13\1"+
		"\2\u00c3\u00c5\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c5\25"+
		"\3\2\2\2\u00c6\u00c7\b\f\1\2\u00c7\u00c8\7\65\2\2\u00c8\u00d2\b\f\1\2"+
		"\u00c9\u00ca\7\22\2\2\u00ca\u00cb\7\65\2\2\u00cb\u00d2\b\f\1\2\u00cc\u00cd"+
		"\7\23\2\2\u00cd\u00ce\5\26\f\2\u00ce\u00cf\7)\2\2\u00cf\u00d0\b\f\1\2"+
		"\u00d0\u00d2\3\2\2\2\u00d1\u00c6\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00cc"+
		"\3\2\2\2\u00d2\u00e2\3\2\2\2\u00d3\u00d4\f\4\2\2\u00d4\u00d5\7\26\2\2"+
		"\u00d5\u00d6\5\26\f\5\u00d6\u00d7\b\f\1\2\u00d7\u00e1\3\2\2\2\u00d8\u00da"+
		"\f\3\2\2\u00d9\u00db\5\62\32\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2"+
		"\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df"+
		"\b\f\1\2\u00df\u00e1\3\2\2\2\u00e0\u00d3\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e1"+
		"\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\27\3\2\2"+
		"\2\u00e4\u00e2\3\2\2\2\u00e5\u00e6\5\n\6\2\u00e6\u00e7\b\r\1\2\u00e7\u00ee"+
		"\3\2\2\2\u00e8\u00e9\5\n\6\2\u00e9\u00ea\7\n\2\2\u00ea\u00eb\5\30\r\2"+
		"\u00eb\u00ec\b\r\1\2\u00ec\u00ee\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00e8"+
		"\3\2\2\2\u00ee\31\3\2\2\2\u00ef\u00f0\5\n\6\2\u00f0\u00f1\7\13\2\2\u00f1"+
		"\u00f2\5\"\22\2\u00f2\u00f3\b\16\1\2\u00f3\u00ff\3\2\2\2\u00f4\u00f6\5"+
		"\f\7\2\u00f5\u00f7\5\n\6\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\7\13"+
		"\2\2\u00fb\u00fc\5\"\22\2\u00fc\u00fd\b\16\1\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00ef\3\2\2\2\u00fe\u00f4\3\2\2\2\u00ff\33\3\2\2\2\u0100\u0101\5\6\4"+
		"\2\u0101\u0102\7&\2\2\u0102\u0103\5\"\22\2\u0103\u0104\b\17\1\2\u0104"+
		"\35\3\2\2\2\u0105\u0106\7\25\2\2\u0106\u0107\5\n\6\2\u0107\u0108\b\20"+
		"\1\2\u0108\37\3\2\2\2\u0109\u010a\b\21\1\2\u010a\u010b\7\'\2\2\u010b\u010c"+
		"\5\2\2\2\u010c\u010d\b\21\1\2\u010d\u0124\3\2\2\2\u010e\u010f\5\f\7\2"+
		"\u010f\u0110\b\21\1\2\u0110\u0124\3\2\2\2\u0111\u0112\7%\2\2\u0112\u0113"+
		"\5 \21\2\u0113\u0114\7(\2\2\u0114\u0115\b\21\1\2\u0115\u0124\3\2\2\2\u0116"+
		"\u0117\7\23\2\2\u0117\u0118\5 \21\2\u0118\u0119\7)\2\2\u0119\u011a\b\21"+
		"\1\2\u011a\u0124\3\2\2\2\u011b\u011c\7\5\2\2\u011c\u011d\5\22\n\2\u011d"+
		"\u011e\b\21\1\2\u011e\u0124\3\2\2\2\u011f\u0120\7\5\2\2\u0120\u0121\5"+
		"*\26\2\u0121\u0122\b\21\1\2\u0122\u0124\3\2\2\2\u0123\u0109\3\2\2\2\u0123"+
		"\u010e\3\2\2\2\u0123\u0111\3\2\2\2\u0123\u0116\3\2\2\2\u0123\u011b\3\2"+
		"\2\2\u0123\u011f\3\2\2\2\u0124\u012b\3\2\2\2\u0125\u0126\f\6\2\2\u0126"+
		"\u0127\5\"\22\2\u0127\u0128\b\21\1\2\u0128\u012a\3\2\2\2\u0129\u0125\3"+
		"\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"!\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\b\22\1\2\u012f\u0130\7\20\2"+
		"\2\u0130\u0131\5\"\22\33\u0131\u0132\b\22\1\2\u0132\u019f\3\2\2\2\u0133"+
		"\u0134\7.\2\2\u0134\u0135\5\"\22\21\u0135\u0136\b\22\1\2\u0136\u019f\3"+
		"\2\2\2\u0137\u0138\7\r\2\2\u0138\u0139\5\"\22\2\u0139\u013a\7,\2\2\u013a"+
		"\u013b\5\"\22\2\u013b\u013c\7$\2\2\u013c\u013d\5\"\22\13\u013d\u013e\b"+
		"\22\1\2\u013e\u019f\3\2\2\2\u013f\u0140\7\r\2\2\u0140\u0141\5\"\22\2\u0141"+
		"\u0142\7,\2\2\u0142\u0143\5\"\22\n\u0143\u0144\b\22\1\2\u0144\u019f\3"+
		"\2\2\2\u0145\u0146\5\f\7\2\u0146\u0147\b\22\1\2\u0147\u019f\3\2\2\2\u0148"+
		"\u0149\5\4\3\2\u0149\u014a\b\22\1\2\u014a\u019f\3\2\2\2\u014b\u014c\7"+
		"\23\2\2\u014c\u014d\5\"\22\2\u014d\u014e\7)\2\2\u014e\u014f\b\22\1\2\u014f"+
		"\u019f\3\2\2\2\u0150\u0151\7%\2\2\u0151\u0152\5\"\22\2\u0152\u0153\7("+
		"\2\2\u0153\u0154\b\22\1\2\u0154\u019f\3\2\2\2\u0155\u0156\7\23\2\2\u0156"+
		"\u0157\5\"\22\2\u0157\u0158\7\31\2\2\u0158\u0159\5\26\f\2\u0159\u015a"+
		"\7)\2\2\u015a\u015b\b\22\1\2\u015b\u019f\3\2\2\2\u015c\u015d\7\23\2\2"+
		"\u015d\u015f\5\"\22\2\u015e\u0160\5\60\31\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0161\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\u0164\7)\2\2\u0164\u0165\b\22\1\2\u0165\u019f\3\2\2\2\u0166"+
		"\u0167\7\33\2\2\u0167\u0168\5\24\13\2\u0168\u0169\7\37\2\2\u0169\u016a"+
		"\b\22\1\2\u016a\u019f\3\2\2\2\u016b\u016c\7\33\2\2\u016c\u016d\5\"\22"+
		"\2\u016d\u016e\7\37\2\2\u016e\u016f\b\22\1\2\u016f\u019f\3\2\2\2\u0170"+
		"\u0171\7\33\2\2\u0171\u0172\5\b\5\2\u0172\u0173\7\37\2\2\u0173\u0174\b"+
		"\22\1\2\u0174\u019f\3\2\2\2\u0175\u0176\7\6\2\2\u0176\u0177\5\"\22\2\u0177"+
		"\u0178\7\21\2\2\u0178\u0179\5\"\22\2\u0179\u017a\7\27\2\2\u017a\u017b"+
		"\b\22\1\2\u017b\u019f\3\2\2\2\u017c\u017d\7\f\2\2\u017d\u017e\5\f\7\2"+
		"\u017e\u017f\7\13\2\2\u017f\u0180\5\"\22\2\u0180\u0181\7*\2\2\u0181\u0182"+
		"\5\"\22\2\u0182\u0183\7\21\2\2\u0183\u0184\5\"\22\2\u0184\u0185\7\27\2"+
		"\2\u0185\u0186\b\22\1\2\u0186\u019f\3\2\2\2\u0187\u0188\7\f\2\2\u0188"+
		"\u0189\5\f\7\2\u0189\u018a\7\13\2\2\u018a\u018b\5\"\22\2\u018b\u018c\7"+
		"\30\2\2\u018c\u018d\5\"\22\2\u018d\u018e\7\21\2\2\u018e\u018f\5\"\22\2"+
		"\u018f\u0190\7\27\2\2\u0190\u0191\b\22\1\2\u0191\u019f\3\2\2\2\u0192\u0193"+
		"\7#\2\2\u0193\u0194\5\"\22\2\u0194\u0195\7\36\2\2\u0195\u0196\5\2\2\2"+
		"\u0196\u0197\b\22\1\2\u0197\u019f\3\2\2\2\u0198\u0199\5 \21\2\u0199\u019a"+
		"\b\22\1\2\u019a\u019f\3\2\2\2\u019b\u019c\5\34\17\2\u019c\u019d\b\22\1"+
		"\2\u019d\u019f\3\2\2\2\u019e\u012e\3\2\2\2\u019e\u0133\3\2\2\2\u019e\u0137"+
		"\3\2\2\2\u019e\u013f\3\2\2\2\u019e\u0145\3\2\2\2\u019e\u0148\3\2\2\2\u019e"+
		"\u014b\3\2\2\2\u019e\u0150\3\2\2\2\u019e\u0155\3\2\2\2\u019e\u015c\3\2"+
		"\2\2\u019e\u0166\3\2\2\2\u019e\u016b\3\2\2\2\u019e\u0170\3\2\2\2\u019e"+
		"\u0175\3\2\2\2\u019e\u017c\3\2\2\2\u019e\u0187\3\2\2\2\u019e\u0192\3\2"+
		"\2\2\u019e\u0198\3\2\2\2\u019e\u019b\3\2\2\2\u019f\u01c0\3\2\2\2\u01a0"+
		"\u01a1\f\20\2\2\u01a1\u01a2\7\24\2\2\u01a2\u01a3\5\"\22\21\u01a3\u01a4"+
		"\b\22\1\2\u01a4\u01bf\3\2\2\2\u01a5\u01a6\f\17\2\2\u01a6\u01a7\7-\2\2"+
		"\u01a7\u01a8\5\"\22\20\u01a8\u01a9\b\22\1\2\u01a9\u01bf\3\2\2\2\u01aa"+
		"\u01ab\f\16\2\2\u01ab\u01ac\t\2\2\2\u01ac\u01ad\5\"\22\17\u01ad\u01ae"+
		"\b\22\1\2\u01ae\u01bf\3\2\2\2\u01af\u01b0\f\r\2\2\u01b0\u01b1\t\3\2\2"+
		"\u01b1\u01b2\5\"\22\16\u01b2\u01b3\b\22\1\2\u01b3\u01bf\3\2\2\2\u01b4"+
		"\u01b5\f\f\2\2\u01b5\u01b6\t\4\2\2\u01b6\u01b7\5\"\22\r\u01b7\u01b8\b"+
		"\22\1\2\u01b8\u01bf\3\2\2\2\u01b9\u01ba\f\6\2\2\u01ba\u01bb\7\b\2\2\u01bb"+
		"\u01bc\5\"\22\7\u01bc\u01bd\b\22\1\2\u01bd\u01bf\3\2\2\2\u01be\u01a0\3"+
		"\2\2\2\u01be\u01a5\3\2\2\2\u01be\u01aa\3\2\2\2\u01be\u01af\3\2\2\2\u01be"+
		"\u01b4\3\2\2\2\u01be\u01b9\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1#\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01c4"+
		"\5\f\7\2\u01c4\u01c5\7\13\2\2\u01c5\u01c6\7\65\2\2\u01c6\u01c7\7\4\2\2"+
		"\u01c7\u01c8\5\26\f\2\u01c8\u01c9\b\23\1\2\u01c9%\3\2\2\2\u01ca\u01cb"+
		"\7\66\2\2\u01cb\u01cc\7\4\2\2\u01cc\u01cd\5\26\f\2\u01cd\u01ce\b\24\1"+
		"\2\u01ce\u01d2\3\2\2\2\u01cf\u01d0\7\66\2\2\u01d0\u01d2\b\24\1\2\u01d1"+
		"\u01ca\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d2\'\3\2\2\2\u01d3\u01d4\5\n\6\2"+
		"\u01d4\u01d5\b\25\1\2\u01d5\u01dc\3\2\2\2\u01d6\u01d7\5\n\6\2\u01d7\u01d8"+
		"\7\35\2\2\u01d8\u01d9\5(\25\2\u01d9\u01da\b\25\1\2\u01da\u01dc\3\2\2\2"+
		"\u01db\u01d3\3\2\2\2\u01db\u01d6\3\2\2\2\u01dc)\3\2\2\2\u01dd\u01df\5"+
		"\n\6\2\u01de\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0"+
		"\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\7\26\2\2\u01e3\u01e4\5"+
		"\"\22\2\u01e4\u01e5\b\26\1\2\u01e5+\3\2\2\2\u01e6\u01e7\5\22\n\2\u01e7"+
		"\u01e8\7\35\2\2\u01e8\u01e9\5\2\2\2\u01e9\u01ea\b\27\1\2\u01ea-\3\2\2"+
		"\2\u01eb\u01ec\5\"\22\2\u01ec\u01ed\b\30\1\2\u01ed/\3\2\2\2\u01ee\u01ef"+
		"\7\25\2\2\u01ef\u01f0\5\"\22\2\u01f0\u01f1\b\31\1\2\u01f1\61\3\2\2\2\u01f2"+
		"\u01f3\7\24\2\2\u01f3\u01f4\5\26\f\2\u01f4\u01f5\b\32\1\2\u01f5\63\3\2"+
		"\2\2\33>IWa{\u0099\u00a2\u00b0\u00c4\u00d1\u00dc\u00e0\u00e2\u00ed\u00f8"+
		"\u00fe\u0123\u012b\u0161\u019e\u01be\u01c0\u01d1\u01db\u01e0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}