// Generated from  by ANTLR 4.2.2

package camllightnocollections.parser;

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
public class CLNoColParser extends Parser {
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
		T__2=60, T__1=61, T__0=62, CHARTOKEN=63, NULLTOKEN=64, EMPTYLISTTOKEN=65, 
		EMPTYARRAYTOKEN=66, WILDCARDTOKEN=67, BOOLTOKEN=68, CARRIAGERETURN=69, 
		FORMFEED=70, WS=71, COMMENT=72, INTTOKEN=73, STRINGTOKEN=74, FLOATTOKEN=75, 
		LINEFEED=76, HORIZONTALTAB=77, IDTOKEN=78, CONSTRTOKEN=79;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'!='", "'{'", "'while'", "'&&'", "'**'", "'='", 
		"'for'", "'^'", "'do'", "'('", "'rec'", "','", "'done'", "'mod'", "'>='", 
		"'<'", "';;'", "'*.'", "'type'", "'<>'", "'let'", "'match'", "'function'", 
		"'downto'", "'then'", "'+'", "'/'", "'as'", "'of'", "';'", "'||'", "'/.'", 
		"'}'", "'if'", "'try'", "':='", "'<='", "'&'", "'''", "'*'", "'exception'", 
		"'->'", "'to'", "'mutable'", "':'", "'=='", "'|'", "'with'", "'>'", "'+.'", 
		"'or'", "'-.'", "'!'", "'else'", "'begin'", "'in'", "'end'", "')'", "'and'", 
		"'not'", "'-'", "CHARTOKEN", "NULLTOKEN", "EMPTYLISTTOKEN", "EMPTYARRAYTOKEN", 
		"'_'", "BOOLTOKEN", "CARRIAGERETURN", "FORMFEED", "WS", "COMMENT", "INTTOKEN", 
		"STRINGTOKEN", "FLOATTOKEN", "LINEFEED", "HORIZONTALTAB", "IDTOKEN", "CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decllabeltype = 2, RULE_vartype = 3, 
		RULE_decl = 4, RULE_patt = 5, RULE_ident = 6, RULE_declorexp = 7, RULE_emptylist = 8, 
		RULE_pattmatchsingle = 9, RULE_type = 10, RULE_decltypeappendix = 11, 
		RULE_declmono = 12, RULE_letExp = 13, RULE_decloptionalvartypes = 14, 
		RULE_declnewtypeappendix = 15, RULE_patttuple = 16, RULE_declimpl = 17, 
		RULE_function = 18, RULE_recanddecl = 19, RULE_exp = 20, RULE_anddecl = 21, 
		RULE_varianttype = 22, RULE_pattmatchcurried = 23, RULE_prog = 24, RULE_functionapp = 25, 
		RULE_tupletypelist = 26, RULE_recdeclmono = 27, RULE_declexceptionappendix = 28, 
		RULE_recdecl = 29, RULE_declnewtype = 30;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decllabeltype", "vartype", "decl", "patt", "ident", 
		"declorexp", "emptylist", "pattmatchsingle", "type", "decltypeappendix", 
		"declmono", "letExp", "decloptionalvartypes", "declnewtypeappendix", "patttuple", 
		"declimpl", "function", "recanddecl", "exp", "anddecl", "varianttype", 
		"pattmatchcurried", "prog", "functionapp", "tupletypelist", "recdeclmono", 
		"declexceptionappendix", "recdecl", "declnewtype"
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


	private camllightnocollections.NoCollectionsAlg builder;
	public void setBuilder(camllightnocollections.NoCollectionsAlg builder) { this.builder = builder; }
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

