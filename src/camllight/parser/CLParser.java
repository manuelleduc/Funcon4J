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
		T__45=1, T__44=2, T__43=3, T__42=4, T__41=5, T__40=6, T__39=7, T__38=8, 
		T__37=9, T__36=10, T__35=11, T__34=12, T__33=13, T__32=14, T__31=15, T__30=16, 
		T__29=17, T__28=18, T__27=19, T__26=20, T__25=21, T__24=22, T__23=23, 
		T__22=24, T__21=25, T__20=26, T__19=27, T__18=28, T__17=29, T__16=30, 
		T__15=31, T__14=32, T__13=33, T__12=34, T__11=35, T__10=36, T__9=37, T__8=38, 
		T__7=39, T__6=40, T__5=41, T__4=42, T__3=43, T__2=44, T__1=45, T__0=46, 
		WS=47, NULLTOKEN=48, EMPTYLISTTOKEN=49, WILDCARDTOKEN=50, BOOLTOKEN=51, 
		NUMTOKEN=52, IDTOKEN=53, CONSTRTOKEN=54;
	public static final String[] tokenNames = {
		"<INVALID>", "'as'", "'of'", "'fun'", "'while'", "'||'", "';'", "'&&'", 
		"'::'", "'='", "'for'", "'if'", "'<='", "'&'", "'print'", "'do'", "'''", 
		"'('", "'*'", "'rec'", "','", "'->'", "'done'", "'to'", "':'", "'>='", 
		"'['", "'<'", "';;'", "'|'", "'with'", "']'", "'>'", "'or'", "'let'", 
		"'match'", "'else'", "'begin'", "'in'", "'function'", "'end'", "')'", 
		"'downto'", "'and'", "'then'", "'+'", "'not'", "WS", "NULLTOKEN", "EMPTYLISTTOKEN", 
		"'_'", "BOOLTOKEN", "NUMTOKEN", "IDTOKEN", "CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decl = 2, RULE_headtaillistexp = 3, 
		RULE_patt = 4, RULE_ident = 5, RULE_declorexp = 6, RULE_pattlist = 7, 
		RULE_emptylist = 8, RULE_pattmatchsingle = 9, RULE_explist = 10, RULE_type = 11, 
		RULE_headtaillistpatt = 12, RULE_declmono = 13, RULE_letExp = 14, RULE_patttuple = 15, 
		RULE_declimpl = 16, RULE_function = 17, RULE_recanddecl = 18, RULE_exp = 19, 
		RULE_decllabelsandvariants = 20, RULE_anddecl = 21, RULE_varianttype = 22, 
		RULE_optionalpattremainder = 23, RULE_pattmatchcurried = 24, RULE_pattmatchmultiple = 25, 
		RULE_prog = 26, RULE_exptuple = 27, RULE_tupletypelist = 28, RULE_recdeclmono = 29, 
		RULE_recdecl = 30;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decl", "headtaillistexp", "patt", "ident", "declorexp", 
		"pattlist", "emptylist", "pattmatchsingle", "explist", "type", "headtaillistpatt", 
		"declmono", "letExp", "patttuple", "declimpl", "function", "recanddecl", 
		"exp", "decllabelsandvariants", "anddecl", "varianttype", "optionalpattremainder", 
		"pattmatchcurried", "pattmatchmultiple", "prog", "exptuple", "tupletypelist", 
		"recdeclmono", "recdecl"
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
		public PattmatchmultipleContext pattmatchmultiple_0;
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
			setState(72);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62); match(29);
				setState(63); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); ((PattmatchContext)_localctx).pattmatchmultiple_0 = pattmatchmultiple();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch2((((PattmatchContext)_localctx).pattmatchmultiple_0._pattmatchmultiple));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(69); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
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
		public Token NULLTOKEN_0;
		public Token NUMTOKEN_0;
		public Token BOOLTOKEN_0;
		public EmptylistContext emptylist_0;
		public TerminalNode NULLTOKEN() { return getToken(CLParser.NULLTOKEN, 0); }
		public TerminalNode BOOLTOKEN() { return getToken(CLParser.BOOLTOKEN, 0); }
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
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
			setState(83);
			switch (_input.LA(1)) {
			case NULLTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(74); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case NUMTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); ((ConstantContext)_localctx).NUMTOKEN_0 = match(NUMTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(numtoken((((ConstantContext)_localctx).NUMTOKEN_0!=null?((ConstantContext)_localctx).NUMTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(80); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
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
		public RecdeclContext recdecl_0;
		public DeclmonoContext declmono_0;
		public DeclContext decl_0;
		public AnddeclContext anddecl;
		public List<AnddeclContext> anddecl_1_list = new ArrayList<AnddeclContext>();
		public AnddeclContext anddecl(int i) {
			return getRuleContext(AnddeclContext.class,i);
		}
		public DeclmonoContext declmono() {
			return getRuleContext(DeclmonoContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public List<AnddeclContext> anddecl() {
			return getRuleContexts(AnddeclContext.class);
		}
		public RecdeclContext recdecl() {
			return getRuleContext(RecdeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		int _la;
		try {
			setState(105);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); match(34);
				setState(86); match(19);
				setState(87); ((DeclContext)_localctx).recdecl_0 = recdecl();
				((DeclContext)_localctx)._decl =  builder.declRec((((DeclContext)_localctx).recdecl_0._recdecl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93); match(34);
				setState(94); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(97); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(98); ((DeclContext)_localctx).anddecl = anddecl();
					((DeclContext)_localctx).anddecl_1_list.add(((DeclContext)_localctx).anddecl);
					}
					}
					setState(101); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==43 );
				((DeclContext)_localctx)._decl =  builder.andDecl((((DeclContext)_localctx).declmono_0._declmono),lift("_anddecl", ((DeclContext)_localctx).anddecl_1_list));
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
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107); ((HeadtaillistexpContext)_localctx).exp_0 = exp(0);
				((HeadtaillistexpContext)_localctx)._headtaillistexp =  builder.headTailListExpSingle((((HeadtaillistexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); ((HeadtaillistexpContext)_localctx).exp_0 = exp(0);
				setState(111); match(8);
				setState(112); ((HeadtaillistexpContext)_localctx).headtaillistexp_1 = headtaillistexp();
				((HeadtaillistexpContext)_localctx)._headtaillistexp =  builder.headTailListExpMulti((((HeadtaillistexpContext)_localctx).exp_0._exp),(((HeadtaillistexpContext)_localctx).headtaillistexp_1._headtaillistexp));
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
		public PattlistContext pattlist_0;
		public EmptylistContext emptylist_0;
		public HeadtaillistpattContext headtaillistpatt_0;
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
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(118); match(26);
				setState(119); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(120); match(31);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 2:
				{
				setState(123); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 3:
				{
				setState(126); match(26);
				setState(127); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(128); match(31);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;

			case 4:
				{
				setState(131); match(26);
				setState(132); ((PattContext)_localctx).patt_0 = patt(0);
				setState(133); match(31);
				((PattContext)_localctx)._patt =  builder.singleElementListPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 5:
				{
				setState(136); match(17);
				setState(137); ((PattContext)_localctx).patt_0 = patt(0);
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(138); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(141); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==20 );
				setState(143); match(41);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 6:
				{
				setState(146); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 7:
				{
				setState(149); match(17);
				setState(150); ((PattContext)_localctx).patt_0 = patt(0);
				setState(151); match(41);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 8:
				{
				setState(154); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 9:
				{
				setState(157); match(17);
				setState(158); ((PattContext)_localctx).optionalpattremainder_0 = optionalpattremainder();
				setState(159); match(41);
				((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).optionalpattremainder_0._optionalpattremainder));
				}
				break;

			case 10:
				{
				setState(162); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 11:
				{
				setState(164); match(17);
				setState(165); ((PattContext)_localctx).patt_0 = patt(0);
				setState(166); match(24);
				setState(167); ((PattContext)_localctx).type_1 = type(0);
				setState(168); match(41);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(180);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PattContext(_parentctx, _parentState);
					_localctx.patt_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_patt);
					setState(173);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(174); match(1);
					setState(175); ((PattContext)_localctx).ident_1 = ident();
					((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
					}
					} 
				}
				setState(182);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(183); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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

	public static class DeclorexpContext extends ParserRuleContext {
		public Object _declorexp;
		public ExpContext exp_0;
		public DeclContext decl_0;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclorexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declorexp; }
	}

	public final DeclorexpContext declorexp() throws RecognitionException {
		DeclorexpContext _localctx = new DeclorexpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declorexp);
		try {
			setState(192);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189); ((DeclorexpContext)_localctx).decl_0 = decl();
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpDecl((((DeclorexpContext)_localctx).decl_0._decl));
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
		enterRule(_localctx, 14, RULE_pattlist);
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(195); match(6);
				setState(196); ((PattlistContext)_localctx).pattlist_1 = pattlist();
				((PattlistContext)_localctx)._pattlist =  builder.pattListMulti((((PattlistContext)_localctx).patt_0._patt),(((PattlistContext)_localctx).pattlist_1._pattlist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199); ((PattlistContext)_localctx).patt_0 = patt(0);
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
		enterRule(_localctx, 16, RULE_emptylist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
		enterRule(_localctx, 18, RULE_pattmatchsingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(208); match(21);
			setState(209); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 20, RULE_explist);
		try {
			setState(222);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(213); match(6);
				setState(214); ((ExplistContext)_localctx).explist_1 = explist();
				((ExplistContext)_localctx)._explist =  builder.expListMulti((((ExplistContext)_localctx).exp_0._exp),(((ExplistContext)_localctx).explist_1._explist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(218); match(6);
				setState(219); ((ExplistContext)_localctx).exp_1 = exp(0);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			switch (_input.LA(1)) {
			case 16:
				{
				setState(225); match(16);
				setState(226); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.varType(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			case IDTOKEN:
				{
				setState(228); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			case 17:
				{
				setState(230); match(17);
				setState(231); ((TypeContext)_localctx).type_0 = type(0);
				setState(232); match(41);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(250);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(237);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(238); match(21);
						setState(239); ((TypeContext)_localctx).type_1 = type(2);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(242);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(244); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(243); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(246); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.doubleTupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;
					}
					} 
				}
				setState(254);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 24, RULE_headtaillistpatt);
		try {
			setState(263);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(255); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(256); match(8);
				setState(257); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(260); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattSingle((((HeadtaillistpattContext)_localctx).patt_0._patt));
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
		enterRule(_localctx, 26, RULE_declmono);
		int _la;
		try {
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(266); match(9);
				setState(267); ((DeclmonoContext)_localctx).exp_1 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMono((((DeclmonoContext)_localctx).patt_0._patt),(((DeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(271); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(274); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 26) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN))) != 0) );
				setState(276); match(9);
				setState(277); ((DeclmonoContext)_localctx).exp_2 = exp(0);
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
		enterRule(_localctx, 28, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282); ((LetExpContext)_localctx).decl_0 = decl();
			setState(283); match(38);
			setState(284); ((LetExpContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 30, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287); match(20);
			setState(288); ((PatttupleContext)_localctx).patt_0 = patt(0);
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

	public static class DeclimplContext extends ParserRuleContext {
		public Object _declimpl;
		public DeclorexpContext declorexp_0;
		public DeclimplContext declimpl_1;
		public DeclorexpContext declorexp() {
			return getRuleContext(DeclorexpContext.class,0);
		}
		public DeclimplContext declimpl() {
			return getRuleContext(DeclimplContext.class,0);
		}
		public DeclimplContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declimpl; }
	}

	public final DeclimplContext declimpl() throws RecognitionException {
		DeclimplContext _localctx = new DeclimplContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_declimpl);
		try {
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(292); match(28);
				setState(293); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(297); match(28);
				((DeclimplContext)_localctx)._declimpl =  builder.declImplSingle((((DeclimplContext)_localctx).declorexp_0._declorexp));
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(303); match(39);
				setState(304); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(307); match(37);
				setState(308); ((FunctionContext)_localctx).function_0 = function(0);
				setState(309); match(40);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(312); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(315); match(17);
				setState(316); ((FunctionContext)_localctx).function_0 = function(0);
				setState(317); match(41);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(320); match(3);
				setState(321); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(324); match(3);
				setState(325); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(330);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(331); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

	public static class RecanddeclContext extends ParserRuleContext {
		public Object _recanddecl;
		public RecdeclmonoContext recdeclmono_0;
		public RecdeclmonoContext recdeclmono() {
			return getRuleContext(RecdeclmonoContext.class,0);
		}
		public RecanddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recanddecl; }
	}

	public final RecanddeclContext recanddecl() throws RecognitionException {
		RecanddeclContext _localctx = new RecanddeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_recanddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(43);
			setState(340); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
			((RecanddeclContext)_localctx)._recanddecl =  builder.recAndDeclSingle((((RecanddeclContext)_localctx).recdeclmono_0._recdeclmono));
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(344); match(14);
				setState(345); ((ExpContext)_localctx).exp_0 = exp(25);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(348); match(46);
				setState(349); ((ExpContext)_localctx).exp_0 = exp(15);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 3:
				{
				setState(352); match(11);
				setState(353); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(354); match(44);
				setState(355); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(356); match(36);
				setState(357); ((ExpContext)_localctx).exp_2 = exp(9);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 4:
				{
				setState(360); match(11);
				setState(361); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(362); match(44);
				setState(363); ((ExpContext)_localctx).exp_1 = exp(8);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 5:
				{
				setState(366); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 6:
				{
				setState(369); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 7:
				{
				setState(372); match(17);
				setState(373); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(374); match(41);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 8:
				{
				setState(377); match(37);
				setState(378); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(379); match(40);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 9:
				{
				setState(382); match(17);
				setState(383); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(384); match(24);
				setState(385); ((ExpContext)_localctx).type_1 = type(0);
				setState(386); match(41);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 10:
				{
				setState(389); match(17);
				setState(390); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(392); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(391); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(394); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==20 );
				setState(396); match(41);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;

			case 11:
				{
				setState(399); match(26);
				setState(400); ((ExpContext)_localctx).explist_0 = explist();
				setState(401); match(31);
				((ExpContext)_localctx)._exp =  builder.expList((((ExpContext)_localctx).explist_0._explist));
				}
				break;

			case 12:
				{
				setState(404); match(26);
				setState(405); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(406); match(31);
				((ExpContext)_localctx)._exp =  builder.singleElementListExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(409); match(26);
				setState(410); ((ExpContext)_localctx).headtaillistexp_0 = headtaillistexp();
				setState(411); match(31);
				((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).headtaillistexp_0._headtaillistexp));
				}
				break;

			case 14:
				{
				setState(414); match(4);
				setState(415); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(416); match(15);
				setState(417); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(418); match(22);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 15:
				{
				setState(421); match(10);
				setState(422); ((ExpContext)_localctx).ident_0 = ident();
				setState(423); match(9);
				setState(424); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(425); match(42);
				setState(426); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(427); match(15);
				setState(428); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(429); match(22);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 16:
				{
				setState(432); match(10);
				setState(433); ((ExpContext)_localctx).ident_0 = ident();
				setState(434); match(9);
				setState(435); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(436); match(23);
				setState(437); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(438); match(15);
				setState(439); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(440); match(22);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 17:
				{
				setState(443); match(35);
				setState(444); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(445); match(30);
				setState(446); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 18:
				{
				setState(449); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 19:
				{
				setState(452); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(487);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(457);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(458); match(18);
						setState(459); ((ExpContext)_localctx).exp_1 = exp(15);
						((ExpContext)_localctx)._exp =  builder.intMultiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(462);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(463); match(45);
						setState(464); ((ExpContext)_localctx).exp_1 = exp(14);
						((ExpContext)_localctx)._exp =  builder.intAdd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(467);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(468);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 9) | (1L << 12) | (1L << 25) | (1L << 27) | (1L << 32))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(469); ((ExpContext)_localctx).exp_1 = exp(13);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(472);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(473);
						_la = _input.LA(1);
						if ( !(_la==7 || _la==13) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(474); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(477);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(478);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==33) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(479); ((ExpContext)_localctx).exp_1 = exp(11);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(482);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(483); match(6);
						setState(484); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 40, RULE_decllabelsandvariants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492); ((DecllabelsandvariantsContext)_localctx).ident_0 = ident();
			setState(493); match(9);
			setState(494); ((DecllabelsandvariantsContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
			setState(495); match(2);
			setState(496); ((DecllabelsandvariantsContext)_localctx).type_2 = type(0);
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

	public static class AnddeclContext extends ParserRuleContext {
		public Object _anddecl;
		public DeclmonoContext declmono_0;
		public DeclmonoContext declmono() {
			return getRuleContext(DeclmonoContext.class,0);
		}
		public AnddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anddecl; }
	}

	public final AnddeclContext anddecl() throws RecognitionException {
		AnddeclContext _localctx = new AnddeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_anddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499); match(43);
			setState(500); ((AnddeclContext)_localctx).declmono_0 = declmono();
			((AnddeclContext)_localctx)._anddecl =  builder.andDeclSingle((((AnddeclContext)_localctx).declmono_0._declmono));
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
		enterRule(_localctx, 44, RULE_varianttype);
		try {
			setState(510);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(504); match(2);
				setState(505); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(508); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 46, RULE_optionalpattremainder);
		try {
			setState(520);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512); ((OptionalpattremainderContext)_localctx).patt_0 = patt(0);
				((OptionalpattremainderContext)_localctx)._optionalpattremainder =  builder.optionalPattRemainderSingle((((OptionalpattremainderContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515); ((OptionalpattremainderContext)_localctx).patt_0 = patt(0);
				setState(516); match(29);
				setState(517); ((OptionalpattremainderContext)_localctx).optionalpattremainder_1 = optionalpattremainder();
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
		enterRule(_localctx, 48, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(522); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(525); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 26) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN))) != 0) );
			setState(527); match(21);
			setState(528); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 50, RULE_pattmatchmultiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531); ((PattmatchmultipleContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
			setState(532); match(29);
			setState(533); ((PattmatchmultipleContext)_localctx).pattmatch_1 = pattmatch();
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
		public DeclimplContext declimpl_0;
		public DeclimplContext declimpl() {
			return getRuleContext(DeclimplContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536); ((ProgContext)_localctx).declimpl_0 = declimpl();
			((ProgContext)_localctx)._prog =  builder.start((((ProgContext)_localctx).declimpl_0._declimpl));
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
		enterRule(_localctx, 54, RULE_exptuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539); match(20);
			setState(540); ((ExptupleContext)_localctx).exp_0 = exp(0);
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
		enterRule(_localctx, 56, RULE_tupletypelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543); match(18);
			setState(544); ((TupletypelistContext)_localctx).type_0 = type(0);
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

	public static class RecdeclmonoContext extends ParserRuleContext {
		public Object _recdeclmono;
		public IdentContext ident_0;
		public ExpContext exp_1;
		public PattContext patt;
		public List<PattContext> patt_1_list = new ArrayList<PattContext>();
		public ExpContext exp_2;
		public TypeContext type_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public RecdeclmonoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recdeclmono; }
	}

	public final RecdeclmonoContext recdeclmono() throws RecognitionException {
		RecdeclmonoContext _localctx = new RecdeclmonoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_recdeclmono);
		int _la;
		try {
			setState(571);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(547); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(548); match(9);
				setState(549); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(554); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(553); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(556); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 17) | (1L << 26) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN))) != 0) );
				setState(558); match(9);
				setState(559); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentPattsExp((((RecdeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((RecdeclmonoContext)_localctx).patt_1_list),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(562); match(17);
				setState(563); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(564); match(24);
				setState(565); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(566); match(41);
				setState(567); match(9);
				setState(568); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclPattTypeExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).type_1._type),(((RecdeclmonoContext)_localctx).exp_2._exp));
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

	public static class RecdeclContext extends ParserRuleContext {
		public Object _recdecl;
		public RecdeclmonoContext recdeclmono_0;
		public RecanddeclContext recanddecl;
		public List<RecanddeclContext> recanddecl_1_list = new ArrayList<RecanddeclContext>();
		public RecdeclmonoContext recdeclmono() {
			return getRuleContext(RecdeclmonoContext.class,0);
		}
		public RecanddeclContext recanddecl(int i) {
			return getRuleContext(RecanddeclContext.class,i);
		}
		public List<RecanddeclContext> recanddecl() {
			return getRuleContexts(RecanddeclContext.class);
		}
		public RecdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recdecl; }
	}

	public final RecdeclContext recdecl() throws RecognitionException {
		RecdeclContext _localctx = new RecdeclContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_recdecl);
		int _la;
		try {
			setState(584);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(575); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(574); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(577); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==43 );
				((RecdeclContext)_localctx)._recdecl =  builder.recAndDecl((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono),lift("_recanddecl", ((RecdeclContext)_localctx).recanddecl_1_list));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(581); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				((RecdeclContext)_localctx)._recdecl =  builder.recDeclMono((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono));
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return patt_sempred((PattContext)_localctx, predIndex);

		case 11: return type_sempred((TypeContext)_localctx, predIndex);

		case 17: return function_sempred((FunctionContext)_localctx, predIndex);

		case 19: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean patt_sempred(PattContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 1);

		case 2: return precpred(_ctx, 4);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u024d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2K\n\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3V\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\6\4f\n\4\r\4\16\4g\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5v\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u008e\n\6\r\6\16\6\u008f\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ae\n\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u00b5\n\6\f\6\16\6\u00b8\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00c3\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cd\n\t\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00e1\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ee\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u00f7\n\r\r\r\16\r\u00f8\3\r\3\r\7\r"+
		"\u00fd\n\r\f\r\16\r\u0100\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u010a\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u0113\n\17\r"+
		"\17\16\17\u0114\3\17\3\17\3\17\3\17\5\17\u011b\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u012f\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u014b\n\23\3\23\3\23\3\23\3\23\7\23\u0151\n\23\f\23\16\23\u0154"+
		"\13\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u018b"+
		"\n\25\r\25\16\25\u018c\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01ca\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25"+
		"\u01ea\n\25\f\25\16\25\u01ed\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0201\n\30"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u020b\n\31\3\32\6\32\u020e"+
		"\n\32\r\32\16\32\u020f\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\6\37\u022d\n\37\r\37\16\37\u022e\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u023e\n\37\3 \3 \6"+
		" \u0242\n \r \16 \u0243\3 \3 \3 \3 \3 \5 \u024b\n \3 \2\6\n\30$(!\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\5\7\2\13"+
		"\13\16\16\33\33\35\35\"\"\4\2\t\t\17\17\4\2\7\7##\u0276\2J\3\2\2\2\4U"+
		"\3\2\2\2\6k\3\2\2\2\bu\3\2\2\2\n\u00ad\3\2\2\2\f\u00b9\3\2\2\2\16\u00c2"+
		"\3\2\2\2\20\u00cc\3\2\2\2\22\u00ce\3\2\2\2\24\u00d1\3\2\2\2\26\u00e0\3"+
		"\2\2\2\30\u00ed\3\2\2\2\32\u0109\3\2\2\2\34\u011a\3\2\2\2\36\u011c\3\2"+
		"\2\2 \u0121\3\2\2\2\"\u012e\3\2\2\2$\u014a\3\2\2\2&\u0155\3\2\2\2(\u01c9"+
		"\3\2\2\2*\u01ee\3\2\2\2,\u01f5\3\2\2\2.\u0200\3\2\2\2\60\u020a\3\2\2\2"+
		"\62\u020d\3\2\2\2\64\u0215\3\2\2\2\66\u021a\3\2\2\28\u021d\3\2\2\2:\u0221"+
		"\3\2\2\2<\u023d\3\2\2\2>\u024a\3\2\2\2@A\7\37\2\2AB\5\2\2\2BC\b\2\1\2"+
		"CK\3\2\2\2DE\5\64\33\2EF\b\2\1\2FK\3\2\2\2GH\5\24\13\2HI\b\2\1\2IK\3\2"+
		"\2\2J@\3\2\2\2JD\3\2\2\2JG\3\2\2\2K\3\3\2\2\2LM\7\62\2\2MV\b\3\1\2NO\7"+
		"\66\2\2OV\b\3\1\2PQ\7\65\2\2QV\b\3\1\2RS\5\22\n\2ST\b\3\1\2TV\3\2\2\2"+
		"UL\3\2\2\2UN\3\2\2\2UP\3\2\2\2UR\3\2\2\2V\5\3\2\2\2WX\7$\2\2XY\7\25\2"+
		"\2YZ\5> \2Z[\b\4\1\2[l\3\2\2\2\\]\5\34\17\2]^\b\4\1\2^l\3\2\2\2_`\7$\2"+
		"\2`a\5\6\4\2ab\b\4\1\2bl\3\2\2\2ce\5\34\17\2df\5,\27\2ed\3\2\2\2fg\3\2"+
		"\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\b\4\1\2jl\3\2\2\2kW\3\2\2\2k\\\3"+
		"\2\2\2k_\3\2\2\2kc\3\2\2\2l\7\3\2\2\2mn\5(\25\2no\b\5\1\2ov\3\2\2\2pq"+
		"\5(\25\2qr\7\n\2\2rs\5\b\5\2st\b\5\1\2tv\3\2\2\2um\3\2\2\2up\3\2\2\2v"+
		"\t\3\2\2\2wx\b\6\1\2xy\7\34\2\2yz\5\20\t\2z{\7!\2\2{|\b\6\1\2|\u00ae\3"+
		"\2\2\2}~\5\22\n\2~\177\b\6\1\2\177\u00ae\3\2\2\2\u0080\u0081\7\34\2\2"+
		"\u0081\u0082\5\32\16\2\u0082\u0083\7!\2\2\u0083\u0084\b\6\1\2\u0084\u00ae"+
		"\3\2\2\2\u0085\u0086\7\34\2\2\u0086\u0087\5\n\6\2\u0087\u0088\7!\2\2\u0088"+
		"\u0089\b\6\1\2\u0089\u00ae\3\2\2\2\u008a\u008b\7\23\2\2\u008b\u008d\5"+
		"\n\6\2\u008c\u008e\5 \21\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\7+"+
		"\2\2\u0092\u0093\b\6\1\2\u0093\u00ae\3\2\2\2\u0094\u0095\5\f\7\2\u0095"+
		"\u0096\b\6\1\2\u0096\u00ae\3\2\2\2\u0097\u0098\7\23\2\2\u0098\u0099\5"+
		"\n\6\2\u0099\u009a\7+\2\2\u009a\u009b\b\6\1\2\u009b\u00ae\3\2\2\2\u009c"+
		"\u009d\5\4\3\2\u009d\u009e\b\6\1\2\u009e\u00ae\3\2\2\2\u009f\u00a0\7\23"+
		"\2\2\u00a0\u00a1\5\60\31\2\u00a1\u00a2\7+\2\2\u00a2\u00a3\b\6\1\2\u00a3"+
		"\u00ae\3\2\2\2\u00a4\u00a5\7\64\2\2\u00a5\u00ae\b\6\1\2\u00a6\u00a7\7"+
		"\23\2\2\u00a7\u00a8\5\n\6\2\u00a8\u00a9\7\32\2\2\u00a9\u00aa\5\30\r\2"+
		"\u00aa\u00ab\7+\2\2\u00ab\u00ac\b\6\1\2\u00ac\u00ae\3\2\2\2\u00adw\3\2"+
		"\2\2\u00ad}\3\2\2\2\u00ad\u0080\3\2\2\2\u00ad\u0085\3\2\2\2\u00ad\u008a"+
		"\3\2\2\2\u00ad\u0094\3\2\2\2\u00ad\u0097\3\2\2\2\u00ad\u009c\3\2\2\2\u00ad"+
		"\u009f\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a6\3\2\2\2\u00ae\u00b6\3\2"+
		"\2\2\u00af\u00b0\f\6\2\2\u00b0\u00b1\7\3\2\2\u00b1\u00b2\5\f\7\2\u00b2"+
		"\u00b3\b\6\1\2\u00b3\u00b5\3\2\2\2\u00b4\u00af\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\13\3\2\2\2\u00b8\u00b6"+
		"\3\2\2\2\u00b9\u00ba\7\67\2\2\u00ba\u00bb\b\7\1\2\u00bb\r\3\2\2\2\u00bc"+
		"\u00bd\5(\25\2\u00bd\u00be\b\b\1\2\u00be\u00c3\3\2\2\2\u00bf\u00c0\5\6"+
		"\4\2\u00c0\u00c1\b\b\1\2\u00c1\u00c3\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c2"+
		"\u00bf\3\2\2\2\u00c3\17\3\2\2\2\u00c4\u00c5\5\n\6\2\u00c5\u00c6\7\b\2"+
		"\2\u00c6\u00c7\5\20\t\2\u00c7\u00c8\b\t\1\2\u00c8\u00cd\3\2\2\2\u00c9"+
		"\u00ca\5\n\6\2\u00ca\u00cb\b\t\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c4\3\2"+
		"\2\2\u00cc\u00c9\3\2\2\2\u00cd\21\3\2\2\2\u00ce\u00cf\7\63\2\2\u00cf\u00d0"+
		"\b\n\1\2\u00d0\23\3\2\2\2\u00d1\u00d2\5\n\6\2\u00d2\u00d3\7\27\2\2\u00d3"+
		"\u00d4\5(\25\2\u00d4\u00d5\b\13\1\2\u00d5\25\3\2\2\2\u00d6\u00d7\5(\25"+
		"\2\u00d7\u00d8\7\b\2\2\u00d8\u00d9\5\26\f\2\u00d9\u00da\b\f\1\2\u00da"+
		"\u00e1\3\2\2\2\u00db\u00dc\5(\25\2\u00dc\u00dd\7\b\2\2\u00dd\u00de\5("+
		"\25\2\u00de\u00df\b\f\1\2\u00df\u00e1\3\2\2\2\u00e0\u00d6\3\2\2\2\u00e0"+
		"\u00db\3\2\2\2\u00e1\27\3\2\2\2\u00e2\u00e3\b\r\1\2\u00e3\u00e4\7\22\2"+
		"\2\u00e4\u00e5\7\67\2\2\u00e5\u00ee\b\r\1\2\u00e6\u00e7\7\67\2\2\u00e7"+
		"\u00ee\b\r\1\2\u00e8\u00e9\7\23\2\2\u00e9\u00ea\5\30\r\2\u00ea\u00eb\7"+
		"+\2\2\u00eb\u00ec\b\r\1\2\u00ec\u00ee\3\2\2\2\u00ed\u00e2\3\2\2\2\u00ed"+
		"\u00e6\3\2\2\2\u00ed\u00e8\3\2\2\2\u00ee\u00fe\3\2\2\2\u00ef\u00f0\f\3"+
		"\2\2\u00f0\u00f1\7\27\2\2\u00f1\u00f2\5\30\r\4\u00f2\u00f3\b\r\1\2\u00f3"+
		"\u00fd\3\2\2\2\u00f4\u00f6\f\6\2\2\u00f5\u00f7\5:\36\2\u00f6\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fb\b\r\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00ef\3\2"+
		"\2\2\u00fc\u00f4\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\31\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\5\n\6"+
		"\2\u0102\u0103\7\n\2\2\u0103\u0104\5\32\16\2\u0104\u0105\b\16\1\2\u0105"+
		"\u010a\3\2\2\2\u0106\u0107\5\n\6\2\u0107\u0108\b\16\1\2\u0108\u010a\3"+
		"\2\2\2\u0109\u0101\3\2\2\2\u0109\u0106\3\2\2\2\u010a\33\3\2\2\2\u010b"+
		"\u010c\5\n\6\2\u010c\u010d\7\13\2\2\u010d\u010e\5(\25\2\u010e\u010f\b"+
		"\17\1\2\u010f\u011b\3\2\2\2\u0110\u0112\5\f\7\2\u0111\u0113\5\n\6\2\u0112"+
		"\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0116\3\2\2\2\u0116\u0117\7\13\2\2\u0117\u0118\5(\25\2\u0118"+
		"\u0119\b\17\1\2\u0119\u011b\3\2\2\2\u011a\u010b\3\2\2\2\u011a\u0110\3"+
		"\2\2\2\u011b\35\3\2\2\2\u011c\u011d\5\6\4\2\u011d\u011e\7(\2\2\u011e\u011f"+
		"\5(\25\2\u011f\u0120\b\20\1\2\u0120\37\3\2\2\2\u0121\u0122\7\26\2\2\u0122"+
		"\u0123\5\n\6\2\u0123\u0124\b\21\1\2\u0124!\3\2\2\2\u0125\u0126\5\16\b"+
		"\2\u0126\u0127\7\36\2\2\u0127\u0128\5\"\22\2\u0128\u0129\b\22\1\2\u0129"+
		"\u012f\3\2\2\2\u012a\u012b\5\16\b\2\u012b\u012c\7\36\2\2\u012c\u012d\b"+
		"\22\1\2\u012d\u012f\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u012a\3\2\2\2\u012f"+
		"#\3\2\2\2\u0130\u0131\b\23\1\2\u0131\u0132\7)\2\2\u0132\u0133\5\2\2\2"+
		"\u0133\u0134\b\23\1\2\u0134\u014b\3\2\2\2\u0135\u0136\7\'\2\2\u0136\u0137"+
		"\5$\23\2\u0137\u0138\7*\2\2\u0138\u0139\b\23\1\2\u0139\u014b\3\2\2\2\u013a"+
		"\u013b\5\f\7\2\u013b\u013c\b\23\1\2\u013c\u014b\3\2\2\2\u013d\u013e\7"+
		"\23\2\2\u013e\u013f\5$\23\2\u013f\u0140\7+\2\2\u0140\u0141\b\23\1\2\u0141"+
		"\u014b\3\2\2\2\u0142\u0143\7\5\2\2\u0143\u0144\5\24\13\2\u0144\u0145\b"+
		"\23\1\2\u0145\u014b\3\2\2\2\u0146\u0147\7\5\2\2\u0147\u0148\5\62\32\2"+
		"\u0148\u0149\b\23\1\2\u0149\u014b\3\2\2\2\u014a\u0130\3\2\2\2\u014a\u0135"+
		"\3\2\2\2\u014a\u013a\3\2\2\2\u014a\u013d\3\2\2\2\u014a\u0142\3\2\2\2\u014a"+
		"\u0146\3\2\2\2\u014b\u0152\3\2\2\2\u014c\u014d\f\7\2\2\u014d\u014e\5("+
		"\25\2\u014e\u014f\b\23\1\2\u014f\u0151\3\2\2\2\u0150\u014c\3\2\2\2\u0151"+
		"\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153%\3\2\2\2"+
		"\u0154\u0152\3\2\2\2\u0155\u0156\7-\2\2\u0156\u0157\5<\37\2\u0157\u0158"+
		"\b\24\1\2\u0158\'\3\2\2\2\u0159\u015a\b\25\1\2\u015a\u015b\7\20\2\2\u015b"+
		"\u015c\5(\25\33\u015c\u015d\b\25\1\2\u015d\u01ca\3\2\2\2\u015e\u015f\7"+
		"\60\2\2\u015f\u0160\5(\25\21\u0160\u0161\b\25\1\2\u0161\u01ca\3\2\2\2"+
		"\u0162\u0163\7\r\2\2\u0163\u0164\5(\25\2\u0164\u0165\7.\2\2\u0165\u0166"+
		"\5(\25\2\u0166\u0167\7&\2\2\u0167\u0168\5(\25\13\u0168\u0169\b\25\1\2"+
		"\u0169\u01ca\3\2\2\2\u016a\u016b\7\r\2\2\u016b\u016c\5(\25\2\u016c\u016d"+
		"\7.\2\2\u016d\u016e\5(\25\n\u016e\u016f\b\25\1\2\u016f\u01ca\3\2\2\2\u0170"+
		"\u0171\5\f\7\2\u0171\u0172\b\25\1\2\u0172\u01ca\3\2\2\2\u0173\u0174\5"+
		"\4\3\2\u0174\u0175\b\25\1\2\u0175\u01ca\3\2\2\2\u0176\u0177\7\23\2\2\u0177"+
		"\u0178\5(\25\2\u0178\u0179\7+\2\2\u0179\u017a\b\25\1\2\u017a\u01ca\3\2"+
		"\2\2\u017b\u017c\7\'\2\2\u017c\u017d\5(\25\2\u017d\u017e\7*\2\2\u017e"+
		"\u017f\b\25\1\2\u017f\u01ca\3\2\2\2\u0180\u0181\7\23\2\2\u0181\u0182\5"+
		"(\25\2\u0182\u0183\7\32\2\2\u0183\u0184\5\30\r\2\u0184\u0185\7+\2\2\u0185"+
		"\u0186\b\25\1\2\u0186\u01ca\3\2\2\2\u0187\u0188\7\23\2\2\u0188\u018a\5"+
		"(\25\2\u0189\u018b\58\35\2\u018a\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\7+"+
		"\2\2\u018f\u0190\b\25\1\2\u0190\u01ca\3\2\2\2\u0191\u0192\7\34\2\2\u0192"+
		"\u0193\5\26\f\2\u0193\u0194\7!\2\2\u0194\u0195\b\25\1\2\u0195\u01ca\3"+
		"\2\2\2\u0196\u0197\7\34\2\2\u0197\u0198\5(\25\2\u0198\u0199\7!\2\2\u0199"+
		"\u019a\b\25\1\2\u019a\u01ca\3\2\2\2\u019b\u019c\7\34\2\2\u019c\u019d\5"+
		"\b\5\2\u019d\u019e\7!\2\2\u019e\u019f\b\25\1\2\u019f\u01ca\3\2\2\2\u01a0"+
		"\u01a1\7\6\2\2\u01a1\u01a2\5(\25\2\u01a2\u01a3\7\21\2\2\u01a3\u01a4\5"+
		"(\25\2\u01a4\u01a5\7\30\2\2\u01a5\u01a6\b\25\1\2\u01a6\u01ca\3\2\2\2\u01a7"+
		"\u01a8\7\f\2\2\u01a8\u01a9\5\f\7\2\u01a9\u01aa\7\13\2\2\u01aa\u01ab\5"+
		"(\25\2\u01ab\u01ac\7,\2\2\u01ac\u01ad\5(\25\2\u01ad\u01ae\7\21\2\2\u01ae"+
		"\u01af\5(\25\2\u01af\u01b0\7\30\2\2\u01b0\u01b1\b\25\1\2\u01b1\u01ca\3"+
		"\2\2\2\u01b2\u01b3\7\f\2\2\u01b3\u01b4\5\f\7\2\u01b4\u01b5\7\13\2\2\u01b5"+
		"\u01b6\5(\25\2\u01b6\u01b7\7\31\2\2\u01b7\u01b8\5(\25\2\u01b8\u01b9\7"+
		"\21\2\2\u01b9\u01ba\5(\25\2\u01ba\u01bb\7\30\2\2\u01bb\u01bc\b\25\1\2"+
		"\u01bc\u01ca\3\2\2\2\u01bd\u01be\7%\2\2\u01be\u01bf\5(\25\2\u01bf\u01c0"+
		"\7 \2\2\u01c0\u01c1\5\2\2\2\u01c1\u01c2\b\25\1\2\u01c2\u01ca\3\2\2\2\u01c3"+
		"\u01c4\5$\23\2\u01c4\u01c5\b\25\1\2\u01c5\u01ca\3\2\2\2\u01c6\u01c7\5"+
		"\36\20\2\u01c7\u01c8\b\25\1\2\u01c8\u01ca\3\2\2\2\u01c9\u0159\3\2\2\2"+
		"\u01c9\u015e\3\2\2\2\u01c9\u0162\3\2\2\2\u01c9\u016a\3\2\2\2\u01c9\u0170"+
		"\3\2\2\2\u01c9\u0173\3\2\2\2\u01c9\u0176\3\2\2\2\u01c9\u017b\3\2\2\2\u01c9"+
		"\u0180\3\2\2\2\u01c9\u0187\3\2\2\2\u01c9\u0191\3\2\2\2\u01c9\u0196\3\2"+
		"\2\2\u01c9\u019b\3\2\2\2\u01c9\u01a0\3\2\2\2\u01c9\u01a7\3\2\2\2\u01c9"+
		"\u01b2\3\2\2\2\u01c9\u01bd\3\2\2\2\u01c9\u01c3\3\2\2\2\u01c9\u01c6\3\2"+
		"\2\2\u01ca\u01eb\3\2\2\2\u01cb\u01cc\f\20\2\2\u01cc\u01cd\7\24\2\2\u01cd"+
		"\u01ce\5(\25\21\u01ce\u01cf\b\25\1\2\u01cf\u01ea\3\2\2\2\u01d0\u01d1\f"+
		"\17\2\2\u01d1\u01d2\7/\2\2\u01d2\u01d3\5(\25\20\u01d3\u01d4\b\25\1\2\u01d4"+
		"\u01ea\3\2\2\2\u01d5\u01d6\f\16\2\2\u01d6\u01d7\t\2\2\2\u01d7\u01d8\5"+
		"(\25\17\u01d8\u01d9\b\25\1\2\u01d9\u01ea\3\2\2\2\u01da\u01db\f\r\2\2\u01db"+
		"\u01dc\t\3\2\2\u01dc\u01dd\5(\25\16\u01dd\u01de\b\25\1\2\u01de\u01ea\3"+
		"\2\2\2\u01df\u01e0\f\f\2\2\u01e0\u01e1\t\4\2\2\u01e1\u01e2\5(\25\r\u01e2"+
		"\u01e3\b\25\1\2\u01e3\u01ea\3\2\2\2\u01e4\u01e5\f\6\2\2\u01e5\u01e6\7"+
		"\b\2\2\u01e6\u01e7\5(\25\7\u01e7\u01e8\b\25\1\2\u01e8\u01ea\3\2\2\2\u01e9"+
		"\u01cb\3\2\2\2\u01e9\u01d0\3\2\2\2\u01e9\u01d5\3\2\2\2\u01e9\u01da\3\2"+
		"\2\2\u01e9\u01df\3\2\2\2\u01e9\u01e4\3\2\2\2\u01ea\u01ed\3\2\2\2\u01eb"+
		"\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec)\3\2\2\2\u01ed\u01eb\3\2\2\2"+
		"\u01ee\u01ef\5\f\7\2\u01ef\u01f0\7\13\2\2\u01f0\u01f1\7\67\2\2\u01f1\u01f2"+
		"\7\4\2\2\u01f2\u01f3\5\30\r\2\u01f3\u01f4\b\26\1\2\u01f4+\3\2\2\2\u01f5"+
		"\u01f6\7-\2\2\u01f6\u01f7\5\34\17\2\u01f7\u01f8\b\27\1\2\u01f8-\3\2\2"+
		"\2\u01f9\u01fa\78\2\2\u01fa\u01fb\7\4\2\2\u01fb\u01fc\5\30\r\2\u01fc\u01fd"+
		"\b\30\1\2\u01fd\u0201\3\2\2\2\u01fe\u01ff\78\2\2\u01ff\u0201\b\30\1\2"+
		"\u0200\u01f9\3\2\2\2\u0200\u01fe\3\2\2\2\u0201/\3\2\2\2\u0202\u0203\5"+
		"\n\6\2\u0203\u0204\b\31\1\2\u0204\u020b\3\2\2\2\u0205\u0206\5\n\6\2\u0206"+
		"\u0207\7\37\2\2\u0207\u0208\5\60\31\2\u0208\u0209\b\31\1\2\u0209\u020b"+
		"\3\2\2\2\u020a\u0202\3\2\2\2\u020a\u0205\3\2\2\2\u020b\61\3\2\2\2\u020c"+
		"\u020e\5\n\6\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u020d\3\2"+
		"\2\2\u020f\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7\27\2\2\u0212"+
		"\u0213\5(\25\2\u0213\u0214\b\32\1\2\u0214\63\3\2\2\2\u0215\u0216\5\24"+
		"\13\2\u0216\u0217\7\37\2\2\u0217\u0218\5\2\2\2\u0218\u0219\b\33\1\2\u0219"+
		"\65\3\2\2\2\u021a\u021b\5\"\22\2\u021b\u021c\b\34\1\2\u021c\67\3\2\2\2"+
		"\u021d\u021e\7\26\2\2\u021e\u021f\5(\25\2\u021f\u0220\b\35\1\2\u02209"+
		"\3\2\2\2\u0221\u0222\7\24\2\2\u0222\u0223\5\30\r\2\u0223\u0224\b\36\1"+
		"\2\u0224;\3\2\2\2\u0225\u0226\5\f\7\2\u0226\u0227\7\13\2\2\u0227\u0228"+
		"\5(\25\2\u0228\u0229\b\37\1\2\u0229\u023e\3\2\2\2\u022a\u022c\5\f\7\2"+
		"\u022b\u022d\5\n\6\2\u022c\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022c"+
		"\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\7\13\2\2"+
		"\u0231\u0232\5(\25\2\u0232\u0233\b\37\1\2\u0233\u023e\3\2\2\2\u0234\u0235"+
		"\7\23\2\2\u0235\u0236\5\f\7\2\u0236\u0237\7\32\2\2\u0237\u0238\5\30\r"+
		"\2\u0238\u0239\7+\2\2\u0239\u023a\7\13\2\2\u023a\u023b\5(\25\2\u023b\u023c"+
		"\b\37\1\2\u023c\u023e\3\2\2\2\u023d\u0225\3\2\2\2\u023d\u022a\3\2\2\2"+
		"\u023d\u0234\3\2\2\2\u023e=\3\2\2\2\u023f\u0241\5<\37\2\u0240\u0242\5"+
		"&\24\2\u0241\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0241\3\2\2\2\u0243"+
		"\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\b \1\2\u0246\u024b\3\2"+
		"\2\2\u0247\u0248\5<\37\2\u0248\u0249\b \1\2\u0249\u024b\3\2\2\2\u024a"+
		"\u023f\3\2\2\2\u024a\u0247\3\2\2\2\u024b?\3\2\2\2\"JUgku\u008f\u00ad\u00b6"+
		"\u00c2\u00cc\u00e0\u00ed\u00f8\u00fc\u00fe\u0109\u0114\u011a\u012e\u014a"+
		"\u0152\u018c\u01c9\u01e9\u01eb\u0200\u020a\u020f\u022e\u023d\u0243\u024a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}