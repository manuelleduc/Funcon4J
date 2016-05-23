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
		T__60=1, T__59=2, T__58=3, T__57=4, T__56=5, T__55=6, T__54=7, T__53=8, 
		T__52=9, T__51=10, T__50=11, T__49=12, T__48=13, T__47=14, T__46=15, T__45=16, 
		T__44=17, T__43=18, T__42=19, T__41=20, T__40=21, T__39=22, T__38=23, 
		T__37=24, T__36=25, T__35=26, T__34=27, T__33=28, T__32=29, T__31=30, 
		T__30=31, T__29=32, T__28=33, T__27=34, T__26=35, T__25=36, T__24=37, 
		T__23=38, T__22=39, T__21=40, T__20=41, T__19=42, T__18=43, T__17=44, 
		T__16=45, T__15=46, T__14=47, T__13=48, T__12=49, T__11=50, T__10=51, 
		T__9=52, T__8=53, T__7=54, T__6=55, T__5=56, T__4=57, T__3=58, T__2=59, 
		T__1=60, T__0=61, CHARTOKEN=62, WS=63, INTTOKEN=64, NULLTOKEN=65, EMPTYARRAYTOKEN=66, 
		STRINGTOKEN=67, EMPTYLISTTOKEN=68, FLOATTOKEN=69, WILDCARDTOKEN=70, BOOLTOKEN=71, 
		IDTOKEN=72, CONSTRTOKEN=73;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'while'", "'{'", "'&&'", "'::'", "'='", "'for'", 
		"'do'", "'('", "'rec'", "','", "'<-'", "'done'", "'mod'", "'>='", "'<'", 
		"';;'", "']'", "'*.'", "'|]'", "'let'", "'match'", "'function'", "'downto'", 
		"'then'", "'+'", "'/'", "'as'", "'of'", "'.('", "'||'", "'/.'", "';'", 
		"'}'", "'if'", "'<='", "'[|'", "'&'", "'print'", "'''", "'*'", "'.'", 
		"'->'", "'to'", "'mutable'", "':'", "'['", "'|'", "'with'", "'>'", "'+.'", 
		"'or'", "'-.'", "'else'", "'begin'", "'in'", "'end'", "')'", "'and'", 
		"'not'", "'-'", "CHARTOKEN", "WS", "INTTOKEN", "NULLTOKEN", "EMPTYARRAYTOKEN", 
		"STRINGTOKEN", "EMPTYLISTTOKEN", "FLOATTOKEN", "'_'", "BOOLTOKEN", "IDTOKEN", 
		"CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decl = 2, RULE_patt = 3, RULE_ident = 4, 
		RULE_declorexp = 5, RULE_pattlist = 6, RULE_emptylist = 7, RULE_pattmatchsingle = 8, 
		RULE_explist = 9, RULE_type = 10, RULE_headtaillistpatt = 11, RULE_recordsingle = 12, 
		RULE_declmono = 13, RULE_letExp = 14, RULE_patttuple = 15, RULE_declimpl = 16, 
		RULE_function = 17, RULE_recanddecl = 18, RULE_recordpattappendix = 19, 
		RULE_exp = 20, RULE_decllabelsandvariants = 21, RULE_anddecl = 22, RULE_varianttype = 23, 
		RULE_pattmatchcurried = 24, RULE_prog = 25, RULE_exparray = 26, RULE_exptuple = 27, 
		RULE_tupletypelist = 28, RULE_recordappendix = 29, RULE_recdeclmono = 30, 
		RULE_recdecl = 31;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decl", "patt", "ident", "declorexp", "pattlist", 
		"emptylist", "pattmatchsingle", "explist", "type", "headtaillistpatt", 
		"recordsingle", "declmono", "letExp", "patttuple", "declimpl", "function", 
		"recanddecl", "recordpattappendix", "exp", "decllabelsandvariants", "anddecl", 
		"varianttype", "pattmatchcurried", "prog", "exparray", "exptuple", "tupletypelist", 
		"recordappendix", "recdeclmono", "recdecl"
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
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(48);
				setState(65); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				setState(69); match(48);
				setState(70); ((PattmatchContext)_localctx).pattmatch_1 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchMulti((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle),(((PattmatchContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
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
		public Token STRINGTOKEN_0;
		public Token INTTOKEN_0;
		public Token FLOATTOKEN_0;
		public Token NULLTOKEN_0;
		public Token BOOLTOKEN_0;
		public Token CHARTOKEN_0;
		public EmptylistContext emptylist_0;
		public TerminalNode FLOATTOKEN() { return getToken(CLParser.FLOATTOKEN, 0); }
		public TerminalNode NULLTOKEN() { return getToken(CLParser.NULLTOKEN, 0); }
		public TerminalNode INTTOKEN() { return getToken(CLParser.INTTOKEN, 0); }
		public TerminalNode BOOLTOKEN() { return getToken(CLParser.BOOLTOKEN, 0); }
		public TerminalNode CHARTOKEN() { return getToken(CLParser.CHARTOKEN, 0); }
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public TerminalNode STRINGTOKEN() { return getToken(CLParser.STRINGTOKEN, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constant);
		try {
			setState(93);
			switch (_input.LA(1)) {
			case STRINGTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); ((ConstantContext)_localctx).STRINGTOKEN_0 = match(STRINGTOKEN);
				((ConstantContext)_localctx)._constant =  builder.string(stringtoken((((ConstantContext)_localctx).STRINGTOKEN_0!=null?((ConstantContext)_localctx).STRINGTOKEN_0.getText():null)));
				}
				break;
			case INTTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); ((ConstantContext)_localctx).INTTOKEN_0 = match(INTTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(inttoken((((ConstantContext)_localctx).INTTOKEN_0!=null?((ConstantContext)_localctx).INTTOKEN_0.getText():null)));
				}
				break;
			case FLOATTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(82); ((ConstantContext)_localctx).FLOATTOKEN_0 = match(FLOATTOKEN);
				((ConstantContext)_localctx)._constant =  builder.float_(floattoken((((ConstantContext)_localctx).FLOATTOKEN_0!=null?((ConstantContext)_localctx).FLOATTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(84); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(86); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case CHARTOKEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(88); ((ConstantContext)_localctx).CHARTOKEN_0 = match(CHARTOKEN);
				((ConstantContext)_localctx)._constant =  builder.char_(chartoken((((ConstantContext)_localctx).CHARTOKEN_0!=null?((ConstantContext)_localctx).CHARTOKEN_0.getText():null)));
				}
				break;
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(90); ((ConstantContext)_localctx).emptylist_0 = emptylist();
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
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); match(21);
				setState(96); match(10);
				setState(97); ((DeclContext)_localctx).recdecl_0 = recdecl();
				((DeclContext)_localctx)._decl =  builder.declRec((((DeclContext)_localctx).recdecl_0._recdecl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103); match(21);
				setState(104); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(109); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(108); ((DeclContext)_localctx).anddecl = anddecl();
					((DeclContext)_localctx).anddecl_1_list.add(((DeclContext)_localctx).anddecl);
					}
					}
					setState(111); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==59 );
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
		public Token IDTOKEN_0;
		public RecordpattappendixContext recordpattappendix;
		public List<RecordpattappendixContext> recordpattappendix_2_list = new ArrayList<RecordpattappendixContext>();
		public IdentContext ident_0;
		public Token WILDCARDTOKEN_0;
		public TypeContext type_1;
		public ConstantContext constant_0;
		public PatttupleContext patttuple;
		public List<PatttupleContext> patttuple_1_list = new ArrayList<PatttupleContext>();
		public EmptylistContext emptylist_0;
		public PattlistContext pattlist_0;
		public HeadtaillistpattContext headtaillistpatt_0;
		public IdentContext ident_1;
		public PatttupleContext patttuple(int i) {
			return getRuleContext(PatttupleContext.class,i);
		}
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public RecordpattappendixContext recordpattappendix(int i) {
			return getRuleContext(RecordpattappendixContext.class,i);
		}
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public TerminalNode WILDCARDTOKEN() { return getToken(CLParser.WILDCARDTOKEN, 0); }
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public List<PatttupleContext> patttuple() {
			return getRuleContexts(PatttupleContext.class);
		}
		public PattlistContext pattlist() {
			return getRuleContext(PattlistContext.class,0);
		}
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public HeadtaillistpattContext headtaillistpatt() {
			return getRuleContext(HeadtaillistpattContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<RecordpattappendixContext> recordpattappendix() {
			return getRuleContexts(RecordpattappendixContext.class);
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
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(118); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(119); ((PattContext)_localctx).patt_1 = patt(6);
				((PattContext)_localctx)._patt =  builder.pattConstrPatt(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt));
				}
				break;

			case 2:
				{
				setState(122); match(3);
				setState(123); ((PattContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(124); match(6);
				setState(125); ((PattContext)_localctx).patt_1 = patt(0);
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(126); ((PattContext)_localctx).recordpattappendix = recordpattappendix();
					((PattContext)_localctx).recordpattappendix_2_list.add(((PattContext)_localctx).recordpattappendix);
					}
					}
					setState(131);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(132); match(34);
				((PattContext)_localctx)._patt =  builder.recordPatt(idtoken((((PattContext)_localctx).IDTOKEN_0!=null?((PattContext)_localctx).IDTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt),lift("_recordpattappendix", ((PattContext)_localctx).recordpattappendix_2_list));
				}
				break;

			case 3:
				{
				setState(135); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(138); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 5:
				{
				setState(140); match(9);
				setState(141); ((PattContext)_localctx).patt_0 = patt(0);
				setState(142); match(58);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 6:
				{
				setState(145); match(9);
				setState(146); ((PattContext)_localctx).patt_0 = patt(0);
				setState(147); match(46);
				setState(148); ((PattContext)_localctx).type_1 = type(0);
				setState(149); match(58);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 7:
				{
				setState(152); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 8:
				{
				setState(155); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((PattContext)_localctx)._patt =  builder.pattConstr(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(157); match(9);
				setState(158); ((PattContext)_localctx).patt_0 = patt(0);
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(159); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(162); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==11 );
				setState(164); match(58);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 10:
				{
				setState(167); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 11:
				{
				setState(170); match(47);
				setState(171); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(172); match(18);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 12:
				{
				setState(175); match(47);
				setState(176); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(177); match(18);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(192);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(182);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(183); match(48);
						setState(184); ((PattContext)_localctx).patt_1 = patt(9);
						((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).patt_1._patt));
						}
						break;

					case 2:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(187);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(188); match(28);
						setState(189); ((PattContext)_localctx).ident_1 = ident();
						((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
						}
						break;
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(197); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
			setState(206);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); ((DeclorexpContext)_localctx).decl_0 = decl();
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
			setState(216);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(209); match(11);
				setState(210); ((PattlistContext)_localctx).pattlist_1 = pattlist();
				((PattlistContext)_localctx)._pattlist =  builder.pattListMulti((((PattlistContext)_localctx).patt_0._patt),(((PattlistContext)_localctx).pattlist_1._pattlist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213); ((PattlistContext)_localctx).patt_0 = patt(0);
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
			setState(218); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
			setState(221); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(222); match(43);
			setState(223); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExplistContext explist() {
			return getRuleContext(ExplistContext.class,0);
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
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(227); match(11);
				setState(228); ((ExplistContext)_localctx).explist_1 = explist();
				((ExplistContext)_localctx)._explist =  builder.innerExpListMulti((((ExplistContext)_localctx).exp_0._exp),(((ExplistContext)_localctx).explist_1._explist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); ((ExplistContext)_localctx).exp_0 = exp(0);
				((ExplistContext)_localctx)._explist =  builder.innerExpListDouble((((ExplistContext)_localctx).exp_0._exp));
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
			setState(247);
			switch (_input.LA(1)) {
			case IDTOKEN:
				{
				setState(237); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			case 9:
				{
				setState(239); match(9);
				setState(240); ((TypeContext)_localctx).type_0 = type(0);
				setState(241); match(58);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;
			case 40:
				{
				setState(244); match(40);
				setState(245); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.varType(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(264);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(262);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(249);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(250); match(43);
						setState(251); ((TypeContext)_localctx).type_1 = type(4);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(254);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(256); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(255); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(258); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.tupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;
					}
					} 
				}
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(268); match(5);
				setState(269); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(272); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
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

	public static class RecordsingleContext extends ParserRuleContext {
		public Object _recordsingle;
		public Token IDTOKEN_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public RecordsingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordsingle; }
	}

	public final RecordsingleContext recordsingle() throws RecognitionException {
		RecordsingleContext _localctx = new RecordsingleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_recordsingle);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case IDTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(277); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(278); match(6);
				setState(279); ((RecordsingleContext)_localctx).exp_1 = exp(0);
				((RecordsingleContext)_localctx)._recordsingle =  builder.recordEntrySingle(idtoken((((RecordsingleContext)_localctx).IDTOKEN_0!=null?((RecordsingleContext)_localctx).IDTOKEN_0.getText():null)),(((RecordsingleContext)_localctx).exp_1._exp));
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 2);
				{
				setState(282); match(45);
				setState(283); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(284); match(6);
				setState(285); ((RecordsingleContext)_localctx).exp_1 = exp(0);
				((RecordsingleContext)_localctx)._recordsingle =  builder.recordEntryMutableSingle(idtoken((((RecordsingleContext)_localctx).IDTOKEN_0!=null?((RecordsingleContext)_localctx).IDTOKEN_0.getText():null)),(((RecordsingleContext)_localctx).exp_1._exp));
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
			setState(305);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(291); match(6);
				setState(292); ((DeclmonoContext)_localctx).exp_1 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMono((((DeclmonoContext)_localctx).patt_0._patt),(((DeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(297); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(296); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(299); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 47) | (1L << CHARTOKEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INTTOKEN - 64)) | (1L << (NULLTOKEN - 64)) | (1L << (STRINGTOKEN - 64)) | (1L << (EMPTYLISTTOKEN - 64)) | (1L << (FLOATTOKEN - 64)) | (1L << (WILDCARDTOKEN - 64)) | (1L << (BOOLTOKEN - 64)) | (1L << (IDTOKEN - 64)) | (1L << (CONSTRTOKEN - 64)))) != 0) );
				setState(301); match(6);
				setState(302); ((DeclmonoContext)_localctx).exp_2 = exp(0);
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
			setState(307); ((LetExpContext)_localctx).decl_0 = decl();
			setState(308); match(56);
			setState(309); ((LetExpContext)_localctx).exp_1 = exp(0);
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
			setState(312); match(11);
			setState(313); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
			setState(325);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(317); match(17);
				setState(318); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(322); match(17);
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
			setState(353);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(328); match(23);
				setState(329); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(332); match(55);
				setState(333); ((FunctionContext)_localctx).function_0 = function(0);
				setState(334); match(57);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(337); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(340); match(9);
				setState(341); ((FunctionContext)_localctx).function_0 = function(0);
				setState(342); match(58);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(345); match(1);
				setState(346); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(349); match(1);
				setState(350); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(355);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(356); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
			setState(364); match(59);
			setState(365); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
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

	public static class RecordpattappendixContext extends ParserRuleContext {
		public Object _recordpattappendix;
		public Token IDTOKEN_0;
		public PattContext patt_1;
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public RecordpattappendixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordpattappendix; }
	}

	public final RecordpattappendixContext recordpattappendix() throws RecognitionException {
		RecordpattappendixContext _localctx = new RecordpattappendixContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_recordpattappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368); match(11);
			setState(369); ((RecordpattappendixContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			setState(370); match(6);
			setState(371); ((RecordpattappendixContext)_localctx).patt_1 = patt(0);
			((RecordpattappendixContext)_localctx)._recordpattappendix =  builder.recordPattAppendix(idtoken((((RecordpattappendixContext)_localctx).IDTOKEN_0!=null?((RecordpattappendixContext)_localctx).IDTOKEN_0.getText():null)),(((RecordpattappendixContext)_localctx).patt_1._patt));
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
		public RecordsingleContext recordsingle_0;
		public RecordappendixContext recordappendix;
		public List<RecordappendixContext> recordappendix_1_list = new ArrayList<RecordappendixContext>();
		public ExpContext exp_3;
		public PattmatchContext pattmatch_1;
		public FunctionContext function_0;
		public LetExpContext letExp_0;
		public Token op_1512;
		public Token op_1511;
		public Token op_1508;
		public Token IDTOKEN_1;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExptupleContext exptuple(int i) {
			return getRuleContext(ExptupleContext.class,i);
		}
		public LetExpContext letExp() {
			return getRuleContext(LetExpContext.class,0);
		}
		public RecordsingleContext recordsingle() {
			return getRuleContext(RecordsingleContext.class,0);
		}
		public List<RecordappendixContext> recordappendix() {
			return getRuleContexts(RecordappendixContext.class);
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
		public RecordappendixContext recordappendix(int i) {
			return getRuleContext(RecordappendixContext.class,i);
		}
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(375); match(39);
				setState(376); ((ExpContext)_localctx).exp_0 = exp(35);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(379); match(60);
				setState(380); ((ExpContext)_localctx).exp_0 = exp(22);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 3:
				{
				setState(383); match(53);
				setState(384); ((ExpContext)_localctx).exp_0 = exp(21);
				((ExpContext)_localctx)._exp =  builder.floatNegateExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(387); match(61);
				setState(388); ((ExpContext)_localctx).exp_0 = exp(20);
				((ExpContext)_localctx)._exp =  builder.intUnarySub((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(391); match(35);
				setState(392); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(393); match(25);
				setState(394); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(395); match(54);
				setState(396); ((ExpContext)_localctx).exp_2 = exp(9);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 6:
				{
				setState(399); match(35);
				setState(400); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(401); match(25);
				setState(402); ((ExpContext)_localctx).exp_1 = exp(8);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 7:
				{
				setState(405); ((ExpContext)_localctx).EMPTYARRAYTOKEN_0 = match(EMPTYARRAYTOKEN);
				((ExpContext)_localctx)._exp =  builder.emptyArray(emptyarraytoken((((ExpContext)_localctx).EMPTYARRAYTOKEN_0!=null?((ExpContext)_localctx).EMPTYARRAYTOKEN_0.getText():null)));
				}
				break;

			case 8:
				{
				setState(407); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 9:
				{
				setState(410); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 10:
				{
				setState(413); match(9);
				setState(414); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(415); match(58);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 11:
				{
				setState(418); match(55);
				setState(419); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(420); match(57);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 12:
				{
				setState(423); match(9);
				setState(424); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(425); match(46);
				setState(426); ((ExpContext)_localctx).type_1 = type(0);
				setState(427); match(58);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 13:
				{
				setState(430); match(9);
				setState(431); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(433); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(432); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(435); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==11 );
				setState(437); match(58);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;

			case 14:
				{
				setState(440); match(47);
				setState(441); ((ExpContext)_localctx).explist_0 = explist();
				setState(442); match(18);
				((ExpContext)_localctx)._exp =  builder.expList((((ExpContext)_localctx).explist_0._explist));
				}
				break;

			case 15:
				{
				setState(445); match(37);
				setState(446); ((ExpContext)_localctx).exparray_0 = exparray();
				setState(448);
				_la = _input.LA(1);
				if (_la==33) {
					{
					setState(447); match(33);
					}
				}

				setState(450); match(20);
				((ExpContext)_localctx)._exp =  builder.arrayMulti((((ExpContext)_localctx).exparray_0._exparray));
				}
				break;

			case 16:
				{
				setState(453); match(37);
				setState(454); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(456);
				_la = _input.LA(1);
				if (_la==33) {
					{
					setState(455); match(33);
					}
				}

				setState(458); match(20);
				((ExpContext)_localctx)._exp =  builder.arraySingle((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 17:
				{
				setState(461); match(3);
				setState(462); ((ExpContext)_localctx).recordsingle_0 = recordsingle();
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(463); ((ExpContext)_localctx).recordappendix = recordappendix();
					((ExpContext)_localctx).recordappendix_1_list.add(((ExpContext)_localctx).recordappendix);
					}
					}
					setState(468);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(469); match(34);
				((ExpContext)_localctx)._exp =  builder.recordExp((((ExpContext)_localctx).recordsingle_0._recordsingle),lift("_recordappendix", ((ExpContext)_localctx).recordappendix_1_list));
				}
				break;

			case 18:
				{
				setState(472); match(2);
				setState(473); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(474); match(8);
				setState(475); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(476); match(13);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 19:
				{
				setState(479); match(7);
				setState(480); ((ExpContext)_localctx).ident_0 = ident();
				setState(481); match(6);
				setState(482); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(483); match(24);
				setState(484); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(485); match(8);
				setState(486); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(487); match(13);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 20:
				{
				setState(490); match(7);
				setState(491); ((ExpContext)_localctx).ident_0 = ident();
				setState(492); match(6);
				setState(493); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(494); match(44);
				setState(495); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(496); match(8);
				setState(497); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(498); match(13);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 21:
				{
				setState(501); match(22);
				setState(502); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(503); match(49);
				setState(504); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 22:
				{
				setState(507); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 23:
				{
				setState(510); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(582);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(580);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(515);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(516); match(5);
						setState(517); ((ExpContext)_localctx).exp_1 = exp(27);
						((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(520);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(521); match(14);
						setState(522); ((ExpContext)_localctx).exp_1 = exp(20);
						((ExpContext)_localctx)._exp =  builder.intMod((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(525);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(526);
						((ExpContext)_localctx).op_1512 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 19) | (1L << 27) | (1L << 32) | (1L << 41))) != 0)) ) {
							((ExpContext)_localctx).op_1512 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(527); ((ExpContext)_localctx).exp_1 = exp(19);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/") ? builder.intDivide(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*.") ? builder.floatMultiplyExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*") ? builder.intMultiply(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/.") ? builder.floatDivideExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(530);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(531);
						((ExpContext)_localctx).op_1511 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 26) | (1L << 51) | (1L << 53) | (1L << 61))) != 0)) ) {
							((ExpContext)_localctx).op_1511 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(532); ((ExpContext)_localctx).exp_1 = exp(18);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+.") ? builder.floatAddExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-.") ? builder.floatSubtractExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+") ? builder.intAdd(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-") ? builder.intSub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(535);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(536);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 15) | (1L << 16) | (1L << 36) | (1L << 50))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(537); ((ExpContext)_localctx).exp_1 = exp(17);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.smallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.greaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.smaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.equal(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.greater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(540);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(541); match(42);
						setState(542); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						setState(543); match(12);
						setState(544); ((ExpContext)_localctx).exp_2 = exp(15);
						((ExpContext)_localctx)._exp =  builder.recordAssignExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(547);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(548); match(30);
						setState(549); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(550); match(58);
						setState(551); match(12);
						setState(552); ((ExpContext)_localctx).exp_2 = exp(13);
						((ExpContext)_localctx)._exp =  builder.arrayAssign((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(555);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(556);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==38) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(557); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(560);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(561);
						_la = _input.LA(1);
						if ( !(_la==31 || _la==52) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(562); ((ExpContext)_localctx).exp_1 = exp(11);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(565);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(566); match(33);
						setState(567); ((ExpContext)_localctx).exp_1 = exp(4);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(570);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(571); match(42);
						setState(572); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						((ExpContext)_localctx)._exp =  builder.recordSelectExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)));
						}
						break;

					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(574);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(575); match(30);
						setState(576); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(577); match(58);
						((ExpContext)_localctx)._exp =  builder.arraySelect((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(584);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		enterRule(_localctx, 42, RULE_decllabelsandvariants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585); ((DecllabelsandvariantsContext)_localctx).ident_0 = ident();
			setState(586); match(6);
			setState(587); ((DecllabelsandvariantsContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
			setState(588); match(29);
			setState(589); ((DecllabelsandvariantsContext)_localctx).type_2 = type(0);
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
		enterRule(_localctx, 44, RULE_anddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592); match(59);
			setState(593); ((AnddeclContext)_localctx).declmono_0 = declmono();
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
		enterRule(_localctx, 46, RULE_varianttype);
		try {
			setState(603);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(597); match(29);
				setState(598); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 48, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(605); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(608); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 47) | (1L << CHARTOKEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INTTOKEN - 64)) | (1L << (NULLTOKEN - 64)) | (1L << (STRINGTOKEN - 64)) | (1L << (EMPTYLISTTOKEN - 64)) | (1L << (FLOATTOKEN - 64)) | (1L << (WILDCARDTOKEN - 64)) | (1L << (BOOLTOKEN - 64)) | (1L << (IDTOKEN - 64)) | (1L << (CONSTRTOKEN - 64)))) != 0) );
			setState(610); match(43);
			setState(611); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 50, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614); ((ProgContext)_localctx).declimpl_0 = declimpl();
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
		enterRule(_localctx, 52, RULE_exparray);
		try {
			setState(627);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(617); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(618); match(33);
				setState(619); ((ExparrayContext)_localctx).exparray_1 = exparray();
				((ExparrayContext)_localctx)._exparray =  builder.innerExpArrayMulti((((ExparrayContext)_localctx).exp_0._exp),(((ExparrayContext)_localctx).exparray_1._exparray));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(622); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(623); match(33);
				setState(624); ((ExparrayContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 54, RULE_exptuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629); match(11);
			setState(630); ((ExptupleContext)_localctx).exp_0 = exp(0);
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
			setState(633); match(41);
			setState(634); ((TupletypelistContext)_localctx).type_0 = type(0);
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

	public static class RecordappendixContext extends ParserRuleContext {
		public Object _recordappendix;
		public RecordsingleContext recordsingle_0;
		public RecordsingleContext recordsingle() {
			return getRuleContext(RecordsingleContext.class,0);
		}
		public RecordappendixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordappendix; }
	}

	public final RecordappendixContext recordappendix() throws RecognitionException {
		RecordappendixContext _localctx = new RecordappendixContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_recordappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637); match(11);
			setState(638); ((RecordappendixContext)_localctx).recordsingle_0 = recordsingle();
			((RecordappendixContext)_localctx)._recordappendix =  builder.recordEntryAppendix((((RecordappendixContext)_localctx).recordsingle_0._recordsingle));
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
		public TypeContext type_1;
		public ExpContext exp_2;
		public PattContext patt;
		public List<PattContext> patt_1_list = new ArrayList<PattContext>();
		public ExpContext exp_1;
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
		enterRule(_localctx, 60, RULE_recdeclmono);
		int _la;
		try {
			setState(665);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(641); match(9);
				setState(642); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(643); match(46);
				setState(644); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(645); match(58);
				setState(646); match(6);
				setState(647); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclPattTypeExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).type_1._type),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(650); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(652); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(651); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(654); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 47) | (1L << CHARTOKEN))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (INTTOKEN - 64)) | (1L << (NULLTOKEN - 64)) | (1L << (STRINGTOKEN - 64)) | (1L << (EMPTYLISTTOKEN - 64)) | (1L << (FLOATTOKEN - 64)) | (1L << (WILDCARDTOKEN - 64)) | (1L << (BOOLTOKEN - 64)) | (1L << (IDTOKEN - 64)) | (1L << (CONSTRTOKEN - 64)))) != 0) );
				setState(656); match(6);
				setState(657); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentPattsExp((((RecdeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((RecdeclmonoContext)_localctx).patt_1_list),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(660); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(661); match(6);
				setState(662); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).exp_1._exp));
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
		enterRule(_localctx, 62, RULE_recdecl);
		int _la;
		try {
			setState(678);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(667); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				((RecdeclContext)_localctx)._recdecl =  builder.recDeclMono((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(670); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(672); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(671); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(674); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==59 );
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

		case 17: return function_sempred((FunctionContext)_localctx, predIndex);

		case 20: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean patt_sempred(PattContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 8);

		case 1: return precpred(_ctx, 11);
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

		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return precpred(_ctx, 13);

		case 5: return precpred(_ctx, 27);

		case 6: return precpred(_ctx, 19);

		case 7: return precpred(_ctx, 18);

		case 8: return precpred(_ctx, 17);

		case 9: return precpred(_ctx, 16);

		case 10: return precpred(_ctx, 14);

		case 11: return precpred(_ctx, 12);

		case 12: return precpred(_ctx, 11);

		case 13: return precpred(_ctx, 10);

		case 14: return precpred(_ctx, 4);

		case 15: return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3K\u02ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2O\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4p\n\4\r\4\16\4q\3\4"+
		"\3\4\5\4v\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0082\n\5\f"+
		"\5\16\5\u0085\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u00a3"+
		"\n\5\r\5\16\5\u00a4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5\u00b7\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7"+
		"\5\u00c3\n\5\f\5\16\5\u00c6\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u00d1\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00db\n\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00ed"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00fa\n\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\6\f\u0103\n\f\r\f\16\f\u0104\3\f\3\f\7\f\u0109"+
		"\n\f\f\f\16\f\u010c\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0116\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0123\n\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u012c\n\17\r\17\16\17\u012d\3"+
		"\17\3\17\3\17\3\17\5\17\u0134\n\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0148\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0164"+
		"\n\23\3\23\3\23\3\23\3\23\7\23\u016a\n\23\f\23\16\23\u016d\13\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u01b4"+
		"\n\26\r\26\16\26\u01b5\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u01c3\n\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01cb\n\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01d3\n\26\f\26\16\26\u01d6\13\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0204\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\7\26\u0247\n\26\f\26\16\26\u024a\13\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u025e"+
		"\n\31\3\32\6\32\u0261\n\32\r\32\16\32\u0262\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0276"+
		"\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \6 \u028f\n \r \16 \u0290\3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \5 \u029c\n \3!\3!\3!\3!\3!\6!\u02a3\n!\r!\16!\u02a4\3!\3!\5"+
		"!\u02a9\n!\3!\2\6\b\26$*\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\62\64\668:<>@\2\7\6\2\25\25\35\35\"\"++\6\2\34\34\65\65\67\67"+
		"??\6\2\b\b\21\22&&\64\64\4\2\6\6((\4\2!!\66\66\u02e6\2N\3\2\2\2\4_\3\2"+
		"\2\2\6u\3\2\2\2\b\u00b6\3\2\2\2\n\u00c7\3\2\2\2\f\u00d0\3\2\2\2\16\u00da"+
		"\3\2\2\2\20\u00dc\3\2\2\2\22\u00df\3\2\2\2\24\u00ec\3\2\2\2\26\u00f9\3"+
		"\2\2\2\30\u0115\3\2\2\2\32\u0122\3\2\2\2\34\u0133\3\2\2\2\36\u0135\3\2"+
		"\2\2 \u013a\3\2\2\2\"\u0147\3\2\2\2$\u0163\3\2\2\2&\u016e\3\2\2\2(\u0172"+
		"\3\2\2\2*\u0203\3\2\2\2,\u024b\3\2\2\2.\u0252\3\2\2\2\60\u025d\3\2\2\2"+
		"\62\u0260\3\2\2\2\64\u0268\3\2\2\2\66\u0275\3\2\2\28\u0277\3\2\2\2:\u027b"+
		"\3\2\2\2<\u027f\3\2\2\2>\u029b\3\2\2\2@\u02a8\3\2\2\2BC\7\62\2\2CD\5\2"+
		"\2\2DE\b\2\1\2EO\3\2\2\2FG\5\22\n\2GH\7\62\2\2HI\5\2\2\2IJ\b\2\1\2JO\3"+
		"\2\2\2KL\5\22\n\2LM\b\2\1\2MO\3\2\2\2NB\3\2\2\2NF\3\2\2\2NK\3\2\2\2O\3"+
		"\3\2\2\2PQ\7E\2\2Q`\b\3\1\2RS\7B\2\2S`\b\3\1\2TU\7G\2\2U`\b\3\1\2VW\7"+
		"C\2\2W`\b\3\1\2XY\7I\2\2Y`\b\3\1\2Z[\7@\2\2[`\b\3\1\2\\]\5\20\t\2]^\b"+
		"\3\1\2^`\3\2\2\2_P\3\2\2\2_R\3\2\2\2_T\3\2\2\2_V\3\2\2\2_X\3\2\2\2_Z\3"+
		"\2\2\2_\\\3\2\2\2`\5\3\2\2\2ab\7\27\2\2bc\7\f\2\2cd\5@!\2de\b\4\1\2ev"+
		"\3\2\2\2fg\5\34\17\2gh\b\4\1\2hv\3\2\2\2ij\7\27\2\2jk\5\6\4\2kl\b\4\1"+
		"\2lv\3\2\2\2mo\5\34\17\2np\5.\30\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2"+
		"\2\2rs\3\2\2\2st\b\4\1\2tv\3\2\2\2ua\3\2\2\2uf\3\2\2\2ui\3\2\2\2um\3\2"+
		"\2\2v\7\3\2\2\2wx\b\5\1\2xy\7K\2\2yz\5\b\5\bz{\b\5\1\2{\u00b7\3\2\2\2"+
		"|}\7\5\2\2}~\7J\2\2~\177\7\b\2\2\177\u0083\5\b\5\2\u0080\u0082\5(\25\2"+
		"\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0086\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087\7$\2\2\u0087"+
		"\u0088\b\5\1\2\u0088\u00b7\3\2\2\2\u0089\u008a\5\n\6\2\u008a\u008b\b\5"+
		"\1\2\u008b\u00b7\3\2\2\2\u008c\u008d\7H\2\2\u008d\u00b7\b\5\1\2\u008e"+
		"\u008f\7\13\2\2\u008f\u0090\5\b\5\2\u0090\u0091\7<\2\2\u0091\u0092\b\5"+
		"\1\2\u0092\u00b7\3\2\2\2\u0093\u0094\7\13\2\2\u0094\u0095\5\b\5\2\u0095"+
		"\u0096\7\60\2\2\u0096\u0097\5\26\f\2\u0097\u0098\7<\2\2\u0098\u0099\b"+
		"\5\1\2\u0099\u00b7\3\2\2\2\u009a\u009b\5\4\3\2\u009b\u009c\b\5\1\2\u009c"+
		"\u00b7\3\2\2\2\u009d\u009e\7K\2\2\u009e\u00b7\b\5\1\2\u009f\u00a0\7\13"+
		"\2\2\u00a0\u00a2\5\b\5\2\u00a1\u00a3\5 \21\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a7\7<\2\2\u00a7\u00a8\b\5\1\2\u00a8\u00b7\3\2\2\2\u00a9"+
		"\u00aa\5\20\t\2\u00aa\u00ab\b\5\1\2\u00ab\u00b7\3\2\2\2\u00ac\u00ad\7"+
		"\61\2\2\u00ad\u00ae\5\16\b\2\u00ae\u00af\7\24\2\2\u00af\u00b0\b\5\1\2"+
		"\u00b0\u00b7\3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b3\5\30\r\2\u00b3\u00b4"+
		"\7\24\2\2\u00b4\u00b5\b\5\1\2\u00b5\u00b7\3\2\2\2\u00b6w\3\2\2\2\u00b6"+
		"|\3\2\2\2\u00b6\u0089\3\2\2\2\u00b6\u008c\3\2\2\2\u00b6\u008e\3\2\2\2"+
		"\u00b6\u0093\3\2\2\2\u00b6\u009a\3\2\2\2\u00b6\u009d\3\2\2\2\u00b6\u009f"+
		"\3\2\2\2\u00b6\u00a9\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7"+
		"\u00c4\3\2\2\2\u00b8\u00b9\f\n\2\2\u00b9\u00ba\7\62\2\2\u00ba\u00bb\5"+
		"\b\5\13\u00bb\u00bc\b\5\1\2\u00bc\u00c3\3\2\2\2\u00bd\u00be\f\r\2\2\u00be"+
		"\u00bf\7\36\2\2\u00bf\u00c0\5\n\6\2\u00c0\u00c1\b\5\1\2\u00c1\u00c3\3"+
		"\2\2\2\u00c2\u00b8\3\2\2\2\u00c2\u00bd\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4"+
		"\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\t\3\2\2\2\u00c6\u00c4\3\2\2\2"+
		"\u00c7\u00c8\7J\2\2\u00c8\u00c9\b\6\1\2\u00c9\13\3\2\2\2\u00ca\u00cb\5"+
		"*\26\2\u00cb\u00cc\b\7\1\2\u00cc\u00d1\3\2\2\2\u00cd\u00ce\5\6\4\2\u00ce"+
		"\u00cf\b\7\1\2\u00cf\u00d1\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0\u00cd\3\2"+
		"\2\2\u00d1\r\3\2\2\2\u00d2\u00d3\5\b\5\2\u00d3\u00d4\7\r\2\2\u00d4\u00d5"+
		"\5\16\b\2\u00d5\u00d6\b\b\1\2\u00d6\u00db\3\2\2\2\u00d7\u00d8\5\b\5\2"+
		"\u00d8\u00d9\b\b\1\2\u00d9\u00db\3\2\2\2\u00da\u00d2\3\2\2\2\u00da\u00d7"+
		"\3\2\2\2\u00db\17\3\2\2\2\u00dc\u00dd\7F\2\2\u00dd\u00de\b\t\1\2\u00de"+
		"\21\3\2\2\2\u00df\u00e0\5\b\5\2\u00e0\u00e1\7-\2\2\u00e1\u00e2\5*\26\2"+
		"\u00e2\u00e3\b\n\1\2\u00e3\23\3\2\2\2\u00e4\u00e5\5*\26\2\u00e5\u00e6"+
		"\7\r\2\2\u00e6\u00e7\5\24\13\2\u00e7\u00e8\b\13\1\2\u00e8\u00ed\3\2\2"+
		"\2\u00e9\u00ea\5*\26\2\u00ea\u00eb\b\13\1\2\u00eb\u00ed\3\2\2\2\u00ec"+
		"\u00e4\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed\25\3\2\2\2\u00ee\u00ef\b\f\1"+
		"\2\u00ef\u00f0\7J\2\2\u00f0\u00fa\b\f\1\2\u00f1\u00f2\7\13\2\2\u00f2\u00f3"+
		"\5\26\f\2\u00f3\u00f4\7<\2\2\u00f4\u00f5\b\f\1\2\u00f5\u00fa\3\2\2\2\u00f6"+
		"\u00f7\7*\2\2\u00f7\u00f8\7J\2\2\u00f8\u00fa\b\f\1\2\u00f9\u00ee\3\2\2"+
		"\2\u00f9\u00f1\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa\u010a\3\2\2\2\u00fb\u00fc"+
		"\f\5\2\2\u00fc\u00fd\7-\2\2\u00fd\u00fe\5\26\f\6\u00fe\u00ff\b\f\1\2\u00ff"+
		"\u0109\3\2\2\2\u0100\u0102\f\3\2\2\u0101\u0103\5:\36\2\u0102\u0101\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\b\f\1\2\u0107\u0109\3\2\2\2\u0108\u00fb\3\2"+
		"\2\2\u0108\u0100\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\27\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\5\b\5"+
		"\2\u010e\u010f\7\7\2\2\u010f\u0110\5\30\r\2\u0110\u0111\b\r\1\2\u0111"+
		"\u0116\3\2\2\2\u0112\u0113\5\b\5\2\u0113\u0114\b\r\1\2\u0114\u0116\3\2"+
		"\2\2\u0115\u010d\3\2\2\2\u0115\u0112\3\2\2\2\u0116\31\3\2\2\2\u0117\u0118"+
		"\7J\2\2\u0118\u0119\7\b\2\2\u0119\u011a\5*\26\2\u011a\u011b\b\16\1\2\u011b"+
		"\u0123\3\2\2\2\u011c\u011d\7/\2\2\u011d\u011e\7J\2\2\u011e\u011f\7\b\2"+
		"\2\u011f\u0120\5*\26\2\u0120\u0121\b\16\1\2\u0121\u0123\3\2\2\2\u0122"+
		"\u0117\3\2\2\2\u0122\u011c\3\2\2\2\u0123\33\3\2\2\2\u0124\u0125\5\b\5"+
		"\2\u0125\u0126\7\b\2\2\u0126\u0127\5*\26\2\u0127\u0128\b\17\1\2\u0128"+
		"\u0134\3\2\2\2\u0129\u012b\5\n\6\2\u012a\u012c\5\b\5\2\u012b\u012a\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\7\b\2\2\u0130\u0131\5*\26\2\u0131\u0132\b\17"+
		"\1\2\u0132\u0134\3\2\2\2\u0133\u0124\3\2\2\2\u0133\u0129\3\2\2\2\u0134"+
		"\35\3\2\2\2\u0135\u0136\5\6\4\2\u0136\u0137\7:\2\2\u0137\u0138\5*\26\2"+
		"\u0138\u0139\b\20\1\2\u0139\37\3\2\2\2\u013a\u013b\7\r\2\2\u013b\u013c"+
		"\5\b\5\2\u013c\u013d\b\21\1\2\u013d!\3\2\2\2\u013e\u013f\5\f\7\2\u013f"+
		"\u0140\7\23\2\2\u0140\u0141\5\"\22\2\u0141\u0142\b\22\1\2\u0142\u0148"+
		"\3\2\2\2\u0143\u0144\5\f\7\2\u0144\u0145\7\23\2\2\u0145\u0146\b\22\1\2"+
		"\u0146\u0148\3\2\2\2\u0147\u013e\3\2\2\2\u0147\u0143\3\2\2\2\u0148#\3"+
		"\2\2\2\u0149\u014a\b\23\1\2\u014a\u014b\7\31\2\2\u014b\u014c\5\2\2\2\u014c"+
		"\u014d\b\23\1\2\u014d\u0164\3\2\2\2\u014e\u014f\79\2\2\u014f\u0150\5$"+
		"\23\2\u0150\u0151\7;\2\2\u0151\u0152\b\23\1\2\u0152\u0164\3\2\2\2\u0153"+
		"\u0154\5\n\6\2\u0154\u0155\b\23\1\2\u0155\u0164\3\2\2\2\u0156\u0157\7"+
		"\13\2\2\u0157\u0158\5$\23\2\u0158\u0159\7<\2\2\u0159\u015a\b\23\1\2\u015a"+
		"\u0164\3\2\2\2\u015b\u015c\7\3\2\2\u015c\u015d\5\22\n\2\u015d\u015e\b"+
		"\23\1\2\u015e\u0164\3\2\2\2\u015f\u0160\7\3\2\2\u0160\u0161\5\62\32\2"+
		"\u0161\u0162\b\23\1\2\u0162\u0164\3\2\2\2\u0163\u0149\3\2\2\2\u0163\u014e"+
		"\3\2\2\2\u0163\u0153\3\2\2\2\u0163\u0156\3\2\2\2\u0163\u015b\3\2\2\2\u0163"+
		"\u015f\3\2\2\2\u0164\u016b\3\2\2\2\u0165\u0166\f\7\2\2\u0166\u0167\5*"+
		"\26\2\u0167\u0168\b\23\1\2\u0168\u016a\3\2\2\2\u0169\u0165\3\2\2\2\u016a"+
		"\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c%\3\2\2\2"+
		"\u016d\u016b\3\2\2\2\u016e\u016f\7=\2\2\u016f\u0170\5> \2\u0170\u0171"+
		"\b\24\1\2\u0171\'\3\2\2\2\u0172\u0173\7\r\2\2\u0173\u0174\7J\2\2\u0174"+
		"\u0175\7\b\2\2\u0175\u0176\5\b\5\2\u0176\u0177\b\25\1\2\u0177)\3\2\2\2"+
		"\u0178\u0179\b\26\1\2\u0179\u017a\7)\2\2\u017a\u017b\5*\26%\u017b\u017c"+
		"\b\26\1\2\u017c\u0204\3\2\2\2\u017d\u017e\7>\2\2\u017e\u017f\5*\26\30"+
		"\u017f\u0180\b\26\1\2\u0180\u0204\3\2\2\2\u0181\u0182\7\67\2\2\u0182\u0183"+
		"\5*\26\27\u0183\u0184\b\26\1\2\u0184\u0204\3\2\2\2\u0185\u0186\7?\2\2"+
		"\u0186\u0187\5*\26\26\u0187\u0188\b\26\1\2\u0188\u0204\3\2\2\2\u0189\u018a"+
		"\7%\2\2\u018a\u018b\5*\26\2\u018b\u018c\7\33\2\2\u018c\u018d\5*\26\2\u018d"+
		"\u018e\78\2\2\u018e\u018f\5*\26\13\u018f\u0190\b\26\1\2\u0190\u0204\3"+
		"\2\2\2\u0191\u0192\7%\2\2\u0192\u0193\5*\26\2\u0193\u0194\7\33\2\2\u0194"+
		"\u0195\5*\26\n\u0195\u0196\b\26\1\2\u0196\u0204\3\2\2\2\u0197\u0198\7"+
		"D\2\2\u0198\u0204\b\26\1\2\u0199\u019a\5\n\6\2\u019a\u019b\b\26\1\2\u019b"+
		"\u0204\3\2\2\2\u019c\u019d\5\4\3\2\u019d\u019e\b\26\1\2\u019e\u0204\3"+
		"\2\2\2\u019f\u01a0\7\13\2\2\u01a0\u01a1\5*\26\2\u01a1\u01a2\7<\2\2\u01a2"+
		"\u01a3\b\26\1\2\u01a3\u0204\3\2\2\2\u01a4\u01a5\79\2\2\u01a5\u01a6\5*"+
		"\26\2\u01a6\u01a7\7;\2\2\u01a7\u01a8\b\26\1\2\u01a8\u0204\3\2\2\2\u01a9"+
		"\u01aa\7\13\2\2\u01aa\u01ab\5*\26\2\u01ab\u01ac\7\60\2\2\u01ac\u01ad\5"+
		"\26\f\2\u01ad\u01ae\7<\2\2\u01ae\u01af\b\26\1\2\u01af\u0204\3\2\2\2\u01b0"+
		"\u01b1\7\13\2\2\u01b1\u01b3\5*\26\2\u01b2\u01b4\58\35\2\u01b3\u01b2\3"+
		"\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6"+
		"\u01b7\3\2\2\2\u01b7\u01b8\7<\2\2\u01b8\u01b9\b\26\1\2\u01b9\u0204\3\2"+
		"\2\2\u01ba\u01bb\7\61\2\2\u01bb\u01bc\5\24\13\2\u01bc\u01bd\7\24\2\2\u01bd"+
		"\u01be\b\26\1\2\u01be\u0204\3\2\2\2\u01bf\u01c0\7\'\2\2\u01c0\u01c2\5"+
		"\66\34\2\u01c1\u01c3\7#\2\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c5\7\26\2\2\u01c5\u01c6\b\26\1\2\u01c6\u0204\3"+
		"\2\2\2\u01c7\u01c8\7\'\2\2\u01c8\u01ca\5*\26\2\u01c9\u01cb\7#\2\2\u01ca"+
		"\u01c9\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01cd\7\26"+
		"\2\2\u01cd\u01ce\b\26\1\2\u01ce\u0204\3\2\2\2\u01cf\u01d0\7\5\2\2\u01d0"+
		"\u01d4\5\32\16\2\u01d1\u01d3\5<\37\2\u01d2\u01d1\3\2\2\2\u01d3\u01d6\3"+
		"\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6"+
		"\u01d4\3\2\2\2\u01d7\u01d8\7$\2\2\u01d8\u01d9\b\26\1\2\u01d9\u0204\3\2"+
		"\2\2\u01da\u01db\7\4\2\2\u01db\u01dc\5*\26\2\u01dc\u01dd\7\n\2\2\u01dd"+
		"\u01de\5*\26\2\u01de\u01df\7\17\2\2\u01df\u01e0\b\26\1\2\u01e0\u0204\3"+
		"\2\2\2\u01e1\u01e2\7\t\2\2\u01e2\u01e3\5\n\6\2\u01e3\u01e4\7\b\2\2\u01e4"+
		"\u01e5\5*\26\2\u01e5\u01e6\7\32\2\2\u01e6\u01e7\5*\26\2\u01e7\u01e8\7"+
		"\n\2\2\u01e8\u01e9\5*\26\2\u01e9\u01ea\7\17\2\2\u01ea\u01eb\b\26\1\2\u01eb"+
		"\u0204\3\2\2\2\u01ec\u01ed\7\t\2\2\u01ed\u01ee\5\n\6\2\u01ee\u01ef\7\b"+
		"\2\2\u01ef\u01f0\5*\26\2\u01f0\u01f1\7.\2\2\u01f1\u01f2\5*\26\2\u01f2"+
		"\u01f3\7\n\2\2\u01f3\u01f4\5*\26\2\u01f4\u01f5\7\17\2\2\u01f5\u01f6\b"+
		"\26\1\2\u01f6\u0204\3\2\2\2\u01f7\u01f8\7\30\2\2\u01f8\u01f9\5*\26\2\u01f9"+
		"\u01fa\7\63\2\2\u01fa\u01fb\5\2\2\2\u01fb\u01fc\b\26\1\2\u01fc\u0204\3"+
		"\2\2\2\u01fd\u01fe\5$\23\2\u01fe\u01ff\b\26\1\2\u01ff\u0204\3\2\2\2\u0200"+
		"\u0201\5\36\20\2\u0201\u0202\b\26\1\2\u0202\u0204\3\2\2\2\u0203\u0178"+
		"\3\2\2\2\u0203\u017d\3\2\2\2\u0203\u0181\3\2\2\2\u0203\u0185\3\2\2\2\u0203"+
		"\u0189\3\2\2\2\u0203\u0191\3\2\2\2\u0203\u0197\3\2\2\2\u0203\u0199\3\2"+
		"\2\2\u0203\u019c\3\2\2\2\u0203\u019f\3\2\2\2\u0203\u01a4\3\2\2\2\u0203"+
		"\u01a9\3\2\2\2\u0203\u01b0\3\2\2\2\u0203\u01ba\3\2\2\2\u0203\u01bf\3\2"+
		"\2\2\u0203\u01c7\3\2\2\2\u0203\u01cf\3\2\2\2\u0203\u01da\3\2\2\2\u0203"+
		"\u01e1\3\2\2\2\u0203\u01ec\3\2\2\2\u0203\u01f7\3\2\2\2\u0203\u01fd\3\2"+
		"\2\2\u0203\u0200\3\2\2\2\u0204\u0248\3\2\2\2\u0205\u0206\f\35\2\2\u0206"+
		"\u0207\7\7\2\2\u0207\u0208\5*\26\35\u0208\u0209\b\26\1\2\u0209\u0247\3"+
		"\2\2\2\u020a\u020b\f\25\2\2\u020b\u020c\7\20\2\2\u020c\u020d\5*\26\26"+
		"\u020d\u020e\b\26\1\2\u020e\u0247\3\2\2\2\u020f\u0210\f\24\2\2\u0210\u0211"+
		"\t\2\2\2\u0211\u0212\5*\26\25\u0212\u0213\b\26\1\2\u0213\u0247\3\2\2\2"+
		"\u0214\u0215\f\23\2\2\u0215\u0216\t\3\2\2\u0216\u0217\5*\26\24\u0217\u0218"+
		"\b\26\1\2\u0218\u0247\3\2\2\2\u0219\u021a\f\22\2\2\u021a\u021b\t\4\2\2"+
		"\u021b\u021c\5*\26\23\u021c\u021d\b\26\1\2\u021d\u0247\3\2\2\2\u021e\u021f"+
		"\f\20\2\2\u021f\u0220\7,\2\2\u0220\u0221\7J\2\2\u0221\u0222\7\16\2\2\u0222"+
		"\u0223\5*\26\21\u0223\u0224\b\26\1\2\u0224\u0247\3\2\2\2\u0225\u0226\f"+
		"\16\2\2\u0226\u0227\7 \2\2\u0227\u0228\5*\26\2\u0228\u0229\7<\2\2\u0229"+
		"\u022a\7\16\2\2\u022a\u022b\5*\26\17\u022b\u022c\b\26\1\2\u022c\u0247"+
		"\3\2\2\2\u022d\u022e\f\r\2\2\u022e\u022f\t\5\2\2\u022f\u0230\5*\26\16"+
		"\u0230\u0231\b\26\1\2\u0231\u0247\3\2\2\2\u0232\u0233\f\f\2\2\u0233\u0234"+
		"\t\6\2\2\u0234\u0235\5*\26\r\u0235\u0236\b\26\1\2\u0236\u0247\3\2\2\2"+
		"\u0237\u0238\f\6\2\2\u0238\u0239\7#\2\2\u0239\u023a\5*\26\6\u023a\u023b"+
		"\b\26\1\2\u023b\u0247\3\2\2\2\u023c\u023d\f\21\2\2\u023d\u023e\7,\2\2"+
		"\u023e\u023f\7J\2\2\u023f\u0247\b\26\1\2\u0240\u0241\f\17\2\2\u0241\u0242"+
		"\7 \2\2\u0242\u0243\5*\26\2\u0243\u0244\7<\2\2\u0244\u0245\b\26\1\2\u0245"+
		"\u0247\3\2\2\2\u0246\u0205\3\2\2\2\u0246\u020a\3\2\2\2\u0246\u020f\3\2"+
		"\2\2\u0246\u0214\3\2\2\2\u0246\u0219\3\2\2\2\u0246\u021e\3\2\2\2\u0246"+
		"\u0225\3\2\2\2\u0246\u022d\3\2\2\2\u0246\u0232\3\2\2\2\u0246\u0237\3\2"+
		"\2\2\u0246\u023c\3\2\2\2\u0246\u0240\3\2\2\2\u0247\u024a\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249+\3\2\2\2\u024a\u0248\3\2\2\2"+
		"\u024b\u024c\5\n\6\2\u024c\u024d\7\b\2\2\u024d\u024e\7J\2\2\u024e\u024f"+
		"\7\37\2\2\u024f\u0250\5\26\f\2\u0250\u0251\b\27\1\2\u0251-\3\2\2\2\u0252"+
		"\u0253\7=\2\2\u0253\u0254\5\34\17\2\u0254\u0255\b\30\1\2\u0255/\3\2\2"+
		"\2\u0256\u0257\7K\2\2\u0257\u0258\7\37\2\2\u0258\u0259\5\26\f\2\u0259"+
		"\u025a\b\31\1\2\u025a\u025e\3\2\2\2\u025b\u025c\7K\2\2\u025c\u025e\b\31"+
		"\1\2\u025d\u0256\3\2\2\2\u025d\u025b\3\2\2\2\u025e\61\3\2\2\2\u025f\u0261"+
		"\5\b\5\2\u0260\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0260\3\2\2\2\u0262"+
		"\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\7-\2\2\u0265\u0266\5*\26"+
		"\2\u0266\u0267\b\32\1\2\u0267\63\3\2\2\2\u0268\u0269\5\"\22\2\u0269\u026a"+
		"\b\33\1\2\u026a\65\3\2\2\2\u026b\u026c\5*\26\2\u026c\u026d\7#\2\2\u026d"+
		"\u026e\5\66\34\2\u026e\u026f\b\34\1\2\u026f\u0276\3\2\2\2\u0270\u0271"+
		"\5*\26\2\u0271\u0272\7#\2\2\u0272\u0273\5*\26\2\u0273\u0274\b\34\1\2\u0274"+
		"\u0276\3\2\2\2\u0275\u026b\3\2\2\2\u0275\u0270\3\2\2\2\u0276\67\3\2\2"+
		"\2\u0277\u0278\7\r\2\2\u0278\u0279\5*\26\2\u0279\u027a\b\35\1\2\u027a"+
		"9\3\2\2\2\u027b\u027c\7+\2\2\u027c\u027d\5\26\f\2\u027d\u027e\b\36\1\2"+
		"\u027e;\3\2\2\2\u027f\u0280\7\r\2\2\u0280\u0281\5\32\16\2\u0281\u0282"+
		"\b\37\1\2\u0282=\3\2\2\2\u0283\u0284\7\13\2\2\u0284\u0285\5\n\6\2\u0285"+
		"\u0286\7\60\2\2\u0286\u0287\5\26\f\2\u0287\u0288\7<\2\2\u0288\u0289\7"+
		"\b\2\2\u0289\u028a\5*\26\2\u028a\u028b\b \1\2\u028b\u029c\3\2\2\2\u028c"+
		"\u028e\5\n\6\2\u028d\u028f\5\b\5\2\u028e\u028d\3\2\2\2\u028f\u0290\3\2"+
		"\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0293\7\b\2\2\u0293\u0294\5*\26\2\u0294\u0295\b \1\2\u0295\u029c\3\2"+
		"\2\2\u0296\u0297\5\n\6\2\u0297\u0298\7\b\2\2\u0298\u0299\5*\26\2\u0299"+
		"\u029a\b \1\2\u029a\u029c\3\2\2\2\u029b\u0283\3\2\2\2\u029b\u028c\3\2"+
		"\2\2\u029b\u0296\3\2\2\2\u029c?\3\2\2\2\u029d\u029e\5> \2\u029e\u029f"+
		"\b!\1\2\u029f\u02a9\3\2\2\2\u02a0\u02a2\5> \2\u02a1\u02a3\5&\24\2\u02a2"+
		"\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4\u02a5\3\2"+
		"\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a7\b!\1\2\u02a7\u02a9\3\2\2\2\u02a8"+
		"\u029d\3\2\2\2\u02a8\u02a0\3\2\2\2\u02a9A\3\2\2\2\'N_qu\u0083\u00a4\u00b6"+
		"\u00c2\u00c4\u00d0\u00da\u00ec\u00f9\u0104\u0108\u010a\u0115\u0122\u012d"+
		"\u0133\u0147\u0163\u016b\u01b5\u01c2\u01ca\u01d4\u0203\u0246\u0248\u025d"+
		"\u0262\u0275\u0290\u029b\u02a4\u02a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}