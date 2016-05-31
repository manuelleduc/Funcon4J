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
		T__62=1, T__61=2, T__60=3, T__59=4, T__58=5, T__57=6, T__56=7, T__55=8, 
		T__54=9, T__53=10, T__52=11, T__51=12, T__50=13, T__49=14, T__48=15, T__47=16, 
		T__46=17, T__45=18, T__44=19, T__43=20, T__42=21, T__41=22, T__40=23, 
		T__39=24, T__38=25, T__37=26, T__36=27, T__35=28, T__34=29, T__33=30, 
		T__32=31, T__31=32, T__30=33, T__29=34, T__28=35, T__27=36, T__26=37, 
		T__25=38, T__24=39, T__23=40, T__22=41, T__21=42, T__20=43, T__19=44, 
		T__18=45, T__17=46, T__16=47, T__15=48, T__14=49, T__13=50, T__12=51, 
		T__11=52, T__10=53, T__9=54, T__8=55, T__7=56, T__6=57, T__5=58, T__4=59, 
		T__3=60, T__2=61, T__1=62, T__0=63, CHARTOKEN=64, WS=65, INTTOKEN=66, 
		NULLTOKEN=67, EMPTYARRAYTOKEN=68, STRINGTOKEN=69, EMPTYLISTTOKEN=70, FLOATTOKEN=71, 
		WILDCARDTOKEN=72, BOOLTOKEN=73, IDTOKEN=74, CONSTRTOKEN=75;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'while'", "'{'", "'&&'", "'::'", "'='", "'for'", 
		"'do'", "'('", "'rec'", "','", "'<-'", "'done'", "'mod'", "'>='", "'<'", 
		"';;'", "']'", "'*.'", "'type'", "'|]'", "'let'", "'match'", "'function'", 
		"'downto'", "'then'", "'+'", "'/'", "'as'", "'of'", "'.('", "'||'", "'/.'", 
		"';'", "'}'", "'if'", "'<='", "'[|'", "'&'", "'print'", "'''", "'*'", 
		"'.'", "'->'", "'to'", "'mutable'", "':'", "'['", "'=='", "'|'", "'with'", 
		"'>'", "'+.'", "'or'", "'-.'", "'else'", "'begin'", "'in'", "'end'", "')'", 
		"'and'", "'not'", "'-'", "CHARTOKEN", "WS", "INTTOKEN", "NULLTOKEN", "EMPTYARRAYTOKEN", 
		"STRINGTOKEN", "EMPTYLISTTOKEN", "FLOATTOKEN", "'_'", "BOOLTOKEN", "IDTOKEN", 
		"CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decllabeltype = 2, RULE_vartype = 3, 
		RULE_decl = 4, RULE_patt = 5, RULE_ident = 6, RULE_declorexp = 7, RULE_declconstrtypeappendix = 8, 
		RULE_pattlist = 9, RULE_declenumtypeappendix = 10, RULE_emptylist = 11, 
		RULE_pattmatchsingle = 12, RULE_type = 13, RULE_decllabelsandvariantsappendix = 14, 
		RULE_headtaillistpatt = 15, RULE_recordsingle = 16, RULE_declmono = 17, 
		RULE_letExp = 18, RULE_decloptionalvartypes = 19, RULE_patttuple = 20, 
		RULE_declimpl = 21, RULE_function = 22, RULE_recanddecl = 23, RULE_recordpattappendix = 24, 
		RULE_exp = 25, RULE_decllabelsandvariants = 26, RULE_anddecl = 27, RULE_varianttype = 28, 
		RULE_pattmatchcurried = 29, RULE_prog = 30, RULE_exparray = 31, RULE_tupletypelist = 32, 
		RULE_recdeclmono = 33, RULE_recdecl = 34;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decllabeltype", "vartype", "decl", "patt", "ident", 
		"declorexp", "declconstrtypeappendix", "pattlist", "declenumtypeappendix", 
		"emptylist", "pattmatchsingle", "type", "decllabelsandvariantsappendix", 
		"headtaillistpatt", "recordsingle", "declmono", "letExp", "decloptionalvartypes", 
		"patttuple", "declimpl", "function", "recanddecl", "recordpattappendix", 
		"exp", "decllabelsandvariants", "anddecl", "varianttype", "pattmatchcurried", 
		"prog", "exparray", "tupletypelist", "recdeclmono", "recdecl"
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
			setState(82);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); match(50);
				setState(71); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				setState(75); match(50);
				setState(76); ((PattmatchContext)_localctx).pattmatch_1 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchMulti((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle),(((PattmatchContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
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
		public Token FLOATTOKEN_0;
		public Token CHARTOKEN_0;
		public Token NULLTOKEN_0;
		public Token CONSTRTOKEN_0;
		public Token STRINGTOKEN_0;
		public TerminalNode FLOATTOKEN() { return getToken(CLParser.FLOATTOKEN, 0); }
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public TerminalNode NULLTOKEN() { return getToken(CLParser.NULLTOKEN, 0); }
		public TerminalNode INTTOKEN() { return getToken(CLParser.INTTOKEN, 0); }
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public TerminalNode BOOLTOKEN() { return getToken(CLParser.BOOLTOKEN, 0); }
		public TerminalNode CHARTOKEN() { return getToken(CLParser.CHARTOKEN, 0); }
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
			setState(101);
			switch (_input.LA(1)) {
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
				}
				break;
			case INTTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); ((ConstantContext)_localctx).INTTOKEN_0 = match(INTTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(inttoken((((ConstantContext)_localctx).INTTOKEN_0!=null?((ConstantContext)_localctx).INTTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(89); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case FLOATTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(91); ((ConstantContext)_localctx).FLOATTOKEN_0 = match(FLOATTOKEN);
				((ConstantContext)_localctx)._constant =  builder.float_(floattoken((((ConstantContext)_localctx).FLOATTOKEN_0!=null?((ConstantContext)_localctx).FLOATTOKEN_0.getText():null)));
				}
				break;
			case CHARTOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(93); ((ConstantContext)_localctx).CHARTOKEN_0 = match(CHARTOKEN);
				((ConstantContext)_localctx)._constant =  builder.char_(chartoken((((ConstantContext)_localctx).CHARTOKEN_0!=null?((ConstantContext)_localctx).CHARTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(95); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case CONSTRTOKEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(97); ((ConstantContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((ConstantContext)_localctx)._constant =  builder.constr(constrtoken((((ConstantContext)_localctx).CONSTRTOKEN_0!=null?((ConstantContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;
			case STRINGTOKEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(99); ((ConstantContext)_localctx).STRINGTOKEN_0 = match(STRINGTOKEN);
				((ConstantContext)_localctx)._constant =  builder.string(stringtoken((((ConstantContext)_localctx).STRINGTOKEN_0!=null?((ConstantContext)_localctx).STRINGTOKEN_0.getText():null)));
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

	public static class DecllabeltypeContext extends ParserRuleContext {
		public Object _decllabeltype;
		public Token IDTOKEN_0;
		public TypeContext type_1;
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DecllabeltypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decllabeltype; }
	}

	public final DecllabeltypeContext decllabeltype() throws RecognitionException {
		DecllabeltypeContext _localctx = new DecllabeltypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decllabeltype);
		try {
			setState(114);
			switch (_input.LA(1)) {
			case 46:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); match(46);
				setState(104); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(105); match(47);
				setState(106); ((DecllabeltypeContext)_localctx).type_1 = type(0);
				((DecllabeltypeContext)_localctx)._decllabeltype =  builder.declMutableLabelType(idtoken((((DecllabeltypeContext)_localctx).IDTOKEN_0!=null?((DecllabeltypeContext)_localctx).IDTOKEN_0.getText():null)),(((DecllabeltypeContext)_localctx).type_1._type));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(110); match(47);
				setState(111); ((DecllabeltypeContext)_localctx).type_1 = type(0);
				((DecllabeltypeContext)_localctx)._decllabeltype =  builder.declLabelType(idtoken((((DecllabeltypeContext)_localctx).IDTOKEN_0!=null?((DecllabeltypeContext)_localctx).IDTOKEN_0.getText():null)),(((DecllabeltypeContext)_localctx).type_1._type));
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

	public static class VartypeContext extends ParserRuleContext {
		public Object _vartype;
		public Token IDTOKEN_0;
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public VartypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vartype; }
	}

	public final VartypeContext vartype() throws RecognitionException {
		VartypeContext _localctx = new VartypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_vartype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(41);
			setState(117); ((VartypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			((VartypeContext)_localctx)._vartype =  builder.varType(idtoken((((VartypeContext)_localctx).IDTOKEN_0!=null?((VartypeContext)_localctx).IDTOKEN_0.getText():null)));
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
		public DecloptionalvartypesContext decloptionalvartypes_0;
		public DecllabelsandvariantsappendixContext decllabelsandvariantsappendix;
		public List<DecllabelsandvariantsappendixContext> decllabelsandvariantsappendix_1_list = new ArrayList<DecllabelsandvariantsappendixContext>();
		public DeclContext decl_0;
		public AnddeclContext anddecl;
		public List<AnddeclContext> anddecl_1_list = new ArrayList<AnddeclContext>();
		public AnddeclContext anddecl(int i) {
			return getRuleContext(AnddeclContext.class,i);
		}
		public DecllabelsandvariantsappendixContext decllabelsandvariantsappendix(int i) {
			return getRuleContext(DecllabelsandvariantsappendixContext.class,i);
		}
		public DeclmonoContext declmono() {
			return getRuleContext(DeclmonoContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DecloptionalvartypesContext decloptionalvartypes() {
			return getRuleContext(DecloptionalvartypesContext.class,0);
		}
		public List<DecllabelsandvariantsappendixContext> decllabelsandvariantsappendix() {
			return getRuleContexts(DecllabelsandvariantsappendixContext.class);
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
		enterRule(_localctx, 8, RULE_decl);
		int _la;
		try {
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); match(22);
				setState(121); match(10);
				setState(122); ((DeclContext)_localctx).recdecl_0 = recdecl();
				((DeclContext)_localctx)._decl =  builder.declRec((((DeclContext)_localctx).recdecl_0._recdecl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128); match(20);
				setState(129); ((DeclContext)_localctx).decloptionalvartypes_0 = decloptionalvartypes();
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==61) {
					{
					{
					setState(130); ((DeclContext)_localctx).decllabelsandvariantsappendix = decllabelsandvariantsappendix();
					((DeclContext)_localctx).decllabelsandvariantsappendix_1_list.add(((DeclContext)_localctx).decllabelsandvariantsappendix);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declLabelsAndVariants((((DeclContext)_localctx).decloptionalvartypes_0._decloptionalvartypes),lift("_decllabelsandvariantsappendix", ((DeclContext)_localctx).decllabelsandvariantsappendix_1_list));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138); match(22);
				setState(139); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(144); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(143); ((DeclContext)_localctx).anddecl = anddecl();
					((DeclContext)_localctx).anddecl_1_list.add(((DeclContext)_localctx).anddecl);
					}
					}
					setState(146); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==61 );
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_patt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(153); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(154); ((PattContext)_localctx).patt_1 = patt(6);
				((PattContext)_localctx)._patt =  builder.pattConstrPatt(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt));
				}
				break;

			case 2:
				{
				setState(157); match(3);
				setState(158); ((PattContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(159); match(6);
				setState(160); ((PattContext)_localctx).patt_1 = patt(0);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(161); ((PattContext)_localctx).recordpattappendix = recordpattappendix();
					((PattContext)_localctx).recordpattappendix_2_list.add(((PattContext)_localctx).recordpattappendix);
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167); match(35);
				((PattContext)_localctx)._patt =  builder.recordPatt(idtoken((((PattContext)_localctx).IDTOKEN_0!=null?((PattContext)_localctx).IDTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt),lift("_recordpattappendix", ((PattContext)_localctx).recordpattappendix_2_list));
				}
				break;

			case 3:
				{
				setState(170); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(173); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 5:
				{
				setState(175); match(9);
				setState(176); ((PattContext)_localctx).patt_0 = patt(0);
				setState(177); match(60);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 6:
				{
				setState(180); match(9);
				setState(181); ((PattContext)_localctx).patt_0 = patt(0);
				setState(182); match(47);
				setState(183); ((PattContext)_localctx).type_1 = type(0);
				setState(184); match(60);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 7:
				{
				setState(187); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 8:
				{
				setState(190); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((PattContext)_localctx)._patt =  builder.pattConstr(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(192); match(9);
				setState(193); ((PattContext)_localctx).patt_0 = patt(0);
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(194); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(197); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==11 );
				setState(199); match(60);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 10:
				{
				setState(202); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 11:
				{
				setState(205); match(48);
				setState(206); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(207); match(18);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 12:
				{
				setState(210); match(48);
				setState(211); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(212); match(18);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(229);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(227);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(217);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(218); match(50);
						setState(219); ((PattContext)_localctx).patt_1 = patt(9);
						((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).patt_1._patt));
						}
						break;

					case 2:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(222);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(223); match(29);
						setState(224); ((PattContext)_localctx).ident_1 = ident();
						((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
						}
						break;
					}
					} 
				}
				setState(231);
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
		enterRule(_localctx, 12, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
		enterRule(_localctx, 14, RULE_declorexp);
		try {
			setState(241);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238); ((DeclorexpContext)_localctx).decl_0 = decl();
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
		enterRule(_localctx, 16, RULE_declconstrtypeappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243); match(50);
			setState(244); ((DeclconstrtypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
			setState(245); match(30);
			setState(246); ((DeclconstrtypeappendixContext)_localctx).type_1 = type(0);
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
		enterRule(_localctx, 18, RULE_pattlist);
		try {
			setState(257);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249); ((PattlistContext)_localctx).patt_0 = patt(0);
				((PattlistContext)_localctx)._pattlist =  builder.pattListSingle((((PattlistContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(253); match(11);
				setState(254); ((PattlistContext)_localctx).pattlist_1 = pattlist();
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
		enterRule(_localctx, 20, RULE_declenumtypeappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259); match(50);
			setState(260); ((DeclenumtypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 22, RULE_emptylist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
		enterRule(_localctx, 24, RULE_pattmatchsingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(267); match(44);
			setState(268); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		public VartypeContext vartype_0;
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
		public VartypeContext vartype() {
			return getRuleContext(VartypeContext.class,0);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			switch (_input.LA(1)) {
			case 41:
				{
				setState(272); ((TypeContext)_localctx).vartype_0 = vartype();
				((TypeContext)_localctx)._type =  builder.varTypeType((((TypeContext)_localctx).vartype_0._vartype));
				}
				break;
			case 9:
				{
				setState(275); match(9);
				setState(276); ((TypeContext)_localctx).type_0 = type(0);
				setState(277); match(60);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;
			case IDTOKEN:
				{
				setState(280); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(297);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(284);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(285); match(44);
						setState(286); ((TypeContext)_localctx).type_1 = type(4);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(289);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(291); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(290); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(293); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.tupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;
					}
					} 
				}
				setState(301);
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

	public static class DecllabelsandvariantsappendixContext extends ParserRuleContext {
		public Object _decllabelsandvariantsappendix;
		public DecloptionalvartypesContext decloptionalvartypes_0;
		public DecloptionalvartypesContext decloptionalvartypes() {
			return getRuleContext(DecloptionalvartypesContext.class,0);
		}
		public DecllabelsandvariantsappendixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decllabelsandvariantsappendix; }
	}

	public final DecllabelsandvariantsappendixContext decllabelsandvariantsappendix() throws RecognitionException {
		DecllabelsandvariantsappendixContext _localctx = new DecllabelsandvariantsappendixContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decllabelsandvariantsappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302); match(61);
			setState(303); ((DecllabelsandvariantsappendixContext)_localctx).decloptionalvartypes_0 = decloptionalvartypes();
			((DecllabelsandvariantsappendixContext)_localctx)._decllabelsandvariantsappendix =  builder.declLabelsAndVariantsAppendix((((DecllabelsandvariantsappendixContext)_localctx).decloptionalvartypes_0._decloptionalvartypes));
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
		enterRule(_localctx, 30, RULE_headtaillistpatt);
		try {
			setState(314);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(306); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(307); match(5);
				setState(308); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
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
		enterRule(_localctx, 32, RULE_recordsingle);
		try {
			setState(327);
			switch (_input.LA(1)) {
			case 46:
				enterOuterAlt(_localctx, 1);
				{
				setState(316); match(46);
				setState(317); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(318); match(6);
				setState(319); ((RecordsingleContext)_localctx).exp_1 = exp(0);
				((RecordsingleContext)_localctx)._recordsingle =  builder.recordEntryMutableSingle(idtoken((((RecordsingleContext)_localctx).IDTOKEN_0!=null?((RecordsingleContext)_localctx).IDTOKEN_0.getText():null)),(((RecordsingleContext)_localctx).exp_1._exp));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(322); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(323); match(6);
				setState(324); ((RecordsingleContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 34, RULE_declmono);
		int _la;
		try {
			setState(344);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(329); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(331); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(330); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(333); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 48))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHARTOKEN - 64)) | (1L << (INTTOKEN - 64)) | (1L << (NULLTOKEN - 64)) | (1L << (STRINGTOKEN - 64)) | (1L << (EMPTYLISTTOKEN - 64)) | (1L << (FLOATTOKEN - 64)) | (1L << (WILDCARDTOKEN - 64)) | (1L << (BOOLTOKEN - 64)) | (1L << (IDTOKEN - 64)) | (1L << (CONSTRTOKEN - 64)))) != 0) );
				setState(335); match(6);
				setState(336); ((DeclmonoContext)_localctx).exp_2 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMonoFunc((((DeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((DeclmonoContext)_localctx).patt_1_list),(((DeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(340); match(6);
				setState(341); ((DeclmonoContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 36, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); ((LetExpContext)_localctx).decl_0 = decl();
			setState(347); match(58);
			setState(348); ((LetExpContext)_localctx).exp_1 = exp(0);
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

	public static class DecloptionalvartypesContext extends ParserRuleContext {
		public Object _decloptionalvartypes;
		public VartypeContext vartype_0;
		public VartypeContext vartype;
		public List<VartypeContext> vartype_0tail = new ArrayList<VartypeContext>();
		public DecllabelsandvariantsContext decllabelsandvariants_0;
		public DecllabelsandvariantsContext decllabelsandvariants() {
			return getRuleContext(DecllabelsandvariantsContext.class,0);
		}
		public List<VartypeContext> vartype() {
			return getRuleContexts(VartypeContext.class);
		}
		public VartypeContext vartype(int i) {
			return getRuleContext(VartypeContext.class,i);
		}
		public DecloptionalvartypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decloptionalvartypes; }
	}

	public final DecloptionalvartypesContext decloptionalvartypes() throws RecognitionException {
		DecloptionalvartypesContext _localctx = new DecloptionalvartypesContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_decloptionalvartypes);
		int _la;
		try {
			setState(369);
			switch (_input.LA(1)) {
			case 9:
				enterOuterAlt(_localctx, 1);
				{
				setState(351); match(9);
				setState(360);
				_la = _input.LA(1);
				if (_la==41) {
					{
					setState(352); ((DecloptionalvartypesContext)_localctx).vartype_0 = vartype();
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==11) {
						{
						{
						setState(353); match(11);
						setState(354); ((DecloptionalvartypesContext)_localctx).vartype = vartype();
						((DecloptionalvartypesContext)_localctx).vartype_0tail.add(((DecloptionalvartypesContext)_localctx).vartype);
						}
						}
						setState(359);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(362); match(60);
				setState(363); ((DecloptionalvartypesContext)_localctx).decllabelsandvariants_0 = decllabelsandvariants();
				((DecloptionalvartypesContext)_localctx)._decloptionalvartypes =  builder.declLabelsAndVariantsWithVarTypes(lift("_vartype", ((DecloptionalvartypesContext)_localctx).vartype_0tail, ((DecloptionalvartypesContext)_localctx).vartype_0._vartype),(((DecloptionalvartypesContext)_localctx).decllabelsandvariants_0._decllabelsandvariants));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(366); ((DecloptionalvartypesContext)_localctx).decllabelsandvariants_0 = decllabelsandvariants();
				((DecloptionalvartypesContext)_localctx)._decloptionalvartypes =  builder.declLabelsAndVariantsWithoutVarTypes((((DecloptionalvartypesContext)_localctx).decllabelsandvariants_0._decllabelsandvariants));
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
		enterRule(_localctx, 40, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371); match(11);
			setState(372); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
		enterRule(_localctx, 42, RULE_declimpl);
		try {
			setState(384);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(375); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(376); match(17);
				setState(377); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(380); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(381); match(17);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(387); match(24);
				setState(388); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(391); match(9);
				setState(392); ((FunctionContext)_localctx).function_0 = function(0);
				setState(393); match(60);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(396); match(57);
				setState(397); ((FunctionContext)_localctx).function_0 = function(0);
				setState(398); match(59);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 4:
				{
				setState(401); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 5:
				{
				setState(404); match(1);
				setState(405); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(408); match(1);
				setState(409); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(420);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(414);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(415); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(422);
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
		enterRule(_localctx, 46, RULE_recanddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423); match(61);
			setState(424); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
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
		enterRule(_localctx, 48, RULE_recordpattappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); match(11);
			setState(428); ((RecordpattappendixContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			setState(429); match(6);
			setState(430); ((RecordpattappendixContext)_localctx).patt_1 = patt(0);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(434); match(40);
				setState(435); ((ExpContext)_localctx).exp_0 = exp(36);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(438); ((ExpContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(439); ((ExpContext)_localctx).exp_1 = exp(28);
				((ExpContext)_localctx)._exp =  builder.constrExp(constrtoken((((ExpContext)_localctx).CONSTRTOKEN_0!=null?((ExpContext)_localctx).CONSTRTOKEN_0.getText():null)),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 3:
				{
				setState(442); match(62);
				setState(443); ((ExpContext)_localctx).exp_0 = exp(22);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(446); match(55);
				setState(447); ((ExpContext)_localctx).exp_0 = exp(21);
				((ExpContext)_localctx)._exp =  builder.floatNegateExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(450); match(63);
				setState(451); ((ExpContext)_localctx).exp_0 = exp(20);
				((ExpContext)_localctx)._exp =  builder.intUnarySub((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 6:
				{
				setState(454); match(36);
				setState(455); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(456); match(26);
				setState(457); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(458); match(56);
				setState(459); ((ExpContext)_localctx).exp_2 = exp(9);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 7:
				{
				setState(462); match(36);
				setState(463); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(464); match(26);
				setState(465); ((ExpContext)_localctx).exp_1 = exp(8);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 8:
				{
				setState(468); ((ExpContext)_localctx).EMPTYARRAYTOKEN_0 = match(EMPTYARRAYTOKEN);
				((ExpContext)_localctx)._exp =  builder.emptyArray(emptyarraytoken((((ExpContext)_localctx).EMPTYARRAYTOKEN_0!=null?((ExpContext)_localctx).EMPTYARRAYTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(470); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 10:
				{
				setState(473); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 11:
				{
				setState(476); match(9);
				setState(477); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(478); match(60);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 12:
				{
				setState(481); match(57);
				setState(482); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(483); match(59);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(486); match(9);
				setState(487); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(488); match(47);
				setState(489); ((ExpContext)_localctx).type_1 = type(0);
				setState(490); match(60);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 14:
				{
				setState(493); match(9);
				{
				setState(494); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(495); match(11);
					setState(496); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(502); match(60);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 15:
				{
				setState(505); match(48);
				{
				setState(506); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(507); match(11);
					setState(508); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(514); match(18);
				((ExpContext)_localctx)._exp =  builder.expList(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 16:
				{
				setState(517); match(38);
				setState(518); ((ExpContext)_localctx).exparray_0 = exparray();
				setState(520);
				_la = _input.LA(1);
				if (_la==34) {
					{
					setState(519); match(34);
					}
				}

				setState(522); match(21);
				((ExpContext)_localctx)._exp =  builder.arrayMulti((((ExpContext)_localctx).exparray_0._exparray));
				}
				break;

			case 17:
				{
				setState(525); match(38);
				setState(526); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(528);
				_la = _input.LA(1);
				if (_la==34) {
					{
					setState(527); match(34);
					}
				}

				setState(530); match(21);
				((ExpContext)_localctx)._exp =  builder.arraySingle((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 18:
				{
				setState(533); match(3);
				{
				setState(534); ((ExpContext)_localctx).recordsingle_0 = recordsingle();
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(535); match(11);
					setState(536); ((ExpContext)_localctx).recordsingle = recordsingle();
					((ExpContext)_localctx).recordsingle_0tail.add(((ExpContext)_localctx).recordsingle);
					}
					}
					setState(541);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(542); match(35);
				((ExpContext)_localctx)._exp =  builder.recordExp(lift("_recordsingle", ((ExpContext)_localctx).recordsingle_0tail, ((ExpContext)_localctx).recordsingle_0._recordsingle));
				}
				break;

			case 19:
				{
				setState(545); match(2);
				setState(546); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(547); match(8);
				setState(548); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(549); match(13);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 20:
				{
				setState(552); match(7);
				setState(553); ((ExpContext)_localctx).ident_0 = ident();
				setState(554); match(6);
				setState(555); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(556); match(25);
				setState(557); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(558); match(8);
				setState(559); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(560); match(13);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 21:
				{
				setState(563); match(7);
				setState(564); ((ExpContext)_localctx).ident_0 = ident();
				setState(565); match(6);
				setState(566); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(567); match(45);
				setState(568); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(569); match(8);
				setState(570); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(571); match(13);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 22:
				{
				setState(574); match(23);
				setState(575); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(576); match(51);
				setState(577); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 23:
				{
				setState(580); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 24:
				{
				setState(583); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(655);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(653);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(588);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(589); match(5);
						setState(590); ((ExpContext)_localctx).exp_1 = exp(27);
						((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(593);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(594); match(14);
						setState(595); ((ExpContext)_localctx).exp_1 = exp(20);
						((ExpContext)_localctx)._exp =  builder.intMod((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(598);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(599);
						((ExpContext)_localctx).op_1512 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 19) | (1L << 28) | (1L << 33) | (1L << 42))) != 0)) ) {
							((ExpContext)_localctx).op_1512 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(600); ((ExpContext)_localctx).exp_1 = exp(19);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/") ? builder.intDivide(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*.") ? builder.floatMultiplyExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*") ? builder.intMultiply(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/.") ? builder.floatDivideExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(603);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(604);
						((ExpContext)_localctx).op_1511 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 27) | (1L << 53) | (1L << 55) | (1L << 63))) != 0)) ) {
							((ExpContext)_localctx).op_1511 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(605); ((ExpContext)_localctx).exp_1 = exp(18);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+.") ? builder.floatAddExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-.") ? builder.floatSubtractExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+") ? builder.intAdd(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-") ? builder.intSub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(608);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(609);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 15) | (1L << 16) | (1L << 37) | (1L << 52))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(610); ((ExpContext)_localctx).exp_1 = exp(17);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.smallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.greaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.smaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.equal(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.greater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(613);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(614); match(43);
						setState(615); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						setState(616); match(12);
						setState(617); ((ExpContext)_localctx).exp_2 = exp(15);
						((ExpContext)_localctx)._exp =  builder.recordAssignExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(620);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(621); match(31);
						setState(622); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(623); match(60);
						setState(624); match(12);
						setState(625); ((ExpContext)_localctx).exp_2 = exp(13);
						((ExpContext)_localctx)._exp =  builder.arrayAssign((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(628);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(629);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==39) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(630); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(633);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(634);
						_la = _input.LA(1);
						if ( !(_la==32 || _la==54) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(635); ((ExpContext)_localctx).exp_1 = exp(11);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(638);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(639); match(34);
						setState(640); ((ExpContext)_localctx).exp_1 = exp(4);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(643);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(644); match(43);
						setState(645); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						((ExpContext)_localctx)._exp =  builder.recordSelectExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)));
						}
						break;

					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(647);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(648); match(31);
						setState(649); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(650); match(60);
						((ExpContext)_localctx)._exp =  builder.arraySelect((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(657);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		public Token IDTOKEN_0;
		public Token CONSTRTOKEN_1;
		public DeclenumtypeappendixContext declenumtypeappendix;
		public List<DeclenumtypeappendixContext> declenumtypeappendix_2_list = new ArrayList<DeclenumtypeappendixContext>();
		public TypeContext type_2;
		public DeclconstrtypeappendixContext declconstrtypeappendix;
		public List<DeclconstrtypeappendixContext> declconstrtypeappendix_3_list = new ArrayList<DeclconstrtypeappendixContext>();
		public TypeContext type_1;
		public IdentContext ident_0;
		public DecllabeltypeContext decllabeltype_1;
		public DecllabeltypeContext decllabeltype;
		public List<DecllabeltypeContext> decllabeltype_1tail = new ArrayList<DecllabeltypeContext>();
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public List<DeclenumtypeappendixContext> declenumtypeappendix() {
			return getRuleContexts(DeclenumtypeappendixContext.class);
		}
		public DeclconstrtypeappendixContext declconstrtypeappendix(int i) {
			return getRuleContext(DeclconstrtypeappendixContext.class,i);
		}
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public DecllabeltypeContext decllabeltype(int i) {
			return getRuleContext(DecllabeltypeContext.class,i);
		}
		public List<DeclconstrtypeappendixContext> declconstrtypeappendix() {
			return getRuleContexts(DeclconstrtypeappendixContext.class);
		}
		public DeclenumtypeappendixContext declenumtypeappendix(int i) {
			return getRuleContext(DeclenumtypeappendixContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<DecllabeltypeContext> decllabeltype() {
			return getRuleContexts(DecllabeltypeContext.class);
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
		enterRule(_localctx, 52, RULE_decllabelsandvariants);
		int _la;
		try {
			setState(700);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(658); ((DecllabelsandvariantsContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(659); match(6);
				setState(660); ((DecllabelsandvariantsContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(664);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==50) {
					{
					{
					setState(661); ((DecllabelsandvariantsContext)_localctx).declenumtypeappendix = declenumtypeappendix();
					((DecllabelsandvariantsContext)_localctx).declenumtypeappendix_2_list.add(((DecllabelsandvariantsContext)_localctx).declenumtypeappendix);
					}
					}
					setState(666);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DecllabelsandvariantsContext)_localctx)._decllabelsandvariants =  builder.declNewEnumType(idtoken((((DecllabelsandvariantsContext)_localctx).IDTOKEN_0!=null?((DecllabelsandvariantsContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DecllabelsandvariantsContext)_localctx).CONSTRTOKEN_1!=null?((DecllabelsandvariantsContext)_localctx).CONSTRTOKEN_1.getText():null)),lift("_declenumtypeappendix", ((DecllabelsandvariantsContext)_localctx).declenumtypeappendix_2_list));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(668); ((DecllabelsandvariantsContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(669); match(6);
				setState(670); ((DecllabelsandvariantsContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(671); match(30);
				setState(672); ((DecllabelsandvariantsContext)_localctx).type_2 = type(0);
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==50) {
					{
					{
					setState(673); ((DecllabelsandvariantsContext)_localctx).declconstrtypeappendix = declconstrtypeappendix();
					((DecllabelsandvariantsContext)_localctx).declconstrtypeappendix_3_list.add(((DecllabelsandvariantsContext)_localctx).declconstrtypeappendix);
					}
					}
					setState(678);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DecllabelsandvariantsContext)_localctx)._decllabelsandvariants =  builder.declNewConstrType(idtoken((((DecllabelsandvariantsContext)_localctx).IDTOKEN_0!=null?((DecllabelsandvariantsContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DecllabelsandvariantsContext)_localctx).CONSTRTOKEN_1!=null?((DecllabelsandvariantsContext)_localctx).CONSTRTOKEN_1.getText():null)),(((DecllabelsandvariantsContext)_localctx).type_2._type),lift("_declconstrtypeappendix", ((DecllabelsandvariantsContext)_localctx).declconstrtypeappendix_3_list));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(681); ((DecllabelsandvariantsContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(682); match(49);
				setState(683); ((DecllabelsandvariantsContext)_localctx).type_1 = type(0);
				((DecllabelsandvariantsContext)_localctx)._decllabelsandvariants =  builder.declTypeDefEquals(idtoken((((DecllabelsandvariantsContext)_localctx).IDTOKEN_0!=null?((DecllabelsandvariantsContext)_localctx).IDTOKEN_0.getText():null)),(((DecllabelsandvariantsContext)_localctx).type_1._type));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(686); ((DecllabelsandvariantsContext)_localctx).ident_0 = ident();
				setState(687); match(6);
				setState(688); match(3);
				{
				setState(689); ((DecllabelsandvariantsContext)_localctx).decllabeltype_1 = decllabeltype();
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(690); match(11);
					setState(691); ((DecllabelsandvariantsContext)_localctx).decllabeltype = decllabeltype();
					((DecllabelsandvariantsContext)_localctx).decllabeltype_1tail.add(((DecllabelsandvariantsContext)_localctx).decllabeltype);
					}
					}
					setState(696);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(697); match(35);
				((DecllabelsandvariantsContext)_localctx)._decllabelsandvariants =  builder.declRecordType((((DecllabelsandvariantsContext)_localctx).ident_0._ident),lift("_decllabeltype", ((DecllabelsandvariantsContext)_localctx).decllabeltype_1tail, ((DecllabelsandvariantsContext)_localctx).decllabeltype_1._decllabeltype));
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
		enterRule(_localctx, 54, RULE_anddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702); match(61);
			setState(703); ((AnddeclContext)_localctx).declmono_0 = declmono();
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
		enterRule(_localctx, 56, RULE_varianttype);
		try {
			setState(713);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(707); match(30);
				setState(708); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(711); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 58, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(715); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(718); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 48))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHARTOKEN - 64)) | (1L << (INTTOKEN - 64)) | (1L << (NULLTOKEN - 64)) | (1L << (STRINGTOKEN - 64)) | (1L << (EMPTYLISTTOKEN - 64)) | (1L << (FLOATTOKEN - 64)) | (1L << (WILDCARDTOKEN - 64)) | (1L << (BOOLTOKEN - 64)) | (1L << (IDTOKEN - 64)) | (1L << (CONSTRTOKEN - 64)))) != 0) );
			setState(720); match(44);
			setState(721); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 60, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724); ((ProgContext)_localctx).declimpl_0 = declimpl();
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
		enterRule(_localctx, 62, RULE_exparray);
		try {
			setState(737);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(727); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(728); match(34);
				setState(729); ((ExparrayContext)_localctx).exparray_1 = exparray();
				((ExparrayContext)_localctx)._exparray =  builder.innerExpArrayMulti((((ExparrayContext)_localctx).exp_0._exp),(((ExparrayContext)_localctx).exparray_1._exparray));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(732); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(733); match(34);
				setState(734); ((ExparrayContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 64, RULE_tupletypelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739); match(42);
			setState(740); ((TupletypelistContext)_localctx).type_0 = type(0);
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
		enterRule(_localctx, 66, RULE_recdeclmono);
		int _la;
		try {
			setState(767);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(743); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(744); match(6);
				setState(745); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(748); match(9);
				setState(749); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(750); match(47);
				setState(751); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(752); match(60);
				setState(753); match(6);
				setState(754); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclPattTypeExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).type_1._type),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(757); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(759); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(758); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(761); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 48))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (CHARTOKEN - 64)) | (1L << (INTTOKEN - 64)) | (1L << (NULLTOKEN - 64)) | (1L << (STRINGTOKEN - 64)) | (1L << (EMPTYLISTTOKEN - 64)) | (1L << (FLOATTOKEN - 64)) | (1L << (WILDCARDTOKEN - 64)) | (1L << (BOOLTOKEN - 64)) | (1L << (IDTOKEN - 64)) | (1L << (CONSTRTOKEN - 64)))) != 0) );
				setState(763); match(6);
				setState(764); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
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
		enterRule(_localctx, 68, RULE_recdecl);
		int _la;
		try {
			setState(780);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(769); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				((RecdeclContext)_localctx)._recdecl =  builder.recDeclMono((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(774); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(773); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(776); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==61 );
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
		case 5: return patt_sempred((PattContext)_localctx, predIndex);

		case 13: return type_sempred((TypeContext)_localctx, predIndex);

		case 22: return function_sempred((FunctionContext)_localctx, predIndex);

		case 25: return exp_sempred((ExpContext)_localctx, predIndex);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3M\u0311\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2U\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3h\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4u\n"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0086"+
		"\n\6\f\6\16\6\u0089\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u0093\n\6"+
		"\r\6\16\6\u0094\3\6\3\6\5\6\u0099\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\7\7\u00a5\n\7\f\7\16\7\u00a8\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\6\7\u00c6\n\7\r\7\16\7\u00c7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00da\n\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\u00e6\n\7\f\7\16\7\u00e9\13\7\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f4\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0104\n\13\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u011d\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17"+
		"\u0126\n\17\r\17\16\17\u0127\3\17\3\17\7\17\u012c\n\17\f\17\16\17\u012f"+
		"\13\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u013d\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22"+
		"\u014a\n\22\3\23\3\23\6\23\u014e\n\23\r\23\16\23\u014f\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u015b\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\7\25\u0166\n\25\f\25\16\25\u0169\13\25\5\25\u016b"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0174\n\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0183\n\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u019f\n\30"+
		"\3\30\3\30\3\30\3\30\7\30\u01a5\n\30\f\30\16\30\u01a8\13\30\3\31\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\7\33\u01f4\n\33\f\33\16\33\u01f7\13\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u0200\n\33\f\33\16\33\u0203\13\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u020b\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0213"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u021c\n\33\f\33\16\33\u021f"+
		"\13\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\5\33\u024d\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\7\33\u0290\n\33\f\33\16\33\u0293\13\33\3\34\3\34\3\34\3\34\7\34"+
		"\u0299\n\34\f\34\16\34\u029c\13\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\7\34\u02a5\n\34\f\34\16\34\u02a8\13\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u02b7\n\34\f\34\16\34\u02ba\13"+
		"\34\3\34\3\34\3\34\5\34\u02bf\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u02cc\n\36\3\37\6\37\u02cf\n\37\r\37\16\37\u02d0"+
		"\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u02e4\n"+
		"!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\6#\u02fa"+
		"\n#\r#\16#\u02fb\3#\3#\3#\3#\5#\u0302\n#\3$\3$\3$\3$\3$\6$\u0309\n$\r"+
		"$\16$\u030a\3$\3$\5$\u030f\n$\3$\2\6\f\34.\64%\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\7\6\2\25\25\36\36##,,\6"+
		"\2\35\35\67\6799AA\6\2\b\b\21\22\'\'\66\66\4\2\6\6))\4\2\"\"88\u0357\2"+
		"T\3\2\2\2\4g\3\2\2\2\6t\3\2\2\2\bv\3\2\2\2\n\u0098\3\2\2\2\f\u00d9\3\2"+
		"\2\2\16\u00ea\3\2\2\2\20\u00f3\3\2\2\2\22\u00f5\3\2\2\2\24\u0103\3\2\2"+
		"\2\26\u0105\3\2\2\2\30\u0109\3\2\2\2\32\u010c\3\2\2\2\34\u011c\3\2\2\2"+
		"\36\u0130\3\2\2\2 \u013c\3\2\2\2\"\u0149\3\2\2\2$\u015a\3\2\2\2&\u015c"+
		"\3\2\2\2(\u0173\3\2\2\2*\u0175\3\2\2\2,\u0182\3\2\2\2.\u019e\3\2\2\2\60"+
		"\u01a9\3\2\2\2\62\u01ad\3\2\2\2\64\u024c\3\2\2\2\66\u02be\3\2\2\28\u02c0"+
		"\3\2\2\2:\u02cb\3\2\2\2<\u02ce\3\2\2\2>\u02d6\3\2\2\2@\u02e3\3\2\2\2B"+
		"\u02e5\3\2\2\2D\u0301\3\2\2\2F\u030e\3\2\2\2HI\7\64\2\2IJ\5\2\2\2JK\b"+
		"\2\1\2KU\3\2\2\2LM\5\32\16\2MN\7\64\2\2NO\5\2\2\2OP\b\2\1\2PU\3\2\2\2"+
		"QR\5\32\16\2RS\b\2\1\2SU\3\2\2\2TH\3\2\2\2TL\3\2\2\2TQ\3\2\2\2U\3\3\2"+
		"\2\2VW\5\30\r\2WX\b\3\1\2Xh\3\2\2\2YZ\7D\2\2Zh\b\3\1\2[\\\7K\2\2\\h\b"+
		"\3\1\2]^\7I\2\2^h\b\3\1\2_`\7B\2\2`h\b\3\1\2ab\7E\2\2bh\b\3\1\2cd\7M\2"+
		"\2dh\b\3\1\2ef\7G\2\2fh\b\3\1\2gV\3\2\2\2gY\3\2\2\2g[\3\2\2\2g]\3\2\2"+
		"\2g_\3\2\2\2ga\3\2\2\2gc\3\2\2\2ge\3\2\2\2h\5\3\2\2\2ij\7\60\2\2jk\7L"+
		"\2\2kl\7\61\2\2lm\5\34\17\2mn\b\4\1\2nu\3\2\2\2op\7L\2\2pq\7\61\2\2qr"+
		"\5\34\17\2rs\b\4\1\2su\3\2\2\2ti\3\2\2\2to\3\2\2\2u\7\3\2\2\2vw\7+\2\2"+
		"wx\7L\2\2xy\b\5\1\2y\t\3\2\2\2z{\7\30\2\2{|\7\f\2\2|}\5F$\2}~\b\6\1\2"+
		"~\u0099\3\2\2\2\177\u0080\5$\23\2\u0080\u0081\b\6\1\2\u0081\u0099\3\2"+
		"\2\2\u0082\u0083\7\26\2\2\u0083\u0087\5(\25\2\u0084\u0086\5\36\20\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\b\6\1\2\u008b"+
		"\u0099\3\2\2\2\u008c\u008d\7\30\2\2\u008d\u008e\5\n\6\2\u008e\u008f\b"+
		"\6\1\2\u008f\u0099\3\2\2\2\u0090\u0092\5$\23\2\u0091\u0093\58\35\2\u0092"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2"+
		"\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\6\1\2\u0097\u0099\3\2\2\2\u0098"+
		"z\3\2\2\2\u0098\177\3\2\2\2\u0098\u0082\3\2\2\2\u0098\u008c\3\2\2\2\u0098"+
		"\u0090\3\2\2\2\u0099\13\3\2\2\2\u009a\u009b\b\7\1\2\u009b\u009c\7M\2\2"+
		"\u009c\u009d\5\f\7\b\u009d\u009e\b\7\1\2\u009e\u00da\3\2\2\2\u009f\u00a0"+
		"\7\5\2\2\u00a0\u00a1\7L\2\2\u00a1\u00a2\7\b\2\2\u00a2\u00a6\5\f\7\2\u00a3"+
		"\u00a5\5\62\32\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00aa\7%\2\2\u00aa\u00ab\b\7\1\2\u00ab\u00da\3\2\2\2\u00ac\u00ad\5\16"+
		"\b\2\u00ad\u00ae\b\7\1\2\u00ae\u00da\3\2\2\2\u00af\u00b0\7J\2\2\u00b0"+
		"\u00da\b\7\1\2\u00b1\u00b2\7\13\2\2\u00b2\u00b3\5\f\7\2\u00b3\u00b4\7"+
		">\2\2\u00b4\u00b5\b\7\1\2\u00b5\u00da\3\2\2\2\u00b6\u00b7\7\13\2\2\u00b7"+
		"\u00b8\5\f\7\2\u00b8\u00b9\7\61\2\2\u00b9\u00ba\5\34\17\2\u00ba\u00bb"+
		"\7>\2\2\u00bb\u00bc\b\7\1\2\u00bc\u00da\3\2\2\2\u00bd\u00be\5\4\3\2\u00be"+
		"\u00bf\b\7\1\2\u00bf\u00da\3\2\2\2\u00c0\u00c1\7M\2\2\u00c1\u00da\b\7"+
		"\1\2\u00c2\u00c3\7\13\2\2\u00c3\u00c5\5\f\7\2\u00c4\u00c6\5*\26\2\u00c5"+
		"\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\7>\2\2\u00ca\u00cb\b\7\1\2\u00cb"+
		"\u00da\3\2\2\2\u00cc\u00cd\5\30\r\2\u00cd\u00ce\b\7\1\2\u00ce\u00da\3"+
		"\2\2\2\u00cf\u00d0\7\62\2\2\u00d0\u00d1\5\24\13\2\u00d1\u00d2\7\24\2\2"+
		"\u00d2\u00d3\b\7\1\2\u00d3\u00da\3\2\2\2\u00d4\u00d5\7\62\2\2\u00d5\u00d6"+
		"\5 \21\2\u00d6\u00d7\7\24\2\2\u00d7\u00d8\b\7\1\2\u00d8\u00da\3\2\2\2"+
		"\u00d9\u009a\3\2\2\2\u00d9\u009f\3\2\2\2\u00d9\u00ac\3\2\2\2\u00d9\u00af"+
		"\3\2\2\2\u00d9\u00b1\3\2\2\2\u00d9\u00b6\3\2\2\2\u00d9\u00bd\3\2\2\2\u00d9"+
		"\u00c0\3\2\2\2\u00d9\u00c2\3\2\2\2\u00d9\u00cc\3\2\2\2\u00d9\u00cf\3\2"+
		"\2\2\u00d9\u00d4\3\2\2\2\u00da\u00e7\3\2\2\2\u00db\u00dc\f\n\2\2\u00dc"+
		"\u00dd\7\64\2\2\u00dd\u00de\5\f\7\13\u00de\u00df\b\7\1\2\u00df\u00e6\3"+
		"\2\2\2\u00e0\u00e1\f\r\2\2\u00e1\u00e2\7\37\2\2\u00e2\u00e3\5\16\b\2\u00e3"+
		"\u00e4\b\7\1\2\u00e4\u00e6\3\2\2\2\u00e5\u00db\3\2\2\2\u00e5\u00e0\3\2"+
		"\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\r\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7L\2\2\u00eb\u00ec\b\b\1\2"+
		"\u00ec\17\3\2\2\2\u00ed\u00ee\5\64\33\2\u00ee\u00ef\b\t\1\2\u00ef\u00f4"+
		"\3\2\2\2\u00f0\u00f1\5\n\6\2\u00f1\u00f2\b\t\1\2\u00f2\u00f4\3\2\2\2\u00f3"+
		"\u00ed\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4\21\3\2\2\2\u00f5\u00f6\7\64\2"+
		"\2\u00f6\u00f7\7M\2\2\u00f7\u00f8\7 \2\2\u00f8\u00f9\5\34\17\2\u00f9\u00fa"+
		"\b\n\1\2\u00fa\23\3\2\2\2\u00fb\u00fc\5\f\7\2\u00fc\u00fd\b\13\1\2\u00fd"+
		"\u0104\3\2\2\2\u00fe\u00ff\5\f\7\2\u00ff\u0100\7\r\2\2\u0100\u0101\5\24"+
		"\13\2\u0101\u0102\b\13\1\2\u0102\u0104\3\2\2\2\u0103\u00fb\3\2\2\2\u0103"+
		"\u00fe\3\2\2\2\u0104\25\3\2\2\2\u0105\u0106\7\64\2\2\u0106\u0107\7M\2"+
		"\2\u0107\u0108\b\f\1\2\u0108\27\3\2\2\2\u0109\u010a\7H\2\2\u010a\u010b"+
		"\b\r\1\2\u010b\31\3\2\2\2\u010c\u010d\5\f\7\2\u010d\u010e\7.\2\2\u010e"+
		"\u010f\5\64\33\2\u010f\u0110\b\16\1\2\u0110\33\3\2\2\2\u0111\u0112\b\17"+
		"\1\2\u0112\u0113\5\b\5\2\u0113\u0114\b\17\1\2\u0114\u011d\3\2\2\2\u0115"+
		"\u0116\7\13\2\2\u0116\u0117\5\34\17\2\u0117\u0118\7>\2\2\u0118\u0119\b"+
		"\17\1\2\u0119\u011d\3\2\2\2\u011a\u011b\7L\2\2\u011b\u011d\b\17\1\2\u011c"+
		"\u0111\3\2\2\2\u011c\u0115\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u012d\3\2"+
		"\2\2\u011e\u011f\f\5\2\2\u011f\u0120\7.\2\2\u0120\u0121\5\34\17\6\u0121"+
		"\u0122\b\17\1\2\u0122\u012c\3\2\2\2\u0123\u0125\f\3\2\2\u0124\u0126\5"+
		"B\"\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a\b\17\1\2\u012a\u012c\3"+
		"\2\2\2\u012b\u011e\3\2\2\2\u012b\u0123\3\2\2\2\u012c\u012f\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\35\3\2\2\2\u012f\u012d\3\2\2"+
		"\2\u0130\u0131\7?\2\2\u0131\u0132\5(\25\2\u0132\u0133\b\20\1\2\u0133\37"+
		"\3\2\2\2\u0134\u0135\5\f\7\2\u0135\u0136\7\7\2\2\u0136\u0137\5 \21\2\u0137"+
		"\u0138\b\21\1\2\u0138\u013d\3\2\2\2\u0139\u013a\5\f\7\2\u013a\u013b\b"+
		"\21\1\2\u013b\u013d\3\2\2\2\u013c\u0134\3\2\2\2\u013c\u0139\3\2\2\2\u013d"+
		"!\3\2\2\2\u013e\u013f\7\60\2\2\u013f\u0140\7L\2\2\u0140\u0141\7\b\2\2"+
		"\u0141\u0142\5\64\33\2\u0142\u0143\b\22\1\2\u0143\u014a\3\2\2\2\u0144"+
		"\u0145\7L\2\2\u0145\u0146\7\b\2\2\u0146\u0147\5\64\33\2\u0147\u0148\b"+
		"\22\1\2\u0148\u014a\3\2\2\2\u0149\u013e\3\2\2\2\u0149\u0144\3\2\2\2\u014a"+
		"#\3\2\2\2\u014b\u014d\5\16\b\2\u014c\u014e\5\f\7\2\u014d\u014c\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u0152\7\b\2\2\u0152\u0153\5\64\33\2\u0153\u0154\b\23\1"+
		"\2\u0154\u015b\3\2\2\2\u0155\u0156\5\f\7\2\u0156\u0157\7\b\2\2\u0157\u0158"+
		"\5\64\33\2\u0158\u0159\b\23\1\2\u0159\u015b\3\2\2\2\u015a\u014b\3\2\2"+
		"\2\u015a\u0155\3\2\2\2\u015b%\3\2\2\2\u015c\u015d\5\n\6\2\u015d\u015e"+
		"\7<\2\2\u015e\u015f\5\64\33\2\u015f\u0160\b\24\1\2\u0160\'\3\2\2\2\u0161"+
		"\u016a\7\13\2\2\u0162\u0167\5\b\5\2\u0163\u0164\7\r\2\2\u0164\u0166\5"+
		"\b\5\2\u0165\u0163\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u0162\3\2"+
		"\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016d\7>\2\2\u016d"+
		"\u016e\5\66\34\2\u016e\u016f\b\25\1\2\u016f\u0174\3\2\2\2\u0170\u0171"+
		"\5\66\34\2\u0171\u0172\b\25\1\2\u0172\u0174\3\2\2\2\u0173\u0161\3\2\2"+
		"\2\u0173\u0170\3\2\2\2\u0174)\3\2\2\2\u0175\u0176\7\r\2\2\u0176\u0177"+
		"\5\f\7\2\u0177\u0178\b\26\1\2\u0178+\3\2\2\2\u0179\u017a\5\20\t\2\u017a"+
		"\u017b\7\23\2\2\u017b\u017c\5,\27\2\u017c\u017d\b\27\1\2\u017d\u0183\3"+
		"\2\2\2\u017e\u017f\5\20\t\2\u017f\u0180\7\23\2\2\u0180\u0181\b\27\1\2"+
		"\u0181\u0183\3\2\2\2\u0182\u0179\3\2\2\2\u0182\u017e\3\2\2\2\u0183-\3"+
		"\2\2\2\u0184\u0185\b\30\1\2\u0185\u0186\7\32\2\2\u0186\u0187\5\2\2\2\u0187"+
		"\u0188\b\30\1\2\u0188\u019f\3\2\2\2\u0189\u018a\7\13\2\2\u018a\u018b\5"+
		".\30\2\u018b\u018c\7>\2\2\u018c\u018d\b\30\1\2\u018d\u019f\3\2\2\2\u018e"+
		"\u018f\7;\2\2\u018f\u0190\5.\30\2\u0190\u0191\7=\2\2\u0191\u0192\b\30"+
		"\1\2\u0192\u019f\3\2\2\2\u0193\u0194\5\16\b\2\u0194\u0195\b\30\1\2\u0195"+
		"\u019f\3\2\2\2\u0196\u0197\7\3\2\2\u0197\u0198\5\32\16\2\u0198\u0199\b"+
		"\30\1\2\u0199\u019f\3\2\2\2\u019a\u019b\7\3\2\2\u019b\u019c\5<\37\2\u019c"+
		"\u019d\b\30\1\2\u019d\u019f\3\2\2\2\u019e\u0184\3\2\2\2\u019e\u0189\3"+
		"\2\2\2\u019e\u018e\3\2\2\2\u019e\u0193\3\2\2\2\u019e\u0196\3\2\2\2\u019e"+
		"\u019a\3\2\2\2\u019f\u01a6\3\2\2\2\u01a0\u01a1\f\7\2\2\u01a1\u01a2\5\64"+
		"\33\2\u01a2\u01a3\b\30\1\2\u01a3\u01a5\3\2\2\2\u01a4\u01a0\3\2\2\2\u01a5"+
		"\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7/\3\2\2\2"+
		"\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7?\2\2\u01aa\u01ab\5D#\2\u01ab\u01ac"+
		"\b\31\1\2\u01ac\61\3\2\2\2\u01ad\u01ae\7\r\2\2\u01ae\u01af\7L\2\2\u01af"+
		"\u01b0\7\b\2\2\u01b0\u01b1\5\f\7\2\u01b1\u01b2\b\32\1\2\u01b2\63\3\2\2"+
		"\2\u01b3\u01b4\b\33\1\2\u01b4\u01b5\7*\2\2\u01b5\u01b6\5\64\33&\u01b6"+
		"\u01b7\b\33\1\2\u01b7\u024d\3\2\2\2\u01b8\u01b9\7M\2\2\u01b9\u01ba\5\64"+
		"\33\36\u01ba\u01bb\b\33\1\2\u01bb\u024d\3\2\2\2\u01bc\u01bd\7@\2\2\u01bd"+
		"\u01be\5\64\33\30\u01be\u01bf\b\33\1\2\u01bf\u024d\3\2\2\2\u01c0\u01c1"+
		"\79\2\2\u01c1\u01c2\5\64\33\27\u01c2\u01c3\b\33\1\2\u01c3\u024d\3\2\2"+
		"\2\u01c4\u01c5\7A\2\2\u01c5\u01c6\5\64\33\26\u01c6\u01c7\b\33\1\2\u01c7"+
		"\u024d\3\2\2\2\u01c8\u01c9\7&\2\2\u01c9\u01ca\5\64\33\2\u01ca\u01cb\7"+
		"\34\2\2\u01cb\u01cc\5\64\33\2\u01cc\u01cd\7:\2\2\u01cd\u01ce\5\64\33\13"+
		"\u01ce\u01cf\b\33\1\2\u01cf\u024d\3\2\2\2\u01d0\u01d1\7&\2\2\u01d1\u01d2"+
		"\5\64\33\2\u01d2\u01d3\7\34\2\2\u01d3\u01d4\5\64\33\n\u01d4\u01d5\b\33"+
		"\1\2\u01d5\u024d\3\2\2\2\u01d6\u01d7\7F\2\2\u01d7\u024d\b\33\1\2\u01d8"+
		"\u01d9\5\16\b\2\u01d9\u01da\b\33\1\2\u01da\u024d\3\2\2\2\u01db\u01dc\5"+
		"\4\3\2\u01dc\u01dd\b\33\1\2\u01dd\u024d\3\2\2\2\u01de\u01df\7\13\2\2\u01df"+
		"\u01e0\5\64\33\2\u01e0\u01e1\7>\2\2\u01e1\u01e2\b\33\1\2\u01e2\u024d\3"+
		"\2\2\2\u01e3\u01e4\7;\2\2\u01e4\u01e5\5\64\33\2\u01e5\u01e6\7=\2\2\u01e6"+
		"\u01e7\b\33\1\2\u01e7\u024d\3\2\2\2\u01e8\u01e9\7\13\2\2\u01e9\u01ea\5"+
		"\64\33\2\u01ea\u01eb\7\61\2\2\u01eb\u01ec\5\34\17\2\u01ec\u01ed\7>\2\2"+
		"\u01ed\u01ee\b\33\1\2\u01ee\u024d\3\2\2\2\u01ef\u01f0\7\13\2\2\u01f0\u01f5"+
		"\5\64\33\2\u01f1\u01f2\7\r\2\2\u01f2\u01f4\5\64\33\2\u01f3\u01f1\3\2\2"+
		"\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8"+
		"\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\7>\2\2\u01f9\u01fa\b\33\1\2\u01fa"+
		"\u024d\3\2\2\2\u01fb\u01fc\7\62\2\2\u01fc\u0201\5\64\33\2\u01fd\u01fe"+
		"\7\r\2\2\u01fe\u0200\5\64\33\2\u01ff\u01fd\3\2\2\2\u0200\u0203\3\2\2\2"+
		"\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0201"+
		"\3\2\2\2\u0204\u0205\7\24\2\2\u0205\u0206\b\33\1\2\u0206\u024d\3\2\2\2"+
		"\u0207\u0208\7(\2\2\u0208\u020a\5@!\2\u0209\u020b\7$\2\2\u020a\u0209\3"+
		"\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d\7\27\2\2\u020d"+
		"\u020e\b\33\1\2\u020e\u024d\3\2\2\2\u020f\u0210\7(\2\2\u0210\u0212\5\64"+
		"\33\2\u0211\u0213\7$\2\2\u0212\u0211\3\2\2\2\u0212\u0213\3\2\2\2\u0213"+
		"\u0214\3\2\2\2\u0214\u0215\7\27\2\2\u0215\u0216\b\33\1\2\u0216\u024d\3"+
		"\2\2\2\u0217\u0218\7\5\2\2\u0218\u021d\5\"\22\2\u0219\u021a\7\r\2\2\u021a"+
		"\u021c\5\"\22\2\u021b\u0219\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3"+
		"\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f\u021d\3\2\2\2\u0220"+
		"\u0221\7%\2\2\u0221\u0222\b\33\1\2\u0222\u024d\3\2\2\2\u0223\u0224\7\4"+
		"\2\2\u0224\u0225\5\64\33\2\u0225\u0226\7\n\2\2\u0226\u0227\5\64\33\2\u0227"+
		"\u0228\7\17\2\2\u0228\u0229\b\33\1\2\u0229\u024d\3\2\2\2\u022a\u022b\7"+
		"\t\2\2\u022b\u022c\5\16\b\2\u022c\u022d\7\b\2\2\u022d\u022e\5\64\33\2"+
		"\u022e\u022f\7\33\2\2\u022f\u0230\5\64\33\2\u0230\u0231\7\n\2\2\u0231"+
		"\u0232\5\64\33\2\u0232\u0233\7\17\2\2\u0233\u0234\b\33\1\2\u0234\u024d"+
		"\3\2\2\2\u0235\u0236\7\t\2\2\u0236\u0237\5\16\b\2\u0237\u0238\7\b\2\2"+
		"\u0238\u0239\5\64\33\2\u0239\u023a\7/\2\2\u023a\u023b\5\64\33\2\u023b"+
		"\u023c\7\n\2\2\u023c\u023d\5\64\33\2\u023d\u023e\7\17\2\2\u023e\u023f"+
		"\b\33\1\2\u023f\u024d\3\2\2\2\u0240\u0241\7\31\2\2\u0241\u0242\5\64\33"+
		"\2\u0242\u0243\7\65\2\2\u0243\u0244\5\2\2\2\u0244\u0245\b\33\1\2\u0245"+
		"\u024d\3\2\2\2\u0246\u0247\5.\30\2\u0247\u0248\b\33\1\2\u0248\u024d\3"+
		"\2\2\2\u0249\u024a\5&\24\2\u024a\u024b\b\33\1\2\u024b\u024d\3\2\2\2\u024c"+
		"\u01b3\3\2\2\2\u024c\u01b8\3\2\2\2\u024c\u01bc\3\2\2\2\u024c\u01c0\3\2"+
		"\2\2\u024c\u01c4\3\2\2\2\u024c\u01c8\3\2\2\2\u024c\u01d0\3\2\2\2\u024c"+
		"\u01d6\3\2\2\2\u024c\u01d8\3\2\2\2\u024c\u01db\3\2\2\2\u024c\u01de\3\2"+
		"\2\2\u024c\u01e3\3\2\2\2\u024c\u01e8\3\2\2\2\u024c\u01ef\3\2\2\2\u024c"+
		"\u01fb\3\2\2\2\u024c\u0207\3\2\2\2\u024c\u020f\3\2\2\2\u024c\u0217\3\2"+
		"\2\2\u024c\u0223\3\2\2\2\u024c\u022a\3\2\2\2\u024c\u0235\3\2\2\2\u024c"+
		"\u0240\3\2\2\2\u024c\u0246\3\2\2\2\u024c\u0249\3\2\2\2\u024d\u0291\3\2"+
		"\2\2\u024e\u024f\f\35\2\2\u024f\u0250\7\7\2\2\u0250\u0251\5\64\33\35\u0251"+
		"\u0252\b\33\1\2\u0252\u0290\3\2\2\2\u0253\u0254\f\25\2\2\u0254\u0255\7"+
		"\20\2\2\u0255\u0256\5\64\33\26\u0256\u0257\b\33\1\2\u0257\u0290\3\2\2"+
		"\2\u0258\u0259\f\24\2\2\u0259\u025a\t\2\2\2\u025a\u025b\5\64\33\25\u025b"+
		"\u025c\b\33\1\2\u025c\u0290\3\2\2\2\u025d\u025e\f\23\2\2\u025e\u025f\t"+
		"\3\2\2\u025f\u0260\5\64\33\24\u0260\u0261\b\33\1\2\u0261\u0290\3\2\2\2"+
		"\u0262\u0263\f\22\2\2\u0263\u0264\t\4\2\2\u0264\u0265\5\64\33\23\u0265"+
		"\u0266\b\33\1\2\u0266\u0290\3\2\2\2\u0267\u0268\f\20\2\2\u0268\u0269\7"+
		"-\2\2\u0269\u026a\7L\2\2\u026a\u026b\7\16\2\2\u026b\u026c\5\64\33\21\u026c"+
		"\u026d\b\33\1\2\u026d\u0290\3\2\2\2\u026e\u026f\f\16\2\2\u026f\u0270\7"+
		"!\2\2\u0270\u0271\5\64\33\2\u0271\u0272\7>\2\2\u0272\u0273\7\16\2\2\u0273"+
		"\u0274\5\64\33\17\u0274\u0275\b\33\1\2\u0275\u0290\3\2\2\2\u0276\u0277"+
		"\f\r\2\2\u0277\u0278\t\5\2\2\u0278\u0279\5\64\33\16\u0279\u027a\b\33\1"+
		"\2\u027a\u0290\3\2\2\2\u027b\u027c\f\f\2\2\u027c\u027d\t\6\2\2\u027d\u027e"+
		"\5\64\33\r\u027e\u027f\b\33\1\2\u027f\u0290\3\2\2\2\u0280\u0281\f\6\2"+
		"\2\u0281\u0282\7$\2\2\u0282\u0283\5\64\33\6\u0283\u0284\b\33\1\2\u0284"+
		"\u0290\3\2\2\2\u0285\u0286\f\21\2\2\u0286\u0287\7-\2\2\u0287\u0288\7L"+
		"\2\2\u0288\u0290\b\33\1\2\u0289\u028a\f\17\2\2\u028a\u028b\7!\2\2\u028b"+
		"\u028c\5\64\33\2\u028c\u028d\7>\2\2\u028d\u028e\b\33\1\2\u028e\u0290\3"+
		"\2\2\2\u028f\u024e\3\2\2\2\u028f\u0253\3\2\2\2\u028f\u0258\3\2\2\2\u028f"+
		"\u025d\3\2\2\2\u028f\u0262\3\2\2\2\u028f\u0267\3\2\2\2\u028f\u026e\3\2"+
		"\2\2\u028f\u0276\3\2\2\2\u028f\u027b\3\2\2\2\u028f\u0280\3\2\2\2\u028f"+
		"\u0285\3\2\2\2\u028f\u0289\3\2\2\2\u0290\u0293\3\2\2\2\u0291\u028f\3\2"+
		"\2\2\u0291\u0292\3\2\2\2\u0292\65\3\2\2\2\u0293\u0291\3\2\2\2\u0294\u0295"+
		"\7L\2\2\u0295\u0296\7\b\2\2\u0296\u029a\7M\2\2\u0297\u0299\5\26\f\2\u0298"+
		"\u0297\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a\u029b\3\2"+
		"\2\2\u029b\u029d\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u02bf\b\34\1\2\u029e"+
		"\u029f\7L\2\2\u029f\u02a0\7\b\2\2\u02a0\u02a1\7M\2\2\u02a1\u02a2\7 \2"+
		"\2\u02a2\u02a6\5\34\17\2\u02a3\u02a5\5\22\n\2\u02a4\u02a3\3\2\2\2\u02a5"+
		"\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7\u02a9\3\2"+
		"\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02aa\b\34\1\2\u02aa\u02bf\3\2\2\2\u02ab"+
		"\u02ac\7L\2\2\u02ac\u02ad\7\63\2\2\u02ad\u02ae\5\34\17\2\u02ae\u02af\b"+
		"\34\1\2\u02af\u02bf\3\2\2\2\u02b0\u02b1\5\16\b\2\u02b1\u02b2\7\b\2\2\u02b2"+
		"\u02b3\7\5\2\2\u02b3\u02b8\5\6\4\2\u02b4\u02b5\7\r\2\2\u02b5\u02b7\5\6"+
		"\4\2\u02b6\u02b4\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b8"+
		"\u02b9\3\2\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02bc\7%"+
		"\2\2\u02bc\u02bd\b\34\1\2\u02bd\u02bf\3\2\2\2\u02be\u0294\3\2\2\2\u02be"+
		"\u029e\3\2\2\2\u02be\u02ab\3\2\2\2\u02be\u02b0\3\2\2\2\u02bf\67\3\2\2"+
		"\2\u02c0\u02c1\7?\2\2\u02c1\u02c2\5$\23\2\u02c2\u02c3\b\35\1\2\u02c39"+
		"\3\2\2\2\u02c4\u02c5\7M\2\2\u02c5\u02c6\7 \2\2\u02c6\u02c7\5\34\17\2\u02c7"+
		"\u02c8\b\36\1\2\u02c8\u02cc\3\2\2\2\u02c9\u02ca\7M\2\2\u02ca\u02cc\b\36"+
		"\1\2\u02cb\u02c4\3\2\2\2\u02cb\u02c9\3\2\2\2\u02cc;\3\2\2\2\u02cd\u02cf"+
		"\5\f\7\2\u02ce\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0"+
		"\u02d1\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d3\7.\2\2\u02d3\u02d4\5\64"+
		"\33\2\u02d4\u02d5\b\37\1\2\u02d5=\3\2\2\2\u02d6\u02d7\5,\27\2\u02d7\u02d8"+
		"\b \1\2\u02d8?\3\2\2\2\u02d9\u02da\5\64\33\2\u02da\u02db\7$\2\2\u02db"+
		"\u02dc\5@!\2\u02dc\u02dd\b!\1\2\u02dd\u02e4\3\2\2\2\u02de\u02df\5\64\33"+
		"\2\u02df\u02e0\7$\2\2\u02e0\u02e1\5\64\33\2\u02e1\u02e2\b!\1\2\u02e2\u02e4"+
		"\3\2\2\2\u02e3\u02d9\3\2\2\2\u02e3\u02de\3\2\2\2\u02e4A\3\2\2\2\u02e5"+
		"\u02e6\7,\2\2\u02e6\u02e7\5\34\17\2\u02e7\u02e8\b\"\1\2\u02e8C\3\2\2\2"+
		"\u02e9\u02ea\5\16\b\2\u02ea\u02eb\7\b\2\2\u02eb\u02ec\5\64\33\2\u02ec"+
		"\u02ed\b#\1\2\u02ed\u0302\3\2\2\2\u02ee\u02ef\7\13\2\2\u02ef\u02f0\5\16"+
		"\b\2\u02f0\u02f1\7\61\2\2\u02f1\u02f2\5\34\17\2\u02f2\u02f3\7>\2\2\u02f3"+
		"\u02f4\7\b\2\2\u02f4\u02f5\5\64\33\2\u02f5\u02f6\b#\1\2\u02f6\u0302\3"+
		"\2\2\2\u02f7\u02f9\5\16\b\2\u02f8\u02fa\5\f\7\2\u02f9\u02f8\3\2\2\2\u02fa"+
		"\u02fb\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\3\2"+
		"\2\2\u02fd\u02fe\7\b\2\2\u02fe\u02ff\5\64\33\2\u02ff\u0300\b#\1\2\u0300"+
		"\u0302\3\2\2\2\u0301\u02e9\3\2\2\2\u0301\u02ee\3\2\2\2\u0301\u02f7\3\2"+
		"\2\2\u0302E\3\2\2\2\u0303\u0304\5D#\2\u0304\u0305\b$\1\2\u0305\u030f\3"+
		"\2\2\2\u0306\u0308\5D#\2\u0307\u0309\5\60\31\2\u0308\u0307\3\2\2\2\u0309"+
		"\u030a\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c\3\2"+
		"\2\2\u030c\u030d\b$\1\2\u030d\u030f\3\2\2\2\u030e\u0303\3\2\2\2\u030e"+
		"\u0306\3\2\2\2\u030fG\3\2\2\2\60Tgt\u0087\u0094\u0098\u00a6\u00c7\u00d9"+
		"\u00e5\u00e7\u00f3\u0103\u011c\u0127\u012b\u012d\u013c\u0149\u014f\u015a"+
		"\u0167\u016a\u0173\u0182\u019e\u01a6\u01f5\u0201\u020a\u0212\u021d\u024c"+
		"\u028f\u0291\u029a\u02a6\u02b8\u02be\u02cb\u02d0\u02e3\u02fb\u0301\u030a"+
		"\u030e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}