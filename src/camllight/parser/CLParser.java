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
		T__51=1, T__50=2, T__49=3, T__48=4, T__47=5, T__46=6, T__45=7, T__44=8, 
		T__43=9, T__42=10, T__41=11, T__40=12, T__39=13, T__38=14, T__37=15, T__36=16, 
		T__35=17, T__34=18, T__33=19, T__32=20, T__31=21, T__30=22, T__29=23, 
		T__28=24, T__27=25, T__26=26, T__25=27, T__24=28, T__23=29, T__22=30, 
		T__21=31, T__20=32, T__19=33, T__18=34, T__17=35, T__16=36, T__15=37, 
		T__14=38, T__13=39, T__12=40, T__11=41, T__10=42, T__9=43, T__8=44, T__7=45, 
		T__6=46, T__5=47, T__4=48, T__3=49, T__2=50, T__1=51, T__0=52, WS=53, 
		NULLTOKEN=54, EMPTYLISTTOKEN=55, WILDCARDTOKEN=56, EMPTYVECTORTOKEN=57, 
		BOOLTOKEN=58, NUMTOKEN=59, IDTOKEN=60, CONSTRTOKEN=61;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'while'", "'&&'", "'::'", "'='", "'for'", "'do'", 
		"'('", "'rec'", "','", "'done'", "'mod'", "'>='", "'<'", "']|'", "';;'", 
		"']'", "'|]'", "'let'", "'match'", "'function'", "'downto'", "'then'", 
		"'+'", "'/'", "'as'", "'of'", "'||'", "';'", "'if'", "'<='", "'[|'", "'&'", 
		"'print'", "'''", "'*'", "'->'", "'to'", "':'", "'['", "'|'", "'with'", 
		"'>'", "'or'", "'else'", "'begin'", "'in'", "'end'", "')'", "'and'", "'not'", 
		"'-'", "WS", "NULLTOKEN", "EMPTYLISTTOKEN", "'_'", "EMPTYVECTORTOKEN", 
		"BOOLTOKEN", "NUMTOKEN", "IDTOKEN", "CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decl = 2, RULE_patt = 3, RULE_ident = 4, 
		RULE_declorexp = 5, RULE_pattlist = 6, RULE_emptylist = 7, RULE_pattmatchsingle = 8, 
		RULE_explist = 9, RULE_type = 10, RULE_vectorremainderexp = 11, RULE_headtaillistpatt = 12, 
		RULE_declmono = 13, RULE_letExp = 14, RULE_patttuple = 15, RULE_declimpl = 16, 
		RULE_function = 17, RULE_recanddecl = 18, RULE_exp = 19, RULE_decllabelsandvariants = 20, 
		RULE_anddecl = 21, RULE_varianttype = 22, RULE_pattmatchcurried = 23, 
		RULE_prog = 24, RULE_exptuple = 25, RULE_tupletypelist = 26, RULE_recdeclmono = 27, 
		RULE_recdecl = 28;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decl", "patt", "ident", "declorexp", "pattlist", 
		"emptylist", "pattmatchsingle", "explist", "type", "vectorremainderexp", 
		"headtaillistpatt", "declmono", "letExp", "patttuple", "declimpl", "function", 
		"recanddecl", "exp", "decllabelsandvariants", "anddecl", "varianttype", 
		"pattmatchcurried", "prog", "exptuple", "tupletypelist", "recdeclmono", 
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
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchContext pattmatch_1;
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
			setState(70);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); match(41);
				setState(59); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				setState(63); match(41);
				setState(64); ((PattmatchContext)_localctx).pattmatch_1 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchMulti((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle),(((PattmatchContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle));
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
		public Token NULLTOKEN_0;
		public Token BOOLTOKEN_0;
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
			setState(81);
			switch (_input.LA(1)) {
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
				}
				break;
			case NUMTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); ((ConstantContext)_localctx).NUMTOKEN_0 = match(NUMTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(numtoken((((ConstantContext)_localctx).NUMTOKEN_0!=null?((ConstantContext)_localctx).NUMTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(79); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
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
		public RecdeclContext recdecl_0;
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
			setState(103);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86); match(19);
				setState(87); match(9);
				setState(88); ((DeclContext)_localctx).recdecl_0 = recdecl();
				((DeclContext)_localctx)._decl =  builder.declRec((((DeclContext)_localctx).recdecl_0._recdecl));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91); match(19);
				setState(92); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(95); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(97); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(96); ((DeclContext)_localctx).anddecl = anddecl();
					((DeclContext)_localctx).anddecl_1_list.add(((DeclContext)_localctx).anddecl);
					}
					}
					setState(99); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==50 );
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
		public TypeContext type_1;
		public ConstantContext constant_0;
		public IdentContext ident_0;
		public Token WILDCARDTOKEN_0;
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
			setState(155);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(106); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(107); ((PattContext)_localctx).patt_1 = patt(2);
				((PattContext)_localctx)._patt =  builder.pattConstrPatt(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt));
				}
				break;

			case 2:
				{
				setState(110); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 3:
				{
				setState(113); match(40);
				setState(114); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(115); match(17);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 4:
				{
				setState(118); match(40);
				setState(119); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(120); match(17);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;

			case 5:
				{
				setState(123); match(8);
				setState(124); ((PattContext)_localctx).patt_0 = patt(0);
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(125); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==10 );
				setState(130); match(49);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 6:
				{
				setState(133); match(8);
				setState(134); ((PattContext)_localctx).patt_0 = patt(0);
				setState(135); match(39);
				setState(136); ((PattContext)_localctx).type_1 = type(0);
				setState(137); match(49);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 7:
				{
				setState(140); match(8);
				setState(141); ((PattContext)_localctx).patt_0 = patt(0);
				setState(142); match(49);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 8:
				{
				setState(145); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 9:
				{
				setState(148); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 10:
				{
				setState(151); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 11:
				{
				setState(153); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((PattContext)_localctx)._patt =  builder.pattConstr(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(167);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(157);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(158); match(41);
						setState(159); ((PattContext)_localctx).patt_1 = patt(7);
						((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).patt_1._patt));
						}
						break;

					case 2:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(162);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(163); match(26);
						setState(164); ((PattContext)_localctx).ident_1 = ident();
						((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
						}
						break;
					}
					} 
				}
				setState(171);
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
			setState(172); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
			setState(181);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178); ((DeclorexpContext)_localctx).decl_0 = decl();
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
			setState(191);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(184); match(29);
				setState(185); ((PattlistContext)_localctx).pattlist_1 = pattlist();
				((PattlistContext)_localctx)._pattlist =  builder.pattListMulti((((PattlistContext)_localctx).patt_0._patt),(((PattlistContext)_localctx).pattlist_1._pattlist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); ((PattlistContext)_localctx).patt_0 = patt(0);
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
			setState(193); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
			setState(196); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(197); match(37);
			setState(198); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
			setState(211);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(201); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(202); match(29);
				setState(203); ((ExplistContext)_localctx).explist_1 = explist();
				((ExplistContext)_localctx)._explist =  builder.innerExpListMulti((((ExplistContext)_localctx).exp_0._exp),(((ExplistContext)_localctx).explist_1._explist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(207); match(29);
				setState(208); ((ExplistContext)_localctx).exp_1 = exp(0);
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
			setState(224);
			switch (_input.LA(1)) {
			case IDTOKEN:
				{
				setState(214); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			case 8:
				{
				setState(216); match(8);
				setState(217); ((TypeContext)_localctx).type_0 = type(0);
				setState(218); match(49);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;
			case 35:
				{
				setState(221); match(35);
				setState(222); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.varType(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(226);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(227); match(37);
						setState(228); ((TypeContext)_localctx).type_1 = type(4);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(231);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(233); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(232); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(235); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.tupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;
					}
					} 
				}
				setState(243);
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

	public static class VectorremainderexpContext extends ParserRuleContext {
		public Object _vectorremainderexp;
		public ExpContext exp_0;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public VectorremainderexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorremainderexp; }
	}

	public final VectorremainderexpContext vectorremainderexp() throws RecognitionException {
		VectorremainderexpContext _localctx = new VectorremainderexpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vectorremainderexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244); match(29);
			setState(245); ((VectorremainderexpContext)_localctx).exp_0 = exp(0);
			((VectorremainderexpContext)_localctx)._vectorremainderexp =  builder.vectorRemainder((((VectorremainderexpContext)_localctx).exp_0._exp));
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
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(248); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(249); match(4);
				setState(250); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
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
			setState(273);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(259); match(5);
				setState(260); ((DeclmonoContext)_localctx).exp_1 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMono((((DeclmonoContext)_localctx).patt_0._patt),(((DeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(264); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(267); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 40) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN) | (1L << CONSTRTOKEN))) != 0) );
				setState(269); match(5);
				setState(270); ((DeclmonoContext)_localctx).exp_2 = exp(0);
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
			setState(275); ((LetExpContext)_localctx).decl_0 = decl();
			setState(276); match(47);
			setState(277); ((LetExpContext)_localctx).exp_1 = exp(0);
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
			setState(280); match(10);
			setState(281); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
			setState(293);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(285); match(16);
				setState(286); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(290); match(16);
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
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(296); match(21);
				setState(297); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(300); match(46);
				setState(301); ((FunctionContext)_localctx).function_0 = function(0);
				setState(302); match(48);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(305); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(308); match(8);
				setState(309); ((FunctionContext)_localctx).function_0 = function(0);
				setState(310); match(49);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(313); match(1);
				setState(314); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(317); match(1);
				setState(318); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(329);
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
					setState(323);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(324); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(331);
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
			setState(332); match(50);
			setState(333); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
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
		public VectorremainderexpContext vectorremainderexp;
		public List<VectorremainderexpContext> vectorremainderexp_1_list = new ArrayList<VectorremainderexpContext>();
		public Token EMPTYVECTORTOKEN_0;
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
		public LetExpContext letExp() {
			return getRuleContext(LetExpContext.class,0);
		}
		public VectorremainderexpContext vectorremainderexp(int i) {
			return getRuleContext(VectorremainderexpContext.class,i);
		}
		public List<ExptupleContext> exptuple() {
			return getRuleContexts(ExptupleContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public TerminalNode EMPTYVECTORTOKEN() { return getToken(CLParser.EMPTYVECTORTOKEN, 0); }
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<VectorremainderexpContext> vectorremainderexp() {
			return getRuleContexts(VectorremainderexpContext.class);
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
			setState(464);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(337); match(34);
				setState(338); ((ExpContext)_localctx).exp_0 = exp(30);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(341); match(51);
				setState(342); ((ExpContext)_localctx).exp_0 = exp(17);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 3:
				{
				setState(345); match(52);
				setState(346); ((ExpContext)_localctx).exp_0 = exp(16);
				((ExpContext)_localctx)._exp =  builder.intUnarySub((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(349); match(30);
				setState(350); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(351); match(23);
				setState(352); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(353); match(45);
				setState(354); ((ExpContext)_localctx).exp_2 = exp(9);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 5:
				{
				setState(357); match(30);
				setState(358); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(359); match(23);
				setState(360); ((ExpContext)_localctx).exp_1 = exp(8);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 6:
				{
				setState(363); match(32);
				setState(364); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(365); ((ExpContext)_localctx).vectorremainderexp = vectorremainderexp();
					((ExpContext)_localctx).vectorremainderexp_1_list.add(((ExpContext)_localctx).vectorremainderexp);
					}
					}
					setState(368); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==29 );
				setState(370); match(18);
				((ExpContext)_localctx)._exp =  builder.vectorMulti((((ExpContext)_localctx).exp_0._exp),lift("_vectorremainderexp", ((ExpContext)_localctx).vectorremainderexp_1_list));
				}
				break;

			case 7:
				{
				setState(373); match(32);
				setState(374); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(375); match(15);
				((ExpContext)_localctx)._exp =  builder.vector((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 8:
				{
				setState(378); ((ExpContext)_localctx).EMPTYVECTORTOKEN_0 = match(EMPTYVECTORTOKEN);
				((ExpContext)_localctx)._exp =  builder.emptyVector(emptyvectortoken((((ExpContext)_localctx).EMPTYVECTORTOKEN_0!=null?((ExpContext)_localctx).EMPTYVECTORTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(380); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 10:
				{
				setState(383); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 11:
				{
				setState(386); match(8);
				setState(387); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(388); match(49);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 12:
				{
				setState(391); match(46);
				setState(392); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(393); match(48);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(396); match(8);
				setState(397); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(398); match(39);
				setState(399); ((ExpContext)_localctx).type_1 = type(0);
				setState(400); match(49);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 14:
				{
				setState(403); match(8);
				setState(404); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(406); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(405); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(408); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==10 );
				setState(410); match(49);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;

			case 15:
				{
				setState(413); match(40);
				setState(414); ((ExpContext)_localctx).explist_0 = explist();
				setState(415); match(17);
				((ExpContext)_localctx)._exp =  builder.expList((((ExpContext)_localctx).explist_0._explist));
				}
				break;

			case 16:
				{
				setState(418); match(40);
				setState(419); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(420); match(17);
				((ExpContext)_localctx)._exp =  builder.expListSingle((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 17:
				{
				setState(423); match(2);
				setState(424); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(425); match(7);
				setState(426); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(427); match(11);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 18:
				{
				setState(430); match(6);
				setState(431); ((ExpContext)_localctx).ident_0 = ident();
				setState(432); match(5);
				setState(433); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(434); match(22);
				setState(435); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(436); match(7);
				setState(437); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(438); match(11);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 19:
				{
				setState(441); match(6);
				setState(442); ((ExpContext)_localctx).ident_0 = ident();
				setState(443); match(5);
				setState(444); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(445); match(38);
				setState(446); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(447); match(7);
				setState(448); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(449); match(11);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 20:
				{
				setState(452); match(20);
				setState(453); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(454); match(42);
				setState(455); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 21:
				{
				setState(458); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 22:
				{
				setState(461); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(506);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(466);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(467); match(4);
						setState(468); ((ExpContext)_localctx).exp_1 = exp(20);
						((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(471);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(472); match(12);
						setState(473); ((ExpContext)_localctx).exp_1 = exp(16);
						((ExpContext)_localctx)._exp =  builder.intMod((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(476);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(477);
						((ExpContext)_localctx).op_1512 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==25 || _la==36) ) {
							((ExpContext)_localctx).op_1512 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(478); ((ExpContext)_localctx).exp_1 = exp(15);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/") ? builder.intDivide(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*") ? builder.intMultiply(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(481);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(482);
						((ExpContext)_localctx).op_1511 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==24 || _la==52) ) {
							((ExpContext)_localctx).op_1511 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(483); ((ExpContext)_localctx).exp_1 = exp(14);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+") ? builder.intAdd(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-") ? builder.intSub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(486);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(487);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 13) | (1L << 14) | (1L << 31) | (1L << 43))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(488); ((ExpContext)_localctx).exp_1 = exp(13);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(491);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(492);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==33) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(493); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(496);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(497);
						_la = _input.LA(1);
						if ( !(_la==28 || _la==44) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(498); ((ExpContext)_localctx).exp_1 = exp(11);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(501);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(502); match(29);
						setState(503); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
			setState(511); ((DecllabelsandvariantsContext)_localctx).ident_0 = ident();
			setState(512); match(5);
			setState(513); ((DecllabelsandvariantsContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
			setState(514); match(27);
			setState(515); ((DecllabelsandvariantsContext)_localctx).type_2 = type(0);
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
			setState(518); match(50);
			setState(519); ((AnddeclContext)_localctx).declmono_0 = declmono();
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
			setState(529);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(522); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(523); match(27);
				setState(524); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(527); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 46, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(531); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(534); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 40) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN) | (1L << CONSTRTOKEN))) != 0) );
			setState(536); match(37);
			setState(537); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
			setState(540); ((ProgContext)_localctx).declimpl_0 = declimpl();
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
			setState(543); match(10);
			setState(544); ((ExptupleContext)_localctx).exp_0 = exp(0);
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
			setState(547); match(36);
			setState(548); ((TupletypelistContext)_localctx).type_0 = type(0);
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
			setState(575);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(552); match(5);
				setState(553); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556); match(8);
				setState(557); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(558); match(39);
				setState(559); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(560); match(49);
				setState(561); match(5);
				setState(562); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclPattTypeExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).type_1._type),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(565); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(567); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(566); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(569); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 40) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN) | (1L << CONSTRTOKEN))) != 0) );
				setState(571); match(5);
				setState(572); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
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
			setState(588);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(577); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(579); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(578); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(581); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==50 );
				((RecdeclContext)_localctx)._recdecl =  builder.recAndDecl((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono),lift("_recanddecl", ((RecdeclContext)_localctx).recanddecl_1_list));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
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
		case 3: return patt_sempred((PattContext)_localctx, predIndex);

		case 10: return type_sempred((TypeContext)_localctx, predIndex);

		case 17: return function_sempred((FunctionContext)_localctx, predIndex);

		case 19: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean patt_sempred(PattContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);

		case 1: return precpred(_ctx, 7);
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
		case 2: return precpred(_ctx, 3);

		case 3: return precpred(_ctx, 5);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u0251\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2I\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3T\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\6\4d\n\4\r\4\16\4e\3\4\3\4\5\4j\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u0081\n\5\r\5\16"+
		"\5\u0082\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009e\n\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5\u00aa\n\5\f\5\16\5\u00ad\13\5\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7\u00b8\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00c2\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00d6\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00e3\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00ec\n"+
		"\f\r\f\16\f\u00ed\3\f\3\f\7\f\u00f2\n\f\f\f\16\f\u00f5\13\f\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0103\n\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\6\17\u010c\n\17\r\17\16\17\u010d\3\17\3\17"+
		"\3\17\3\17\5\17\u0114\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0128\n\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0144\n\23\3\23"+
		"\3\23\3\23\3\23\7\23\u014a\n\23\f\23\16\23\u014d\13\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\6\25\u0171\n\25\r\25\16\25\u0172\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\6\25\u0199\n\25\r\25\16\25\u019a\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01d3\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u01fd\n\25\f\25\16"+
		"\25\u0200\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0214\n\30\3\31\6\31\u0217\n"+
		"\31\r\31\16\31\u0218\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\6\35\u023a\n\35\r\35\16\35\u023b\3"+
		"\35\3\35\3\35\3\35\5\35\u0242\n\35\3\36\3\36\6\36\u0246\n\36\r\36\16\36"+
		"\u0247\3\36\3\36\3\36\3\36\3\36\5\36\u024f\n\36\3\36\2\6\b\26$(\37\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\7\4\2\33"+
		"\33&&\4\2\32\32\66\66\6\2\7\7\17\20!!--\4\2\5\5##\4\2\36\36..\u0281\2"+
		"H\3\2\2\2\4S\3\2\2\2\6i\3\2\2\2\b\u009d\3\2\2\2\n\u00ae\3\2\2\2\f\u00b7"+
		"\3\2\2\2\16\u00c1\3\2\2\2\20\u00c3\3\2\2\2\22\u00c6\3\2\2\2\24\u00d5\3"+
		"\2\2\2\26\u00e2\3\2\2\2\30\u00f6\3\2\2\2\32\u0102\3\2\2\2\34\u0113\3\2"+
		"\2\2\36\u0115\3\2\2\2 \u011a\3\2\2\2\"\u0127\3\2\2\2$\u0143\3\2\2\2&\u014e"+
		"\3\2\2\2(\u01d2\3\2\2\2*\u0201\3\2\2\2,\u0208\3\2\2\2.\u0213\3\2\2\2\60"+
		"\u0216\3\2\2\2\62\u021e\3\2\2\2\64\u0221\3\2\2\2\66\u0225\3\2\2\28\u0241"+
		"\3\2\2\2:\u024e\3\2\2\2<=\7+\2\2=>\5\2\2\2>?\b\2\1\2?I\3\2\2\2@A\5\22"+
		"\n\2AB\7+\2\2BC\5\2\2\2CD\b\2\1\2DI\3\2\2\2EF\5\22\n\2FG\b\2\1\2GI\3\2"+
		"\2\2H<\3\2\2\2H@\3\2\2\2HE\3\2\2\2I\3\3\2\2\2JK\5\20\t\2KL\b\3\1\2LT\3"+
		"\2\2\2MN\7=\2\2NT\b\3\1\2OP\78\2\2PT\b\3\1\2QR\7<\2\2RT\b\3\1\2SJ\3\2"+
		"\2\2SM\3\2\2\2SO\3\2\2\2SQ\3\2\2\2T\5\3\2\2\2UV\5\34\17\2VW\b\4\1\2Wj"+
		"\3\2\2\2XY\7\25\2\2YZ\7\13\2\2Z[\5:\36\2[\\\b\4\1\2\\j\3\2\2\2]^\7\25"+
		"\2\2^_\5\6\4\2_`\b\4\1\2`j\3\2\2\2ac\5\34\17\2bd\5,\27\2cb\3\2\2\2de\3"+
		"\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\b\4\1\2hj\3\2\2\2iU\3\2\2\2iX\3"+
		"\2\2\2i]\3\2\2\2ia\3\2\2\2j\7\3\2\2\2kl\b\5\1\2lm\7?\2\2mn\5\b\5\4no\b"+
		"\5\1\2o\u009e\3\2\2\2pq\5\20\t\2qr\b\5\1\2r\u009e\3\2\2\2st\7*\2\2tu\5"+
		"\16\b\2uv\7\23\2\2vw\b\5\1\2w\u009e\3\2\2\2xy\7*\2\2yz\5\32\16\2z{\7\23"+
		"\2\2{|\b\5\1\2|\u009e\3\2\2\2}~\7\n\2\2~\u0080\5\b\5\2\177\u0081\5 \21"+
		"\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\63\2\2\u0085\u0086\b\5\1\2"+
		"\u0086\u009e\3\2\2\2\u0087\u0088\7\n\2\2\u0088\u0089\5\b\5\2\u0089\u008a"+
		"\7)\2\2\u008a\u008b\5\26\f\2\u008b\u008c\7\63\2\2\u008c\u008d\b\5\1\2"+
		"\u008d\u009e\3\2\2\2\u008e\u008f\7\n\2\2\u008f\u0090\5\b\5\2\u0090\u0091"+
		"\7\63\2\2\u0091\u0092\b\5\1\2\u0092\u009e\3\2\2\2\u0093\u0094\5\4\3\2"+
		"\u0094\u0095\b\5\1\2\u0095\u009e\3\2\2\2\u0096\u0097\5\n\6\2\u0097\u0098"+
		"\b\5\1\2\u0098\u009e\3\2\2\2\u0099\u009a\7:\2\2\u009a\u009e\b\5\1\2\u009b"+
		"\u009c\7?\2\2\u009c\u009e\b\5\1\2\u009dk\3\2\2\2\u009dp\3\2\2\2\u009d"+
		"s\3\2\2\2\u009dx\3\2\2\2\u009d}\3\2\2\2\u009d\u0087\3\2\2\2\u009d\u008e"+
		"\3\2\2\2\u009d\u0093\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u0099\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u00ab\3\2\2\2\u009f\u00a0\f\b\2\2\u00a0\u00a1\7+"+
		"\2\2\u00a1\u00a2\5\b\5\t\u00a2\u00a3\b\5\1\2\u00a3\u00aa\3\2\2\2\u00a4"+
		"\u00a5\f\t\2\2\u00a5\u00a6\7\34\2\2\u00a6\u00a7\5\n\6\2\u00a7\u00a8\b"+
		"\5\1\2\u00a8\u00aa\3\2\2\2\u00a9\u009f\3\2\2\2\u00a9\u00a4\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\t\3\2\2\2"+
		"\u00ad\u00ab\3\2\2\2\u00ae\u00af\7>\2\2\u00af\u00b0\b\6\1\2\u00b0\13\3"+
		"\2\2\2\u00b1\u00b2\5(\25\2\u00b2\u00b3\b\7\1\2\u00b3\u00b8\3\2\2\2\u00b4"+
		"\u00b5\5\6\4\2\u00b5\u00b6\b\7\1\2\u00b6\u00b8\3\2\2\2\u00b7\u00b1\3\2"+
		"\2\2\u00b7\u00b4\3\2\2\2\u00b8\r\3\2\2\2\u00b9\u00ba\5\b\5\2\u00ba\u00bb"+
		"\7\37\2\2\u00bb\u00bc\5\16\b\2\u00bc\u00bd\b\b\1\2\u00bd\u00c2\3\2\2\2"+
		"\u00be\u00bf\5\b\5\2\u00bf\u00c0\b\b\1\2\u00c0\u00c2\3\2\2\2\u00c1\u00b9"+
		"\3\2\2\2\u00c1\u00be\3\2\2\2\u00c2\17\3\2\2\2\u00c3\u00c4\79\2\2\u00c4"+
		"\u00c5\b\t\1\2\u00c5\21\3\2\2\2\u00c6\u00c7\5\b\5\2\u00c7\u00c8\7\'\2"+
		"\2\u00c8\u00c9\5(\25\2\u00c9\u00ca\b\n\1\2\u00ca\23\3\2\2\2\u00cb\u00cc"+
		"\5(\25\2\u00cc\u00cd\7\37\2\2\u00cd\u00ce\5\24\13\2\u00ce\u00cf\b\13\1"+
		"\2\u00cf\u00d6\3\2\2\2\u00d0\u00d1\5(\25\2\u00d1\u00d2\7\37\2\2\u00d2"+
		"\u00d3\5(\25\2\u00d3\u00d4\b\13\1\2\u00d4\u00d6\3\2\2\2\u00d5\u00cb\3"+
		"\2\2\2\u00d5\u00d0\3\2\2\2\u00d6\25\3\2\2\2\u00d7\u00d8\b\f\1\2\u00d8"+
		"\u00d9\7>\2\2\u00d9\u00e3\b\f\1\2\u00da\u00db\7\n\2\2\u00db\u00dc\5\26"+
		"\f\2\u00dc\u00dd\7\63\2\2\u00dd\u00de\b\f\1\2\u00de\u00e3\3\2\2\2\u00df"+
		"\u00e0\7%\2\2\u00e0\u00e1\7>\2\2\u00e1\u00e3\b\f\1\2\u00e2\u00d7\3\2\2"+
		"\2\u00e2\u00da\3\2\2\2\u00e2\u00df\3\2\2\2\u00e3\u00f3\3\2\2\2\u00e4\u00e5"+
		"\f\5\2\2\u00e5\u00e6\7\'\2\2\u00e6\u00e7\5\26\f\6\u00e7\u00e8\b\f\1\2"+
		"\u00e8\u00f2\3\2\2\2\u00e9\u00eb\f\7\2\2\u00ea\u00ec\5\66\34\2\u00eb\u00ea"+
		"\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee"+
		"\u00ef\3\2\2\2\u00ef\u00f0\b\f\1\2\u00f0\u00f2\3\2\2\2\u00f1\u00e4\3\2"+
		"\2\2\u00f1\u00e9\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3"+
		"\u00f4\3\2\2\2\u00f4\27\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\37\2"+
		"\2\u00f7\u00f8\5(\25\2\u00f8\u00f9\b\r\1\2\u00f9\31\3\2\2\2\u00fa\u00fb"+
		"\5\b\5\2\u00fb\u00fc\7\6\2\2\u00fc\u00fd\5\32\16\2\u00fd\u00fe\b\16\1"+
		"\2\u00fe\u0103\3\2\2\2\u00ff\u0100\5\b\5\2\u0100\u0101\b\16\1\2\u0101"+
		"\u0103\3\2\2\2\u0102\u00fa\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\33\3\2\2"+
		"\2\u0104\u0105\5\b\5\2\u0105\u0106\7\7\2\2\u0106\u0107\5(\25\2\u0107\u0108"+
		"\b\17\1\2\u0108\u0114\3\2\2\2\u0109\u010b\5\n\6\2\u010a\u010c\5\b\5\2"+
		"\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\7\2\2\u0110\u0111\5(\25\2\u0111"+
		"\u0112\b\17\1\2\u0112\u0114\3\2\2\2\u0113\u0104\3\2\2\2\u0113\u0109\3"+
		"\2\2\2\u0114\35\3\2\2\2\u0115\u0116\5\6\4\2\u0116\u0117\7\61\2\2\u0117"+
		"\u0118\5(\25\2\u0118\u0119\b\20\1\2\u0119\37\3\2\2\2\u011a\u011b\7\f\2"+
		"\2\u011b\u011c\5\b\5\2\u011c\u011d\b\21\1\2\u011d!\3\2\2\2\u011e\u011f"+
		"\5\f\7\2\u011f\u0120\7\22\2\2\u0120\u0121\5\"\22\2\u0121\u0122\b\22\1"+
		"\2\u0122\u0128\3\2\2\2\u0123\u0124\5\f\7\2\u0124\u0125\7\22\2\2\u0125"+
		"\u0126\b\22\1\2\u0126\u0128\3\2\2\2\u0127\u011e\3\2\2\2\u0127\u0123\3"+
		"\2\2\2\u0128#\3\2\2\2\u0129\u012a\b\23\1\2\u012a\u012b\7\27\2\2\u012b"+
		"\u012c\5\2\2\2\u012c\u012d\b\23\1\2\u012d\u0144\3\2\2\2\u012e\u012f\7"+
		"\60\2\2\u012f\u0130\5$\23\2\u0130\u0131\7\62\2\2\u0131\u0132\b\23\1\2"+
		"\u0132\u0144\3\2\2\2\u0133\u0134\5\n\6\2\u0134\u0135\b\23\1\2\u0135\u0144"+
		"\3\2\2\2\u0136\u0137\7\n\2\2\u0137\u0138\5$\23\2\u0138\u0139\7\63\2\2"+
		"\u0139\u013a\b\23\1\2\u013a\u0144\3\2\2\2\u013b\u013c\7\3\2\2\u013c\u013d"+
		"\5\22\n\2\u013d\u013e\b\23\1\2\u013e\u0144\3\2\2\2\u013f\u0140\7\3\2\2"+
		"\u0140\u0141\5\60\31\2\u0141\u0142\b\23\1\2\u0142\u0144\3\2\2\2\u0143"+
		"\u0129\3\2\2\2\u0143\u012e\3\2\2\2\u0143\u0133\3\2\2\2\u0143\u0136\3\2"+
		"\2\2\u0143\u013b\3\2\2\2\u0143\u013f\3\2\2\2\u0144\u014b\3\2\2\2\u0145"+
		"\u0146\f\7\2\2\u0146\u0147\5(\25\2\u0147\u0148\b\23\1\2\u0148\u014a\3"+
		"\2\2\2\u0149\u0145\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c%\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7\64\2\2"+
		"\u014f\u0150\58\35\2\u0150\u0151\b\24\1\2\u0151\'\3\2\2\2\u0152\u0153"+
		"\b\25\1\2\u0153\u0154\7$\2\2\u0154\u0155\5(\25 \u0155\u0156\b\25\1\2\u0156"+
		"\u01d3\3\2\2\2\u0157\u0158\7\65\2\2\u0158\u0159\5(\25\23\u0159\u015a\b"+
		"\25\1\2\u015a\u01d3\3\2\2\2\u015b\u015c\7\66\2\2\u015c\u015d\5(\25\22"+
		"\u015d\u015e\b\25\1\2\u015e\u01d3\3\2\2\2\u015f\u0160\7 \2\2\u0160\u0161"+
		"\5(\25\2\u0161\u0162\7\31\2\2\u0162\u0163\5(\25\2\u0163\u0164\7/\2\2\u0164"+
		"\u0165\5(\25\13\u0165\u0166\b\25\1\2\u0166\u01d3\3\2\2\2\u0167\u0168\7"+
		" \2\2\u0168\u0169\5(\25\2\u0169\u016a\7\31\2\2\u016a\u016b\5(\25\n\u016b"+
		"\u016c\b\25\1\2\u016c\u01d3\3\2\2\2\u016d\u016e\7\"\2\2\u016e\u0170\5"+
		"(\25\2\u016f\u0171\5\30\r\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\7\24"+
		"\2\2\u0175\u0176\b\25\1\2\u0176\u01d3\3\2\2\2\u0177\u0178\7\"\2\2\u0178"+
		"\u0179\5(\25\2\u0179\u017a\7\21\2\2\u017a\u017b\b\25\1\2\u017b\u01d3\3"+
		"\2\2\2\u017c\u017d\7;\2\2\u017d\u01d3\b\25\1\2\u017e\u017f\5\n\6\2\u017f"+
		"\u0180\b\25\1\2\u0180\u01d3\3\2\2\2\u0181\u0182\5\4\3\2\u0182\u0183\b"+
		"\25\1\2\u0183\u01d3\3\2\2\2\u0184\u0185\7\n\2\2\u0185\u0186\5(\25\2\u0186"+
		"\u0187\7\63\2\2\u0187\u0188\b\25\1\2\u0188\u01d3\3\2\2\2\u0189\u018a\7"+
		"\60\2\2\u018a\u018b\5(\25\2\u018b\u018c\7\62\2\2\u018c\u018d\b\25\1\2"+
		"\u018d\u01d3\3\2\2\2\u018e\u018f\7\n\2\2\u018f\u0190\5(\25\2\u0190\u0191"+
		"\7)\2\2\u0191\u0192\5\26\f\2\u0192\u0193\7\63\2\2\u0193\u0194\b\25\1\2"+
		"\u0194\u01d3\3\2\2\2\u0195\u0196\7\n\2\2\u0196\u0198\5(\25\2\u0197\u0199"+
		"\5\64\33\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u0198\3\2\2\2"+
		"\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\7\63\2\2\u019d\u019e"+
		"\b\25\1\2\u019e\u01d3\3\2\2\2\u019f\u01a0\7*\2\2\u01a0\u01a1\5\24\13\2"+
		"\u01a1\u01a2\7\23\2\2\u01a2\u01a3\b\25\1\2\u01a3\u01d3\3\2\2\2\u01a4\u01a5"+
		"\7*\2\2\u01a5\u01a6\5(\25\2\u01a6\u01a7\7\23\2\2\u01a7\u01a8\b\25\1\2"+
		"\u01a8\u01d3\3\2\2\2\u01a9\u01aa\7\4\2\2\u01aa\u01ab\5(\25\2\u01ab\u01ac"+
		"\7\t\2\2\u01ac\u01ad\5(\25\2\u01ad\u01ae\7\r\2\2\u01ae\u01af\b\25\1\2"+
		"\u01af\u01d3\3\2\2\2\u01b0\u01b1\7\b\2\2\u01b1\u01b2\5\n\6\2\u01b2\u01b3"+
		"\7\7\2\2\u01b3\u01b4\5(\25\2\u01b4\u01b5\7\30\2\2\u01b5\u01b6\5(\25\2"+
		"\u01b6\u01b7\7\t\2\2\u01b7\u01b8\5(\25\2\u01b8\u01b9\7\r\2\2\u01b9\u01ba"+
		"\b\25\1\2\u01ba\u01d3\3\2\2\2\u01bb\u01bc\7\b\2\2\u01bc\u01bd\5\n\6\2"+
		"\u01bd\u01be\7\7\2\2\u01be\u01bf\5(\25\2\u01bf\u01c0\7(\2\2\u01c0\u01c1"+
		"\5(\25\2\u01c1\u01c2\7\t\2\2\u01c2\u01c3\5(\25\2\u01c3\u01c4\7\r\2\2\u01c4"+
		"\u01c5\b\25\1\2\u01c5\u01d3\3\2\2\2\u01c6\u01c7\7\26\2\2\u01c7\u01c8\5"+
		"(\25\2\u01c8\u01c9\7,\2\2\u01c9\u01ca\5\2\2\2\u01ca\u01cb\b\25\1\2\u01cb"+
		"\u01d3\3\2\2\2\u01cc\u01cd\5$\23\2\u01cd\u01ce\b\25\1\2\u01ce\u01d3\3"+
		"\2\2\2\u01cf\u01d0\5\36\20\2\u01d0\u01d1\b\25\1\2\u01d1\u01d3\3\2\2\2"+
		"\u01d2\u0152\3\2\2\2\u01d2\u0157\3\2\2\2\u01d2\u015b\3\2\2\2\u01d2\u015f"+
		"\3\2\2\2\u01d2\u0167\3\2\2\2\u01d2\u016d\3\2\2\2\u01d2\u0177\3\2\2\2\u01d2"+
		"\u017c\3\2\2\2\u01d2\u017e\3\2\2\2\u01d2\u0181\3\2\2\2\u01d2\u0184\3\2"+
		"\2\2\u01d2\u0189\3\2\2\2\u01d2\u018e\3\2\2\2\u01d2\u0195\3\2\2\2\u01d2"+
		"\u019f\3\2\2\2\u01d2\u01a4\3\2\2\2\u01d2\u01a9\3\2\2\2\u01d2\u01b0\3\2"+
		"\2\2\u01d2\u01bb\3\2\2\2\u01d2\u01c6\3\2\2\2\u01d2\u01cc\3\2\2\2\u01d2"+
		"\u01cf\3\2\2\2\u01d3\u01fe\3\2\2\2\u01d4\u01d5\f\26\2\2\u01d5\u01d6\7"+
		"\6\2\2\u01d6\u01d7\5(\25\26\u01d7\u01d8\b\25\1\2\u01d8\u01fd\3\2\2\2\u01d9"+
		"\u01da\f\21\2\2\u01da\u01db\7\16\2\2\u01db\u01dc\5(\25\22\u01dc\u01dd"+
		"\b\25\1\2\u01dd\u01fd\3\2\2\2\u01de\u01df\f\20\2\2\u01df\u01e0\t\2\2\2"+
		"\u01e0\u01e1\5(\25\21\u01e1\u01e2\b\25\1\2\u01e2\u01fd\3\2\2\2\u01e3\u01e4"+
		"\f\17\2\2\u01e4\u01e5\t\3\2\2\u01e5\u01e6\5(\25\20\u01e6\u01e7\b\25\1"+
		"\2\u01e7\u01fd\3\2\2\2\u01e8\u01e9\f\16\2\2\u01e9\u01ea\t\4\2\2\u01ea"+
		"\u01eb\5(\25\17\u01eb\u01ec\b\25\1\2\u01ec\u01fd\3\2\2\2\u01ed\u01ee\f"+
		"\r\2\2\u01ee\u01ef\t\5\2\2\u01ef\u01f0\5(\25\16\u01f0\u01f1\b\25\1\2\u01f1"+
		"\u01fd\3\2\2\2\u01f2\u01f3\f\f\2\2\u01f3\u01f4\t\6\2\2\u01f4\u01f5\5("+
		"\25\r\u01f5\u01f6\b\25\1\2\u01f6\u01fd\3\2\2\2\u01f7\u01f8\f\6\2\2\u01f8"+
		"\u01f9\7\37\2\2\u01f9\u01fa\5(\25\7\u01fa\u01fb\b\25\1\2\u01fb\u01fd\3"+
		"\2\2\2\u01fc\u01d4\3\2\2\2\u01fc\u01d9\3\2\2\2\u01fc\u01de\3\2\2\2\u01fc"+
		"\u01e3\3\2\2\2\u01fc\u01e8\3\2\2\2\u01fc\u01ed\3\2\2\2\u01fc\u01f2\3\2"+
		"\2\2\u01fc\u01f7\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe"+
		"\u01ff\3\2\2\2\u01ff)\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\5\n\6\2"+
		"\u0202\u0203\7\7\2\2\u0203\u0204\7>\2\2\u0204\u0205\7\35\2\2\u0205\u0206"+
		"\5\26\f\2\u0206\u0207\b\26\1\2\u0207+\3\2\2\2\u0208\u0209\7\64\2\2\u0209"+
		"\u020a\5\34\17\2\u020a\u020b\b\27\1\2\u020b-\3\2\2\2\u020c\u020d\7?\2"+
		"\2\u020d\u020e\7\35\2\2\u020e\u020f\5\26\f\2\u020f\u0210\b\30\1\2\u0210"+
		"\u0214\3\2\2\2\u0211\u0212\7?\2\2\u0212\u0214\b\30\1\2\u0213\u020c\3\2"+
		"\2\2\u0213\u0211\3\2\2\2\u0214/\3\2\2\2\u0215\u0217\5\b\5\2\u0216\u0215"+
		"\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u021a\3\2\2\2\u021a\u021b\7\'\2\2\u021b\u021c\5(\25\2\u021c\u021d\b\31"+
		"\1\2\u021d\61\3\2\2\2\u021e\u021f\5\"\22\2\u021f\u0220\b\32\1\2\u0220"+
		"\63\3\2\2\2\u0221\u0222\7\f\2\2\u0222\u0223\5(\25\2\u0223\u0224\b\33\1"+
		"\2\u0224\65\3\2\2\2\u0225\u0226\7&\2\2\u0226\u0227\5\26\f\2\u0227\u0228"+
		"\b\34\1\2\u0228\67\3\2\2\2\u0229\u022a\5\n\6\2\u022a\u022b\7\7\2\2\u022b"+
		"\u022c\5(\25\2\u022c\u022d\b\35\1\2\u022d\u0242\3\2\2\2\u022e\u022f\7"+
		"\n\2\2\u022f\u0230\5\n\6\2\u0230\u0231\7)\2\2\u0231\u0232\5\26\f\2\u0232"+
		"\u0233\7\63\2\2\u0233\u0234\7\7\2\2\u0234\u0235\5(\25\2\u0235\u0236\b"+
		"\35\1\2\u0236\u0242\3\2\2\2\u0237\u0239\5\n\6\2\u0238\u023a\5\b\5\2\u0239"+
		"\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u0239\3\2\2\2\u023b\u023c\3\2"+
		"\2\2\u023c\u023d\3\2\2\2\u023d\u023e\7\7\2\2\u023e\u023f\5(\25\2\u023f"+
		"\u0240\b\35\1\2\u0240\u0242\3\2\2\2\u0241\u0229\3\2\2\2\u0241\u022e\3"+
		"\2\2\2\u0241\u0237\3\2\2\2\u02429\3\2\2\2\u0243\u0245\58\35\2\u0244\u0246"+
		"\5&\24\2\u0245\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0245\3\2\2\2\u0247"+
		"\u0248\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024a\b\36\1\2\u024a\u024f\3"+
		"\2\2\2\u024b\u024c\58\35\2\u024c\u024d\b\36\1\2\u024d\u024f\3\2\2\2\u024e"+
		"\u0243\3\2\2\2\u024e\u024b\3\2\2\2\u024f;\3\2\2\2\"HSei\u0082\u009d\u00a9"+
		"\u00ab\u00b7\u00c1\u00d5\u00e2\u00ed\u00f1\u00f3\u0102\u010d\u0113\u0127"+
		"\u0143\u014b\u0172\u019a\u01d2\u01fc\u01fe\u0213\u0218\u023b\u0241\u0247"+
		"\u024e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}