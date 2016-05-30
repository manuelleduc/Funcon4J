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
		T__61=1, T__60=2, T__59=3, T__58=4, T__57=5, T__56=6, T__55=7, T__54=8, 
		T__53=9, T__52=10, T__51=11, T__50=12, T__49=13, T__48=14, T__47=15, T__46=16, 
		T__45=17, T__44=18, T__43=19, T__42=20, T__41=21, T__40=22, T__39=23, 
		T__38=24, T__37=25, T__36=26, T__35=27, T__34=28, T__33=29, T__32=30, 
		T__31=31, T__30=32, T__29=33, T__28=34, T__27=35, T__26=36, T__25=37, 
		T__24=38, T__23=39, T__22=40, T__21=41, T__20=42, T__19=43, T__18=44, 
		T__17=45, T__16=46, T__15=47, T__14=48, T__13=49, T__12=50, T__11=51, 
		T__10=52, T__9=53, T__8=54, T__7=55, T__6=56, T__5=57, T__4=58, T__3=59, 
		T__2=60, T__1=61, T__0=62, CHARTOKEN=63, WS=64, INTTOKEN=65, NULLTOKEN=66, 
		STRINGTOKEN=67, EMPTYLISTTOKEN=68, EMPTYARRAYTOKEN=69, FLOATTOKEN=70, 
		WILDCARDTOKEN=71, BOOLTOKEN=72, IDTOKEN=73, CONSTRTOKEN=74;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'while'", "'{'", "'&&'", "'::'", "'='", "'for'", 
		"'do'", "'('", "'rec'", "','", "'<-'", "'done'", "'mod'", "'>='", "'<'", 
		"';;'", "']'", "'*.'", "'type'", "'|]'", "'let'", "'match'", "'function'", 
		"'downto'", "'then'", "'+'", "'/'", "'as'", "'of'", "'.('", "'||'", "'/.'", 
		"';'", "'}'", "'if'", "'<='", "'[|'", "'&'", "'print'", "'''", "'*'", 
		"'.'", "'->'", "'to'", "'mutable'", "':'", "'['", "'|'", "'with'", "'>'", 
		"'+.'", "'or'", "'-.'", "'else'", "'begin'", "'in'", "'end'", "')'", "'and'", 
		"'not'", "'-'", "CHARTOKEN", "WS", "INTTOKEN", "NULLTOKEN", "STRINGTOKEN", 
		"EMPTYLISTTOKEN", "EMPTYARRAYTOKEN", "FLOATTOKEN", "'_'", "BOOLTOKEN", 
		"IDTOKEN", "CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decl = 2, RULE_patt = 3, RULE_ident = 4, 
		RULE_declorexp = 5, RULE_declconstrtypeappendix = 6, RULE_pattlist = 7, 
		RULE_declenumtypeappendix = 8, RULE_emptylist = 9, RULE_pattmatchsingle = 10, 
		RULE_type = 11, RULE_headtaillistpatt = 12, RULE_recordsingle = 13, RULE_declmono = 14, 
		RULE_letExp = 15, RULE_patttuple = 16, RULE_declimpl = 17, RULE_function = 18, 
		RULE_recanddecl = 19, RULE_recordpattappendix = 20, RULE_exp = 21, RULE_decllabelsandvariants = 22, 
		RULE_anddecl = 23, RULE_varianttype = 24, RULE_pattmatchcurried = 25, 
		RULE_prog = 26, RULE_exparray = 27, RULE_tupletypelist = 28, RULE_recdeclmono = 29, 
		RULE_recdecl = 30;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decl", "patt", "ident", "declorexp", "declconstrtypeappendix", 
		"pattlist", "declenumtypeappendix", "emptylist", "pattmatchsingle", "type", 
		"headtaillistpatt", "recordsingle", "declmono", "letExp", "patttuple", 
		"declimpl", "function", "recanddecl", "recordpattappendix", "exp", "decllabelsandvariants", 
		"anddecl", "varianttype", "pattmatchcurried", "prog", "exparray", "tupletypelist", 
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
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62); match(49);
				setState(63); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				setState(67); match(49);
				setState(68); ((PattmatchContext)_localctx).pattmatch_1 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchMulti((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle),(((PattmatchContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
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
		public Token FLOATTOKEN_0;
		public Token INTTOKEN_0;
		public Token BOOLTOKEN_0;
		public Token CONSTRTOKEN_0;
		public Token CHARTOKEN_0;
		public Token STRINGTOKEN_0;
		public Token NULLTOKEN_0;
		public EmptylistContext emptylist_0;
		public TerminalNode FLOATTOKEN() { return getToken(CLParser.FLOATTOKEN, 0); }
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
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
			case FLOATTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); ((ConstantContext)_localctx).FLOATTOKEN_0 = match(FLOATTOKEN);
				((ConstantContext)_localctx)._constant =  builder.float_(floattoken((((ConstantContext)_localctx).FLOATTOKEN_0!=null?((ConstantContext)_localctx).FLOATTOKEN_0.getText():null)));
				}
				break;
			case INTTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); ((ConstantContext)_localctx).INTTOKEN_0 = match(INTTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(inttoken((((ConstantContext)_localctx).INTTOKEN_0!=null?((ConstantContext)_localctx).INTTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(80); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case CONSTRTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(82); ((ConstantContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((ConstantContext)_localctx)._constant =  builder.constr(constrtoken((((ConstantContext)_localctx).CONSTRTOKEN_0!=null?((ConstantContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;
			case CHARTOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(84); ((ConstantContext)_localctx).CHARTOKEN_0 = match(CHARTOKEN);
				((ConstantContext)_localctx)._constant =  builder.char_(chartoken((((ConstantContext)_localctx).CHARTOKEN_0!=null?((ConstantContext)_localctx).CHARTOKEN_0.getText():null)));
				}
				break;
			case STRINGTOKEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(86); ((ConstantContext)_localctx).STRINGTOKEN_0 = match(STRINGTOKEN);
				((ConstantContext)_localctx)._constant =  builder.string(stringtoken((((ConstantContext)_localctx).STRINGTOKEN_0!=null?((ConstantContext)_localctx).STRINGTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(88); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 8);
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
		public DeclmonoContext declmono_0;
		public RecdeclContext recdecl_0;
		public Token IDTOKEN_0;
		public Token CONSTRTOKEN_1;
		public TypeContext type_2;
		public DeclconstrtypeappendixContext declconstrtypeappendix;
		public List<DeclconstrtypeappendixContext> declconstrtypeappendix_3_list = new ArrayList<DeclconstrtypeappendixContext>();
		public DeclenumtypeappendixContext declenumtypeappendix;
		public List<DeclenumtypeappendixContext> declenumtypeappendix_2_list = new ArrayList<DeclenumtypeappendixContext>();
		public DeclContext decl_0;
		public AnddeclContext anddecl;
		public List<AnddeclContext> anddecl_1_list = new ArrayList<AnddeclContext>();
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public List<DeclenumtypeappendixContext> declenumtypeappendix() {
			return getRuleContexts(DeclenumtypeappendixContext.class);
		}
		public DeclconstrtypeappendixContext declconstrtypeappendix(int i) {
			return getRuleContext(DeclconstrtypeappendixContext.class,i);
		}
		public AnddeclContext anddecl(int i) {
			return getRuleContext(AnddeclContext.class,i);
		}
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public DeclmonoContext declmono() {
			return getRuleContext(DeclmonoContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public List<DeclconstrtypeappendixContext> declconstrtypeappendix() {
			return getRuleContexts(DeclconstrtypeappendixContext.class);
		}
		public DeclenumtypeappendixContext declenumtypeappendix(int i) {
			return getRuleContext(DeclenumtypeappendixContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
			setState(140);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); match(22);
				setState(99); match(10);
				setState(100); ((DeclContext)_localctx).recdecl_0 = recdecl();
				((DeclContext)_localctx)._decl =  builder.declRec((((DeclContext)_localctx).recdecl_0._recdecl));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103); match(20);
				setState(104); ((DeclContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(105); match(6);
				setState(106); ((DeclContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(107); match(30);
				setState(108); ((DeclContext)_localctx).type_2 = type(0);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==49) {
					{
					{
					setState(109); ((DeclContext)_localctx).declconstrtypeappendix = declconstrtypeappendix();
					((DeclContext)_localctx).declconstrtypeappendix_3_list.add(((DeclContext)_localctx).declconstrtypeappendix);
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declNewConstrType(idtoken((((DeclContext)_localctx).IDTOKEN_0!=null?((DeclContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclContext)_localctx).CONSTRTOKEN_1!=null?((DeclContext)_localctx).CONSTRTOKEN_1.getText():null)),(((DeclContext)_localctx).type_2._type),lift("_declconstrtypeappendix", ((DeclContext)_localctx).declconstrtypeappendix_3_list));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117); match(20);
				setState(118); ((DeclContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(119); match(6);
				setState(120); ((DeclContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==49) {
					{
					{
					setState(121); ((DeclContext)_localctx).declenumtypeappendix = declenumtypeappendix();
					((DeclContext)_localctx).declenumtypeappendix_2_list.add(((DeclContext)_localctx).declenumtypeappendix);
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declNewEnumType(idtoken((((DeclContext)_localctx).IDTOKEN_0!=null?((DeclContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclContext)_localctx).CONSTRTOKEN_1!=null?((DeclContext)_localctx).CONSTRTOKEN_1.getText():null)),lift("_declenumtypeappendix", ((DeclContext)_localctx).declenumtypeappendix_2_list));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128); match(22);
				setState(129); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(133); ((DeclContext)_localctx).anddecl = anddecl();
					((DeclContext)_localctx).anddecl_1_list.add(((DeclContext)_localctx).anddecl);
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==60 );
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
			setState(205);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(143); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(144); ((PattContext)_localctx).patt_1 = patt(6);
				((PattContext)_localctx)._patt =  builder.pattConstrPatt(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt));
				}
				break;

			case 2:
				{
				setState(147); match(3);
				setState(148); ((PattContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(149); match(6);
				setState(150); ((PattContext)_localctx).patt_1 = patt(0);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(151); ((PattContext)_localctx).recordpattappendix = recordpattappendix();
					((PattContext)_localctx).recordpattappendix_2_list.add(((PattContext)_localctx).recordpattappendix);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(157); match(35);
				((PattContext)_localctx)._patt =  builder.recordPatt(idtoken((((PattContext)_localctx).IDTOKEN_0!=null?((PattContext)_localctx).IDTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt),lift("_recordpattappendix", ((PattContext)_localctx).recordpattappendix_2_list));
				}
				break;

			case 3:
				{
				setState(160); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(163); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 5:
				{
				setState(165); match(9);
				setState(166); ((PattContext)_localctx).patt_0 = patt(0);
				setState(167); match(59);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 6:
				{
				setState(170); match(9);
				setState(171); ((PattContext)_localctx).patt_0 = patt(0);
				setState(172); match(47);
				setState(173); ((PattContext)_localctx).type_1 = type(0);
				setState(174); match(59);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 7:
				{
				setState(177); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 8:
				{
				setState(180); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((PattContext)_localctx)._patt =  builder.pattConstr(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(182); match(9);
				setState(183); ((PattContext)_localctx).patt_0 = patt(0);
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(184); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(187); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==11 );
				setState(189); match(59);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 10:
				{
				setState(192); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 11:
				{
				setState(195); match(48);
				setState(196); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(197); match(18);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 12:
				{
				setState(200); match(48);
				setState(201); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(202); match(18);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(207);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(208); match(49);
						setState(209); ((PattContext)_localctx).patt_1 = patt(9);
						((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).patt_1._patt));
						}
						break;

					case 2:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(212);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(213); match(29);
						setState(214); ((PattContext)_localctx).ident_1 = ident();
						((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
						}
						break;
					}
					} 
				}
				setState(221);
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
			setState(222); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228); ((DeclorexpContext)_localctx).decl_0 = decl();
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

	public static class DeclconstrtypeappendixContext extends ParserRuleContext {
		public Object _declconstrtypeappendix;
		public Token CONSTRTOKEN_0;
		public TypeContext type_1;
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclconstrtypeappendixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declconstrtypeappendix; }
	}

	public final DeclconstrtypeappendixContext declconstrtypeappendix() throws RecognitionException {
		DeclconstrtypeappendixContext _localctx = new DeclconstrtypeappendixContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declconstrtypeappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); match(49);
			setState(234); ((DeclconstrtypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
			setState(235); match(30);
			setState(236); ((DeclconstrtypeappendixContext)_localctx).type_1 = type(0);
			((DeclconstrtypeappendixContext)_localctx)._declconstrtypeappendix =  builder.declConstrTypeAppendix(constrtoken((((DeclconstrtypeappendixContext)_localctx).CONSTRTOKEN_0!=null?((DeclconstrtypeappendixContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DeclconstrtypeappendixContext)_localctx).type_1._type));
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
			setState(247);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(240); match(11);
				setState(241); ((PattlistContext)_localctx).pattlist_1 = pattlist();
				((PattlistContext)_localctx)._pattlist =  builder.pattListMulti((((PattlistContext)_localctx).patt_0._patt),(((PattlistContext)_localctx).pattlist_1._pattlist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244); ((PattlistContext)_localctx).patt_0 = patt(0);
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

	public static class DeclenumtypeappendixContext extends ParserRuleContext {
		public Object _declenumtypeappendix;
		public Token CONSTRTOKEN_0;
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public DeclenumtypeappendixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declenumtypeappendix; }
	}

	public final DeclenumtypeappendixContext declenumtypeappendix() throws RecognitionException {
		DeclenumtypeappendixContext _localctx = new DeclenumtypeappendixContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declenumtypeappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(49);
			setState(250); ((DeclenumtypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
			((DeclenumtypeappendixContext)_localctx)._declenumtypeappendix =  builder.declEnumTypeAppendix(constrtoken((((DeclenumtypeappendixContext)_localctx).CONSTRTOKEN_0!=null?((DeclenumtypeappendixContext)_localctx).CONSTRTOKEN_0.getText():null)));
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
		enterRule(_localctx, 18, RULE_emptylist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
		enterRule(_localctx, 20, RULE_pattmatchsingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(257); match(44);
			setState(258); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
			setState(272);
			switch (_input.LA(1)) {
			case 9:
				{
				setState(262); match(9);
				setState(263); ((TypeContext)_localctx).type_0 = type(0);
				setState(264); match(59);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;
			case IDTOKEN:
				{
				setState(267); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			case 41:
				{
				setState(269); match(41);
				setState(270); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.varType(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(289);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(287);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(274);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(275); match(44);
						setState(276); ((TypeContext)_localctx).type_1 = type(3);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(279);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(281); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(280); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(283); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.tupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;
					}
					} 
				}
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
			setState(300);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(292); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(293); match(5);
				setState(294); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
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
		enterRule(_localctx, 26, RULE_recordsingle);
		try {
			setState(313);
			switch (_input.LA(1)) {
			case 46:
				enterOuterAlt(_localctx, 1);
				{
				setState(302); match(46);
				setState(303); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(304); match(6);
				setState(305); ((RecordsingleContext)_localctx).exp_1 = exp(0);
				((RecordsingleContext)_localctx)._recordsingle =  builder.recordEntryMutableSingle(idtoken((((RecordsingleContext)_localctx).IDTOKEN_0!=null?((RecordsingleContext)_localctx).IDTOKEN_0.getText():null)),(((RecordsingleContext)_localctx).exp_1._exp));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(308); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(309); match(6);
				setState(310); ((RecordsingleContext)_localctx).exp_1 = exp(0);
				((RecordsingleContext)_localctx)._recordsingle =  builder.recordEntrySingle(idtoken((((RecordsingleContext)_localctx).IDTOKEN_0!=null?((RecordsingleContext)_localctx).IDTOKEN_0.getText():null)),(((RecordsingleContext)_localctx).exp_1._exp));
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
		public IdentContext ident_0;
		public PattContext patt;
		public List<PattContext> patt_1_list = new ArrayList<PattContext>();
		public ExpContext exp_2;
		public PattContext patt_0;
		public ExpContext exp_1;
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
		enterRule(_localctx, 28, RULE_declmono);
		int _la;
		try {
			setState(330);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(317); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(316); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(319); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 48) | (1L << CHARTOKEN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INTTOKEN - 65)) | (1L << (NULLTOKEN - 65)) | (1L << (STRINGTOKEN - 65)) | (1L << (EMPTYLISTTOKEN - 65)) | (1L << (FLOATTOKEN - 65)) | (1L << (WILDCARDTOKEN - 65)) | (1L << (BOOLTOKEN - 65)) | (1L << (IDTOKEN - 65)) | (1L << (CONSTRTOKEN - 65)))) != 0) );
				setState(321); match(6);
				setState(322); ((DeclmonoContext)_localctx).exp_2 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMonoFunc((((DeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((DeclmonoContext)_localctx).patt_1_list),(((DeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(325); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(326); match(6);
				setState(327); ((DeclmonoContext)_localctx).exp_1 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMono((((DeclmonoContext)_localctx).patt_0._patt),(((DeclmonoContext)_localctx).exp_1._exp));
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
		enterRule(_localctx, 30, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); ((LetExpContext)_localctx).decl_0 = decl();
			setState(333); match(57);
			setState(334); ((LetExpContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 32, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337); match(11);
			setState(338); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
		enterRule(_localctx, 34, RULE_declimpl);
		try {
			setState(350);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(342); match(17);
				setState(343); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(347); match(17);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(353); match(24);
				setState(354); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(357); match(9);
				setState(358); ((FunctionContext)_localctx).function_0 = function(0);
				setState(359); match(59);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(362); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(365); match(56);
				setState(366); ((FunctionContext)_localctx).function_0 = function(0);
				setState(367); match(58);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(370); match(1);
				setState(371); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(374); match(1);
				setState(375); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(380);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(381); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		enterRule(_localctx, 38, RULE_recanddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389); match(60);
			setState(390); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
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
		enterRule(_localctx, 40, RULE_recordpattappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); match(11);
			setState(394); ((RecordpattappendixContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			setState(395); match(6);
			setState(396); ((RecordpattappendixContext)_localctx).patt_1 = patt(0);
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
		public Token CONSTRTOKEN_0;
		public ExpContext exp_1;
		public ExpContext exp_2;
		public Token EMPTYARRAYTOKEN_0;
		public IdentContext ident_0;
		public ConstantContext constant_0;
		public TypeContext type_1;
		public ExpContext exp;
		public List<ExpContext> exp_0tail = new ArrayList<ExpContext>();
		public ExparrayContext exparray_0;
		public RecordsingleContext recordsingle_0;
		public RecordsingleContext recordsingle;
		public List<RecordsingleContext> recordsingle_0tail = new ArrayList<RecordsingleContext>();
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
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public LetExpContext letExp() {
			return getRuleContext(LetExpContext.class,0);
		}
		public List<RecordsingleContext> recordsingle() {
			return getRuleContexts(RecordsingleContext.class);
		}
		public RecordsingleContext recordsingle(int i) {
			return getRuleContext(RecordsingleContext.class,i);
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
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(400); match(40);
				setState(401); ((ExpContext)_localctx).exp_0 = exp(36);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(404); ((ExpContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(405); ((ExpContext)_localctx).exp_1 = exp(28);
				((ExpContext)_localctx)._exp =  builder.constrExp(constrtoken((((ExpContext)_localctx).CONSTRTOKEN_0!=null?((ExpContext)_localctx).CONSTRTOKEN_0.getText():null)),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 3:
				{
				setState(408); match(61);
				setState(409); ((ExpContext)_localctx).exp_0 = exp(22);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(412); match(54);
				setState(413); ((ExpContext)_localctx).exp_0 = exp(21);
				((ExpContext)_localctx)._exp =  builder.floatNegateExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(416); match(62);
				setState(417); ((ExpContext)_localctx).exp_0 = exp(20);
				((ExpContext)_localctx)._exp =  builder.intUnarySub((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 6:
				{
				setState(420); match(36);
				setState(421); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(422); match(26);
				setState(423); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(424); match(55);
				setState(425); ((ExpContext)_localctx).exp_2 = exp(9);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 7:
				{
				setState(428); match(36);
				setState(429); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(430); match(26);
				setState(431); ((ExpContext)_localctx).exp_1 = exp(8);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 8:
				{
				setState(434); ((ExpContext)_localctx).EMPTYARRAYTOKEN_0 = match(EMPTYARRAYTOKEN);
				((ExpContext)_localctx)._exp =  builder.emptyArray(emptyarraytoken((((ExpContext)_localctx).EMPTYARRAYTOKEN_0!=null?((ExpContext)_localctx).EMPTYARRAYTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(436); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 10:
				{
				setState(439); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 11:
				{
				setState(442); match(9);
				setState(443); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(444); match(59);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 12:
				{
				setState(447); match(56);
				setState(448); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(449); match(58);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(452); match(9);
				setState(453); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(454); match(47);
				setState(455); ((ExpContext)_localctx).type_1 = type(0);
				setState(456); match(59);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 14:
				{
				setState(459); match(9);
				{
				setState(460); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(461); match(11);
					setState(462); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(467);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(468); match(59);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 15:
				{
				setState(471); match(48);
				{
				setState(472); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(473); match(11);
					setState(474); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(479);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(480); match(18);
				((ExpContext)_localctx)._exp =  builder.expList(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 16:
				{
				setState(483); match(38);
				setState(484); ((ExpContext)_localctx).exparray_0 = exparray();
				setState(486);
				_la = _input.LA(1);
				if (_la==34) {
					{
					setState(485); match(34);
					}
				}

				setState(488); match(21);
				((ExpContext)_localctx)._exp =  builder.arrayMulti((((ExpContext)_localctx).exparray_0._exparray));
				}
				break;

			case 17:
				{
				setState(491); match(38);
				setState(492); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(494);
				_la = _input.LA(1);
				if (_la==34) {
					{
					setState(493); match(34);
					}
				}

				setState(496); match(21);
				((ExpContext)_localctx)._exp =  builder.arraySingle((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 18:
				{
				setState(499); match(3);
				{
				setState(500); ((ExpContext)_localctx).recordsingle_0 = recordsingle();
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(501); match(11);
					setState(502); ((ExpContext)_localctx).recordsingle = recordsingle();
					((ExpContext)_localctx).recordsingle_0tail.add(((ExpContext)_localctx).recordsingle);
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(508); match(35);
				((ExpContext)_localctx)._exp =  builder.recordExp(lift("_recordsingle", ((ExpContext)_localctx).recordsingle_0tail, ((ExpContext)_localctx).recordsingle_0._recordsingle));
				}
				break;

			case 19:
				{
				setState(511); match(2);
				setState(512); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(513); match(8);
				setState(514); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(515); match(13);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 20:
				{
				setState(518); match(7);
				setState(519); ((ExpContext)_localctx).ident_0 = ident();
				setState(520); match(6);
				setState(521); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(522); match(25);
				setState(523); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(524); match(8);
				setState(525); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(526); match(13);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 21:
				{
				setState(529); match(7);
				setState(530); ((ExpContext)_localctx).ident_0 = ident();
				setState(531); match(6);
				setState(532); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(533); match(45);
				setState(534); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(535); match(8);
				setState(536); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(537); match(13);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 22:
				{
				setState(540); match(23);
				setState(541); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(542); match(50);
				setState(543); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 23:
				{
				setState(546); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 24:
				{
				setState(549); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(621);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(619);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(554);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(555); match(5);
						setState(556); ((ExpContext)_localctx).exp_1 = exp(27);
						((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(559);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(560); match(14);
						setState(561); ((ExpContext)_localctx).exp_1 = exp(20);
						((ExpContext)_localctx)._exp =  builder.intMod((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(564);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(565);
						((ExpContext)_localctx).op_1512 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 19) | (1L << 28) | (1L << 33) | (1L << 42))) != 0)) ) {
							((ExpContext)_localctx).op_1512 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(566); ((ExpContext)_localctx).exp_1 = exp(19);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/") ? builder.intDivide(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*.") ? builder.floatMultiplyExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*") ? builder.intMultiply(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/.") ? builder.floatDivideExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(569);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(570);
						((ExpContext)_localctx).op_1511 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 27) | (1L << 52) | (1L << 54) | (1L << 62))) != 0)) ) {
							((ExpContext)_localctx).op_1511 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(571); ((ExpContext)_localctx).exp_1 = exp(18);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+.") ? builder.floatAddExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-.") ? builder.floatSubtractExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+") ? builder.intAdd(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-") ? builder.intSub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(574);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(575);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 15) | (1L << 16) | (1L << 37) | (1L << 51))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(576); ((ExpContext)_localctx).exp_1 = exp(17);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.smallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.greaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.smaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.equal(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.greater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(579);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(580); match(43);
						setState(581); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						setState(582); match(12);
						setState(583); ((ExpContext)_localctx).exp_2 = exp(15);
						((ExpContext)_localctx)._exp =  builder.recordAssignExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(586);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(587); match(31);
						setState(588); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(589); match(59);
						setState(590); match(12);
						setState(591); ((ExpContext)_localctx).exp_2 = exp(13);
						((ExpContext)_localctx)._exp =  builder.arrayAssign((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(594);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(595);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==39) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(596); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(599);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(600);
						_la = _input.LA(1);
						if ( !(_la==32 || _la==53) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(601); ((ExpContext)_localctx).exp_1 = exp(11);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(604);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(605); match(34);
						setState(606); ((ExpContext)_localctx).exp_1 = exp(4);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(609);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(610); match(43);
						setState(611); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						((ExpContext)_localctx)._exp =  builder.recordSelectExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)));
						}
						break;

					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(613);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(614); match(31);
						setState(615); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(616); match(59);
						((ExpContext)_localctx)._exp =  builder.arraySelect((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(623);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 44, RULE_decllabelsandvariants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624); ((DecllabelsandvariantsContext)_localctx).ident_0 = ident();
			setState(625); match(6);
			setState(626); ((DecllabelsandvariantsContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
			setState(627); match(30);
			setState(628); ((DecllabelsandvariantsContext)_localctx).type_2 = type(0);
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
		enterRule(_localctx, 46, RULE_anddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631); match(60);
			setState(632); ((AnddeclContext)_localctx).declmono_0 = declmono();
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
		enterRule(_localctx, 48, RULE_varianttype);
		try {
			setState(642);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(635); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(636); match(30);
				setState(637); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(640); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 50, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(644); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(647); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 48) | (1L << CHARTOKEN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INTTOKEN - 65)) | (1L << (NULLTOKEN - 65)) | (1L << (STRINGTOKEN - 65)) | (1L << (EMPTYLISTTOKEN - 65)) | (1L << (FLOATTOKEN - 65)) | (1L << (WILDCARDTOKEN - 65)) | (1L << (BOOLTOKEN - 65)) | (1L << (IDTOKEN - 65)) | (1L << (CONSTRTOKEN - 65)))) != 0) );
			setState(649); match(44);
			setState(650); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 52, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653); ((ProgContext)_localctx).declimpl_0 = declimpl();
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
		enterRule(_localctx, 54, RULE_exparray);
		try {
			setState(666);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(656); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(657); match(34);
				setState(658); ((ExparrayContext)_localctx).exparray_1 = exparray();
				((ExparrayContext)_localctx)._exparray =  builder.innerExpArrayMulti((((ExparrayContext)_localctx).exp_0._exp),(((ExparrayContext)_localctx).exparray_1._exparray));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(661); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(662); match(34);
				setState(663); ((ExparrayContext)_localctx).exp_1 = exp(0);
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
			setState(668); match(42);
			setState(669); ((TupletypelistContext)_localctx).type_0 = type(0);
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
			setState(696);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(672); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(673); match(6);
				setState(674); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(677); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(679); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(678); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(681); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 48) | (1L << CHARTOKEN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INTTOKEN - 65)) | (1L << (NULLTOKEN - 65)) | (1L << (STRINGTOKEN - 65)) | (1L << (EMPTYLISTTOKEN - 65)) | (1L << (FLOATTOKEN - 65)) | (1L << (WILDCARDTOKEN - 65)) | (1L << (BOOLTOKEN - 65)) | (1L << (IDTOKEN - 65)) | (1L << (CONSTRTOKEN - 65)))) != 0) );
				setState(683); match(6);
				setState(684); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentPattsExp((((RecdeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((RecdeclmonoContext)_localctx).patt_1_list),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(687); match(9);
				setState(688); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(689); match(47);
				setState(690); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(691); match(59);
				setState(692); match(6);
				setState(693); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
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
			setState(709);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				((RecdeclContext)_localctx)._recdecl =  builder.recDeclMono((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(703); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(702); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(705); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==60 );
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

		case 11: return type_sempred((TypeContext)_localctx, predIndex);

		case 18: return function_sempred((FunctionContext)_localctx, predIndex);

		case 21: return exp_sempred((ExpContext)_localctx, predIndex);
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
		case 4: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);

		case 3: return precpred(_ctx, 5);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3L\u02ca\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2M\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4q\n\4\f\4\16\4"+
		"t\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4}\n\4\f\4\16\4\u0080\13\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\6\4\u0089\n\4\r\4\16\4\u008a\3\4\3\4\5\4\u008f"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u009b\n\5\f\5\16\5\u009e"+
		"\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u00bc\n\5\r\5\16"+
		"\5\u00bd\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u00d0\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00dc\n\5"+
		"\f\5\16\5\u00df\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00ea\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00fa\n\t"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0113\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6"+
		"\r\u011c\n\r\r\r\16\r\u011d\3\r\3\r\7\r\u0122\n\r\f\r\16\r\u0125\13\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u012f\n\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u013c\n\17\3\20\3\20\6\20"+
		"\u0140\n\20\r\20\16\20\u0141\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\5\20\u014d\n\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0161\n\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u017d\n\24\3\24\3\24"+
		"\3\24\3\24\7\24\u0183\n\24\f\24\16\24\u0186\13\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u01d2\n\27\f\27\16\27\u01d5\13\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u01de\n\27\f\27\16\27\u01e1\13\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u01e9\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01f1\n\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01fa\n\27\f\27\16\27\u01fd\13"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u022b\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u026e\n\27\f\27\16\27\u0271\13\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u0285\n\32\3\33\6\33\u0288\n\33\r\33\16\33\u0289\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u029d\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\6\37"+
		"\u02aa\n\37\r\37\16\37\u02ab\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\5\37\u02bb\n\37\3 \3 \3 \3 \3 \6 \u02c2\n \r "+
		"\16 \u02c3\3 \3 \5 \u02c8\n \3 \2\6\b\30&,!\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2\7\6\2\25\25\36\36##,,\6\2\35\35"+
		"\66\6688@@\6\2\b\b\21\22\'\'\65\65\4\2\6\6))\4\2\"\"\67\67\u030c\2L\3"+
		"\2\2\2\4_\3\2\2\2\6\u008e\3\2\2\2\b\u00cf\3\2\2\2\n\u00e0\3\2\2\2\f\u00e9"+
		"\3\2\2\2\16\u00eb\3\2\2\2\20\u00f9\3\2\2\2\22\u00fb\3\2\2\2\24\u00ff\3"+
		"\2\2\2\26\u0102\3\2\2\2\30\u0112\3\2\2\2\32\u012e\3\2\2\2\34\u013b\3\2"+
		"\2\2\36\u014c\3\2\2\2 \u014e\3\2\2\2\"\u0153\3\2\2\2$\u0160\3\2\2\2&\u017c"+
		"\3\2\2\2(\u0187\3\2\2\2*\u018b\3\2\2\2,\u022a\3\2\2\2.\u0272\3\2\2\2\60"+
		"\u0279\3\2\2\2\62\u0284\3\2\2\2\64\u0287\3\2\2\2\66\u028f\3\2\2\28\u029c"+
		"\3\2\2\2:\u029e\3\2\2\2<\u02ba\3\2\2\2>\u02c7\3\2\2\2@A\7\63\2\2AB\5\2"+
		"\2\2BC\b\2\1\2CM\3\2\2\2DE\5\26\f\2EF\7\63\2\2FG\5\2\2\2GH\b\2\1\2HM\3"+
		"\2\2\2IJ\5\26\f\2JK\b\2\1\2KM\3\2\2\2L@\3\2\2\2LD\3\2\2\2LI\3\2\2\2M\3"+
		"\3\2\2\2NO\7H\2\2O`\b\3\1\2PQ\7C\2\2Q`\b\3\1\2RS\7J\2\2S`\b\3\1\2TU\7"+
		"L\2\2U`\b\3\1\2VW\7A\2\2W`\b\3\1\2XY\7E\2\2Y`\b\3\1\2Z[\7D\2\2[`\b\3\1"+
		"\2\\]\5\24\13\2]^\b\3\1\2^`\3\2\2\2_N\3\2\2\2_P\3\2\2\2_R\3\2\2\2_T\3"+
		"\2\2\2_V\3\2\2\2_X\3\2\2\2_Z\3\2\2\2_\\\3\2\2\2`\5\3\2\2\2ab\5\36\20\2"+
		"bc\b\4\1\2c\u008f\3\2\2\2de\7\30\2\2ef\7\f\2\2fg\5> \2gh\b\4\1\2h\u008f"+
		"\3\2\2\2ij\7\26\2\2jk\7K\2\2kl\7\b\2\2lm\7L\2\2mn\7 \2\2nr\5\30\r\2oq"+
		"\5\16\b\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2"+
		"uv\b\4\1\2v\u008f\3\2\2\2wx\7\26\2\2xy\7K\2\2yz\7\b\2\2z~\7L\2\2{}\5\22"+
		"\n\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2"+
		"\u0080~\3\2\2\2\u0081\u008f\b\4\1\2\u0082\u0083\7\30\2\2\u0083\u0084\5"+
		"\6\4\2\u0084\u0085\b\4\1\2\u0085\u008f\3\2\2\2\u0086\u0088\5\36\20\2\u0087"+
		"\u0089\5\60\31\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\b\4\1\2\u008d"+
		"\u008f\3\2\2\2\u008ea\3\2\2\2\u008ed\3\2\2\2\u008ei\3\2\2\2\u008ew\3\2"+
		"\2\2\u008e\u0082\3\2\2\2\u008e\u0086\3\2\2\2\u008f\7\3\2\2\2\u0090\u0091"+
		"\b\5\1\2\u0091\u0092\7L\2\2\u0092\u0093\5\b\5\b\u0093\u0094\b\5\1\2\u0094"+
		"\u00d0\3\2\2\2\u0095\u0096\7\5\2\2\u0096\u0097\7K\2\2\u0097\u0098\7\b"+
		"\2\2\u0098\u009c\5\b\5\2\u0099\u009b\5*\26\2\u009a\u0099\3\2\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7%\2\2\u00a0\u00a1\b\5\1\2\u00a1"+
		"\u00d0\3\2\2\2\u00a2\u00a3\5\n\6\2\u00a3\u00a4\b\5\1\2\u00a4\u00d0\3\2"+
		"\2\2\u00a5\u00a6\7I\2\2\u00a6\u00d0\b\5\1\2\u00a7\u00a8\7\13\2\2\u00a8"+
		"\u00a9\5\b\5\2\u00a9\u00aa\7=\2\2\u00aa\u00ab\b\5\1\2\u00ab\u00d0\3\2"+
		"\2\2\u00ac\u00ad\7\13\2\2\u00ad\u00ae\5\b\5\2\u00ae\u00af\7\61\2\2\u00af"+
		"\u00b0\5\30\r\2\u00b0\u00b1\7=\2\2\u00b1\u00b2\b\5\1\2\u00b2\u00d0\3\2"+
		"\2\2\u00b3\u00b4\5\4\3\2\u00b4\u00b5\b\5\1\2\u00b5\u00d0\3\2\2\2\u00b6"+
		"\u00b7\7L\2\2\u00b7\u00d0\b\5\1\2\u00b8\u00b9\7\13\2\2\u00b9\u00bb\5\b"+
		"\5\2\u00ba\u00bc\5\"\22\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\7="+
		"\2\2\u00c0\u00c1\b\5\1\2\u00c1\u00d0\3\2\2\2\u00c2\u00c3\5\24\13\2\u00c3"+
		"\u00c4\b\5\1\2\u00c4\u00d0\3\2\2\2\u00c5\u00c6\7\62\2\2\u00c6\u00c7\5"+
		"\20\t\2\u00c7\u00c8\7\24\2\2\u00c8\u00c9\b\5\1\2\u00c9\u00d0\3\2\2\2\u00ca"+
		"\u00cb\7\62\2\2\u00cb\u00cc\5\32\16\2\u00cc\u00cd\7\24\2\2\u00cd\u00ce"+
		"\b\5\1\2\u00ce\u00d0\3\2\2\2\u00cf\u0090\3\2\2\2\u00cf\u0095\3\2\2\2\u00cf"+
		"\u00a2\3\2\2\2\u00cf\u00a5\3\2\2\2\u00cf\u00a7\3\2\2\2\u00cf\u00ac\3\2"+
		"\2\2\u00cf\u00b3\3\2\2\2\u00cf\u00b6\3\2\2\2\u00cf\u00b8\3\2\2\2\u00cf"+
		"\u00c2\3\2\2\2\u00cf\u00c5\3\2\2\2\u00cf\u00ca\3\2\2\2\u00d0\u00dd\3\2"+
		"\2\2\u00d1\u00d2\f\n\2\2\u00d2\u00d3\7\63\2\2\u00d3\u00d4\5\b\5\13\u00d4"+
		"\u00d5\b\5\1\2\u00d5\u00dc\3\2\2\2\u00d6\u00d7\f\r\2\2\u00d7\u00d8\7\37"+
		"\2\2\u00d8\u00d9\5\n\6\2\u00d9\u00da\b\5\1\2\u00da\u00dc\3\2\2\2\u00db"+
		"\u00d1\3\2\2\2\u00db\u00d6\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\t\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e1"+
		"\7K\2\2\u00e1\u00e2\b\6\1\2\u00e2\13\3\2\2\2\u00e3\u00e4\5,\27\2\u00e4"+
		"\u00e5\b\7\1\2\u00e5\u00ea\3\2\2\2\u00e6\u00e7\5\6\4\2\u00e7\u00e8\b\7"+
		"\1\2\u00e8\u00ea\3\2\2\2\u00e9\u00e3\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea"+
		"\r\3\2\2\2\u00eb\u00ec\7\63\2\2\u00ec\u00ed\7L\2\2\u00ed\u00ee\7 \2\2"+
		"\u00ee\u00ef\5\30\r\2\u00ef\u00f0\b\b\1\2\u00f0\17\3\2\2\2\u00f1\u00f2"+
		"\5\b\5\2\u00f2\u00f3\7\r\2\2\u00f3\u00f4\5\20\t\2\u00f4\u00f5\b\t\1\2"+
		"\u00f5\u00fa\3\2\2\2\u00f6\u00f7\5\b\5\2\u00f7\u00f8\b\t\1\2\u00f8\u00fa"+
		"\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa\21\3\2\2\2\u00fb"+
		"\u00fc\7\63\2\2\u00fc\u00fd\7L\2\2\u00fd\u00fe\b\n\1\2\u00fe\23\3\2\2"+
		"\2\u00ff\u0100\7F\2\2\u0100\u0101\b\13\1\2\u0101\25\3\2\2\2\u0102\u0103"+
		"\5\b\5\2\u0103\u0104\7.\2\2\u0104\u0105\5,\27\2\u0105\u0106\b\f\1\2\u0106"+
		"\27\3\2\2\2\u0107\u0108\b\r\1\2\u0108\u0109\7\13\2\2\u0109\u010a\5\30"+
		"\r\2\u010a\u010b\7=\2\2\u010b\u010c\b\r\1\2\u010c\u0113\3\2\2\2\u010d"+
		"\u010e\7K\2\2\u010e\u0113\b\r\1\2\u010f\u0110\7+\2\2\u0110\u0111\7K\2"+
		"\2\u0111\u0113\b\r\1\2\u0112\u0107\3\2\2\2\u0112\u010d\3\2\2\2\u0112\u010f"+
		"\3\2\2\2\u0113\u0123\3\2\2\2\u0114\u0115\f\4\2\2\u0115\u0116\7.\2\2\u0116"+
		"\u0117\5\30\r\5\u0117\u0118\b\r\1\2\u0118\u0122\3\2\2\2\u0119\u011b\f"+
		"\7\2\2\u011a\u011c\5:\36\2\u011b\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\b\r"+
		"\1\2\u0120\u0122\3\2\2\2\u0121\u0114\3\2\2\2\u0121\u0119\3\2\2\2\u0122"+
		"\u0125\3\2\2\2\u0123\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\31\3\2\2"+
		"\2\u0125\u0123\3\2\2\2\u0126\u0127\5\b\5\2\u0127\u0128\7\7\2\2\u0128\u0129"+
		"\5\32\16\2\u0129\u012a\b\16\1\2\u012a\u012f\3\2\2\2\u012b\u012c\5\b\5"+
		"\2\u012c\u012d\b\16\1\2\u012d\u012f\3\2\2\2\u012e\u0126\3\2\2\2\u012e"+
		"\u012b\3\2\2\2\u012f\33\3\2\2\2\u0130\u0131\7\60\2\2\u0131\u0132\7K\2"+
		"\2\u0132\u0133\7\b\2\2\u0133\u0134\5,\27\2\u0134\u0135\b\17\1\2\u0135"+
		"\u013c\3\2\2\2\u0136\u0137\7K\2\2\u0137\u0138\7\b\2\2\u0138\u0139\5,\27"+
		"\2\u0139\u013a\b\17\1\2\u013a\u013c\3\2\2\2\u013b\u0130\3\2\2\2\u013b"+
		"\u0136\3\2\2\2\u013c\35\3\2\2\2\u013d\u013f\5\n\6\2\u013e\u0140\5\b\5"+
		"\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\7\b\2\2\u0144\u0145\5,\27\2\u0145"+
		"\u0146\b\20\1\2\u0146\u014d\3\2\2\2\u0147\u0148\5\b\5\2\u0148\u0149\7"+
		"\b\2\2\u0149\u014a\5,\27\2\u014a\u014b\b\20\1\2\u014b\u014d\3\2\2\2\u014c"+
		"\u013d\3\2\2\2\u014c\u0147\3\2\2\2\u014d\37\3\2\2\2\u014e\u014f\5\6\4"+
		"\2\u014f\u0150\7;\2\2\u0150\u0151\5,\27\2\u0151\u0152\b\21\1\2\u0152!"+
		"\3\2\2\2\u0153\u0154\7\r\2\2\u0154\u0155\5\b\5\2\u0155\u0156\b\22\1\2"+
		"\u0156#\3\2\2\2\u0157\u0158\5\f\7\2\u0158\u0159\7\23\2\2\u0159\u015a\5"+
		"$\23\2\u015a\u015b\b\23\1\2\u015b\u0161\3\2\2\2\u015c\u015d\5\f\7\2\u015d"+
		"\u015e\7\23\2\2\u015e\u015f\b\23\1\2\u015f\u0161\3\2\2\2\u0160\u0157\3"+
		"\2\2\2\u0160\u015c\3\2\2\2\u0161%\3\2\2\2\u0162\u0163\b\24\1\2\u0163\u0164"+
		"\7\32\2\2\u0164\u0165\5\2\2\2\u0165\u0166\b\24\1\2\u0166\u017d\3\2\2\2"+
		"\u0167\u0168\7\13\2\2\u0168\u0169\5&\24\2\u0169\u016a\7=\2\2\u016a\u016b"+
		"\b\24\1\2\u016b\u017d\3\2\2\2\u016c\u016d\5\n\6\2\u016d\u016e\b\24\1\2"+
		"\u016e\u017d\3\2\2\2\u016f\u0170\7:\2\2\u0170\u0171\5&\24\2\u0171\u0172"+
		"\7<\2\2\u0172\u0173\b\24\1\2\u0173\u017d\3\2\2\2\u0174\u0175\7\3\2\2\u0175"+
		"\u0176\5\26\f\2\u0176\u0177\b\24\1\2\u0177\u017d\3\2\2\2\u0178\u0179\7"+
		"\3\2\2\u0179\u017a\5\64\33\2\u017a\u017b\b\24\1\2\u017b\u017d\3\2\2\2"+
		"\u017c\u0162\3\2\2\2\u017c\u0167\3\2\2\2\u017c\u016c\3\2\2\2\u017c\u016f"+
		"\3\2\2\2\u017c\u0174\3\2\2\2\u017c\u0178\3\2\2\2\u017d\u0184\3\2\2\2\u017e"+
		"\u017f\f\5\2\2\u017f\u0180\5,\27\2\u0180\u0181\b\24\1\2\u0181\u0183\3"+
		"\2\2\2\u0182\u017e\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\'\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0188\7>\2\2"+
		"\u0188\u0189\5<\37\2\u0189\u018a\b\25\1\2\u018a)\3\2\2\2\u018b\u018c\7"+
		"\r\2\2\u018c\u018d\7K\2\2\u018d\u018e\7\b\2\2\u018e\u018f\5\b\5\2\u018f"+
		"\u0190\b\26\1\2\u0190+\3\2\2\2\u0191\u0192\b\27\1\2\u0192\u0193\7*\2\2"+
		"\u0193\u0194\5,\27&\u0194\u0195\b\27\1\2\u0195\u022b\3\2\2\2\u0196\u0197"+
		"\7L\2\2\u0197\u0198\5,\27\36\u0198\u0199\b\27\1\2\u0199\u022b\3\2\2\2"+
		"\u019a\u019b\7?\2\2\u019b\u019c\5,\27\30\u019c\u019d\b\27\1\2\u019d\u022b"+
		"\3\2\2\2\u019e\u019f\78\2\2\u019f\u01a0\5,\27\27\u01a0\u01a1\b\27\1\2"+
		"\u01a1\u022b\3\2\2\2\u01a2\u01a3\7@\2\2\u01a3\u01a4\5,\27\26\u01a4\u01a5"+
		"\b\27\1\2\u01a5\u022b\3\2\2\2\u01a6\u01a7\7&\2\2\u01a7\u01a8\5,\27\2\u01a8"+
		"\u01a9\7\34\2\2\u01a9\u01aa\5,\27\2\u01aa\u01ab\79\2\2\u01ab\u01ac\5,"+
		"\27\13\u01ac\u01ad\b\27\1\2\u01ad\u022b\3\2\2\2\u01ae\u01af\7&\2\2\u01af"+
		"\u01b0\5,\27\2\u01b0\u01b1\7\34\2\2\u01b1\u01b2\5,\27\n\u01b2\u01b3\b"+
		"\27\1\2\u01b3\u022b\3\2\2\2\u01b4\u01b5\7G\2\2\u01b5\u022b\b\27\1\2\u01b6"+
		"\u01b7\5\n\6\2\u01b7\u01b8\b\27\1\2\u01b8\u022b\3\2\2\2\u01b9\u01ba\5"+
		"\4\3\2\u01ba\u01bb\b\27\1\2\u01bb\u022b\3\2\2\2\u01bc\u01bd\7\13\2\2\u01bd"+
		"\u01be\5,\27\2\u01be\u01bf\7=\2\2\u01bf\u01c0\b\27\1\2\u01c0\u022b\3\2"+
		"\2\2\u01c1\u01c2\7:\2\2\u01c2\u01c3\5,\27\2\u01c3\u01c4\7<\2\2\u01c4\u01c5"+
		"\b\27\1\2\u01c5\u022b\3\2\2\2\u01c6\u01c7\7\13\2\2\u01c7\u01c8\5,\27\2"+
		"\u01c8\u01c9\7\61\2\2\u01c9\u01ca\5\30\r\2\u01ca\u01cb\7=\2\2\u01cb\u01cc"+
		"\b\27\1\2\u01cc\u022b\3\2\2\2\u01cd\u01ce\7\13\2\2\u01ce\u01d3\5,\27\2"+
		"\u01cf\u01d0\7\r\2\2\u01d0\u01d2\5,\27\2\u01d1\u01cf\3\2\2\2\u01d2\u01d5"+
		"\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2\2\2\u01d5"+
		"\u01d3\3\2\2\2\u01d6\u01d7\7=\2\2\u01d7\u01d8\b\27\1\2\u01d8\u022b\3\2"+
		"\2\2\u01d9\u01da\7\62\2\2\u01da\u01df\5,\27\2\u01db\u01dc\7\r\2\2\u01dc"+
		"\u01de\5,\27\2\u01dd\u01db\3\2\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2"+
		"\2\2\u01df\u01e0\3\2\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01df\3\2\2\2\u01e2"+
		"\u01e3\7\24\2\2\u01e3\u01e4\b\27\1\2\u01e4\u022b\3\2\2\2\u01e5\u01e6\7"+
		"(\2\2\u01e6\u01e8\58\35\2\u01e7\u01e9\7$\2\2\u01e8\u01e7\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\7\27\2\2\u01eb\u01ec\b"+
		"\27\1\2\u01ec\u022b\3\2\2\2\u01ed\u01ee\7(\2\2\u01ee\u01f0\5,\27\2\u01ef"+
		"\u01f1\7$\2\2\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2"+
		"\2\2\u01f2\u01f3\7\27\2\2\u01f3\u01f4\b\27\1\2\u01f4\u022b\3\2\2\2\u01f5"+
		"\u01f6\7\5\2\2\u01f6\u01fb\5\34\17\2\u01f7\u01f8\7\r\2\2\u01f8\u01fa\5"+
		"\34\17\2\u01f9\u01f7\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fe\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u01ff\7%"+
		"\2\2\u01ff\u0200\b\27\1\2\u0200\u022b\3\2\2\2\u0201\u0202\7\4\2\2\u0202"+
		"\u0203\5,\27\2\u0203\u0204\7\n\2\2\u0204\u0205\5,\27\2\u0205\u0206\7\17"+
		"\2\2\u0206\u0207\b\27\1\2\u0207\u022b\3\2\2\2\u0208\u0209\7\t\2\2\u0209"+
		"\u020a\5\n\6\2\u020a\u020b\7\b\2\2\u020b\u020c\5,\27\2\u020c\u020d\7\33"+
		"\2\2\u020d\u020e\5,\27\2\u020e\u020f\7\n\2\2\u020f\u0210\5,\27\2\u0210"+
		"\u0211\7\17\2\2\u0211\u0212\b\27\1\2\u0212\u022b\3\2\2\2\u0213\u0214\7"+
		"\t\2\2\u0214\u0215\5\n\6\2\u0215\u0216\7\b\2\2\u0216\u0217\5,\27\2\u0217"+
		"\u0218\7/\2\2\u0218\u0219\5,\27\2\u0219\u021a\7\n\2\2\u021a\u021b\5,\27"+
		"\2\u021b\u021c\7\17\2\2\u021c\u021d\b\27\1\2\u021d\u022b\3\2\2\2\u021e"+
		"\u021f\7\31\2\2\u021f\u0220\5,\27\2\u0220\u0221\7\64\2\2\u0221\u0222\5"+
		"\2\2\2\u0222\u0223\b\27\1\2\u0223\u022b\3\2\2\2\u0224\u0225\5&\24\2\u0225"+
		"\u0226\b\27\1\2\u0226\u022b\3\2\2\2\u0227\u0228\5 \21\2\u0228\u0229\b"+
		"\27\1\2\u0229\u022b\3\2\2\2\u022a\u0191\3\2\2\2\u022a\u0196\3\2\2\2\u022a"+
		"\u019a\3\2\2\2\u022a\u019e\3\2\2\2\u022a\u01a2\3\2\2\2\u022a\u01a6\3\2"+
		"\2\2\u022a\u01ae\3\2\2\2\u022a\u01b4\3\2\2\2\u022a\u01b6\3\2\2\2\u022a"+
		"\u01b9\3\2\2\2\u022a\u01bc\3\2\2\2\u022a\u01c1\3\2\2\2\u022a\u01c6\3\2"+
		"\2\2\u022a\u01cd\3\2\2\2\u022a\u01d9\3\2\2\2\u022a\u01e5\3\2\2\2\u022a"+
		"\u01ed\3\2\2\2\u022a\u01f5\3\2\2\2\u022a\u0201\3\2\2\2\u022a\u0208\3\2"+
		"\2\2\u022a\u0213\3\2\2\2\u022a\u021e\3\2\2\2\u022a\u0224\3\2\2\2\u022a"+
		"\u0227\3\2\2\2\u022b\u026f\3\2\2\2\u022c\u022d\f\35\2\2\u022d\u022e\7"+
		"\7\2\2\u022e\u022f\5,\27\35\u022f\u0230\b\27\1\2\u0230\u026e\3\2\2\2\u0231"+
		"\u0232\f\25\2\2\u0232\u0233\7\20\2\2\u0233\u0234\5,\27\26\u0234\u0235"+
		"\b\27\1\2\u0235\u026e\3\2\2\2\u0236\u0237\f\24\2\2\u0237\u0238\t\2\2\2"+
		"\u0238\u0239\5,\27\25\u0239\u023a\b\27\1\2\u023a\u026e\3\2\2\2\u023b\u023c"+
		"\f\23\2\2\u023c\u023d\t\3\2\2\u023d\u023e\5,\27\24\u023e\u023f\b\27\1"+
		"\2\u023f\u026e\3\2\2\2\u0240\u0241\f\22\2\2\u0241\u0242\t\4\2\2\u0242"+
		"\u0243\5,\27\23\u0243\u0244\b\27\1\2\u0244\u026e\3\2\2\2\u0245\u0246\f"+
		"\20\2\2\u0246\u0247\7-\2\2\u0247\u0248\7K\2\2\u0248\u0249\7\16\2\2\u0249"+
		"\u024a\5,\27\21\u024a\u024b\b\27\1\2\u024b\u026e\3\2\2\2\u024c\u024d\f"+
		"\16\2\2\u024d\u024e\7!\2\2\u024e\u024f\5,\27\2\u024f\u0250\7=\2\2\u0250"+
		"\u0251\7\16\2\2\u0251\u0252\5,\27\17\u0252\u0253\b\27\1\2\u0253\u026e"+
		"\3\2\2\2\u0254\u0255\f\r\2\2\u0255\u0256\t\5\2\2\u0256\u0257\5,\27\16"+
		"\u0257\u0258\b\27\1\2\u0258\u026e\3\2\2\2\u0259\u025a\f\f\2\2\u025a\u025b"+
		"\t\6\2\2\u025b\u025c\5,\27\r\u025c\u025d\b\27\1\2\u025d\u026e\3\2\2\2"+
		"\u025e\u025f\f\6\2\2\u025f\u0260\7$\2\2\u0260\u0261\5,\27\6\u0261\u0262"+
		"\b\27\1\2\u0262\u026e\3\2\2\2\u0263\u0264\f\21\2\2\u0264\u0265\7-\2\2"+
		"\u0265\u0266\7K\2\2\u0266\u026e\b\27\1\2\u0267\u0268\f\17\2\2\u0268\u0269"+
		"\7!\2\2\u0269\u026a\5,\27\2\u026a\u026b\7=\2\2\u026b\u026c\b\27\1\2\u026c"+
		"\u026e\3\2\2\2\u026d\u022c\3\2\2\2\u026d\u0231\3\2\2\2\u026d\u0236\3\2"+
		"\2\2\u026d\u023b\3\2\2\2\u026d\u0240\3\2\2\2\u026d\u0245\3\2\2\2\u026d"+
		"\u024c\3\2\2\2\u026d\u0254\3\2\2\2\u026d\u0259\3\2\2\2\u026d\u025e\3\2"+
		"\2\2\u026d\u0263\3\2\2\2\u026d\u0267\3\2\2\2\u026e\u0271\3\2\2\2\u026f"+
		"\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270-\3\2\2\2\u0271\u026f\3\2\2\2"+
		"\u0272\u0273\5\n\6\2\u0273\u0274\7\b\2\2\u0274\u0275\7K\2\2\u0275\u0276"+
		"\7 \2\2\u0276\u0277\5\30\r\2\u0277\u0278\b\30\1\2\u0278/\3\2\2\2\u0279"+
		"\u027a\7>\2\2\u027a\u027b\5\36\20\2\u027b\u027c\b\31\1\2\u027c\61\3\2"+
		"\2\2\u027d\u027e\7L\2\2\u027e\u027f\7 \2\2\u027f\u0280\5\30\r\2\u0280"+
		"\u0281\b\32\1\2\u0281\u0285\3\2\2\2\u0282\u0283\7L\2\2\u0283\u0285\b\32"+
		"\1\2\u0284\u027d\3\2\2\2\u0284\u0282\3\2\2\2\u0285\63\3\2\2\2\u0286\u0288"+
		"\5\b\5\2\u0287\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u0287\3\2\2\2\u0289"+
		"\u028a\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\7.\2\2\u028c\u028d\5,\27"+
		"\2\u028d\u028e\b\33\1\2\u028e\65\3\2\2\2\u028f\u0290\5$\23\2\u0290\u0291"+
		"\b\34\1\2\u0291\67\3\2\2\2\u0292\u0293\5,\27\2\u0293\u0294\7$\2\2\u0294"+
		"\u0295\58\35\2\u0295\u0296\b\35\1\2\u0296\u029d\3\2\2\2\u0297\u0298\5"+
		",\27\2\u0298\u0299\7$\2\2\u0299\u029a\5,\27\2\u029a\u029b\b\35\1\2\u029b"+
		"\u029d\3\2\2\2\u029c\u0292\3\2\2\2\u029c\u0297\3\2\2\2\u029d9\3\2\2\2"+
		"\u029e\u029f\7,\2\2\u029f\u02a0\5\30\r\2\u02a0\u02a1\b\36\1\2\u02a1;\3"+
		"\2\2\2\u02a2\u02a3\5\n\6\2\u02a3\u02a4\7\b\2\2\u02a4\u02a5\5,\27\2\u02a5"+
		"\u02a6\b\37\1\2\u02a6\u02bb\3\2\2\2\u02a7\u02a9\5\n\6\2\u02a8\u02aa\5"+
		"\b\5\2\u02a9\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\u02ae\7\b\2\2\u02ae\u02af\5,"+
		"\27\2\u02af\u02b0\b\37\1\2\u02b0\u02bb\3\2\2\2\u02b1\u02b2\7\13\2\2\u02b2"+
		"\u02b3\5\n\6\2\u02b3\u02b4\7\61\2\2\u02b4\u02b5\5\30\r\2\u02b5\u02b6\7"+
		"=\2\2\u02b6\u02b7\7\b\2\2\u02b7\u02b8\5,\27\2\u02b8\u02b9\b\37\1\2\u02b9"+
		"\u02bb\3\2\2\2\u02ba\u02a2\3\2\2\2\u02ba\u02a7\3\2\2\2\u02ba\u02b1\3\2"+
		"\2\2\u02bb=\3\2\2\2\u02bc\u02bd\5<\37\2\u02bd\u02be\b \1\2\u02be\u02c8"+
		"\3\2\2\2\u02bf\u02c1\5<\37\2\u02c0\u02c2\5(\25\2\u02c1\u02c0\3\2\2\2\u02c2"+
		"\u02c3\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\3\2"+
		"\2\2\u02c5\u02c6\b \1\2\u02c6\u02c8\3\2\2\2\u02c7\u02bc\3\2\2\2\u02c7"+
		"\u02bf\3\2\2\2\u02c8?\3\2\2\2)L_r~\u008a\u008e\u009c\u00bd\u00cf\u00db"+
		"\u00dd\u00e9\u00f9\u0112\u011d\u0121\u0123\u012e\u013b\u0141\u014c\u0160"+
		"\u017c\u0184\u01d3\u01df\u01e8\u01f0\u01fb\u022a\u026d\u026f\u0284\u0289"+
		"\u029c\u02ab\u02ba\u02c3\u02c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}