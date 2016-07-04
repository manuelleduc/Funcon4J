// Generated from  by ANTLR 4.2.2

package camllightnosideeffects.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

import static camllight.parser.Tokens.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLNoSEParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__64=1, T__63=2, T__62=3, T__61=4, T__60=5, T__59=6, T__58=7, T__57=8, 
		T__56=9, T__55=10, T__54=11, T__53=12, T__52=13, T__51=14, T__50=15, T__49=16, 
		T__48=17, T__47=18, T__46=19, T__45=20, T__44=21, T__43=22, T__42=23, 
		T__41=24, T__40=25, T__39=26, T__38=27, T__37=28, T__36=29, T__35=30, 
		T__34=31, T__33=32, T__32=33, T__31=34, T__30=35, T__29=36, T__28=37, 
		T__27=38, T__26=39, T__25=40, T__24=41, T__23=42, T__22=43, T__21=44, 
		T__20=45, T__19=46, T__18=47, T__17=48, T__16=49, T__15=50, T__14=51, 
		T__13=52, T__12=53, T__11=54, T__10=55, T__9=56, T__8=57, T__7=58, T__6=59, 
		T__5=60, T__4=61, T__3=62, T__2=63, T__1=64, T__0=65, CHARTOKEN=66, NULLTOKEN=67, 
		EMPTYLISTTOKEN=68, EMPTYARRAYTOKEN=69, WILDCARDTOKEN=70, BOOLTOKEN=71, 
		CARRIAGERETURN=72, FORMFEED=73, WS=74, COMMENT=75, INTTOKEN=76, STRINGTOKEN=77, 
		FLOATTOKEN=78, LINEFEED=79, HORIZONTALTAB=80, IDTOKEN=81, CONSTRTOKEN=82;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'!='", "'while'", "'{'", "'&&'", "'**'", "'::'", 
		"'='", "'for'", "'^'", "'do'", "'('", "'rec'", "','", "'done'", "'mod'", 
		"'>='", "'<'", "';;'", "']'", "'@'", "'*.'", "'type'", "'<>'", "'let'", 
		"'match'", "'function'", "'downto'", "'then'", "'+'", "'/'", "'as'", "'of'", 
		"';'", "'||'", "'/.'", "'}'", "'if'", "'try'", "'<='", "'&'", "'''", "'*'", 
		"'.'", "'exception'", "'->'", "'to'", "'mutable'", "':'", "'['", "'=='", 
		"'|'", "'with'", "'>'", "'+.'", "'or'", "'-.'", "'else'", "'begin'", "'in'", 
		"'end'", "')'", "'and'", "'not'", "'-'", "CHARTOKEN", "NULLTOKEN", "EMPTYLISTTOKEN", 
		"EMPTYARRAYTOKEN", "'_'", "BOOLTOKEN", "CARRIAGERETURN", "FORMFEED", "WS", 
		"COMMENT", "INTTOKEN", "STRINGTOKEN", "FLOATTOKEN", "LINEFEED", "HORIZONTALTAB", 
		"IDTOKEN", "CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decllabeltype = 2, RULE_vartype = 3, 
		RULE_decl = 4, RULE_patt = 5, RULE_ident = 6, RULE_declorexp = 7, RULE_pattlist = 8, 
		RULE_emptylist = 9, RULE_pattmatchsingle = 10, RULE_type = 11, RULE_headtaillistpatt = 12, 
		RULE_decltypeappendix = 13, RULE_declmono = 14, RULE_letExp = 15, RULE_decloptionalvartypes = 16, 
		RULE_declnewtypeappendix = 17, RULE_patttuple = 18, RULE_declimpl = 19, 
		RULE_function = 20, RULE_recanddecl = 21, RULE_recordpattappendix = 22, 
		RULE_exp = 23, RULE_anddecl = 24, RULE_varianttype = 25, RULE_pattmatchcurried = 26, 
		RULE_prog = 27, RULE_functionapp = 28, RULE_tupletypelist = 29, RULE_recdeclmono = 30, 
		RULE_declexceptionappendix = 31, RULE_recdecl = 32, RULE_declnewtype = 33;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decllabeltype", "vartype", "decl", "patt", "ident", 
		"declorexp", "pattlist", "emptylist", "pattmatchsingle", "type", "headtaillistpatt", 
		"decltypeappendix", "declmono", "letExp", "decloptionalvartypes", "declnewtypeappendix", 
		"patttuple", "declimpl", "function", "recanddecl", "recordpattappendix", 
		"exp", "anddecl", "varianttype", "pattmatchcurried", "prog", "functionapp", 
		"tupletypelist", "recdeclmono", "declexceptionappendix", "recdecl", "declnewtype"
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


	private camllightnosideeffects.NoSideEffectsAlg builder;
	public void setBuilder(camllightnosideeffects.NoSideEffectsAlg builder) { this.builder = builder; }
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

	public CLNoSEParser(TokenStream input) {
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
			setState(80);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); match(52);
				setState(69); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				setState(73); match(52);
				setState(74); ((PattmatchContext)_localctx).pattmatch_1 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchMulti((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle),(((PattmatchContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
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
		public Token NULLTOKEN_0;
		public Token INTTOKEN_0;
		public Token FLOATTOKEN_0;
		public Token BOOLTOKEN_0;
		public Token CHARTOKEN_0;
		public Token STRINGTOKEN_0;
		public Token CONSTRTOKEN_0;
		public TerminalNode FLOATTOKEN() { return getToken(CLNoSEParser.FLOATTOKEN, 0); }
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoSEParser.CONSTRTOKEN, 0); }
		public TerminalNode NULLTOKEN() { return getToken(CLNoSEParser.NULLTOKEN, 0); }
		public TerminalNode INTTOKEN() { return getToken(CLNoSEParser.INTTOKEN, 0); }
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public TerminalNode BOOLTOKEN() { return getToken(CLNoSEParser.BOOLTOKEN, 0); }
		public TerminalNode CHARTOKEN() { return getToken(CLNoSEParser.CHARTOKEN, 0); }
		public TerminalNode STRINGTOKEN() { return getToken(CLNoSEParser.STRINGTOKEN, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constant);
		try {
			setState(99);
			switch (_input.LA(1)) {
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(82); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(85); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case INTTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(87); ((ConstantContext)_localctx).INTTOKEN_0 = match(INTTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(inttoken((((ConstantContext)_localctx).INTTOKEN_0!=null?((ConstantContext)_localctx).INTTOKEN_0.getText():null)));
				}
				break;
			case FLOATTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(89); ((ConstantContext)_localctx).FLOATTOKEN_0 = match(FLOATTOKEN);
				((ConstantContext)_localctx)._constant =  builder.float_(floattoken((((ConstantContext)_localctx).FLOATTOKEN_0!=null?((ConstantContext)_localctx).FLOATTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(91); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case CHARTOKEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(93); ((ConstantContext)_localctx).CHARTOKEN_0 = match(CHARTOKEN);
				((ConstantContext)_localctx)._constant =  builder.char_(chartoken((((ConstantContext)_localctx).CHARTOKEN_0!=null?((ConstantContext)_localctx).CHARTOKEN_0.getText():null)));
				}
				break;
			case STRINGTOKEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(95); ((ConstantContext)_localctx).STRINGTOKEN_0 = match(STRINGTOKEN);
				((ConstantContext)_localctx)._constant =  builder.string(stringtoken((((ConstantContext)_localctx).STRINGTOKEN_0!=null?((ConstantContext)_localctx).STRINGTOKEN_0.getText():null)));
				}
				break;
			case CONSTRTOKEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(97); ((ConstantContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((ConstantContext)_localctx)._constant =  builder.constr(constrtoken((((ConstantContext)_localctx).CONSTRTOKEN_0!=null?((ConstantContext)_localctx).CONSTRTOKEN_0.getText():null)));
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
		public TerminalNode IDTOKEN() { return getToken(CLNoSEParser.IDTOKEN, 0); }
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
			setState(112);
			switch (_input.LA(1)) {
			case IDTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(101); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(102); match(49);
				setState(103); ((DecllabeltypeContext)_localctx).type_1 = type(0);
				((DecllabeltypeContext)_localctx)._decllabeltype =  builder.declLabelType(idtoken((((DecllabeltypeContext)_localctx).IDTOKEN_0!=null?((DecllabeltypeContext)_localctx).IDTOKEN_0.getText():null)),(((DecllabeltypeContext)_localctx).type_1._type));
				}
				break;
			case 48:
				enterOuterAlt(_localctx, 2);
				{
				setState(106); match(48);
				setState(107); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(108); match(49);
				setState(109); ((DecllabeltypeContext)_localctx).type_1 = type(0);
				((DecllabeltypeContext)_localctx)._decllabeltype =  builder.declMutableLabelType(idtoken((((DecllabeltypeContext)_localctx).IDTOKEN_0!=null?((DecllabeltypeContext)_localctx).IDTOKEN_0.getText():null)),(((DecllabeltypeContext)_localctx).type_1._type));
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
		public TerminalNode IDTOKEN() { return getToken(CLNoSEParser.IDTOKEN, 0); }
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
			setState(114); match(42);
			setState(115); ((VartypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
		public DeclnewtypeappendixContext declnewtypeappendix;
		public List<DeclnewtypeappendixContext> declnewtypeappendix_1_list = new ArrayList<DeclnewtypeappendixContext>();
		public Token CONSTRTOKEN_0;
		public DeclexceptionappendixContext declexceptionappendix;
		public List<DeclexceptionappendixContext> declexceptionappendix_1_list = new ArrayList<DeclexceptionappendixContext>();
		public TypeContext type_1;
		public List<DeclexceptionappendixContext> declexceptionappendix_2_list = new ArrayList<DeclexceptionappendixContext>();
		public DeclContext decl_0;
		public AnddeclContext anddecl;
		public List<AnddeclContext> anddecl_1_list = new ArrayList<AnddeclContext>();
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoSEParser.CONSTRTOKEN, 0); }
		public AnddeclContext anddecl(int i) {
			return getRuleContext(AnddeclContext.class,i);
		}
		public List<DeclexceptionappendixContext> declexceptionappendix() {
			return getRuleContexts(DeclexceptionappendixContext.class);
		}
		public DeclexceptionappendixContext declexceptionappendix(int i) {
			return getRuleContext(DeclexceptionappendixContext.class,i);
		}
		public DeclmonoContext declmono() {
			return getRuleContext(DeclmonoContext.class,0);
		}
		public DeclnewtypeappendixContext declnewtypeappendix(int i) {
			return getRuleContext(DeclnewtypeappendixContext.class,i);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public List<DeclnewtypeappendixContext> declnewtypeappendix() {
			return getRuleContexts(DeclnewtypeappendixContext.class);
		}
		public DecloptionalvartypesContext decloptionalvartypes() {
			return getRuleContext(DecloptionalvartypesContext.class,0);
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
		enterRule(_localctx, 8, RULE_decl);
		int _la;
		try {
			setState(169);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118); match(25);
				setState(119); match(13);
				setState(120); ((DeclContext)_localctx).recdecl_0 = recdecl();
				((DeclContext)_localctx)._decl =  builder.declRec((((DeclContext)_localctx).recdecl_0._recdecl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126); match(23);
				setState(127); ((DeclContext)_localctx).decloptionalvartypes_0 = decloptionalvartypes();
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==63) {
					{
					{
					setState(128); ((DeclContext)_localctx).declnewtypeappendix = declnewtypeappendix();
					((DeclContext)_localctx).declnewtypeappendix_1_list.add(((DeclContext)_localctx).declnewtypeappendix);
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declNewType((((DeclContext)_localctx).decloptionalvartypes_0._decloptionalvartypes),lift("_declnewtypeappendix", ((DeclContext)_localctx).declnewtypeappendix_1_list));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136); match(45);
				setState(137); ((DeclContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==63) {
					{
					{
					setState(138); ((DeclContext)_localctx).declexceptionappendix = declexceptionappendix();
					((DeclContext)_localctx).declexceptionappendix_1_list.add(((DeclContext)_localctx).declexceptionappendix);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declEnumException(constrtoken((((DeclContext)_localctx).CONSTRTOKEN_0!=null?((DeclContext)_localctx).CONSTRTOKEN_0.getText():null)),lift("_declexceptionappendix", ((DeclContext)_localctx).declexceptionappendix_1_list));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145); match(45);
				setState(146); ((DeclContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(147); match(33);
				setState(148); ((DeclContext)_localctx).type_1 = type(0);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==63) {
					{
					{
					setState(149); ((DeclContext)_localctx).declexceptionappendix = declexceptionappendix();
					((DeclContext)_localctx).declexceptionappendix_2_list.add(((DeclContext)_localctx).declexceptionappendix);
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declConstrException(constrtoken((((DeclContext)_localctx).CONSTRTOKEN_0!=null?((DeclContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DeclContext)_localctx).type_1._type),lift("_declexceptionappendix", ((DeclContext)_localctx).declexceptionappendix_2_list));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157); match(25);
				setState(158); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(161); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(163); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(162); ((DeclContext)_localctx).anddecl = anddecl();
					((DeclContext)_localctx).anddecl_1_list.add(((DeclContext)_localctx).anddecl);
					}
					}
					setState(165); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==63 );
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
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoSEParser.CONSTRTOKEN, 0); }
		public RecordpattappendixContext recordpattappendix(int i) {
			return getRuleContext(RecordpattappendixContext.class,i);
		}
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public TerminalNode WILDCARDTOKEN() { return getToken(CLNoSEParser.WILDCARDTOKEN, 0); }
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public List<PatttupleContext> patttuple() {
			return getRuleContexts(PatttupleContext.class);
		}
		public PattlistContext pattlist() {
			return getRuleContext(PattlistContext.class,0);
		}
		public TerminalNode IDTOKEN() { return getToken(CLNoSEParser.IDTOKEN, 0); }
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
			setState(234);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(172); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(173); ((PattContext)_localctx).patt_1 = patt(6);
				((PattContext)_localctx)._patt =  builder.pattConstrPatt(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt));
				}
				break;

			case 2:
				{
				setState(176); match(4);
				setState(177); ((PattContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(178); match(8);
				setState(179); ((PattContext)_localctx).patt_1 = patt(0);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(180); ((PattContext)_localctx).recordpattappendix = recordpattappendix();
					((PattContext)_localctx).recordpattappendix_2_list.add(((PattContext)_localctx).recordpattappendix);
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(186); match(37);
				((PattContext)_localctx)._patt =  builder.recordPatt(idtoken((((PattContext)_localctx).IDTOKEN_0!=null?((PattContext)_localctx).IDTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt),lift("_recordpattappendix", ((PattContext)_localctx).recordpattappendix_2_list));
				}
				break;

			case 3:
				{
				setState(189); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(192); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 5:
				{
				setState(194); match(12);
				setState(195); ((PattContext)_localctx).patt_0 = patt(0);
				setState(196); match(62);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 6:
				{
				setState(199); match(12);
				setState(200); ((PattContext)_localctx).patt_0 = patt(0);
				setState(201); match(49);
				setState(202); ((PattContext)_localctx).type_1 = type(0);
				setState(203); match(62);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 7:
				{
				setState(206); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 8:
				{
				setState(209); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((PattContext)_localctx)._patt =  builder.pattConstr(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(211); match(12);
				setState(212); ((PattContext)_localctx).patt_0 = patt(0);
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(213); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(216); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==14 );
				setState(218); match(62);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 10:
				{
				setState(221); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 11:
				{
				setState(224); match(50);
				setState(225); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(226); match(20);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 12:
				{
				setState(229); match(50);
				setState(230); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(231); match(20);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(248);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(246);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(236);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(237); match(52);
						setState(238); ((PattContext)_localctx).patt_1 = patt(9);
						((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).patt_1._patt));
						}
						break;

					case 2:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(241);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(242); match(32);
						setState(243); ((PattContext)_localctx).ident_1 = ident();
						((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
						}
						break;
					}
					} 
				}
				setState(250);
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

	public static class IdentContext extends ParserRuleContext {
		public Object _ident;
		public Token IDTOKEN_0;
		public TerminalNode IDTOKEN() { return getToken(CLNoSEParser.IDTOKEN, 0); }
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
			setState(251); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257); ((DeclorexpContext)_localctx).decl_0 = decl();
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
		enterRule(_localctx, 16, RULE_pattlist);
		try {
			setState(270);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262); ((PattlistContext)_localctx).patt_0 = patt(0);
				((PattlistContext)_localctx)._pattlist =  builder.pattListSingle((((PattlistContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(266); match(14);
				setState(267); ((PattlistContext)_localctx).pattlist_1 = pattlist();
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
		public TerminalNode EMPTYLISTTOKEN() { return getToken(CLNoSEParser.EMPTYLISTTOKEN, 0); }
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
			setState(272); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
			setState(275); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(276); match(46);
			setState(277); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		public TypeContext type;
		public List<TypeContext> type_0tail = new ArrayList<TypeContext>();
		public Token IDTOKEN_0;
		public TypeContext type_1;
		public TupletypelistContext tupletypelist;
		public List<TupletypelistContext> tupletypelist_1_list = new ArrayList<TupletypelistContext>();
		public Token IDTOKEN_1;
		public TupletypelistContext tupletypelist(int i) {
			return getRuleContext(TupletypelistContext.class,i);
		}
		public TerminalNode IDTOKEN() { return getToken(CLNoSEParser.IDTOKEN, 0); }
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(281); ((TypeContext)_localctx).vartype_0 = vartype();
				((TypeContext)_localctx)._type =  builder.varTypeType((((TypeContext)_localctx).vartype_0._vartype));
				}
				break;

			case 2:
				{
				setState(284); match(12);
				setState(285); ((TypeContext)_localctx).type_0 = type(0);
				setState(286); match(62);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;

			case 3:
				{
				setState(289); match(12);
				{
				setState(290); ((TypeContext)_localctx).type_0 = type(0);
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(291); match(14);
					setState(292); ((TypeContext)_localctx).type = type(0);
					((TypeContext)_localctx).type_0tail.add(((TypeContext)_localctx).type);
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(298); match(62);
				setState(299); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typesIdType(lift("_type", ((TypeContext)_localctx).type_0tail, ((TypeContext)_localctx).type_0._type),idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;

			case 4:
				{
				setState(302); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(324);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(322);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(306);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(307); match(46);
						setState(308); ((TypeContext)_localctx).type_1 = type(3);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(311);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(313); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(312); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(315); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.tupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;

					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(319);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(320); ((TypeContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						((TypeContext)_localctx)._type =  builder.typeIdType((((TypeContext)_localctx).type_0._type),idtoken((((TypeContext)_localctx).IDTOKEN_1!=null?((TypeContext)_localctx).IDTOKEN_1.getText():null)));
						}
						break;
					}
					} 
				}
				setState(326);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
			setState(335);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(327); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(328); match(7);
				setState(329); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(332); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
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

	public static class DecltypeappendixContext extends ParserRuleContext {
		public Object _decltypeappendix;
		public Token CONSTRTOKEN_0;
		public TypeContext type_1;
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoSEParser.CONSTRTOKEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DecltypeappendixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decltypeappendix; }
	}

	public final DecltypeappendixContext decltypeappendix() throws RecognitionException {
		DecltypeappendixContext _localctx = new DecltypeappendixContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_decltypeappendix);
		try {
			setState(346);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(337); match(52);
				setState(338); ((DecltypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(339); match(33);
				setState(340); ((DecltypeappendixContext)_localctx).type_1 = type(0);
				((DecltypeappendixContext)_localctx)._decltypeappendix =  builder.declConstrTypeAppendix(constrtoken((((DecltypeappendixContext)_localctx).CONSTRTOKEN_0!=null?((DecltypeappendixContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DecltypeappendixContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343); match(52);
				setState(344); ((DecltypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((DecltypeappendixContext)_localctx)._decltypeappendix =  builder.declEnumTypeAppendix(constrtoken((((DecltypeappendixContext)_localctx).CONSTRTOKEN_0!=null?((DecltypeappendixContext)_localctx).CONSTRTOKEN_0.getText():null)));
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
			setState(363);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(350); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(349); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(352); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 12) | (1L << 50))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CHARTOKEN - 66)) | (1L << (NULLTOKEN - 66)) | (1L << (EMPTYLISTTOKEN - 66)) | (1L << (WILDCARDTOKEN - 66)) | (1L << (BOOLTOKEN - 66)) | (1L << (INTTOKEN - 66)) | (1L << (STRINGTOKEN - 66)) | (1L << (FLOATTOKEN - 66)) | (1L << (IDTOKEN - 66)) | (1L << (CONSTRTOKEN - 66)))) != 0) );
				setState(354); match(8);
				setState(355); ((DeclmonoContext)_localctx).exp_2 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMonoFunc((((DeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((DeclmonoContext)_localctx).patt_1_list),(((DeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(359); match(8);
				setState(360); ((DeclmonoContext)_localctx).exp_1 = exp(0);
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
			setState(365); ((LetExpContext)_localctx).decl_0 = decl();
			setState(366); match(60);
			setState(367); ((LetExpContext)_localctx).exp_1 = exp(0);
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
		public DeclnewtypeContext declnewtype_1;
		public VartypeContext vartype;
		public List<VartypeContext> vartype_0tail = new ArrayList<VartypeContext>();
		public DeclnewtypeContext declnewtype_0;
		public DeclnewtypeContext declnewtype() {
			return getRuleContext(DeclnewtypeContext.class,0);
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
		enterRule(_localctx, 32, RULE_decloptionalvartypes);
		int _la;
		try {
			setState(392);
			switch (_input.LA(1)) {
			case 42:
				enterOuterAlt(_localctx, 1);
				{
				setState(370); ((DecloptionalvartypesContext)_localctx).vartype_0 = vartype();
				setState(371); ((DecloptionalvartypesContext)_localctx).declnewtype_1 = declnewtype();
				((DecloptionalvartypesContext)_localctx)._decloptionalvartypes =  builder.declNewTypeWithVarType((((DecloptionalvartypesContext)_localctx).vartype_0._vartype),(((DecloptionalvartypesContext)_localctx).declnewtype_1._declnewtype));
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 2);
				{
				setState(374); match(12);
				setState(383);
				_la = _input.LA(1);
				if (_la==42) {
					{
					setState(375); ((DecloptionalvartypesContext)_localctx).vartype_0 = vartype();
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==14) {
						{
						{
						setState(376); match(14);
						setState(377); ((DecloptionalvartypesContext)_localctx).vartype = vartype();
						((DecloptionalvartypesContext)_localctx).vartype_0tail.add(((DecloptionalvartypesContext)_localctx).vartype);
						}
						}
						setState(382);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(385); match(62);
				setState(386); ((DecloptionalvartypesContext)_localctx).declnewtype_0 = declnewtype();
				((DecloptionalvartypesContext)_localctx)._decloptionalvartypes =  builder.declNewTypeWithVarTypes(lift("_vartype", ((DecloptionalvartypesContext)_localctx).vartype_0tail, ((DecloptionalvartypesContext)_localctx).vartype_0._vartype),(((DecloptionalvartypesContext)_localctx).declnewtype_0._declnewtype));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(389); ((DecloptionalvartypesContext)_localctx).declnewtype_0 = declnewtype();
				((DecloptionalvartypesContext)_localctx)._decloptionalvartypes =  builder.declNewTypeWithoutVarTypes((((DecloptionalvartypesContext)_localctx).declnewtype_0._declnewtype));
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

	public static class DeclnewtypeappendixContext extends ParserRuleContext {
		public Object _declnewtypeappendix;
		public DecloptionalvartypesContext decloptionalvartypes_0;
		public DecloptionalvartypesContext decloptionalvartypes() {
			return getRuleContext(DecloptionalvartypesContext.class,0);
		}
		public DeclnewtypeappendixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declnewtypeappendix; }
	}

	public final DeclnewtypeappendixContext declnewtypeappendix() throws RecognitionException {
		DeclnewtypeappendixContext _localctx = new DeclnewtypeappendixContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_declnewtypeappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394); match(63);
			setState(395); ((DeclnewtypeappendixContext)_localctx).decloptionalvartypes_0 = decloptionalvartypes();
			((DeclnewtypeappendixContext)_localctx)._declnewtypeappendix =  builder.declNewTypeAppendix((((DeclnewtypeappendixContext)_localctx).decloptionalvartypes_0._decloptionalvartypes));
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
		enterRule(_localctx, 36, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398); match(14);
			setState(399); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
		enterRule(_localctx, 38, RULE_declimpl);
		try {
			setState(411);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(403); match(19);
				setState(404); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(408); match(19);
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
		public Token IDTOKEN_1;
		public TerminalNode IDTOKEN() { return getToken(CLNoSEParser.IDTOKEN, 0); }
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(414); match(27);
				setState(415); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(418); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 3:
				{
				setState(421); match(59);
				setState(422); ((FunctionContext)_localctx).function_0 = function(0);
				setState(423); match(61);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 4:
				{
				setState(426); match(12);
				setState(427); ((FunctionContext)_localctx).function_0 = function(0);
				setState(428); match(62);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(431); match(1);
				setState(432); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(435); match(1);
				setState(436); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(441);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(442); match(44);
					setState(443); ((FunctionContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
					((FunctionContext)_localctx)._function =  builder.functionRecordSelect((((FunctionContext)_localctx).function_0._function),idtoken((((FunctionContext)_localctx).IDTOKEN_1!=null?((FunctionContext)_localctx).IDTOKEN_1.getText():null)));
					}
					} 
				}
				setState(449);
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
		enterRule(_localctx, 42, RULE_recanddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450); match(63);
			setState(451); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
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
		public TerminalNode IDTOKEN() { return getToken(CLNoSEParser.IDTOKEN, 0); }
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
		enterRule(_localctx, 44, RULE_recordpattappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454); match(14);
			setState(455); ((RecordpattappendixContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			setState(456); match(8);
			setState(457); ((RecordpattappendixContext)_localctx).patt_1 = patt(0);
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
		public IdentContext ident_0;
		public ConstantContext constant_0;
		public TypeContext type_1;
		public ExpContext exp;
		public List<ExpContext> exp_0tail = new ArrayList<ExpContext>();
		public FunctionappContext functionapp_0;
		public ExpContext exp_3;
		public PattmatchContext pattmatch_1;
		public FunctionContext function_0;
		public LetExpContext letExp_0;
		public Token op_1512;
		public Token op_1511;
		public Token op_1509;
		public Token op_1508;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoSEParser.CONSTRTOKEN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public LetExpContext letExp() {
			return getRuleContext(LetExpContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FunctionappContext functionapp() {
			return getRuleContext(FunctionappContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(461); ((ExpContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(462); ((ExpContext)_localctx).exp_1 = exp(25);
				((ExpContext)_localctx)._exp =  builder.constrExp(constrtoken((((ExpContext)_localctx).CONSTRTOKEN_0!=null?((ExpContext)_localctx).CONSTRTOKEN_0.getText():null)),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				{
				setState(465); match(57);
				setState(466); ((ExpContext)_localctx).exp_0 = exp(21);
				((ExpContext)_localctx)._exp =  builder.floatNegateExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 3:
				{
				setState(469); match(65);
				setState(470); ((ExpContext)_localctx).exp_0 = exp(20);
				((ExpContext)_localctx)._exp =  builder.intUnarySub((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(473); match(64);
				setState(474); ((ExpContext)_localctx).exp_0 = exp(13);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(477); match(38);
				setState(478); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(479); match(29);
				setState(480); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(481); match(58);
				setState(482); ((ExpContext)_localctx).exp_2 = exp(10);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 6:
				{
				setState(485); match(38);
				setState(486); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(487); match(29);
				setState(488); ((ExpContext)_localctx).exp_1 = exp(9);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 7:
				{
				setState(491); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 8:
				{
				setState(494); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 9:
				{
				setState(497); match(12);
				setState(498); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(499); match(62);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 10:
				{
				setState(502); match(59);
				setState(503); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(504); match(61);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 11:
				{
				setState(507); match(12);
				setState(508); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(509); match(49);
				setState(510); ((ExpContext)_localctx).type_1 = type(0);
				setState(511); match(62);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 12:
				{
				setState(514); match(12);
				{
				setState(515); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(516); match(14);
					setState(517); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(523); match(62);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(526); match(50);
				{
				setState(527); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(528); match(14);
					setState(529); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(534);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(535); match(20);
				((ExpContext)_localctx)._exp =  builder.expList(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 14:
				{
				setState(538); ((ExpContext)_localctx).functionapp_0 = functionapp(0);
				((ExpContext)_localctx)._exp =  builder.functionApplicationExp((((ExpContext)_localctx).functionapp_0._functionapp));
				}
				break;

			case 15:
				{
				setState(541); match(3);
				setState(542); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(543); match(11);
				setState(544); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(545); match(15);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 16:
				{
				setState(548); match(9);
				setState(549); ((ExpContext)_localctx).ident_0 = ident();
				setState(550); match(8);
				setState(551); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(552); match(28);
				setState(553); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(554); match(11);
				setState(555); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(556); match(15);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 17:
				{
				setState(559); match(9);
				setState(560); ((ExpContext)_localctx).ident_0 = ident();
				setState(561); match(8);
				setState(562); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(563); match(47);
				setState(564); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(565); match(11);
				setState(566); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(567); match(15);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 18:
				{
				setState(570); match(26);
				setState(571); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(572); match(53);
				setState(573); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 19:
				{
				setState(576); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 20:
				{
				setState(579); match(39);
				setState(580); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(581); match(53);
				setState(582); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.tryWithExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 21:
				{
				setState(585); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(642);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(640);
					switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(590);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(591); match(7);
						setState(592); ((ExpContext)_localctx).exp_1 = exp(24);
						((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(595);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(596); match(6);
						setState(597); ((ExpContext)_localctx).exp_1 = exp(20);
						((ExpContext)_localctx)._exp =  builder.floatPowerExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(600);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(601); match(16);
						setState(602); ((ExpContext)_localctx).exp_1 = exp(19);
						((ExpContext)_localctx)._exp =  builder.intMod((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(605);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(606);
						((ExpContext)_localctx).op_1512 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 22) | (1L << 31) | (1L << 36) | (1L << 43))) != 0)) ) {
							((ExpContext)_localctx).op_1512 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(607); ((ExpContext)_localctx).exp_1 = exp(18);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/") ? builder.intDivide(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*.") ? builder.floatMultiplyExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*") ? builder.intMultiply(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/.") ? builder.floatDivideExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(610);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(611);
						((ExpContext)_localctx).op_1511 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (30 - 30)) | (1L << (55 - 30)) | (1L << (57 - 30)) | (1L << (65 - 30)))) != 0)) ) {
							((ExpContext)_localctx).op_1511 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(612); ((ExpContext)_localctx).exp_1 = exp(17);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+.") ? builder.floatAddExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-.") ? builder.floatSubtractExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+") ? builder.intAdd(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-") ? builder.intSub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(615);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(616);
						((ExpContext)_localctx).op_1509 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==10 || _la==21) ) {
							((ExpContext)_localctx).op_1509 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(617); ((ExpContext)_localctx).exp_1 = exp(16);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1509!=null?((ExpContext)_localctx).op_1509.getText():null).equals("@") ? builder.listConcatExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1509!=null?((ExpContext)_localctx).op_1509.getText():null).equals("^") ? builder.stringAppendExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(620);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(621);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 8) | (1L << 17) | (1L << 18) | (1L << 24) | (1L << 40) | (1L << 51) | (1L << 54))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(622); ((ExpContext)_localctx).exp_1 = exp(15);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.smallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<>") ? builder.notEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("!=") ? builder.notPhysicalEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.greaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.smaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("==") ? builder.physicalEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.equal(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.greater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(625);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(626);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==41) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(627); ((ExpContext)_localctx).exp_1 = exp(13);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(630);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(631);
						_la = _input.LA(1);
						if ( !(_la==35 || _la==56) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(632); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(635);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(636); match(34);
						setState(637); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(644);
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
			setState(645); match(63);
			setState(646); ((AnddeclContext)_localctx).declmono_0 = declmono();
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
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoSEParser.CONSTRTOKEN, 0); }
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
			setState(656);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(649); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(650); match(33);
				setState(651); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
			setState(659); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(658); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(661); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 12) | (1L << 50))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CHARTOKEN - 66)) | (1L << (NULLTOKEN - 66)) | (1L << (EMPTYLISTTOKEN - 66)) | (1L << (WILDCARDTOKEN - 66)) | (1L << (BOOLTOKEN - 66)) | (1L << (INTTOKEN - 66)) | (1L << (STRINGTOKEN - 66)) | (1L << (FLOATTOKEN - 66)) | (1L << (IDTOKEN - 66)) | (1L << (CONSTRTOKEN - 66)))) != 0) );
			setState(663); match(46);
			setState(664); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
			setState(667); ((ProgContext)_localctx).declimpl_0 = declimpl();
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

	public static class FunctionappContext extends ParserRuleContext {
		public Object _functionapp;
		public FunctionappContext functionapp_0;
		public FunctionContext function_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FunctionappContext functionapp() {
			return getRuleContext(FunctionappContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionappContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionapp; }
	}

	public final FunctionappContext functionapp() throws RecognitionException {
		return functionapp(0);
	}

	private FunctionappContext functionapp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FunctionappContext _localctx = new FunctionappContext(_ctx, _parentState);
		FunctionappContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_functionapp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(671); match(12);
				setState(672); ((FunctionappContext)_localctx).functionapp_0 = functionapp(0);
				setState(673); match(62);
				((FunctionappContext)_localctx)._functionapp =  builder.functionApplicationBracketed((((FunctionappContext)_localctx).functionapp_0._functionapp));
				}
				break;

			case 2:
				{
				setState(676); ((FunctionappContext)_localctx).function_0 = function(0);
				setState(677); ((FunctionappContext)_localctx).exp_1 = exp(0);
				((FunctionappContext)_localctx)._functionapp =  builder.functionApplication((((FunctionappContext)_localctx).function_0._function),(((FunctionappContext)_localctx).exp_1._exp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionappContext(_parentctx, _parentState);
					_localctx.functionapp_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_functionapp);
					setState(682);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(683); ((FunctionappContext)_localctx).exp_1 = exp(0);
					((FunctionappContext)_localctx)._functionapp =  builder.functionApplicationApplication((((FunctionappContext)_localctx).functionapp_0._functionapp),(((FunctionappContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
			setState(691); match(43);
			setState(692); ((TupletypelistContext)_localctx).type_0 = type(0);
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
		public PattContext patt;
		public List<PattContext> patt_1_list = new ArrayList<PattContext>();
		public ExpContext exp_2;
		public TypeContext type_1;
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
			setState(719);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(697); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(696); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(699); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 12) | (1L << 50))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CHARTOKEN - 66)) | (1L << (NULLTOKEN - 66)) | (1L << (EMPTYLISTTOKEN - 66)) | (1L << (WILDCARDTOKEN - 66)) | (1L << (BOOLTOKEN - 66)) | (1L << (INTTOKEN - 66)) | (1L << (STRINGTOKEN - 66)) | (1L << (FLOATTOKEN - 66)) | (1L << (IDTOKEN - 66)) | (1L << (CONSTRTOKEN - 66)))) != 0) );
				setState(701); match(8);
				setState(702); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentPattsExp((((RecdeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((RecdeclmonoContext)_localctx).patt_1_list),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705); match(12);
				setState(706); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(707); match(49);
				setState(708); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(709); match(62);
				setState(710); match(8);
				setState(711); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclPattTypeExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).type_1._type),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(714); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(715); match(8);
				setState(716); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
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

	public static class DeclexceptionappendixContext extends ParserRuleContext {
		public Object _declexceptionappendix;
		public Token CONSTRTOKEN_0;
		public TypeContext type_1;
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoSEParser.CONSTRTOKEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclexceptionappendixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declexceptionappendix; }
	}

	public final DeclexceptionappendixContext declexceptionappendix() throws RecognitionException {
		DeclexceptionappendixContext _localctx = new DeclexceptionappendixContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declexceptionappendix);
		try {
			setState(730);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(721); match(63);
				setState(722); ((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(723); match(33);
				setState(724); ((DeclexceptionappendixContext)_localctx).type_1 = type(0);
				((DeclexceptionappendixContext)_localctx)._declexceptionappendix =  builder.declConstrExceptionAppendix(constrtoken((((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0!=null?((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DeclexceptionappendixContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(727); match(63);
				setState(728); ((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((DeclexceptionappendixContext)_localctx)._declexceptionappendix =  builder.declEnumExceptionAppendix(constrtoken((((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0!=null?((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0.getText():null)));
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
		enterRule(_localctx, 64, RULE_recdecl);
		int _la;
		try {
			setState(743);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(732); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				((RecdeclContext)_localctx)._recdecl =  builder.recDeclMono((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(735); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(737); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(736); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(739); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==63 );
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

	public static class DeclnewtypeContext extends ParserRuleContext {
		public Object _declnewtype;
		public IdentContext ident_0;
		public DecllabeltypeContext decllabeltype_1;
		public DecllabeltypeContext decllabeltype;
		public List<DecllabeltypeContext> decllabeltype_1tail = new ArrayList<DecllabeltypeContext>();
		public Token IDTOKEN_0;
		public Token CONSTRTOKEN_1;
		public DecltypeappendixContext decltypeappendix;
		public List<DecltypeappendixContext> decltypeappendix_2_list = new ArrayList<DecltypeappendixContext>();
		public TypeContext type_2;
		public List<DecltypeappendixContext> decltypeappendix_3_list = new ArrayList<DecltypeappendixContext>();
		public TypeContext type_1;
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoSEParser.CONSTRTOKEN, 0); }
		public DecllabeltypeContext decllabeltype(int i) {
			return getRuleContext(DecllabeltypeContext.class,i);
		}
		public TerminalNode IDTOKEN() { return getToken(CLNoSEParser.IDTOKEN, 0); }
		public DecltypeappendixContext decltypeappendix(int i) {
			return getRuleContext(DecltypeappendixContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<DecllabeltypeContext> decllabeltype() {
			return getRuleContexts(DecllabeltypeContext.class);
		}
		public List<DecltypeappendixContext> decltypeappendix() {
			return getRuleContexts(DecltypeappendixContext.class);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DeclnewtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declnewtype; }
	}

	public final DeclnewtypeContext declnewtype() throws RecognitionException {
		DeclnewtypeContext _localctx = new DeclnewtypeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declnewtype);
		int _la;
		try {
			setState(787);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(745); ((DeclnewtypeContext)_localctx).ident_0 = ident();
				setState(746); match(8);
				setState(747); match(4);
				{
				setState(748); ((DeclnewtypeContext)_localctx).decllabeltype_1 = decllabeltype();
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==14) {
					{
					{
					setState(749); match(14);
					setState(750); ((DeclnewtypeContext)_localctx).decllabeltype = decllabeltype();
					((DeclnewtypeContext)_localctx).decllabeltype_1tail.add(((DeclnewtypeContext)_localctx).decllabeltype);
					}
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(756); match(37);
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declRecordType((((DeclnewtypeContext)_localctx).ident_0._ident),lift("_decllabeltype", ((DeclnewtypeContext)_localctx).decllabeltype_1tail, ((DeclnewtypeContext)_localctx).decllabeltype_1._decllabeltype));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(759); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(760); match(8);
				setState(761); ((DeclnewtypeContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==52) {
					{
					{
					setState(762); ((DeclnewtypeContext)_localctx).decltypeappendix = decltypeappendix();
					((DeclnewtypeContext)_localctx).decltypeappendix_2_list.add(((DeclnewtypeContext)_localctx).decltypeappendix);
					}
					}
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declNewEnumType(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclnewtypeContext)_localctx).CONSTRTOKEN_1!=null?((DeclnewtypeContext)_localctx).CONSTRTOKEN_1.getText():null)),lift("_decltypeappendix", ((DeclnewtypeContext)_localctx).decltypeappendix_2_list));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(769); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(770); match(8);
				setState(771); ((DeclnewtypeContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(772); match(33);
				setState(773); ((DeclnewtypeContext)_localctx).type_2 = type(0);
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==52) {
					{
					{
					setState(774); ((DeclnewtypeContext)_localctx).decltypeappendix = decltypeappendix();
					((DeclnewtypeContext)_localctx).decltypeappendix_3_list.add(((DeclnewtypeContext)_localctx).decltypeappendix);
					}
					}
					setState(779);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declNewConstrType(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclnewtypeContext)_localctx).CONSTRTOKEN_1!=null?((DeclnewtypeContext)_localctx).CONSTRTOKEN_1.getText():null)),(((DeclnewtypeContext)_localctx).type_2._type),lift("_decltypeappendix", ((DeclnewtypeContext)_localctx).decltypeappendix_3_list));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(782); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(783); match(51);
				setState(784); ((DeclnewtypeContext)_localctx).type_1 = type(0);
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declTypeDefEquals(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),(((DeclnewtypeContext)_localctx).type_1._type));
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

		case 11: return type_sempred((TypeContext)_localctx, predIndex);

		case 20: return function_sempred((FunctionContext)_localctx, predIndex);

		case 23: return exp_sempred((ExpContext)_localctx, predIndex);

		case 28: return functionapp_sempred((FunctionappContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean functionapp_sempred(FunctionappContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return precpred(_ctx, 2);
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
		case 5: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 2);

		case 3: return precpred(_ctx, 6);

		case 4: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return precpred(_ctx, 24);

		case 7: return precpred(_ctx, 19);

		case 8: return precpred(_ctx, 18);

		case 9: return precpred(_ctx, 17);

		case 10: return precpred(_ctx, 16);

		case 11: return precpred(_ctx, 15);

		case 12: return precpred(_ctx, 14);

		case 13: return precpred(_ctx, 12);

		case 14: return precpred(_ctx, 11);

		case 15: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3T\u0318\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"S\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3f\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4s\n\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0084\n\6"+
		"\f\6\16\6\u0087\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u008e\n\6\f\6\16\6\u0091"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0099\n\6\f\6\16\6\u009c\13\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00a6\n\6\r\6\16\6\u00a7\3\6\3\6\5\6\u00ac"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00b8\n\7\f\7\16\7\u00bb"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00d9\n\7\r\7\16"+
		"\7\u00da\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00ed\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00f9\n\7"+
		"\f\7\16\7\u00fc\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0107\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0111\n\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0128"+
		"\n\r\f\r\16\r\u012b\13\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0133\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\6\r\u013c\n\r\r\r\16\r\u013d\3\r\3\r\3\r\3\r\3\r"+
		"\7\r\u0145\n\r\f\r\16\r\u0148\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0152\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17"+
		"\u015d\n\17\3\20\3\20\6\20\u0161\n\20\r\20\16\20\u0162\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u016e\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u017d\n\22\f\22\16\22\u0180"+
		"\13\22\5\22\u0182\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u018b\n"+
		"\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\5\25\u019e\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u01ba\n\26\3\26\3\26\3\26\3\26\7\26\u01c0"+
		"\n\26\f\26\16\26\u01c3\13\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\7\31\u0209\n\31\f\31\16\31\u020c\13\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\7\31\u0215\n\31\f\31\16\31\u0218\13\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u024f\n\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0283\n\31\f\31\16\31\u0286\13"+
		"\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0293"+
		"\n\33\3\34\6\34\u0296\n\34\r\34\16\34\u0297\3\34\3\34\3\34\3\34\3\35\3"+
		"\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u02ab"+
		"\n\36\3\36\3\36\3\36\3\36\7\36\u02b1\n\36\f\36\16\36\u02b4\13\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \6 \u02bc\n \r \16 \u02bd\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u02d2\n \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\5!\u02dd\n!\3\"\3\"\3\"\3\"\3\"\6\"\u02e4\n\"\r\"\16\"\u02e5\3\"\3\""+
		"\5\"\u02ea\n\"\3#\3#\3#\3#\3#\3#\7#\u02f2\n#\f#\16#\u02f5\13#\3#\3#\3"+
		"#\3#\3#\3#\3#\7#\u02fe\n#\f#\16#\u0301\13#\3#\3#\3#\3#\3#\3#\3#\7#\u030a"+
		"\n#\f#\16#\u030d\13#\3#\3#\3#\3#\3#\3#\3#\5#\u0316\n#\3#\2\7\f\30*\60"+
		":$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD"+
		"\2\b\6\2\30\30!!&&--\6\2  99;;CC\4\2\f\f\27\27\t\2\4\4\n\n\23\24\32\32"+
		"**\65\6588\4\2\7\7++\4\2%%::\u0361\2R\3\2\2\2\4e\3\2\2\2\6r\3\2\2\2\b"+
		"t\3\2\2\2\n\u00ab\3\2\2\2\f\u00ec\3\2\2\2\16\u00fd\3\2\2\2\20\u0106\3"+
		"\2\2\2\22\u0110\3\2\2\2\24\u0112\3\2\2\2\26\u0115\3\2\2\2\30\u0132\3\2"+
		"\2\2\32\u0151\3\2\2\2\34\u015c\3\2\2\2\36\u016d\3\2\2\2 \u016f\3\2\2\2"+
		"\"\u018a\3\2\2\2$\u018c\3\2\2\2&\u0190\3\2\2\2(\u019d\3\2\2\2*\u01b9\3"+
		"\2\2\2,\u01c4\3\2\2\2.\u01c8\3\2\2\2\60\u024e\3\2\2\2\62\u0287\3\2\2\2"+
		"\64\u0292\3\2\2\2\66\u0295\3\2\2\28\u029d\3\2\2\2:\u02aa\3\2\2\2<\u02b5"+
		"\3\2\2\2>\u02d1\3\2\2\2@\u02dc\3\2\2\2B\u02e9\3\2\2\2D\u0315\3\2\2\2F"+
		"G\7\66\2\2GH\5\2\2\2HI\b\2\1\2IS\3\2\2\2JK\5\26\f\2KL\7\66\2\2LM\5\2\2"+
		"\2MN\b\2\1\2NS\3\2\2\2OP\5\26\f\2PQ\b\2\1\2QS\3\2\2\2RF\3\2\2\2RJ\3\2"+
		"\2\2RO\3\2\2\2S\3\3\2\2\2TU\5\24\13\2UV\b\3\1\2Vf\3\2\2\2WX\7E\2\2Xf\b"+
		"\3\1\2YZ\7N\2\2Zf\b\3\1\2[\\\7P\2\2\\f\b\3\1\2]^\7I\2\2^f\b\3\1\2_`\7"+
		"D\2\2`f\b\3\1\2ab\7O\2\2bf\b\3\1\2cd\7T\2\2df\b\3\1\2eT\3\2\2\2eW\3\2"+
		"\2\2eY\3\2\2\2e[\3\2\2\2e]\3\2\2\2e_\3\2\2\2ea\3\2\2\2ec\3\2\2\2f\5\3"+
		"\2\2\2gh\7S\2\2hi\7\63\2\2ij\5\30\r\2jk\b\4\1\2ks\3\2\2\2lm\7\62\2\2m"+
		"n\7S\2\2no\7\63\2\2op\5\30\r\2pq\b\4\1\2qs\3\2\2\2rg\3\2\2\2rl\3\2\2\2"+
		"s\7\3\2\2\2tu\7,\2\2uv\7S\2\2vw\b\5\1\2w\t\3\2\2\2xy\7\33\2\2yz\7\17\2"+
		"\2z{\5B\"\2{|\b\6\1\2|\u00ac\3\2\2\2}~\5\36\20\2~\177\b\6\1\2\177\u00ac"+
		"\3\2\2\2\u0080\u0081\7\31\2\2\u0081\u0085\5\"\22\2\u0082\u0084\5$\23\2"+
		"\u0083\u0082\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\b\6\1\2\u0089"+
		"\u00ac\3\2\2\2\u008a\u008b\7/\2\2\u008b\u008f\7T\2\2\u008c\u008e\5@!\2"+
		"\u008d\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u00ac\b\6\1\2\u0093"+
		"\u0094\7/\2\2\u0094\u0095\7T\2\2\u0095\u0096\7#\2\2\u0096\u009a\5\30\r"+
		"\2\u0097\u0099\5@!\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d"+
		"\u009e\b\6\1\2\u009e\u00ac\3\2\2\2\u009f\u00a0\7\33\2\2\u00a0\u00a1\5"+
		"\n\6\2\u00a1\u00a2\b\6\1\2\u00a2\u00ac\3\2\2\2\u00a3\u00a5\5\36\20\2\u00a4"+
		"\u00a6\5\62\32\2\u00a5\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a5\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\6\1\2\u00aa"+
		"\u00ac\3\2\2\2\u00abx\3\2\2\2\u00ab}\3\2\2\2\u00ab\u0080\3\2\2\2\u00ab"+
		"\u008a\3\2\2\2\u00ab\u0093\3\2\2\2\u00ab\u009f\3\2\2\2\u00ab\u00a3\3\2"+
		"\2\2\u00ac\13\3\2\2\2\u00ad\u00ae\b\7\1\2\u00ae\u00af\7T\2\2\u00af\u00b0"+
		"\5\f\7\b\u00b0\u00b1\b\7\1\2\u00b1\u00ed\3\2\2\2\u00b2\u00b3\7\6\2\2\u00b3"+
		"\u00b4\7S\2\2\u00b4\u00b5\7\n\2\2\u00b5\u00b9\5\f\7\2\u00b6\u00b8\5.\30"+
		"\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\'\2\2\u00bd"+
		"\u00be\b\7\1\2\u00be\u00ed\3\2\2\2\u00bf\u00c0\5\16\b\2\u00c0\u00c1\b"+
		"\7\1\2\u00c1\u00ed\3\2\2\2\u00c2\u00c3\7H\2\2\u00c3\u00ed\b\7\1\2\u00c4"+
		"\u00c5\7\16\2\2\u00c5\u00c6\5\f\7\2\u00c6\u00c7\7@\2\2\u00c7\u00c8\b\7"+
		"\1\2\u00c8\u00ed\3\2\2\2\u00c9\u00ca\7\16\2\2\u00ca\u00cb\5\f\7\2\u00cb"+
		"\u00cc\7\63\2\2\u00cc\u00cd\5\30\r\2\u00cd\u00ce\7@\2\2\u00ce\u00cf\b"+
		"\7\1\2\u00cf\u00ed\3\2\2\2\u00d0\u00d1\5\4\3\2\u00d1\u00d2\b\7\1\2\u00d2"+
		"\u00ed\3\2\2\2\u00d3\u00d4\7T\2\2\u00d4\u00ed\b\7\1\2\u00d5\u00d6\7\16"+
		"\2\2\u00d6\u00d8\5\f\7\2\u00d7\u00d9\5&\24\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00da\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc\u00dd\7@\2\2\u00dd\u00de\b\7\1\2\u00de\u00ed\3\2\2\2\u00df"+
		"\u00e0\5\24\13\2\u00e0\u00e1\b\7\1\2\u00e1\u00ed\3\2\2\2\u00e2\u00e3\7"+
		"\64\2\2\u00e3\u00e4\5\22\n\2\u00e4\u00e5\7\26\2\2\u00e5\u00e6\b\7\1\2"+
		"\u00e6\u00ed\3\2\2\2\u00e7\u00e8\7\64\2\2\u00e8\u00e9\5\32\16\2\u00e9"+
		"\u00ea\7\26\2\2\u00ea\u00eb\b\7\1\2\u00eb\u00ed\3\2\2\2\u00ec\u00ad\3"+
		"\2\2\2\u00ec\u00b2\3\2\2\2\u00ec\u00bf\3\2\2\2\u00ec\u00c2\3\2\2\2\u00ec"+
		"\u00c4\3\2\2\2\u00ec\u00c9\3\2\2\2\u00ec\u00d0\3\2\2\2\u00ec\u00d3\3\2"+
		"\2\2\u00ec\u00d5\3\2\2\2\u00ec\u00df\3\2\2\2\u00ec\u00e2\3\2\2\2\u00ec"+
		"\u00e7\3\2\2\2\u00ed\u00fa\3\2\2\2\u00ee\u00ef\f\n\2\2\u00ef\u00f0\7\66"+
		"\2\2\u00f0\u00f1\5\f\7\13\u00f1\u00f2\b\7\1\2\u00f2\u00f9\3\2\2\2\u00f3"+
		"\u00f4\f\r\2\2\u00f4\u00f5\7\"\2\2\u00f5\u00f6\5\16\b\2\u00f6\u00f7\b"+
		"\7\1\2\u00f7\u00f9\3\2\2\2\u00f8\u00ee\3\2\2\2\u00f8\u00f3\3\2\2\2\u00f9"+
		"\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\r\3\2\2\2"+
		"\u00fc\u00fa\3\2\2\2\u00fd\u00fe\7S\2\2\u00fe\u00ff\b\b\1\2\u00ff\17\3"+
		"\2\2\2\u0100\u0101\5\60\31\2\u0101\u0102\b\t\1\2\u0102\u0107\3\2\2\2\u0103"+
		"\u0104\5\n\6\2\u0104\u0105\b\t\1\2\u0105\u0107\3\2\2\2\u0106\u0100\3\2"+
		"\2\2\u0106\u0103\3\2\2\2\u0107\21\3\2\2\2\u0108\u0109\5\f\7\2\u0109\u010a"+
		"\b\n\1\2\u010a\u0111\3\2\2\2\u010b\u010c\5\f\7\2\u010c\u010d\7\20\2\2"+
		"\u010d\u010e\5\22\n\2\u010e\u010f\b\n\1\2\u010f\u0111\3\2\2\2\u0110\u0108"+
		"\3\2\2\2\u0110\u010b\3\2\2\2\u0111\23\3\2\2\2\u0112\u0113\7F\2\2\u0113"+
		"\u0114\b\13\1\2\u0114\25\3\2\2\2\u0115\u0116\5\f\7\2\u0116\u0117\7\60"+
		"\2\2\u0117\u0118\5\60\31\2\u0118\u0119\b\f\1\2\u0119\27\3\2\2\2\u011a"+
		"\u011b\b\r\1\2\u011b\u011c\5\b\5\2\u011c\u011d\b\r\1\2\u011d\u0133\3\2"+
		"\2\2\u011e\u011f\7\16\2\2\u011f\u0120\5\30\r\2\u0120\u0121\7@\2\2\u0121"+
		"\u0122\b\r\1\2\u0122\u0133\3\2\2\2\u0123\u0124\7\16\2\2\u0124\u0129\5"+
		"\30\r\2\u0125\u0126\7\20\2\2\u0126\u0128\5\30\r\2\u0127\u0125\3\2\2\2"+
		"\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012c"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012d\7@\2\2\u012d\u012e\7S\2\2\u012e"+
		"\u012f\b\r\1\2\u012f\u0133\3\2\2\2\u0130\u0131\7S\2\2\u0131\u0133\b\r"+
		"\1\2\u0132\u011a\3\2\2\2\u0132\u011e\3\2\2\2\u0132\u0123\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0146\3\2\2\2\u0134\u0135\f\4\2\2\u0135\u0136\7\60"+
		"\2\2\u0136\u0137\5\30\r\5\u0137\u0138\b\r\1\2\u0138\u0145\3\2\2\2\u0139"+
		"\u013b\f\b\2\2\u013a\u013c\5<\37\2\u013b\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\3\2\2\2\u013f"+
		"\u0140\b\r\1\2\u0140\u0145\3\2\2\2\u0141\u0142\f\6\2\2\u0142\u0143\7S"+
		"\2\2\u0143\u0145\b\r\1\2\u0144\u0134\3\2\2\2\u0144\u0139\3\2\2\2\u0144"+
		"\u0141\3\2\2\2\u0145\u0148\3\2\2\2\u0146\u0144\3\2\2\2\u0146\u0147\3\2"+
		"\2\2\u0147\31\3\2\2\2\u0148\u0146\3\2\2\2\u0149\u014a\5\f\7\2\u014a\u014b"+
		"\7\t\2\2\u014b\u014c\5\32\16\2\u014c\u014d\b\16\1\2\u014d\u0152\3\2\2"+
		"\2\u014e\u014f\5\f\7\2\u014f\u0150\b\16\1\2\u0150\u0152\3\2\2\2\u0151"+
		"\u0149\3\2\2\2\u0151\u014e\3\2\2\2\u0152\33\3\2\2\2\u0153\u0154\7\66\2"+
		"\2\u0154\u0155\7T\2\2\u0155\u0156\7#\2\2\u0156\u0157\5\30\r\2\u0157\u0158"+
		"\b\17\1\2\u0158\u015d\3\2\2\2\u0159\u015a\7\66\2\2\u015a\u015b\7T\2\2"+
		"\u015b\u015d\b\17\1\2\u015c\u0153\3\2\2\2\u015c\u0159\3\2\2\2\u015d\35"+
		"\3\2\2\2\u015e\u0160\5\16\b\2\u015f\u0161\5\f\7\2\u0160\u015f\3\2\2\2"+
		"\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0164"+
		"\3\2\2\2\u0164\u0165\7\n\2\2\u0165\u0166\5\60\31\2\u0166\u0167\b\20\1"+
		"\2\u0167\u016e\3\2\2\2\u0168\u0169\5\f\7\2\u0169\u016a\7\n\2\2\u016a\u016b"+
		"\5\60\31\2\u016b\u016c\b\20\1\2\u016c\u016e\3\2\2\2\u016d\u015e\3\2\2"+
		"\2\u016d\u0168\3\2\2\2\u016e\37\3\2\2\2\u016f\u0170\5\n\6\2\u0170\u0171"+
		"\7>\2\2\u0171\u0172\5\60\31\2\u0172\u0173\b\21\1\2\u0173!\3\2\2\2\u0174"+
		"\u0175\5\b\5\2\u0175\u0176\5D#\2\u0176\u0177\b\22\1\2\u0177\u018b\3\2"+
		"\2\2\u0178\u0181\7\16\2\2\u0179\u017e\5\b\5\2\u017a\u017b\7\20\2\2\u017b"+
		"\u017d\5\b\5\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2"+
		"\2\2\u017e\u017f\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0181"+
		"\u0179\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2\2\2\u0183\u0184\7@"+
		"\2\2\u0184\u0185\5D#\2\u0185\u0186\b\22\1\2\u0186\u018b\3\2\2\2\u0187"+
		"\u0188\5D#\2\u0188\u0189\b\22\1\2\u0189\u018b\3\2\2\2\u018a\u0174\3\2"+
		"\2\2\u018a\u0178\3\2\2\2\u018a\u0187\3\2\2\2\u018b#\3\2\2\2\u018c\u018d"+
		"\7A\2\2\u018d\u018e\5\"\22\2\u018e\u018f\b\23\1\2\u018f%\3\2\2\2\u0190"+
		"\u0191\7\20\2\2\u0191\u0192\5\f\7\2\u0192\u0193\b\24\1\2\u0193\'\3\2\2"+
		"\2\u0194\u0195\5\20\t\2\u0195\u0196\7\25\2\2\u0196\u0197\5(\25\2\u0197"+
		"\u0198\b\25\1\2\u0198\u019e\3\2\2\2\u0199\u019a\5\20\t\2\u019a\u019b\7"+
		"\25\2\2\u019b\u019c\b\25\1\2\u019c\u019e\3\2\2\2\u019d\u0194\3\2\2\2\u019d"+
		"\u0199\3\2\2\2\u019e)\3\2\2\2\u019f\u01a0\b\26\1\2\u01a0\u01a1\7\35\2"+
		"\2\u01a1\u01a2\5\2\2\2\u01a2\u01a3\b\26\1\2\u01a3\u01ba\3\2\2\2\u01a4"+
		"\u01a5\5\16\b\2\u01a5\u01a6\b\26\1\2\u01a6\u01ba\3\2\2\2\u01a7\u01a8\7"+
		"=\2\2\u01a8\u01a9\5*\26\2\u01a9\u01aa\7?\2\2\u01aa\u01ab\b\26\1\2\u01ab"+
		"\u01ba\3\2\2\2\u01ac\u01ad\7\16\2\2\u01ad\u01ae\5*\26\2\u01ae\u01af\7"+
		"@\2\2\u01af\u01b0\b\26\1\2\u01b0\u01ba\3\2\2\2\u01b1\u01b2\7\3\2\2\u01b2"+
		"\u01b3\5\26\f\2\u01b3\u01b4\b\26\1\2\u01b4\u01ba\3\2\2\2\u01b5\u01b6\7"+
		"\3\2\2\u01b6\u01b7\5\66\34\2\u01b7\u01b8\b\26\1\2\u01b8\u01ba\3\2\2\2"+
		"\u01b9\u019f\3\2\2\2\u01b9\u01a4\3\2\2\2\u01b9\u01a7\3\2\2\2\u01b9\u01ac"+
		"\3\2\2\2\u01b9\u01b1\3\2\2\2\u01b9\u01b5\3\2\2\2\u01ba\u01c1\3\2\2\2\u01bb"+
		"\u01bc\f\6\2\2\u01bc\u01bd\7.\2\2\u01bd\u01be\7S\2\2\u01be\u01c0\b\26"+
		"\1\2\u01bf\u01bb\3\2\2\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2+\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c5\7A\2\2\u01c5"+
		"\u01c6\5> \2\u01c6\u01c7\b\27\1\2\u01c7-\3\2\2\2\u01c8\u01c9\7\20\2\2"+
		"\u01c9\u01ca\7S\2\2\u01ca\u01cb\7\n\2\2\u01cb\u01cc\5\f\7\2\u01cc\u01cd"+
		"\b\30\1\2\u01cd/\3\2\2\2\u01ce\u01cf\b\31\1\2\u01cf\u01d0\7T\2\2\u01d0"+
		"\u01d1\5\60\31\33\u01d1\u01d2\b\31\1\2\u01d2\u024f\3\2\2\2\u01d3\u01d4"+
		"\7;\2\2\u01d4\u01d5\5\60\31\27\u01d5\u01d6\b\31\1\2\u01d6\u024f\3\2\2"+
		"\2\u01d7\u01d8\7C\2\2\u01d8\u01d9\5\60\31\26\u01d9\u01da\b\31\1\2\u01da"+
		"\u024f\3\2\2\2\u01db\u01dc\7B\2\2\u01dc\u01dd\5\60\31\17\u01dd\u01de\b"+
		"\31\1\2\u01de\u024f\3\2\2\2\u01df\u01e0\7(\2\2\u01e0\u01e1\5\60\31\2\u01e1"+
		"\u01e2\7\37\2\2\u01e2\u01e3\5\60\31\2\u01e3\u01e4\7<\2\2\u01e4\u01e5\5"+
		"\60\31\f\u01e5\u01e6\b\31\1\2\u01e6\u024f\3\2\2\2\u01e7\u01e8\7(\2\2\u01e8"+
		"\u01e9\5\60\31\2\u01e9\u01ea\7\37\2\2\u01ea\u01eb\5\60\31\13\u01eb\u01ec"+
		"\b\31\1\2\u01ec\u024f\3\2\2\2\u01ed\u01ee\5\16\b\2\u01ee\u01ef\b\31\1"+
		"\2\u01ef\u024f\3\2\2\2\u01f0\u01f1\5\4\3\2\u01f1\u01f2\b\31\1\2\u01f2"+
		"\u024f\3\2\2\2\u01f3\u01f4\7\16\2\2\u01f4\u01f5\5\60\31\2\u01f5\u01f6"+
		"\7@\2\2\u01f6\u01f7\b\31\1\2\u01f7\u024f\3\2\2\2\u01f8\u01f9\7=\2\2\u01f9"+
		"\u01fa\5\60\31\2\u01fa\u01fb\7?\2\2\u01fb\u01fc\b\31\1\2\u01fc\u024f\3"+
		"\2\2\2\u01fd\u01fe\7\16\2\2\u01fe\u01ff\5\60\31\2\u01ff\u0200\7\63\2\2"+
		"\u0200\u0201\5\30\r\2\u0201\u0202\7@\2\2\u0202\u0203\b\31\1\2\u0203\u024f"+
		"\3\2\2\2\u0204\u0205\7\16\2\2\u0205\u020a\5\60\31\2\u0206\u0207\7\20\2"+
		"\2\u0207\u0209\5\60\31\2\u0208\u0206\3\2\2\2\u0209\u020c\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020d\3\2\2\2\u020c\u020a\3\2"+
		"\2\2\u020d\u020e\7@\2\2\u020e\u020f\b\31\1\2\u020f\u024f\3\2\2\2\u0210"+
		"\u0211\7\64\2\2\u0211\u0216\5\60\31\2\u0212\u0213\7\20\2\2\u0213\u0215"+
		"\5\60\31\2\u0214\u0212\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2"+
		"\u0216\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a"+
		"\7\26\2\2\u021a\u021b\b\31\1\2\u021b\u024f\3\2\2\2\u021c\u021d\5:\36\2"+
		"\u021d\u021e\b\31\1\2\u021e\u024f\3\2\2\2\u021f\u0220\7\5\2\2\u0220\u0221"+
		"\5\60\31\2\u0221\u0222\7\r\2\2\u0222\u0223\5\60\31\2\u0223\u0224\7\21"+
		"\2\2\u0224\u0225\b\31\1\2\u0225\u024f\3\2\2\2\u0226\u0227\7\13\2\2\u0227"+
		"\u0228\5\16\b\2\u0228\u0229\7\n\2\2\u0229\u022a\5\60\31\2\u022a\u022b"+
		"\7\36\2\2\u022b\u022c\5\60\31\2\u022c\u022d\7\r\2\2\u022d\u022e\5\60\31"+
		"\2\u022e\u022f\7\21\2\2\u022f\u0230\b\31\1\2\u0230\u024f\3\2\2\2\u0231"+
		"\u0232\7\13\2\2\u0232\u0233\5\16\b\2\u0233\u0234\7\n\2\2\u0234\u0235\5"+
		"\60\31\2\u0235\u0236\7\61\2\2\u0236\u0237\5\60\31\2\u0237\u0238\7\r\2"+
		"\2\u0238\u0239\5\60\31\2\u0239\u023a\7\21\2\2\u023a\u023b\b\31\1\2\u023b"+
		"\u024f\3\2\2\2\u023c\u023d\7\34\2\2\u023d\u023e\5\60\31\2\u023e\u023f"+
		"\7\67\2\2\u023f\u0240\5\2\2\2\u0240\u0241\b\31\1\2\u0241\u024f\3\2\2\2"+
		"\u0242\u0243\5*\26\2\u0243\u0244\b\31\1\2\u0244\u024f\3\2\2\2\u0245\u0246"+
		"\7)\2\2\u0246\u0247\5\60\31\2\u0247\u0248\7\67\2\2\u0248\u0249\5\2\2\2"+
		"\u0249\u024a\b\31\1\2\u024a\u024f\3\2\2\2\u024b\u024c\5 \21\2\u024c\u024d"+
		"\b\31\1\2\u024d\u024f\3\2\2\2\u024e\u01ce\3\2\2\2\u024e\u01d3\3\2\2\2"+
		"\u024e\u01d7\3\2\2\2\u024e\u01db\3\2\2\2\u024e\u01df\3\2\2\2\u024e\u01e7"+
		"\3\2\2\2\u024e\u01ed\3\2\2\2\u024e\u01f0\3\2\2\2\u024e\u01f3\3\2\2\2\u024e"+
		"\u01f8\3\2\2\2\u024e\u01fd\3\2\2\2\u024e\u0204\3\2\2\2\u024e\u0210\3\2"+
		"\2\2\u024e\u021c\3\2\2\2\u024e\u021f\3\2\2\2\u024e\u0226\3\2\2\2\u024e"+
		"\u0231\3\2\2\2\u024e\u023c\3\2\2\2\u024e\u0242\3\2\2\2\u024e\u0245\3\2"+
		"\2\2\u024e\u024b\3\2\2\2\u024f\u0284\3\2\2\2\u0250\u0251\f\32\2\2\u0251"+
		"\u0252\7\t\2\2\u0252\u0253\5\60\31\32\u0253\u0254\b\31\1\2\u0254\u0283"+
		"\3\2\2\2\u0255\u0256\f\25\2\2\u0256\u0257\7\b\2\2\u0257\u0258\5\60\31"+
		"\26\u0258\u0259\b\31\1\2\u0259\u0283\3\2\2\2\u025a\u025b\f\24\2\2\u025b"+
		"\u025c\7\22\2\2\u025c\u025d\5\60\31\25\u025d\u025e\b\31\1\2\u025e\u0283"+
		"\3\2\2\2\u025f\u0260\f\23\2\2\u0260\u0261\t\2\2\2\u0261\u0262\5\60\31"+
		"\24\u0262\u0263\b\31\1\2\u0263\u0283\3\2\2\2\u0264\u0265\f\22\2\2\u0265"+
		"\u0266\t\3\2\2\u0266\u0267\5\60\31\23\u0267\u0268\b\31\1\2\u0268\u0283"+
		"\3\2\2\2\u0269\u026a\f\21\2\2\u026a\u026b\t\4\2\2\u026b\u026c\5\60\31"+
		"\22\u026c\u026d\b\31\1\2\u026d\u0283\3\2\2\2\u026e\u026f\f\20\2\2\u026f"+
		"\u0270\t\5\2\2\u0270\u0271\5\60\31\21\u0271\u0272\b\31\1\2\u0272\u0283"+
		"\3\2\2\2\u0273\u0274\f\16\2\2\u0274\u0275\t\6\2\2\u0275\u0276\5\60\31"+
		"\17\u0276\u0277\b\31\1\2\u0277\u0283\3\2\2\2\u0278\u0279\f\r\2\2\u0279"+
		"\u027a\t\7\2\2\u027a\u027b\5\60\31\16\u027b\u027c\b\31\1\2\u027c\u0283"+
		"\3\2\2\2\u027d\u027e\f\7\2\2\u027e\u027f\7$\2\2\u027f\u0280\5\60\31\7"+
		"\u0280\u0281\b\31\1\2\u0281\u0283\3\2\2\2\u0282\u0250\3\2\2\2\u0282\u0255"+
		"\3\2\2\2\u0282\u025a\3\2\2\2\u0282\u025f\3\2\2\2\u0282\u0264\3\2\2\2\u0282"+
		"\u0269\3\2\2\2\u0282\u026e\3\2\2\2\u0282\u0273\3\2\2\2\u0282\u0278\3\2"+
		"\2\2\u0282\u027d\3\2\2\2\u0283\u0286\3\2\2\2\u0284\u0282\3\2\2\2\u0284"+
		"\u0285\3\2\2\2\u0285\61\3\2\2\2\u0286\u0284\3\2\2\2\u0287\u0288\7A\2\2"+
		"\u0288\u0289\5\36\20\2\u0289\u028a\b\32\1\2\u028a\63\3\2\2\2\u028b\u028c"+
		"\7T\2\2\u028c\u028d\7#\2\2\u028d\u028e\5\30\r\2\u028e\u028f\b\33\1\2\u028f"+
		"\u0293\3\2\2\2\u0290\u0291\7T\2\2\u0291\u0293\b\33\1\2\u0292\u028b\3\2"+
		"\2\2\u0292\u0290\3\2\2\2\u0293\65\3\2\2\2\u0294\u0296\5\f\7\2\u0295\u0294"+
		"\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0295\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029a\7\60\2\2\u029a\u029b\5\60\31\2\u029b\u029c"+
		"\b\34\1\2\u029c\67\3\2\2\2\u029d\u029e\5(\25\2\u029e\u029f\b\35\1\2\u029f"+
		"9\3\2\2\2\u02a0\u02a1\b\36\1\2\u02a1\u02a2\7\16\2\2\u02a2\u02a3\5:\36"+
		"\2\u02a3\u02a4\7@\2\2\u02a4\u02a5\b\36\1\2\u02a5\u02ab\3\2\2\2\u02a6\u02a7"+
		"\5*\26\2\u02a7\u02a8\5\60\31\2\u02a8\u02a9\b\36\1\2\u02a9\u02ab\3\2\2"+
		"\2\u02aa\u02a0\3\2\2\2\u02aa\u02a6\3\2\2\2\u02ab\u02b2\3\2\2\2\u02ac\u02ad"+
		"\f\4\2\2\u02ad\u02ae\5\60\31\2\u02ae\u02af\b\36\1\2\u02af\u02b1\3\2\2"+
		"\2\u02b0\u02ac\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3"+
		"\3\2\2\2\u02b3;\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b6\7-\2\2\u02b6\u02b7"+
		"\5\30\r\2\u02b7\u02b8\b\37\1\2\u02b8=\3\2\2\2\u02b9\u02bb\5\16\b\2\u02ba"+
		"\u02bc\5\f\7\2\u02bb\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02bb\3\2"+
		"\2\2\u02bd\u02be\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c0\7\n\2\2\u02c0"+
		"\u02c1\5\60\31\2\u02c1\u02c2\b \1\2\u02c2\u02d2\3\2\2\2\u02c3\u02c4\7"+
		"\16\2\2\u02c4\u02c5\5\16\b\2\u02c5\u02c6\7\63\2\2\u02c6\u02c7\5\30\r\2"+
		"\u02c7\u02c8\7@\2\2\u02c8\u02c9\7\n\2\2\u02c9\u02ca\5\60\31\2\u02ca\u02cb"+
		"\b \1\2\u02cb\u02d2\3\2\2\2\u02cc\u02cd\5\16\b\2\u02cd\u02ce\7\n\2\2\u02ce"+
		"\u02cf\5\60\31\2\u02cf\u02d0\b \1\2\u02d0\u02d2\3\2\2\2\u02d1\u02b9\3"+
		"\2\2\2\u02d1\u02c3\3\2\2\2\u02d1\u02cc\3\2\2\2\u02d2?\3\2\2\2\u02d3\u02d4"+
		"\7A\2\2\u02d4\u02d5\7T\2\2\u02d5\u02d6\7#\2\2\u02d6\u02d7\5\30\r\2\u02d7"+
		"\u02d8\b!\1\2\u02d8\u02dd\3\2\2\2\u02d9\u02da\7A\2\2\u02da\u02db\7T\2"+
		"\2\u02db\u02dd\b!\1\2\u02dc\u02d3\3\2\2\2\u02dc\u02d9\3\2\2\2\u02ddA\3"+
		"\2\2\2\u02de\u02df\5> \2\u02df\u02e0\b\"\1\2\u02e0\u02ea\3\2\2\2\u02e1"+
		"\u02e3\5> \2\u02e2\u02e4\5,\27\2\u02e3\u02e2\3\2\2\2\u02e4\u02e5\3\2\2"+
		"\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02e8"+
		"\b\"\1\2\u02e8\u02ea\3\2\2\2\u02e9\u02de\3\2\2\2\u02e9\u02e1\3\2\2\2\u02ea"+
		"C\3\2\2\2\u02eb\u02ec\5\16\b\2\u02ec\u02ed\7\n\2\2\u02ed\u02ee\7\6\2\2"+
		"\u02ee\u02f3\5\6\4\2\u02ef\u02f0\7\20\2\2\u02f0\u02f2\5\6\4\2\u02f1\u02ef"+
		"\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f6\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f7\7\'\2\2\u02f7\u02f8\b#"+
		"\1\2\u02f8\u0316\3\2\2\2\u02f9\u02fa\7S\2\2\u02fa\u02fb\7\n\2\2\u02fb"+
		"\u02ff\7T\2\2\u02fc\u02fe\5\34\17\2\u02fd\u02fc\3\2\2\2\u02fe\u0301\3"+
		"\2\2\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\3\2\2\2\u0301"+
		"\u02ff\3\2\2\2\u0302\u0316\b#\1\2\u0303\u0304\7S\2\2\u0304\u0305\7\n\2"+
		"\2\u0305\u0306\7T\2\2\u0306\u0307\7#\2\2\u0307\u030b\5\30\r\2\u0308\u030a"+
		"\5\34\17\2\u0309\u0308\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2"+
		"\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u030b\3\2\2\2\u030e\u030f"+
		"\b#\1\2\u030f\u0316\3\2\2\2\u0310\u0311\7S\2\2\u0311\u0312\7\65\2\2\u0312"+
		"\u0313\5\30\r\2\u0313\u0314\b#\1\2\u0314\u0316\3\2\2\2\u0315\u02eb\3\2"+
		"\2\2\u0315\u02f9\3\2\2\2\u0315\u0303\3\2\2\2\u0315\u0310\3\2\2\2\u0316"+
		"E\3\2\2\2\62Rer\u0085\u008f\u009a\u00a7\u00ab\u00b9\u00da\u00ec\u00f8"+
		"\u00fa\u0106\u0110\u0129\u0132\u013d\u0144\u0146\u0151\u015c\u0162\u016d"+
		"\u017e\u0181\u018a\u019d\u01b9\u01c1\u020a\u0216\u024e\u0282\u0284\u0292"+
		"\u0297\u02aa\u02b2\u02bd\u02d1\u02dc\u02e5\u02e9\u02f3\u02ff\u030b\u0315";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}