	public CLNoColParser(TokenStream input) {
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
				setState(62); match(48);
				setState(63); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				setState(67); match(48);
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
		public EmptylistContext emptylist_0;
		public Token INTTOKEN_0;
		public Token FLOATTOKEN_0;
		public Token BOOLTOKEN_0;
		public Token NULLTOKEN_0;
		public Token STRINGTOKEN_0;
		public Token CHARTOKEN_0;
		public Token CONSTRTOKEN_0;
		public TerminalNode FLOATTOKEN() { return getToken(CLNoColParser.FLOATTOKEN, 0); }
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoColParser.CONSTRTOKEN, 0); }
		public TerminalNode NULLTOKEN() { return getToken(CLNoColParser.NULLTOKEN, 0); }
		public TerminalNode INTTOKEN() { return getToken(CLNoColParser.INTTOKEN, 0); }
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public TerminalNode BOOLTOKEN() { return getToken(CLNoColParser.BOOLTOKEN, 0); }
		public TerminalNode CHARTOKEN() { return getToken(CLNoColParser.CHARTOKEN, 0); }
		public TerminalNode STRINGTOKEN() { return getToken(CLNoColParser.STRINGTOKEN, 0); }
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
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
				}
				break;
			case INTTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(79); ((ConstantContext)_localctx).INTTOKEN_0 = match(INTTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(inttoken((((ConstantContext)_localctx).INTTOKEN_0!=null?((ConstantContext)_localctx).INTTOKEN_0.getText():null)));
				}
				break;
			case FLOATTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(81); ((ConstantContext)_localctx).FLOATTOKEN_0 = match(FLOATTOKEN);
				((ConstantContext)_localctx)._constant =  builder.float_(floattoken((((ConstantContext)_localctx).FLOATTOKEN_0!=null?((ConstantContext)_localctx).FLOATTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(83); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(85); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case STRINGTOKEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(87); ((ConstantContext)_localctx).STRINGTOKEN_0 = match(STRINGTOKEN);
				((ConstantContext)_localctx)._constant =  builder.string(stringtoken((((ConstantContext)_localctx).STRINGTOKEN_0!=null?((ConstantContext)_localctx).STRINGTOKEN_0.getText():null)));
				}
				break;
			case CHARTOKEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(89); ((ConstantContext)_localctx).CHARTOKEN_0 = match(CHARTOKEN);
				((ConstantContext)_localctx)._constant =  builder.char_(chartoken((((ConstantContext)_localctx).CHARTOKEN_0!=null?((ConstantContext)_localctx).CHARTOKEN_0.getText():null)));
				}
				break;
			case CONSTRTOKEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(91); ((ConstantContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		public TerminalNode IDTOKEN() { return getToken(CLNoColParser.IDTOKEN, 0); }
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
			setState(106);
			switch (_input.LA(1)) {
			case IDTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(95); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(96); match(46);
				setState(97); ((DecllabeltypeContext)_localctx).type_1 = type(0);
				((DecllabeltypeContext)_localctx)._decllabeltype =  builder.declLabelType(idtoken((((DecllabeltypeContext)_localctx).IDTOKEN_0!=null?((DecllabeltypeContext)_localctx).IDTOKEN_0.getText():null)),(((DecllabeltypeContext)_localctx).type_1._type));
				}
				break;
			case 45:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); match(45);
				setState(101); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(102); match(46);
				setState(103); ((DecllabeltypeContext)_localctx).type_1 = type(0);
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
		public TerminalNode IDTOKEN() { return getToken(CLNoColParser.IDTOKEN, 0); }
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
			setState(108); match(40);
			setState(109); ((VartypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
		public DeclexceptionappendixContext declexceptionappendix;
		public List<DeclexceptionappendixContext> declexceptionappendix_1_list = new ArrayList<DeclexceptionappendixContext>();
		public TypeContext type_1;
		public List<DeclexceptionappendixContext> declexceptionappendix_2_list = new ArrayList<DeclexceptionappendixContext>();
		public RecdeclContext recdecl_0;
		public DeclContext decl_0;
		public AnddeclContext anddecl;
		public List<AnddeclContext> anddecl_1_list = new ArrayList<AnddeclContext>();
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoColParser.CONSTRTOKEN, 0); }
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
			setState(163);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); match(20);
				setState(116); ((DeclContext)_localctx).decloptionalvartypes_0 = decloptionalvartypes();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==60) {
					{
					{
					setState(117); ((DeclContext)_localctx).declnewtypeappendix = declnewtypeappendix();
					((DeclContext)_localctx).declnewtypeappendix_1_list.add(((DeclContext)_localctx).declnewtypeappendix);
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declNewType((((DeclContext)_localctx).decloptionalvartypes_0._decloptionalvartypes),lift("_declnewtypeappendix", ((DeclContext)_localctx).declnewtypeappendix_1_list));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125); match(42);
				setState(126); ((DeclContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==60) {
					{
					{
					setState(127); ((DeclContext)_localctx).declexceptionappendix = declexceptionappendix();
					((DeclContext)_localctx).declexceptionappendix_1_list.add(((DeclContext)_localctx).declexceptionappendix);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declEnumException(constrtoken((((DeclContext)_localctx).CONSTRTOKEN_0!=null?((DeclContext)_localctx).CONSTRTOKEN_0.getText():null)),lift("_declexceptionappendix", ((DeclContext)_localctx).declexceptionappendix_1_list));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(134); match(42);
				setState(135); ((DeclContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(136); match(30);
				setState(137); ((DeclContext)_localctx).type_1 = type(0);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==60) {
					{
					{
					setState(138); ((DeclContext)_localctx).declexceptionappendix = declexceptionappendix();
					((DeclContext)_localctx).declexceptionappendix_2_list.add(((DeclContext)_localctx).declexceptionappendix);
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declConstrException(constrtoken((((DeclContext)_localctx).CONSTRTOKEN_0!=null?((DeclContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DeclContext)_localctx).type_1._type),lift("_declexceptionappendix", ((DeclContext)_localctx).declexceptionappendix_2_list));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(146); match(22);
				setState(147); match(12);
				setState(148); ((DeclContext)_localctx).recdecl_0 = recdecl();
				((DeclContext)_localctx)._decl =  builder.declRec((((DeclContext)_localctx).recdecl_0._recdecl));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(151); match(22);
				setState(152); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(155); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(157); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(156); ((DeclContext)_localctx).anddecl = anddecl();
					((DeclContext)_localctx).anddecl_1_list.add(((DeclContext)_localctx).anddecl);
					}
					}
					setState(159); 
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
		public IdentContext ident_0;
		public Token WILDCARDTOKEN_0;
		public TypeContext type_1;
		public ConstantContext constant_0;
		public PatttupleContext patttuple;
		public List<PatttupleContext> patttuple_1_list = new ArrayList<PatttupleContext>();
		public IdentContext ident_1;
		public PatttupleContext patttuple(int i) {
			return getRuleContext(PatttupleContext.class,i);
		}
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoColParser.CONSTRTOKEN, 0); }
		public List<PatttupleContext> patttuple() {
			return getRuleContexts(PatttupleContext.class);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public PattContext patt(int i) {
			return getRuleContext(PattContext.class,i);
		}
		public TerminalNode WILDCARDTOKEN() { return getToken(CLNoColParser.WILDCARDTOKEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_patt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(166); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(167); ((PattContext)_localctx).patt_1 = patt(3);
				((PattContext)_localctx)._patt =  builder.pattConstrPatt(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt));
				}
				break;

			case 2:
				{
				setState(170); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 3:
				{
				setState(173); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 4:
				{
				setState(175); match(11);
				setState(176); ((PattContext)_localctx).patt_0 = patt(0);
				setState(177); match(59);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 5:
				{
				setState(180); match(11);
				setState(181); ((PattContext)_localctx).patt_0 = patt(0);
				setState(182); match(46);
				setState(183); ((PattContext)_localctx).type_1 = type(0);
				setState(184); match(59);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 6:
				{
				setState(187); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 7:
				{
				setState(190); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((PattContext)_localctx)._patt =  builder.pattConstr(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;

			case 8:
				{
				setState(192); match(11);
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
				} while ( _la==13 );
				setState(199); match(59);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(214);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(204);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(205); match(48);
						setState(206); ((PattContext)_localctx).patt_1 = patt(6);
						((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).patt_1._patt));
						}
						break;

					case 2:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(209);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(210); match(29);
						setState(211); ((PattContext)_localctx).ident_1 = ident();
						((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
						}
						break;
					}
					} 
				}
				setState(218);
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
		public TerminalNode IDTOKEN() { return getToken(CLNoColParser.IDTOKEN, 0); }
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
			setState(219); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
			setState(228);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(225); ((DeclorexpContext)_localctx).decl_0 = decl();
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

	public static class EmptylistContext extends ParserRuleContext {
		public Object _emptylist;
		public Token EMPTYLISTTOKEN_0;
		public TerminalNode EMPTYLISTTOKEN() { return getToken(CLNoColParser.EMPTYLISTTOKEN, 0); }
		public EmptylistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptylist; }
	}

	public final EmptylistContext emptylist() throws RecognitionException {
		EmptylistContext _localctx = new EmptylistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_emptylist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
		enterRule(_localctx, 18, RULE_pattmatchsingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(234); match(43);
			setState(235); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		public TypeContext type;
		public List<TypeContext> type_0tail = new ArrayList<TypeContext>();
		public VartypeContext vartype_0;
		public TypeContext type_1;
		public Token IDTOKEN_1;
		public TupletypelistContext tupletypelist;
		public List<TupletypelistContext> tupletypelist_1_list = new ArrayList<TupletypelistContext>();
		public TupletypelistContext tupletypelist(int i) {
			return getRuleContext(TupletypelistContext.class,i);
		}
		public TerminalNode IDTOKEN() { return getToken(CLNoColParser.IDTOKEN, 0); }
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(239); match(11);
				setState(240); ((TypeContext)_localctx).type_0 = type(0);
				setState(241); match(59);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;

			case 2:
				{
				setState(244); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;

			case 3:
				{
				setState(246); match(11);
				{
				setState(247); ((TypeContext)_localctx).type_0 = type(0);
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==13) {
					{
					{
					setState(248); match(13);
					setState(249); ((TypeContext)_localctx).type = type(0);
					((TypeContext)_localctx).type_0tail.add(((TypeContext)_localctx).type);
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(255); match(59);
				setState(256); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typesIdType(lift("_type", ((TypeContext)_localctx).type_0tail, ((TypeContext)_localctx).type_0._type),idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;

			case 4:
				{
				setState(259); ((TypeContext)_localctx).vartype_0 = vartype();
				((TypeContext)_localctx)._type =  builder.varTypeType((((TypeContext)_localctx).vartype_0._vartype));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(282);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(280);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(264);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(265); match(43);
						setState(266); ((TypeContext)_localctx).type_1 = type(6);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(269);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(270); ((TypeContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						((TypeContext)_localctx)._type =  builder.typeIdType((((TypeContext)_localctx).type_0._type),idtoken((((TypeContext)_localctx).IDTOKEN_1!=null?((TypeContext)_localctx).IDTOKEN_1.getText():null)));
						}
						break;

					case 3:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(272);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(274); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(273); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(276); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.tupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;
					}
					} 
				}
				setState(284);
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

	public static class DecltypeappendixContext extends ParserRuleContext {
		public Object _decltypeappendix;
		public Token CONSTRTOKEN_0;
		public TypeContext type_1;
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoColParser.CONSTRTOKEN, 0); }
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
		enterRule(_localctx, 22, RULE_decltypeappendix);
		try {
			setState(294);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285); match(48);
				setState(286); ((DecltypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(287); match(30);
				setState(288); ((DecltypeappendixContext)_localctx).type_1 = type(0);
				((DecltypeappendixContext)_localctx)._decltypeappendix =  builder.declConstrTypeAppendix(constrtoken((((DecltypeappendixContext)_localctx).CONSTRTOKEN_0!=null?((DecltypeappendixContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DecltypeappendixContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291); match(48);
				setState(292); ((DecltypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 24, RULE_declmono);
		int _la;
		try {
			setState(311);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(298); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(297); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(300); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==11 || _la==CHARTOKEN || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NULLTOKEN - 64)) | (1L << (EMPTYLISTTOKEN - 64)) | (1L << (WILDCARDTOKEN - 64)) | (1L << (BOOLTOKEN - 64)) | (1L << (INTTOKEN - 64)) | (1L << (STRINGTOKEN - 64)) | (1L << (FLOATTOKEN - 64)) | (1L << (IDTOKEN - 64)) | (1L << (CONSTRTOKEN - 64)))) != 0) );
				setState(302); match(7);
				setState(303); ((DeclmonoContext)_localctx).exp_2 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMonoFunc((((DeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((DeclmonoContext)_localctx).patt_1_list),(((DeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(306); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(307); match(7);
				setState(308); ((DeclmonoContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 26, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); ((LetExpContext)_localctx).decl_0 = decl();
			setState(314); match(57);
			setState(315); ((LetExpContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 28, RULE_decloptionalvartypes);
		int _la;
		try {
			setState(340);
			switch (_input.LA(1)) {
			case 40:
				enterOuterAlt(_localctx, 1);
				{
				setState(318); ((DecloptionalvartypesContext)_localctx).vartype_0 = vartype();
				setState(319); ((DecloptionalvartypesContext)_localctx).declnewtype_1 = declnewtype();
				((DecloptionalvartypesContext)_localctx)._decloptionalvartypes =  builder.declNewTypeWithVarType((((DecloptionalvartypesContext)_localctx).vartype_0._vartype),(((DecloptionalvartypesContext)_localctx).declnewtype_1._declnewtype));
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 2);
				{
				setState(322); match(11);
				setState(331);
				_la = _input.LA(1);
				if (_la==40) {
					{
					setState(323); ((DecloptionalvartypesContext)_localctx).vartype_0 = vartype();
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==13) {
						{
						{
						setState(324); match(13);
						setState(325); ((DecloptionalvartypesContext)_localctx).vartype = vartype();
						((DecloptionalvartypesContext)_localctx).vartype_0tail.add(((DecloptionalvartypesContext)_localctx).vartype);
						}
						}
						setState(330);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(333); match(59);
				setState(334); ((DecloptionalvartypesContext)_localctx).declnewtype_0 = declnewtype();
				((DecloptionalvartypesContext)_localctx)._decloptionalvartypes =  builder.declNewTypeWithVarTypes(lift("_vartype", ((DecloptionalvartypesContext)_localctx).vartype_0tail, ((DecloptionalvartypesContext)_localctx).vartype_0._vartype),(((DecloptionalvartypesContext)_localctx).declnewtype_0._declnewtype));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(337); ((DecloptionalvartypesContext)_localctx).declnewtype_0 = declnewtype();
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
		enterRule(_localctx, 30, RULE_declnewtypeappendix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342); match(60);
			setState(343); ((DeclnewtypeappendixContext)_localctx).decloptionalvartypes_0 = decloptionalvartypes();
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
		enterRule(_localctx, 32, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346); match(13);
			setState(347); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
			setState(359);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(351); match(18);
				setState(352); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(356); match(18);
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
		public FunctionContext function_0;
		public IdentContext ident_0;
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
		enterRule(_localctx, 36, RULE_function);
		try {
			setState(386);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361); match(24);
				setState(362); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365); match(11);
				setState(366); ((FunctionContext)_localctx).function_0 = function();
				setState(367); match(59);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370); match(56);
				setState(371); ((FunctionContext)_localctx).function_0 = function();
				setState(372); match(58);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(375); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(378); match(1);
				setState(379); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(382); match(1);
				setState(383); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
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
		enterRule(_localctx, 38, RULE_recanddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388); match(60);
			setState(389); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
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
		public Token CONSTRTOKEN_0;
		public ExpContext exp_1;
		public ExpContext exp_2;
		public IdentContext ident_0;
		public ConstantContext constant_0;
		public TypeContext type_1;
		public FunctionappContext functionapp_0;
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
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoColParser.CONSTRTOKEN, 0); }
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(393); ((ExpContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(394); ((ExpContext)_localctx).exp_1 = exp(25);
				((ExpContext)_localctx)._exp =  builder.constrExp(constrtoken((((ExpContext)_localctx).CONSTRTOKEN_0!=null?((ExpContext)_localctx).CONSTRTOKEN_0.getText():null)),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				{
				setState(397); match(54);
				setState(398); ((ExpContext)_localctx).exp_0 = exp(24);
				((ExpContext)_localctx)._exp =  builder.dereferenceExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 3:
				{
				setState(401); match(53);
				setState(402); ((ExpContext)_localctx).exp_0 = exp(22);
				((ExpContext)_localctx)._exp =  builder.floatNegateExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(405); match(62);
				setState(406); ((ExpContext)_localctx).exp_0 = exp(21);
				((ExpContext)_localctx)._exp =  builder.intUnarySub((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(409); match(61);
				setState(410); ((ExpContext)_localctx).exp_0 = exp(14);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 6:
				{
				setState(413); match(35);
				setState(414); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(415); match(26);
				setState(416); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(417); match(55);
				setState(418); ((ExpContext)_localctx).exp_2 = exp(10);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 7:
				{
				setState(421); match(35);
				setState(422); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(423); match(26);
				setState(424); ((ExpContext)_localctx).exp_1 = exp(9);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 8:
				{
				setState(427); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 9:
				{
				setState(430); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 10:
				{
				setState(433); match(11);
				setState(434); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(435); match(59);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 11:
				{
				setState(438); match(56);
				setState(439); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(440); match(58);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 12:
				{
				setState(443); match(11);
				setState(444); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(445); match(46);
				setState(446); ((ExpContext)_localctx).type_1 = type(0);
				setState(447); match(59);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 13:
				{
				setState(450); ((ExpContext)_localctx).functionapp_0 = functionapp(0);
				((ExpContext)_localctx)._exp =  builder.functionApplicationExp((((ExpContext)_localctx).functionapp_0._functionapp));
				}
				break;

			case 14:
				{
				setState(453); match(4);
				setState(454); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(455); match(10);
				setState(456); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(457); match(14);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 15:
				{
				setState(460); match(8);
				setState(461); ((ExpContext)_localctx).ident_0 = ident();
				setState(462); match(7);
				setState(463); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(464); match(25);
				setState(465); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(466); match(10);
				setState(467); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(468); match(14);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 16:
				{
				setState(471); match(8);
				setState(472); ((ExpContext)_localctx).ident_0 = ident();
				setState(473); match(7);
				setState(474); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(475); match(44);
				setState(476); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(477); match(10);
				setState(478); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(479); match(14);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 17:
				{
				setState(482); match(23);
				setState(483); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(484); match(49);
				setState(485); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 18:
				{
				setState(488); ((ExpContext)_localctx).function_0 = function();
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 19:
				{
				setState(491); match(36);
				setState(492); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(493); match(49);
				setState(494); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.tryWithExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 20:
				{
				setState(497); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(552);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(502);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(503); match(6);
						setState(504); ((ExpContext)_localctx).exp_1 = exp(21);
						((ExpContext)_localctx)._exp =  builder.floatPowerExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(507);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(508); match(15);
						setState(509); ((ExpContext)_localctx).exp_1 = exp(20);
						((ExpContext)_localctx)._exp =  builder.intMod((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(512);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(513);
						((ExpContext)_localctx).op_1512 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 19) | (1L << 28) | (1L << 33) | (1L << 41))) != 0)) ) {
							((ExpContext)_localctx).op_1512 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(514); ((ExpContext)_localctx).exp_1 = exp(19);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/") ? builder.intDivide(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*.") ? builder.floatMultiplyExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*") ? builder.intMultiply(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/.") ? builder.floatDivideExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(517);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(518);
						((ExpContext)_localctx).op_1511 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 27) | (1L << 51) | (1L << 53) | (1L << 62))) != 0)) ) {
							((ExpContext)_localctx).op_1511 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(519); ((ExpContext)_localctx).exp_1 = exp(18);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+.") ? builder.floatAddExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-.") ? builder.floatSubtractExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+") ? builder.intAdd(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-") ? builder.intSub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(522);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(523); match(9);
						setState(524); ((ExpContext)_localctx).exp_1 = exp(17);
						((ExpContext)_localctx)._exp =  builder.stringAppendExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(527);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(528);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 7) | (1L << 16) | (1L << 17) | (1L << 21) | (1L << 38) | (1L << 47) | (1L << 50))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(529); ((ExpContext)_localctx).exp_1 = exp(16);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.smallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<>") ? builder.notEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("!=") ? builder.notPhysicalEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.greaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.smaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("==") ? builder.physicalEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.equal(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.greater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(532);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(533);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==39) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(534); ((ExpContext)_localctx).exp_1 = exp(14);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(537);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(538);
						_la = _input.LA(1);
						if ( !(_la==32 || _la==52) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(539); ((ExpContext)_localctx).exp_1 = exp(13);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(542);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(543); match(37);
						setState(544); ((ExpContext)_localctx).exp_1 = exp(11);
						((ExpContext)_localctx)._exp =  builder.refAssignExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(547);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(548); match(31);
						setState(549); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 42, RULE_anddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557); match(60);
			setState(558); ((AnddeclContext)_localctx).declmono_0 = declmono();
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
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoColParser.CONSTRTOKEN, 0); }
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
			setState(568);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(561); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(562); match(30);
				setState(563); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(566); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
			setState(571); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(570); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(573); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==11 || _la==CHARTOKEN || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NULLTOKEN - 64)) | (1L << (EMPTYLISTTOKEN - 64)) | (1L << (WILDCARDTOKEN - 64)) | (1L << (BOOLTOKEN - 64)) | (1L << (INTTOKEN - 64)) | (1L << (STRINGTOKEN - 64)) | (1L << (FLOATTOKEN - 64)) | (1L << (IDTOKEN - 64)) | (1L << (CONSTRTOKEN - 64)))) != 0) );
			setState(575); match(43);
			setState(576); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
			setState(579); ((ProgContext)_localctx).declimpl_0 = declimpl();
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_functionapp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(583); match(11);
				setState(584); ((FunctionappContext)_localctx).functionapp_0 = functionapp(0);
				setState(585); match(59);
				((FunctionappContext)_localctx)._functionapp =  builder.functionApplicationBracketed((((FunctionappContext)_localctx).functionapp_0._functionapp));
				}
				break;

			case 2:
				{
				setState(588); ((FunctionappContext)_localctx).function_0 = function();
				setState(589); ((FunctionappContext)_localctx).exp_1 = exp(0);
				((FunctionappContext)_localctx)._functionapp =  builder.functionApplication((((FunctionappContext)_localctx).function_0._function),(((FunctionappContext)_localctx).exp_1._exp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(600);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionappContext(_parentctx, _parentState);
					_localctx.functionapp_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_functionapp);
					setState(594);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(595); ((FunctionappContext)_localctx).exp_1 = exp(0);
					((FunctionappContext)_localctx)._functionapp =  builder.functionApplicationApplication((((FunctionappContext)_localctx).functionapp_0._functionapp),(((FunctionappContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(602);
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
			setState(603); match(41);
			setState(604); ((TupletypelistContext)_localctx).type_0 = type(0);
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
		enterRule(_localctx, 54, RULE_recdeclmono);
		int _la;
		try {
			setState(631);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607); match(11);
				setState(608); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(609); match(46);
				setState(610); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(611); match(59);
				setState(612); match(7);
				setState(613); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclPattTypeExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).type_1._type),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(616); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(618); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(617); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(620); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==11 || _la==CHARTOKEN || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NULLTOKEN - 64)) | (1L << (EMPTYLISTTOKEN - 64)) | (1L << (WILDCARDTOKEN - 64)) | (1L << (BOOLTOKEN - 64)) | (1L << (INTTOKEN - 64)) | (1L << (STRINGTOKEN - 64)) | (1L << (FLOATTOKEN - 64)) | (1L << (IDTOKEN - 64)) | (1L << (CONSTRTOKEN - 64)))) != 0) );
				setState(622); match(7);
				setState(623); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentPattsExp((((RecdeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((RecdeclmonoContext)_localctx).patt_1_list),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(626); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(627); match(7);
				setState(628); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
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
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoColParser.CONSTRTOKEN, 0); }
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
		enterRule(_localctx, 56, RULE_declexceptionappendix);
		try {
			setState(642);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(633); match(60);
				setState(634); ((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(635); match(30);
				setState(636); ((DeclexceptionappendixContext)_localctx).type_1 = type(0);
				((DeclexceptionappendixContext)_localctx)._declexceptionappendix =  builder.declConstrExceptionAppendix(constrtoken((((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0!=null?((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DeclexceptionappendixContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639); match(60);
				setState(640); ((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 58, RULE_recdecl);
		int _la;
		try {
			setState(655);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				((RecdeclContext)_localctx)._recdecl =  builder.recDeclMono((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(647); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(649); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(648); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(651); 
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
		public TerminalNode CONSTRTOKEN() { return getToken(CLNoColParser.CONSTRTOKEN, 0); }
		public DecllabeltypeContext decllabeltype(int i) {
			return getRuleContext(DecllabeltypeContext.class,i);
		}
		public TerminalNode IDTOKEN() { return getToken(CLNoColParser.IDTOKEN, 0); }
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
		enterRule(_localctx, 60, RULE_declnewtype);
		int _la;
		try {
			setState(699);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(657); ((DeclnewtypeContext)_localctx).ident_0 = ident();
				setState(658); match(7);
				setState(659); match(3);
				{
				setState(660); ((DeclnewtypeContext)_localctx).decllabeltype_1 = decllabeltype();
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==13) {
					{
					{
					setState(661); match(13);
					setState(662); ((DeclnewtypeContext)_localctx).decllabeltype = decllabeltype();
					((DeclnewtypeContext)_localctx).decllabeltype_1tail.add(((DeclnewtypeContext)_localctx).decllabeltype);
					}
					}
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(668); match(34);
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declRecordType((((DeclnewtypeContext)_localctx).ident_0._ident),lift("_decllabeltype", ((DeclnewtypeContext)_localctx).decllabeltype_1tail, ((DeclnewtypeContext)_localctx).decllabeltype_1._decllabeltype));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(671); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(672); match(7);
				setState(673); ((DeclnewtypeContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==48) {
					{
					{
					setState(674); ((DeclnewtypeContext)_localctx).decltypeappendix = decltypeappendix();
					((DeclnewtypeContext)_localctx).decltypeappendix_2_list.add(((DeclnewtypeContext)_localctx).decltypeappendix);
					}
					}
					setState(679);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declNewEnumType(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclnewtypeContext)_localctx).CONSTRTOKEN_1!=null?((DeclnewtypeContext)_localctx).CONSTRTOKEN_1.getText():null)),lift("_decltypeappendix", ((DeclnewtypeContext)_localctx).decltypeappendix_2_list));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(681); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(682); match(7);
				setState(683); ((DeclnewtypeContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(684); match(30);
				setState(685); ((DeclnewtypeContext)_localctx).type_2 = type(0);
				setState(689);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==48) {
					{
					{
					setState(686); ((DeclnewtypeContext)_localctx).decltypeappendix = decltypeappendix();
					((DeclnewtypeContext)_localctx).decltypeappendix_3_list.add(((DeclnewtypeContext)_localctx).decltypeappendix);
					}
					}
					setState(691);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declNewConstrType(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclnewtypeContext)_localctx).CONSTRTOKEN_1!=null?((DeclnewtypeContext)_localctx).CONSTRTOKEN_1.getText():null)),(((DeclnewtypeContext)_localctx).type_2._type),lift("_decltypeappendix", ((DeclnewtypeContext)_localctx).decltypeappendix_3_list));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(694); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(695); match(47);
				setState(696); ((DeclnewtypeContext)_localctx).type_1 = type(0);
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

		case 10: return type_sempred((TypeContext)_localctx, predIndex);

		case 20: return exp_sempred((ExpContext)_localctx, predIndex);

		case 25: return functionapp_sempred((FunctionappContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean functionapp_sempred(FunctionappContext _localctx, int predIndex) {
		switch (predIndex) {
		case 15: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean patt_sempred(PattContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);

		case 1: return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 5);

		case 3: return precpred(_ctx, 4);

		case 4: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5: return precpred(_ctx, 20);

		case 6: return precpred(_ctx, 19);

		case 7: return precpred(_ctx, 18);

		case 8: return precpred(_ctx, 17);

		case 9: return precpred(_ctx, 16);

		case 10: return precpred(_ctx, 15);

		case 11: return precpred(_ctx, 13);

		case 12: return precpred(_ctx, 12);

		case 13: return precpred(_ctx, 11);

		case 14: return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3Q\u02c0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2M\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4m\n\4\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6y\n\6\f\6\16\6|\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u0083"+
		"\n\6\f\6\16\6\u0086\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u008e\n\6\f\6\16"+
		"\6\u0091\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6"+
		"\u00a0\n\6\r\6\16\6\u00a1\3\6\3\6\5\6\u00a6\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00c6\n\7\r\7\16\7\u00c7\3\7\3\7\3\7"+
		"\5\7\u00cd\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00d9\n\7\f"+
		"\7\16\7\u00dc\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00e7\n\t\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\7\f\u00fd\n\f\f\f\16\f\u0100\13\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u0109\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u0115"+
		"\n\f\r\f\16\f\u0116\3\f\3\f\7\f\u011b\n\f\f\f\16\f\u011e\13\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0129\n\r\3\16\3\16\6\16\u012d\n\16\r"+
		"\16\16\16\u012e\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u013a"+
		"\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u0149\n\20\f\20\16\20\u014c\13\20\5\20\u014e\n\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0157\n\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u016a\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0185\n\24\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26"+
		"\u01f7\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u022b\n\26\f\26"+
		"\16\26\u022e\13\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\5\30\u023b\n\30\3\31\6\31\u023e\n\31\r\31\16\31\u023f\3\31\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u0253\n\33\3\33\3\33\3\33\3\33\7\33\u0259\n\33\f\33\16\33\u025c"+
		"\13\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\6\35\u026d\n\35\r\35\16\35\u026e\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u027a\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u0285\n\36\3\37\3\37\3\37\3\37\3\37\6\37\u028c\n\37\r"+
		"\37\16\37\u028d\3\37\3\37\5\37\u0292\n\37\3 \3 \3 \3 \3 \3 \7 \u029a\n"+
		" \f \16 \u029d\13 \3 \3 \3 \3 \3 \3 \3 \7 \u02a6\n \f \16 \u02a9\13 \3"+
		" \3 \3 \3 \3 \3 \3 \7 \u02b2\n \f \16 \u02b5\13 \3 \3 \3 \3 \3 \3 \3 "+
		"\5 \u02be\n \3 \2\6\f\26*\64!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>\2\7\6\2\25\25\36\36##++\6\2\35\35\65\65\67\67"+
		"@@\t\2\4\4\t\t\22\23\27\27((\61\61\64\64\4\2\7\7))\4\2\"\"\66\66\u0301"+
		"\2L\3\2\2\2\4_\3\2\2\2\6l\3\2\2\2\bn\3\2\2\2\n\u00a5\3\2\2\2\f\u00cc\3"+
		"\2\2\2\16\u00dd\3\2\2\2\20\u00e6\3\2\2\2\22\u00e8\3\2\2\2\24\u00eb\3\2"+
		"\2\2\26\u0108\3\2\2\2\30\u0128\3\2\2\2\32\u0139\3\2\2\2\34\u013b\3\2\2"+
		"\2\36\u0156\3\2\2\2 \u0158\3\2\2\2\"\u015c\3\2\2\2$\u0169\3\2\2\2&\u0184"+
		"\3\2\2\2(\u0186\3\2\2\2*\u01f6\3\2\2\2,\u022f\3\2\2\2.\u023a\3\2\2\2\60"+
		"\u023d\3\2\2\2\62\u0245\3\2\2\2\64\u0252\3\2\2\2\66\u025d\3\2\2\28\u0279"+
		"\3\2\2\2:\u0284\3\2\2\2<\u0291\3\2\2\2>\u02bd\3\2\2\2@A\7\62\2\2AB\5\2"+
		"\2\2BC\b\2\1\2CM\3\2\2\2DE\5\24\13\2EF\7\62\2\2FG\5\2\2\2GH\b\2\1\2HM"+
		"\3\2\2\2IJ\5\24\13\2JK\b\2\1\2KM\3\2\2\2L@\3\2\2\2LD\3\2\2\2LI\3\2\2\2"+
		"M\3\3\2\2\2NO\5\22\n\2OP\b\3\1\2P`\3\2\2\2QR\7K\2\2R`\b\3\1\2ST\7M\2\2"+
		"T`\b\3\1\2UV\7F\2\2V`\b\3\1\2WX\7B\2\2X`\b\3\1\2YZ\7L\2\2Z`\b\3\1\2[\\"+
		"\7A\2\2\\`\b\3\1\2]^\7Q\2\2^`\b\3\1\2_N\3\2\2\2_Q\3\2\2\2_S\3\2\2\2_U"+
		"\3\2\2\2_W\3\2\2\2_Y\3\2\2\2_[\3\2\2\2_]\3\2\2\2`\5\3\2\2\2ab\7P\2\2b"+
		"c\7\60\2\2cd\5\26\f\2de\b\4\1\2em\3\2\2\2fg\7/\2\2gh\7P\2\2hi\7\60\2\2"+
		"ij\5\26\f\2jk\b\4\1\2km\3\2\2\2la\3\2\2\2lf\3\2\2\2m\7\3\2\2\2no\7*\2"+
		"\2op\7P\2\2pq\b\5\1\2q\t\3\2\2\2rs\5\32\16\2st\b\6\1\2t\u00a6\3\2\2\2"+
		"uv\7\26\2\2vz\5\36\20\2wy\5 \21\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2"+
		"\2\2{}\3\2\2\2|z\3\2\2\2}~\b\6\1\2~\u00a6\3\2\2\2\177\u0080\7,\2\2\u0080"+
		"\u0084\7Q\2\2\u0081\u0083\5:\36\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u00a6\b\6\1\2\u0088\u0089\7,\2\2\u0089\u008a\7Q\2"+
		"\2\u008a\u008b\7 \2\2\u008b\u008f\5\26\f\2\u008c\u008e\5:\36\2\u008d\u008c"+
		"\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\b\6\1\2\u0093\u00a6\3\2"+
		"\2\2\u0094\u0095\7\30\2\2\u0095\u0096\7\16\2\2\u0096\u0097\5<\37\2\u0097"+
		"\u0098\b\6\1\2\u0098\u00a6\3\2\2\2\u0099\u009a\7\30\2\2\u009a\u009b\5"+
		"\n\6\2\u009b\u009c\b\6\1\2\u009c\u00a6\3\2\2\2\u009d\u009f\5\32\16\2\u009e"+
		"\u00a0\5,\27\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\6\1\2\u00a4"+
		"\u00a6\3\2\2\2\u00a5r\3\2\2\2\u00a5u\3\2\2\2\u00a5\177\3\2\2\2\u00a5\u0088"+
		"\3\2\2\2\u00a5\u0094\3\2\2\2\u00a5\u0099\3\2\2\2\u00a5\u009d\3\2\2\2\u00a6"+
		"\13\3\2\2\2\u00a7\u00a8\b\7\1\2\u00a8\u00a9\7Q\2\2\u00a9\u00aa\5\f\7\5"+
		"\u00aa\u00ab\b\7\1\2\u00ab\u00cd\3\2\2\2\u00ac\u00ad\5\16\b\2\u00ad\u00ae"+
		"\b\7\1\2\u00ae\u00cd\3\2\2\2\u00af\u00b0\7E\2\2\u00b0\u00cd\b\7\1\2\u00b1"+
		"\u00b2\7\r\2\2\u00b2\u00b3\5\f\7\2\u00b3\u00b4\7=\2\2\u00b4\u00b5\b\7"+
		"\1\2\u00b5\u00cd\3\2\2\2\u00b6\u00b7\7\r\2\2\u00b7\u00b8\5\f\7\2\u00b8"+
		"\u00b9\7\60\2\2\u00b9\u00ba\5\26\f\2\u00ba\u00bb\7=\2\2\u00bb\u00bc\b"+
		"\7\1\2\u00bc\u00cd\3\2\2\2\u00bd\u00be\5\4\3\2\u00be\u00bf\b\7\1\2\u00bf"+
		"\u00cd\3\2\2\2\u00c0\u00c1\7Q\2\2\u00c1\u00cd\b\7\1\2\u00c2\u00c3\7\r"+
		"\2\2\u00c3\u00c5\5\f\7\2\u00c4\u00c6\5\"\22\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\3\2"+
		"\2\2\u00c9\u00ca\7=\2\2\u00ca\u00cb\b\7\1\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00a7\3\2\2\2\u00cc\u00ac\3\2\2\2\u00cc\u00af\3\2\2\2\u00cc\u00b1\3\2"+
		"\2\2\u00cc\u00b6\3\2\2\2\u00cc\u00bd\3\2\2\2\u00cc\u00c0\3\2\2\2\u00cc"+
		"\u00c2\3\2\2\2\u00cd\u00da\3\2\2\2\u00ce\u00cf\f\7\2\2\u00cf\u00d0\7\62"+
		"\2\2\u00d0\u00d1\5\f\7\b\u00d1\u00d2\b\7\1\2\u00d2\u00d9\3\2\2\2\u00d3"+
		"\u00d4\f\n\2\2\u00d4\u00d5\7\37\2\2\u00d5\u00d6\5\16\b\2\u00d6\u00d7\b"+
		"\7\1\2\u00d7\u00d9\3\2\2\2\u00d8\u00ce\3\2\2\2\u00d8\u00d3\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\r\3\2\2\2"+
		"\u00dc\u00da\3\2\2\2\u00dd\u00de\7P\2\2\u00de\u00df\b\b\1\2\u00df\17\3"+
		"\2\2\2\u00e0\u00e1\5*\26\2\u00e1\u00e2\b\t\1\2\u00e2\u00e7\3\2\2\2\u00e3"+
		"\u00e4\5\n\6\2\u00e4\u00e5\b\t\1\2\u00e5\u00e7\3\2\2\2\u00e6\u00e0\3\2"+
		"\2\2\u00e6\u00e3\3\2\2\2\u00e7\21\3\2\2\2\u00e8\u00e9\7C\2\2\u00e9\u00ea"+
		"\b\n\1\2\u00ea\23\3\2\2\2\u00eb\u00ec\5\f\7\2\u00ec\u00ed\7-\2\2\u00ed"+
		"\u00ee\5*\26\2\u00ee\u00ef\b\13\1\2\u00ef\25\3\2\2\2\u00f0\u00f1\b\f\1"+
		"\2\u00f1\u00f2\7\r\2\2\u00f2\u00f3\5\26\f\2\u00f3\u00f4\7=\2\2\u00f4\u00f5"+
		"\b\f\1\2\u00f5\u0109\3\2\2\2\u00f6\u00f7\7P\2\2\u00f7\u0109\b\f\1\2\u00f8"+
		"\u00f9\7\r\2\2\u00f9\u00fe\5\26\f\2\u00fa\u00fb\7\17\2\2\u00fb\u00fd\5"+
		"\26\f\2\u00fc\u00fa\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7="+
		"\2\2\u0102\u0103\7P\2\2\u0103\u0104\b\f\1\2\u0104\u0109\3\2\2\2\u0105"+
		"\u0106\5\b\5\2\u0106\u0107\b\f\1\2\u0107\u0109\3\2\2\2\u0108\u00f0\3\2"+
		"\2\2\u0108\u00f6\3\2\2\2\u0108\u00f8\3\2\2\2\u0108\u0105\3\2\2\2\u0109"+
		"\u011c\3\2\2\2\u010a\u010b\f\7\2\2\u010b\u010c\7-\2\2\u010c\u010d\5\26"+
		"\f\b\u010d\u010e\b\f\1\2\u010e\u011b\3\2\2\2\u010f\u0110\f\6\2\2\u0110"+
		"\u0111\7P\2\2\u0111\u011b\b\f\1\2\u0112\u0114\f\4\2\2\u0113\u0115\5\66"+
		"\34\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\b\f\1\2\u0119\u011b\3\2"+
		"\2\2\u011a\u010a\3\2\2\2\u011a\u010f\3\2\2\2\u011a\u0112\3\2\2\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\27\3\2\2"+
		"\2\u011e\u011c\3\2\2\2\u011f\u0120\7\62\2\2\u0120\u0121\7Q\2\2\u0121\u0122"+
		"\7 \2\2\u0122\u0123\5\26\f\2\u0123\u0124\b\r\1\2\u0124\u0129\3\2\2\2\u0125"+
		"\u0126\7\62\2\2\u0126\u0127\7Q\2\2\u0127\u0129\b\r\1\2\u0128\u011f\3\2"+
		"\2\2\u0128\u0125\3\2\2\2\u0129\31\3\2\2\2\u012a\u012c\5\16\b\2\u012b\u012d"+
		"\5\f\7\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7\t\2\2\u0131\u0132\5*"+
		"\26\2\u0132\u0133\b\16\1\2\u0133\u013a\3\2\2\2\u0134\u0135\5\f\7\2\u0135"+
		"\u0136\7\t\2\2\u0136\u0137\5*\26\2\u0137\u0138\b\16\1\2\u0138\u013a\3"+
		"\2\2\2\u0139\u012a\3\2\2\2\u0139\u0134\3\2\2\2\u013a\33\3\2\2\2\u013b"+
		"\u013c\5\n\6\2\u013c\u013d\7;\2\2\u013d\u013e\5*\26\2\u013e\u013f\b\17"+
		"\1\2\u013f\35\3\2\2\2\u0140\u0141\5\b\5\2\u0141\u0142\5> \2\u0142\u0143"+
		"\b\20\1\2\u0143\u0157\3\2\2\2\u0144\u014d\7\r\2\2\u0145\u014a\5\b\5\2"+
		"\u0146\u0147\7\17\2\2\u0147\u0149\5\b\5\2\u0148\u0146\3\2\2\2\u0149\u014c"+
		"\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014e\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u0145\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0150\7=\2\2\u0150\u0151\5> \2\u0151\u0152\b\20\1\2\u0152\u0157"+
		"\3\2\2\2\u0153\u0154\5> \2\u0154\u0155\b\20\1\2\u0155\u0157\3\2\2\2\u0156"+
		"\u0140\3\2\2\2\u0156\u0144\3\2\2\2\u0156\u0153\3\2\2\2\u0157\37\3\2\2"+
		"\2\u0158\u0159\7>\2\2\u0159\u015a\5\36\20\2\u015a\u015b\b\21\1\2\u015b"+
		"!\3\2\2\2\u015c\u015d\7\17\2\2\u015d\u015e\5\f\7\2\u015e\u015f\b\22\1"+
		"\2\u015f#\3\2\2\2\u0160\u0161\5\20\t\2\u0161\u0162\7\24\2\2\u0162\u0163"+
		"\5$\23\2\u0163\u0164\b\23\1\2\u0164\u016a\3\2\2\2\u0165\u0166\5\20\t\2"+
		"\u0166\u0167\7\24\2\2\u0167\u0168\b\23\1\2\u0168\u016a\3\2\2\2\u0169\u0160"+
		"\3\2\2\2\u0169\u0165\3\2\2\2\u016a%\3\2\2\2\u016b\u016c\7\32\2\2\u016c"+
		"\u016d\5\2\2\2\u016d\u016e\b\24\1\2\u016e\u0185\3\2\2\2\u016f\u0170\7"+
		"\r\2\2\u0170\u0171\5&\24\2\u0171\u0172\7=\2\2\u0172\u0173\b\24\1\2\u0173"+
		"\u0185\3\2\2\2\u0174\u0175\7:\2\2\u0175\u0176\5&\24\2\u0176\u0177\7<\2"+
		"\2\u0177\u0178\b\24\1\2\u0178\u0185\3\2\2\2\u0179\u017a\5\16\b\2\u017a"+
		"\u017b\b\24\1\2\u017b\u0185\3\2\2\2\u017c\u017d\7\3\2\2\u017d\u017e\5"+
		"\24\13\2\u017e\u017f\b\24\1\2\u017f\u0185\3\2\2\2\u0180\u0181\7\3\2\2"+
		"\u0181\u0182\5\60\31\2\u0182\u0183\b\24\1\2\u0183\u0185\3\2\2\2\u0184"+
		"\u016b\3\2\2\2\u0184\u016f\3\2\2\2\u0184\u0174\3\2\2\2\u0184\u0179\3\2"+
		"\2\2\u0184\u017c\3\2\2\2\u0184\u0180\3\2\2\2\u0185\'\3\2\2\2\u0186\u0187"+
		"\7>\2\2\u0187\u0188\58\35\2\u0188\u0189\b\25\1\2\u0189)\3\2\2\2\u018a"+
		"\u018b\b\26\1\2\u018b\u018c\7Q\2\2\u018c\u018d\5*\26\33\u018d\u018e\b"+
		"\26\1\2\u018e\u01f7\3\2\2\2\u018f\u0190\78\2\2\u0190\u0191\5*\26\32\u0191"+
		"\u0192\b\26\1\2\u0192\u01f7\3\2\2\2\u0193\u0194\7\67\2\2\u0194\u0195\5"+
		"*\26\30\u0195\u0196\b\26\1\2\u0196\u01f7\3\2\2\2\u0197\u0198\7@\2\2\u0198"+
		"\u0199\5*\26\27\u0199\u019a\b\26\1\2\u019a\u01f7\3\2\2\2\u019b\u019c\7"+
		"?\2\2\u019c\u019d\5*\26\20\u019d\u019e\b\26\1\2\u019e\u01f7\3\2\2\2\u019f"+
		"\u01a0\7%\2\2\u01a0\u01a1\5*\26\2\u01a1\u01a2\7\34\2\2\u01a2\u01a3\5*"+
		"\26\2\u01a3\u01a4\79\2\2\u01a4\u01a5\5*\26\f\u01a5\u01a6\b\26\1\2\u01a6"+
		"\u01f7\3\2\2\2\u01a7\u01a8\7%\2\2\u01a8\u01a9\5*\26\2\u01a9\u01aa\7\34"+
		"\2\2\u01aa\u01ab\5*\26\13\u01ab\u01ac\b\26\1\2\u01ac\u01f7\3\2\2\2\u01ad"+
		"\u01ae\5\16\b\2\u01ae\u01af\b\26\1\2\u01af\u01f7\3\2\2\2\u01b0\u01b1\5"+
		"\4\3\2\u01b1\u01b2\b\26\1\2\u01b2\u01f7\3\2\2\2\u01b3\u01b4\7\r\2\2\u01b4"+
		"\u01b5\5*\26\2\u01b5\u01b6\7=\2\2\u01b6\u01b7\b\26\1\2\u01b7\u01f7\3\2"+
		"\2\2\u01b8\u01b9\7:\2\2\u01b9\u01ba\5*\26\2\u01ba\u01bb\7<\2\2\u01bb\u01bc"+
		"\b\26\1\2\u01bc\u01f7\3\2\2\2\u01bd\u01be\7\r\2\2\u01be\u01bf\5*\26\2"+
		"\u01bf\u01c0\7\60\2\2\u01c0\u01c1\5\26\f\2\u01c1\u01c2\7=\2\2\u01c2\u01c3"+
		"\b\26\1\2\u01c3\u01f7\3\2\2\2\u01c4\u01c5\5\64\33\2\u01c5\u01c6\b\26\1"+
		"\2\u01c6\u01f7\3\2\2\2\u01c7\u01c8\7\6\2\2\u01c8\u01c9\5*\26\2\u01c9\u01ca"+
		"\7\f\2\2\u01ca\u01cb\5*\26\2\u01cb\u01cc\7\20\2\2\u01cc\u01cd\b\26\1\2"+
		"\u01cd\u01f7\3\2\2\2\u01ce\u01cf\7\n\2\2\u01cf\u01d0\5\16\b\2\u01d0\u01d1"+
		"\7\t\2\2\u01d1\u01d2\5*\26\2\u01d2\u01d3\7\33\2\2\u01d3\u01d4\5*\26\2"+
		"\u01d4\u01d5\7\f\2\2\u01d5\u01d6\5*\26\2\u01d6\u01d7\7\20\2\2\u01d7\u01d8"+
		"\b\26\1\2\u01d8\u01f7\3\2\2\2\u01d9\u01da\7\n\2\2\u01da\u01db\5\16\b\2"+
		"\u01db\u01dc\7\t\2\2\u01dc\u01dd\5*\26\2\u01dd\u01de\7.\2\2\u01de\u01df"+
		"\5*\26\2\u01df\u01e0\7\f\2\2\u01e0\u01e1\5*\26\2\u01e1\u01e2\7\20\2\2"+
		"\u01e2\u01e3\b\26\1\2\u01e3\u01f7\3\2\2\2\u01e4\u01e5\7\31\2\2\u01e5\u01e6"+
		"\5*\26\2\u01e6\u01e7\7\63\2\2\u01e7\u01e8\5\2\2\2\u01e8\u01e9\b\26\1\2"+
		"\u01e9\u01f7\3\2\2\2\u01ea\u01eb\5&\24\2\u01eb\u01ec\b\26\1\2\u01ec\u01f7"+
		"\3\2\2\2\u01ed\u01ee\7&\2\2\u01ee\u01ef\5*\26\2\u01ef\u01f0\7\63\2\2\u01f0"+
		"\u01f1\5\2\2\2\u01f1\u01f2\b\26\1\2\u01f2\u01f7\3\2\2\2\u01f3\u01f4\5"+
		"\34\17\2\u01f4\u01f5\b\26\1\2\u01f5\u01f7\3\2\2\2\u01f6\u018a\3\2\2\2"+
		"\u01f6\u018f\3\2\2\2\u01f6\u0193\3\2\2\2\u01f6\u0197\3\2\2\2\u01f6\u019b"+
		"\3\2\2\2\u01f6\u019f\3\2\2\2\u01f6\u01a7\3\2\2\2\u01f6\u01ad\3\2\2\2\u01f6"+
		"\u01b0\3\2\2\2\u01f6\u01b3\3\2\2\2\u01f6\u01b8\3\2\2\2\u01f6\u01bd\3\2"+
		"\2\2\u01f6\u01c4\3\2\2\2\u01f6\u01c7\3\2\2\2\u01f6\u01ce\3\2\2\2\u01f6"+
		"\u01d9\3\2\2\2\u01f6\u01e4\3\2\2\2\u01f6\u01ea\3\2\2\2\u01f6\u01ed\3\2"+
		"\2\2\u01f6\u01f3\3\2\2\2\u01f7\u022c\3\2\2\2\u01f8\u01f9\f\26\2\2\u01f9"+
		"\u01fa\7\b\2\2\u01fa\u01fb\5*\26\27\u01fb\u01fc\b\26\1\2\u01fc\u022b\3"+
		"\2\2\2\u01fd\u01fe\f\25\2\2\u01fe\u01ff\7\21\2\2\u01ff\u0200\5*\26\26"+
		"\u0200\u0201\b\26\1\2\u0201\u022b\3\2\2\2\u0202\u0203\f\24\2\2\u0203\u0204"+
		"\t\2\2\2\u0204\u0205\5*\26\25\u0205\u0206\b\26\1\2\u0206\u022b\3\2\2\2"+
		"\u0207\u0208\f\23\2\2\u0208\u0209\t\3\2\2\u0209\u020a\5*\26\24\u020a\u020b"+
		"\b\26\1\2\u020b\u022b\3\2\2\2\u020c\u020d\f\22\2\2\u020d\u020e\7\13\2"+
		"\2\u020e\u020f\5*\26\23\u020f\u0210\b\26\1\2\u0210\u022b\3\2\2\2\u0211"+
		"\u0212\f\21\2\2\u0212\u0213\t\4\2\2\u0213\u0214\5*\26\22\u0214\u0215\b"+
		"\26\1\2\u0215\u022b\3\2\2\2\u0216\u0217\f\17\2\2\u0217\u0218\t\5\2\2\u0218"+
		"\u0219\5*\26\20\u0219\u021a\b\26\1\2\u021a\u022b\3\2\2\2\u021b\u021c\f"+
		"\16\2\2\u021c\u021d\t\6\2\2\u021d\u021e\5*\26\17\u021e\u021f\b\26\1\2"+
		"\u021f\u022b\3\2\2\2\u0220\u0221\f\r\2\2\u0221\u0222\7\'\2\2\u0222\u0223"+
		"\5*\26\r\u0223\u0224\b\26\1\2\u0224\u022b\3\2\2\2\u0225\u0226\f\7\2\2"+
		"\u0226\u0227\7!\2\2\u0227\u0228\5*\26\7\u0228\u0229\b\26\1\2\u0229\u022b"+
		"\3\2\2\2\u022a\u01f8\3\2\2\2\u022a\u01fd\3\2\2\2\u022a\u0202\3\2\2\2\u022a"+
		"\u0207\3\2\2\2\u022a\u020c\3\2\2\2\u022a\u0211\3\2\2\2\u022a\u0216\3\2"+
		"\2\2\u022a\u021b\3\2\2\2\u022a\u0220\3\2\2\2\u022a\u0225\3\2\2\2\u022b"+
		"\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d+\3\2\2\2"+
		"\u022e\u022c\3\2\2\2\u022f\u0230\7>\2\2\u0230\u0231\5\32\16\2\u0231\u0232"+
		"\b\27\1\2\u0232-\3\2\2\2\u0233\u0234\7Q\2\2\u0234\u0235\7 \2\2\u0235\u0236"+
		"\5\26\f\2\u0236\u0237\b\30\1\2\u0237\u023b\3\2\2\2\u0238\u0239\7Q\2\2"+
		"\u0239\u023b\b\30\1\2\u023a\u0233\3\2\2\2\u023a\u0238\3\2\2\2\u023b/\3"+
		"\2\2\2\u023c\u023e\5\f\7\2\u023d\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241\u0242\7-"+
		"\2\2\u0242\u0243\5*\26\2\u0243\u0244\b\31\1\2\u0244\61\3\2\2\2\u0245\u0246"+
		"\5$\23\2\u0246\u0247\b\32\1\2\u0247\63\3\2\2\2\u0248\u0249\b\33\1\2\u0249"+
		"\u024a\7\r\2\2\u024a\u024b\5\64\33\2\u024b\u024c\7=\2\2\u024c\u024d\b"+
		"\33\1\2\u024d\u0253\3\2\2\2\u024e\u024f\5&\24\2\u024f\u0250\5*\26\2\u0250"+
		"\u0251\b\33\1\2\u0251\u0253\3\2\2\2\u0252\u0248\3\2\2\2\u0252\u024e\3"+
		"\2\2\2\u0253\u025a\3\2\2\2\u0254\u0255\f\4\2\2\u0255\u0256\5*\26\2\u0256"+
		"\u0257\b\33\1\2\u0257\u0259\3\2\2\2\u0258\u0254\3\2\2\2\u0259\u025c\3"+
		"\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b\65\3\2\2\2\u025c"+
		"\u025a\3\2\2\2\u025d\u025e\7+\2\2\u025e\u025f\5\26\f\2\u025f\u0260\b\34"+
		"\1\2\u0260\67\3\2\2\2\u0261\u0262\7\r\2\2\u0262\u0263\5\16\b\2\u0263\u0264"+
		"\7\60\2\2\u0264\u0265\5\26\f\2\u0265\u0266\7=\2\2\u0266\u0267\7\t\2\2"+
		"\u0267\u0268\5*\26\2\u0268\u0269\b\35\1\2\u0269\u027a\3\2\2\2\u026a\u026c"+
		"\5\16\b\2\u026b\u026d\5\f\7\2\u026c\u026b\3\2\2\2\u026d\u026e\3\2\2\2"+
		"\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0271"+
		"\7\t\2\2\u0271\u0272\5*\26\2\u0272\u0273\b\35\1\2\u0273\u027a\3\2\2\2"+
		"\u0274\u0275\5\16\b\2\u0275\u0276\7\t\2\2\u0276\u0277\5*\26\2\u0277\u0278"+
		"\b\35\1\2\u0278\u027a\3\2\2\2\u0279\u0261\3\2\2\2\u0279\u026a\3\2\2\2"+
		"\u0279\u0274\3\2\2\2\u027a9\3\2\2\2\u027b\u027c\7>\2\2\u027c\u027d\7Q"+
		"\2\2\u027d\u027e\7 \2\2\u027e\u027f\5\26\f\2\u027f\u0280\b\36\1\2\u0280"+
		"\u0285\3\2\2\2\u0281\u0282\7>\2\2\u0282\u0283\7Q\2\2\u0283\u0285\b\36"+
		"\1\2\u0284\u027b\3\2\2\2\u0284\u0281\3\2\2\2\u0285;\3\2\2\2\u0286\u0287"+
		"\58\35\2\u0287\u0288\b\37\1\2\u0288\u0292\3\2\2\2\u0289\u028b\58\35\2"+
		"\u028a\u028c\5(\25\2\u028b\u028a\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028b"+
		"\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\b\37\1\2"+
		"\u0290\u0292\3\2\2\2\u0291\u0286\3\2\2\2\u0291\u0289\3\2\2\2\u0292=\3"+
		"\2\2\2\u0293\u0294\5\16\b\2\u0294\u0295\7\t\2\2\u0295\u0296\7\5\2\2\u0296"+
		"\u029b\5\6\4\2\u0297\u0298\7\17\2\2\u0298\u029a\5\6\4\2\u0299\u0297\3"+
		"\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c"+
		"\u029e\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u029f\7$\2\2\u029f\u02a0\b \1"+
		"\2\u02a0\u02be\3\2\2\2\u02a1\u02a2\7P\2\2\u02a2\u02a3\7\t\2\2\u02a3\u02a7"+
		"\7Q\2\2\u02a4\u02a6\5\30\r\2\u02a5\u02a4\3\2\2\2\u02a6\u02a9\3\2\2\2\u02a7"+
		"\u02a5\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02aa\3\2\2\2\u02a9\u02a7\3\2"+
		"\2\2\u02aa\u02be\b \1\2\u02ab\u02ac\7P\2\2\u02ac\u02ad\7\t\2\2\u02ad\u02ae"+
		"\7Q\2\2\u02ae\u02af\7 \2\2\u02af\u02b3\5\26\f\2\u02b0\u02b2\5\30\r\2\u02b1"+
		"\u02b0\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b3\u02b4\3\2"+
		"\2\2\u02b4\u02b6\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6\u02b7\b \1\2\u02b7"+
		"\u02be\3\2\2\2\u02b8\u02b9\7P\2\2\u02b9\u02ba\7\61\2\2\u02ba\u02bb\5\26"+
		"\f\2\u02bb\u02bc\b \1\2\u02bc\u02be\3\2\2\2\u02bd\u0293\3\2\2\2\u02bd"+
		"\u02a1\3\2\2\2\u02bd\u02ab\3\2\2\2\u02bd\u02b8\3\2\2\2\u02be?\3\2\2\2"+
		",L_lz\u0084\u008f\u00a1\u00a5\u00c7\u00cc\u00d8\u00da\u00e6\u00fe\u0108"+
		"\u0116\u011a\u011c\u0128\u012e\u0139\u014a\u014d\u0156\u0169\u0184\u01f6"+
		"\u022a\u022c\u023a\u023f\u0252\u025a\u026e\u0279\u0284\u028d\u0291\u029b"+
		"\u02a7\u02b3\u02bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}