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
		T__66=1, T__65=2, T__64=3, T__63=4, T__62=5, T__61=6, T__60=7, T__59=8, 
		T__58=9, T__57=10, T__56=11, T__55=12, T__54=13, T__53=14, T__52=15, T__51=16, 
		T__50=17, T__49=18, T__48=19, T__47=20, T__46=21, T__45=22, T__44=23, 
		T__43=24, T__42=25, T__41=26, T__40=27, T__39=28, T__38=29, T__37=30, 
		T__36=31, T__35=32, T__34=33, T__33=34, T__32=35, T__31=36, T__30=37, 
		T__29=38, T__28=39, T__27=40, T__26=41, T__25=42, T__24=43, T__23=44, 
		T__22=45, T__21=46, T__20=47, T__19=48, T__18=49, T__17=50, T__16=51, 
		T__15=52, T__14=53, T__13=54, T__12=55, T__11=56, T__10=57, T__9=58, T__8=59, 
		T__7=60, T__6=61, T__5=62, T__4=63, T__3=64, T__2=65, T__1=66, T__0=67, 
		CHARTOKEN=68, NULLTOKEN=69, EMPTYLISTTOKEN=70, EMPTYARRAYTOKEN=71, WILDCARDTOKEN=72, 
		BOOLTOKEN=73, WS=74, INTTOKEN=75, STRINGTOKEN=76, FLOATTOKEN=77, NEWLINE=78, 
		IDTOKEN=79, CONSTRTOKEN=80;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'!='", "'while'", "'{'", "'&&'", "'::'", "'='", 
		"'for'", "'do'", "'('", "'rec'", "','", "'<-'", "'done'", "'mod'", "'>='", 
		"'<'", "';;'", "']'", "'*.'", "'type'", "'|]'", "'let'", "'match'", "'function'", 
		"'downto'", "'then'", "'+'", "'/'", "'as'", "'of'", "'.('", "'||'", "'/.'", 
		"';'", "'}'", "'if'", "'try'", "'<='", "'[|'", "'&'", "'print'", "'''", 
		"'*'", "'.'", "'exception'", "'->'", "'to'", "'mutable'", "':'", "'['", 
		"'=='", "'|'", "'with'", "'>'", "'+.'", "'or'", "'-.'", "'else'", "'begin'", 
		"'in'", "'end'", "')'", "'and'", "'not'", "'raise'", "'-'", "CHARTOKEN", 
		"NULLTOKEN", "EMPTYLISTTOKEN", "EMPTYARRAYTOKEN", "'_'", "BOOLTOKEN", 
		"WS", "INTTOKEN", "STRINGTOKEN", "FLOATTOKEN", "NEWLINE", "IDTOKEN", "CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decllabeltype = 2, RULE_vartype = 3, 
		RULE_decl = 4, RULE_patt = 5, RULE_ident = 6, RULE_declorexp = 7, RULE_pattlist = 8, 
		RULE_emptylist = 9, RULE_pattmatchsingle = 10, RULE_type = 11, RULE_headtaillistpatt = 12, 
		RULE_recordsingle = 13, RULE_decltypeappendix = 14, RULE_declmono = 15, 
		RULE_letExp = 16, RULE_decloptionalvartypes = 17, RULE_declnewtypeappendix = 18, 
		RULE_patttuple = 19, RULE_declimpl = 20, RULE_function = 21, RULE_recanddecl = 22, 
		RULE_recordpattappendix = 23, RULE_exp = 24, RULE_anddecl = 25, RULE_varianttype = 26, 
		RULE_pattmatchcurried = 27, RULE_prog = 28, RULE_exparray = 29, RULE_tupletypelist = 30, 
		RULE_recdeclmono = 31, RULE_declexceptionappendix = 32, RULE_recdecl = 33, 
		RULE_declnewtype = 34;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decllabeltype", "vartype", "decl", "patt", "ident", 
		"declorexp", "pattlist", "emptylist", "pattmatchsingle", "type", "headtaillistpatt", 
		"recordsingle", "decltypeappendix", "declmono", "letExp", "decloptionalvartypes", 
		"declnewtypeappendix", "patttuple", "declimpl", "function", "recanddecl", 
		"recordpattappendix", "exp", "anddecl", "varianttype", "pattmatchcurried", 
		"prog", "exparray", "tupletypelist", "recdeclmono", "declexceptionappendix", 
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
				setState(70); match(53);
				setState(71); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				setState(75); match(53);
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
		public Token CONSTRTOKEN_0;
		public Token BOOLTOKEN_0;
		public Token INTTOKEN_0;
		public Token CHARTOKEN_0;
		public Token STRINGTOKEN_0;
		public Token NULLTOKEN_0;
		public Token FLOATTOKEN_0;
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public TerminalNode FLOATTOKEN() { return getToken(CLParser.FLOATTOKEN, 0); }
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
			case CONSTRTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); ((ConstantContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((ConstantContext)_localctx)._constant =  builder.constr(constrtoken((((ConstantContext)_localctx).CONSTRTOKEN_0!=null?((ConstantContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(89); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case INTTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(91); ((ConstantContext)_localctx).INTTOKEN_0 = match(INTTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(inttoken((((ConstantContext)_localctx).INTTOKEN_0!=null?((ConstantContext)_localctx).INTTOKEN_0.getText():null)));
				}
				break;
			case CHARTOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(93); ((ConstantContext)_localctx).CHARTOKEN_0 = match(CHARTOKEN);
				((ConstantContext)_localctx)._constant =  builder.char_(chartoken((((ConstantContext)_localctx).CHARTOKEN_0!=null?((ConstantContext)_localctx).CHARTOKEN_0.getText():null)));
				}
				break;
			case STRINGTOKEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(95); ((ConstantContext)_localctx).STRINGTOKEN_0 = match(STRINGTOKEN);
				((ConstantContext)_localctx)._constant =  builder.string(stringtoken((((ConstantContext)_localctx).STRINGTOKEN_0!=null?((ConstantContext)_localctx).STRINGTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(97); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case FLOATTOKEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(99); ((ConstantContext)_localctx).FLOATTOKEN_0 = match(FLOATTOKEN);
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
			setState(114);
			switch (_input.LA(1)) {
			case 49:
				enterOuterAlt(_localctx, 1);
				{
				setState(103); match(49);
				setState(104); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(105); match(50);
				setState(106); ((DecllabeltypeContext)_localctx).type_1 = type(0);
				((DecllabeltypeContext)_localctx)._decllabeltype =  builder.declMutableLabelType(idtoken((((DecllabeltypeContext)_localctx).IDTOKEN_0!=null?((DecllabeltypeContext)_localctx).IDTOKEN_0.getText():null)),(((DecllabeltypeContext)_localctx).type_1._type));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(109); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(110); match(50);
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
			setState(116); match(43);
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
		public Token CONSTRTOKEN_0;
		public DeclexceptionappendixContext declexceptionappendix;
		public List<DeclexceptionappendixContext> declexceptionappendix_1_list = new ArrayList<DeclexceptionappendixContext>();
		public TypeContext type_1;
		public List<DeclexceptionappendixContext> declexceptionappendix_2_list = new ArrayList<DeclexceptionappendixContext>();
		public DecloptionalvartypesContext decloptionalvartypes_0;
		public DeclnewtypeappendixContext declnewtypeappendix;
		public List<DeclnewtypeappendixContext> declnewtypeappendix_1_list = new ArrayList<DeclnewtypeappendixContext>();
		public DeclContext decl_0;
		public AnddeclContext anddecl;
		public List<AnddeclContext> anddecl_1_list = new ArrayList<AnddeclContext>();
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public DecloptionalvartypesContext decloptionalvartypes() {
			return getRuleContext(DecloptionalvartypesContext.class,0);
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
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120); match(23);
				setState(121); match(11);
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
				setState(128); match(46);
				setState(129); ((DeclContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==64) {
					{
					{
					setState(130); ((DeclContext)_localctx).declexceptionappendix = declexceptionappendix();
					((DeclContext)_localctx).declexceptionappendix_1_list.add(((DeclContext)_localctx).declexceptionappendix);
					}
					}
					setState(135);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declEnumException(constrtoken((((DeclContext)_localctx).CONSTRTOKEN_0!=null?((DeclContext)_localctx).CONSTRTOKEN_0.getText():null)),lift("_declexceptionappendix", ((DeclContext)_localctx).declexceptionappendix_1_list));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137); match(46);
				setState(138); ((DeclContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(139); match(31);
				setState(140); ((DeclContext)_localctx).type_1 = type(0);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==64) {
					{
					{
					setState(141); ((DeclContext)_localctx).declexceptionappendix = declexceptionappendix();
					((DeclContext)_localctx).declexceptionappendix_2_list.add(((DeclContext)_localctx).declexceptionappendix);
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declConstrException(constrtoken((((DeclContext)_localctx).CONSTRTOKEN_0!=null?((DeclContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DeclContext)_localctx).type_1._type),lift("_declexceptionappendix", ((DeclContext)_localctx).declexceptionappendix_2_list));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(149); match(21);
				setState(150); ((DeclContext)_localctx).decloptionalvartypes_0 = decloptionalvartypes();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==64) {
					{
					{
					setState(151); ((DeclContext)_localctx).declnewtypeappendix = declnewtypeappendix();
					((DeclContext)_localctx).declnewtypeappendix_1_list.add(((DeclContext)_localctx).declnewtypeappendix);
					}
					}
					setState(156);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declNewType((((DeclContext)_localctx).decloptionalvartypes_0._decloptionalvartypes),lift("_declnewtypeappendix", ((DeclContext)_localctx).declnewtypeappendix_1_list));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159); match(23);
				setState(160); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(163); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(164); ((DeclContext)_localctx).anddecl = anddecl();
					((DeclContext)_localctx).anddecl_1_list.add(((DeclContext)_localctx).anddecl);
					}
					}
					setState(167); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==64 );
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
			setState(236);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(174); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(175); ((PattContext)_localctx).patt_1 = patt(6);
				((PattContext)_localctx)._patt =  builder.pattConstrPatt(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt));
				}
				break;

			case 2:
				{
				setState(178); match(4);
				setState(179); ((PattContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(180); match(7);
				setState(181); ((PattContext)_localctx).patt_1 = patt(0);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==12) {
					{
					{
					setState(182); ((PattContext)_localctx).recordpattappendix = recordpattappendix();
					((PattContext)_localctx).recordpattappendix_2_list.add(((PattContext)_localctx).recordpattappendix);
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(188); match(36);
				((PattContext)_localctx)._patt =  builder.recordPatt(idtoken((((PattContext)_localctx).IDTOKEN_0!=null?((PattContext)_localctx).IDTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt),lift("_recordpattappendix", ((PattContext)_localctx).recordpattappendix_2_list));
				}
				break;

			case 3:
				{
				setState(191); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(194); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 5:
				{
				setState(196); match(10);
				setState(197); ((PattContext)_localctx).patt_0 = patt(0);
				setState(198); match(63);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 6:
				{
				setState(201); match(10);
				setState(202); ((PattContext)_localctx).patt_0 = patt(0);
				setState(203); match(50);
				setState(204); ((PattContext)_localctx).type_1 = type(0);
				setState(205); match(63);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 7:
				{
				setState(208); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 8:
				{
				setState(211); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((PattContext)_localctx)._patt =  builder.pattConstr(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(213); match(10);
				setState(214); ((PattContext)_localctx).patt_0 = patt(0);
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(215); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(218); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==12 );
				setState(220); match(63);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 10:
				{
				setState(223); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 11:
				{
				setState(226); match(51);
				setState(227); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(228); match(19);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 12:
				{
				setState(231); match(51);
				setState(232); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(233); match(19);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(238);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(239); match(53);
						setState(240); ((PattContext)_localctx).patt_1 = patt(9);
						((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).patt_1._patt));
						}
						break;

					case 2:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(243);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(244); match(30);
						setState(245); ((PattContext)_localctx).ident_1 = ident();
						((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
						}
						break;
					}
					} 
				}
				setState(252);
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
			setState(253); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259); ((DeclorexpContext)_localctx).decl_0 = decl();
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
			setState(272);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(265); match(12);
				setState(266); ((PattlistContext)_localctx).pattlist_1 = pattlist();
				((PattlistContext)_localctx)._pattlist =  builder.pattListMulti((((PattlistContext)_localctx).patt_0._patt),(((PattlistContext)_localctx).pattlist_1._pattlist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); ((PattlistContext)_localctx).patt_0 = patt(0);
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
		enterRule(_localctx, 18, RULE_emptylist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
			setState(277); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(278); match(47);
			setState(279); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		public VartypeContext vartype_0;
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			switch (_input.LA(1)) {
			case IDTOKEN:
				{
				setState(283); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			case 10:
				{
				setState(285); match(10);
				setState(286); ((TypeContext)_localctx).type_0 = type(0);
				setState(287); match(63);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;
			case 43:
				{
				setState(290); ((TypeContext)_localctx).vartype_0 = vartype();
				((TypeContext)_localctx)._type =  builder.varTypeType((((TypeContext)_localctx).vartype_0._vartype));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(295);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(296); match(47);
						setState(297); ((TypeContext)_localctx).type_1 = type(3);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(300);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(302); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(301); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(304); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.tupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			setState(321);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(313); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(314); match(6);
				setState(315); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
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
			setState(334);
			switch (_input.LA(1)) {
			case IDTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(323); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(324); match(7);
				setState(325); ((RecordsingleContext)_localctx).exp_1 = exp(0);
				((RecordsingleContext)_localctx)._recordsingle =  builder.recordEntrySingle(idtoken((((RecordsingleContext)_localctx).IDTOKEN_0!=null?((RecordsingleContext)_localctx).IDTOKEN_0.getText():null)),(((RecordsingleContext)_localctx).exp_1._exp));
				}
				break;
			case 49:
				enterOuterAlt(_localctx, 2);
				{
				setState(328); match(49);
				setState(329); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(330); match(7);
				setState(331); ((RecordsingleContext)_localctx).exp_1 = exp(0);
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
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
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
			setState(345);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336); match(53);
				setState(337); ((DecltypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(338); match(31);
				setState(339); ((DecltypeappendixContext)_localctx).type_1 = type(0);
				((DecltypeappendixContext)_localctx)._decltypeappendix =  builder.declConstrTypeAppendix(constrtoken((((DecltypeappendixContext)_localctx).CONSTRTOKEN_0!=null?((DecltypeappendixContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DecltypeappendixContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(342); match(53);
				setState(343); ((DecltypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
			setState(362);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(348); match(7);
				setState(349); ((DeclmonoContext)_localctx).exp_1 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMono((((DeclmonoContext)_localctx).patt_0._patt),(((DeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(354); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(353); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(356); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 10) | (1L << 51))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (CHARTOKEN - 68)) | (1L << (NULLTOKEN - 68)) | (1L << (EMPTYLISTTOKEN - 68)) | (1L << (WILDCARDTOKEN - 68)) | (1L << (BOOLTOKEN - 68)) | (1L << (INTTOKEN - 68)) | (1L << (STRINGTOKEN - 68)) | (1L << (FLOATTOKEN - 68)) | (1L << (IDTOKEN - 68)) | (1L << (CONSTRTOKEN - 68)))) != 0) );
				setState(358); match(7);
				setState(359); ((DeclmonoContext)_localctx).exp_2 = exp(0);
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
			setState(364); ((LetExpContext)_localctx).decl_0 = decl();
			setState(365); match(61);
			setState(366); ((LetExpContext)_localctx).exp_1 = exp(0);
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
			setState(387);
			switch (_input.LA(1)) {
			case 10:
				enterOuterAlt(_localctx, 1);
				{
				setState(369); match(10);
				setState(378);
				_la = _input.LA(1);
				if (_la==43) {
					{
					setState(370); ((DecloptionalvartypesContext)_localctx).vartype_0 = vartype();
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==12) {
						{
						{
						setState(371); match(12);
						setState(372); ((DecloptionalvartypesContext)_localctx).vartype = vartype();
						((DecloptionalvartypesContext)_localctx).vartype_0tail.add(((DecloptionalvartypesContext)_localctx).vartype);
						}
						}
						setState(377);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(380); match(63);
				setState(381); ((DecloptionalvartypesContext)_localctx).declnewtype_0 = declnewtype();
				((DecloptionalvartypesContext)_localctx)._decloptionalvartypes =  builder.declNewTypeWithVarTypes(lift("_vartype", ((DecloptionalvartypesContext)_localctx).vartype_0tail, ((DecloptionalvartypesContext)_localctx).vartype_0._vartype),(((DecloptionalvartypesContext)_localctx).declnewtype_0._declnewtype));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(384); ((DecloptionalvartypesContext)_localctx).declnewtype_0 = declnewtype();
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
			setState(389); match(64);
			setState(390); ((DeclnewtypeappendixContext)_localctx).decloptionalvartypes_0 = decloptionalvartypes();
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
			setState(393); match(12);
			setState(394); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
			setState(406);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(398); match(18);
				setState(399); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(403); match(18);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(409); match(25);
				setState(410); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(413); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 3:
				{
				setState(416); match(60);
				setState(417); ((FunctionContext)_localctx).function_0 = function(0);
				setState(418); match(62);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 4:
				{
				setState(421); match(10);
				setState(422); ((FunctionContext)_localctx).function_0 = function(0);
				setState(423); match(63);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(426); match(1);
				setState(427); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(430); match(1);
				setState(431); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(442);
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
					setState(436);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(437); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(444);
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
		enterRule(_localctx, 44, RULE_recanddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445); match(64);
			setState(446); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
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
		enterRule(_localctx, 46, RULE_recordpattappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449); match(12);
			setState(450); ((RecordpattappendixContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			setState(451); match(7);
			setState(452); ((RecordpattappendixContext)_localctx).patt_1 = patt(0);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(456); match(42);
				setState(457); ((ExpContext)_localctx).exp_0 = exp(39);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(460); ((ExpContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(461); ((ExpContext)_localctx).exp_1 = exp(31);
				((ExpContext)_localctx)._exp =  builder.constrExp(constrtoken((((ExpContext)_localctx).CONSTRTOKEN_0!=null?((ExpContext)_localctx).CONSTRTOKEN_0.getText():null)),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 3:
				{
				setState(464); match(65);
				setState(465); ((ExpContext)_localctx).exp_0 = exp(25);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(468); match(58);
				setState(469); ((ExpContext)_localctx).exp_0 = exp(24);
				((ExpContext)_localctx)._exp =  builder.floatNegateExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(472); match(67);
				setState(473); ((ExpContext)_localctx).exp_0 = exp(23);
				((ExpContext)_localctx)._exp =  builder.intUnarySub((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 6:
				{
				setState(476); match(37);
				setState(477); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(478); match(27);
				setState(479); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(480); match(59);
				setState(481); ((ExpContext)_localctx).exp_2 = exp(12);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 7:
				{
				setState(484); match(37);
				setState(485); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(486); match(27);
				setState(487); ((ExpContext)_localctx).exp_1 = exp(11);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 8:
				{
				setState(490); match(66);
				setState(491); ((ExpContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(492); ((ExpContext)_localctx).exp_1 = exp(4);
				((ExpContext)_localctx)._exp =  builder.raiseWithArgumentExp(constrtoken((((ExpContext)_localctx).CONSTRTOKEN_0!=null?((ExpContext)_localctx).CONSTRTOKEN_0.getText():null)),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 9:
				{
				setState(495); ((ExpContext)_localctx).EMPTYARRAYTOKEN_0 = match(EMPTYARRAYTOKEN);
				((ExpContext)_localctx)._exp =  builder.emptyArray(emptyarraytoken((((ExpContext)_localctx).EMPTYARRAYTOKEN_0!=null?((ExpContext)_localctx).EMPTYARRAYTOKEN_0.getText():null)));
				}
				break;

			case 10:
				{
				setState(497); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 11:
				{
				setState(500); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 12:
				{
				setState(503); match(10);
				setState(504); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(505); match(63);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(508); match(60);
				setState(509); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(510); match(62);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 14:
				{
				setState(513); match(10);
				setState(514); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(515); match(50);
				setState(516); ((ExpContext)_localctx).type_1 = type(0);
				setState(517); match(63);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 15:
				{
				setState(520); match(10);
				{
				setState(521); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==12) {
					{
					{
					setState(522); match(12);
					setState(523); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(529); match(63);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 16:
				{
				setState(532); match(51);
				{
				setState(533); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==12) {
					{
					{
					setState(534); match(12);
					setState(535); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(540);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(541); match(19);
				((ExpContext)_localctx)._exp =  builder.expList(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 17:
				{
				setState(544); match(40);
				setState(545); ((ExpContext)_localctx).exparray_0 = exparray();
				setState(547);
				_la = _input.LA(1);
				if (_la==35) {
					{
					setState(546); match(35);
					}
				}

				setState(549); match(22);
				((ExpContext)_localctx)._exp =  builder.arrayMulti((((ExpContext)_localctx).exparray_0._exparray));
				}
				break;

			case 18:
				{
				setState(552); match(40);
				setState(553); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(555);
				_la = _input.LA(1);
				if (_la==35) {
					{
					setState(554); match(35);
					}
				}

				setState(557); match(22);
				((ExpContext)_localctx)._exp =  builder.arraySingle((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 19:
				{
				setState(560); match(4);
				{
				setState(561); ((ExpContext)_localctx).recordsingle_0 = recordsingle();
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==12) {
					{
					{
					setState(562); match(12);
					setState(563); ((ExpContext)_localctx).recordsingle = recordsingle();
					((ExpContext)_localctx).recordsingle_0tail.add(((ExpContext)_localctx).recordsingle);
					}
					}
					setState(568);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(569); match(36);
				((ExpContext)_localctx)._exp =  builder.recordExp(lift("_recordsingle", ((ExpContext)_localctx).recordsingle_0tail, ((ExpContext)_localctx).recordsingle_0._recordsingle));
				}
				break;

			case 20:
				{
				setState(572); match(3);
				setState(573); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(574); match(9);
				setState(575); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(576); match(14);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 21:
				{
				setState(579); match(8);
				setState(580); ((ExpContext)_localctx).ident_0 = ident();
				setState(581); match(7);
				setState(582); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(583); match(26);
				setState(584); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(585); match(9);
				setState(586); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(587); match(14);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 22:
				{
				setState(590); match(8);
				setState(591); ((ExpContext)_localctx).ident_0 = ident();
				setState(592); match(7);
				setState(593); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(594); match(48);
				setState(595); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(596); match(9);
				setState(597); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(598); match(14);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 23:
				{
				setState(601); match(24);
				setState(602); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(603); match(54);
				setState(604); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 24:
				{
				setState(607); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 25:
				{
				setState(610); match(66);
				setState(611); ((ExpContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((ExpContext)_localctx)._exp =  builder.raiseExp(constrtoken((((ExpContext)_localctx).CONSTRTOKEN_0!=null?((ExpContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;

			case 26:
				{
				setState(613); match(38);
				setState(614); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(615); match(54);
				setState(616); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.tryWithExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 27:
				{
				setState(619); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(689);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(624);
						if (!(precpred(_ctx, 30))) throw new FailedPredicateException(this, "precpred(_ctx, 30)");
						setState(625); match(6);
						setState(626); ((ExpContext)_localctx).exp_1 = exp(30);
						((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(629);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(630); match(15);
						setState(631); ((ExpContext)_localctx).exp_1 = exp(23);
						((ExpContext)_localctx)._exp =  builder.intMod((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(634);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(635);
						((ExpContext)_localctx).op_1512 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 20) | (1L << 29) | (1L << 34) | (1L << 44))) != 0)) ) {
							((ExpContext)_localctx).op_1512 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(636); ((ExpContext)_localctx).exp_1 = exp(22);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/") ? builder.intDivide(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*.") ? builder.floatMultiplyExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*") ? builder.intMultiply(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/.") ? builder.floatDivideExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(639);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(640);
						((ExpContext)_localctx).op_1511 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (28 - 28)) | (1L << (56 - 28)) | (1L << (58 - 28)) | (1L << (67 - 28)))) != 0)) ) {
							((ExpContext)_localctx).op_1511 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(641); ((ExpContext)_localctx).exp_1 = exp(21);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+.") ? builder.floatAddExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-.") ? builder.floatSubtractExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+") ? builder.intAdd(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-") ? builder.intSub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(644);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(645);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 7) | (1L << 16) | (1L << 17) | (1L << 39) | (1L << 55))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(646); ((ExpContext)_localctx).exp_1 = exp(20);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.smallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("!=") ? builder.notEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.greaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.smaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.equal(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.greater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(649);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(650); match(45);
						setState(651); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						setState(652); match(13);
						setState(653); ((ExpContext)_localctx).exp_2 = exp(18);
						((ExpContext)_localctx)._exp =  builder.recordAssignExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(656);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(657); match(32);
						setState(658); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(659); match(63);
						setState(660); match(13);
						setState(661); ((ExpContext)_localctx).exp_2 = exp(16);
						((ExpContext)_localctx)._exp =  builder.arrayAssign((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(664);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(665);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==41) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(666); ((ExpContext)_localctx).exp_1 = exp(15);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(669);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(670);
						_la = _input.LA(1);
						if ( !(_la==33 || _la==57) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(671); ((ExpContext)_localctx).exp_1 = exp(14);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(674);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(675); match(35);
						setState(676); ((ExpContext)_localctx).exp_1 = exp(7);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(679);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(680); match(45);
						setState(681); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						((ExpContext)_localctx)._exp =  builder.recordSelectExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)));
						}
						break;

					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(683);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(684); match(32);
						setState(685); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(686); match(63);
						((ExpContext)_localctx)._exp =  builder.arraySelect((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(693);
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
			setState(694); match(64);
			setState(695); ((AnddeclContext)_localctx).declmono_0 = declmono();
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
		enterRule(_localctx, 52, RULE_varianttype);
		try {
			setState(705);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(699); match(31);
				setState(700); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(703); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
			setState(708); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(707); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(710); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 10) | (1L << 51))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (CHARTOKEN - 68)) | (1L << (NULLTOKEN - 68)) | (1L << (EMPTYLISTTOKEN - 68)) | (1L << (WILDCARDTOKEN - 68)) | (1L << (BOOLTOKEN - 68)) | (1L << (INTTOKEN - 68)) | (1L << (STRINGTOKEN - 68)) | (1L << (FLOATTOKEN - 68)) | (1L << (IDTOKEN - 68)) | (1L << (CONSTRTOKEN - 68)))) != 0) );
			setState(712); match(47);
			setState(713); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
			setState(716); ((ProgContext)_localctx).declimpl_0 = declimpl();
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
			setState(729);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(719); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(720); match(35);
				setState(721); ((ExparrayContext)_localctx).exparray_1 = exparray();
				((ExparrayContext)_localctx)._exparray =  builder.innerExpArrayMulti((((ExparrayContext)_localctx).exp_0._exp),(((ExparrayContext)_localctx).exparray_1._exparray));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(724); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(725); match(35);
				setState(726); ((ExparrayContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 60, RULE_tupletypelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731); match(44);
			setState(732); ((TupletypelistContext)_localctx).type_0 = type(0);
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
		enterRule(_localctx, 62, RULE_recdeclmono);
		int _la;
		try {
			setState(759);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(737); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(736); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(739); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 10) | (1L << 51))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (CHARTOKEN - 68)) | (1L << (NULLTOKEN - 68)) | (1L << (EMPTYLISTTOKEN - 68)) | (1L << (WILDCARDTOKEN - 68)) | (1L << (BOOLTOKEN - 68)) | (1L << (INTTOKEN - 68)) | (1L << (STRINGTOKEN - 68)) | (1L << (FLOATTOKEN - 68)) | (1L << (IDTOKEN - 68)) | (1L << (CONSTRTOKEN - 68)))) != 0) );
				setState(741); match(7);
				setState(742); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentPattsExp((((RecdeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((RecdeclmonoContext)_localctx).patt_1_list),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(745); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(746); match(7);
				setState(747); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(750); match(10);
				setState(751); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(752); match(50);
				setState(753); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(754); match(63);
				setState(755); match(7);
				setState(756); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
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
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
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
		enterRule(_localctx, 64, RULE_declexceptionappendix);
		try {
			setState(770);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761); match(64);
				setState(762); ((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(763); match(31);
				setState(764); ((DeclexceptionappendixContext)_localctx).type_1 = type(0);
				((DeclexceptionappendixContext)_localctx)._declexceptionappendix =  builder.declConstrExceptionAppendix(constrtoken((((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0!=null?((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DeclexceptionappendixContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767); match(64);
				setState(768); ((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 66, RULE_recdecl);
		int _la;
		try {
			setState(783);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(772); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				((RecdeclContext)_localctx)._recdecl =  builder.recDeclMono((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(775); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(777); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(776); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(779); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==64 );
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
		public Token IDTOKEN_0;
		public TypeContext type_1;
		public Token CONSTRTOKEN_1;
		public TypeContext type_2;
		public DecltypeappendixContext decltypeappendix;
		public List<DecltypeappendixContext> decltypeappendix_3_list = new ArrayList<DecltypeappendixContext>();
		public List<DecltypeappendixContext> decltypeappendix_2_list = new ArrayList<DecltypeappendixContext>();
		public IdentContext ident_0;
		public DecllabeltypeContext decllabeltype_1;
		public DecllabeltypeContext decllabeltype;
		public List<DecllabeltypeContext> decllabeltype_1tail = new ArrayList<DecllabeltypeContext>();
		public TerminalNode CONSTRTOKEN() { return getToken(CLParser.CONSTRTOKEN, 0); }
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public DecllabeltypeContext decllabeltype(int i) {
			return getRuleContext(DecllabeltypeContext.class,i);
		}
		public DecltypeappendixContext decltypeappendix(int i) {
			return getRuleContext(DecltypeappendixContext.class,i);
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
		public List<DecltypeappendixContext> decltypeappendix() {
			return getRuleContexts(DecltypeappendixContext.class);
		}
		public DeclnewtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declnewtype; }
	}

	public final DeclnewtypeContext declnewtype() throws RecognitionException {
		DeclnewtypeContext _localctx = new DeclnewtypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_declnewtype);
		int _la;
		try {
			setState(827);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(785); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(786); match(52);
				setState(787); ((DeclnewtypeContext)_localctx).type_1 = type(0);
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declTypeDefEquals(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),(((DeclnewtypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(790); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(791); match(7);
				setState(792); ((DeclnewtypeContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(793); match(31);
				setState(794); ((DeclnewtypeContext)_localctx).type_2 = type(0);
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==53) {
					{
					{
					setState(795); ((DeclnewtypeContext)_localctx).decltypeappendix = decltypeappendix();
					((DeclnewtypeContext)_localctx).decltypeappendix_3_list.add(((DeclnewtypeContext)_localctx).decltypeappendix);
					}
					}
					setState(800);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declNewConstrType(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclnewtypeContext)_localctx).CONSTRTOKEN_1!=null?((DeclnewtypeContext)_localctx).CONSTRTOKEN_1.getText():null)),(((DeclnewtypeContext)_localctx).type_2._type),lift("_decltypeappendix", ((DeclnewtypeContext)_localctx).decltypeappendix_3_list));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(803); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(804); match(7);
				setState(805); ((DeclnewtypeContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(809);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==53) {
					{
					{
					setState(806); ((DeclnewtypeContext)_localctx).decltypeappendix = decltypeappendix();
					((DeclnewtypeContext)_localctx).decltypeappendix_2_list.add(((DeclnewtypeContext)_localctx).decltypeappendix);
					}
					}
					setState(811);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declNewEnumType(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclnewtypeContext)_localctx).CONSTRTOKEN_1!=null?((DeclnewtypeContext)_localctx).CONSTRTOKEN_1.getText():null)),lift("_decltypeappendix", ((DeclnewtypeContext)_localctx).decltypeappendix_2_list));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(813); ((DeclnewtypeContext)_localctx).ident_0 = ident();
				setState(814); match(7);
				setState(815); match(4);
				{
				setState(816); ((DeclnewtypeContext)_localctx).decllabeltype_1 = decllabeltype();
				setState(821);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==12) {
					{
					{
					setState(817); match(12);
					setState(818); ((DeclnewtypeContext)_localctx).decllabeltype = decllabeltype();
					((DeclnewtypeContext)_localctx).decllabeltype_1tail.add(((DeclnewtypeContext)_localctx).decllabeltype);
					}
					}
					setState(823);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(824); match(36);
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declRecordType((((DeclnewtypeContext)_localctx).ident_0._ident),lift("_decllabeltype", ((DeclnewtypeContext)_localctx).decllabeltype_1tail, ((DeclnewtypeContext)_localctx).decllabeltype_1._decllabeltype));
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

		case 21: return function_sempred((FunctionContext)_localctx, predIndex);

		case 24: return exp_sempred((ExpContext)_localctx, predIndex);
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
		case 2: return precpred(_ctx, 2);

		case 3: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16: return precpred(_ctx, 16);

		case 5: return precpred(_ctx, 30);

		case 6: return precpred(_ctx, 22);

		case 7: return precpred(_ctx, 21);

		case 8: return precpred(_ctx, 20);

		case 9: return precpred(_ctx, 19);

		case 10: return precpred(_ctx, 17);

		case 11: return precpred(_ctx, 15);

		case 12: return precpred(_ctx, 14);

		case 13: return precpred(_ctx, 13);

		case 14: return precpred(_ctx, 7);

		case 15: return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3R\u0340\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2U\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3h\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4u\n"+
		"\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0086"+
		"\n\6\f\6\16\6\u0089\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0091\n\6\f\6\16"+
		"\6\u0094\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00a8\n\6\r\6\16\6\u00a9\3\6\3\6\5"+
		"\6\u00ae\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ba\n\7\f\7"+
		"\16\7\u00bd\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00db\n"+
		"\7\r\7\16\7\u00dc\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u00ef\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7"+
		"\u00fb\n\7\f\7\16\7\u00fe\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0109\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0113\n\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0128"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\6\r\u0131\n\r\r\r\16\r\u0132\3\r\3\r"+
		"\7\r\u0137\n\r\f\r\16\r\u013a\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\5\16\u0144\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0151\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u015c\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u0165\n\21\r\21\16"+
		"\21\u0166\3\21\3\21\3\21\3\21\5\21\u016d\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\7\23\u0178\n\23\f\23\16\23\u017b\13\23\5\23\u017d"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0186\n\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0199\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u01b5\n\27\3\27\3\27\3\27\3\27\7\27\u01bb\n\27\f\27\16\27\u01be"+
		"\13\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u020f\n\32\f\32"+
		"\16\32\u0212\13\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u021b\n\32"+
		"\f\32\16\32\u021e\13\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0226\n\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u022e\n\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\7\32\u0237\n\32\f\32\16\32\u023a\13\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0271\n\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\7\32\u02b4\n\32\f\32\16\32\u02b7\13\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u02c4\n\34\3\35"+
		"\6\35\u02c7\n\35\r\35\16\35\u02c8\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u02dc\n\37\3 \3"+
		" \3 \3 \3!\3!\6!\u02e4\n!\r!\16!\u02e5\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\5!\u02fa\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0305\n\"\3#\3#\3#\3#\3#\6#\u030c\n#\r#\16#\u030d\3#\3#\5#\u0312"+
		"\n#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\7$\u031f\n$\f$\16$\u0322\13$\3$\3"+
		"$\3$\3$\3$\3$\7$\u032a\n$\f$\16$\u032d\13$\3$\3$\3$\3$\3$\3$\3$\7$\u0336"+
		"\n$\f$\16$\u0339\13$\3$\3$\3$\5$\u033e\n$\3$\2\6\f\30,\62%\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\7\6\2\26\26"+
		"\37\37$$..\6\2\36\36::<<EE\7\2\4\4\t\t\22\23))99\4\2\7\7++\4\2##;;\u038f"+
		"\2T\3\2\2\2\4g\3\2\2\2\6t\3\2\2\2\bv\3\2\2\2\n\u00ad\3\2\2\2\f\u00ee\3"+
		"\2\2\2\16\u00ff\3\2\2\2\20\u0108\3\2\2\2\22\u0112\3\2\2\2\24\u0114\3\2"+
		"\2\2\26\u0117\3\2\2\2\30\u0127\3\2\2\2\32\u0143\3\2\2\2\34\u0150\3\2\2"+
		"\2\36\u015b\3\2\2\2 \u016c\3\2\2\2\"\u016e\3\2\2\2$\u0185\3\2\2\2&\u0187"+
		"\3\2\2\2(\u018b\3\2\2\2*\u0198\3\2\2\2,\u01b4\3\2\2\2.\u01bf\3\2\2\2\60"+
		"\u01c3\3\2\2\2\62\u0270\3\2\2\2\64\u02b8\3\2\2\2\66\u02c3\3\2\2\28\u02c6"+
		"\3\2\2\2:\u02ce\3\2\2\2<\u02db\3\2\2\2>\u02dd\3\2\2\2@\u02f9\3\2\2\2B"+
		"\u0304\3\2\2\2D\u0311\3\2\2\2F\u033d\3\2\2\2HI\7\67\2\2IJ\5\2\2\2JK\b"+
		"\2\1\2KU\3\2\2\2LM\5\26\f\2MN\7\67\2\2NO\5\2\2\2OP\b\2\1\2PU\3\2\2\2Q"+
		"R\5\26\f\2RS\b\2\1\2SU\3\2\2\2TH\3\2\2\2TL\3\2\2\2TQ\3\2\2\2U\3\3\2\2"+
		"\2VW\5\24\13\2WX\b\3\1\2Xh\3\2\2\2YZ\7R\2\2Zh\b\3\1\2[\\\7K\2\2\\h\b\3"+
		"\1\2]^\7M\2\2^h\b\3\1\2_`\7F\2\2`h\b\3\1\2ab\7N\2\2bh\b\3\1\2cd\7G\2\2"+
		"dh\b\3\1\2ef\7O\2\2fh\b\3\1\2gV\3\2\2\2gY\3\2\2\2g[\3\2\2\2g]\3\2\2\2"+
		"g_\3\2\2\2ga\3\2\2\2gc\3\2\2\2ge\3\2\2\2h\5\3\2\2\2ij\7\63\2\2jk\7Q\2"+
		"\2kl\7\64\2\2lm\5\30\r\2mn\b\4\1\2nu\3\2\2\2op\7Q\2\2pq\7\64\2\2qr\5\30"+
		"\r\2rs\b\4\1\2su\3\2\2\2ti\3\2\2\2to\3\2\2\2u\7\3\2\2\2vw\7-\2\2wx\7Q"+
		"\2\2xy\b\5\1\2y\t\3\2\2\2z{\7\31\2\2{|\7\r\2\2|}\5D#\2}~\b\6\1\2~\u00ae"+
		"\3\2\2\2\177\u0080\5 \21\2\u0080\u0081\b\6\1\2\u0081\u00ae\3\2\2\2\u0082"+
		"\u0083\7\60\2\2\u0083\u0087\7R\2\2\u0084\u0086\5B\"\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u00ae\b\6\1\2\u008b\u008c\7\60"+
		"\2\2\u008c\u008d\7R\2\2\u008d\u008e\7!\2\2\u008e\u0092\5\30\r\2\u008f"+
		"\u0091\5B\"\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2"+
		"\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0096\b\6\1\2\u0096\u00ae\3\2\2\2\u0097\u0098\7\27\2\2\u0098\u009c\5"+
		"$\23\2\u0099\u009b\5&\24\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c"+
		"\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009f\u00a0\b\6\1\2\u00a0\u00ae\3\2\2\2\u00a1\u00a2\7\31\2\2\u00a2"+
		"\u00a3\5\n\6\2\u00a3\u00a4\b\6\1\2\u00a4\u00ae\3\2\2\2\u00a5\u00a7\5 "+
		"\21\2\u00a6\u00a8\5\64\33\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\6"+
		"\1\2\u00ac\u00ae\3\2\2\2\u00adz\3\2\2\2\u00ad\177\3\2\2\2\u00ad\u0082"+
		"\3\2\2\2\u00ad\u008b\3\2\2\2\u00ad\u0097\3\2\2\2\u00ad\u00a1\3\2\2\2\u00ad"+
		"\u00a5\3\2\2\2\u00ae\13\3\2\2\2\u00af\u00b0\b\7\1\2\u00b0\u00b1\7R\2\2"+
		"\u00b1\u00b2\5\f\7\b\u00b2\u00b3\b\7\1\2\u00b3\u00ef\3\2\2\2\u00b4\u00b5"+
		"\7\6\2\2\u00b5\u00b6\7Q\2\2\u00b6\u00b7\7\t\2\2\u00b7\u00bb\5\f\7\2\u00b8"+
		"\u00ba\5\60\31\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be"+
		"\u00bf\7&\2\2\u00bf\u00c0\b\7\1\2\u00c0\u00ef\3\2\2\2\u00c1\u00c2\5\16"+
		"\b\2\u00c2\u00c3\b\7\1\2\u00c3\u00ef\3\2\2\2\u00c4\u00c5\7J\2\2\u00c5"+
		"\u00ef\b\7\1\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8\5\f\7\2\u00c8\u00c9\7A"+
		"\2\2\u00c9\u00ca\b\7\1\2\u00ca\u00ef\3\2\2\2\u00cb\u00cc\7\f\2\2\u00cc"+
		"\u00cd\5\f\7\2\u00cd\u00ce\7\64\2\2\u00ce\u00cf\5\30\r\2\u00cf\u00d0\7"+
		"A\2\2\u00d0\u00d1\b\7\1\2\u00d1\u00ef\3\2\2\2\u00d2\u00d3\5\4\3\2\u00d3"+
		"\u00d4\b\7\1\2\u00d4\u00ef\3\2\2\2\u00d5\u00d6\7R\2\2\u00d6\u00ef\b\7"+
		"\1\2\u00d7\u00d8\7\f\2\2\u00d8\u00da\5\f\7\2\u00d9\u00db\5(\25\2\u00da"+
		"\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7A\2\2\u00df\u00e0\b\7\1\2\u00e0"+
		"\u00ef\3\2\2\2\u00e1\u00e2\5\24\13\2\u00e2\u00e3\b\7\1\2\u00e3\u00ef\3"+
		"\2\2\2\u00e4\u00e5\7\65\2\2\u00e5\u00e6\5\22\n\2\u00e6\u00e7\7\25\2\2"+
		"\u00e7\u00e8\b\7\1\2\u00e8\u00ef\3\2\2\2\u00e9\u00ea\7\65\2\2\u00ea\u00eb"+
		"\5\32\16\2\u00eb\u00ec\7\25\2\2\u00ec\u00ed\b\7\1\2\u00ed\u00ef\3\2\2"+
		"\2\u00ee\u00af\3\2\2\2\u00ee\u00b4\3\2\2\2\u00ee\u00c1\3\2\2\2\u00ee\u00c4"+
		"\3\2\2\2\u00ee\u00c6\3\2\2\2\u00ee\u00cb\3\2\2\2\u00ee\u00d2\3\2\2\2\u00ee"+
		"\u00d5\3\2\2\2\u00ee\u00d7\3\2\2\2\u00ee\u00e1\3\2\2\2\u00ee\u00e4\3\2"+
		"\2\2\u00ee\u00e9\3\2\2\2\u00ef\u00fc\3\2\2\2\u00f0\u00f1\f\n\2\2\u00f1"+
		"\u00f2\7\67\2\2\u00f2\u00f3\5\f\7\13\u00f3\u00f4\b\7\1\2\u00f4\u00fb\3"+
		"\2\2\2\u00f5\u00f6\f\r\2\2\u00f6\u00f7\7 \2\2\u00f7\u00f8\5\16\b\2\u00f8"+
		"\u00f9\b\7\1\2\u00f9\u00fb\3\2\2\2\u00fa\u00f0\3\2\2\2\u00fa\u00f5\3\2"+
		"\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\r\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7Q\2\2\u0100\u0101\b\b\1\2"+
		"\u0101\17\3\2\2\2\u0102\u0103\5\62\32\2\u0103\u0104\b\t\1\2\u0104\u0109"+
		"\3\2\2\2\u0105\u0106\5\n\6\2\u0106\u0107\b\t\1\2\u0107\u0109\3\2\2\2\u0108"+
		"\u0102\3\2\2\2\u0108\u0105\3\2\2\2\u0109\21\3\2\2\2\u010a\u010b\5\f\7"+
		"\2\u010b\u010c\7\16\2\2\u010c\u010d\5\22\n\2\u010d\u010e\b\n\1\2\u010e"+
		"\u0113\3\2\2\2\u010f\u0110\5\f\7\2\u0110\u0111\b\n\1\2\u0111\u0113\3\2"+
		"\2\2\u0112\u010a\3\2\2\2\u0112\u010f\3\2\2\2\u0113\23\3\2\2\2\u0114\u0115"+
		"\7H\2\2\u0115\u0116\b\13\1\2\u0116\25\3\2\2\2\u0117\u0118\5\f\7\2\u0118"+
		"\u0119\7\61\2\2\u0119\u011a\5\62\32\2\u011a\u011b\b\f\1\2\u011b\27\3\2"+
		"\2\2\u011c\u011d\b\r\1\2\u011d\u011e\7Q\2\2\u011e\u0128\b\r\1\2\u011f"+
		"\u0120\7\f\2\2\u0120\u0121\5\30\r\2\u0121\u0122\7A\2\2\u0122\u0123\b\r"+
		"\1\2\u0123\u0128\3\2\2\2\u0124\u0125\5\b\5\2\u0125\u0126\b\r\1\2\u0126"+
		"\u0128\3\2\2\2\u0127\u011c\3\2\2\2\u0127\u011f\3\2\2\2\u0127\u0124\3\2"+
		"\2\2\u0128\u0138\3\2\2\2\u0129\u012a\f\4\2\2\u012a\u012b\7\61\2\2\u012b"+
		"\u012c\5\30\r\5\u012c\u012d\b\r\1\2\u012d\u0137\3\2\2\2\u012e\u0130\f"+
		"\3\2\2\u012f\u0131\5> \2\u0130\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\b\r"+
		"\1\2\u0135\u0137\3\2\2\2\u0136\u0129\3\2\2\2\u0136\u012e\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\31\3\2\2"+
		"\2\u013a\u0138\3\2\2\2\u013b\u013c\5\f\7\2\u013c\u013d\7\b\2\2\u013d\u013e"+
		"\5\32\16\2\u013e\u013f\b\16\1\2\u013f\u0144\3\2\2\2\u0140\u0141\5\f\7"+
		"\2\u0141\u0142\b\16\1\2\u0142\u0144\3\2\2\2\u0143\u013b\3\2\2\2\u0143"+
		"\u0140\3\2\2\2\u0144\33\3\2\2\2\u0145\u0146\7Q\2\2\u0146\u0147\7\t\2\2"+
		"\u0147\u0148\5\62\32\2\u0148\u0149\b\17\1\2\u0149\u0151\3\2\2\2\u014a"+
		"\u014b\7\63\2\2\u014b\u014c\7Q\2\2\u014c\u014d\7\t\2\2\u014d\u014e\5\62"+
		"\32\2\u014e\u014f\b\17\1\2\u014f\u0151\3\2\2\2\u0150\u0145\3\2\2\2\u0150"+
		"\u014a\3\2\2\2\u0151\35\3\2\2\2\u0152\u0153\7\67\2\2\u0153\u0154\7R\2"+
		"\2\u0154\u0155\7!\2\2\u0155\u0156\5\30\r\2\u0156\u0157\b\20\1\2\u0157"+
		"\u015c\3\2\2\2\u0158\u0159\7\67\2\2\u0159\u015a\7R\2\2\u015a\u015c\b\20"+
		"\1\2\u015b\u0152\3\2\2\2\u015b\u0158\3\2\2\2\u015c\37\3\2\2\2\u015d\u015e"+
		"\5\f\7\2\u015e\u015f\7\t\2\2\u015f\u0160\5\62\32\2\u0160\u0161\b\21\1"+
		"\2\u0161\u016d\3\2\2\2\u0162\u0164\5\16\b\2\u0163\u0165\5\f\7\2\u0164"+
		"\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u0169\7\t\2\2\u0169\u016a\5\62\32\2\u016a"+
		"\u016b\b\21\1\2\u016b\u016d\3\2\2\2\u016c\u015d\3\2\2\2\u016c\u0162\3"+
		"\2\2\2\u016d!\3\2\2\2\u016e\u016f\5\n\6\2\u016f\u0170\7?\2\2\u0170\u0171"+
		"\5\62\32\2\u0171\u0172\b\22\1\2\u0172#\3\2\2\2\u0173\u017c\7\f\2\2\u0174"+
		"\u0179\5\b\5\2\u0175\u0176\7\16\2\2\u0176\u0178\5\b\5\2\u0177\u0175\3"+
		"\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a"+
		"\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u0174\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017e\u017f\7A\2\2\u017f\u0180\5F$\2\u0180\u0181"+
		"\b\23\1\2\u0181\u0186\3\2\2\2\u0182\u0183\5F$\2\u0183\u0184\b\23\1\2\u0184"+
		"\u0186\3\2\2\2\u0185\u0173\3\2\2\2\u0185\u0182\3\2\2\2\u0186%\3\2\2\2"+
		"\u0187\u0188\7B\2\2\u0188\u0189\5$\23\2\u0189\u018a\b\24\1\2\u018a\'\3"+
		"\2\2\2\u018b\u018c\7\16\2\2\u018c\u018d\5\f\7\2\u018d\u018e\b\25\1\2\u018e"+
		")\3\2\2\2\u018f\u0190\5\20\t\2\u0190\u0191\7\24\2\2\u0191\u0192\5*\26"+
		"\2\u0192\u0193\b\26\1\2\u0193\u0199\3\2\2\2\u0194\u0195\5\20\t\2\u0195"+
		"\u0196\7\24\2\2\u0196\u0197\b\26\1\2\u0197\u0199\3\2\2\2\u0198\u018f\3"+
		"\2\2\2\u0198\u0194\3\2\2\2\u0199+\3\2\2\2\u019a\u019b\b\27\1\2\u019b\u019c"+
		"\7\33\2\2\u019c\u019d\5\2\2\2\u019d\u019e\b\27\1\2\u019e\u01b5\3\2\2\2"+
		"\u019f\u01a0\5\16\b\2\u01a0\u01a1\b\27\1\2\u01a1\u01b5\3\2\2\2\u01a2\u01a3"+
		"\7>\2\2\u01a3\u01a4\5,\27\2\u01a4\u01a5\7@\2\2\u01a5\u01a6\b\27\1\2\u01a6"+
		"\u01b5\3\2\2\2\u01a7\u01a8\7\f\2\2\u01a8\u01a9\5,\27\2\u01a9\u01aa\7A"+
		"\2\2\u01aa\u01ab\b\27\1\2\u01ab\u01b5\3\2\2\2\u01ac\u01ad\7\3\2\2\u01ad"+
		"\u01ae\5\26\f\2\u01ae\u01af\b\27\1\2\u01af\u01b5\3\2\2\2\u01b0\u01b1\7"+
		"\3\2\2\u01b1\u01b2\58\35\2\u01b2\u01b3\b\27\1\2\u01b3\u01b5\3\2\2\2\u01b4"+
		"\u019a\3\2\2\2\u01b4\u019f\3\2\2\2\u01b4\u01a2\3\2\2\2\u01b4\u01a7\3\2"+
		"\2\2\u01b4\u01ac\3\2\2\2\u01b4\u01b0\3\2\2\2\u01b5\u01bc\3\2\2\2\u01b6"+
		"\u01b7\f\7\2\2\u01b7\u01b8\5\62\32\2\u01b8\u01b9\b\27\1\2\u01b9\u01bb"+
		"\3\2\2\2\u01ba\u01b6\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd-\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\7B\2\2\u01c0"+
		"\u01c1\5@!\2\u01c1\u01c2\b\30\1\2\u01c2/\3\2\2\2\u01c3\u01c4\7\16\2\2"+
		"\u01c4\u01c5\7Q\2\2\u01c5\u01c6\7\t\2\2\u01c6\u01c7\5\f\7\2\u01c7\u01c8"+
		"\b\31\1\2\u01c8\61\3\2\2\2\u01c9\u01ca\b\32\1\2\u01ca\u01cb\7,\2\2\u01cb"+
		"\u01cc\5\62\32)\u01cc\u01cd\b\32\1\2\u01cd\u0271\3\2\2\2\u01ce\u01cf\7"+
		"R\2\2\u01cf\u01d0\5\62\32!\u01d0\u01d1\b\32\1\2\u01d1\u0271\3\2\2\2\u01d2"+
		"\u01d3\7C\2\2\u01d3\u01d4\5\62\32\33\u01d4\u01d5\b\32\1\2\u01d5\u0271"+
		"\3\2\2\2\u01d6\u01d7\7<\2\2\u01d7\u01d8\5\62\32\32\u01d8\u01d9\b\32\1"+
		"\2\u01d9\u0271\3\2\2\2\u01da\u01db\7E\2\2\u01db\u01dc\5\62\32\31\u01dc"+
		"\u01dd\b\32\1\2\u01dd\u0271\3\2\2\2\u01de\u01df\7\'\2\2\u01df\u01e0\5"+
		"\62\32\2\u01e0\u01e1\7\35\2\2\u01e1\u01e2\5\62\32\2\u01e2\u01e3\7=\2\2"+
		"\u01e3\u01e4\5\62\32\16\u01e4\u01e5\b\32\1\2\u01e5\u0271\3\2\2\2\u01e6"+
		"\u01e7\7\'\2\2\u01e7\u01e8\5\62\32\2\u01e8\u01e9\7\35\2\2\u01e9\u01ea"+
		"\5\62\32\r\u01ea\u01eb\b\32\1\2\u01eb\u0271\3\2\2\2\u01ec\u01ed\7D\2\2"+
		"\u01ed\u01ee\7R\2\2\u01ee\u01ef\5\62\32\6\u01ef\u01f0\b\32\1\2\u01f0\u0271"+
		"\3\2\2\2\u01f1\u01f2\7I\2\2\u01f2\u0271\b\32\1\2\u01f3\u01f4\5\16\b\2"+
		"\u01f4\u01f5\b\32\1\2\u01f5\u0271\3\2\2\2\u01f6\u01f7\5\4\3\2\u01f7\u01f8"+
		"\b\32\1\2\u01f8\u0271\3\2\2\2\u01f9\u01fa\7\f\2\2\u01fa\u01fb\5\62\32"+
		"\2\u01fb\u01fc\7A\2\2\u01fc\u01fd\b\32\1\2\u01fd\u0271\3\2\2\2\u01fe\u01ff"+
		"\7>\2\2\u01ff\u0200\5\62\32\2\u0200\u0201\7@\2\2\u0201\u0202\b\32\1\2"+
		"\u0202\u0271\3\2\2\2\u0203\u0204\7\f\2\2\u0204\u0205\5\62\32\2\u0205\u0206"+
		"\7\64\2\2\u0206\u0207\5\30\r\2\u0207\u0208\7A\2\2\u0208\u0209\b\32\1\2"+
		"\u0209\u0271\3\2\2\2\u020a\u020b\7\f\2\2\u020b\u0210\5\62\32\2\u020c\u020d"+
		"\7\16\2\2\u020d\u020f\5\62\32\2\u020e\u020c\3\2\2\2\u020f\u0212\3\2\2"+
		"\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0213\3\2\2\2\u0212\u0210"+
		"\3\2\2\2\u0213\u0214\7A\2\2\u0214\u0215\b\32\1\2\u0215\u0271\3\2\2\2\u0216"+
		"\u0217\7\65\2\2\u0217\u021c\5\62\32\2\u0218\u0219\7\16\2\2\u0219\u021b"+
		"\5\62\32\2\u021a\u0218\3\2\2\2\u021b\u021e\3\2\2\2\u021c\u021a\3\2\2\2"+
		"\u021c\u021d\3\2\2\2\u021d\u021f\3\2\2\2\u021e\u021c\3\2\2\2\u021f\u0220"+
		"\7\25\2\2\u0220\u0221\b\32\1\2\u0221\u0271\3\2\2\2\u0222\u0223\7*\2\2"+
		"\u0223\u0225\5<\37\2\u0224\u0226\7%\2\2\u0225\u0224\3\2\2\2\u0225\u0226"+
		"\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\7\30\2\2\u0228\u0229\b\32\1\2"+
		"\u0229\u0271\3\2\2\2\u022a\u022b\7*\2\2\u022b\u022d\5\62\32\2\u022c\u022e"+
		"\7%\2\2\u022d\u022c\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f"+
		"\u0230\7\30\2\2\u0230\u0231\b\32\1\2\u0231\u0271\3\2\2\2\u0232\u0233\7"+
		"\6\2\2\u0233\u0238\5\34\17\2\u0234\u0235\7\16\2\2\u0235\u0237\5\34\17"+
		"\2\u0236\u0234\3\2\2\2\u0237\u023a\3\2\2\2\u0238\u0236\3\2\2\2\u0238\u0239"+
		"\3\2\2\2\u0239\u023b\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023c\7&\2\2\u023c"+
		"\u023d\b\32\1\2\u023d\u0271\3\2\2\2\u023e\u023f\7\5\2\2\u023f\u0240\5"+
		"\62\32\2\u0240\u0241\7\13\2\2\u0241\u0242\5\62\32\2\u0242\u0243\7\20\2"+
		"\2\u0243\u0244\b\32\1\2\u0244\u0271\3\2\2\2\u0245\u0246\7\n\2\2\u0246"+
		"\u0247\5\16\b\2\u0247\u0248\7\t\2\2\u0248\u0249\5\62\32\2\u0249\u024a"+
		"\7\34\2\2\u024a\u024b\5\62\32\2\u024b\u024c\7\13\2\2\u024c\u024d\5\62"+
		"\32\2\u024d\u024e\7\20\2\2\u024e\u024f\b\32\1\2\u024f\u0271\3\2\2\2\u0250"+
		"\u0251\7\n\2\2\u0251\u0252\5\16\b\2\u0252\u0253\7\t\2\2\u0253\u0254\5"+
		"\62\32\2\u0254\u0255\7\62\2\2\u0255\u0256\5\62\32\2\u0256\u0257\7\13\2"+
		"\2\u0257\u0258\5\62\32\2\u0258\u0259\7\20\2\2\u0259\u025a\b\32\1\2\u025a"+
		"\u0271\3\2\2\2\u025b\u025c\7\32\2\2\u025c\u025d\5\62\32\2\u025d\u025e"+
		"\78\2\2\u025e\u025f\5\2\2\2\u025f\u0260\b\32\1\2\u0260\u0271\3\2\2\2\u0261"+
		"\u0262\5,\27\2\u0262\u0263\b\32\1\2\u0263\u0271\3\2\2\2\u0264\u0265\7"+
		"D\2\2\u0265\u0266\7R\2\2\u0266\u0271\b\32\1\2\u0267\u0268\7(\2\2\u0268"+
		"\u0269\5\62\32\2\u0269\u026a\78\2\2\u026a\u026b\5\2\2\2\u026b\u026c\b"+
		"\32\1\2\u026c\u0271\3\2\2\2\u026d\u026e\5\"\22\2\u026e\u026f\b\32\1\2"+
		"\u026f\u0271\3\2\2\2\u0270\u01c9\3\2\2\2\u0270\u01ce\3\2\2\2\u0270\u01d2"+
		"\3\2\2\2\u0270\u01d6\3\2\2\2\u0270\u01da\3\2\2\2\u0270\u01de\3\2\2\2\u0270"+
		"\u01e6\3\2\2\2\u0270\u01ec\3\2\2\2\u0270\u01f1\3\2\2\2\u0270\u01f3\3\2"+
		"\2\2\u0270\u01f6\3\2\2\2\u0270\u01f9\3\2\2\2\u0270\u01fe\3\2\2\2\u0270"+
		"\u0203\3\2\2\2\u0270\u020a\3\2\2\2\u0270\u0216\3\2\2\2\u0270\u0222\3\2"+
		"\2\2\u0270\u022a\3\2\2\2\u0270\u0232\3\2\2\2\u0270\u023e\3\2\2\2\u0270"+
		"\u0245\3\2\2\2\u0270\u0250\3\2\2\2\u0270\u025b\3\2\2\2\u0270\u0261\3\2"+
		"\2\2\u0270\u0264\3\2\2\2\u0270\u0267\3\2\2\2\u0270\u026d\3\2\2\2\u0271"+
		"\u02b5\3\2\2\2\u0272\u0273\f \2\2\u0273\u0274\7\b\2\2\u0274\u0275\5\62"+
		"\32 \u0275\u0276\b\32\1\2\u0276\u02b4\3\2\2\2\u0277\u0278\f\30\2\2\u0278"+
		"\u0279\7\21\2\2\u0279\u027a\5\62\32\31\u027a\u027b\b\32\1\2\u027b\u02b4"+
		"\3\2\2\2\u027c\u027d\f\27\2\2\u027d\u027e\t\2\2\2\u027e\u027f\5\62\32"+
		"\30\u027f\u0280\b\32\1\2\u0280\u02b4\3\2\2\2\u0281\u0282\f\26\2\2\u0282"+
		"\u0283\t\3\2\2\u0283\u0284\5\62\32\27\u0284\u0285\b\32\1\2\u0285\u02b4"+
		"\3\2\2\2\u0286\u0287\f\25\2\2\u0287\u0288\t\4\2\2\u0288\u0289\5\62\32"+
		"\26\u0289\u028a\b\32\1\2\u028a\u02b4\3\2\2\2\u028b\u028c\f\23\2\2\u028c"+
		"\u028d\7/\2\2\u028d\u028e\7Q\2\2\u028e\u028f\7\17\2\2\u028f\u0290\5\62"+
		"\32\24\u0290\u0291\b\32\1\2\u0291\u02b4\3\2\2\2\u0292\u0293\f\21\2\2\u0293"+
		"\u0294\7\"\2\2\u0294\u0295\5\62\32\2\u0295\u0296\7A\2\2\u0296\u0297\7"+
		"\17\2\2\u0297\u0298\5\62\32\22\u0298\u0299\b\32\1\2\u0299\u02b4\3\2\2"+
		"\2\u029a\u029b\f\20\2\2\u029b\u029c\t\5\2\2\u029c\u029d\5\62\32\21\u029d"+
		"\u029e\b\32\1\2\u029e\u02b4\3\2\2\2\u029f\u02a0\f\17\2\2\u02a0\u02a1\t"+
		"\6\2\2\u02a1\u02a2\5\62\32\20\u02a2\u02a3\b\32\1\2\u02a3\u02b4\3\2\2\2"+
		"\u02a4\u02a5\f\t\2\2\u02a5\u02a6\7%\2\2\u02a6\u02a7\5\62\32\t\u02a7\u02a8"+
		"\b\32\1\2\u02a8\u02b4\3\2\2\2\u02a9\u02aa\f\24\2\2\u02aa\u02ab\7/\2\2"+
		"\u02ab\u02ac\7Q\2\2\u02ac\u02b4\b\32\1\2\u02ad\u02ae\f\22\2\2\u02ae\u02af"+
		"\7\"\2\2\u02af\u02b0\5\62\32\2\u02b0\u02b1\7A\2\2\u02b1\u02b2\b\32\1\2"+
		"\u02b2\u02b4\3\2\2\2\u02b3\u0272\3\2\2\2\u02b3\u0277\3\2\2\2\u02b3\u027c"+
		"\3\2\2\2\u02b3\u0281\3\2\2\2\u02b3\u0286\3\2\2\2\u02b3\u028b\3\2\2\2\u02b3"+
		"\u0292\3\2\2\2\u02b3\u029a\3\2\2\2\u02b3\u029f\3\2\2\2\u02b3\u02a4\3\2"+
		"\2\2\u02b3\u02a9\3\2\2\2\u02b3\u02ad\3\2\2\2\u02b4\u02b7\3\2\2\2\u02b5"+
		"\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\63\3\2\2\2\u02b7\u02b5\3\2\2"+
		"\2\u02b8\u02b9\7B\2\2\u02b9\u02ba\5 \21\2\u02ba\u02bb\b\33\1\2\u02bb\65"+
		"\3\2\2\2\u02bc\u02bd\7R\2\2\u02bd\u02be\7!\2\2\u02be\u02bf\5\30\r\2\u02bf"+
		"\u02c0\b\34\1\2\u02c0\u02c4\3\2\2\2\u02c1\u02c2\7R\2\2\u02c2\u02c4\b\34"+
		"\1\2\u02c3\u02bc\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4\67\3\2\2\2\u02c5\u02c7"+
		"\5\f\7\2\u02c6\u02c5\3\2\2\2\u02c7\u02c8\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8"+
		"\u02c9\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02cb\7\61\2\2\u02cb\u02cc\5"+
		"\62\32\2\u02cc\u02cd\b\35\1\2\u02cd9\3\2\2\2\u02ce\u02cf\5*\26\2\u02cf"+
		"\u02d0\b\36\1\2\u02d0;\3\2\2\2\u02d1\u02d2\5\62\32\2\u02d2\u02d3\7%\2"+
		"\2\u02d3\u02d4\5<\37\2\u02d4\u02d5\b\37\1\2\u02d5\u02dc\3\2\2\2\u02d6"+
		"\u02d7\5\62\32\2\u02d7\u02d8\7%\2\2\u02d8\u02d9\5\62\32\2\u02d9\u02da"+
		"\b\37\1\2\u02da\u02dc\3\2\2\2\u02db\u02d1\3\2\2\2\u02db\u02d6\3\2\2\2"+
		"\u02dc=\3\2\2\2\u02dd\u02de\7.\2\2\u02de\u02df\5\30\r\2\u02df\u02e0\b"+
		" \1\2\u02e0?\3\2\2\2\u02e1\u02e3\5\16\b\2\u02e2\u02e4\5\f\7\2\u02e3\u02e2"+
		"\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e8\7\t\2\2\u02e8\u02e9\5\62\32\2\u02e9\u02ea\b"+
		"!\1\2\u02ea\u02fa\3\2\2\2\u02eb\u02ec\5\16\b\2\u02ec\u02ed\7\t\2\2\u02ed"+
		"\u02ee\5\62\32\2\u02ee\u02ef\b!\1\2\u02ef\u02fa\3\2\2\2\u02f0\u02f1\7"+
		"\f\2\2\u02f1\u02f2\5\16\b\2\u02f2\u02f3\7\64\2\2\u02f3\u02f4\5\30\r\2"+
		"\u02f4\u02f5\7A\2\2\u02f5\u02f6\7\t\2\2\u02f6\u02f7\5\62\32\2\u02f7\u02f8"+
		"\b!\1\2\u02f8\u02fa\3\2\2\2\u02f9\u02e1\3\2\2\2\u02f9\u02eb\3\2\2\2\u02f9"+
		"\u02f0\3\2\2\2\u02faA\3\2\2\2\u02fb\u02fc\7B\2\2\u02fc\u02fd\7R\2\2\u02fd"+
		"\u02fe\7!\2\2\u02fe\u02ff\5\30\r\2\u02ff\u0300\b\"\1\2\u0300\u0305\3\2"+
		"\2\2\u0301\u0302\7B\2\2\u0302\u0303\7R\2\2\u0303\u0305\b\"\1\2\u0304\u02fb"+
		"\3\2\2\2\u0304\u0301\3\2\2\2\u0305C\3\2\2\2\u0306\u0307\5@!\2\u0307\u0308"+
		"\b#\1\2\u0308\u0312\3\2\2\2\u0309\u030b\5@!\2\u030a\u030c\5.\30\2\u030b"+
		"\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030b\3\2\2\2\u030d\u030e\3\2"+
		"\2\2\u030e\u030f\3\2\2\2\u030f\u0310\b#\1\2\u0310\u0312\3\2\2\2\u0311"+
		"\u0306\3\2\2\2\u0311\u0309\3\2\2\2\u0312E\3\2\2\2\u0313\u0314\7Q\2\2\u0314"+
		"\u0315\7\66\2\2\u0315\u0316\5\30\r\2\u0316\u0317\b$\1\2\u0317\u033e\3"+
		"\2\2\2\u0318\u0319\7Q\2\2\u0319\u031a\7\t\2\2\u031a\u031b\7R\2\2\u031b"+
		"\u031c\7!\2\2\u031c\u0320\5\30\r\2\u031d\u031f\5\36\20\2\u031e\u031d\3"+
		"\2\2\2\u031f\u0322\3\2\2\2\u0320\u031e\3\2\2\2\u0320\u0321\3\2\2\2\u0321"+
		"\u0323\3\2\2\2\u0322\u0320\3\2\2\2\u0323\u0324\b$\1\2\u0324\u033e\3\2"+
		"\2\2\u0325\u0326\7Q\2\2\u0326\u0327\7\t\2\2\u0327\u032b\7R\2\2\u0328\u032a"+
		"\5\36\20\2\u0329\u0328\3\2\2\2\u032a\u032d\3\2\2\2\u032b\u0329\3\2\2\2"+
		"\u032b\u032c\3\2\2\2\u032c\u032e\3\2\2\2\u032d\u032b\3\2\2\2\u032e\u033e"+
		"\b$\1\2\u032f\u0330\5\16\b\2\u0330\u0331\7\t\2\2\u0331\u0332\7\6\2\2\u0332"+
		"\u0337\5\6\4\2\u0333\u0334\7\16\2\2\u0334\u0336\5\6\4\2\u0335\u0333\3"+
		"\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"\u033a\3\2\2\2\u0339\u0337\3\2\2\2\u033a\u033b\7&\2\2\u033b\u033c\b$\1"+
		"\2\u033c\u033e\3\2\2\2\u033d\u0313\3\2\2\2\u033d\u0318\3\2\2\2\u033d\u0325"+
		"\3\2\2\2\u033d\u032f\3\2\2\2\u033eG\3\2\2\2\64Tgt\u0087\u0092\u009c\u00a9"+
		"\u00ad\u00bb\u00dc\u00ee\u00fa\u00fc\u0108\u0112\u0127\u0132\u0136\u0138"+
		"\u0143\u0150\u015b\u0166\u016c\u0179\u017c\u0185\u0198\u01b4\u01bc\u0210"+
		"\u021c\u0225\u022d\u0238\u0270\u02b3\u02b5\u02c3\u02c8\u02db\u02e5\u02f9"+
		"\u0304\u030d\u0311\u0320\u032b\u0337\u033d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}