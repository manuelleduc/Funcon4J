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
		T__48=1, T__47=2, T__46=3, T__45=4, T__44=5, T__43=6, T__42=7, T__41=8, 
		T__40=9, T__39=10, T__38=11, T__37=12, T__36=13, T__35=14, T__34=15, T__33=16, 
		T__32=17, T__31=18, T__30=19, T__29=20, T__28=21, T__27=22, T__26=23, 
		T__25=24, T__24=25, T__23=26, T__22=27, T__21=28, T__20=29, T__19=30, 
		T__18=31, T__17=32, T__16=33, T__15=34, T__14=35, T__13=36, T__12=37, 
		T__11=38, T__10=39, T__9=40, T__8=41, T__7=42, T__6=43, T__5=44, T__4=45, 
		T__3=46, T__2=47, T__1=48, T__0=49, WS=50, NULLTOKEN=51, EMPTYLISTTOKEN=52, 
		WILDCARDTOKEN=53, BOOLTOKEN=54, NUMTOKEN=55, IDTOKEN=56, CONSTRTOKEN=57;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'while'", "'&&'", "'::'", "'='", "'for'", "'do'", 
		"'('", "'rec'", "','", "'done'", "'mod'", "'>='", "'<'", "';;'", "']'", 
		"'let'", "'match'", "'function'", "'downto'", "'then'", "'+'", "'/'", 
		"'as'", "'of'", "'||'", "';'", "'if'", "'<='", "'&'", "'print'", "'''", 
		"'*'", "'->'", "'to'", "':'", "'['", "'|'", "'with'", "'>'", "'or'", "'else'", 
		"'begin'", "'in'", "'end'", "')'", "'and'", "'not'", "'-'", "WS", "NULLTOKEN", 
		"EMPTYLISTTOKEN", "'_'", "BOOLTOKEN", "NUMTOKEN", "IDTOKEN", "CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decl = 2, RULE_patt = 3, RULE_ident = 4, 
		RULE_declorexp = 5, RULE_pattlist = 6, RULE_emptylist = 7, RULE_pattmatchsingle = 8, 
		RULE_explist = 9, RULE_type = 10, RULE_headtaillistpatt = 11, RULE_declmono = 12, 
		RULE_letExp = 13, RULE_patttuple = 14, RULE_declimpl = 15, RULE_function = 16, 
		RULE_recanddecl = 17, RULE_exp = 18, RULE_decllabelsandvariants = 19, 
		RULE_anddecl = 20, RULE_varianttype = 21, RULE_pattmatchcurried = 22, 
		RULE_pattmatchmultiple = 23, RULE_prog = 24, RULE_exptuple = 25, RULE_tupletypelist = 26, 
		RULE_recdeclmono = 27, RULE_recdecl = 28;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decl", "patt", "ident", "declorexp", "pattlist", 
		"emptylist", "pattmatchsingle", "explist", "type", "headtaillistpatt", 
		"declmono", "letExp", "patttuple", "declimpl", "function", "recanddecl", 
		"exp", "decllabelsandvariants", "anddecl", "varianttype", "pattmatchcurried", 
		"pattmatchmultiple", "prog", "exptuple", "tupletypelist", "recdeclmono", 
		"recdecl"
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
			setState(68);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); match(38);
				setState(59); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); ((PattmatchContext)_localctx).pattmatchmultiple_0 = pattmatchmultiple();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch2((((PattmatchContext)_localctx).pattmatchmultiple_0._pattmatchmultiple));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
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
		public EmptylistContext emptylist_0;
		public Token NUMTOKEN_0;
		public Token BOOLTOKEN_0;
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
			setState(79);
			switch (_input.LA(1)) {
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
				}
				break;
			case NUMTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(73); ((ConstantContext)_localctx).NUMTOKEN_0 = match(NUMTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(numtoken((((ConstantContext)_localctx).NUMTOKEN_0!=null?((ConstantContext)_localctx).NUMTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(75); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(77); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
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
			setState(101);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81); match(17);
				setState(82); match(9);
				setState(83); ((DeclContext)_localctx).recdecl_0 = recdecl();
				((DeclContext)_localctx)._decl =  builder.declRec((((DeclContext)_localctx).recdecl_0._recdecl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89); match(17);
				setState(90); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(94); ((DeclContext)_localctx).anddecl = anddecl();
					((DeclContext)_localctx).anddecl_1_list.add(((DeclContext)_localctx).anddecl);
					}
					}
					setState(97); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==47 );
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

	public static class PattContext extends ParserRuleContext {
		public Object _patt;
		public PattContext patt_0;
		public Token CONSTRTOKEN_0;
		public PattContext patt_1;
		public EmptylistContext emptylist_0;
		public PattlistContext pattlist_0;
		public HeadtaillistpattContext headtaillistpatt_0;
		public PatttupleContext patttuple;
		public List<PatttupleContext> patttuple_1_list = new ArrayList<PatttupleContext>();
		public IdentContext ident_0;
		public TypeContext type_1;
		public Token WILDCARDTOKEN_0;
		public ConstantContext constant_0;
		public IdentContext ident_1;
		public PatttupleContext patttuple(int i) {
			return getRuleContext(PatttupleContext.class,i);
		}
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
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
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode WILDCARDTOKEN() { return getToken(CLParser.WILDCARDTOKEN, 0); }
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_patt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(104); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(105); ((PattContext)_localctx).patt_1 = patt(2);
				((PattContext)_localctx)._patt =  builder.pattConstrPatt(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt));
				}
				break;

			case 2:
				{
				setState(108); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 3:
				{
				setState(111); match(37);
				setState(112); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(113); match(16);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 4:
				{
				setState(116); match(37);
				setState(117); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(118); match(16);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;

			case 5:
				{
				setState(121); match(8);
				setState(122); ((PattContext)_localctx).patt_0 = patt(0);
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(123); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(126); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==10 );
				setState(128); match(46);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 6:
				{
				setState(131); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 7:
				{
				setState(134); match(8);
				setState(135); ((PattContext)_localctx).patt_0 = patt(0);
				setState(136); match(36);
				setState(137); ((PattContext)_localctx).type_1 = type(0);
				setState(138); match(46);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 8:
				{
				setState(141); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(143); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 10:
				{
				setState(146); match(8);
				setState(147); ((PattContext)_localctx).patt_0 = patt(0);
				setState(148); match(46);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 11:
				{
				setState(151); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((PattContext)_localctx)._patt =  builder.pattConstr(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(165);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(155);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(156); match(38);
						setState(157); ((PattContext)_localctx).patt_1 = patt(7);
						((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).patt_1._patt));
						}
						break;

					case 2:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(160);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(161); match(24);
						setState(162); ((PattContext)_localctx).ident_1 = ident();
						((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
						}
						break;
					}
					} 
				}
				setState(169);
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
		enterRule(_localctx, 8, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
		enterRule(_localctx, 10, RULE_declorexp);
		try {
			setState(179);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176); ((DeclorexpContext)_localctx).decl_0 = decl();
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
		enterRule(_localctx, 12, RULE_pattlist);
		try {
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); ((PattlistContext)_localctx).patt_0 = patt(0);
				((PattlistContext)_localctx)._pattlist =  builder.pattListSingle((((PattlistContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(185); match(27);
				setState(186); ((PattlistContext)_localctx).pattlist_1 = pattlist();
				((PattlistContext)_localctx)._pattlist =  builder.pattListMulti((((PattlistContext)_localctx).patt_0._patt),(((PattlistContext)_localctx).pattlist_1._pattlist));
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
			setState(191); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
			setState(194); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(195); match(34);
			setState(196); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
			setState(209);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(200); match(27);
				setState(201); ((ExplistContext)_localctx).explist_1 = explist();
				((ExplistContext)_localctx)._explist =  builder.innerExpListMulti((((ExplistContext)_localctx).exp_0._exp),(((ExplistContext)_localctx).explist_1._explist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(205); match(27);
				setState(206); ((ExplistContext)_localctx).exp_1 = exp(0);
				((ExplistContext)_localctx)._explist =  builder.innerExpListDouble((((ExplistContext)_localctx).exp_0._exp),(((ExplistContext)_localctx).exp_1._exp));
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
			setState(222);
			switch (_input.LA(1)) {
			case 8:
				{
				setState(212); match(8);
				setState(213); ((TypeContext)_localctx).type_0 = type(0);
				setState(214); match(46);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;
			case IDTOKEN:
				{
				setState(217); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			case 32:
				{
				setState(219); match(32);
				setState(220); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.varType(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(237);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(224);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(225); match(34);
						setState(226); ((TypeContext)_localctx).type_1 = type(2);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(229);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(231); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(230); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(233); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.doubleTupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;
					}
					} 
				}
				setState(241);
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
		enterRule(_localctx, 22, RULE_headtaillistpatt);
		try {
			setState(250);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(243); match(4);
				setState(244); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
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
		enterRule(_localctx, 24, RULE_declmono);
		int _la;
		try {
			setState(267);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(253); match(5);
				setState(254); ((DeclmonoContext)_localctx).exp_1 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMono((((DeclmonoContext)_localctx).patt_0._patt),(((DeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(259); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(258); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(261); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 37) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN) | (1L << CONSTRTOKEN))) != 0) );
				setState(263); match(5);
				setState(264); ((DeclmonoContext)_localctx).exp_2 = exp(0);
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
			setState(269); ((LetExpContext)_localctx).decl_0 = decl();
			setState(270); match(44);
			setState(271); ((LetExpContext)_localctx).exp_1 = exp(0);
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
			setState(274); match(10);
			setState(275); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
		enterRule(_localctx, 30, RULE_declimpl);
		try {
			setState(287);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(279); match(15);
				setState(280); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(284); match(15);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(290); match(19);
				setState(291); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(294); match(43);
				setState(295); ((FunctionContext)_localctx).function_0 = function(0);
				setState(296); match(45);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(299); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(302); match(8);
				setState(303); ((FunctionContext)_localctx).function_0 = function(0);
				setState(304); match(46);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(307); match(1);
				setState(308); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(311); match(1);
				setState(312); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
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
					setState(317);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(318); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(325);
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
		enterRule(_localctx, 34, RULE_recanddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); match(47);
			setState(327); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
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
		public ExpContext exp_3;
		public PattmatchContext pattmatch_1;
		public FunctionContext function_0;
		public LetExpContext letExp_0;
		public Token op_1512;
		public Token op_1511;
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(331); match(31);
				setState(332); ((ExpContext)_localctx).exp_0 = exp(27);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(335); match(48);
				setState(336); ((ExpContext)_localctx).exp_0 = exp(17);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 3:
				{
				setState(339); match(49);
				setState(340); ((ExpContext)_localctx).exp_0 = exp(16);
				((ExpContext)_localctx)._exp =  builder.intUnarySub((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(343); match(28);
				setState(344); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(345); match(21);
				setState(346); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(347); match(42);
				setState(348); ((ExpContext)_localctx).exp_2 = exp(9);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 5:
				{
				setState(351); match(28);
				setState(352); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(353); match(21);
				setState(354); ((ExpContext)_localctx).exp_1 = exp(8);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 6:
				{
				setState(357); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 7:
				{
				setState(360); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 8:
				{
				setState(363); match(8);
				setState(364); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(365); match(46);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 9:
				{
				setState(368); match(43);
				setState(369); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(370); match(45);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 10:
				{
				setState(373); match(8);
				setState(374); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(375); match(36);
				setState(376); ((ExpContext)_localctx).type_1 = type(0);
				setState(377); match(46);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 11:
				{
				setState(380); match(8);
				setState(381); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(383); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(382); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(385); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==10 );
				setState(387); match(46);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;

			case 12:
				{
				setState(390); match(37);
				setState(391); ((ExpContext)_localctx).explist_0 = explist();
				setState(392); match(16);
				((ExpContext)_localctx)._exp =  builder.expList((((ExpContext)_localctx).explist_0._explist));
				}
				break;

			case 13:
				{
				setState(395); match(37);
				setState(396); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(397); match(16);
				((ExpContext)_localctx)._exp =  builder.expListSingle((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 14:
				{
				setState(400); match(2);
				setState(401); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(402); match(7);
				setState(403); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(404); match(11);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 15:
				{
				setState(407); match(6);
				setState(408); ((ExpContext)_localctx).ident_0 = ident();
				setState(409); match(5);
				setState(410); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(411); match(20);
				setState(412); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(413); match(7);
				setState(414); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(415); match(11);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 16:
				{
				setState(418); match(6);
				setState(419); ((ExpContext)_localctx).ident_0 = ident();
				setState(420); match(5);
				setState(421); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(422); match(35);
				setState(423); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(424); match(7);
				setState(425); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(426); match(11);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 17:
				{
				setState(429); match(18);
				setState(430); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(431); match(39);
				setState(432); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 18:
				{
				setState(435); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 19:
				{
				setState(438); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(485);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(483);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(443);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(444); match(4);
						setState(445); ((ExpContext)_localctx).exp_1 = exp(20);
						((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(448);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(449); match(12);
						setState(450); ((ExpContext)_localctx).exp_1 = exp(16);
						((ExpContext)_localctx)._exp =  builder.intMod((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(453);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(454);
						((ExpContext)_localctx).op_1512 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==23 || _la==33) ) {
							((ExpContext)_localctx).op_1512 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(455); ((ExpContext)_localctx).exp_1 = exp(15);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/") ? builder.intDivide(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*") ? builder.intMultiply(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(458);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(459);
						((ExpContext)_localctx).op_1511 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==22 || _la==49) ) {
							((ExpContext)_localctx).op_1511 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(460); ((ExpContext)_localctx).exp_1 = exp(14);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+") ? builder.intAdd(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-") ? builder.intSub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(463);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(464);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 13) | (1L << 14) | (1L << 29) | (1L << 40))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(465); ((ExpContext)_localctx).exp_1 = exp(13);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(468);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(469);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==30) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(470); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(473);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(474);
						_la = _input.LA(1);
						if ( !(_la==26 || _la==41) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(475); ((ExpContext)_localctx).exp_1 = exp(11);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(478);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(479); match(27);
						setState(480); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(487);
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
		enterRule(_localctx, 38, RULE_decllabelsandvariants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(488); ((DecllabelsandvariantsContext)_localctx).ident_0 = ident();
			setState(489); match(5);
			setState(490); ((DecllabelsandvariantsContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
			setState(491); match(25);
			setState(492); ((DecllabelsandvariantsContext)_localctx).type_2 = type(0);
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
		enterRule(_localctx, 40, RULE_anddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495); match(47);
			setState(496); ((AnddeclContext)_localctx).declmono_0 = declmono();
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
		enterRule(_localctx, 42, RULE_varianttype);
		try {
			setState(506);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(499); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(500); match(25);
				setState(501); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(504); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 44, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(508); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(511); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 37) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN) | (1L << CONSTRTOKEN))) != 0) );
			setState(513); match(34);
			setState(514); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 46, RULE_pattmatchmultiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517); ((PattmatchmultipleContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
			setState(518); match(38);
			setState(519); ((PattmatchmultipleContext)_localctx).pattmatch_1 = pattmatch();
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
		enterRule(_localctx, 48, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522); ((ProgContext)_localctx).declimpl_0 = declimpl();
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
		enterRule(_localctx, 50, RULE_exptuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525); match(10);
			setState(526); ((ExptupleContext)_localctx).exp_0 = exp(0);
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
		enterRule(_localctx, 52, RULE_tupletypelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529); match(33);
			setState(530); ((TupletypelistContext)_localctx).type_0 = type(0);
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
		public TypeContext type_1;
		public ExpContext exp_2;
		public PattContext patt;
		public List<PattContext> patt_1_list = new ArrayList<PattContext>();
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
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
		enterRule(_localctx, 54, RULE_recdeclmono);
		int _la;
		try {
			setState(557);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(533); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(534); match(5);
				setState(535); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(538); match(8);
				setState(539); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(540); match(36);
				setState(541); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(542); match(46);
				setState(543); match(5);
				setState(544); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclPattTypeExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).type_1._type),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(547); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(549); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(548); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(551); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 37) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN) | (1L << CONSTRTOKEN))) != 0) );
				setState(553); match(5);
				setState(554); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentPattsExp((((RecdeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((RecdeclmonoContext)_localctx).patt_1_list),(((RecdeclmonoContext)_localctx).exp_2._exp));
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
		enterRule(_localctx, 56, RULE_recdecl);
		int _la;
		try {
			setState(570);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				((RecdeclContext)_localctx)._recdecl =  builder.recDeclMono((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(562); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(564); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(563); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(566); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==47 );
				((RecdeclContext)_localctx)._recdecl =  builder.recAndDecl((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono),lift("_recanddecl", ((RecdeclContext)_localctx).recanddecl_1_list));
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
		case 3: return patt_sempred((PattContext)_localctx, predIndex);

		case 10: return type_sempred((TypeContext)_localctx, predIndex);

		case 16: return function_sempred((FunctionContext)_localctx, predIndex);

		case 18: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean patt_sempred(PattContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);

		case 1: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);

		case 3: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 20);

		case 6: return precpred(_ctx, 15);

		case 7: return precpred(_ctx, 14);

		case 8: return precpred(_ctx, 13);

		case 9: return precpred(_ctx, 12);

		case 10: return precpred(_ctx, 11);

		case 11: return precpred(_ctx, 10);

		case 12: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u023f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2G\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"R\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4b\n\4"+
		"\r\4\16\4c\3\4\3\4\5\4h\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\177\n\5\r\5\16\5\u0080"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009c\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\7\5\u00a8\n\5\f\5\16\5\u00ab\13\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00b6\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00c0"+
		"\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00d4\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u00e1\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00ea\n\f\r\f\16"+
		"\f\u00eb\3\f\3\f\7\f\u00f0\n\f\f\f\16\f\u00f3\13\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u00fd\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u0106"+
		"\n\16\r\16\16\16\u0107\3\16\3\16\3\16\3\16\5\16\u010e\n\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\5\21\u0122\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u013e\n\22\3\22\3\22\3\22\3\22\7\22\u0144\n\22\f"+
		"\22\16\22\u0147\13\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\6\24\u0182\n\24\r\24\16\24\u0183\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01bc\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u01e6\n\24"+
		"\f\24\16\24\u01e9\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01fd\n\27\3\30\6\30"+
		"\u0200\n\30\r\30\16\30\u0201\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\6"+
		"\35\u0228\n\35\r\35\16\35\u0229\3\35\3\35\3\35\3\35\5\35\u0230\n\35\3"+
		"\36\3\36\3\36\3\36\3\36\6\36\u0237\n\36\r\36\16\36\u0238\3\36\3\36\5\36"+
		"\u023d\n\36\3\36\2\6\b\26\"&\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:\2\7\4\2\31\31##\4\2\30\30\63\63\6\2\7\7\17\20"+
		"\37\37**\4\2\5\5  \4\2\34\34++\u026b\2F\3\2\2\2\4Q\3\2\2\2\6g\3\2\2\2"+
		"\b\u009b\3\2\2\2\n\u00ac\3\2\2\2\f\u00b5\3\2\2\2\16\u00bf\3\2\2\2\20\u00c1"+
		"\3\2\2\2\22\u00c4\3\2\2\2\24\u00d3\3\2\2\2\26\u00e0\3\2\2\2\30\u00fc\3"+
		"\2\2\2\32\u010d\3\2\2\2\34\u010f\3\2\2\2\36\u0114\3\2\2\2 \u0121\3\2\2"+
		"\2\"\u013d\3\2\2\2$\u0148\3\2\2\2&\u01bb\3\2\2\2(\u01ea\3\2\2\2*\u01f1"+
		"\3\2\2\2,\u01fc\3\2\2\2.\u01ff\3\2\2\2\60\u0207\3\2\2\2\62\u020c\3\2\2"+
		"\2\64\u020f\3\2\2\2\66\u0213\3\2\2\28\u022f\3\2\2\2:\u023c\3\2\2\2<=\7"+
		"(\2\2=>\5\2\2\2>?\b\2\1\2?G\3\2\2\2@A\5\60\31\2AB\b\2\1\2BG\3\2\2\2CD"+
		"\5\22\n\2DE\b\2\1\2EG\3\2\2\2F<\3\2\2\2F@\3\2\2\2FC\3\2\2\2G\3\3\2\2\2"+
		"HI\5\20\t\2IJ\b\3\1\2JR\3\2\2\2KL\79\2\2LR\b\3\1\2MN\78\2\2NR\b\3\1\2"+
		"OP\7\65\2\2PR\b\3\1\2QH\3\2\2\2QK\3\2\2\2QM\3\2\2\2QO\3\2\2\2R\5\3\2\2"+
		"\2ST\7\23\2\2TU\7\13\2\2UV\5:\36\2VW\b\4\1\2Wh\3\2\2\2XY\5\32\16\2YZ\b"+
		"\4\1\2Zh\3\2\2\2[\\\7\23\2\2\\]\5\6\4\2]^\b\4\1\2^h\3\2\2\2_a\5\32\16"+
		"\2`b\5*\26\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\b\4\1"+
		"\2fh\3\2\2\2gS\3\2\2\2gX\3\2\2\2g[\3\2\2\2g_\3\2\2\2h\7\3\2\2\2ij\b\5"+
		"\1\2jk\7;\2\2kl\5\b\5\4lm\b\5\1\2m\u009c\3\2\2\2no\5\20\t\2op\b\5\1\2"+
		"p\u009c\3\2\2\2qr\7\'\2\2rs\5\16\b\2st\7\22\2\2tu\b\5\1\2u\u009c\3\2\2"+
		"\2vw\7\'\2\2wx\5\30\r\2xy\7\22\2\2yz\b\5\1\2z\u009c\3\2\2\2{|\7\n\2\2"+
		"|~\5\b\5\2}\177\5\36\20\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7\60\2\2\u0083\u0084\b"+
		"\5\1\2\u0084\u009c\3\2\2\2\u0085\u0086\5\n\6\2\u0086\u0087\b\5\1\2\u0087"+
		"\u009c\3\2\2\2\u0088\u0089\7\n\2\2\u0089\u008a\5\b\5\2\u008a\u008b\7&"+
		"\2\2\u008b\u008c\5\26\f\2\u008c\u008d\7\60\2\2\u008d\u008e\b\5\1\2\u008e"+
		"\u009c\3\2\2\2\u008f\u0090\7\67\2\2\u0090\u009c\b\5\1\2\u0091\u0092\5"+
		"\4\3\2\u0092\u0093\b\5\1\2\u0093\u009c\3\2\2\2\u0094\u0095\7\n\2\2\u0095"+
		"\u0096\5\b\5\2\u0096\u0097\7\60\2\2\u0097\u0098\b\5\1\2\u0098\u009c\3"+
		"\2\2\2\u0099\u009a\7;\2\2\u009a\u009c\b\5\1\2\u009bi\3\2\2\2\u009bn\3"+
		"\2\2\2\u009bq\3\2\2\2\u009bv\3\2\2\2\u009b{\3\2\2\2\u009b\u0085\3\2\2"+
		"\2\u009b\u0088\3\2\2\2\u009b\u008f\3\2\2\2\u009b\u0091\3\2\2\2\u009b\u0094"+
		"\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u00a9\3\2\2\2\u009d\u009e\f\b\2\2\u009e"+
		"\u009f\7(\2\2\u009f\u00a0\5\b\5\t\u00a0\u00a1\b\5\1\2\u00a1\u00a8\3\2"+
		"\2\2\u00a2\u00a3\f\7\2\2\u00a3\u00a4\7\32\2\2\u00a4\u00a5\5\n\6\2\u00a5"+
		"\u00a6\b\5\1\2\u00a6\u00a8\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7\u00a2\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\t\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\7:\2\2\u00ad\u00ae\b\6\1\2"+
		"\u00ae\13\3\2\2\2\u00af\u00b0\5&\24\2\u00b0\u00b1\b\7\1\2\u00b1\u00b6"+
		"\3\2\2\2\u00b2\u00b3\5\6\4\2\u00b3\u00b4\b\7\1\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00af\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6\r\3\2\2\2\u00b7\u00b8\5\b\5\2"+
		"\u00b8\u00b9\b\b\1\2\u00b9\u00c0\3\2\2\2\u00ba\u00bb\5\b\5\2\u00bb\u00bc"+
		"\7\35\2\2\u00bc\u00bd\5\16\b\2\u00bd\u00be\b\b\1\2\u00be\u00c0\3\2\2\2"+
		"\u00bf\u00b7\3\2\2\2\u00bf\u00ba\3\2\2\2\u00c0\17\3\2\2\2\u00c1\u00c2"+
		"\7\66\2\2\u00c2\u00c3\b\t\1\2\u00c3\21\3\2\2\2\u00c4\u00c5\5\b\5\2\u00c5"+
		"\u00c6\7$\2\2\u00c6\u00c7\5&\24\2\u00c7\u00c8\b\n\1\2\u00c8\23\3\2\2\2"+
		"\u00c9\u00ca\5&\24\2\u00ca\u00cb\7\35\2\2\u00cb\u00cc\5\24\13\2\u00cc"+
		"\u00cd\b\13\1\2\u00cd\u00d4\3\2\2\2\u00ce\u00cf\5&\24\2\u00cf\u00d0\7"+
		"\35\2\2\u00d0\u00d1\5&\24\2\u00d1\u00d2\b\13\1\2\u00d2\u00d4\3\2\2\2\u00d3"+
		"\u00c9\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d4\25\3\2\2\2\u00d5\u00d6\b\f\1"+
		"\2\u00d6\u00d7\7\n\2\2\u00d7\u00d8\5\26\f\2\u00d8\u00d9\7\60\2\2\u00d9"+
		"\u00da\b\f\1\2\u00da\u00e1\3\2\2\2\u00db\u00dc\7:\2\2\u00dc\u00e1\b\f"+
		"\1\2\u00dd\u00de\7\"\2\2\u00de\u00df\7:\2\2\u00df\u00e1\b\f\1\2\u00e0"+
		"\u00d5\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e1\u00f1\3\2"+
		"\2\2\u00e2\u00e3\f\3\2\2\u00e3\u00e4\7$\2\2\u00e4\u00e5\5\26\f\4\u00e5"+
		"\u00e6\b\f\1\2\u00e6\u00f0\3\2\2\2\u00e7\u00e9\f\4\2\2\u00e8\u00ea\5\66"+
		"\34\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\f\1\2\u00ee\u00f0\3\2"+
		"\2\2\u00ef\u00e2\3\2\2\2\u00ef\u00e7\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\27\3\2\2\2\u00f3\u00f1\3\2\2"+
		"\2\u00f4\u00f5\5\b\5\2\u00f5\u00f6\7\6\2\2\u00f6\u00f7\5\30\r\2\u00f7"+
		"\u00f8\b\r\1\2\u00f8\u00fd\3\2\2\2\u00f9\u00fa\5\b\5\2\u00fa\u00fb\b\r"+
		"\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00f4\3\2\2\2\u00fc\u00f9\3\2\2\2\u00fd"+
		"\31\3\2\2\2\u00fe\u00ff\5\b\5\2\u00ff\u0100\7\7\2\2\u0100\u0101\5&\24"+
		"\2\u0101\u0102\b\16\1\2\u0102\u010e\3\2\2\2\u0103\u0105\5\n\6\2\u0104"+
		"\u0106\5\b\5\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7\7\2\2\u010a"+
		"\u010b\5&\24\2\u010b\u010c\b\16\1\2\u010c\u010e\3\2\2\2\u010d\u00fe\3"+
		"\2\2\2\u010d\u0103\3\2\2\2\u010e\33\3\2\2\2\u010f\u0110\5\6\4\2\u0110"+
		"\u0111\7.\2\2\u0111\u0112\5&\24\2\u0112\u0113\b\17\1\2\u0113\35\3\2\2"+
		"\2\u0114\u0115\7\f\2\2\u0115\u0116\5\b\5\2\u0116\u0117\b\20\1\2\u0117"+
		"\37\3\2\2\2\u0118\u0119\5\f\7\2\u0119\u011a\7\21\2\2\u011a\u011b\5 \21"+
		"\2\u011b\u011c\b\21\1\2\u011c\u0122\3\2\2\2\u011d\u011e\5\f\7\2\u011e"+
		"\u011f\7\21\2\2\u011f\u0120\b\21\1\2\u0120\u0122\3\2\2\2\u0121\u0118\3"+
		"\2\2\2\u0121\u011d\3\2\2\2\u0122!\3\2\2\2\u0123\u0124\b\22\1\2\u0124\u0125"+
		"\7\25\2\2\u0125\u0126\5\2\2\2\u0126\u0127\b\22\1\2\u0127\u013e\3\2\2\2"+
		"\u0128\u0129\7-\2\2\u0129\u012a\5\"\22\2\u012a\u012b\7/\2\2\u012b\u012c"+
		"\b\22\1\2\u012c\u013e\3\2\2\2\u012d\u012e\5\n\6\2\u012e\u012f\b\22\1\2"+
		"\u012f\u013e\3\2\2\2\u0130\u0131\7\n\2\2\u0131\u0132\5\"\22\2\u0132\u0133"+
		"\7\60\2\2\u0133\u0134\b\22\1\2\u0134\u013e\3\2\2\2\u0135\u0136\7\3\2\2"+
		"\u0136\u0137\5\22\n\2\u0137\u0138\b\22\1\2\u0138\u013e\3\2\2\2\u0139\u013a"+
		"\7\3\2\2\u013a\u013b\5.\30\2\u013b\u013c\b\22\1\2\u013c\u013e\3\2\2\2"+
		"\u013d\u0123\3\2\2\2\u013d\u0128\3\2\2\2\u013d\u012d\3\2\2\2\u013d\u0130"+
		"\3\2\2\2\u013d\u0135\3\2\2\2\u013d\u0139\3\2\2\2\u013e\u0145\3\2\2\2\u013f"+
		"\u0140\f\7\2\2\u0140\u0141\5&\24\2\u0141\u0142\b\22\1\2\u0142\u0144\3"+
		"\2\2\2\u0143\u013f\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146#\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7\61\2\2"+
		"\u0149\u014a\58\35\2\u014a\u014b\b\23\1\2\u014b%\3\2\2\2\u014c\u014d\b"+
		"\24\1\2\u014d\u014e\7!\2\2\u014e\u014f\5&\24\35\u014f\u0150\b\24\1\2\u0150"+
		"\u01bc\3\2\2\2\u0151\u0152\7\62\2\2\u0152\u0153\5&\24\23\u0153\u0154\b"+
		"\24\1\2\u0154\u01bc\3\2\2\2\u0155\u0156\7\63\2\2\u0156\u0157\5&\24\22"+
		"\u0157\u0158\b\24\1\2\u0158\u01bc\3\2\2\2\u0159\u015a\7\36\2\2\u015a\u015b"+
		"\5&\24\2\u015b\u015c\7\27\2\2\u015c\u015d\5&\24\2\u015d\u015e\7,\2\2\u015e"+
		"\u015f\5&\24\13\u015f\u0160\b\24\1\2\u0160\u01bc\3\2\2\2\u0161\u0162\7"+
		"\36\2\2\u0162\u0163\5&\24\2\u0163\u0164\7\27\2\2\u0164\u0165\5&\24\n\u0165"+
		"\u0166\b\24\1\2\u0166\u01bc\3\2\2\2\u0167\u0168\5\n\6\2\u0168\u0169\b"+
		"\24\1\2\u0169\u01bc\3\2\2\2\u016a\u016b\5\4\3\2\u016b\u016c\b\24\1\2\u016c"+
		"\u01bc\3\2\2\2\u016d\u016e\7\n\2\2\u016e\u016f\5&\24\2\u016f\u0170\7\60"+
		"\2\2\u0170\u0171\b\24\1\2\u0171\u01bc\3\2\2\2\u0172\u0173\7-\2\2\u0173"+
		"\u0174\5&\24\2\u0174\u0175\7/\2\2\u0175\u0176\b\24\1\2\u0176\u01bc\3\2"+
		"\2\2\u0177\u0178\7\n\2\2\u0178\u0179\5&\24\2\u0179\u017a\7&\2\2\u017a"+
		"\u017b\5\26\f\2\u017b\u017c\7\60\2\2\u017c\u017d\b\24\1\2\u017d\u01bc"+
		"\3\2\2\2\u017e\u017f\7\n\2\2\u017f\u0181\5&\24\2\u0180\u0182\5\64\33\2"+
		"\u0181\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7\60\2\2\u0186\u0187\b\24\1\2"+
		"\u0187\u01bc\3\2\2\2\u0188\u0189\7\'\2\2\u0189\u018a\5\24\13\2\u018a\u018b"+
		"\7\22\2\2\u018b\u018c\b\24\1\2\u018c\u01bc\3\2\2\2\u018d\u018e\7\'\2\2"+
		"\u018e\u018f\5&\24\2\u018f\u0190\7\22\2\2\u0190\u0191\b\24\1\2\u0191\u01bc"+
		"\3\2\2\2\u0192\u0193\7\4\2\2\u0193\u0194\5&\24\2\u0194\u0195\7\t\2\2\u0195"+
		"\u0196\5&\24\2\u0196\u0197\7\r\2\2\u0197\u0198\b\24\1\2\u0198\u01bc\3"+
		"\2\2\2\u0199\u019a\7\b\2\2\u019a\u019b\5\n\6\2\u019b\u019c\7\7\2\2\u019c"+
		"\u019d\5&\24\2\u019d\u019e\7\26\2\2\u019e\u019f\5&\24\2\u019f\u01a0\7"+
		"\t\2\2\u01a0\u01a1\5&\24\2\u01a1\u01a2\7\r\2\2\u01a2\u01a3\b\24\1\2\u01a3"+
		"\u01bc\3\2\2\2\u01a4\u01a5\7\b\2\2\u01a5\u01a6\5\n\6\2\u01a6\u01a7\7\7"+
		"\2\2\u01a7\u01a8\5&\24\2\u01a8\u01a9\7%\2\2\u01a9\u01aa\5&\24\2\u01aa"+
		"\u01ab\7\t\2\2\u01ab\u01ac\5&\24\2\u01ac\u01ad\7\r\2\2\u01ad\u01ae\b\24"+
		"\1\2\u01ae\u01bc\3\2\2\2\u01af\u01b0\7\24\2\2\u01b0\u01b1\5&\24\2\u01b1"+
		"\u01b2\7)\2\2\u01b2\u01b3\5\2\2\2\u01b3\u01b4\b\24\1\2\u01b4\u01bc\3\2"+
		"\2\2\u01b5\u01b6\5\"\22\2\u01b6\u01b7\b\24\1\2\u01b7\u01bc\3\2\2\2\u01b8"+
		"\u01b9\5\34\17\2\u01b9\u01ba\b\24\1\2\u01ba\u01bc\3\2\2\2\u01bb\u014c"+
		"\3\2\2\2\u01bb\u0151\3\2\2\2\u01bb\u0155\3\2\2\2\u01bb\u0159\3\2\2\2\u01bb"+
		"\u0161\3\2\2\2\u01bb\u0167\3\2\2\2\u01bb\u016a\3\2\2\2\u01bb\u016d\3\2"+
		"\2\2\u01bb\u0172\3\2\2\2\u01bb\u0177\3\2\2\2\u01bb\u017e\3\2\2\2\u01bb"+
		"\u0188\3\2\2\2\u01bb\u018d\3\2\2\2\u01bb\u0192\3\2\2\2\u01bb\u0199\3\2"+
		"\2\2\u01bb\u01a4\3\2\2\2\u01bb\u01af\3\2\2\2\u01bb\u01b5\3\2\2\2\u01bb"+
		"\u01b8\3\2\2\2\u01bc\u01e7\3\2\2\2\u01bd\u01be\f\26\2\2\u01be\u01bf\7"+
		"\6\2\2\u01bf\u01c0\5&\24\26\u01c0\u01c1\b\24\1\2\u01c1\u01e6\3\2\2\2\u01c2"+
		"\u01c3\f\21\2\2\u01c3\u01c4\7\16\2\2\u01c4\u01c5\5&\24\22\u01c5\u01c6"+
		"\b\24\1\2\u01c6\u01e6\3\2\2\2\u01c7\u01c8\f\20\2\2\u01c8\u01c9\t\2\2\2"+
		"\u01c9\u01ca\5&\24\21\u01ca\u01cb\b\24\1\2\u01cb\u01e6\3\2\2\2\u01cc\u01cd"+
		"\f\17\2\2\u01cd\u01ce\t\3\2\2\u01ce\u01cf\5&\24\20\u01cf\u01d0\b\24\1"+
		"\2\u01d0\u01e6\3\2\2\2\u01d1\u01d2\f\16\2\2\u01d2\u01d3\t\4\2\2\u01d3"+
		"\u01d4\5&\24\17\u01d4\u01d5\b\24\1\2\u01d5\u01e6\3\2\2\2\u01d6\u01d7\f"+
		"\r\2\2\u01d7\u01d8\t\5\2\2\u01d8\u01d9\5&\24\16\u01d9\u01da\b\24\1\2\u01da"+
		"\u01e6\3\2\2\2\u01db\u01dc\f\f\2\2\u01dc\u01dd\t\6\2\2\u01dd\u01de\5&"+
		"\24\r\u01de\u01df\b\24\1\2\u01df\u01e6\3\2\2\2\u01e0\u01e1\f\6\2\2\u01e1"+
		"\u01e2\7\35\2\2\u01e2\u01e3\5&\24\7\u01e3\u01e4\b\24\1\2\u01e4\u01e6\3"+
		"\2\2\2\u01e5\u01bd\3\2\2\2\u01e5\u01c2\3\2\2\2\u01e5\u01c7\3\2\2\2\u01e5"+
		"\u01cc\3\2\2\2\u01e5\u01d1\3\2\2\2\u01e5\u01d6\3\2\2\2\u01e5\u01db\3\2"+
		"\2\2\u01e5\u01e0\3\2\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7"+
		"\u01e8\3\2\2\2\u01e8\'\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01eb\5\n\6\2"+
		"\u01eb\u01ec\7\7\2\2\u01ec\u01ed\7:\2\2\u01ed\u01ee\7\33\2\2\u01ee\u01ef"+
		"\5\26\f\2\u01ef\u01f0\b\25\1\2\u01f0)\3\2\2\2\u01f1\u01f2\7\61\2\2\u01f2"+
		"\u01f3\5\32\16\2\u01f3\u01f4\b\26\1\2\u01f4+\3\2\2\2\u01f5\u01f6\7;\2"+
		"\2\u01f6\u01f7\7\33\2\2\u01f7\u01f8\5\26\f\2\u01f8\u01f9\b\27\1\2\u01f9"+
		"\u01fd\3\2\2\2\u01fa\u01fb\7;\2\2\u01fb\u01fd\b\27\1\2\u01fc\u01f5\3\2"+
		"\2\2\u01fc\u01fa\3\2\2\2\u01fd-\3\2\2\2\u01fe\u0200\5\b\5\2\u01ff\u01fe"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0204\7$\2\2\u0204\u0205\5&\24\2\u0205\u0206\b\30"+
		"\1\2\u0206/\3\2\2\2\u0207\u0208\5\22\n\2\u0208\u0209\7(\2\2\u0209\u020a"+
		"\5\2\2\2\u020a\u020b\b\31\1\2\u020b\61\3\2\2\2\u020c\u020d\5 \21\2\u020d"+
		"\u020e\b\32\1\2\u020e\63\3\2\2\2\u020f\u0210\7\f\2\2\u0210\u0211\5&\24"+
		"\2\u0211\u0212\b\33\1\2\u0212\65\3\2\2\2\u0213\u0214\7#\2\2\u0214\u0215"+
		"\5\26\f\2\u0215\u0216\b\34\1\2\u0216\67\3\2\2\2\u0217\u0218\5\n\6\2\u0218"+
		"\u0219\7\7\2\2\u0219\u021a\5&\24\2\u021a\u021b\b\35\1\2\u021b\u0230\3"+
		"\2\2\2\u021c\u021d\7\n\2\2\u021d\u021e\5\n\6\2\u021e\u021f\7&\2\2\u021f"+
		"\u0220\5\26\f\2\u0220\u0221\7\60\2\2\u0221\u0222\7\7\2\2\u0222\u0223\5"+
		"&\24\2\u0223\u0224\b\35\1\2\u0224\u0230\3\2\2\2\u0225\u0227\5\n\6\2\u0226"+
		"\u0228\5\b\5\2\u0227\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022c\7\7\2\2\u022c"+
		"\u022d\5&\24\2\u022d\u022e\b\35\1\2\u022e\u0230\3\2\2\2\u022f\u0217\3"+
		"\2\2\2\u022f\u021c\3\2\2\2\u022f\u0225\3\2\2\2\u02309\3\2\2\2\u0231\u0232"+
		"\58\35\2\u0232\u0233\b\36\1\2\u0233\u023d\3\2\2\2\u0234\u0236\58\35\2"+
		"\u0235\u0237\5$\23\2\u0236\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0236"+
		"\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\b\36\1\2"+
		"\u023b\u023d\3\2\2\2\u023c\u0231\3\2\2\2\u023c\u0234\3\2\2\2\u023d;\3"+
		"\2\2\2!FQcg\u0080\u009b\u00a7\u00a9\u00b5\u00bf\u00d3\u00e0\u00eb\u00ef"+
		"\u00f1\u00fc\u0107\u010d\u0121\u013d\u0145\u0183\u01bb\u01e5\u01e7\u01fc"+
		"\u0201\u0229\u022f\u0238\u023c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}