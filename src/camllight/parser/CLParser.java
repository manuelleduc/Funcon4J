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
		T__56=1, T__55=2, T__54=3, T__53=4, T__52=5, T__51=6, T__50=7, T__49=8, 
		T__48=9, T__47=10, T__46=11, T__45=12, T__44=13, T__43=14, T__42=15, T__41=16, 
		T__40=17, T__39=18, T__38=19, T__37=20, T__36=21, T__35=22, T__34=23, 
		T__33=24, T__32=25, T__31=26, T__30=27, T__29=28, T__28=29, T__27=30, 
		T__26=31, T__25=32, T__24=33, T__23=34, T__22=35, T__21=36, T__20=37, 
		T__19=38, T__18=39, T__17=40, T__16=41, T__15=42, T__14=43, T__13=44, 
		T__12=45, T__11=46, T__10=47, T__9=48, T__8=49, T__7=50, T__6=51, T__5=52, 
		T__4=53, T__3=54, T__2=55, T__1=56, T__0=57, WS=58, INTTOKEN=59, NULLTOKEN=60, 
		EMPTYARRAYTOKEN=61, EMPTYLISTTOKEN=62, WILDCARDTOKEN=63, FLOATTOKEN=64, 
		BOOLTOKEN=65, IDTOKEN=66, CONSTRTOKEN=67;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'while'", "'&&'", "'::'", "'='", "'for'", "'do'", 
		"'('", "'rec'", "','", "'<-'", "'done'", "'mod'", "'>='", "'<'", "';;'", 
		"']'", "'*.'", "'|]'", "'let'", "'match'", "'function'", "'downto'", "'then'", 
		"'+'", "'/'", "'as'", "'of'", "'.('", "'||'", "'/.'", "';'", "'if'", "'<='", 
		"'[|'", "'&'", "'print'", "'''", "'*'", "'->'", "'to'", "':'", "'['", 
		"'|'", "'with'", "'>'", "'+.'", "'or'", "'-.'", "'else'", "'begin'", "'in'", 
		"'end'", "')'", "'and'", "'not'", "'-'", "WS", "INTTOKEN", "NULLTOKEN", 
		"EMPTYARRAYTOKEN", "EMPTYLISTTOKEN", "'_'", "FLOATTOKEN", "BOOLTOKEN", 
		"IDTOKEN", "CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decl = 2, RULE_patt = 3, RULE_ident = 4, 
		RULE_declorexp = 5, RULE_pattlist = 6, RULE_emptylist = 7, RULE_pattmatchsingle = 8, 
		RULE_explist = 9, RULE_type = 10, RULE_headtaillistpatt = 11, RULE_declmono = 12, 
		RULE_letExp = 13, RULE_patttuple = 14, RULE_declimpl = 15, RULE_function = 16, 
		RULE_recanddecl = 17, RULE_exp = 18, RULE_decllabelsandvariants = 19, 
		RULE_anddecl = 20, RULE_varianttype = 21, RULE_pattmatchcurried = 22, 
		RULE_prog = 23, RULE_exparray = 24, RULE_exptuple = 25, RULE_tupletypelist = 26, 
		RULE_recdeclmono = 27, RULE_recdecl = 28;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decl", "patt", "ident", "declorexp", "pattlist", 
		"emptylist", "pattmatchsingle", "explist", "type", "headtaillistpatt", 
		"declmono", "letExp", "patttuple", "declimpl", "function", "recanddecl", 
		"exp", "decllabelsandvariants", "anddecl", "varianttype", "pattmatchcurried", 
		"prog", "exparray", "exptuple", "tupletypelist", "recdeclmono", "recdecl"
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
				setState(58); match(44);
				setState(59); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				setState(63); match(44);
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
		public Token INTTOKEN_0;
		public Token BOOLTOKEN_0;
		public Token NULLTOKEN_0;
		public Token FLOATTOKEN_0;
		public TerminalNode FLOATTOKEN() { return getToken(CLParser.FLOATTOKEN, 0); }
		public TerminalNode NULLTOKEN() { return getToken(CLParser.NULLTOKEN, 0); }
		public TerminalNode INTTOKEN() { return getToken(CLParser.INTTOKEN, 0); }
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public TerminalNode BOOLTOKEN() { return getToken(CLParser.BOOLTOKEN, 0); }
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
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
				}
				break;
			case INTTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(75); ((ConstantContext)_localctx).INTTOKEN_0 = match(INTTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(inttoken((((ConstantContext)_localctx).INTTOKEN_0!=null?((ConstantContext)_localctx).INTTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(79); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case FLOATTOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(81); ((ConstantContext)_localctx).FLOATTOKEN_0 = match(FLOATTOKEN);
				((ConstantContext)_localctx)._constant =  builder.float_(floattoken((((ConstantContext)_localctx).FLOATTOKEN_0!=null?((ConstantContext)_localctx).FLOATTOKEN_0.getText():null)));
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
				setState(85); match(20);
				setState(86); match(9);
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
				setState(93); match(20);
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
				} while ( _la==55 );
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
		public PattlistContext pattlist_0;
		public EmptylistContext emptylist_0;
		public HeadtaillistpattContext headtaillistpatt_0;
		public PatttupleContext patttuple;
		public List<PatttupleContext> patttuple_1_list = new ArrayList<PatttupleContext>();
		public TypeContext type_1;
		public ConstantContext constant_0;
		public Token WILDCARDTOKEN_0;
		public IdentContext ident_0;
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
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(108); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(109); ((PattContext)_localctx).patt_1 = patt(2);
				((PattContext)_localctx)._patt =  builder.pattConstrPatt(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt));
				}
				break;

			case 2:
				{
				setState(112); match(43);
				setState(113); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(114); match(17);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 3:
				{
				setState(117); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 4:
				{
				setState(120); match(43);
				setState(121); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(122); match(17);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;

			case 5:
				{
				setState(125); match(8);
				setState(126); ((PattContext)_localctx).patt_0 = patt(0);
				setState(128); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(127); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(130); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==10 );
				setState(132); match(54);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 6:
				{
				setState(135); match(8);
				setState(136); ((PattContext)_localctx).patt_0 = patt(0);
				setState(137); match(42);
				setState(138); ((PattContext)_localctx).type_1 = type(0);
				setState(139); match(54);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 7:
				{
				setState(142); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 8:
				{
				setState(145); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(147); match(8);
				setState(148); ((PattContext)_localctx).patt_0 = patt(0);
				setState(149); match(54);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 10:
				{
				setState(152); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 11:
				{
				setState(155); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((PattContext)_localctx)._patt =  builder.pattConstr(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(159);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(160); match(44);
						setState(161); ((PattContext)_localctx).patt_1 = patt(4);
						((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).patt_1._patt));
						}
						break;

					case 2:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(164);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(165); match(27);
						setState(166); ((PattContext)_localctx).ident_1 = ident();
						((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
						}
						break;
					}
					} 
				}
				setState(173);
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
			setState(174); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); ((DeclorexpContext)_localctx).decl_0 = decl();
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
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); ((PattlistContext)_localctx).patt_0 = patt(0);
				((PattlistContext)_localctx)._pattlist =  builder.pattListSingle((((PattlistContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(189); match(32);
				setState(190); ((PattlistContext)_localctx).pattlist_1 = pattlist();
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
			setState(195); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
			setState(198); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(199); match(40);
			setState(200); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
			setState(213);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(204); match(32);
				setState(205); ((ExplistContext)_localctx).explist_1 = explist();
				((ExplistContext)_localctx)._explist =  builder.innerExpListMulti((((ExplistContext)_localctx).exp_0._exp),(((ExplistContext)_localctx).explist_1._explist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(209); match(32);
				setState(210); ((ExplistContext)_localctx).exp_1 = exp(0);
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
			setState(226);
			switch (_input.LA(1)) {
			case IDTOKEN:
				{
				setState(216); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			case 8:
				{
				setState(218); match(8);
				setState(219); ((TypeContext)_localctx).type_0 = type(0);
				setState(220); match(54);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;
			case 38:
				{
				setState(223); match(38);
				setState(224); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.varType(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(241);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(228);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(229); match(40);
						setState(230); ((TypeContext)_localctx).type_1 = type(4);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(233);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(235); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(234); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(237); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.tupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;
					}
					} 
				}
				setState(245);
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
			setState(254);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(247); match(4);
				setState(248); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
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
			setState(271);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(257); match(5);
				setState(258); ((DeclmonoContext)_localctx).exp_1 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMono((((DeclmonoContext)_localctx).patt_0._patt),(((DeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(263); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(262); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(265); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (43 - 8)) | (1L << (INTTOKEN - 8)) | (1L << (NULLTOKEN - 8)) | (1L << (EMPTYLISTTOKEN - 8)) | (1L << (WILDCARDTOKEN - 8)) | (1L << (FLOATTOKEN - 8)) | (1L << (BOOLTOKEN - 8)) | (1L << (IDTOKEN - 8)) | (1L << (CONSTRTOKEN - 8)))) != 0) );
				setState(267); match(5);
				setState(268); ((DeclmonoContext)_localctx).exp_2 = exp(0);
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
			setState(273); ((LetExpContext)_localctx).decl_0 = decl();
			setState(274); match(52);
			setState(275); ((LetExpContext)_localctx).exp_1 = exp(0);
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
			setState(278); match(10);
			setState(279); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
			setState(291);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(283); match(16);
				setState(284); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(287); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(288); match(16);
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
			setState(319);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(294); match(22);
				setState(295); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(298); match(8);
				setState(299); ((FunctionContext)_localctx).function_0 = function(0);
				setState(300); match(54);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(303); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(306); match(51);
				setState(307); ((FunctionContext)_localctx).function_0 = function(0);
				setState(308); match(53);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(311); match(1);
				setState(312); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(315); match(1);
				setState(316); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(327);
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
					setState(321);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(322); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(329);
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
			setState(330); match(55);
			setState(331); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
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
		public Token EMPTYARRAYTOKEN_0;
		public IdentContext ident_0;
		public ConstantContext constant_0;
		public TypeContext type_1;
		public ExptupleContext exptuple;
		public List<ExptupleContext> exptuple_1_list = new ArrayList<ExptupleContext>();
		public ExplistContext explist_0;
		public ExparrayContext exparray_0;
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
		public List<ExptupleContext> exptuple() {
			return getRuleContexts(ExptupleContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public TerminalNode EMPTYARRAYTOKEN() { return getToken(CLParser.EMPTYARRAYTOKEN, 0); }
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
		public ExparrayContext exparray() {
			return getRuleContext(ExparrayContext.class,0);
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
			setState(467);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(335); match(37);
				setState(336); ((ExpContext)_localctx).exp_0 = exp(37);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(339); match(49);
				setState(340); ((ExpContext)_localctx).exp_0 = exp(33);
				((ExpContext)_localctx)._exp =  builder.floatNegateExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 3:
				{
				setState(343); match(56);
				setState(344); ((ExpContext)_localctx).exp_0 = exp(19);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(347); match(57);
				setState(348); ((ExpContext)_localctx).exp_0 = exp(18);
				((ExpContext)_localctx)._exp =  builder.intUnarySub((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(351); match(33);
				setState(352); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(353); match(24);
				setState(354); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(355); match(50);
				setState(356); ((ExpContext)_localctx).exp_2 = exp(9);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 6:
				{
				setState(359); match(33);
				setState(360); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(361); match(24);
				setState(362); ((ExpContext)_localctx).exp_1 = exp(8);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 7:
				{
				setState(365); ((ExpContext)_localctx).EMPTYARRAYTOKEN_0 = match(EMPTYARRAYTOKEN);
				((ExpContext)_localctx)._exp =  builder.emptyArray(emptyarraytoken((((ExpContext)_localctx).EMPTYARRAYTOKEN_0!=null?((ExpContext)_localctx).EMPTYARRAYTOKEN_0.getText():null)));
				}
				break;

			case 8:
				{
				setState(367); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 9:
				{
				setState(370); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 10:
				{
				setState(373); match(8);
				setState(374); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(375); match(54);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 11:
				{
				setState(378); match(51);
				setState(379); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(380); match(53);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 12:
				{
				setState(383); match(8);
				setState(384); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(385); match(42);
				setState(386); ((ExpContext)_localctx).type_1 = type(0);
				setState(387); match(54);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 13:
				{
				setState(390); match(8);
				setState(391); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(393); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(392); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(395); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==10 );
				setState(397); match(54);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;

			case 14:
				{
				setState(400); match(43);
				setState(401); ((ExpContext)_localctx).explist_0 = explist();
				setState(402); match(17);
				((ExpContext)_localctx)._exp =  builder.expList((((ExpContext)_localctx).explist_0._explist));
				}
				break;

			case 15:
				{
				setState(405); match(43);
				setState(406); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(407); match(17);
				((ExpContext)_localctx)._exp =  builder.expListSingle((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 16:
				{
				setState(410); match(35);
				setState(411); ((ExpContext)_localctx).exparray_0 = exparray();
				setState(413);
				_la = _input.LA(1);
				if (_la==32) {
					{
					setState(412); match(32);
					}
				}

				setState(415); match(19);
				((ExpContext)_localctx)._exp =  builder.arrayMulti((((ExpContext)_localctx).exparray_0._exparray));
				}
				break;

			case 17:
				{
				setState(418); match(35);
				setState(419); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(421);
				_la = _input.LA(1);
				if (_la==32) {
					{
					setState(420); match(32);
					}
				}

				setState(423); match(19);
				((ExpContext)_localctx)._exp =  builder.arraySingle((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 18:
				{
				setState(426); match(2);
				setState(427); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(428); match(7);
				setState(429); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(430); match(12);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 19:
				{
				setState(433); match(6);
				setState(434); ((ExpContext)_localctx).ident_0 = ident();
				setState(435); match(5);
				setState(436); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(437); match(23);
				setState(438); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(439); match(7);
				setState(440); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(441); match(12);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 20:
				{
				setState(444); match(6);
				setState(445); ((ExpContext)_localctx).ident_0 = ident();
				setState(446); match(5);
				setState(447); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(448); match(41);
				setState(449); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(450); match(7);
				setState(451); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(452); match(12);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 21:
				{
				setState(455); match(21);
				setState(456); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(457); match(45);
				setState(458); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 22:
				{
				setState(461); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 23:
				{
				setState(464); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(543);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(469);
						if (!(precpred(_ctx, 36))) throw new FailedPredicateException(this, "precpred(_ctx, 36)");
						setState(470); match(31);
						setState(471); ((ExpContext)_localctx).exp_1 = exp(37);
						((ExpContext)_localctx)._exp =  builder.floatDivideExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(474);
						if (!(precpred(_ctx, 35))) throw new FailedPredicateException(this, "precpred(_ctx, 35)");
						setState(475); match(47);
						setState(476); ((ExpContext)_localctx).exp_1 = exp(36);
						((ExpContext)_localctx)._exp =  builder.floatAddExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(479);
						if (!(precpred(_ctx, 34))) throw new FailedPredicateException(this, "precpred(_ctx, 34)");
						setState(480); match(18);
						setState(481); ((ExpContext)_localctx).exp_1 = exp(35);
						((ExpContext)_localctx)._exp =  builder.floatMultiplyExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(484);
						if (!(precpred(_ctx, 32))) throw new FailedPredicateException(this, "precpred(_ctx, 32)");
						setState(485); match(49);
						setState(486); ((ExpContext)_localctx).exp_1 = exp(33);
						((ExpContext)_localctx)._exp =  builder.floatSubtractExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(489);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(490); match(4);
						setState(491); ((ExpContext)_localctx).exp_1 = exp(24);
						((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(494);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(495); match(13);
						setState(496); ((ExpContext)_localctx).exp_1 = exp(18);
						((ExpContext)_localctx)._exp =  builder.intMod((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(499);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(500);
						((ExpContext)_localctx).op_1512 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==26 || _la==39) ) {
							((ExpContext)_localctx).op_1512 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(501); ((ExpContext)_localctx).exp_1 = exp(17);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/") ? builder.intDivide(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*") ? builder.intMultiply(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(504);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(505);
						((ExpContext)_localctx).op_1511 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==25 || _la==57) ) {
							((ExpContext)_localctx).op_1511 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(506); ((ExpContext)_localctx).exp_1 = exp(16);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+") ? builder.intAdd(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-") ? builder.intSub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(509);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(510);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 14) | (1L << 15) | (1L << 34) | (1L << 46))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(511); ((ExpContext)_localctx).exp_1 = exp(15);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.smallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.greaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.smaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.equal(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.greater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(514);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(515); match(29);
						setState(516); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(517); match(54);
						setState(518); match(11);
						setState(519); ((ExpContext)_localctx).exp_2 = exp(13);
						((ExpContext)_localctx)._exp =  builder.arrayAssign((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(522);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(523);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==36) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(524); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(527);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(528);
						_la = _input.LA(1);
						if ( !(_la==30 || _la==48) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(529); ((ExpContext)_localctx).exp_1 = exp(11);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 13:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(532);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(533); match(32);
						setState(534); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 14:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(537);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(538); match(29);
						setState(539); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(540); match(54);
						((ExpContext)_localctx)._exp =  builder.arraySelect((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
			setState(548); ((DecllabelsandvariantsContext)_localctx).ident_0 = ident();
			setState(549); match(5);
			setState(550); ((DecllabelsandvariantsContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
			setState(551); match(28);
			setState(552); ((DecllabelsandvariantsContext)_localctx).type_2 = type(0);
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
			setState(555); match(55);
			setState(556); ((AnddeclContext)_localctx).declmono_0 = declmono();
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
			setState(566);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(559); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(560); match(28);
				setState(561); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(564); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
			setState(569); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(568); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(571); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (43 - 8)) | (1L << (INTTOKEN - 8)) | (1L << (NULLTOKEN - 8)) | (1L << (EMPTYLISTTOKEN - 8)) | (1L << (WILDCARDTOKEN - 8)) | (1L << (FLOATTOKEN - 8)) | (1L << (BOOLTOKEN - 8)) | (1L << (IDTOKEN - 8)) | (1L << (CONSTRTOKEN - 8)))) != 0) );
			setState(573); match(40);
			setState(574); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 46, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577); ((ProgContext)_localctx).declimpl_0 = declimpl();
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

	public static class ExparrayContext extends ParserRuleContext {
		public Object _exparray;
		public ExpContext exp_0;
		public ExparrayContext exparray_1;
		public ExpContext exp_1;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExparrayContext exparray() {
			return getRuleContext(ExparrayContext.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExparrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exparray; }
	}

	public final ExparrayContext exparray() throws RecognitionException {
		ExparrayContext _localctx = new ExparrayContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_exparray);
		try {
			setState(590);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(580); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(581); match(32);
				setState(582); ((ExparrayContext)_localctx).exparray_1 = exparray();
				((ExparrayContext)_localctx)._exparray =  builder.innerExpArrayMulti((((ExparrayContext)_localctx).exp_0._exp),(((ExparrayContext)_localctx).exparray_1._exparray));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(586); match(32);
				setState(587); ((ExparrayContext)_localctx).exp_1 = exp(0);
				((ExparrayContext)_localctx)._exparray =  builder.innerExpArrayDouble((((ExparrayContext)_localctx).exp_0._exp),(((ExparrayContext)_localctx).exp_1._exp));
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
			setState(592); match(10);
			setState(593); ((ExptupleContext)_localctx).exp_0 = exp(0);
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
			setState(596); match(39);
			setState(597); ((TupletypelistContext)_localctx).type_0 = type(0);
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
			setState(624);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(601); match(5);
				setState(602); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(605); match(8);
				setState(606); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(607); match(42);
				setState(608); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(609); match(54);
				setState(610); match(5);
				setState(611); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclPattTypeExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).type_1._type),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(614); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(616); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(615); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(618); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 8)) & ~0x3f) == 0 && ((1L << (_la - 8)) & ((1L << (8 - 8)) | (1L << (43 - 8)) | (1L << (INTTOKEN - 8)) | (1L << (NULLTOKEN - 8)) | (1L << (EMPTYLISTTOKEN - 8)) | (1L << (WILDCARDTOKEN - 8)) | (1L << (FLOATTOKEN - 8)) | (1L << (BOOLTOKEN - 8)) | (1L << (IDTOKEN - 8)) | (1L << (CONSTRTOKEN - 8)))) != 0) );
				setState(620); match(5);
				setState(621); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
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
			setState(637);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(626); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				((RecdeclContext)_localctx)._recdecl =  builder.recDeclMono((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(629); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(631); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(630); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(633); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==55 );
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
		case 0: return precpred(_ctx, 3);

		case 1: return precpred(_ctx, 8);
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
		case 5: return precpred(_ctx, 36);

		case 6: return precpred(_ctx, 35);

		case 7: return precpred(_ctx, 34);

		case 8: return precpred(_ctx, 32);

		case 9: return precpred(_ctx, 24);

		case 10: return precpred(_ctx, 17);

		case 11: return precpred(_ctx, 16);

		case 12: return precpred(_ctx, 15);

		case 13: return precpred(_ctx, 14);

		case 14: return precpred(_ctx, 12);

		case 15: return precpred(_ctx, 11);

		case 16: return precpred(_ctx, 10);

		case 17: return precpred(_ctx, 4);

		case 18: return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u0282\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2I\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\5\3V\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\6\4f\n\4\r\4\16\4g\3\4\3\4\5\4l\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u0083\n"+
		"\5\r\5\16\5\u0084\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a0\n\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00ac\n\5\f\5\16\5\u00af\13\5\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ba\n\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\5\b\u00c4\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d8\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e5\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6"+
		"\f\u00ee\n\f\r\f\16\f\u00ef\3\f\3\f\7\f\u00f4\n\f\f\f\16\f\u00f7\13\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0101\n\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\6\16\u010a\n\16\r\16\16\16\u010b\3\16\3\16\3\16\3\16\5\16\u0112"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0126\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0142\n\22\3\22\3\22\3\22\3\22\7\22"+
		"\u0148\n\22\f\22\16\22\u014b\13\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\6\24\u018c\n\24\r\24\16\24\u018d\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01a0\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u01a8\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u01d6\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0222\n\24\f\24\16\24\u0225\13\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u0239\n\27\3\30\6\30\u023c\n\30\r\30\16\30\u023d\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\5\32\u0251\n\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\6\35"+
		"\u026b\n\35\r\35\16\35\u026c\3\35\3\35\3\35\3\35\5\35\u0273\n\35\3\36"+
		"\3\36\3\36\3\36\3\36\6\36\u027a\n\36\r\36\16\36\u027b\3\36\3\36\5\36\u0280"+
		"\n\36\3\36\2\6\b\26\"&\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&"+
		"(*,.\60\62\64\668:\2\7\4\2\34\34))\4\2\33\33;;\6\2\7\7\20\21$$\60\60\4"+
		"\2\5\5&&\4\2  \62\62\u02bc\2H\3\2\2\2\4U\3\2\2\2\6k\3\2\2\2\b\u009f\3"+
		"\2\2\2\n\u00b0\3\2\2\2\f\u00b9\3\2\2\2\16\u00c3\3\2\2\2\20\u00c5\3\2\2"+
		"\2\22\u00c8\3\2\2\2\24\u00d7\3\2\2\2\26\u00e4\3\2\2\2\30\u0100\3\2\2\2"+
		"\32\u0111\3\2\2\2\34\u0113\3\2\2\2\36\u0118\3\2\2\2 \u0125\3\2\2\2\"\u0141"+
		"\3\2\2\2$\u014c\3\2\2\2&\u01d5\3\2\2\2(\u0226\3\2\2\2*\u022d\3\2\2\2,"+
		"\u0238\3\2\2\2.\u023b\3\2\2\2\60\u0243\3\2\2\2\62\u0250\3\2\2\2\64\u0252"+
		"\3\2\2\2\66\u0256\3\2\2\28\u0272\3\2\2\2:\u027f\3\2\2\2<=\7.\2\2=>\5\2"+
		"\2\2>?\b\2\1\2?I\3\2\2\2@A\5\22\n\2AB\7.\2\2BC\5\2\2\2CD\b\2\1\2DI\3\2"+
		"\2\2EF\5\22\n\2FG\b\2\1\2GI\3\2\2\2H<\3\2\2\2H@\3\2\2\2HE\3\2\2\2I\3\3"+
		"\2\2\2JK\5\20\t\2KL\b\3\1\2LV\3\2\2\2MN\7=\2\2NV\b\3\1\2OP\7C\2\2PV\b"+
		"\3\1\2QR\7>\2\2RV\b\3\1\2ST\7B\2\2TV\b\3\1\2UJ\3\2\2\2UM\3\2\2\2UO\3\2"+
		"\2\2UQ\3\2\2\2US\3\2\2\2V\5\3\2\2\2WX\7\26\2\2XY\7\13\2\2YZ\5:\36\2Z["+
		"\b\4\1\2[l\3\2\2\2\\]\5\32\16\2]^\b\4\1\2^l\3\2\2\2_`\7\26\2\2`a\5\6\4"+
		"\2ab\b\4\1\2bl\3\2\2\2ce\5\32\16\2df\5*\26\2ed\3\2\2\2fg\3\2\2\2ge\3\2"+
		"\2\2gh\3\2\2\2hi\3\2\2\2ij\b\4\1\2jl\3\2\2\2kW\3\2\2\2k\\\3\2\2\2k_\3"+
		"\2\2\2kc\3\2\2\2l\7\3\2\2\2mn\b\5\1\2no\7E\2\2op\5\b\5\4pq\b\5\1\2q\u00a0"+
		"\3\2\2\2rs\7-\2\2st\5\16\b\2tu\7\23\2\2uv\b\5\1\2v\u00a0\3\2\2\2wx\5\20"+
		"\t\2xy\b\5\1\2y\u00a0\3\2\2\2z{\7-\2\2{|\5\30\r\2|}\7\23\2\2}~\b\5\1\2"+
		"~\u00a0\3\2\2\2\177\u0080\7\n\2\2\u0080\u0082\5\b\5\2\u0081\u0083\5\36"+
		"\20\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\78\2\2\u0087\u0088\b\5"+
		"\1\2\u0088\u00a0\3\2\2\2\u0089\u008a\7\n\2\2\u008a\u008b\5\b\5\2\u008b"+
		"\u008c\7,\2\2\u008c\u008d\5\26\f\2\u008d\u008e\78\2\2\u008e\u008f\b\5"+
		"\1\2\u008f\u00a0\3\2\2\2\u0090\u0091\5\4\3\2\u0091\u0092\b\5\1\2\u0092"+
		"\u00a0\3\2\2\2\u0093\u0094\7A\2\2\u0094\u00a0\b\5\1\2\u0095\u0096\7\n"+
		"\2\2\u0096\u0097\5\b\5\2\u0097\u0098\78\2\2\u0098\u0099\b\5\1\2\u0099"+
		"\u00a0\3\2\2\2\u009a\u009b\5\n\6\2\u009b\u009c\b\5\1\2\u009c\u00a0\3\2"+
		"\2\2\u009d\u009e\7E\2\2\u009e\u00a0\b\5\1\2\u009fm\3\2\2\2\u009fr\3\2"+
		"\2\2\u009fw\3\2\2\2\u009fz\3\2\2\2\u009f\177\3\2\2\2\u009f\u0089\3\2\2"+
		"\2\u009f\u0090\3\2\2\2\u009f\u0093\3\2\2\2\u009f\u0095\3\2\2\2\u009f\u009a"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00ad\3\2\2\2\u00a1\u00a2\f\5\2\2\u00a2"+
		"\u00a3\7.\2\2\u00a3\u00a4\5\b\5\6\u00a4\u00a5\b\5\1\2\u00a5\u00ac\3\2"+
		"\2\2\u00a6\u00a7\f\n\2\2\u00a7\u00a8\7\35\2\2\u00a8\u00a9\5\n\6\2\u00a9"+
		"\u00aa\b\5\1\2\u00aa\u00ac\3\2\2\2\u00ab\u00a1\3\2\2\2\u00ab\u00a6\3\2"+
		"\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\t\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7D\2\2\u00b1\u00b2\b\6\1\2"+
		"\u00b2\13\3\2\2\2\u00b3\u00b4\5&\24\2\u00b4\u00b5\b\7\1\2\u00b5\u00ba"+
		"\3\2\2\2\u00b6\u00b7\5\6\4\2\u00b7\u00b8\b\7\1\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b3\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\r\3\2\2\2\u00bb\u00bc\5\b\5\2"+
		"\u00bc\u00bd\b\b\1\2\u00bd\u00c4\3\2\2\2\u00be\u00bf\5\b\5\2\u00bf\u00c0"+
		"\7\"\2\2\u00c0\u00c1\5\16\b\2\u00c1\u00c2\b\b\1\2\u00c2\u00c4\3\2\2\2"+
		"\u00c3\u00bb\3\2\2\2\u00c3\u00be\3\2\2\2\u00c4\17\3\2\2\2\u00c5\u00c6"+
		"\7@\2\2\u00c6\u00c7\b\t\1\2\u00c7\21\3\2\2\2\u00c8\u00c9\5\b\5\2\u00c9"+
		"\u00ca\7*\2\2\u00ca\u00cb\5&\24\2\u00cb\u00cc\b\n\1\2\u00cc\23\3\2\2\2"+
		"\u00cd\u00ce\5&\24\2\u00ce\u00cf\7\"\2\2\u00cf\u00d0\5\24\13\2\u00d0\u00d1"+
		"\b\13\1\2\u00d1\u00d8\3\2\2\2\u00d2\u00d3\5&\24\2\u00d3\u00d4\7\"\2\2"+
		"\u00d4\u00d5\5&\24\2\u00d5\u00d6\b\13\1\2\u00d6\u00d8\3\2\2\2\u00d7\u00cd"+
		"\3\2\2\2\u00d7\u00d2\3\2\2\2\u00d8\25\3\2\2\2\u00d9\u00da\b\f\1\2\u00da"+
		"\u00db\7D\2\2\u00db\u00e5\b\f\1\2\u00dc\u00dd\7\n\2\2\u00dd\u00de\5\26"+
		"\f\2\u00de\u00df\78\2\2\u00df\u00e0\b\f\1\2\u00e0\u00e5\3\2\2\2\u00e1"+
		"\u00e2\7(\2\2\u00e2\u00e3\7D\2\2\u00e3\u00e5\b\f\1\2\u00e4\u00d9\3\2\2"+
		"\2\u00e4\u00dc\3\2\2\2\u00e4\u00e1\3\2\2\2\u00e5\u00f5\3\2\2\2\u00e6\u00e7"+
		"\f\5\2\2\u00e7\u00e8\7*\2\2\u00e8\u00e9\5\26\f\6\u00e9\u00ea\b\f\1\2\u00ea"+
		"\u00f4\3\2\2\2\u00eb\u00ed\f\7\2\2\u00ec\u00ee\5\66\34\2\u00ed\u00ec\3"+
		"\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\b\f\1\2\u00f2\u00f4\3\2\2\2\u00f3\u00e6\3\2"+
		"\2\2\u00f3\u00eb\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\27\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f9\5\b\5"+
		"\2\u00f9\u00fa\7\6\2\2\u00fa\u00fb\5\30\r\2\u00fb\u00fc\b\r\1\2\u00fc"+
		"\u0101\3\2\2\2\u00fd\u00fe\5\b\5\2\u00fe\u00ff\b\r\1\2\u00ff\u0101\3\2"+
		"\2\2\u0100\u00f8\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\31\3\2\2\2\u0102\u0103"+
		"\5\b\5\2\u0103\u0104\7\7\2\2\u0104\u0105\5&\24\2\u0105\u0106\b\16\1\2"+
		"\u0106\u0112\3\2\2\2\u0107\u0109\5\n\6\2\u0108\u010a\5\b\5\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\7\7\2\2\u010e\u010f\5&\24\2\u010f\u0110\b\16"+
		"\1\2\u0110\u0112\3\2\2\2\u0111\u0102\3\2\2\2\u0111\u0107\3\2\2\2\u0112"+
		"\33\3\2\2\2\u0113\u0114\5\6\4\2\u0114\u0115\7\66\2\2\u0115\u0116\5&\24"+
		"\2\u0116\u0117\b\17\1\2\u0117\35\3\2\2\2\u0118\u0119\7\f\2\2\u0119\u011a"+
		"\5\b\5\2\u011a\u011b\b\20\1\2\u011b\37\3\2\2\2\u011c\u011d\5\f\7\2\u011d"+
		"\u011e\7\22\2\2\u011e\u011f\5 \21\2\u011f\u0120\b\21\1\2\u0120\u0126\3"+
		"\2\2\2\u0121\u0122\5\f\7\2\u0122\u0123\7\22\2\2\u0123\u0124\b\21\1\2\u0124"+
		"\u0126\3\2\2\2\u0125\u011c\3\2\2\2\u0125\u0121\3\2\2\2\u0126!\3\2\2\2"+
		"\u0127\u0128\b\22\1\2\u0128\u0129\7\30\2\2\u0129\u012a\5\2\2\2\u012a\u012b"+
		"\b\22\1\2\u012b\u0142\3\2\2\2\u012c\u012d\7\n\2\2\u012d\u012e\5\"\22\2"+
		"\u012e\u012f\78\2\2\u012f\u0130\b\22\1\2\u0130\u0142\3\2\2\2\u0131\u0132"+
		"\5\n\6\2\u0132\u0133\b\22\1\2\u0133\u0142\3\2\2\2\u0134\u0135\7\65\2\2"+
		"\u0135\u0136\5\"\22\2\u0136\u0137\7\67\2\2\u0137\u0138\b\22\1\2\u0138"+
		"\u0142\3\2\2\2\u0139\u013a\7\3\2\2\u013a\u013b\5\22\n\2\u013b\u013c\b"+
		"\22\1\2\u013c\u0142\3\2\2\2\u013d\u013e\7\3\2\2\u013e\u013f\5.\30\2\u013f"+
		"\u0140\b\22\1\2\u0140\u0142\3\2\2\2\u0141\u0127\3\2\2\2\u0141\u012c\3"+
		"\2\2\2\u0141\u0131\3\2\2\2\u0141\u0134\3\2\2\2\u0141\u0139\3\2\2\2\u0141"+
		"\u013d\3\2\2\2\u0142\u0149\3\2\2\2\u0143\u0144\f\7\2\2\u0144\u0145\5&"+
		"\24\2\u0145\u0146\b\22\1\2\u0146\u0148\3\2\2\2\u0147\u0143\3\2\2\2\u0148"+
		"\u014b\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a#\3\2\2\2"+
		"\u014b\u0149\3\2\2\2\u014c\u014d\79\2\2\u014d\u014e\58\35\2\u014e\u014f"+
		"\b\23\1\2\u014f%\3\2\2\2\u0150\u0151\b\24\1\2\u0151\u0152\7\'\2\2\u0152"+
		"\u0153\5&\24\'\u0153\u0154\b\24\1\2\u0154\u01d6\3\2\2\2\u0155\u0156\7"+
		"\63\2\2\u0156\u0157\5&\24#\u0157\u0158\b\24\1\2\u0158\u01d6\3\2\2\2\u0159"+
		"\u015a\7:\2\2\u015a\u015b\5&\24\25\u015b\u015c\b\24\1\2\u015c\u01d6\3"+
		"\2\2\2\u015d\u015e\7;\2\2\u015e\u015f\5&\24\24\u015f\u0160\b\24\1\2\u0160"+
		"\u01d6\3\2\2\2\u0161\u0162\7#\2\2\u0162\u0163\5&\24\2\u0163\u0164\7\32"+
		"\2\2\u0164\u0165\5&\24\2\u0165\u0166\7\64\2\2\u0166\u0167\5&\24\13\u0167"+
		"\u0168\b\24\1\2\u0168\u01d6\3\2\2\2\u0169\u016a\7#\2\2\u016a\u016b\5&"+
		"\24\2\u016b\u016c\7\32\2\2\u016c\u016d\5&\24\n\u016d\u016e\b\24\1\2\u016e"+
		"\u01d6\3\2\2\2\u016f\u0170\7?\2\2\u0170\u01d6\b\24\1\2\u0171\u0172\5\n"+
		"\6\2\u0172\u0173\b\24\1\2\u0173\u01d6\3\2\2\2\u0174\u0175\5\4\3\2\u0175"+
		"\u0176\b\24\1\2\u0176\u01d6\3\2\2\2\u0177\u0178\7\n\2\2\u0178\u0179\5"+
		"&\24\2\u0179\u017a\78\2\2\u017a\u017b\b\24\1\2\u017b\u01d6\3\2\2\2\u017c"+
		"\u017d\7\65\2\2\u017d\u017e\5&\24\2\u017e\u017f\7\67\2\2\u017f\u0180\b"+
		"\24\1\2\u0180\u01d6\3\2\2\2\u0181\u0182\7\n\2\2\u0182\u0183\5&\24\2\u0183"+
		"\u0184\7,\2\2\u0184\u0185\5\26\f\2\u0185\u0186\78\2\2\u0186\u0187\b\24"+
		"\1\2\u0187\u01d6\3\2\2\2\u0188\u0189\7\n\2\2\u0189\u018b\5&\24\2\u018a"+
		"\u018c\5\64\33\2\u018b\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018b\3"+
		"\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\78\2\2\u0190"+
		"\u0191\b\24\1\2\u0191\u01d6\3\2\2\2\u0192\u0193\7-\2\2\u0193\u0194\5\24"+
		"\13\2\u0194\u0195\7\23\2\2\u0195\u0196\b\24\1\2\u0196\u01d6\3\2\2\2\u0197"+
		"\u0198\7-\2\2\u0198\u0199\5&\24\2\u0199\u019a\7\23\2\2\u019a\u019b\b\24"+
		"\1\2\u019b\u01d6\3\2\2\2\u019c\u019d\7%\2\2\u019d\u019f\5\62\32\2\u019e"+
		"\u01a0\7\"\2\2\u019f\u019e\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2"+
		"\2\2\u01a1\u01a2\7\25\2\2\u01a2\u01a3\b\24\1\2\u01a3\u01d6\3\2\2\2\u01a4"+
		"\u01a5\7%\2\2\u01a5\u01a7\5&\24\2\u01a6\u01a8\7\"\2\2\u01a7\u01a6\3\2"+
		"\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7\25\2\2\u01aa"+
		"\u01ab\b\24\1\2\u01ab\u01d6\3\2\2\2\u01ac\u01ad\7\4\2\2\u01ad\u01ae\5"+
		"&\24\2\u01ae\u01af\7\t\2\2\u01af\u01b0\5&\24\2\u01b0\u01b1\7\16\2\2\u01b1"+
		"\u01b2\b\24\1\2\u01b2\u01d6\3\2\2\2\u01b3\u01b4\7\b\2\2\u01b4\u01b5\5"+
		"\n\6\2\u01b5\u01b6\7\7\2\2\u01b6\u01b7\5&\24\2\u01b7\u01b8\7\31\2\2\u01b8"+
		"\u01b9\5&\24\2\u01b9\u01ba\7\t\2\2\u01ba\u01bb\5&\24\2\u01bb\u01bc\7\16"+
		"\2\2\u01bc\u01bd\b\24\1\2\u01bd\u01d6\3\2\2\2\u01be\u01bf\7\b\2\2\u01bf"+
		"\u01c0\5\n\6\2\u01c0\u01c1\7\7\2\2\u01c1\u01c2\5&\24\2\u01c2\u01c3\7+"+
		"\2\2\u01c3\u01c4\5&\24\2\u01c4\u01c5\7\t\2\2\u01c5\u01c6\5&\24\2\u01c6"+
		"\u01c7\7\16\2\2\u01c7\u01c8\b\24\1\2\u01c8\u01d6\3\2\2\2\u01c9\u01ca\7"+
		"\27\2\2\u01ca\u01cb\5&\24\2\u01cb\u01cc\7/\2\2\u01cc\u01cd\5\2\2\2\u01cd"+
		"\u01ce\b\24\1\2\u01ce\u01d6\3\2\2\2\u01cf\u01d0\5\"\22\2\u01d0\u01d1\b"+
		"\24\1\2\u01d1\u01d6\3\2\2\2\u01d2\u01d3\5\34\17\2\u01d3\u01d4\b\24\1\2"+
		"\u01d4\u01d6\3\2\2\2\u01d5\u0150\3\2\2\2\u01d5\u0155\3\2\2\2\u01d5\u0159"+
		"\3\2\2\2\u01d5\u015d\3\2\2\2\u01d5\u0161\3\2\2\2\u01d5\u0169\3\2\2\2\u01d5"+
		"\u016f\3\2\2\2\u01d5\u0171\3\2\2\2\u01d5\u0174\3\2\2\2\u01d5\u0177\3\2"+
		"\2\2\u01d5\u017c\3\2\2\2\u01d5\u0181\3\2\2\2\u01d5\u0188\3\2\2\2\u01d5"+
		"\u0192\3\2\2\2\u01d5\u0197\3\2\2\2\u01d5\u019c\3\2\2\2\u01d5\u01a4\3\2"+
		"\2\2\u01d5\u01ac\3\2\2\2\u01d5\u01b3\3\2\2\2\u01d5\u01be\3\2\2\2\u01d5"+
		"\u01c9\3\2\2\2\u01d5\u01cf\3\2\2\2\u01d5\u01d2\3\2\2\2\u01d6\u0223\3\2"+
		"\2\2\u01d7\u01d8\f&\2\2\u01d8\u01d9\7!\2\2\u01d9\u01da\5&\24\'\u01da\u01db"+
		"\b\24\1\2\u01db\u0222\3\2\2\2\u01dc\u01dd\f%\2\2\u01dd\u01de\7\61\2\2"+
		"\u01de\u01df\5&\24&\u01df\u01e0\b\24\1\2\u01e0\u0222\3\2\2\2\u01e1\u01e2"+
		"\f$\2\2\u01e2\u01e3\7\24\2\2\u01e3\u01e4\5&\24%\u01e4\u01e5\b\24\1\2\u01e5"+
		"\u0222\3\2\2\2\u01e6\u01e7\f\"\2\2\u01e7\u01e8\7\63\2\2\u01e8\u01e9\5"+
		"&\24#\u01e9\u01ea\b\24\1\2\u01ea\u0222\3\2\2\2\u01eb\u01ec\f\32\2\2\u01ec"+
		"\u01ed\7\6\2\2\u01ed\u01ee\5&\24\32\u01ee\u01ef\b\24\1\2\u01ef\u0222\3"+
		"\2\2\2\u01f0\u01f1\f\23\2\2\u01f1\u01f2\7\17\2\2\u01f2\u01f3\5&\24\24"+
		"\u01f3\u01f4\b\24\1\2\u01f4\u0222\3\2\2\2\u01f5\u01f6\f\22\2\2\u01f6\u01f7"+
		"\t\2\2\2\u01f7\u01f8\5&\24\23\u01f8\u01f9\b\24\1\2\u01f9\u0222\3\2\2\2"+
		"\u01fa\u01fb\f\21\2\2\u01fb\u01fc\t\3\2\2\u01fc\u01fd\5&\24\22\u01fd\u01fe"+
		"\b\24\1\2\u01fe\u0222\3\2\2\2\u01ff\u0200\f\20\2\2\u0200\u0201\t\4\2\2"+
		"\u0201\u0202\5&\24\21\u0202\u0203\b\24\1\2\u0203\u0222\3\2\2\2\u0204\u0205"+
		"\f\16\2\2\u0205\u0206\7\37\2\2\u0206\u0207\5&\24\2\u0207\u0208\78\2\2"+
		"\u0208\u0209\7\r\2\2\u0209\u020a\5&\24\17\u020a\u020b\b\24\1\2\u020b\u0222"+
		"\3\2\2\2\u020c\u020d\f\r\2\2\u020d\u020e\t\5\2\2\u020e\u020f\5&\24\16"+
		"\u020f\u0210\b\24\1\2\u0210\u0222\3\2\2\2\u0211\u0212\f\f\2\2\u0212\u0213"+
		"\t\6\2\2\u0213\u0214\5&\24\r\u0214\u0215\b\24\1\2\u0215\u0222\3\2\2\2"+
		"\u0216\u0217\f\6\2\2\u0217\u0218\7\"\2\2\u0218\u0219\5&\24\7\u0219\u021a"+
		"\b\24\1\2\u021a\u0222\3\2\2\2\u021b\u021c\f\17\2\2\u021c\u021d\7\37\2"+
		"\2\u021d\u021e\5&\24\2\u021e\u021f\78\2\2\u021f\u0220\b\24\1\2\u0220\u0222"+
		"\3\2\2\2\u0221\u01d7\3\2\2\2\u0221\u01dc\3\2\2\2\u0221\u01e1\3\2\2\2\u0221"+
		"\u01e6\3\2\2\2\u0221\u01eb\3\2\2\2\u0221\u01f0\3\2\2\2\u0221\u01f5\3\2"+
		"\2\2\u0221\u01fa\3\2\2\2\u0221\u01ff\3\2\2\2\u0221\u0204\3\2\2\2\u0221"+
		"\u020c\3\2\2\2\u0221\u0211\3\2\2\2\u0221\u0216\3\2\2\2\u0221\u021b\3\2"+
		"\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\'\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\5\n\6\2\u0227\u0228\7\7\2\2"+
		"\u0228\u0229\7D\2\2\u0229\u022a\7\36\2\2\u022a\u022b\5\26\f\2\u022b\u022c"+
		"\b\25\1\2\u022c)\3\2\2\2\u022d\u022e\79\2\2\u022e\u022f\5\32\16\2\u022f"+
		"\u0230\b\26\1\2\u0230+\3\2\2\2\u0231\u0232\7E\2\2\u0232\u0233\7\36\2\2"+
		"\u0233\u0234\5\26\f\2\u0234\u0235\b\27\1\2\u0235\u0239\3\2\2\2\u0236\u0237"+
		"\7E\2\2\u0237\u0239\b\27\1\2\u0238\u0231\3\2\2\2\u0238\u0236\3\2\2\2\u0239"+
		"-\3\2\2\2\u023a\u023c\5\b\5\2\u023b\u023a\3\2\2\2\u023c\u023d\3\2\2\2"+
		"\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240"+
		"\7*\2\2\u0240\u0241\5&\24\2\u0241\u0242\b\30\1\2\u0242/\3\2\2\2\u0243"+
		"\u0244\5 \21\2\u0244\u0245\b\31\1\2\u0245\61\3\2\2\2\u0246\u0247\5&\24"+
		"\2\u0247\u0248\7\"\2\2\u0248\u0249\5\62\32\2\u0249\u024a\b\32\1\2\u024a"+
		"\u0251\3\2\2\2\u024b\u024c\5&\24\2\u024c\u024d\7\"\2\2\u024d\u024e\5&"+
		"\24\2\u024e\u024f\b\32\1\2\u024f\u0251\3\2\2\2\u0250\u0246\3\2\2\2\u0250"+
		"\u024b\3\2\2\2\u0251\63\3\2\2\2\u0252\u0253\7\f\2\2\u0253\u0254\5&\24"+
		"\2\u0254\u0255\b\33\1\2\u0255\65\3\2\2\2\u0256\u0257\7)\2\2\u0257\u0258"+
		"\5\26\f\2\u0258\u0259\b\34\1\2\u0259\67\3\2\2\2\u025a\u025b\5\n\6\2\u025b"+
		"\u025c\7\7\2\2\u025c\u025d\5&\24\2\u025d\u025e\b\35\1\2\u025e\u0273\3"+
		"\2\2\2\u025f\u0260\7\n\2\2\u0260\u0261\5\n\6\2\u0261\u0262\7,\2\2\u0262"+
		"\u0263\5\26\f\2\u0263\u0264\78\2\2\u0264\u0265\7\7\2\2\u0265\u0266\5&"+
		"\24\2\u0266\u0267\b\35\1\2\u0267\u0273\3\2\2\2\u0268\u026a\5\n\6\2\u0269"+
		"\u026b\5\b\5\2\u026a\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026a\3\2"+
		"\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f\7\7\2\2\u026f"+
		"\u0270\5&\24\2\u0270\u0271\b\35\1\2\u0271\u0273\3\2\2\2\u0272\u025a\3"+
		"\2\2\2\u0272\u025f\3\2\2\2\u0272\u0268\3\2\2\2\u02739\3\2\2\2\u0274\u0275"+
		"\58\35\2\u0275\u0276\b\36\1\2\u0276\u0280\3\2\2\2\u0277\u0279\58\35\2"+
		"\u0278\u027a\5$\23\2\u0279\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0279"+
		"\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\b\36\1\2"+
		"\u027e\u0280\3\2\2\2\u027f\u0274\3\2\2\2\u027f\u0277\3\2\2\2\u0280;\3"+
		"\2\2\2$HUgk\u0084\u009f\u00ab\u00ad\u00b9\u00c3\u00d7\u00e4\u00ef\u00f3"+
		"\u00f5\u0100\u010b\u0111\u0125\u0141\u0149\u018d\u019f\u01a7\u01d5\u0221"+
		"\u0223\u0238\u023d\u0250\u026c\u0272\u027b\u027f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}