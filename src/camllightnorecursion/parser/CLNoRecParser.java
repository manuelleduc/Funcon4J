// Generated from  by ANTLR 4.2.2

package camllightnorecursion.parser;

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
public class CLNoRecParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__69=1, T__68=2, T__67=3, T__66=4, T__65=5, T__64=6, T__63=7, T__62=8, 
		T__61=9, T__60=10, T__59=11, T__58=12, T__57=13, T__56=14, T__55=15, T__54=16, 
		T__53=17, T__52=18, T__51=19, T__50=20, T__49=21, T__48=22, T__47=23, 
		T__46=24, T__45=25, T__44=26, T__43=27, T__42=28, T__41=29, T__40=30, 
		T__39=31, T__38=32, T__37=33, T__36=34, T__35=35, T__34=36, T__33=37, 
		T__32=38, T__31=39, T__30=40, T__29=41, T__28=42, T__27=43, T__26=44, 
		T__25=45, T__24=46, T__23=47, T__22=48, T__21=49, T__20=50, T__19=51, 
		T__18=52, T__17=53, T__16=54, T__15=55, T__14=56, T__13=57, T__12=58, 
		T__11=59, T__10=60, T__9=61, T__8=62, T__7=63, T__6=64, T__5=65, T__4=66, 
		T__3=67, T__2=68, T__1=69, T__0=70, CHARTOKEN=71, NULLTOKEN=72, EMPTYLISTTOKEN=73, 
		EMPTYARRAYTOKEN=74, WILDCARDTOKEN=75, BOOLTOKEN=76, CARRIAGERETURN=77, 
		FORMFEED=78, WS=79, COMMENT=80, INTTOKEN=81, STRINGTOKEN=82, FLOATTOKEN=83, 
		LINEFEED=84, HORIZONTALTAB=85, IDTOKEN=86, CONSTRTOKEN=87;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'!='", "'while'", "'{'", "'&&'", "'**'", "'::'", 
		"'='", "'for'", "'^'", "'do'", "'('", "','", "'<-'", "'done'", "'mod'", 
		"'>='", "'<'", "';;'", "']'", "'@'", "'*.'", "'type'", "'<>'", "'|]'", 
		"'let'", "'match'", "'function'", "'downto'", "'then'", "'+'", "'/'", 
		"'as'", "'of'", "'.('", "';'", "'||'", "'/.'", "'}'", "'if'", "'try'", 
		"':='", "'<='", "'[|'", "'&'", "'''", "'*'", "'.'", "'exception'", "'->'", 
		"'to'", "'mutable'", "':'", "'['", "'=='", "'|'", "'with'", "'>'", "'+.'", 
		"'or'", "'-.'", "'!'", "'else'", "'begin'", "'in'", "'end'", "')'", "'and'", 
		"'not'", "'-'", "CHARTOKEN", "NULLTOKEN", "EMPTYLISTTOKEN", "EMPTYARRAYTOKEN", 
		"'_'", "BOOLTOKEN", "CARRIAGERETURN", "FORMFEED", "WS", "COMMENT", "INTTOKEN", 
		"STRINGTOKEN", "FLOATTOKEN", "LINEFEED", "HORIZONTALTAB", "IDTOKEN", "CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decllabeltype = 2, RULE_vartype = 3, 
		RULE_decl = 4, RULE_patt = 5, RULE_ident = 6, RULE_declorexp = 7, RULE_pattlist = 8, 
		RULE_emptylist = 9, RULE_pattmatchsingle = 10, RULE_type = 11, RULE_headtaillistpatt = 12, 
		RULE_recordsingle = 13, RULE_decltypeappendix = 14, RULE_declmono = 15, 
		RULE_letExp = 16, RULE_decloptionalvartypes = 17, RULE_declnewtypeappendix = 18, 
		RULE_patttuple = 19, RULE_declimpl = 20, RULE_function = 21, RULE_recanddecl = 22, 
		RULE_recordpattappendix = 23, RULE_exp = 24, RULE_anddecl = 25, RULE_varianttype = 26, 
		RULE_pattmatchcurried = 27, RULE_prog = 28, RULE_exparray = 29, RULE_functionapp = 30, 
		RULE_tupletypelist = 31, RULE_recdeclmono = 32, RULE_declexceptionappendix = 33, 
		RULE_recdecl = 34, RULE_declnewtype = 35;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decllabeltype", "vartype", "decl", "patt", "ident", 
		"declorexp", "pattlist", "emptylist", "pattmatchsingle", "type", "headtaillistpatt", 
		"recordsingle", "decltypeappendix", "declmono", "letExp", "decloptionalvartypes", 
		"declnewtypeappendix", "patttuple", "declimpl", "function", "recanddecl", 
		"recordpattappendix", "exp", "anddecl", "varianttype", "pattmatchcurried", 
		"prog", "exparray", "functionapp", "tupletypelist", "recdeclmono", "declexceptionappendix", 
		"recdecl", "declnewtype"
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


	private camllightnorecursion.NoRecAlg builder;
	public void setBuilder(camllightnorecursion.NoRecAlg builder) { this.builder = builder; }
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

	public CLNoRecParser(TokenStream input) {
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
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); match(56);
				setState(73); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				setState(77); match(56);
				setState(78); ((PattmatchContext)_localctx).pattmatch_1 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchMulti((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle),(((PattmatchContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
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
		public Token STRINGTOKEN_0;
		public Token FLOATTOKEN_0;
		public Token CONSTRTOKEN_0;
		public Token CHARTOKEN_0;
		public Token BOOLTOKEN_0;
		public TerminalNode FLOATTOKEN() { return getToken(CLNoRecParser.FLOATTOKEN, 0); }
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoRecParser.CONSTRTOKEN, 0); }
		public TerminalNode NULLTOKEN() { return getToken(CLNoRecParser.NULLTOKEN, 0); }
		public TerminalNode INTTOKEN() { return getToken(CLNoRecParser.INTTOKEN, 0); }
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public TerminalNode CHARTOKEN() { return getToken(CLNoRecParser.CHARTOKEN, 0); }
		public TerminalNode BOOLTOKEN() { return getToken(CLNoRecParser.BOOLTOKEN, 0); }
		public TerminalNode STRINGTOKEN() { return getToken(CLNoRecParser.STRINGTOKEN, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constant);
		try {
			setState(103);
			switch (_input.LA(1)) {
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case INTTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(91); ((ConstantContext)_localctx).INTTOKEN_0 = match(INTTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(inttoken((((ConstantContext)_localctx).INTTOKEN_0!=null?((ConstantContext)_localctx).INTTOKEN_0.getText():null)));
				}
				break;
			case STRINGTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(93); ((ConstantContext)_localctx).STRINGTOKEN_0 = match(STRINGTOKEN);
				((ConstantContext)_localctx)._constant =  builder.string(stringtoken((((ConstantContext)_localctx).STRINGTOKEN_0!=null?((ConstantContext)_localctx).STRINGTOKEN_0.getText():null)));
				}
				break;
			case FLOATTOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(95); ((ConstantContext)_localctx).FLOATTOKEN_0 = match(FLOATTOKEN);
				((ConstantContext)_localctx)._constant =  builder.float_(floattoken((((ConstantContext)_localctx).FLOATTOKEN_0!=null?((ConstantContext)_localctx).FLOATTOKEN_0.getText():null)));
				}
				break;
			case CONSTRTOKEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(97); ((ConstantContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((ConstantContext)_localctx)._constant =  builder.constr(constrtoken((((ConstantContext)_localctx).CONSTRTOKEN_0!=null?((ConstantContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;
			case CHARTOKEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(99); ((ConstantContext)_localctx).CHARTOKEN_0 = match(CHARTOKEN);
				((ConstantContext)_localctx)._constant =  builder.char_(chartoken((((ConstantContext)_localctx).CHARTOKEN_0!=null?((ConstantContext)_localctx).CHARTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(101); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
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

	public static class DecllabeltypeContext extends ParserRuleContext {
		public Object _decllabeltype;
		public Token IDTOKEN_0;
		public TypeContext type_1;
		public TerminalNode IDTOKEN() { return getToken(CLNoRecParser.IDTOKEN, 0); }
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
			setState(116);
			switch (_input.LA(1)) {
			case IDTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(106); match(53);
				setState(107); ((DecllabeltypeContext)_localctx).type_1 = type(0);
				((DecllabeltypeContext)_localctx)._decllabeltype =  builder.declLabelType(idtoken((((DecllabeltypeContext)_localctx).IDTOKEN_0!=null?((DecllabeltypeContext)_localctx).IDTOKEN_0.getText():null)),(((DecllabeltypeContext)_localctx).type_1._type));
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 2);
				{
				setState(110); match(52);
				setState(111); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(112); match(53);
				setState(113); ((DecllabeltypeContext)_localctx).type_1 = type(0);
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
		public TerminalNode IDTOKEN() { return getToken(CLNoRecParser.IDTOKEN, 0); }
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
			setState(118); match(46);
			setState(119); ((VartypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
		public DeclmonoContext declmono_0;
		public DecloptionalvartypesContext decloptionalvartypes_0;
		public DeclnewtypeappendixContext declnewtypeappendix;
		public List<DeclnewtypeappendixContext> declnewtypeappendix_1_list = new ArrayList<DeclnewtypeappendixContext>();
		public Token CONSTRTOKEN_0;
		public TypeContext type_1;
		public DeclexceptionappendixContext declexceptionappendix;
		public List<DeclexceptionappendixContext> declexceptionappendix_2_list = new ArrayList<DeclexceptionappendixContext>();
		public List<DeclexceptionappendixContext> declexceptionappendix_1_list = new ArrayList<DeclexceptionappendixContext>();
		public DeclContext decl_0;
		public AnddeclContext anddecl;
		public List<AnddeclContext> anddecl_1_list = new ArrayList<AnddeclContext>();
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoRecParser.CONSTRTOKEN, 0); }
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
			setState(168);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125); match(23);
				setState(126); ((DeclContext)_localctx).decloptionalvartypes_0 = decloptionalvartypes();
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==68) {
					{
					{
					setState(127); ((DeclContext)_localctx).declnewtypeappendix = declnewtypeappendix();
					((DeclContext)_localctx).declnewtypeappendix_1_list.add(((DeclContext)_localctx).declnewtypeappendix);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declNewType((((DeclContext)_localctx).decloptionalvartypes_0._decloptionalvartypes),lift("_declnewtypeappendix", ((DeclContext)_localctx).declnewtypeappendix_1_list));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135); match(49);
				setState(136); ((DeclContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(137); match(34);
				setState(138); ((DeclContext)_localctx).type_1 = type(0);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==68) {
					{
					{
					setState(139); ((DeclContext)_localctx).declexceptionappendix = declexceptionappendix();
					((DeclContext)_localctx).declexceptionappendix_2_list.add(((DeclContext)_localctx).declexceptionappendix);
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declConstrException(constrtoken((((DeclContext)_localctx).CONSTRTOKEN_0!=null?((DeclContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DeclContext)_localctx).type_1._type),lift("_declexceptionappendix", ((DeclContext)_localctx).declexceptionappendix_2_list));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147); match(49);
				setState(148); ((DeclContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==68) {
					{
					{
					setState(149); ((DeclContext)_localctx).declexceptionappendix = declexceptionappendix();
					((DeclContext)_localctx).declexceptionappendix_1_list.add(((DeclContext)_localctx).declexceptionappendix);
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declEnumException(constrtoken((((DeclContext)_localctx).CONSTRTOKEN_0!=null?((DeclContext)_localctx).CONSTRTOKEN_0.getText():null)),lift("_declexceptionappendix", ((DeclContext)_localctx).declexceptionappendix_1_list));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156); match(26);
				setState(157); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(160); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161); ((DeclContext)_localctx).anddecl = anddecl();
					((DeclContext)_localctx).anddecl_1_list.add(((DeclContext)_localctx).anddecl);
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==68 );
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
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoRecParser.CONSTRTOKEN, 0); }
		public RecordpattappendixContext recordpattappendix(int i) {
			return getRuleContext(RecordpattappendixContext.class,i);
		}
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public TerminalNode WILDCARDTOKEN() { return getToken(CLNoRecParser.WILDCARDTOKEN, 0); }
		public List<PattContext> patt() {
			return getRuleContexts(PattContext.class);
		}
		public List<PatttupleContext> patttuple() {
			return getRuleContexts(PatttupleContext.class);
		}
		public PattlistContext pattlist() {
			return getRuleContext(PattlistContext.class,0);
		}
		public TerminalNode IDTOKEN() { return getToken(CLNoRecParser.IDTOKEN, 0); }
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
			setState(233);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(171); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(172); ((PattContext)_localctx).patt_1 = patt(6);
				((PattContext)_localctx)._patt =  builder.pattConstrPatt(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt));
				}
				break;

			case 2:
				{
				setState(175); match(4);
				setState(176); ((PattContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(177); match(8);
				setState(178); ((PattContext)_localctx).patt_1 = patt(0);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==13) {
					{
					{
					setState(179); ((PattContext)_localctx).recordpattappendix = recordpattappendix();
					((PattContext)_localctx).recordpattappendix_2_list.add(((PattContext)_localctx).recordpattappendix);
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185); match(39);
				((PattContext)_localctx)._patt =  builder.recordPatt(idtoken((((PattContext)_localctx).IDTOKEN_0!=null?((PattContext)_localctx).IDTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt),lift("_recordpattappendix", ((PattContext)_localctx).recordpattappendix_2_list));
				}
				break;

			case 3:
				{
				setState(188); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(191); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 5:
				{
				setState(193); match(12);
				setState(194); ((PattContext)_localctx).patt_0 = patt(0);
				setState(195); match(67);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 6:
				{
				setState(198); match(12);
				setState(199); ((PattContext)_localctx).patt_0 = patt(0);
				setState(200); match(53);
				setState(201); ((PattContext)_localctx).type_1 = type(0);
				setState(202); match(67);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 7:
				{
				setState(205); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 8:
				{
				setState(208); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((PattContext)_localctx)._patt =  builder.pattConstr(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(210); match(12);
				setState(211); ((PattContext)_localctx).patt_0 = patt(0);
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(212); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(215); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==13 );
				setState(217); match(67);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 10:
				{
				setState(220); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 11:
				{
				setState(223); match(54);
				setState(224); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(225); match(20);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 12:
				{
				setState(228); match(54);
				setState(229); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(230); match(20);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(245);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(235);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(236); match(56);
						setState(237); ((PattContext)_localctx).patt_1 = patt(9);
						((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).patt_1._patt));
						}
						break;

					case 2:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(240);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(241); match(33);
						setState(242); ((PattContext)_localctx).ident_1 = ident();
						((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
						}
						break;
					}
					} 
				}
				setState(249);
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
		public TerminalNode IDTOKEN() { return getToken(CLNoRecParser.IDTOKEN, 0); }
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
			setState(250); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
			setState(259);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256); ((DeclorexpContext)_localctx).decl_0 = decl();
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
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
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
				setState(265); match(13);
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

	public static class EmptylistContext extends ParserRuleContext {
		public Object _emptylist;
		public Token EMPTYLISTTOKEN_0;
		public TerminalNode EMPTYLISTTOKEN() { return getToken(CLNoRecParser.EMPTYLISTTOKEN, 0); }
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
			setState(271); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
			setState(274); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(275); match(50);
			setState(276); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		public TypeContext type;
		public List<TypeContext> type_0tail = new ArrayList<TypeContext>();
		public TypeContext type_1;
		public TupletypelistContext tupletypelist;
		public List<TupletypelistContext> tupletypelist_1_list = new ArrayList<TupletypelistContext>();
		public Token IDTOKEN_1;
		public TupletypelistContext tupletypelist(int i) {
			return getRuleContext(TupletypelistContext.class,i);
		}
		public TerminalNode IDTOKEN() { return getToken(CLNoRecParser.IDTOKEN, 0); }
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
			setState(303);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(280); ((TypeContext)_localctx).vartype_0 = vartype();
				((TypeContext)_localctx)._type =  builder.varTypeType((((TypeContext)_localctx).vartype_0._vartype));
				}
				break;

			case 2:
				{
				setState(283); match(12);
				setState(284); ((TypeContext)_localctx).type_0 = type(0);
				setState(285); match(67);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;

			case 3:
				{
				setState(288); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;

			case 4:
				{
				setState(290); match(12);
				{
				setState(291); ((TypeContext)_localctx).type_0 = type(0);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==13) {
					{
					{
					setState(292); match(13);
					setState(293); ((TypeContext)_localctx).type = type(0);
					((TypeContext)_localctx).type_0tail.add(((TypeContext)_localctx).type);
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(299); match(67);
				setState(300); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typesIdType(lift("_type", ((TypeContext)_localctx).type_0tail, ((TypeContext)_localctx).type_0._type),idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(323);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(321);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(305);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(306); match(50);
						setState(307); ((TypeContext)_localctx).type_1 = type(5);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(310);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(312); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(311); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(314); 
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
						setState(318);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(319); ((TypeContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						((TypeContext)_localctx)._type =  builder.typeIdType((((TypeContext)_localctx).type_0._type),idtoken((((TypeContext)_localctx).IDTOKEN_1!=null?((TypeContext)_localctx).IDTOKEN_1.getText():null)));
						}
						break;
					}
					} 
				}
				setState(325);
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
			setState(334);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(327); match(7);
				setState(328); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
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
		public TerminalNode IDTOKEN() { return getToken(CLNoRecParser.IDTOKEN, 0); }
		public RecordsingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_recordsingle; }
	}

	public final RecordsingleContext recordsingle() throws RecognitionException {
		RecordsingleContext _localctx = new RecordsingleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_recordsingle);
		try {
			setState(347);
			switch (_input.LA(1)) {
			case IDTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(336); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(337); match(8);
				setState(338); ((RecordsingleContext)_localctx).exp_1 = exp(0);
				((RecordsingleContext)_localctx)._recordsingle =  builder.recordEntrySingle(idtoken((((RecordsingleContext)_localctx).IDTOKEN_0!=null?((RecordsingleContext)_localctx).IDTOKEN_0.getText():null)),(((RecordsingleContext)_localctx).exp_1._exp));
				}
				break;
			case 52:
				enterOuterAlt(_localctx, 2);
				{
				setState(341); match(52);
				setState(342); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(343); match(8);
				setState(344); ((RecordsingleContext)_localctx).exp_1 = exp(0);
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

	public static class DecltypeappendixContext extends ParserRuleContext {
		public Object _decltypeappendix;
		public Token CONSTRTOKEN_0;
		public TypeContext type_1;
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoRecParser.CONSTRTOKEN, 0); }
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
		enterRule(_localctx, 28, RULE_decltypeappendix);
		try {
			setState(358);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(349); match(56);
				setState(350); ((DecltypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(351); match(34);
				setState(352); ((DecltypeappendixContext)_localctx).type_1 = type(0);
				((DecltypeappendixContext)_localctx)._decltypeappendix =  builder.declConstrTypeAppendix(constrtoken((((DecltypeappendixContext)_localctx).CONSTRTOKEN_0!=null?((DecltypeappendixContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DecltypeappendixContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355); match(56);
				setState(356); ((DecltypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
			setState(375);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(361); match(8);
				setState(362); ((DeclmonoContext)_localctx).exp_1 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMono((((DeclmonoContext)_localctx).patt_0._patt),(((DeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(367); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(366); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(369); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 12) | (1L << 54))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (CHARTOKEN - 71)) | (1L << (NULLTOKEN - 71)) | (1L << (EMPTYLISTTOKEN - 71)) | (1L << (WILDCARDTOKEN - 71)) | (1L << (BOOLTOKEN - 71)) | (1L << (INTTOKEN - 71)) | (1L << (STRINGTOKEN - 71)) | (1L << (FLOATTOKEN - 71)) | (1L << (IDTOKEN - 71)) | (1L << (CONSTRTOKEN - 71)))) != 0) );
				setState(371); match(8);
				setState(372); ((DeclmonoContext)_localctx).exp_2 = exp(0);
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
			setState(377); ((LetExpContext)_localctx).decl_0 = decl();
			setState(378); match(65);
			setState(379); ((LetExpContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 34, RULE_decloptionalvartypes);
		int _la;
		try {
			setState(404);
			switch (_input.LA(1)) {
			case 46:
				enterOuterAlt(_localctx, 1);
				{
				setState(382); ((DecloptionalvartypesContext)_localctx).vartype_0 = vartype();
				setState(383); ((DecloptionalvartypesContext)_localctx).declnewtype_1 = declnewtype();
				((DecloptionalvartypesContext)_localctx)._decloptionalvartypes =  builder.declNewTypeWithVarType((((DecloptionalvartypesContext)_localctx).vartype_0._vartype),(((DecloptionalvartypesContext)_localctx).declnewtype_1._declnewtype));
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 2);
				{
				setState(386); match(12);
				setState(395);
				_la = _input.LA(1);
				if (_la==46) {
					{
					setState(387); ((DecloptionalvartypesContext)_localctx).vartype_0 = vartype();
					setState(392);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==13) {
						{
						{
						setState(388); match(13);
						setState(389); ((DecloptionalvartypesContext)_localctx).vartype = vartype();
						((DecloptionalvartypesContext)_localctx).vartype_0tail.add(((DecloptionalvartypesContext)_localctx).vartype);
						}
						}
						setState(394);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(397); match(67);
				setState(398); ((DecloptionalvartypesContext)_localctx).declnewtype_0 = declnewtype();
				((DecloptionalvartypesContext)_localctx)._decloptionalvartypes =  builder.declNewTypeWithVarTypes(lift("_vartype", ((DecloptionalvartypesContext)_localctx).vartype_0tail, ((DecloptionalvartypesContext)_localctx).vartype_0._vartype),(((DecloptionalvartypesContext)_localctx).declnewtype_0._declnewtype));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(401); ((DecloptionalvartypesContext)_localctx).declnewtype_0 = declnewtype();
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
		enterRule(_localctx, 36, RULE_declnewtypeappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406); match(68);
			setState(407); ((DeclnewtypeappendixContext)_localctx).decloptionalvartypes_0 = decloptionalvartypes();
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
		enterRule(_localctx, 38, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410); match(13);
			setState(411); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
		enterRule(_localctx, 40, RULE_declimpl);
		try {
			setState(423);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(415); match(19);
				setState(416); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(419); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(420); match(19);
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
		public PattmatchContext pattmatch_0;
		public IdentContext ident_0;
		public FunctionContext function_0;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchcurriedContext pattmatchcurried_0;
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
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_function);
		try {
			setState(450);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(425); match(28);
				setState(426); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(429); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432); match(64);
				setState(433); ((FunctionContext)_localctx).function_0 = function();
				setState(434); match(66);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(437); match(12);
				setState(438); ((FunctionContext)_localctx).function_0 = function();
				setState(439); match(67);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(442); match(1);
				setState(443); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(446); match(1);
				setState(447); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
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
		enterRule(_localctx, 44, RULE_recanddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452); match(68);
			setState(453); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
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
		public TerminalNode IDTOKEN() { return getToken(CLNoRecParser.IDTOKEN, 0); }
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
		enterRule(_localctx, 46, RULE_recordpattappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456); match(13);
			setState(457); ((RecordpattappendixContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			setState(458); match(8);
			setState(459); ((RecordpattappendixContext)_localctx).patt_1 = patt(0);
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
		public FunctionappContext functionapp_0;
		public ExpContext exp_3;
		public PattmatchContext pattmatch_1;
		public FunctionContext function_0;
		public LetExpContext letExp_0;
		public Token op_1512;
		public Token op_1511;
		public Token op_1509;
		public Token op_1508;
		public Token IDTOKEN_1;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoRecParser.CONSTRTOKEN, 0); }
		public LetExpContext letExp() {
			return getRuleContext(LetExpContext.class,0);
		}
		public List<RecordsingleContext> recordsingle() {
			return getRuleContexts(RecordsingleContext.class);
		}
		public RecordsingleContext recordsingle(int i) {
			return getRuleContext(RecordsingleContext.class,i);
		}
		public FunctionappContext functionapp() {
			return getRuleContext(FunctionappContext.class,0);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public TerminalNode EMPTYARRAYTOKEN() { return getToken(CLNoRecParser.EMPTYARRAYTOKEN, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode IDTOKEN() { return getToken(CLNoRecParser.IDTOKEN, 0); }
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(463); ((ExpContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(464); ((ExpContext)_localctx).exp_1 = exp(34);
				((ExpContext)_localctx)._exp =  builder.constrExp(constrtoken((((ExpContext)_localctx).CONSTRTOKEN_0!=null?((ExpContext)_localctx).CONSTRTOKEN_0.getText():null)),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				{
				setState(467); match(62);
				setState(468); ((ExpContext)_localctx).exp_0 = exp(28);
				((ExpContext)_localctx)._exp =  builder.dereferenceExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 3:
				{
				setState(471); match(61);
				setState(472); ((ExpContext)_localctx).exp_0 = exp(26);
				((ExpContext)_localctx)._exp =  builder.floatNegateExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(475); match(70);
				setState(476); ((ExpContext)_localctx).exp_0 = exp(25);
				((ExpContext)_localctx)._exp =  builder.intUnarySub((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(479); match(69);
				setState(480); ((ExpContext)_localctx).exp_0 = exp(18);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 6:
				{
				setState(483); match(40);
				setState(484); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(485); match(30);
				setState(486); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(487); match(63);
				setState(488); ((ExpContext)_localctx).exp_2 = exp(10);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 7:
				{
				setState(491); match(40);
				setState(492); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(493); match(30);
				setState(494); ((ExpContext)_localctx).exp_1 = exp(9);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 8:
				{
				setState(497); ((ExpContext)_localctx).EMPTYARRAYTOKEN_0 = match(EMPTYARRAYTOKEN);
				((ExpContext)_localctx)._exp =  builder.emptyArray(emptyarraytoken((((ExpContext)_localctx).EMPTYARRAYTOKEN_0!=null?((ExpContext)_localctx).EMPTYARRAYTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(499); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 10:
				{
				setState(502); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 11:
				{
				setState(505); match(12);
				setState(506); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(507); match(67);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 12:
				{
				setState(510); match(64);
				setState(511); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(512); match(66);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(515); match(12);
				setState(516); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(517); match(53);
				setState(518); ((ExpContext)_localctx).type_1 = type(0);
				setState(519); match(67);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 14:
				{
				setState(522); match(12);
				{
				setState(523); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(528);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==13) {
					{
					{
					setState(524); match(13);
					setState(525); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(530);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(531); match(67);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 15:
				{
				setState(534); match(54);
				{
				setState(535); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==13) {
					{
					{
					setState(536); match(13);
					setState(537); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(542);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(543); match(20);
				((ExpContext)_localctx)._exp =  builder.expList(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 16:
				{
				setState(546); match(44);
				setState(547); ((ExpContext)_localctx).exparray_0 = exparray();
				setState(549);
				_la = _input.LA(1);
				if (_la==13) {
					{
					setState(548); match(13);
					}
				}

				setState(551); match(25);
				((ExpContext)_localctx)._exp =  builder.arrayMulti((((ExpContext)_localctx).exparray_0._exparray));
				}
				break;

			case 17:
				{
				setState(554); match(44);
				setState(555); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(557);
				_la = _input.LA(1);
				if (_la==13) {
					{
					setState(556); match(13);
					}
				}

				setState(559); match(25);
				((ExpContext)_localctx)._exp =  builder.arraySingle((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 18:
				{
				setState(562); match(4);
				{
				setState(563); ((ExpContext)_localctx).recordsingle_0 = recordsingle();
				setState(568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==13) {
					{
					{
					setState(564); match(13);
					setState(565); ((ExpContext)_localctx).recordsingle = recordsingle();
					((ExpContext)_localctx).recordsingle_0tail.add(((ExpContext)_localctx).recordsingle);
					}
					}
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(571); match(39);
				((ExpContext)_localctx)._exp =  builder.recordExp(lift("_recordsingle", ((ExpContext)_localctx).recordsingle_0tail, ((ExpContext)_localctx).recordsingle_0._recordsingle));
				}
				break;

			case 19:
				{
				setState(574); ((ExpContext)_localctx).functionapp_0 = functionapp(0);
				((ExpContext)_localctx)._exp =  builder.functionApplicationExp((((ExpContext)_localctx).functionapp_0._functionapp));
				}
				break;

			case 20:
				{
				setState(577); match(3);
				setState(578); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(579); match(11);
				setState(580); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(581); match(15);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 21:
				{
				setState(584); match(9);
				setState(585); ((ExpContext)_localctx).ident_0 = ident();
				setState(586); match(8);
				setState(587); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(588); match(29);
				setState(589); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(590); match(11);
				setState(591); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(592); match(15);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 22:
				{
				setState(595); match(9);
				setState(596); ((ExpContext)_localctx).ident_0 = ident();
				setState(597); match(8);
				setState(598); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(599); match(51);
				setState(600); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(601); match(11);
				setState(602); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(603); match(15);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 23:
				{
				setState(606); match(27);
				setState(607); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(608); match(57);
				setState(609); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 24:
				{
				setState(612); ((ExpContext)_localctx).function_0 = function();
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 25:
				{
				setState(615); match(41);
				setState(616); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(617); match(57);
				setState(618); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.tryWithExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 26:
				{
				setState(621); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(706);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(626);
						if (!(precpred(_ctx, 33))) throw new FailedPredicateException(this, "precpred(_ctx, 33)");
						setState(627); match(7);
						setState(628); ((ExpContext)_localctx).exp_1 = exp(33);
						((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(631);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(632); match(6);
						setState(633); ((ExpContext)_localctx).exp_1 = exp(25);
						((ExpContext)_localctx)._exp =  builder.floatPowerExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(636);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(637); match(16);
						setState(638); ((ExpContext)_localctx).exp_1 = exp(24);
						((ExpContext)_localctx)._exp =  builder.intMod((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(641);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(642);
						((ExpContext)_localctx).op_1512 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 22) | (1L << 32) | (1L << 38) | (1L << 47))) != 0)) ) {
							((ExpContext)_localctx).op_1512 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(643); ((ExpContext)_localctx).exp_1 = exp(23);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/") ? builder.intDivide(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*.") ? builder.floatMultiplyExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*") ? builder.intMultiply(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/.") ? builder.floatDivideExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(646);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(647);
						((ExpContext)_localctx).op_1511 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (31 - 31)) | (1L << (59 - 31)) | (1L << (61 - 31)) | (1L << (70 - 31)))) != 0)) ) {
							((ExpContext)_localctx).op_1511 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(648); ((ExpContext)_localctx).exp_1 = exp(22);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+.") ? builder.floatAddExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-.") ? builder.floatSubtractExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+") ? builder.intAdd(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-") ? builder.intSub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(651);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(652);
						((ExpContext)_localctx).op_1509 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==10 || _la==21) ) {
							((ExpContext)_localctx).op_1509 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(653); ((ExpContext)_localctx).exp_1 = exp(21);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1509!=null?((ExpContext)_localctx).op_1509.getText():null).equals("@") ? builder.listConcatExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1509!=null?((ExpContext)_localctx).op_1509.getText():null).equals("^") ? builder.stringAppendExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(656);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(657);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 8) | (1L << 17) | (1L << 18) | (1L << 24) | (1L << 43) | (1L << 55) | (1L << 58))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(658); ((ExpContext)_localctx).exp_1 = exp(20);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.smallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<>") ? builder.notEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("!=") ? builder.notPhysicalEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.greaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("==") ? builder.physicalEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.smaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.equal(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.greater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(661);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(662);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==45) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(663); ((ExpContext)_localctx).exp_1 = exp(18);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(666);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(667);
						_la = _input.LA(1);
						if ( !(_la==37 || _la==60) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(668); ((ExpContext)_localctx).exp_1 = exp(17);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(671);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(672); match(42);
						setState(673); ((ExpContext)_localctx).exp_1 = exp(15);
						((ExpContext)_localctx)._exp =  builder.refAssignExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(676);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(677); match(48);
						setState(678); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						setState(679); match(14);
						setState(680); ((ExpContext)_localctx).exp_2 = exp(14);
						((ExpContext)_localctx)._exp =  builder.recordAssignExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(683);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(684); match(35);
						setState(685); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(686); match(67);
						setState(687); match(14);
						setState(688); ((ExpContext)_localctx).exp_2 = exp(12);
						((ExpContext)_localctx)._exp =  builder.arrayAssign((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 13:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(691);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(692); match(36);
						setState(693); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 14:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(696);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(697); match(48);
						setState(698); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						((ExpContext)_localctx)._exp =  builder.recordSelectExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)));
						}
						break;

					case 15:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(700);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(701); match(35);
						setState(702); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(703); match(67);
						((ExpContext)_localctx)._exp =  builder.arraySelect((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
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
		enterRule(_localctx, 50, RULE_anddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711); match(68);
			setState(712); ((AnddeclContext)_localctx).declmono_0 = declmono();
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
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoRecParser.CONSTRTOKEN, 0); }
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
		enterRule(_localctx, 52, RULE_varianttype);
		try {
			setState(722);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(715); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(716); match(34);
				setState(717); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 54, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(724); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(727); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 12) | (1L << 54))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (CHARTOKEN - 71)) | (1L << (NULLTOKEN - 71)) | (1L << (EMPTYLISTTOKEN - 71)) | (1L << (WILDCARDTOKEN - 71)) | (1L << (BOOLTOKEN - 71)) | (1L << (INTTOKEN - 71)) | (1L << (STRINGTOKEN - 71)) | (1L << (FLOATTOKEN - 71)) | (1L << (IDTOKEN - 71)) | (1L << (CONSTRTOKEN - 71)))) != 0) );
			setState(729); match(50);
			setState(730); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 56, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733); ((ProgContext)_localctx).declimpl_0 = declimpl();
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
		enterRule(_localctx, 58, RULE_exparray);
		try {
			setState(746);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(737); match(13);
				setState(738); ((ExparrayContext)_localctx).exparray_1 = exparray();
				((ExparrayContext)_localctx)._exparray =  builder.innerExpArrayMulti((((ExparrayContext)_localctx).exp_0._exp),(((ExparrayContext)_localctx).exparray_1._exparray));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(742); match(13);
				setState(743); ((ExparrayContext)_localctx).exp_1 = exp(0);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_functionapp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(749); match(12);
				setState(750); ((FunctionappContext)_localctx).functionapp_0 = functionapp(0);
				setState(751); match(67);
				((FunctionappContext)_localctx)._functionapp =  builder.functionApplicationBracketed((((FunctionappContext)_localctx).functionapp_0._functionapp));
				}
				break;

			case 2:
				{
				setState(754); ((FunctionappContext)_localctx).function_0 = function();
				setState(755); ((FunctionappContext)_localctx).exp_1 = exp(0);
				((FunctionappContext)_localctx)._functionapp =  builder.functionApplication((((FunctionappContext)_localctx).function_0._function),(((FunctionappContext)_localctx).exp_1._exp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionappContext(_parentctx, _parentState);
					_localctx.functionapp_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_functionapp);
					setState(760);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(761); ((FunctionappContext)_localctx).exp_1 = exp(0);
					((FunctionappContext)_localctx)._functionapp =  builder.functionApplicationApplication((((FunctionappContext)_localctx).functionapp_0._functionapp),(((FunctionappContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 62, RULE_tupletypelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769); match(47);
			setState(770); ((TupletypelistContext)_localctx).type_0 = type(0);
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
		public ExpContext exp_1;
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
		enterRule(_localctx, 64, RULE_recdeclmono);
		int _la;
		try {
			setState(797);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(773); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(775); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(774); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(777); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 12) | (1L << 54))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (CHARTOKEN - 71)) | (1L << (NULLTOKEN - 71)) | (1L << (EMPTYLISTTOKEN - 71)) | (1L << (WILDCARDTOKEN - 71)) | (1L << (BOOLTOKEN - 71)) | (1L << (INTTOKEN - 71)) | (1L << (STRINGTOKEN - 71)) | (1L << (FLOATTOKEN - 71)) | (1L << (IDTOKEN - 71)) | (1L << (CONSTRTOKEN - 71)))) != 0) );
				setState(779); match(8);
				setState(780); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentPattsExp((((RecdeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((RecdeclmonoContext)_localctx).patt_1_list),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(783); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(784); match(8);
				setState(785); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(788); match(12);
				setState(789); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(790); match(53);
				setState(791); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(792); match(67);
				setState(793); match(8);
				setState(794); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
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

	public static class DeclexceptionappendixContext extends ParserRuleContext {
		public Object _declexceptionappendix;
		public Token CONSTRTOKEN_0;
		public TypeContext type_1;
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoRecParser.CONSTRTOKEN, 0); }
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
		enterRule(_localctx, 66, RULE_declexceptionappendix);
		try {
			setState(808);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(799); match(68);
				setState(800); ((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(801); match(34);
				setState(802); ((DeclexceptionappendixContext)_localctx).type_1 = type(0);
				((DeclexceptionappendixContext)_localctx)._declexceptionappendix =  builder.declConstrExceptionAppendix(constrtoken((((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0!=null?((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DeclexceptionappendixContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(805); match(68);
				setState(806); ((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 68, RULE_recdecl);
		int _la;
		try {
			setState(821);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(810); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(812); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(811); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(814); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==68 );
				((RecdeclContext)_localctx)._recdecl =  builder.recAndDecl((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono),lift("_recanddecl", ((RecdeclContext)_localctx).recanddecl_1_list));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(818); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
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
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoRecParser.CONSTRTOKEN, 0); }
		public DecllabeltypeContext decllabeltype(int i) {
			return getRuleContext(DecllabeltypeContext.class,i);
		}
		public TerminalNode IDTOKEN() { return getToken(CLNoRecParser.IDTOKEN, 0); }
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
		enterRule(_localctx, 70, RULE_declnewtype);
		int _la;
		try {
			setState(865);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(823); ((DeclnewtypeContext)_localctx).ident_0 = ident();
				setState(824); match(8);
				setState(825); match(4);
				{
				setState(826); ((DeclnewtypeContext)_localctx).decllabeltype_1 = decllabeltype();
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==13) {
					{
					{
					setState(827); match(13);
					setState(828); ((DeclnewtypeContext)_localctx).decllabeltype = decllabeltype();
					((DeclnewtypeContext)_localctx).decllabeltype_1tail.add(((DeclnewtypeContext)_localctx).decllabeltype);
					}
					}
					setState(833);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(834); match(39);
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declRecordType((((DeclnewtypeContext)_localctx).ident_0._ident),lift("_decllabeltype", ((DeclnewtypeContext)_localctx).decllabeltype_1tail, ((DeclnewtypeContext)_localctx).decllabeltype_1._decllabeltype));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(838); match(8);
				setState(839); ((DeclnewtypeContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==56) {
					{
					{
					setState(840); ((DeclnewtypeContext)_localctx).decltypeappendix = decltypeappendix();
					((DeclnewtypeContext)_localctx).decltypeappendix_2_list.add(((DeclnewtypeContext)_localctx).decltypeappendix);
					}
					}
					setState(845);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declNewEnumType(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclnewtypeContext)_localctx).CONSTRTOKEN_1!=null?((DeclnewtypeContext)_localctx).CONSTRTOKEN_1.getText():null)),lift("_decltypeappendix", ((DeclnewtypeContext)_localctx).decltypeappendix_2_list));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(847); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(848); match(8);
				setState(849); ((DeclnewtypeContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(850); match(34);
				setState(851); ((DeclnewtypeContext)_localctx).type_2 = type(0);
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==56) {
					{
					{
					setState(852); ((DeclnewtypeContext)_localctx).decltypeappendix = decltypeappendix();
					((DeclnewtypeContext)_localctx).decltypeappendix_3_list.add(((DeclnewtypeContext)_localctx).decltypeappendix);
					}
					}
					setState(857);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declNewConstrType(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclnewtypeContext)_localctx).CONSTRTOKEN_1!=null?((DeclnewtypeContext)_localctx).CONSTRTOKEN_1.getText():null)),(((DeclnewtypeContext)_localctx).type_2._type),lift("_decltypeappendix", ((DeclnewtypeContext)_localctx).decltypeappendix_3_list));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(860); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(861); match(55);
				setState(862); ((DeclnewtypeContext)_localctx).type_1 = type(0);
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

		case 24: return exp_sempred((ExpContext)_localctx, predIndex);

		case 30: return functionapp_sempred((FunctionappContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean functionapp_sempred(FunctionappContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20: return precpred(_ctx, 2);
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
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 4);

		case 3: return precpred(_ctx, 6);

		case 4: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 33);

		case 6: return precpred(_ctx, 24);

		case 7: return precpred(_ctx, 23);

		case 8: return precpred(_ctx, 22);

		case 9: return precpred(_ctx, 21);

		case 10: return precpred(_ctx, 20);

		case 11: return precpred(_ctx, 19);

		case 12: return precpred(_ctx, 17);

		case 13: return precpred(_ctx, 16);

		case 14: return precpred(_ctx, 15);

		case 15: return precpred(_ctx, 13);

		case 16: return precpred(_ctx, 11);

		case 17: return precpred(_ctx, 5);

		case 18: return precpred(_ctx, 14);

		case 19: return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Y\u0366\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2W\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3j\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4w\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0083\n\6\f\6\16"+
		"\6\u0086\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008f\n\6\f\6\16\6\u0092"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u0099\n\6\f\6\16\6\u009c\13\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\6\6\u00a5\n\6\r\6\16\6\u00a6\3\6\3\6\5\6\u00ab\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00b7\n\7\f\7\16\7\u00ba"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00d8\n\7\r\7\16"+
		"\7\u00d9\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00ec\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00f8\n\7"+
		"\f\7\16\7\u00fb\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0106\n\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0110\n\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u0129\n\r\f\r\16\r\u012c\13\r\3\r\3\r\3\r\3\r\5\r\u0132\n\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u013b\n\r\r\r\16\r\u013c\3\r\3\r\3\r\3\r"+
		"\3\r\7\r\u0144\n\r\f\r\16\r\u0147\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16\u0151\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u015e\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u0169\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u0172\n\21\r"+
		"\21\16\21\u0173\3\21\3\21\3\21\3\21\5\21\u017a\n\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0189\n\23\f\23\16"+
		"\23\u018c\13\23\5\23\u018e\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0197\n\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u01aa\n\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u01c5\n\27\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0211"+
		"\n\32\f\32\16\32\u0214\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u021d"+
		"\n\32\f\32\16\32\u0220\13\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0228"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0230\n\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\7\32\u0239\n\32\f\32\16\32\u023c\13\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0273\n\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u02c5\n\32\f\32\16\32\u02c8\13"+
		"\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u02d5"+
		"\n\34\3\35\6\35\u02d8\n\35\r\35\16\35\u02d9\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u02ed"+
		"\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u02f9\n \3 \3 \3 \3 \7 \u02ff\n"+
		" \f \16 \u0302\13 \3!\3!\3!\3!\3\"\3\"\6\"\u030a\n\"\r\"\16\"\u030b\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0320\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u032b\n#\3$\3$\6$\u032f\n"+
		"$\r$\16$\u0330\3$\3$\3$\3$\3$\5$\u0338\n$\3%\3%\3%\3%\3%\3%\7%\u0340\n"+
		"%\f%\16%\u0343\13%\3%\3%\3%\3%\3%\3%\3%\7%\u034c\n%\f%\16%\u034f\13%\3"+
		"%\3%\3%\3%\3%\3%\3%\7%\u0358\n%\f%\16%\u035b\13%\3%\3%\3%\3%\3%\3%\3%"+
		"\5%\u0364\n%\3%\2\6\f\30\62>&\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BDFH\2\b\6\2\30\30\"\"((\61\61\6\2!!==??HH\4"+
		"\2\f\f\27\27\t\2\4\4\n\n\23\24\32\32--99<<\4\2\7\7//\4\2\'\'>>\u03ba\2"+
		"V\3\2\2\2\4i\3\2\2\2\6v\3\2\2\2\bx\3\2\2\2\n\u00aa\3\2\2\2\f\u00eb\3\2"+
		"\2\2\16\u00fc\3\2\2\2\20\u0105\3\2\2\2\22\u010f\3\2\2\2\24\u0111\3\2\2"+
		"\2\26\u0114\3\2\2\2\30\u0131\3\2\2\2\32\u0150\3\2\2\2\34\u015d\3\2\2\2"+
		"\36\u0168\3\2\2\2 \u0179\3\2\2\2\"\u017b\3\2\2\2$\u0196\3\2\2\2&\u0198"+
		"\3\2\2\2(\u019c\3\2\2\2*\u01a9\3\2\2\2,\u01c4\3\2\2\2.\u01c6\3\2\2\2\60"+
		"\u01ca\3\2\2\2\62\u0272\3\2\2\2\64\u02c9\3\2\2\2\66\u02d4\3\2\2\28\u02d7"+
		"\3\2\2\2:\u02df\3\2\2\2<\u02ec\3\2\2\2>\u02f8\3\2\2\2@\u0303\3\2\2\2B"+
		"\u031f\3\2\2\2D\u032a\3\2\2\2F\u0337\3\2\2\2H\u0363\3\2\2\2JK\7:\2\2K"+
		"L\5\2\2\2LM\b\2\1\2MW\3\2\2\2NO\5\26\f\2OP\7:\2\2PQ\5\2\2\2QR\b\2\1\2"+
		"RW\3\2\2\2ST\5\26\f\2TU\b\2\1\2UW\3\2\2\2VJ\3\2\2\2VN\3\2\2\2VS\3\2\2"+
		"\2W\3\3\2\2\2XY\5\24\13\2YZ\b\3\1\2Zj\3\2\2\2[\\\7J\2\2\\j\b\3\1\2]^\7"+
		"S\2\2^j\b\3\1\2_`\7T\2\2`j\b\3\1\2ab\7U\2\2bj\b\3\1\2cd\7Y\2\2dj\b\3\1"+
		"\2ef\7I\2\2fj\b\3\1\2gh\7N\2\2hj\b\3\1\2iX\3\2\2\2i[\3\2\2\2i]\3\2\2\2"+
		"i_\3\2\2\2ia\3\2\2\2ic\3\2\2\2ie\3\2\2\2ig\3\2\2\2j\5\3\2\2\2kl\7X\2\2"+
		"lm\7\67\2\2mn\5\30\r\2no\b\4\1\2ow\3\2\2\2pq\7\66\2\2qr\7X\2\2rs\7\67"+
		"\2\2st\5\30\r\2tu\b\4\1\2uw\3\2\2\2vk\3\2\2\2vp\3\2\2\2w\7\3\2\2\2xy\7"+
		"\60\2\2yz\7X\2\2z{\b\5\1\2{\t\3\2\2\2|}\5 \21\2}~\b\6\1\2~\u00ab\3\2\2"+
		"\2\177\u0080\7\31\2\2\u0080\u0084\5$\23\2\u0081\u0083\5&\24\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088\b\6\1\2\u0088\u00ab\3\2"+
		"\2\2\u0089\u008a\7\63\2\2\u008a\u008b\7Y\2\2\u008b\u008c\7$\2\2\u008c"+
		"\u0090\5\30\r\2\u008d\u008f\5D#\2\u008e\u008d\3\2\2\2\u008f\u0092\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0093\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0093\u0094\b\6\1\2\u0094\u00ab\3\2\2\2\u0095\u0096\7\63"+
		"\2\2\u0096\u009a\7Y\2\2\u0097\u0099\5D#\2\u0098\u0097\3\2\2\2\u0099\u009c"+
		"\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009d\u00ab\b\6\1\2\u009e\u009f\7\34\2\2\u009f\u00a0\5"+
		"\n\6\2\u00a0\u00a1\b\6\1\2\u00a1\u00ab\3\2\2\2\u00a2\u00a4\5 \21\2\u00a3"+
		"\u00a5\5\64\33\2\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\6\1\2\u00a9"+
		"\u00ab\3\2\2\2\u00aa|\3\2\2\2\u00aa\177\3\2\2\2\u00aa\u0089\3\2\2\2\u00aa"+
		"\u0095\3\2\2\2\u00aa\u009e\3\2\2\2\u00aa\u00a2\3\2\2\2\u00ab\13\3\2\2"+
		"\2\u00ac\u00ad\b\7\1\2\u00ad\u00ae\7Y\2\2\u00ae\u00af\5\f\7\b\u00af\u00b0"+
		"\b\7\1\2\u00b0\u00ec\3\2\2\2\u00b1\u00b2\7\6\2\2\u00b2\u00b3\7X\2\2\u00b3"+
		"\u00b4\7\n\2\2\u00b4\u00b8\5\f\7\2\u00b5\u00b7\5\60\31\2\u00b6\u00b5\3"+
		"\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7)\2\2\u00bc\u00bd\b\7"+
		"\1\2\u00bd\u00ec\3\2\2\2\u00be\u00bf\5\16\b\2\u00bf\u00c0\b\7\1\2\u00c0"+
		"\u00ec\3\2\2\2\u00c1\u00c2\7M\2\2\u00c2\u00ec\b\7\1\2\u00c3\u00c4\7\16"+
		"\2\2\u00c4\u00c5\5\f\7\2\u00c5\u00c6\7E\2\2\u00c6\u00c7\b\7\1\2\u00c7"+
		"\u00ec\3\2\2\2\u00c8\u00c9\7\16\2\2\u00c9\u00ca\5\f\7\2\u00ca\u00cb\7"+
		"\67\2\2\u00cb\u00cc\5\30\r\2\u00cc\u00cd\7E\2\2\u00cd\u00ce\b\7\1\2\u00ce"+
		"\u00ec\3\2\2\2\u00cf\u00d0\5\4\3\2\u00d0\u00d1\b\7\1\2\u00d1\u00ec\3\2"+
		"\2\2\u00d2\u00d3\7Y\2\2\u00d3\u00ec\b\7\1\2\u00d4\u00d5\7\16\2\2\u00d5"+
		"\u00d7\5\f\7\2\u00d6\u00d8\5(\25\2\u00d7\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\7E\2\2\u00dc\u00dd\b\7\1\2\u00dd\u00ec\3\2\2\2\u00de\u00df\5\24"+
		"\13\2\u00df\u00e0\b\7\1\2\u00e0\u00ec\3\2\2\2\u00e1\u00e2\78\2\2\u00e2"+
		"\u00e3\5\22\n\2\u00e3\u00e4\7\26\2\2\u00e4\u00e5\b\7\1\2\u00e5\u00ec\3"+
		"\2\2\2\u00e6\u00e7\78\2\2\u00e7\u00e8\5\32\16\2\u00e8\u00e9\7\26\2\2\u00e9"+
		"\u00ea\b\7\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00ac\3\2\2\2\u00eb\u00b1\3\2"+
		"\2\2\u00eb\u00be\3\2\2\2\u00eb\u00c1\3\2\2\2\u00eb\u00c3\3\2\2\2\u00eb"+
		"\u00c8\3\2\2\2\u00eb\u00cf\3\2\2\2\u00eb\u00d2\3\2\2\2\u00eb\u00d4\3\2"+
		"\2\2\u00eb\u00de\3\2\2\2\u00eb\u00e1\3\2\2\2\u00eb\u00e6\3\2\2\2\u00ec"+
		"\u00f9\3\2\2\2\u00ed\u00ee\f\n\2\2\u00ee\u00ef\7:\2\2\u00ef\u00f0\5\f"+
		"\7\13\u00f0\u00f1\b\7\1\2\u00f1\u00f8\3\2\2\2\u00f2\u00f3\f\r\2\2\u00f3"+
		"\u00f4\7#\2\2\u00f4\u00f5\5\16\b\2\u00f5\u00f6\b\7\1\2\u00f6\u00f8\3\2"+
		"\2\2\u00f7\u00ed\3\2\2\2\u00f7\u00f2\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\r\3\2\2\2\u00fb\u00f9\3\2\2\2"+
		"\u00fc\u00fd\7X\2\2\u00fd\u00fe\b\b\1\2\u00fe\17\3\2\2\2\u00ff\u0100\5"+
		"\62\32\2\u0100\u0101\b\t\1\2\u0101\u0106\3\2\2\2\u0102\u0103\5\n\6\2\u0103"+
		"\u0104\b\t\1\2\u0104\u0106\3\2\2\2\u0105\u00ff\3\2\2\2\u0105\u0102\3\2"+
		"\2\2\u0106\21\3\2\2\2\u0107\u0108\5\f\7\2\u0108\u0109\b\n\1\2\u0109\u0110"+
		"\3\2\2\2\u010a\u010b\5\f\7\2\u010b\u010c\7\17\2\2\u010c\u010d\5\22\n\2"+
		"\u010d\u010e\b\n\1\2\u010e\u0110\3\2\2\2\u010f\u0107\3\2\2\2\u010f\u010a"+
		"\3\2\2\2\u0110\23\3\2\2\2\u0111\u0112\7K\2\2\u0112\u0113\b\13\1\2\u0113"+
		"\25\3\2\2\2\u0114\u0115\5\f\7\2\u0115\u0116\7\64\2\2\u0116\u0117\5\62"+
		"\32\2\u0117\u0118\b\f\1\2\u0118\27\3\2\2\2\u0119\u011a\b\r\1\2\u011a\u011b"+
		"\5\b\5\2\u011b\u011c\b\r\1\2\u011c\u0132\3\2\2\2\u011d\u011e\7\16\2\2"+
		"\u011e\u011f\5\30\r\2\u011f\u0120\7E\2\2\u0120\u0121\b\r\1\2\u0121\u0132"+
		"\3\2\2\2\u0122\u0123\7X\2\2\u0123\u0132\b\r\1\2\u0124\u0125\7\16\2\2\u0125"+
		"\u012a\5\30\r\2\u0126\u0127\7\17\2\2\u0127\u0129\5\30\r\2\u0128\u0126"+
		"\3\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012d\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012e\7E\2\2\u012e\u012f\7X\2"+
		"\2\u012f\u0130\b\r\1\2\u0130\u0132\3\2\2\2\u0131\u0119\3\2\2\2\u0131\u011d"+
		"\3\2\2\2\u0131\u0122\3\2\2\2\u0131\u0124\3\2\2\2\u0132\u0145\3\2\2\2\u0133"+
		"\u0134\f\6\2\2\u0134\u0135\7\64\2\2\u0135\u0136\5\30\r\7\u0136\u0137\b"+
		"\r\1\2\u0137\u0144\3\2\2\2\u0138\u013a\f\b\2\2\u0139\u013b\5@!\2\u013a"+
		"\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2"+
		"\2\2\u013d\u013e\3\2\2\2\u013e\u013f\b\r\1\2\u013f\u0144\3\2\2\2\u0140"+
		"\u0141\f\5\2\2\u0141\u0142\7X\2\2\u0142\u0144\b\r\1\2\u0143\u0133\3\2"+
		"\2\2\u0143\u0138\3\2\2\2\u0143\u0140\3\2\2\2\u0144\u0147\3\2\2\2\u0145"+
		"\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\31\3\2\2\2\u0147\u0145\3\2\2"+
		"\2\u0148\u0149\5\f\7\2\u0149\u014a\7\t\2\2\u014a\u014b\5\32\16\2\u014b"+
		"\u014c\b\16\1\2\u014c\u0151\3\2\2\2\u014d\u014e\5\f\7\2\u014e\u014f\b"+
		"\16\1\2\u014f\u0151\3\2\2\2\u0150\u0148\3\2\2\2\u0150\u014d\3\2\2\2\u0151"+
		"\33\3\2\2\2\u0152\u0153\7X\2\2\u0153\u0154\7\n\2\2\u0154\u0155\5\62\32"+
		"\2\u0155\u0156\b\17\1\2\u0156\u015e\3\2\2\2\u0157\u0158\7\66\2\2\u0158"+
		"\u0159\7X\2\2\u0159\u015a\7\n\2\2\u015a\u015b\5\62\32\2\u015b\u015c\b"+
		"\17\1\2\u015c\u015e\3\2\2\2\u015d\u0152\3\2\2\2\u015d\u0157\3\2\2\2\u015e"+
		"\35\3\2\2\2\u015f\u0160\7:\2\2\u0160\u0161\7Y\2\2\u0161\u0162\7$\2\2\u0162"+
		"\u0163\5\30\r\2\u0163\u0164\b\20\1\2\u0164\u0169\3\2\2\2\u0165\u0166\7"+
		":\2\2\u0166\u0167\7Y\2\2\u0167\u0169\b\20\1\2\u0168\u015f\3\2\2\2\u0168"+
		"\u0165\3\2\2\2\u0169\37\3\2\2\2\u016a\u016b\5\f\7\2\u016b\u016c\7\n\2"+
		"\2\u016c\u016d\5\62\32\2\u016d\u016e\b\21\1\2\u016e\u017a\3\2\2\2\u016f"+
		"\u0171\5\16\b\2\u0170\u0172\5\f\7\2\u0171\u0170\3\2\2\2\u0172\u0173\3"+
		"\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0176\7\n\2\2\u0176\u0177\5\62\32\2\u0177\u0178\b\21\1\2\u0178\u017a"+
		"\3\2\2\2\u0179\u016a\3\2\2\2\u0179\u016f\3\2\2\2\u017a!\3\2\2\2\u017b"+
		"\u017c\5\n\6\2\u017c\u017d\7C\2\2\u017d\u017e\5\62\32\2\u017e\u017f\b"+
		"\22\1\2\u017f#\3\2\2\2\u0180\u0181\5\b\5\2\u0181\u0182\5H%\2\u0182\u0183"+
		"\b\23\1\2\u0183\u0197\3\2\2\2\u0184\u018d\7\16\2\2\u0185\u018a\5\b\5\2"+
		"\u0186\u0187\7\17\2\2\u0187\u0189\5\b\5\2\u0188\u0186\3\2\2\2\u0189\u018c"+
		"\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018e\3\2\2\2\u018c"+
		"\u018a\3\2\2\2\u018d\u0185\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\3\2"+
		"\2\2\u018f\u0190\7E\2\2\u0190\u0191\5H%\2\u0191\u0192\b\23\1\2\u0192\u0197"+
		"\3\2\2\2\u0193\u0194\5H%\2\u0194\u0195\b\23\1\2\u0195\u0197\3\2\2\2\u0196"+
		"\u0180\3\2\2\2\u0196\u0184\3\2\2\2\u0196\u0193\3\2\2\2\u0197%\3\2\2\2"+
		"\u0198\u0199\7F\2\2\u0199\u019a\5$\23\2\u019a\u019b\b\24\1\2\u019b\'\3"+
		"\2\2\2\u019c\u019d\7\17\2\2\u019d\u019e\5\f\7\2\u019e\u019f\b\25\1\2\u019f"+
		")\3\2\2\2\u01a0\u01a1\5\20\t\2\u01a1\u01a2\7\25\2\2\u01a2\u01a3\5*\26"+
		"\2\u01a3\u01a4\b\26\1\2\u01a4\u01aa\3\2\2\2\u01a5\u01a6\5\20\t\2\u01a6"+
		"\u01a7\7\25\2\2\u01a7\u01a8\b\26\1\2\u01a8\u01aa\3\2\2\2\u01a9\u01a0\3"+
		"\2\2\2\u01a9\u01a5\3\2\2\2\u01aa+\3\2\2\2\u01ab\u01ac\7\36\2\2\u01ac\u01ad"+
		"\5\2\2\2\u01ad\u01ae\b\27\1\2\u01ae\u01c5\3\2\2\2\u01af\u01b0\5\16\b\2"+
		"\u01b0\u01b1\b\27\1\2\u01b1\u01c5\3\2\2\2\u01b2\u01b3\7B\2\2\u01b3\u01b4"+
		"\5,\27\2\u01b4\u01b5\7D\2\2\u01b5\u01b6\b\27\1\2\u01b6\u01c5\3\2\2\2\u01b7"+
		"\u01b8\7\16\2\2\u01b8\u01b9\5,\27\2\u01b9\u01ba\7E\2\2\u01ba\u01bb\b\27"+
		"\1\2\u01bb\u01c5\3\2\2\2\u01bc\u01bd\7\3\2\2\u01bd\u01be\5\26\f\2\u01be"+
		"\u01bf\b\27\1\2\u01bf\u01c5\3\2\2\2\u01c0\u01c1\7\3\2\2\u01c1\u01c2\5"+
		"8\35\2\u01c2\u01c3\b\27\1\2\u01c3\u01c5\3\2\2\2\u01c4\u01ab\3\2\2\2\u01c4"+
		"\u01af\3\2\2\2\u01c4\u01b2\3\2\2\2\u01c4\u01b7\3\2\2\2\u01c4\u01bc\3\2"+
		"\2\2\u01c4\u01c0\3\2\2\2\u01c5-\3\2\2\2\u01c6\u01c7\7F\2\2\u01c7\u01c8"+
		"\5B\"\2\u01c8\u01c9\b\30\1\2\u01c9/\3\2\2\2\u01ca\u01cb\7\17\2\2\u01cb"+
		"\u01cc\7X\2\2\u01cc\u01cd\7\n\2\2\u01cd\u01ce\5\f\7\2\u01ce\u01cf\b\31"+
		"\1\2\u01cf\61\3\2\2\2\u01d0\u01d1\b\32\1\2\u01d1\u01d2\7Y\2\2\u01d2\u01d3"+
		"\5\62\32$\u01d3\u01d4\b\32\1\2\u01d4\u0273\3\2\2\2\u01d5\u01d6\7@\2\2"+
		"\u01d6\u01d7\5\62\32\36\u01d7\u01d8\b\32\1\2\u01d8\u0273\3\2\2\2\u01d9"+
		"\u01da\7?\2\2\u01da\u01db\5\62\32\34\u01db\u01dc\b\32\1\2\u01dc\u0273"+
		"\3\2\2\2\u01dd\u01de\7H\2\2\u01de\u01df\5\62\32\33\u01df\u01e0\b\32\1"+
		"\2\u01e0\u0273\3\2\2\2\u01e1\u01e2\7G\2\2\u01e2\u01e3\5\62\32\24\u01e3"+
		"\u01e4\b\32\1\2\u01e4\u0273\3\2\2\2\u01e5\u01e6\7*\2\2\u01e6\u01e7\5\62"+
		"\32\2\u01e7\u01e8\7 \2\2\u01e8\u01e9\5\62\32\2\u01e9\u01ea\7A\2\2\u01ea"+
		"\u01eb\5\62\32\f\u01eb\u01ec\b\32\1\2\u01ec\u0273\3\2\2\2\u01ed\u01ee"+
		"\7*\2\2\u01ee\u01ef\5\62\32\2\u01ef\u01f0\7 \2\2\u01f0\u01f1\5\62\32\13"+
		"\u01f1\u01f2\b\32\1\2\u01f2\u0273\3\2\2\2\u01f3\u01f4\7L\2\2\u01f4\u0273"+
		"\b\32\1\2\u01f5\u01f6\5\16\b\2\u01f6\u01f7\b\32\1\2\u01f7\u0273\3\2\2"+
		"\2\u01f8\u01f9\5\4\3\2\u01f9\u01fa\b\32\1\2\u01fa\u0273\3\2\2\2\u01fb"+
		"\u01fc\7\16\2\2\u01fc\u01fd\5\62\32\2\u01fd\u01fe\7E\2\2\u01fe\u01ff\b"+
		"\32\1\2\u01ff\u0273\3\2\2\2\u0200\u0201\7B\2\2\u0201\u0202\5\62\32\2\u0202"+
		"\u0203\7D\2\2\u0203\u0204\b\32\1\2\u0204\u0273\3\2\2\2\u0205\u0206\7\16"+
		"\2\2\u0206\u0207\5\62\32\2\u0207\u0208\7\67\2\2\u0208\u0209\5\30\r\2\u0209"+
		"\u020a\7E\2\2\u020a\u020b\b\32\1\2\u020b\u0273\3\2\2\2\u020c\u020d\7\16"+
		"\2\2\u020d\u0212\5\62\32\2\u020e\u020f\7\17\2\2\u020f\u0211\5\62\32\2"+
		"\u0210\u020e\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213"+
		"\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215\u0216\7E\2\2\u0216"+
		"\u0217\b\32\1\2\u0217\u0273\3\2\2\2\u0218\u0219\78\2\2\u0219\u021e\5\62"+
		"\32\2\u021a\u021b\7\17\2\2\u021b\u021d\5\62\32\2\u021c\u021a\3\2\2\2\u021d"+
		"\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2"+
		"\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7\26\2\2\u0222\u0223\b\32\1\2\u0223"+
		"\u0273\3\2\2\2\u0224\u0225\7.\2\2\u0225\u0227\5<\37\2\u0226\u0228\7\17"+
		"\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\3\2\2\2\u0229"+
		"\u022a\7\33\2\2\u022a\u022b\b\32\1\2\u022b\u0273\3\2\2\2\u022c\u022d\7"+
		".\2\2\u022d\u022f\5\62\32\2\u022e\u0230\7\17\2\2\u022f\u022e\3\2\2\2\u022f"+
		"\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0232\7\33\2\2\u0232\u0233\b"+
		"\32\1\2\u0233\u0273\3\2\2\2\u0234\u0235\7\6\2\2\u0235\u023a\5\34\17\2"+
		"\u0236\u0237\7\17\2\2\u0237\u0239\5\34\17\2\u0238\u0236\3\2\2\2\u0239"+
		"\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023d\3\2"+
		"\2\2\u023c\u023a\3\2\2\2\u023d\u023e\7)\2\2\u023e\u023f\b\32\1\2\u023f"+
		"\u0273\3\2\2\2\u0240\u0241\5> \2\u0241\u0242\b\32\1\2\u0242\u0273\3\2"+
		"\2\2\u0243\u0244\7\5\2\2\u0244\u0245\5\62\32\2\u0245\u0246\7\r\2\2\u0246"+
		"\u0247\5\62\32\2\u0247\u0248\7\21\2\2\u0248\u0249\b\32\1\2\u0249\u0273"+
		"\3\2\2\2\u024a\u024b\7\13\2\2\u024b\u024c\5\16\b\2\u024c\u024d\7\n\2\2"+
		"\u024d\u024e\5\62\32\2\u024e\u024f\7\37\2\2\u024f\u0250\5\62\32\2\u0250"+
		"\u0251\7\r\2\2\u0251\u0252\5\62\32\2\u0252\u0253\7\21\2\2\u0253\u0254"+
		"\b\32\1\2\u0254\u0273\3\2\2\2\u0255\u0256\7\13\2\2\u0256\u0257\5\16\b"+
		"\2\u0257\u0258\7\n\2\2\u0258\u0259\5\62\32\2\u0259\u025a\7\65\2\2\u025a"+
		"\u025b\5\62\32\2\u025b\u025c\7\r\2\2\u025c\u025d\5\62\32\2\u025d\u025e"+
		"\7\21\2\2\u025e\u025f\b\32\1\2\u025f\u0273\3\2\2\2\u0260\u0261\7\35\2"+
		"\2\u0261\u0262\5\62\32\2\u0262\u0263\7;\2\2\u0263\u0264\5\2\2\2\u0264"+
		"\u0265\b\32\1\2\u0265\u0273\3\2\2\2\u0266\u0267\5,\27\2\u0267\u0268\b"+
		"\32\1\2\u0268\u0273\3\2\2\2\u0269\u026a\7+\2\2\u026a\u026b\5\62\32\2\u026b"+
		"\u026c\7;\2\2\u026c\u026d\5\2\2\2\u026d\u026e\b\32\1\2\u026e\u0273\3\2"+
		"\2\2\u026f\u0270\5\"\22\2\u0270\u0271\b\32\1\2\u0271\u0273\3\2\2\2\u0272"+
		"\u01d0\3\2\2\2\u0272\u01d5\3\2\2\2\u0272\u01d9\3\2\2\2\u0272\u01dd\3\2"+
		"\2\2\u0272\u01e1\3\2\2\2\u0272\u01e5\3\2\2\2\u0272\u01ed\3\2\2\2\u0272"+
		"\u01f3\3\2\2\2\u0272\u01f5\3\2\2\2\u0272\u01f8\3\2\2\2\u0272\u01fb\3\2"+
		"\2\2\u0272\u0200\3\2\2\2\u0272\u0205\3\2\2\2\u0272\u020c\3\2\2\2\u0272"+
		"\u0218\3\2\2\2\u0272\u0224\3\2\2\2\u0272\u022c\3\2\2\2\u0272\u0234\3\2"+
		"\2\2\u0272\u0240\3\2\2\2\u0272\u0243\3\2\2\2\u0272\u024a\3\2\2\2\u0272"+
		"\u0255\3\2\2\2\u0272\u0260\3\2\2\2\u0272\u0266\3\2\2\2\u0272\u0269\3\2"+
		"\2\2\u0272\u026f\3\2\2\2\u0273\u02c6\3\2\2\2\u0274\u0275\f#\2\2\u0275"+
		"\u0276\7\t\2\2\u0276\u0277\5\62\32#\u0277\u0278\b\32\1\2\u0278\u02c5\3"+
		"\2\2\2\u0279\u027a\f\32\2\2\u027a\u027b\7\b\2\2\u027b\u027c\5\62\32\33"+
		"\u027c\u027d\b\32\1\2\u027d\u02c5\3\2\2\2\u027e\u027f\f\31\2\2\u027f\u0280"+
		"\7\22\2\2\u0280\u0281\5\62\32\32\u0281\u0282\b\32\1\2\u0282\u02c5\3\2"+
		"\2\2\u0283\u0284\f\30\2\2\u0284\u0285\t\2\2\2\u0285\u0286\5\62\32\31\u0286"+
		"\u0287\b\32\1\2\u0287\u02c5\3\2\2\2\u0288\u0289\f\27\2\2\u0289\u028a\t"+
		"\3\2\2\u028a\u028b\5\62\32\30\u028b\u028c\b\32\1\2\u028c\u02c5\3\2\2\2"+
		"\u028d\u028e\f\26\2\2\u028e\u028f\t\4\2\2\u028f\u0290\5\62\32\27\u0290"+
		"\u0291\b\32\1\2\u0291\u02c5\3\2\2\2\u0292\u0293\f\25\2\2\u0293\u0294\t"+
		"\5\2\2\u0294\u0295\5\62\32\26\u0295\u0296\b\32\1\2\u0296\u02c5\3\2\2\2"+
		"\u0297\u0298\f\23\2\2\u0298\u0299\t\6\2\2\u0299\u029a\5\62\32\24\u029a"+
		"\u029b\b\32\1\2\u029b\u02c5\3\2\2\2\u029c\u029d\f\22\2\2\u029d\u029e\t"+
		"\7\2\2\u029e\u029f\5\62\32\23\u029f\u02a0\b\32\1\2\u02a0\u02c5\3\2\2\2"+
		"\u02a1\u02a2\f\21\2\2\u02a2\u02a3\7,\2\2\u02a3\u02a4\5\62\32\21\u02a4"+
		"\u02a5\b\32\1\2\u02a5\u02c5\3\2\2\2\u02a6\u02a7\f\17\2\2\u02a7\u02a8\7"+
		"\62\2\2\u02a8\u02a9\7X\2\2\u02a9\u02aa\7\20\2\2\u02aa\u02ab\5\62\32\20"+
		"\u02ab\u02ac\b\32\1\2\u02ac\u02c5\3\2\2\2\u02ad\u02ae\f\r\2\2\u02ae\u02af"+
		"\7%\2\2\u02af\u02b0\5\62\32\2\u02b0\u02b1\7E\2\2\u02b1\u02b2\7\20\2\2"+
		"\u02b2\u02b3\5\62\32\16\u02b3\u02b4\b\32\1\2\u02b4\u02c5\3\2\2\2\u02b5"+
		"\u02b6\f\7\2\2\u02b6\u02b7\7&\2\2\u02b7\u02b8\5\62\32\7\u02b8\u02b9\b"+
		"\32\1\2\u02b9\u02c5\3\2\2\2\u02ba\u02bb\f\20\2\2\u02bb\u02bc\7\62\2\2"+
		"\u02bc\u02bd\7X\2\2\u02bd\u02c5\b\32\1\2\u02be\u02bf\f\16\2\2\u02bf\u02c0"+
		"\7%\2\2\u02c0\u02c1\5\62\32\2\u02c1\u02c2\7E\2\2\u02c2\u02c3\b\32\1\2"+
		"\u02c3\u02c5\3\2\2\2\u02c4\u0274\3\2\2\2\u02c4\u0279\3\2\2\2\u02c4\u027e"+
		"\3\2\2\2\u02c4\u0283\3\2\2\2\u02c4\u0288\3\2\2\2\u02c4\u028d\3\2\2\2\u02c4"+
		"\u0292\3\2\2\2\u02c4\u0297\3\2\2\2\u02c4\u029c\3\2\2\2\u02c4\u02a1\3\2"+
		"\2\2\u02c4\u02a6\3\2\2\2\u02c4\u02ad\3\2\2\2\u02c4\u02b5\3\2\2\2\u02c4"+
		"\u02ba\3\2\2\2\u02c4\u02be\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2"+
		"\2\2\u02c6\u02c7\3\2\2\2\u02c7\63\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02ca"+
		"\7F\2\2\u02ca\u02cb\5 \21\2\u02cb\u02cc\b\33\1\2\u02cc\65\3\2\2\2\u02cd"+
		"\u02ce\7Y\2\2\u02ce\u02cf\7$\2\2\u02cf\u02d0\5\30\r\2\u02d0\u02d1\b\34"+
		"\1\2\u02d1\u02d5\3\2\2\2\u02d2\u02d3\7Y\2\2\u02d3\u02d5\b\34\1\2\u02d4"+
		"\u02cd\3\2\2\2\u02d4\u02d2\3\2\2\2\u02d5\67\3\2\2\2\u02d6\u02d8\5\f\7"+
		"\2\u02d7\u02d6\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da"+
		"\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dc\7\64\2\2\u02dc\u02dd\5\62\32"+
		"\2\u02dd\u02de\b\35\1\2\u02de9\3\2\2\2\u02df\u02e0\5*\26\2\u02e0\u02e1"+
		"\b\36\1\2\u02e1;\3\2\2\2\u02e2\u02e3\5\62\32\2\u02e3\u02e4\7\17\2\2\u02e4"+
		"\u02e5\5<\37\2\u02e5\u02e6\b\37\1\2\u02e6\u02ed\3\2\2\2\u02e7\u02e8\5"+
		"\62\32\2\u02e8\u02e9\7\17\2\2\u02e9\u02ea\5\62\32\2\u02ea\u02eb\b\37\1"+
		"\2\u02eb\u02ed\3\2\2\2\u02ec\u02e2\3\2\2\2\u02ec\u02e7\3\2\2\2\u02ed="+
		"\3\2\2\2\u02ee\u02ef\b \1\2\u02ef\u02f0\7\16\2\2\u02f0\u02f1\5> \2\u02f1"+
		"\u02f2\7E\2\2\u02f2\u02f3\b \1\2\u02f3\u02f9\3\2\2\2\u02f4\u02f5\5,\27"+
		"\2\u02f5\u02f6\5\62\32\2\u02f6\u02f7\b \1\2\u02f7\u02f9\3\2\2\2\u02f8"+
		"\u02ee\3\2\2\2\u02f8\u02f4\3\2\2\2\u02f9\u0300\3\2\2\2\u02fa\u02fb\f\4"+
		"\2\2\u02fb\u02fc\5\62\32\2\u02fc\u02fd\b \1\2\u02fd\u02ff\3\2\2\2\u02fe"+
		"\u02fa\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2"+
		"\2\2\u0301?\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0304\7\61\2\2\u0304\u0305"+
		"\5\30\r\2\u0305\u0306\b!\1\2\u0306A\3\2\2\2\u0307\u0309\5\16\b\2\u0308"+
		"\u030a\5\f\7\2\u0309\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u0309\3\2"+
		"\2\2\u030b\u030c\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\7\n\2\2\u030e"+
		"\u030f\5\62\32\2\u030f\u0310\b\"\1\2\u0310\u0320\3\2\2\2\u0311\u0312\5"+
		"\16\b\2\u0312\u0313\7\n\2\2\u0313\u0314\5\62\32\2\u0314\u0315\b\"\1\2"+
		"\u0315\u0320\3\2\2\2\u0316\u0317\7\16\2\2\u0317\u0318\5\16\b\2\u0318\u0319"+
		"\7\67\2\2\u0319\u031a\5\30\r\2\u031a\u031b\7E\2\2\u031b\u031c\7\n\2\2"+
		"\u031c\u031d\5\62\32\2\u031d\u031e\b\"\1\2\u031e\u0320\3\2\2\2\u031f\u0307"+
		"\3\2\2\2\u031f\u0311\3\2\2\2\u031f\u0316\3\2\2\2\u0320C\3\2\2\2\u0321"+
		"\u0322\7F\2\2\u0322\u0323\7Y\2\2\u0323\u0324\7$\2\2\u0324\u0325\5\30\r"+
		"\2\u0325\u0326\b#\1\2\u0326\u032b\3\2\2\2\u0327\u0328\7F\2\2\u0328\u0329"+
		"\7Y\2\2\u0329\u032b\b#\1\2\u032a\u0321\3\2\2\2\u032a\u0327\3\2\2\2\u032b"+
		"E\3\2\2\2\u032c\u032e\5B\"\2\u032d\u032f\5.\30\2\u032e\u032d\3\2\2\2\u032f"+
		"\u0330\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\3\2"+
		"\2\2\u0332\u0333\b$\1\2\u0333\u0338\3\2\2\2\u0334\u0335\5B\"\2\u0335\u0336"+
		"\b$\1\2\u0336\u0338\3\2\2\2\u0337\u032c\3\2\2\2\u0337\u0334\3\2\2\2\u0338"+
		"G\3\2\2\2\u0339\u033a\5\16\b\2\u033a\u033b\7\n\2\2\u033b\u033c\7\6\2\2"+
		"\u033c\u0341\5\6\4\2\u033d\u033e\7\17\2\2\u033e\u0340\5\6\4\2\u033f\u033d"+
		"\3\2\2\2\u0340\u0343\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0344\3\2\2\2\u0343\u0341\3\2\2\2\u0344\u0345\7)\2\2\u0345\u0346\b%\1"+
		"\2\u0346\u0364\3\2\2\2\u0347\u0348\7X\2\2\u0348\u0349\7\n\2\2\u0349\u034d"+
		"\7Y\2\2\u034a\u034c\5\36\20\2\u034b\u034a\3\2\2\2\u034c\u034f\3\2\2\2"+
		"\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e\u0350\3\2\2\2\u034f\u034d"+
		"\3\2\2\2\u0350\u0364\b%\1\2\u0351\u0352\7X\2\2\u0352\u0353\7\n\2\2\u0353"+
		"\u0354\7Y\2\2\u0354\u0355\7$\2\2\u0355\u0359\5\30\r\2\u0356\u0358\5\36"+
		"\20\2\u0357\u0356\3\2\2\2\u0358\u035b\3\2\2\2\u0359\u0357\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b\u0359\3\2\2\2\u035c\u035d\b%"+
		"\1\2\u035d\u0364\3\2\2\2\u035e\u035f\7X\2\2\u035f\u0360\79\2\2\u0360\u0361"+
		"\5\30\r\2\u0361\u0362\b%\1\2\u0362\u0364\3\2\2\2\u0363\u0339\3\2\2\2\u0363"+
		"\u0347\3\2\2\2\u0363\u0351\3\2\2\2\u0363\u035e\3\2\2\2\u0364I\3\2\2\2"+
		"\66Viv\u0084\u0090\u009a\u00a6\u00aa\u00b8\u00d9\u00eb\u00f7\u00f9\u0105"+
		"\u010f\u012a\u0131\u013c\u0143\u0145\u0150\u015d\u0168\u0173\u0179\u018a"+
		"\u018d\u0196\u01a9\u01c4\u0212\u021e\u0227\u022f\u023a\u0272\u02c4\u02c6"+
		"\u02d4\u02d9\u02ec\u02f8\u0300\u030b\u031f\u032a\u0330\u0337\u0341\u034d"+
		"\u0359\u0363";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}