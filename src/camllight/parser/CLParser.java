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
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decllabeltype = 2, RULE_decl = 3, 
		RULE_patt = 4, RULE_ident = 5, RULE_declorexp = 6, RULE_declconstrtypeappendix = 7, 
		RULE_pattlist = 8, RULE_declenumtypeappendix = 9, RULE_emptylist = 10, 
		RULE_pattmatchsingle = 11, RULE_type = 12, RULE_headtaillistpatt = 13, 
		RULE_recordsingle = 14, RULE_declmono = 15, RULE_letExp = 16, RULE_patttuple = 17, 
		RULE_declimpl = 18, RULE_function = 19, RULE_recanddecl = 20, RULE_recordpattappendix = 21, 
		RULE_exp = 22, RULE_decllabelsandvariants = 23, RULE_anddecl = 24, RULE_varianttype = 25, 
		RULE_pattmatchcurried = 26, RULE_prog = 27, RULE_exparray = 28, RULE_tupletypelist = 29, 
		RULE_recdeclmono = 30, RULE_recdecl = 31;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decllabeltype", "decl", "patt", "ident", "declorexp", 
		"declconstrtypeappendix", "pattlist", "declenumtypeappendix", "emptylist", 
		"pattmatchsingle", "type", "headtaillistpatt", "recordsingle", "declmono", 
		"letExp", "patttuple", "declimpl", "function", "recanddecl", "recordpattappendix", 
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
			setState(76);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64); match(49);
				setState(65); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				setState(69); match(49);
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
		public EmptylistContext emptylist_0;
		public Token STRINGTOKEN_0;
		public Token CHARTOKEN_0;
		public Token CONSTRTOKEN_0;
		public Token INTTOKEN_0;
		public Token NULLTOKEN_0;
		public Token BOOLTOKEN_0;
		public Token FLOATTOKEN_0;
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public TerminalNode FLOATTOKEN() { return getToken(CLParser.FLOATTOKEN, 0); }
		public TerminalNode NULLTOKEN() { return getToken(CLParser.NULLTOKEN, 0); }
		public TerminalNode INTTOKEN() { return getToken(CLParser.INTTOKEN, 0); }
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public TerminalNode CHARTOKEN() { return getToken(CLParser.CHARTOKEN, 0); }
		public TerminalNode BOOLTOKEN() { return getToken(CLParser.BOOLTOKEN, 0); }
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
			setState(95);
			switch (_input.LA(1)) {
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
				}
				break;
			case STRINGTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(81); ((ConstantContext)_localctx).STRINGTOKEN_0 = match(STRINGTOKEN);
				((ConstantContext)_localctx)._constant =  builder.string(stringtoken((((ConstantContext)_localctx).STRINGTOKEN_0!=null?((ConstantContext)_localctx).STRINGTOKEN_0.getText():null)));
				}
				break;
			case CHARTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(83); ((ConstantContext)_localctx).CHARTOKEN_0 = match(CHARTOKEN);
				((ConstantContext)_localctx)._constant =  builder.char_(chartoken((((ConstantContext)_localctx).CHARTOKEN_0!=null?((ConstantContext)_localctx).CHARTOKEN_0.getText():null)));
				}
				break;
			case CONSTRTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(85); ((ConstantContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((ConstantContext)_localctx)._constant =  builder.constr(constrtoken((((ConstantContext)_localctx).CONSTRTOKEN_0!=null?((ConstantContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;
			case INTTOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(87); ((ConstantContext)_localctx).INTTOKEN_0 = match(INTTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(inttoken((((ConstantContext)_localctx).INTTOKEN_0!=null?((ConstantContext)_localctx).INTTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(89); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(91); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case FLOATTOKEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(93); ((ConstantContext)_localctx).FLOATTOKEN_0 = match(FLOATTOKEN);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(97); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			setState(98); match(47);
			setState(99); ((DecllabeltypeContext)_localctx).type_1 = type(0);
			((DecllabeltypeContext)_localctx)._decllabeltype =  builder.declLabelType(idtoken((((DecllabeltypeContext)_localctx).IDTOKEN_0!=null?((DecllabeltypeContext)_localctx).IDTOKEN_0.getText():null)),(((DecllabeltypeContext)_localctx).type_1._type));
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
		public Token IDTOKEN_0;
		public Token CONSTRTOKEN_1;
		public TypeContext type_2;
		public DeclconstrtypeappendixContext declconstrtypeappendix;
		public List<DeclconstrtypeappendixContext> declconstrtypeappendix_3_list = new ArrayList<DeclconstrtypeappendixContext>();
		public DeclenumtypeappendixContext declenumtypeappendix;
		public List<DeclenumtypeappendixContext> declenumtypeappendix_2_list = new ArrayList<DeclenumtypeappendixContext>();
		public IdentContext ident_0;
		public DecllabeltypeContext decllabeltype_1;
		public DecllabeltypeContext decllabeltype;
		public List<DecllabeltypeContext> decllabeltype_1tail = new ArrayList<DecllabeltypeContext>();
		public DeclContext decl_0;
		public AnddeclContext anddecl;
		public List<AnddeclContext> anddecl_1_list = new ArrayList<AnddeclContext>();
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public DeclmonoContext declmono() {
			return getRuleContext(DeclmonoContext.class,0);
		}
		public List<DecllabeltypeContext> decllabeltype() {
			return getRuleContexts(DecllabeltypeContext.class);
		}
		public List<AnddeclContext> anddecl() {
			return getRuleContexts(AnddeclContext.class);
		}
		public RecdeclContext recdecl() {
			return getRuleContext(RecdeclContext.class,0);
		}
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
		public DecllabeltypeContext decllabeltype(int i) {
			return getRuleContext(DecllabeltypeContext.class,i);
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_decl);
		int _la;
		try {
			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); match(22);
				setState(103); match(10);
				setState(104); ((DeclContext)_localctx).recdecl_0 = recdecl();
				((DeclContext)_localctx)._decl =  builder.declRec((((DeclContext)_localctx).recdecl_0._recdecl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110); match(20);
				setState(111); ((DeclContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(112); match(6);
				setState(113); ((DeclContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(114); match(30);
				setState(115); ((DeclContext)_localctx).type_2 = type(0);
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==49) {
					{
					{
					setState(116); ((DeclContext)_localctx).declconstrtypeappendix = declconstrtypeappendix();
					((DeclContext)_localctx).declconstrtypeappendix_3_list.add(((DeclContext)_localctx).declconstrtypeappendix);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declNewConstrType(idtoken((((DeclContext)_localctx).IDTOKEN_0!=null?((DeclContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclContext)_localctx).CONSTRTOKEN_1!=null?((DeclContext)_localctx).CONSTRTOKEN_1.getText():null)),(((DeclContext)_localctx).type_2._type),lift("_declconstrtypeappendix", ((DeclContext)_localctx).declconstrtypeappendix_3_list));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124); match(20);
				setState(125); ((DeclContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(126); match(6);
				setState(127); ((DeclContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==49) {
					{
					{
					setState(128); ((DeclContext)_localctx).declenumtypeappendix = declenumtypeappendix();
					((DeclContext)_localctx).declenumtypeappendix_2_list.add(((DeclContext)_localctx).declenumtypeappendix);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declNewEnumType(idtoken((((DeclContext)_localctx).IDTOKEN_0!=null?((DeclContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclContext)_localctx).CONSTRTOKEN_1!=null?((DeclContext)_localctx).CONSTRTOKEN_1.getText():null)),lift("_declenumtypeappendix", ((DeclContext)_localctx).declenumtypeappendix_2_list));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(135); match(20);
				setState(136); ((DeclContext)_localctx).ident_0 = ident();
				setState(137); match(6);
				setState(138); match(3);
				{
				setState(139); ((DeclContext)_localctx).decllabeltype_1 = decllabeltype();
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(140); match(11);
					setState(141); ((DeclContext)_localctx).decllabeltype = decllabeltype();
					((DeclContext)_localctx).decllabeltype_1tail.add(((DeclContext)_localctx).decllabeltype);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(147); match(35);
				((DeclContext)_localctx)._decl =  builder.declRecordType((((DeclContext)_localctx).ident_0._ident),lift("_decllabeltype", ((DeclContext)_localctx).decllabeltype_1tail, ((DeclContext)_localctx).decllabeltype_1._decllabeltype));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(150); match(22);
				setState(151); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(154); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(155); ((DeclContext)_localctx).anddecl = anddecl();
					((DeclContext)_localctx).anddecl_1_list.add(((DeclContext)_localctx).anddecl);
					}
					}
					setState(158); 
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_patt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(165); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(166); ((PattContext)_localctx).patt_1 = patt(6);
				((PattContext)_localctx)._patt =  builder.pattConstrPatt(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt));
				}
				break;

			case 2:
				{
				setState(169); match(3);
				setState(170); ((PattContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(171); match(6);
				setState(172); ((PattContext)_localctx).patt_1 = patt(0);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(173); ((PattContext)_localctx).recordpattappendix = recordpattappendix();
					((PattContext)_localctx).recordpattappendix_2_list.add(((PattContext)_localctx).recordpattappendix);
					}
					}
					setState(178);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(179); match(35);
				((PattContext)_localctx)._patt =  builder.recordPatt(idtoken((((PattContext)_localctx).IDTOKEN_0!=null?((PattContext)_localctx).IDTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt),lift("_recordpattappendix", ((PattContext)_localctx).recordpattappendix_2_list));
				}
				break;

			case 3:
				{
				setState(182); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(185); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 5:
				{
				setState(187); match(9);
				setState(188); ((PattContext)_localctx).patt_0 = patt(0);
				setState(189); match(59);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 6:
				{
				setState(192); match(9);
				setState(193); ((PattContext)_localctx).patt_0 = patt(0);
				setState(194); match(47);
				setState(195); ((PattContext)_localctx).type_1 = type(0);
				setState(196); match(59);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 7:
				{
				setState(199); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 8:
				{
				setState(202); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((PattContext)_localctx)._patt =  builder.pattConstr(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(204); match(9);
				setState(205); ((PattContext)_localctx).patt_0 = patt(0);
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(206); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(209); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==11 );
				setState(211); match(59);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 10:
				{
				setState(214); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 11:
				{
				setState(217); match(48);
				setState(218); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(219); match(18);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 12:
				{
				setState(222); match(48);
				setState(223); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(224); match(18);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(241);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(239);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(229);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(230); match(49);
						setState(231); ((PattContext)_localctx).patt_1 = patt(9);
						((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).patt_1._patt));
						}
						break;

					case 2:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(234);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(235); match(29);
						setState(236); ((PattContext)_localctx).ident_1 = ident();
						((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
						}
						break;
					}
					} 
				}
				setState(243);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(244); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250); ((DeclorexpContext)_localctx).decl_0 = decl();
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
		enterRule(_localctx, 14, RULE_declconstrtypeappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); match(49);
			setState(256); ((DeclconstrtypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
			setState(257); match(30);
			setState(258); ((DeclconstrtypeappendixContext)_localctx).type_1 = type(0);
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
		enterRule(_localctx, 16, RULE_pattlist);
		try {
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(261); ((PattlistContext)_localctx).patt_0 = patt(0);
				((PattlistContext)_localctx)._pattlist =  builder.pattListSingle((((PattlistContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(265); match(11);
				setState(266); ((PattlistContext)_localctx).pattlist_1 = pattlist();
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
		enterRule(_localctx, 18, RULE_declenumtypeappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271); match(49);
			setState(272); ((DeclenumtypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 20, RULE_emptylist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
		enterRule(_localctx, 22, RULE_pattmatchsingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(279); match(44);
			setState(280); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			switch (_input.LA(1)) {
			case 9:
				{
				setState(284); match(9);
				setState(285); ((TypeContext)_localctx).type_0 = type(0);
				setState(286); match(59);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;
			case IDTOKEN:
				{
				setState(289); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			case 41:
				{
				setState(291); match(41);
				setState(292); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.varType(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(309);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(296);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(297); match(44);
						setState(298); ((TypeContext)_localctx).type_1 = type(2);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(301);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(303); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(302); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(305); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.tupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;
					}
					} 
				}
				setState(313);
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
		enterRule(_localctx, 26, RULE_headtaillistpatt);
		try {
			setState(322);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(315); match(5);
				setState(316); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
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
		enterRule(_localctx, 28, RULE_recordsingle);
		try {
			setState(335);
			switch (_input.LA(1)) {
			case 46:
				enterOuterAlt(_localctx, 1);
				{
				setState(324); match(46);
				setState(325); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(326); match(6);
				setState(327); ((RecordsingleContext)_localctx).exp_1 = exp(0);
				((RecordsingleContext)_localctx)._recordsingle =  builder.recordEntryMutableSingle(idtoken((((RecordsingleContext)_localctx).IDTOKEN_0!=null?((RecordsingleContext)_localctx).IDTOKEN_0.getText():null)),(((RecordsingleContext)_localctx).exp_1._exp));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(330); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(331); match(6);
				setState(332); ((RecordsingleContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 30, RULE_declmono);
		int _la;
		try {
			setState(352);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(338); match(6);
				setState(339); ((DeclmonoContext)_localctx).exp_1 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMono((((DeclmonoContext)_localctx).patt_0._patt),(((DeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(344); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(343); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(346); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 48) | (1L << CHARTOKEN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INTTOKEN - 65)) | (1L << (NULLTOKEN - 65)) | (1L << (STRINGTOKEN - 65)) | (1L << (EMPTYLISTTOKEN - 65)) | (1L << (FLOATTOKEN - 65)) | (1L << (WILDCARDTOKEN - 65)) | (1L << (BOOLTOKEN - 65)) | (1L << (IDTOKEN - 65)) | (1L << (CONSTRTOKEN - 65)))) != 0) );
				setState(348); match(6);
				setState(349); ((DeclmonoContext)_localctx).exp_2 = exp(0);
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
		enterRule(_localctx, 32, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354); ((LetExpContext)_localctx).decl_0 = decl();
			setState(355); match(57);
			setState(356); ((LetExpContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 34, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359); match(11);
			setState(360); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
		enterRule(_localctx, 36, RULE_declimpl);
		try {
			setState(372);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(363); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(364); match(17);
				setState(365); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(369); match(17);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(375); match(24);
				setState(376); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(379); match(9);
				setState(380); ((FunctionContext)_localctx).function_0 = function(0);
				setState(381); match(59);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(384); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(387); match(56);
				setState(388); ((FunctionContext)_localctx).function_0 = function(0);
				setState(389); match(58);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(392); match(1);
				setState(393); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(396); match(1);
				setState(397); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(408);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(402);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(403); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(410);
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
		enterRule(_localctx, 40, RULE_recanddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411); match(60);
			setState(412); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
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
		enterRule(_localctx, 42, RULE_recordpattappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415); match(11);
			setState(416); ((RecordpattappendixContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			setState(417); match(6);
			setState(418); ((RecordpattappendixContext)_localctx).patt_1 = patt(0);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(422); match(40);
				setState(423); ((ExpContext)_localctx).exp_0 = exp(36);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(426); ((ExpContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(427); ((ExpContext)_localctx).exp_1 = exp(28);
				((ExpContext)_localctx)._exp =  builder.constrExp(constrtoken((((ExpContext)_localctx).CONSTRTOKEN_0!=null?((ExpContext)_localctx).CONSTRTOKEN_0.getText():null)),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 3:
				{
				setState(430); match(61);
				setState(431); ((ExpContext)_localctx).exp_0 = exp(22);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(434); match(54);
				setState(435); ((ExpContext)_localctx).exp_0 = exp(21);
				((ExpContext)_localctx)._exp =  builder.floatNegateExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(438); match(62);
				setState(439); ((ExpContext)_localctx).exp_0 = exp(20);
				((ExpContext)_localctx)._exp =  builder.intUnarySub((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 6:
				{
				setState(442); match(36);
				setState(443); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(444); match(26);
				setState(445); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(446); match(55);
				setState(447); ((ExpContext)_localctx).exp_2 = exp(9);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 7:
				{
				setState(450); match(36);
				setState(451); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(452); match(26);
				setState(453); ((ExpContext)_localctx).exp_1 = exp(8);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 8:
				{
				setState(456); ((ExpContext)_localctx).EMPTYARRAYTOKEN_0 = match(EMPTYARRAYTOKEN);
				((ExpContext)_localctx)._exp =  builder.emptyArray(emptyarraytoken((((ExpContext)_localctx).EMPTYARRAYTOKEN_0!=null?((ExpContext)_localctx).EMPTYARRAYTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(458); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 10:
				{
				setState(461); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 11:
				{
				setState(464); match(9);
				setState(465); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(466); match(59);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 12:
				{
				setState(469); match(56);
				setState(470); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(471); match(58);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(474); match(9);
				setState(475); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(476); match(47);
				setState(477); ((ExpContext)_localctx).type_1 = type(0);
				setState(478); match(59);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 14:
				{
				setState(481); match(9);
				{
				setState(482); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(483); match(11);
					setState(484); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(490); match(59);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 15:
				{
				setState(493); match(48);
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
				setState(502); match(18);
				((ExpContext)_localctx)._exp =  builder.expList(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 16:
				{
				setState(505); match(38);
				setState(506); ((ExpContext)_localctx).exparray_0 = exparray();
				setState(508);
				_la = _input.LA(1);
				if (_la==34) {
					{
					setState(507); match(34);
					}
				}

				setState(510); match(21);
				((ExpContext)_localctx)._exp =  builder.arrayMulti((((ExpContext)_localctx).exparray_0._exparray));
				}
				break;

			case 17:
				{
				setState(513); match(38);
				setState(514); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(516);
				_la = _input.LA(1);
				if (_la==34) {
					{
					setState(515); match(34);
					}
				}

				setState(518); match(21);
				((ExpContext)_localctx)._exp =  builder.arraySingle((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 18:
				{
				setState(521); match(3);
				{
				setState(522); ((ExpContext)_localctx).recordsingle_0 = recordsingle();
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(523); match(11);
					setState(524); ((ExpContext)_localctx).recordsingle = recordsingle();
					((ExpContext)_localctx).recordsingle_0tail.add(((ExpContext)_localctx).recordsingle);
					}
					}
					setState(529);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(530); match(35);
				((ExpContext)_localctx)._exp =  builder.recordExp(lift("_recordsingle", ((ExpContext)_localctx).recordsingle_0tail, ((ExpContext)_localctx).recordsingle_0._recordsingle));
				}
				break;

			case 19:
				{
				setState(533); match(2);
				setState(534); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(535); match(8);
				setState(536); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(537); match(13);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 20:
				{
				setState(540); match(7);
				setState(541); ((ExpContext)_localctx).ident_0 = ident();
				setState(542); match(6);
				setState(543); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(544); match(25);
				setState(545); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(546); match(8);
				setState(547); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(548); match(13);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 21:
				{
				setState(551); match(7);
				setState(552); ((ExpContext)_localctx).ident_0 = ident();
				setState(553); match(6);
				setState(554); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(555); match(45);
				setState(556); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(557); match(8);
				setState(558); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(559); match(13);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 22:
				{
				setState(562); match(23);
				setState(563); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(564); match(50);
				setState(565); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 23:
				{
				setState(568); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 24:
				{
				setState(571); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(643);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(641);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(576);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(577); match(5);
						setState(578); ((ExpContext)_localctx).exp_1 = exp(27);
						((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(581);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(582); match(14);
						setState(583); ((ExpContext)_localctx).exp_1 = exp(20);
						((ExpContext)_localctx)._exp =  builder.intMod((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(586);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(587);
						((ExpContext)_localctx).op_1512 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 19) | (1L << 28) | (1L << 33) | (1L << 42))) != 0)) ) {
							((ExpContext)_localctx).op_1512 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(588); ((ExpContext)_localctx).exp_1 = exp(19);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/") ? builder.intDivide(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*.") ? builder.floatMultiplyExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*") ? builder.intMultiply(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/.") ? builder.floatDivideExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(591);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(592);
						((ExpContext)_localctx).op_1511 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 27) | (1L << 52) | (1L << 54) | (1L << 62))) != 0)) ) {
							((ExpContext)_localctx).op_1511 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(593); ((ExpContext)_localctx).exp_1 = exp(18);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+.") ? builder.floatAddExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-.") ? builder.floatSubtractExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+") ? builder.intAdd(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-") ? builder.intSub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(596);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(597);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 15) | (1L << 16) | (1L << 37) | (1L << 51))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(598); ((ExpContext)_localctx).exp_1 = exp(17);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.smallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.greaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.smaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.equal(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.greater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(601);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(602); match(43);
						setState(603); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						setState(604); match(12);
						setState(605); ((ExpContext)_localctx).exp_2 = exp(15);
						((ExpContext)_localctx)._exp =  builder.recordAssignExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(608);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(609); match(31);
						setState(610); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(611); match(59);
						setState(612); match(12);
						setState(613); ((ExpContext)_localctx).exp_2 = exp(13);
						((ExpContext)_localctx)._exp =  builder.arrayAssign((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(616);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(617);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==39) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(618); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(621);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(622);
						_la = _input.LA(1);
						if ( !(_la==32 || _la==53) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(623); ((ExpContext)_localctx).exp_1 = exp(11);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(626);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(627); match(34);
						setState(628); ((ExpContext)_localctx).exp_1 = exp(4);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(631);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(632); match(43);
						setState(633); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						((ExpContext)_localctx)._exp =  builder.recordSelectExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)));
						}
						break;

					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(635);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(636); match(31);
						setState(637); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(638); match(59);
						((ExpContext)_localctx)._exp =  builder.arraySelect((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(645);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 46, RULE_decllabelsandvariants);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(646); ((DecllabelsandvariantsContext)_localctx).ident_0 = ident();
			setState(647); match(6);
			setState(648); ((DecllabelsandvariantsContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
			setState(649); match(30);
			setState(650); ((DecllabelsandvariantsContext)_localctx).type_2 = type(0);
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
		enterRule(_localctx, 48, RULE_anddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(653); match(60);
			setState(654); ((AnddeclContext)_localctx).declmono_0 = declmono();
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
		enterRule(_localctx, 50, RULE_varianttype);
		try {
			setState(664);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(658); match(30);
				setState(659); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(662); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 52, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(666); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(669); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 48) | (1L << CHARTOKEN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INTTOKEN - 65)) | (1L << (NULLTOKEN - 65)) | (1L << (STRINGTOKEN - 65)) | (1L << (EMPTYLISTTOKEN - 65)) | (1L << (FLOATTOKEN - 65)) | (1L << (WILDCARDTOKEN - 65)) | (1L << (BOOLTOKEN - 65)) | (1L << (IDTOKEN - 65)) | (1L << (CONSTRTOKEN - 65)))) != 0) );
			setState(671); match(44);
			setState(672); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 54, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675); ((ProgContext)_localctx).declimpl_0 = declimpl();
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
		enterRule(_localctx, 56, RULE_exparray);
		try {
			setState(688);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(679); match(34);
				setState(680); ((ExparrayContext)_localctx).exparray_1 = exparray();
				((ExparrayContext)_localctx)._exparray =  builder.innerExpArrayMulti((((ExparrayContext)_localctx).exp_0._exp),(((ExparrayContext)_localctx).exparray_1._exparray));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(684); match(34);
				setState(685); ((ExparrayContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 58, RULE_tupletypelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(690); match(42);
			setState(691); ((TupletypelistContext)_localctx).type_0 = type(0);
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
		enterRule(_localctx, 60, RULE_recdeclmono);
		int _la;
		try {
			setState(718);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(695); match(6);
				setState(696); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(701); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(700); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(703); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 48) | (1L << CHARTOKEN))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (INTTOKEN - 65)) | (1L << (NULLTOKEN - 65)) | (1L << (STRINGTOKEN - 65)) | (1L << (EMPTYLISTTOKEN - 65)) | (1L << (FLOATTOKEN - 65)) | (1L << (WILDCARDTOKEN - 65)) | (1L << (BOOLTOKEN - 65)) | (1L << (IDTOKEN - 65)) | (1L << (CONSTRTOKEN - 65)))) != 0) );
				setState(705); match(6);
				setState(706); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentPattsExp((((RecdeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((RecdeclmonoContext)_localctx).patt_1_list),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(709); match(9);
				setState(710); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(711); match(47);
				setState(712); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(713); match(59);
				setState(714); match(6);
				setState(715); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
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
		enterRule(_localctx, 62, RULE_recdecl);
		int _la;
		try {
			setState(731);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(720); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(722); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(721); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(724); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==60 );
				((RecdeclContext)_localctx)._recdecl =  builder.recAndDecl((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono),lift("_recanddecl", ((RecdeclContext)_localctx).recanddecl_1_list));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(728); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
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

		case 12: return type_sempred((TypeContext)_localctx, predIndex);

		case 19: return function_sempred((FunctionContext)_localctx, predIndex);

		case 22: return exp_sempred((ExpContext)_localctx, predIndex);
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
		case 4: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 1);

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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3L\u02e0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2O\n\2\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3b\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\7\5x\n\5\f\5\16\5{\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0084"+
		"\n\5\f\5\16\5\u0087\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u0091\n\5"+
		"\f\5\16\5\u0094\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\6\5\u009f\n\5"+
		"\r\5\16\5\u00a0\3\5\3\5\5\5\u00a5\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\7\6\u00b1\n\6\f\6\16\6\u00b4\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\6\6\u00d2\n\6\r\6\16\6\u00d3\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00e6\n\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6\u00f2\n\6\f\6\16\6\u00f5\13\6\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u0100\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\5\n\u0110\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u0129\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\6\16\u0132\n\16"+
		"\r\16\16\16\u0133\3\16\3\16\7\16\u0138\n\16\f\16\16\16\u013b\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0145\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0152\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\6\21\u015b\n\21\r\21\16\21\u015c\3\21\3\21\3\21\3\21\5"+
		"\21\u0163\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0177\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0193\n\25\3\25\3\25\3\25"+
		"\3\25\7\25\u0199\n\25\f\25\16\25\u019c\13\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30"+
		"\u01e8\n\30\f\30\16\30\u01eb\13\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u01f4\n\30\f\30\16\30\u01f7\13\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u01ff\n\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0207\n\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\7\30\u0210\n\30\f\30\16\30\u0213\13\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u0241\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u0284\n\30\f\30\16\30\u0287\13\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u029b"+
		"\n\33\3\34\6\34\u029e\n\34\r\34\16\34\u029f\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u02b3"+
		"\n\36\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \6 \u02c0\n \r \16 \u02c1"+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u02d1\n \3!\3!\6!\u02d5\n!"+
		"\r!\16!\u02d6\3!\3!\3!\3!\3!\5!\u02de\n!\3!\2\6\n\32(.\"\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\7\6\2\25\25\36\36"+
		"##,,\6\2\35\35\66\6688@@\6\2\b\b\21\22\'\'\65\65\4\2\6\6))\4\2\"\"\67"+
		"\67\u0323\2N\3\2\2\2\4a\3\2\2\2\6c\3\2\2\2\b\u00a4\3\2\2\2\n\u00e5\3\2"+
		"\2\2\f\u00f6\3\2\2\2\16\u00ff\3\2\2\2\20\u0101\3\2\2\2\22\u010f\3\2\2"+
		"\2\24\u0111\3\2\2\2\26\u0115\3\2\2\2\30\u0118\3\2\2\2\32\u0128\3\2\2\2"+
		"\34\u0144\3\2\2\2\36\u0151\3\2\2\2 \u0162\3\2\2\2\"\u0164\3\2\2\2$\u0169"+
		"\3\2\2\2&\u0176\3\2\2\2(\u0192\3\2\2\2*\u019d\3\2\2\2,\u01a1\3\2\2\2."+
		"\u0240\3\2\2\2\60\u0288\3\2\2\2\62\u028f\3\2\2\2\64\u029a\3\2\2\2\66\u029d"+
		"\3\2\2\28\u02a5\3\2\2\2:\u02b2\3\2\2\2<\u02b4\3\2\2\2>\u02d0\3\2\2\2@"+
		"\u02dd\3\2\2\2BC\7\63\2\2CD\5\2\2\2DE\b\2\1\2EO\3\2\2\2FG\5\30\r\2GH\7"+
		"\63\2\2HI\5\2\2\2IJ\b\2\1\2JO\3\2\2\2KL\5\30\r\2LM\b\2\1\2MO\3\2\2\2N"+
		"B\3\2\2\2NF\3\2\2\2NK\3\2\2\2O\3\3\2\2\2PQ\5\26\f\2QR\b\3\1\2Rb\3\2\2"+
		"\2ST\7E\2\2Tb\b\3\1\2UV\7A\2\2Vb\b\3\1\2WX\7L\2\2Xb\b\3\1\2YZ\7C\2\2Z"+
		"b\b\3\1\2[\\\7D\2\2\\b\b\3\1\2]^\7J\2\2^b\b\3\1\2_`\7H\2\2`b\b\3\1\2a"+
		"P\3\2\2\2aS\3\2\2\2aU\3\2\2\2aW\3\2\2\2aY\3\2\2\2a[\3\2\2\2a]\3\2\2\2"+
		"a_\3\2\2\2b\5\3\2\2\2cd\7K\2\2de\7\61\2\2ef\5\32\16\2fg\b\4\1\2g\7\3\2"+
		"\2\2hi\7\30\2\2ij\7\f\2\2jk\5@!\2kl\b\5\1\2l\u00a5\3\2\2\2mn\5 \21\2n"+
		"o\b\5\1\2o\u00a5\3\2\2\2pq\7\26\2\2qr\7K\2\2rs\7\b\2\2st\7L\2\2tu\7 \2"+
		"\2uy\5\32\16\2vx\5\20\t\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2z|\3"+
		"\2\2\2{y\3\2\2\2|}\b\5\1\2}\u00a5\3\2\2\2~\177\7\26\2\2\177\u0080\7K\2"+
		"\2\u0080\u0081\7\b\2\2\u0081\u0085\7L\2\2\u0082\u0084\5\24\13\2\u0083"+
		"\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u00a5\b\5\1\2\u0089"+
		"\u008a\7\26\2\2\u008a\u008b\5\f\7\2\u008b\u008c\7\b\2\2\u008c\u008d\7"+
		"\5\2\2\u008d\u0092\5\6\4\2\u008e\u008f\7\r\2\2\u008f\u0091\5\6\4\2\u0090"+
		"\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\7%\2\2\u0096"+
		"\u0097\b\5\1\2\u0097\u00a5\3\2\2\2\u0098\u0099\7\30\2\2\u0099\u009a\5"+
		"\b\5\2\u009a\u009b\b\5\1\2\u009b\u00a5\3\2\2\2\u009c\u009e\5 \21\2\u009d"+
		"\u009f\5\62\32\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\5\1\2\u00a3"+
		"\u00a5\3\2\2\2\u00a4h\3\2\2\2\u00a4m\3\2\2\2\u00a4p\3\2\2\2\u00a4~\3\2"+
		"\2\2\u00a4\u0089\3\2\2\2\u00a4\u0098\3\2\2\2\u00a4\u009c\3\2\2\2\u00a5"+
		"\t\3\2\2\2\u00a6\u00a7\b\6\1\2\u00a7\u00a8\7L\2\2\u00a8\u00a9\5\n\6\b"+
		"\u00a9\u00aa\b\6\1\2\u00aa\u00e6\3\2\2\2\u00ab\u00ac\7\5\2\2\u00ac\u00ad"+
		"\7K\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00b2\5\n\6\2\u00af\u00b1\5,\27\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7%\2\2\u00b6"+
		"\u00b7\b\6\1\2\u00b7\u00e6\3\2\2\2\u00b8\u00b9\5\f\7\2\u00b9\u00ba\b\6"+
		"\1\2\u00ba\u00e6\3\2\2\2\u00bb\u00bc\7I\2\2\u00bc\u00e6\b\6\1\2\u00bd"+
		"\u00be\7\13\2\2\u00be\u00bf\5\n\6\2\u00bf\u00c0\7=\2\2\u00c0\u00c1\b\6"+
		"\1\2\u00c1\u00e6\3\2\2\2\u00c2\u00c3\7\13\2\2\u00c3\u00c4\5\n\6\2\u00c4"+
		"\u00c5\7\61\2\2\u00c5\u00c6\5\32\16\2\u00c6\u00c7\7=\2\2\u00c7\u00c8\b"+
		"\6\1\2\u00c8\u00e6\3\2\2\2\u00c9\u00ca\5\4\3\2\u00ca\u00cb\b\6\1\2\u00cb"+
		"\u00e6\3\2\2\2\u00cc\u00cd\7L\2\2\u00cd\u00e6\b\6\1\2\u00ce\u00cf\7\13"+
		"\2\2\u00cf\u00d1\5\n\6\2\u00d0\u00d2\5$\23\2\u00d1\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\7=\2\2\u00d6\u00d7\b\6\1\2\u00d7\u00e6\3\2\2\2\u00d8"+
		"\u00d9\5\26\f\2\u00d9\u00da\b\6\1\2\u00da\u00e6\3\2\2\2\u00db\u00dc\7"+
		"\62\2\2\u00dc\u00dd\5\22\n\2\u00dd\u00de\7\24\2\2\u00de\u00df\b\6\1\2"+
		"\u00df\u00e6\3\2\2\2\u00e0\u00e1\7\62\2\2\u00e1\u00e2\5\34\17\2\u00e2"+
		"\u00e3\7\24\2\2\u00e3\u00e4\b\6\1\2\u00e4\u00e6\3\2\2\2\u00e5\u00a6\3"+
		"\2\2\2\u00e5\u00ab\3\2\2\2\u00e5\u00b8\3\2\2\2\u00e5\u00bb\3\2\2\2\u00e5"+
		"\u00bd\3\2\2\2\u00e5\u00c2\3\2\2\2\u00e5\u00c9\3\2\2\2\u00e5\u00cc\3\2"+
		"\2\2\u00e5\u00ce\3\2\2\2\u00e5\u00d8\3\2\2\2\u00e5\u00db\3\2\2\2\u00e5"+
		"\u00e0\3\2\2\2\u00e6\u00f3\3\2\2\2\u00e7\u00e8\f\n\2\2\u00e8\u00e9\7\63"+
		"\2\2\u00e9\u00ea\5\n\6\13\u00ea\u00eb\b\6\1\2\u00eb\u00f2\3\2\2\2\u00ec"+
		"\u00ed\f\r\2\2\u00ed\u00ee\7\37\2\2\u00ee\u00ef\5\f\7\2\u00ef\u00f0\b"+
		"\6\1\2\u00f0\u00f2\3\2\2\2\u00f1\u00e7\3\2\2\2\u00f1\u00ec\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\13\3\2\2"+
		"\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7K\2\2\u00f7\u00f8\b\7\1\2\u00f8\r"+
		"\3\2\2\2\u00f9\u00fa\5.\30\2\u00fa\u00fb\b\b\1\2\u00fb\u0100\3\2\2\2\u00fc"+
		"\u00fd\5\b\5\2\u00fd\u00fe\b\b\1\2\u00fe\u0100\3\2\2\2\u00ff\u00f9\3\2"+
		"\2\2\u00ff\u00fc\3\2\2\2\u0100\17\3\2\2\2\u0101\u0102\7\63\2\2\u0102\u0103"+
		"\7L\2\2\u0103\u0104\7 \2\2\u0104\u0105\5\32\16\2\u0105\u0106\b\t\1\2\u0106"+
		"\21\3\2\2\2\u0107\u0108\5\n\6\2\u0108\u0109\b\n\1\2\u0109\u0110\3\2\2"+
		"\2\u010a\u010b\5\n\6\2\u010b\u010c\7\r\2\2\u010c\u010d\5\22\n\2\u010d"+
		"\u010e\b\n\1\2\u010e\u0110\3\2\2\2\u010f\u0107\3\2\2\2\u010f\u010a\3\2"+
		"\2\2\u0110\23\3\2\2\2\u0111\u0112\7\63\2\2\u0112\u0113\7L\2\2\u0113\u0114"+
		"\b\13\1\2\u0114\25\3\2\2\2\u0115\u0116\7F\2\2\u0116\u0117\b\f\1\2\u0117"+
		"\27\3\2\2\2\u0118\u0119\5\n\6\2\u0119\u011a\7.\2\2\u011a\u011b\5.\30\2"+
		"\u011b\u011c\b\r\1\2\u011c\31\3\2\2\2\u011d\u011e\b\16\1\2\u011e\u011f"+
		"\7\13\2\2\u011f\u0120\5\32\16\2\u0120\u0121\7=\2\2\u0121\u0122\b\16\1"+
		"\2\u0122\u0129\3\2\2\2\u0123\u0124\7K\2\2\u0124\u0129\b\16\1\2\u0125\u0126"+
		"\7+\2\2\u0126\u0127\7K\2\2\u0127\u0129\b\16\1\2\u0128\u011d\3\2\2\2\u0128"+
		"\u0123\3\2\2\2\u0128\u0125\3\2\2\2\u0129\u0139\3\2\2\2\u012a\u012b\f\3"+
		"\2\2\u012b\u012c\7.\2\2\u012c\u012d\5\32\16\4\u012d\u012e\b\16\1\2\u012e"+
		"\u0138\3\2\2\2\u012f\u0131\f\7\2\2\u0130\u0132\5<\37\2\u0131\u0130\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0136\b\16\1\2\u0136\u0138\3\2\2\2\u0137\u012a\3"+
		"\2\2\2\u0137\u012f\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\33\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\5\n\6"+
		"\2\u013d\u013e\7\7\2\2\u013e\u013f\5\34\17\2\u013f\u0140\b\17\1\2\u0140"+
		"\u0145\3\2\2\2\u0141\u0142\5\n\6\2\u0142\u0143\b\17\1\2\u0143\u0145\3"+
		"\2\2\2\u0144\u013c\3\2\2\2\u0144\u0141\3\2\2\2\u0145\35\3\2\2\2\u0146"+
		"\u0147\7\60\2\2\u0147\u0148\7K\2\2\u0148\u0149\7\b\2\2\u0149\u014a\5."+
		"\30\2\u014a\u014b\b\20\1\2\u014b\u0152\3\2\2\2\u014c\u014d\7K\2\2\u014d"+
		"\u014e\7\b\2\2\u014e\u014f\5.\30\2\u014f\u0150\b\20\1\2\u0150\u0152\3"+
		"\2\2\2\u0151\u0146\3\2\2\2\u0151\u014c\3\2\2\2\u0152\37\3\2\2\2\u0153"+
		"\u0154\5\n\6\2\u0154\u0155\7\b\2\2\u0155\u0156\5.\30\2\u0156\u0157\b\21"+
		"\1\2\u0157\u0163\3\2\2\2\u0158\u015a\5\f\7\2\u0159\u015b\5\n\6\2\u015a"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015a\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u015e\3\2\2\2\u015e\u015f\7\b\2\2\u015f\u0160\5.\30\2\u0160"+
		"\u0161\b\21\1\2\u0161\u0163\3\2\2\2\u0162\u0153\3\2\2\2\u0162\u0158\3"+
		"\2\2\2\u0163!\3\2\2\2\u0164\u0165\5\b\5\2\u0165\u0166\7;\2\2\u0166\u0167"+
		"\5.\30\2\u0167\u0168\b\22\1\2\u0168#\3\2\2\2\u0169\u016a\7\r\2\2\u016a"+
		"\u016b\5\n\6\2\u016b\u016c\b\23\1\2\u016c%\3\2\2\2\u016d\u016e\5\16\b"+
		"\2\u016e\u016f\7\23\2\2\u016f\u0170\5&\24\2\u0170\u0171\b\24\1\2\u0171"+
		"\u0177\3\2\2\2\u0172\u0173\5\16\b\2\u0173\u0174\7\23\2\2\u0174\u0175\b"+
		"\24\1\2\u0175\u0177\3\2\2\2\u0176\u016d\3\2\2\2\u0176\u0172\3\2\2\2\u0177"+
		"\'\3\2\2\2\u0178\u0179\b\25\1\2\u0179\u017a\7\32\2\2\u017a\u017b\5\2\2"+
		"\2\u017b\u017c\b\25\1\2\u017c\u0193\3\2\2\2\u017d\u017e\7\13\2\2\u017e"+
		"\u017f\5(\25\2\u017f\u0180\7=\2\2\u0180\u0181\b\25\1\2\u0181\u0193\3\2"+
		"\2\2\u0182\u0183\5\f\7\2\u0183\u0184\b\25\1\2\u0184\u0193\3\2\2\2\u0185"+
		"\u0186\7:\2\2\u0186\u0187\5(\25\2\u0187\u0188\7<\2\2\u0188\u0189\b\25"+
		"\1\2\u0189\u0193\3\2\2\2\u018a\u018b\7\3\2\2\u018b\u018c\5\30\r\2\u018c"+
		"\u018d\b\25\1\2\u018d\u0193\3\2\2\2\u018e\u018f\7\3\2\2\u018f\u0190\5"+
		"\66\34\2\u0190\u0191\b\25\1\2\u0191\u0193\3\2\2\2\u0192\u0178\3\2\2\2"+
		"\u0192\u017d\3\2\2\2\u0192\u0182\3\2\2\2\u0192\u0185\3\2\2\2\u0192\u018a"+
		"\3\2\2\2\u0192\u018e\3\2\2\2\u0193\u019a\3\2\2\2\u0194\u0195\f\6\2\2\u0195"+
		"\u0196\5.\30\2\u0196\u0197\b\25\1\2\u0197\u0199\3\2\2\2\u0198\u0194\3"+
		"\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b"+
		")\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7>\2\2\u019e\u019f\5> \2\u019f"+
		"\u01a0\b\26\1\2\u01a0+\3\2\2\2\u01a1\u01a2\7\r\2\2\u01a2\u01a3\7K\2\2"+
		"\u01a3\u01a4\7\b\2\2\u01a4\u01a5\5\n\6\2\u01a5\u01a6\b\27\1\2\u01a6-\3"+
		"\2\2\2\u01a7\u01a8\b\30\1\2\u01a8\u01a9\7*\2\2\u01a9\u01aa\5.\30&\u01aa"+
		"\u01ab\b\30\1\2\u01ab\u0241\3\2\2\2\u01ac\u01ad\7L\2\2\u01ad\u01ae\5."+
		"\30\36\u01ae\u01af\b\30\1\2\u01af\u0241\3\2\2\2\u01b0\u01b1\7?\2\2\u01b1"+
		"\u01b2\5.\30\30\u01b2\u01b3\b\30\1\2\u01b3\u0241\3\2\2\2\u01b4\u01b5\7"+
		"8\2\2\u01b5\u01b6\5.\30\27\u01b6\u01b7\b\30\1\2\u01b7\u0241\3\2\2\2\u01b8"+
		"\u01b9\7@\2\2\u01b9\u01ba\5.\30\26\u01ba\u01bb\b\30\1\2\u01bb\u0241\3"+
		"\2\2\2\u01bc\u01bd\7&\2\2\u01bd\u01be\5.\30\2\u01be\u01bf\7\34\2\2\u01bf"+
		"\u01c0\5.\30\2\u01c0\u01c1\79\2\2\u01c1\u01c2\5.\30\13\u01c2\u01c3\b\30"+
		"\1\2\u01c3\u0241\3\2\2\2\u01c4\u01c5\7&\2\2\u01c5\u01c6\5.\30\2\u01c6"+
		"\u01c7\7\34\2\2\u01c7\u01c8\5.\30\n\u01c8\u01c9\b\30\1\2\u01c9\u0241\3"+
		"\2\2\2\u01ca\u01cb\7G\2\2\u01cb\u0241\b\30\1\2\u01cc\u01cd\5\f\7\2\u01cd"+
		"\u01ce\b\30\1\2\u01ce\u0241\3\2\2\2\u01cf\u01d0\5\4\3\2\u01d0\u01d1\b"+
		"\30\1\2\u01d1\u0241\3\2\2\2\u01d2\u01d3\7\13\2\2\u01d3\u01d4\5.\30\2\u01d4"+
		"\u01d5\7=\2\2\u01d5\u01d6\b\30\1\2\u01d6\u0241\3\2\2\2\u01d7\u01d8\7:"+
		"\2\2\u01d8\u01d9\5.\30\2\u01d9\u01da\7<\2\2\u01da\u01db\b\30\1\2\u01db"+
		"\u0241\3\2\2\2\u01dc\u01dd\7\13\2\2\u01dd\u01de\5.\30\2\u01de\u01df\7"+
		"\61\2\2\u01df\u01e0\5\32\16\2\u01e0\u01e1\7=\2\2\u01e1\u01e2\b\30\1\2"+
		"\u01e2\u0241\3\2\2\2\u01e3\u01e4\7\13\2\2\u01e4\u01e9\5.\30\2\u01e5\u01e6"+
		"\7\r\2\2\u01e6\u01e8\5.\30\2\u01e7\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01ec\u01ed\7=\2\2\u01ed\u01ee\b\30\1\2\u01ee\u0241\3\2\2\2\u01ef"+
		"\u01f0\7\62\2\2\u01f0\u01f5\5.\30\2\u01f1\u01f2\7\r\2\2\u01f2\u01f4\5"+
		".\30\2\u01f3\u01f1\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\7\24"+
		"\2\2\u01f9\u01fa\b\30\1\2\u01fa\u0241\3\2\2\2\u01fb\u01fc\7(\2\2\u01fc"+
		"\u01fe\5:\36\2\u01fd\u01ff\7$\2\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2"+
		"\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\7\27\2\2\u0201\u0202\b\30\1\2\u0202"+
		"\u0241\3\2\2\2\u0203\u0204\7(\2\2\u0204\u0206\5.\30\2\u0205\u0207\7$\2"+
		"\2\u0206\u0205\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209"+
		"\7\27\2\2\u0209\u020a\b\30\1\2\u020a\u0241\3\2\2\2\u020b\u020c\7\5\2\2"+
		"\u020c\u0211\5\36\20\2\u020d\u020e\7\r\2\2\u020e\u0210\5\36\20\2\u020f"+
		"\u020d\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0214\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215\7%\2\2\u0215"+
		"\u0216\b\30\1\2\u0216\u0241\3\2\2\2\u0217\u0218\7\4\2\2\u0218\u0219\5"+
		".\30\2\u0219\u021a\7\n\2\2\u021a\u021b\5.\30\2\u021b\u021c\7\17\2\2\u021c"+
		"\u021d\b\30\1\2\u021d\u0241\3\2\2\2\u021e\u021f\7\t\2\2\u021f\u0220\5"+
		"\f\7\2\u0220\u0221\7\b\2\2\u0221\u0222\5.\30\2\u0222\u0223\7\33\2\2\u0223"+
		"\u0224\5.\30\2\u0224\u0225\7\n\2\2\u0225\u0226\5.\30\2\u0226\u0227\7\17"+
		"\2\2\u0227\u0228\b\30\1\2\u0228\u0241\3\2\2\2\u0229\u022a\7\t\2\2\u022a"+
		"\u022b\5\f\7\2\u022b\u022c\7\b\2\2\u022c\u022d\5.\30\2\u022d\u022e\7/"+
		"\2\2\u022e\u022f\5.\30\2\u022f\u0230\7\n\2\2\u0230\u0231\5.\30\2\u0231"+
		"\u0232\7\17\2\2\u0232\u0233\b\30\1\2\u0233\u0241\3\2\2\2\u0234\u0235\7"+
		"\31\2\2\u0235\u0236\5.\30\2\u0236\u0237\7\64\2\2\u0237\u0238\5\2\2\2\u0238"+
		"\u0239\b\30\1\2\u0239\u0241\3\2\2\2\u023a\u023b\5(\25\2\u023b\u023c\b"+
		"\30\1\2\u023c\u0241\3\2\2\2\u023d\u023e\5\"\22\2\u023e\u023f\b\30\1\2"+
		"\u023f\u0241\3\2\2\2\u0240\u01a7\3\2\2\2\u0240\u01ac\3\2\2\2\u0240\u01b0"+
		"\3\2\2\2\u0240\u01b4\3\2\2\2\u0240\u01b8\3\2\2\2\u0240\u01bc\3\2\2\2\u0240"+
		"\u01c4\3\2\2\2\u0240\u01ca\3\2\2\2\u0240\u01cc\3\2\2\2\u0240\u01cf\3\2"+
		"\2\2\u0240\u01d2\3\2\2\2\u0240\u01d7\3\2\2\2\u0240\u01dc\3\2\2\2\u0240"+
		"\u01e3\3\2\2\2\u0240\u01ef\3\2\2\2\u0240\u01fb\3\2\2\2\u0240\u0203\3\2"+
		"\2\2\u0240\u020b\3\2\2\2\u0240\u0217\3\2\2\2\u0240\u021e\3\2\2\2\u0240"+
		"\u0229\3\2\2\2\u0240\u0234\3\2\2\2\u0240\u023a\3\2\2\2\u0240\u023d\3\2"+
		"\2\2\u0241\u0285\3\2\2\2\u0242\u0243\f\35\2\2\u0243\u0244\7\7\2\2\u0244"+
		"\u0245\5.\30\35\u0245\u0246\b\30\1\2\u0246\u0284\3\2\2\2\u0247\u0248\f"+
		"\25\2\2\u0248\u0249\7\20\2\2\u0249\u024a\5.\30\26\u024a\u024b\b\30\1\2"+
		"\u024b\u0284\3\2\2\2\u024c\u024d\f\24\2\2\u024d\u024e\t\2\2\2\u024e\u024f"+
		"\5.\30\25\u024f\u0250\b\30\1\2\u0250\u0284\3\2\2\2\u0251\u0252\f\23\2"+
		"\2\u0252\u0253\t\3\2\2\u0253\u0254\5.\30\24\u0254\u0255\b\30\1\2\u0255"+
		"\u0284\3\2\2\2\u0256\u0257\f\22\2\2\u0257\u0258\t\4\2\2\u0258\u0259\5"+
		".\30\23\u0259\u025a\b\30\1\2\u025a\u0284\3\2\2\2\u025b\u025c\f\20\2\2"+
		"\u025c\u025d\7-\2\2\u025d\u025e\7K\2\2\u025e\u025f\7\16\2\2\u025f\u0260"+
		"\5.\30\21\u0260\u0261\b\30\1\2\u0261\u0284\3\2\2\2\u0262\u0263\f\16\2"+
		"\2\u0263\u0264\7!\2\2\u0264\u0265\5.\30\2\u0265\u0266\7=\2\2\u0266\u0267"+
		"\7\16\2\2\u0267\u0268\5.\30\17\u0268\u0269\b\30\1\2\u0269\u0284\3\2\2"+
		"\2\u026a\u026b\f\r\2\2\u026b\u026c\t\5\2\2\u026c\u026d\5.\30\16\u026d"+
		"\u026e\b\30\1\2\u026e\u0284\3\2\2\2\u026f\u0270\f\f\2\2\u0270\u0271\t"+
		"\6\2\2\u0271\u0272\5.\30\r\u0272\u0273\b\30\1\2\u0273\u0284\3\2\2\2\u0274"+
		"\u0275\f\6\2\2\u0275\u0276\7$\2\2\u0276\u0277\5.\30\6\u0277\u0278\b\30"+
		"\1\2\u0278\u0284\3\2\2\2\u0279\u027a\f\21\2\2\u027a\u027b\7-\2\2\u027b"+
		"\u027c\7K\2\2\u027c\u0284\b\30\1\2\u027d\u027e\f\17\2\2\u027e\u027f\7"+
		"!\2\2\u027f\u0280\5.\30\2\u0280\u0281\7=\2\2\u0281\u0282\b\30\1\2\u0282"+
		"\u0284\3\2\2\2\u0283\u0242\3\2\2\2\u0283\u0247\3\2\2\2\u0283\u024c\3\2"+
		"\2\2\u0283\u0251\3\2\2\2\u0283\u0256\3\2\2\2\u0283\u025b\3\2\2\2\u0283"+
		"\u0262\3\2\2\2\u0283\u026a\3\2\2\2\u0283\u026f\3\2\2\2\u0283\u0274\3\2"+
		"\2\2\u0283\u0279\3\2\2\2\u0283\u027d\3\2\2\2\u0284\u0287\3\2\2\2\u0285"+
		"\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286/\3\2\2\2\u0287\u0285\3\2\2\2"+
		"\u0288\u0289\5\f\7\2\u0289\u028a\7\b\2\2\u028a\u028b\7K\2\2\u028b\u028c"+
		"\7 \2\2\u028c\u028d\5\32\16\2\u028d\u028e\b\31\1\2\u028e\61\3\2\2\2\u028f"+
		"\u0290\7>\2\2\u0290\u0291\5 \21\2\u0291\u0292\b\32\1\2\u0292\63\3\2\2"+
		"\2\u0293\u0294\7L\2\2\u0294\u0295\7 \2\2\u0295\u0296\5\32\16\2\u0296\u0297"+
		"\b\33\1\2\u0297\u029b\3\2\2\2\u0298\u0299\7L\2\2\u0299\u029b\b\33\1\2"+
		"\u029a\u0293\3\2\2\2\u029a\u0298\3\2\2\2\u029b\65\3\2\2\2\u029c\u029e"+
		"\5\n\6\2\u029d\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u029d\3\2\2\2\u029f"+
		"\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\7.\2\2\u02a2\u02a3\5.\30"+
		"\2\u02a3\u02a4\b\34\1\2\u02a4\67\3\2\2\2\u02a5\u02a6\5&\24\2\u02a6\u02a7"+
		"\b\35\1\2\u02a79\3\2\2\2\u02a8\u02a9\5.\30\2\u02a9\u02aa\7$\2\2\u02aa"+
		"\u02ab\5:\36\2\u02ab\u02ac\b\36\1\2\u02ac\u02b3\3\2\2\2\u02ad\u02ae\5"+
		".\30\2\u02ae\u02af\7$\2\2\u02af\u02b0\5.\30\2\u02b0\u02b1\b\36\1\2\u02b1"+
		"\u02b3\3\2\2\2\u02b2\u02a8\3\2\2\2\u02b2\u02ad\3\2\2\2\u02b3;\3\2\2\2"+
		"\u02b4\u02b5\7,\2\2\u02b5\u02b6\5\32\16\2\u02b6\u02b7\b\37\1\2\u02b7="+
		"\3\2\2\2\u02b8\u02b9\5\f\7\2\u02b9\u02ba\7\b\2\2\u02ba\u02bb\5.\30\2\u02bb"+
		"\u02bc\b \1\2\u02bc\u02d1\3\2\2\2\u02bd\u02bf\5\f\7\2\u02be\u02c0\5\n"+
		"\6\2\u02bf\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7\b\2\2\u02c4\u02c5\5."+
		"\30\2\u02c5\u02c6\b \1\2\u02c6\u02d1\3\2\2\2\u02c7\u02c8\7\13\2\2\u02c8"+
		"\u02c9\5\f\7\2\u02c9\u02ca\7\61\2\2\u02ca\u02cb\5\32\16\2\u02cb\u02cc"+
		"\7=\2\2\u02cc\u02cd\7\b\2\2\u02cd\u02ce\5.\30\2\u02ce\u02cf\b \1\2\u02cf"+
		"\u02d1\3\2\2\2\u02d0\u02b8\3\2\2\2\u02d0\u02bd\3\2\2\2\u02d0\u02c7\3\2"+
		"\2\2\u02d1?\3\2\2\2\u02d2\u02d4\5> \2\u02d3\u02d5\5*\26\2\u02d4\u02d3"+
		"\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7"+
		"\u02d8\3\2\2\2\u02d8\u02d9\b!\1\2\u02d9\u02de\3\2\2\2\u02da\u02db\5> "+
		"\2\u02db\u02dc\b!\1\2\u02dc\u02de\3\2\2\2\u02dd\u02d2\3\2\2\2\u02dd\u02da"+
		"\3\2\2\2\u02deA\3\2\2\2*Nay\u0085\u0092\u00a0\u00a4\u00b2\u00d3\u00e5"+
		"\u00f1\u00f3\u00ff\u010f\u0128\u0133\u0137\u0139\u0144\u0151\u015c\u0162"+
		"\u0176\u0192\u019a\u01e9\u01f5\u01fe\u0206\u0211\u0240\u0283\u0285\u029a"+
		"\u029f\u02b2\u02c1\u02d0\u02d6\u02dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}