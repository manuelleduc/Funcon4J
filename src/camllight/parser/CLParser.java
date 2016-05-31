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
		T__64=1, T__63=2, T__62=3, T__61=4, T__60=5, T__59=6, T__58=7, T__57=8, 
		T__56=9, T__55=10, T__54=11, T__53=12, T__52=13, T__51=14, T__50=15, T__49=16, 
		T__48=17, T__47=18, T__46=19, T__45=20, T__44=21, T__43=22, T__42=23, 
		T__41=24, T__40=25, T__39=26, T__38=27, T__37=28, T__36=29, T__35=30, 
		T__34=31, T__33=32, T__32=33, T__31=34, T__30=35, T__29=36, T__28=37, 
		T__27=38, T__26=39, T__25=40, T__24=41, T__23=42, T__22=43, T__21=44, 
		T__20=45, T__19=46, T__18=47, T__17=48, T__16=49, T__15=50, T__14=51, 
		T__13=52, T__12=53, T__11=54, T__10=55, T__9=56, T__8=57, T__7=58, T__6=59, 
		T__5=60, T__4=61, T__3=62, T__2=63, T__1=64, T__0=65, CHARTOKEN=66, WS=67, 
		INTTOKEN=68, NULLTOKEN=69, STRINGTOKEN=70, EMPTYLISTTOKEN=71, EMPTYARRAYTOKEN=72, 
		WILDCARDTOKEN=73, FLOATTOKEN=74, BOOLTOKEN=75, IDTOKEN=76, CONSTRTOKEN=77;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'while'", "'{'", "'&&'", "'::'", "'='", "'for'", 
		"'do'", "'('", "'rec'", "','", "'<-'", "'done'", "'mod'", "'>='", "'<'", 
		"';;'", "']'", "'*.'", "'type'", "'|]'", "'let'", "'match'", "'function'", 
		"'downto'", "'then'", "'+'", "'/'", "'as'", "'of'", "'.('", "'||'", "'/.'", 
		"';'", "'}'", "'if'", "'try'", "'<='", "'[|'", "'&'", "'print'", "'''", 
		"'*'", "'.'", "'exception'", "'->'", "'to'", "'mutable'", "':'", "'['", 
		"'=='", "'|'", "'with'", "'>'", "'+.'", "'or'", "'-.'", "'else'", "'begin'", 
		"'in'", "'end'", "')'", "'and'", "'not'", "'-'", "CHARTOKEN", "WS", "INTTOKEN", 
		"NULLTOKEN", "STRINGTOKEN", "EMPTYLISTTOKEN", "EMPTYARRAYTOKEN", "'_'", 
		"FLOATTOKEN", "BOOLTOKEN", "IDTOKEN", "CONSTRTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_decllabeltype = 2, RULE_vartype = 3, 
		RULE_decl = 4, RULE_patt = 5, RULE_ident = 6, RULE_declorexp = 7, RULE_declconstrtypeappendix = 8, 
		RULE_pattlist = 9, RULE_declenumtypeappendix = 10, RULE_emptylist = 11, 
		RULE_pattmatchsingle = 12, RULE_type = 13, RULE_headtaillistpatt = 14, 
		RULE_recordsingle = 15, RULE_declmono = 16, RULE_letExp = 17, RULE_declnewtypeappendix = 18, 
		RULE_decloptionalvartypes = 19, RULE_patttuple = 20, RULE_declimpl = 21, 
		RULE_function = 22, RULE_recanddecl = 23, RULE_recordpattappendix = 24, 
		RULE_exp = 25, RULE_anddecl = 26, RULE_varianttype = 27, RULE_pattmatchcurried = 28, 
		RULE_prog = 29, RULE_exparray = 30, RULE_tupletypelist = 31, RULE_recdeclmono = 32, 
		RULE_declexceptionappendix = 33, RULE_recdecl = 34, RULE_declnewtype = 35;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "decllabeltype", "vartype", "decl", "patt", "ident", 
		"declorexp", "declconstrtypeappendix", "pattlist", "declenumtypeappendix", 
		"emptylist", "pattmatchsingle", "type", "headtaillistpatt", "recordsingle", 
		"declmono", "letExp", "declnewtypeappendix", "decloptionalvartypes", "patttuple", 
		"declimpl", "function", "recanddecl", "recordpattappendix", "exp", "anddecl", 
		"varianttype", "pattmatchcurried", "prog", "exparray", "tupletypelist", 
		"recdeclmono", "declexceptionappendix", "recdecl", "declnewtype"
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
			setState(84);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72); match(52);
				setState(73); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				setState(77); match(52);
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
		public Token BOOLTOKEN_0;
		public Token STRINGTOKEN_0;
		public Token NULLTOKEN_0;
		public Token CHARTOKEN_0;
		public Token CONSTRTOKEN_0;
		public Token INTTOKEN_0;
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
			setState(103);
			switch (_input.LA(1)) {
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case STRINGTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(91); ((ConstantContext)_localctx).STRINGTOKEN_0 = match(STRINGTOKEN);
				((ConstantContext)_localctx)._constant =  builder.string(stringtoken((((ConstantContext)_localctx).STRINGTOKEN_0!=null?((ConstantContext)_localctx).STRINGTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(93); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case CHARTOKEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(95); ((ConstantContext)_localctx).CHARTOKEN_0 = match(CHARTOKEN);
				((ConstantContext)_localctx)._constant =  builder.char_(chartoken((((ConstantContext)_localctx).CHARTOKEN_0!=null?((ConstantContext)_localctx).CHARTOKEN_0.getText():null)));
				}
				break;
			case CONSTRTOKEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(97); ((ConstantContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((ConstantContext)_localctx)._constant =  builder.constr(constrtoken((((ConstantContext)_localctx).CONSTRTOKEN_0!=null?((ConstantContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;
			case INTTOKEN:
				enterOuterAlt(_localctx, 7);
				{
				setState(99); ((ConstantContext)_localctx).INTTOKEN_0 = match(INTTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(inttoken((((ConstantContext)_localctx).INTTOKEN_0!=null?((ConstantContext)_localctx).INTTOKEN_0.getText():null)));
				}
				break;
			case FLOATTOKEN:
				enterOuterAlt(_localctx, 8);
				{
				setState(101); ((ConstantContext)_localctx).FLOATTOKEN_0 = match(FLOATTOKEN);
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
			setState(116);
			switch (_input.LA(1)) {
			case 48:
				enterOuterAlt(_localctx, 1);
				{
				setState(105); match(48);
				setState(106); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(107); match(49);
				setState(108); ((DecllabeltypeContext)_localctx).type_1 = type(0);
				((DecllabeltypeContext)_localctx)._decllabeltype =  builder.declMutableLabelType(idtoken((((DecllabeltypeContext)_localctx).IDTOKEN_0!=null?((DecllabeltypeContext)_localctx).IDTOKEN_0.getText():null)),(((DecllabeltypeContext)_localctx).type_1._type));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(111); ((DecllabeltypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(112); match(49);
				setState(113); ((DecllabeltypeContext)_localctx).type_1 = type(0);
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
			setState(118); match(42);
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
			setState(173);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); match(22);
				setState(123); match(10);
				setState(124); ((DeclContext)_localctx).recdecl_0 = recdecl();
				((DeclContext)_localctx)._decl =  builder.declRec((((DeclContext)_localctx).recdecl_0._recdecl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130); match(45);
				setState(131); ((DeclContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==63) {
					{
					{
					setState(132); ((DeclContext)_localctx).declexceptionappendix = declexceptionappendix();
					((DeclContext)_localctx).declexceptionappendix_1_list.add(((DeclContext)_localctx).declexceptionappendix);
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declEnumException(constrtoken((((DeclContext)_localctx).CONSTRTOKEN_0!=null?((DeclContext)_localctx).CONSTRTOKEN_0.getText():null)),lift("_declexceptionappendix", ((DeclContext)_localctx).declexceptionappendix_1_list));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(139); match(45);
				setState(140); ((DeclContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(141); match(30);
				setState(142); ((DeclContext)_localctx).type_1 = type(0);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==63) {
					{
					{
					setState(143); ((DeclContext)_localctx).declexceptionappendix = declexceptionappendix();
					((DeclContext)_localctx).declexceptionappendix_2_list.add(((DeclContext)_localctx).declexceptionappendix);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declConstrException(constrtoken((((DeclContext)_localctx).CONSTRTOKEN_0!=null?((DeclContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DeclContext)_localctx).type_1._type),lift("_declexceptionappendix", ((DeclContext)_localctx).declexceptionappendix_2_list));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(151); match(20);
				setState(152); ((DeclContext)_localctx).decloptionalvartypes_0 = decloptionalvartypes();
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==63) {
					{
					{
					setState(153); ((DeclContext)_localctx).declnewtypeappendix = declnewtypeappendix();
					((DeclContext)_localctx).declnewtypeappendix_1_list.add(((DeclContext)_localctx).declnewtypeappendix);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclContext)_localctx)._decl =  builder.declNewType((((DeclContext)_localctx).decloptionalvartypes_0._decloptionalvartypes),lift("_declnewtypeappendix", ((DeclContext)_localctx).declnewtypeappendix_1_list));
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(161); match(22);
				setState(162); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(165); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166); ((DeclContext)_localctx).anddecl = anddecl();
					((DeclContext)_localctx).anddecl_1_list.add(((DeclContext)_localctx).anddecl);
					}
					}
					setState(169); 
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
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(176); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(177); ((PattContext)_localctx).patt_1 = patt(6);
				((PattContext)_localctx)._patt =  builder.pattConstrPatt(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt));
				}
				break;

			case 2:
				{
				setState(180); match(3);
				setState(181); ((PattContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(182); match(6);
				setState(183); ((PattContext)_localctx).patt_1 = patt(0);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(184); ((PattContext)_localctx).recordpattappendix = recordpattappendix();
					((PattContext)_localctx).recordpattappendix_2_list.add(((PattContext)_localctx).recordpattappendix);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190); match(35);
				((PattContext)_localctx)._patt =  builder.recordPatt(idtoken((((PattContext)_localctx).IDTOKEN_0!=null?((PattContext)_localctx).IDTOKEN_0.getText():null)),(((PattContext)_localctx).patt_1._patt),lift("_recordpattappendix", ((PattContext)_localctx).recordpattappendix_2_list));
				}
				break;

			case 3:
				{
				setState(193); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(196); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 5:
				{
				setState(198); match(9);
				setState(199); ((PattContext)_localctx).patt_0 = patt(0);
				setState(200); match(62);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 6:
				{
				setState(203); match(9);
				setState(204); ((PattContext)_localctx).patt_0 = patt(0);
				setState(205); match(49);
				setState(206); ((PattContext)_localctx).type_1 = type(0);
				setState(207); match(62);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 7:
				{
				setState(210); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 8:
				{
				setState(213); ((PattContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((PattContext)_localctx)._patt =  builder.pattConstr(constrtoken((((PattContext)_localctx).CONSTRTOKEN_0!=null?((PattContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(215); match(9);
				setState(216); ((PattContext)_localctx).patt_0 = patt(0);
				setState(218); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(217); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(220); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==11 );
				setState(222); match(62);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 10:
				{
				setState(225); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 11:
				{
				setState(228); match(50);
				setState(229); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(230); match(18);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 12:
				{
				setState(233); match(50);
				setState(234); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(235); match(18);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(252);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(250);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(240);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(241); match(52);
						setState(242); ((PattContext)_localctx).patt_1 = patt(9);
						((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).patt_1._patt));
						}
						break;

					case 2:
						{
						_localctx = new PattContext(_parentctx, _parentState);
						_localctx.patt_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_patt);
						setState(245);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(246); match(29);
						setState(247); ((PattContext)_localctx).ident_1 = ident();
						((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
						}
						break;
					}
					} 
				}
				setState(254);
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
			setState(255); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(258); ((DeclorexpContext)_localctx).exp_0 = exp(0);
				((DeclorexpContext)_localctx)._declorexp =  builder.declOrExpExp((((DeclorexpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261); ((DeclorexpContext)_localctx).decl_0 = decl();
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
			setState(266); match(52);
			setState(267); ((DeclconstrtypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
			setState(268); match(30);
			setState(269); ((DeclconstrtypeappendixContext)_localctx).type_1 = type(0);
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
			setState(280);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272); ((PattlistContext)_localctx).patt_0 = patt(0);
				((PattlistContext)_localctx)._pattlist =  builder.pattListSingle((((PattlistContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(276); match(11);
				setState(277); ((PattlistContext)_localctx).pattlist_1 = pattlist();
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
			setState(282); match(52);
			setState(283); ((DeclenumtypeappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
			setState(286); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
			setState(289); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(290); match(46);
			setState(291); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
			setState(305);
			switch (_input.LA(1)) {
			case 42:
				{
				setState(295); ((TypeContext)_localctx).vartype_0 = vartype();
				((TypeContext)_localctx)._type =  builder.varTypeType((((TypeContext)_localctx).vartype_0._vartype));
				}
				break;
			case 9:
				{
				setState(298); match(9);
				setState(299); ((TypeContext)_localctx).type_0 = type(0);
				setState(300); match(62);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;
			case IDTOKEN:
				{
				setState(303); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(322);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(320);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(307);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(308); match(46);
						setState(309); ((TypeContext)_localctx).type_1 = type(3);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(312);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(314); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(313); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(316); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.tupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;
					}
					} 
				}
				setState(324);
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
		enterRule(_localctx, 28, RULE_headtaillistpatt);
		try {
			setState(333);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(326); match(5);
				setState(327); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(330); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
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
		enterRule(_localctx, 30, RULE_recordsingle);
		try {
			setState(346);
			switch (_input.LA(1)) {
			case 48:
				enterOuterAlt(_localctx, 1);
				{
				setState(335); match(48);
				setState(336); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(337); match(6);
				setState(338); ((RecordsingleContext)_localctx).exp_1 = exp(0);
				((RecordsingleContext)_localctx)._recordsingle =  builder.recordEntryMutableSingle(idtoken((((RecordsingleContext)_localctx).IDTOKEN_0!=null?((RecordsingleContext)_localctx).IDTOKEN_0.getText():null)),(((RecordsingleContext)_localctx).exp_1._exp));
				}
				break;
			case IDTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(341); ((RecordsingleContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(342); match(6);
				setState(343); ((RecordsingleContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 32, RULE_declmono);
		int _la;
		try {
			setState(363);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 50))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CHARTOKEN - 66)) | (1L << (INTTOKEN - 66)) | (1L << (NULLTOKEN - 66)) | (1L << (STRINGTOKEN - 66)) | (1L << (EMPTYLISTTOKEN - 66)) | (1L << (WILDCARDTOKEN - 66)) | (1L << (FLOATTOKEN - 66)) | (1L << (BOOLTOKEN - 66)) | (1L << (IDTOKEN - 66)) | (1L << (CONSTRTOKEN - 66)))) != 0) );
				setState(354); match(6);
				setState(355); ((DeclmonoContext)_localctx).exp_2 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMonoFunc((((DeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((DeclmonoContext)_localctx).patt_1_list),(((DeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(359); match(6);
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
		enterRule(_localctx, 34, RULE_letExp);
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
			setState(370); match(63);
			setState(371); ((DeclnewtypeappendixContext)_localctx).decloptionalvartypes_0 = decloptionalvartypes();
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
		enterRule(_localctx, 38, RULE_decloptionalvartypes);
		int _la;
		try {
			setState(392);
			switch (_input.LA(1)) {
			case 9:
				enterOuterAlt(_localctx, 1);
				{
				setState(374); match(9);
				setState(383);
				_la = _input.LA(1);
				if (_la==42) {
					{
					setState(375); ((DecloptionalvartypesContext)_localctx).vartype_0 = vartype();
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==11) {
						{
						{
						setState(376); match(11);
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
				enterOuterAlt(_localctx, 2);
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
			setState(394); match(11);
			setState(395); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
			setState(407);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(398); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(399); match(17);
				setState(400); ((DeclimplContext)_localctx).declimpl_1 = declimpl();
				((DeclimplContext)_localctx)._declimpl =  builder.declImpl((((DeclimplContext)_localctx).declorexp_0._declorexp),(((DeclimplContext)_localctx).declimpl_1._declimpl));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403); ((DeclimplContext)_localctx).declorexp_0 = declorexp();
				setState(404); match(17);
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
			setState(435);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(410); match(24);
				setState(411); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(414); match(9);
				setState(415); ((FunctionContext)_localctx).function_0 = function(0);
				setState(416); match(62);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(419); match(59);
				setState(420); ((FunctionContext)_localctx).function_0 = function(0);
				setState(421); match(61);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 4:
				{
				setState(424); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 5:
				{
				setState(427); match(1);
				setState(428); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(431); match(1);
				setState(432); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(437);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(438); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(445);
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
			setState(446); match(63);
			setState(447); ((RecanddeclContext)_localctx).recdeclmono_0 = recdeclmono();
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
			setState(450); match(11);
			setState(451); ((RecordpattappendixContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			setState(452); match(6);
			setState(453); ((RecordpattappendixContext)_localctx).patt_1 = patt(0);
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
			setState(615);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(457); match(41);
				setState(458); ((ExpContext)_localctx).exp_0 = exp(37);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(461); ((ExpContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(462); ((ExpContext)_localctx).exp_1 = exp(29);
				((ExpContext)_localctx)._exp =  builder.constrExp(constrtoken((((ExpContext)_localctx).CONSTRTOKEN_0!=null?((ExpContext)_localctx).CONSTRTOKEN_0.getText():null)),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 3:
				{
				setState(465); match(64);
				setState(466); ((ExpContext)_localctx).exp_0 = exp(23);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 4:
				{
				setState(469); match(57);
				setState(470); ((ExpContext)_localctx).exp_0 = exp(22);
				((ExpContext)_localctx)._exp =  builder.floatNegateExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(473); match(65);
				setState(474); ((ExpContext)_localctx).exp_0 = exp(21);
				((ExpContext)_localctx)._exp =  builder.intUnarySub((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 6:
				{
				setState(477); match(36);
				setState(478); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(479); match(26);
				setState(480); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(481); match(58);
				setState(482); ((ExpContext)_localctx).exp_2 = exp(10);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 7:
				{
				setState(485); match(36);
				setState(486); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(487); match(26);
				setState(488); ((ExpContext)_localctx).exp_1 = exp(9);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 8:
				{
				setState(491); ((ExpContext)_localctx).EMPTYARRAYTOKEN_0 = match(EMPTYARRAYTOKEN);
				((ExpContext)_localctx)._exp =  builder.emptyArray(emptyarraytoken((((ExpContext)_localctx).EMPTYARRAYTOKEN_0!=null?((ExpContext)_localctx).EMPTYARRAYTOKEN_0.getText():null)));
				}
				break;

			case 9:
				{
				setState(493); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 10:
				{
				setState(496); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 11:
				{
				setState(499); match(9);
				setState(500); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(501); match(62);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 12:
				{
				setState(504); match(59);
				setState(505); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(506); match(61);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(509); match(9);
				setState(510); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(511); match(49);
				setState(512); ((ExpContext)_localctx).type_1 = type(0);
				setState(513); match(62);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 14:
				{
				setState(516); match(9);
				{
				setState(517); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(518); match(11);
					setState(519); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(524);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(525); match(62);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 15:
				{
				setState(528); match(50);
				{
				setState(529); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(530); match(11);
					setState(531); ((ExpContext)_localctx).exp = exp(0);
					((ExpContext)_localctx).exp_0tail.add(((ExpContext)_localctx).exp);
					}
					}
					setState(536);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(537); match(18);
				((ExpContext)_localctx)._exp =  builder.expList(lift("_exp", ((ExpContext)_localctx).exp_0tail, ((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 16:
				{
				setState(540); match(39);
				setState(541); ((ExpContext)_localctx).exparray_0 = exparray();
				setState(543);
				_la = _input.LA(1);
				if (_la==34) {
					{
					setState(542); match(34);
					}
				}

				setState(545); match(21);
				((ExpContext)_localctx)._exp =  builder.arrayMulti((((ExpContext)_localctx).exparray_0._exparray));
				}
				break;

			case 17:
				{
				setState(548); match(39);
				setState(549); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(551);
				_la = _input.LA(1);
				if (_la==34) {
					{
					setState(550); match(34);
					}
				}

				setState(553); match(21);
				((ExpContext)_localctx)._exp =  builder.arraySingle((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 18:
				{
				setState(556); match(3);
				{
				setState(557); ((ExpContext)_localctx).recordsingle_0 = recordsingle();
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(558); match(11);
					setState(559); ((ExpContext)_localctx).recordsingle = recordsingle();
					((ExpContext)_localctx).recordsingle_0tail.add(((ExpContext)_localctx).recordsingle);
					}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(565); match(35);
				((ExpContext)_localctx)._exp =  builder.recordExp(lift("_recordsingle", ((ExpContext)_localctx).recordsingle_0tail, ((ExpContext)_localctx).recordsingle_0._recordsingle));
				}
				break;

			case 19:
				{
				setState(568); match(2);
				setState(569); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(570); match(8);
				setState(571); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(572); match(13);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 20:
				{
				setState(575); match(7);
				setState(576); ((ExpContext)_localctx).ident_0 = ident();
				setState(577); match(6);
				setState(578); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(579); match(25);
				setState(580); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(581); match(8);
				setState(582); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(583); match(13);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 21:
				{
				setState(586); match(7);
				setState(587); ((ExpContext)_localctx).ident_0 = ident();
				setState(588); match(6);
				setState(589); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(590); match(47);
				setState(591); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(592); match(8);
				setState(593); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(594); match(13);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 22:
				{
				setState(597); match(23);
				setState(598); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(599); match(53);
				setState(600); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 23:
				{
				setState(603); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 24:
				{
				setState(606); match(37);
				setState(607); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(608); match(53);
				setState(609); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.tryWithExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 25:
				{
				setState(612); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(684);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(682);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(617);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(618); match(5);
						setState(619); ((ExpContext)_localctx).exp_1 = exp(28);
						((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(622);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(623); match(14);
						setState(624); ((ExpContext)_localctx).exp_1 = exp(21);
						((ExpContext)_localctx)._exp =  builder.intMod((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(627);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(628);
						((ExpContext)_localctx).op_1512 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 19) | (1L << 28) | (1L << 33) | (1L << 43))) != 0)) ) {
							((ExpContext)_localctx).op_1512 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(629); ((ExpContext)_localctx).exp_1 = exp(20);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/") ? builder.intDivide(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*.") ? builder.floatMultiplyExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("*") ? builder.intMultiply(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1512!=null?((ExpContext)_localctx).op_1512.getText():null).equals("/.") ? builder.floatDivideExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(632);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(633);
						((ExpContext)_localctx).op_1511 = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & ((1L << (27 - 27)) | (1L << (55 - 27)) | (1L << (57 - 27)) | (1L << (65 - 27)))) != 0)) ) {
							((ExpContext)_localctx).op_1511 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(634); ((ExpContext)_localctx).exp_1 = exp(19);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+.") ? builder.floatAddExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-.") ? builder.floatSubtractExp(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("+") ? builder.intAdd(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1511!=null?((ExpContext)_localctx).op_1511.getText():null).equals("-") ? builder.intSub(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(637);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(638);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 15) | (1L << 16) | (1L << 38) | (1L << 54))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(639); ((ExpContext)_localctx).exp_1 = exp(18);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.smallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.greaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.smaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.equal(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.greater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(642);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(643); match(44);
						setState(644); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						setState(645); match(12);
						setState(646); ((ExpContext)_localctx).exp_2 = exp(16);
						((ExpContext)_localctx)._exp =  builder.recordAssignExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(649);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(650); match(31);
						setState(651); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(652); match(62);
						setState(653); match(12);
						setState(654); ((ExpContext)_localctx).exp_2 = exp(14);
						((ExpContext)_localctx)._exp =  builder.arrayAssign((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
						}
						break;

					case 8:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(657);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(658);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==40) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(659); ((ExpContext)_localctx).exp_1 = exp(13);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 9:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(662);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(663);
						_la = _input.LA(1);
						if ( !(_la==32 || _la==56) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(664); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 10:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(667);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(668); match(34);
						setState(669); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 11:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(672);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(673); match(44);
						setState(674); ((ExpContext)_localctx).IDTOKEN_1 = match(IDTOKEN);
						((ExpContext)_localctx)._exp =  builder.recordSelectExp((((ExpContext)_localctx).exp_0._exp),idtoken((((ExpContext)_localctx).IDTOKEN_1!=null?((ExpContext)_localctx).IDTOKEN_1.getText():null)));
						}
						break;

					case 12:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(676);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(677); match(31);
						setState(678); ((ExpContext)_localctx).exp_1 = exp(0);
						setState(679); match(62);
						((ExpContext)_localctx)._exp =  builder.arraySelect((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 52, RULE_anddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687); match(63);
			setState(688); ((AnddeclContext)_localctx).declmono_0 = declmono();
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
		enterRule(_localctx, 54, RULE_varianttype);
		try {
			setState(698);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(691); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(692); match(30);
				setState(693); ((VarianttypeContext)_localctx).type_1 = type(0);
				((VarianttypeContext)_localctx)._varianttype =  builder.variantTypeDecl(constrtoken((((VarianttypeContext)_localctx).CONSTRTOKEN_0!=null?((VarianttypeContext)_localctx).CONSTRTOKEN_0.getText():null)),(((VarianttypeContext)_localctx).type_1._type));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(696); ((VarianttypeContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
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
		enterRule(_localctx, 56, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(700); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(703); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 50))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CHARTOKEN - 66)) | (1L << (INTTOKEN - 66)) | (1L << (NULLTOKEN - 66)) | (1L << (STRINGTOKEN - 66)) | (1L << (EMPTYLISTTOKEN - 66)) | (1L << (WILDCARDTOKEN - 66)) | (1L << (FLOATTOKEN - 66)) | (1L << (BOOLTOKEN - 66)) | (1L << (IDTOKEN - 66)) | (1L << (CONSTRTOKEN - 66)))) != 0) );
			setState(705); match(46);
			setState(706); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 58, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(709); ((ProgContext)_localctx).declimpl_0 = declimpl();
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
		enterRule(_localctx, 60, RULE_exparray);
		try {
			setState(722);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(713); match(34);
				setState(714); ((ExparrayContext)_localctx).exparray_1 = exparray();
				((ExparrayContext)_localctx)._exparray =  builder.innerExpArrayMulti((((ExparrayContext)_localctx).exp_0._exp),(((ExparrayContext)_localctx).exparray_1._exparray));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(717); ((ExparrayContext)_localctx).exp_0 = exp(0);
				setState(718); match(34);
				setState(719); ((ExparrayContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 62, RULE_tupletypelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724); match(43);
			setState(725); ((TupletypelistContext)_localctx).type_0 = type(0);
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
		enterRule(_localctx, 64, RULE_recdeclmono);
		int _la;
		try {
			setState(752);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(728); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(729); match(6);
				setState(730); ((RecdeclmonoContext)_localctx).exp_1 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclIdentExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733); match(9);
				setState(734); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(735); match(49);
				setState(736); ((RecdeclmonoContext)_localctx).type_1 = type(0);
				setState(737); match(62);
				setState(738); match(6);
				setState(739); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
				((RecdeclmonoContext)_localctx)._recdeclmono =  builder.recDeclPattTypeExp((((RecdeclmonoContext)_localctx).ident_0._ident),(((RecdeclmonoContext)_localctx).type_1._type),(((RecdeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(742); ((RecdeclmonoContext)_localctx).ident_0 = ident();
				setState(744); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(743); ((RecdeclmonoContext)_localctx).patt = patt(0);
					((RecdeclmonoContext)_localctx).patt_1_list.add(((RecdeclmonoContext)_localctx).patt);
					}
					}
					setState(746); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 3) | (1L << 9) | (1L << 50))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (CHARTOKEN - 66)) | (1L << (INTTOKEN - 66)) | (1L << (NULLTOKEN - 66)) | (1L << (STRINGTOKEN - 66)) | (1L << (EMPTYLISTTOKEN - 66)) | (1L << (WILDCARDTOKEN - 66)) | (1L << (FLOATTOKEN - 66)) | (1L << (BOOLTOKEN - 66)) | (1L << (IDTOKEN - 66)) | (1L << (CONSTRTOKEN - 66)))) != 0) );
				setState(748); match(6);
				setState(749); ((RecdeclmonoContext)_localctx).exp_2 = exp(0);
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
		enterRule(_localctx, 66, RULE_declexceptionappendix);
		try {
			setState(763);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(754); match(63);
				setState(755); ((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				((DeclexceptionappendixContext)_localctx)._declexceptionappendix =  builder.declEnumExceptionAppendix(constrtoken((((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0!=null?((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0.getText():null)));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(757); match(63);
				setState(758); ((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0 = match(CONSTRTOKEN);
				setState(759); match(30);
				setState(760); ((DeclexceptionappendixContext)_localctx).type_1 = type(0);
				((DeclexceptionappendixContext)_localctx)._declexceptionappendix =  builder.declConstrExceptionAppendix(constrtoken((((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0!=null?((DeclexceptionappendixContext)_localctx).CONSTRTOKEN_0.getText():null)),(((DeclexceptionappendixContext)_localctx).type_1._type));
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
			setState(776);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(765); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				((RecdeclContext)_localctx)._recdecl =  builder.recDeclMono((((RecdeclContext)_localctx).recdeclmono_0._recdeclmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768); ((RecdeclContext)_localctx).recdeclmono_0 = recdeclmono();
				setState(770); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(769); ((RecdeclContext)_localctx).recanddecl = recanddecl();
					((RecdeclContext)_localctx).recanddecl_1_list.add(((RecdeclContext)_localctx).recanddecl);
					}
					}
					setState(772); 
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
		public Token IDTOKEN_0;
		public Token CONSTRTOKEN_1;
		public TypeContext type_2;
		public DeclconstrtypeappendixContext declconstrtypeappendix;
		public List<DeclconstrtypeappendixContext> declconstrtypeappendix_3_list = new ArrayList<DeclconstrtypeappendixContext>();
		public TypeContext type_1;
		public DeclenumtypeappendixContext declenumtypeappendix;
		public List<DeclenumtypeappendixContext> declenumtypeappendix_2_list = new ArrayList<DeclenumtypeappendixContext>();
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
			setState(820);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(778); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(779); match(6);
				setState(780); ((DeclnewtypeContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(781); match(30);
				setState(782); ((DeclnewtypeContext)_localctx).type_2 = type(0);
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==52) {
					{
					{
					setState(783); ((DeclnewtypeContext)_localctx).declconstrtypeappendix = declconstrtypeappendix();
					((DeclnewtypeContext)_localctx).declconstrtypeappendix_3_list.add(((DeclnewtypeContext)_localctx).declconstrtypeappendix);
					}
					}
					setState(788);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declNewConstrType(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclnewtypeContext)_localctx).CONSTRTOKEN_1!=null?((DeclnewtypeContext)_localctx).CONSTRTOKEN_1.getText():null)),(((DeclnewtypeContext)_localctx).type_2._type),lift("_declconstrtypeappendix", ((DeclnewtypeContext)_localctx).declconstrtypeappendix_3_list));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(791); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(792); match(51);
				setState(793); ((DeclnewtypeContext)_localctx).type_1 = type(0);
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declTypeDefEquals(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),(((DeclnewtypeContext)_localctx).type_1._type));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(796); ((DeclnewtypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				setState(797); match(6);
				setState(798); ((DeclnewtypeContext)_localctx).CONSTRTOKEN_1 = match(CONSTRTOKEN);
				setState(802);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==52) {
					{
					{
					setState(799); ((DeclnewtypeContext)_localctx).declenumtypeappendix = declenumtypeappendix();
					((DeclnewtypeContext)_localctx).declenumtypeappendix_2_list.add(((DeclnewtypeContext)_localctx).declenumtypeappendix);
					}
					}
					setState(804);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				((DeclnewtypeContext)_localctx)._declnewtype =  builder.declNewEnumType(idtoken((((DeclnewtypeContext)_localctx).IDTOKEN_0!=null?((DeclnewtypeContext)_localctx).IDTOKEN_0.getText():null)),constrtoken((((DeclnewtypeContext)_localctx).CONSTRTOKEN_1!=null?((DeclnewtypeContext)_localctx).CONSTRTOKEN_1.getText():null)),lift("_declenumtypeappendix", ((DeclnewtypeContext)_localctx).declenumtypeappendix_2_list));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(806); ((DeclnewtypeContext)_localctx).ident_0 = ident();
				setState(807); match(6);
				setState(808); match(3);
				{
				setState(809); ((DeclnewtypeContext)_localctx).decllabeltype_1 = decllabeltype();
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==11) {
					{
					{
					setState(810); match(11);
					setState(811); ((DeclnewtypeContext)_localctx).decllabeltype = decllabeltype();
					((DeclnewtypeContext)_localctx).decllabeltype_1tail.add(((DeclnewtypeContext)_localctx).decllabeltype);
					}
					}
					setState(816);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(817); match(35);
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
		case 16: return precpred(_ctx, 14);

		case 5: return precpred(_ctx, 28);

		case 6: return precpred(_ctx, 20);

		case 7: return precpred(_ctx, 19);

		case 8: return precpred(_ctx, 18);

		case 9: return precpred(_ctx, 17);

		case 10: return precpred(_ctx, 15);

		case 11: return precpred(_ctx, 13);

		case 12: return precpred(_ctx, 12);

		case 13: return precpred(_ctx, 11);

		case 14: return precpred(_ctx, 5);

		case 15: return precpred(_ctx, 16);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3O\u0339\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2W\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3j\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4w\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6\u0088\n\6\f\6\16\6\u008b\13\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u0093\n"+
		"\6\f\6\16\6\u0096\13\6\3\6\3\6\3\6\3\6\3\6\7\6\u009d\n\6\f\6\16\6\u00a0"+
		"\13\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\6\6\u00aa\n\6\r\6\16\6\u00ab\3\6"+
		"\3\6\5\6\u00b0\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00bc\n"+
		"\7\f\7\16\7\u00bf\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00dd"+
		"\n\7\r\7\16\7\u00de\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7\u00f1\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7"+
		"\7\u00fd\n\7\f\7\16\7\u0100\13\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u010b\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\u011b\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0134"+
		"\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u013d\n\17\r\17\16\17\u013e"+
		"\3\17\3\17\7\17\u0143\n\17\f\17\16\17\u0146\13\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u0150\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\5\21\u015d\n\21\3\22\3\22\6\22\u0161\n\22\r\22\16"+
		"\22\u0162\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u016e\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\7\25"+
		"\u017d\n\25\f\25\16\25\u0180\13\25\5\25\u0182\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u018b\n\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u019a\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01b6\n\30\3\30\3\30\3\30\3\30\7\30"+
		"\u01bc\n\30\f\30\16\30\u01bf\13\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u020b\n\33"+
		"\f\33\16\33\u020e\13\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0217"+
		"\n\33\f\33\16\33\u021a\13\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0222"+
		"\n\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u022a\n\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u0233\n\33\f\33\16\33\u0236\13\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u026a\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\7\33\u02ad\n\33\f\33\16\33\u02b0\13\33\3\34\3\34\3\34"+
		"\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u02bd\n\35\3\36\6\36\u02c0"+
		"\n\36\r\36\16\36\u02c1\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \5 \u02d5\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u02eb\n\"\r\"\16\"\u02ec\3\""+
		"\3\"\3\"\3\"\5\"\u02f3\n\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u02fe\n#\3$\3"+
		"$\3$\3$\3$\6$\u0305\n$\r$\16$\u0306\3$\3$\5$\u030b\n$\3%\3%\3%\3%\3%\3"+
		"%\7%\u0313\n%\f%\16%\u0316\13%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\7%\u0323"+
		"\n%\f%\16%\u0326\13%\3%\3%\3%\3%\3%\3%\3%\7%\u032f\n%\f%\16%\u0332\13"+
		"%\3%\3%\3%\5%\u0337\n%\3%\2\6\f\34.\64&\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\7\6\2\25\25\36\36##--\6\2\35"+
		"\3599;;CC\6\2\b\b\21\22((88\4\2\6\6**\4\2\"\"::\u0384\2V\3\2\2\2\4i\3"+
		"\2\2\2\6v\3\2\2\2\bx\3\2\2\2\n\u00af\3\2\2\2\f\u00f0\3\2\2\2\16\u0101"+
		"\3\2\2\2\20\u010a\3\2\2\2\22\u010c\3\2\2\2\24\u011a\3\2\2\2\26\u011c\3"+
		"\2\2\2\30\u0120\3\2\2\2\32\u0123\3\2\2\2\34\u0133\3\2\2\2\36\u014f\3\2"+
		"\2\2 \u015c\3\2\2\2\"\u016d\3\2\2\2$\u016f\3\2\2\2&\u0174\3\2\2\2(\u018a"+
		"\3\2\2\2*\u018c\3\2\2\2,\u0199\3\2\2\2.\u01b5\3\2\2\2\60\u01c0\3\2\2\2"+
		"\62\u01c4\3\2\2\2\64\u0269\3\2\2\2\66\u02b1\3\2\2\28\u02bc\3\2\2\2:\u02bf"+
		"\3\2\2\2<\u02c7\3\2\2\2>\u02d4\3\2\2\2@\u02d6\3\2\2\2B\u02f2\3\2\2\2D"+
		"\u02fd\3\2\2\2F\u030a\3\2\2\2H\u0336\3\2\2\2JK\7\66\2\2KL\5\2\2\2LM\b"+
		"\2\1\2MW\3\2\2\2NO\5\32\16\2OP\7\66\2\2PQ\5\2\2\2QR\b\2\1\2RW\3\2\2\2"+
		"ST\5\32\16\2TU\b\2\1\2UW\3\2\2\2VJ\3\2\2\2VN\3\2\2\2VS\3\2\2\2W\3\3\2"+
		"\2\2XY\5\30\r\2YZ\b\3\1\2Zj\3\2\2\2[\\\7M\2\2\\j\b\3\1\2]^\7H\2\2^j\b"+
		"\3\1\2_`\7G\2\2`j\b\3\1\2ab\7D\2\2bj\b\3\1\2cd\7O\2\2dj\b\3\1\2ef\7F\2"+
		"\2fj\b\3\1\2gh\7L\2\2hj\b\3\1\2iX\3\2\2\2i[\3\2\2\2i]\3\2\2\2i_\3\2\2"+
		"\2ia\3\2\2\2ic\3\2\2\2ie\3\2\2\2ig\3\2\2\2j\5\3\2\2\2kl\7\62\2\2lm\7N"+
		"\2\2mn\7\63\2\2no\5\34\17\2op\b\4\1\2pw\3\2\2\2qr\7N\2\2rs\7\63\2\2st"+
		"\5\34\17\2tu\b\4\1\2uw\3\2\2\2vk\3\2\2\2vq\3\2\2\2w\7\3\2\2\2xy\7,\2\2"+
		"yz\7N\2\2z{\b\5\1\2{\t\3\2\2\2|}\7\30\2\2}~\7\f\2\2~\177\5F$\2\177\u0080"+
		"\b\6\1\2\u0080\u00b0\3\2\2\2\u0081\u0082\5\"\22\2\u0082\u0083\b\6\1\2"+
		"\u0083\u00b0\3\2\2\2\u0084\u0085\7/\2\2\u0085\u0089\7O\2\2\u0086\u0088"+
		"\5D#\2\u0087\u0086\3\2\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u00b0\b\6"+
		"\1\2\u008d\u008e\7/\2\2\u008e\u008f\7O\2\2\u008f\u0090\7 \2\2\u0090\u0094"+
		"\5\34\17\2\u0091\u0093\5D#\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0097\u0098\b\6\1\2\u0098\u00b0\3\2\2\2\u0099\u009a\7\26\2\2\u009a"+
		"\u009e\5(\25\2\u009b\u009d\5&\24\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a2\b\6\1\2\u00a2\u00b0\3\2\2\2\u00a3\u00a4\7\30"+
		"\2\2\u00a4\u00a5\5\n\6\2\u00a5\u00a6\b\6\1\2\u00a6\u00b0\3\2\2\2\u00a7"+
		"\u00a9\5\"\22\2\u00a8\u00aa\5\66\34\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ae\b\6\1\2\u00ae\u00b0\3\2\2\2\u00af|\3\2\2\2\u00af\u0081\3\2\2\2"+
		"\u00af\u0084\3\2\2\2\u00af\u008d\3\2\2\2\u00af\u0099\3\2\2\2\u00af\u00a3"+
		"\3\2\2\2\u00af\u00a7\3\2\2\2\u00b0\13\3\2\2\2\u00b1\u00b2\b\7\1\2\u00b2"+
		"\u00b3\7O\2\2\u00b3\u00b4\5\f\7\b\u00b4\u00b5\b\7\1\2\u00b5\u00f1\3\2"+
		"\2\2\u00b6\u00b7\7\5\2\2\u00b7\u00b8\7N\2\2\u00b8\u00b9\7\b\2\2\u00b9"+
		"\u00bd\5\f\7\2\u00ba\u00bc\5\62\32\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3"+
		"\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00c0\u00c1\7%\2\2\u00c1\u00c2\b\7\1\2\u00c2\u00f1\3\2"+
		"\2\2\u00c3\u00c4\5\16\b\2\u00c4\u00c5\b\7\1\2\u00c5\u00f1\3\2\2\2\u00c6"+
		"\u00c7\7K\2\2\u00c7\u00f1\b\7\1\2\u00c8\u00c9\7\13\2\2\u00c9\u00ca\5\f"+
		"\7\2\u00ca\u00cb\7@\2\2\u00cb\u00cc\b\7\1\2\u00cc\u00f1\3\2\2\2\u00cd"+
		"\u00ce\7\13\2\2\u00ce\u00cf\5\f\7\2\u00cf\u00d0\7\63\2\2\u00d0\u00d1\5"+
		"\34\17\2\u00d1\u00d2\7@\2\2\u00d2\u00d3\b\7\1\2\u00d3\u00f1\3\2\2\2\u00d4"+
		"\u00d5\5\4\3\2\u00d5\u00d6\b\7\1\2\u00d6\u00f1\3\2\2\2\u00d7\u00d8\7O"+
		"\2\2\u00d8\u00f1\b\7\1\2\u00d9\u00da\7\13\2\2\u00da\u00dc\5\f\7\2\u00db"+
		"\u00dd\5*\26\2\u00dc\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7@\2\2\u00e1"+
		"\u00e2\b\7\1\2\u00e2\u00f1\3\2\2\2\u00e3\u00e4\5\30\r\2\u00e4\u00e5\b"+
		"\7\1\2\u00e5\u00f1\3\2\2\2\u00e6\u00e7\7\64\2\2\u00e7\u00e8\5\24\13\2"+
		"\u00e8\u00e9\7\24\2\2\u00e9\u00ea\b\7\1\2\u00ea\u00f1\3\2\2\2\u00eb\u00ec"+
		"\7\64\2\2\u00ec\u00ed\5\36\20\2\u00ed\u00ee\7\24\2\2\u00ee\u00ef\b\7\1"+
		"\2\u00ef\u00f1\3\2\2\2\u00f0\u00b1\3\2\2\2\u00f0\u00b6\3\2\2\2\u00f0\u00c3"+
		"\3\2\2\2\u00f0\u00c6\3\2\2\2\u00f0\u00c8\3\2\2\2\u00f0\u00cd\3\2\2\2\u00f0"+
		"\u00d4\3\2\2\2\u00f0\u00d7\3\2\2\2\u00f0\u00d9\3\2\2\2\u00f0\u00e3\3\2"+
		"\2\2\u00f0\u00e6\3\2\2\2\u00f0\u00eb\3\2\2\2\u00f1\u00fe\3\2\2\2\u00f2"+
		"\u00f3\f\n\2\2\u00f3\u00f4\7\66\2\2\u00f4\u00f5\5\f\7\13\u00f5\u00f6\b"+
		"\7\1\2\u00f6\u00fd\3\2\2\2\u00f7\u00f8\f\r\2\2\u00f8\u00f9\7\37\2\2\u00f9"+
		"\u00fa\5\16\b\2\u00fa\u00fb\b\7\1\2\u00fb\u00fd\3\2\2\2\u00fc\u00f2\3"+
		"\2\2\2\u00fc\u00f7\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\r\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7N\2\2"+
		"\u0102\u0103\b\b\1\2\u0103\17\3\2\2\2\u0104\u0105\5\64\33\2\u0105\u0106"+
		"\b\t\1\2\u0106\u010b\3\2\2\2\u0107\u0108\5\n\6\2\u0108\u0109\b\t\1\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0104\3\2\2\2\u010a\u0107\3\2\2\2\u010b\21\3\2\2"+
		"\2\u010c\u010d\7\66\2\2\u010d\u010e\7O\2\2\u010e\u010f\7 \2\2\u010f\u0110"+
		"\5\34\17\2\u0110\u0111\b\n\1\2\u0111\23\3\2\2\2\u0112\u0113\5\f\7\2\u0113"+
		"\u0114\b\13\1\2\u0114\u011b\3\2\2\2\u0115\u0116\5\f\7\2\u0116\u0117\7"+
		"\r\2\2\u0117\u0118\5\24\13\2\u0118\u0119\b\13\1\2\u0119\u011b\3\2\2\2"+
		"\u011a\u0112\3\2\2\2\u011a\u0115\3\2\2\2\u011b\25\3\2\2\2\u011c\u011d"+
		"\7\66\2\2\u011d\u011e\7O\2\2\u011e\u011f\b\f\1\2\u011f\27\3\2\2\2\u0120"+
		"\u0121\7I\2\2\u0121\u0122\b\r\1\2\u0122\31\3\2\2\2\u0123\u0124\5\f\7\2"+
		"\u0124\u0125\7\60\2\2\u0125\u0126\5\64\33\2\u0126\u0127\b\16\1\2\u0127"+
		"\33\3\2\2\2\u0128\u0129\b\17\1\2\u0129\u012a\5\b\5\2\u012a\u012b\b\17"+
		"\1\2\u012b\u0134\3\2\2\2\u012c\u012d\7\13\2\2\u012d\u012e\5\34\17\2\u012e"+
		"\u012f\7@\2\2\u012f\u0130\b\17\1\2\u0130\u0134\3\2\2\2\u0131\u0132\7N"+
		"\2\2\u0132\u0134\b\17\1\2\u0133\u0128\3\2\2\2\u0133\u012c\3\2\2\2\u0133"+
		"\u0131\3\2\2\2\u0134\u0144\3\2\2\2\u0135\u0136\f\4\2\2\u0136\u0137\7\60"+
		"\2\2\u0137\u0138\5\34\17\5\u0138\u0139\b\17\1\2\u0139\u0143\3\2\2\2\u013a"+
		"\u013c\f\7\2\2\u013b\u013d\5@!\2\u013c\u013b\3\2\2\2\u013d\u013e\3\2\2"+
		"\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141"+
		"\b\17\1\2\u0141\u0143\3\2\2\2\u0142\u0135\3\2\2\2\u0142\u013a\3\2\2\2"+
		"\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\35"+
		"\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u0148\5\f\7\2\u0148\u0149\7\7\2\2\u0149"+
		"\u014a\5\36\20\2\u014a\u014b\b\20\1\2\u014b\u0150\3\2\2\2\u014c\u014d"+
		"\5\f\7\2\u014d\u014e\b\20\1\2\u014e\u0150\3\2\2\2\u014f\u0147\3\2\2\2"+
		"\u014f\u014c\3\2\2\2\u0150\37\3\2\2\2\u0151\u0152\7\62\2\2\u0152\u0153"+
		"\7N\2\2\u0153\u0154\7\b\2\2\u0154\u0155\5\64\33\2\u0155\u0156\b\21\1\2"+
		"\u0156\u015d\3\2\2\2\u0157\u0158\7N\2\2\u0158\u0159\7\b\2\2\u0159\u015a"+
		"\5\64\33\2\u015a\u015b\b\21\1\2\u015b\u015d\3\2\2\2\u015c\u0151\3\2\2"+
		"\2\u015c\u0157\3\2\2\2\u015d!\3\2\2\2\u015e\u0160\5\16\b\2\u015f\u0161"+
		"\5\f\7\2\u0160\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0160\3\2\2\2\u0162"+
		"\u0163\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\7\b\2\2\u0165\u0166\5\64"+
		"\33\2\u0166\u0167\b\22\1\2\u0167\u016e\3\2\2\2\u0168\u0169\5\f\7\2\u0169"+
		"\u016a\7\b\2\2\u016a\u016b\5\64\33\2\u016b\u016c\b\22\1\2\u016c\u016e"+
		"\3\2\2\2\u016d\u015e\3\2\2\2\u016d\u0168\3\2\2\2\u016e#\3\2\2\2\u016f"+
		"\u0170\5\n\6\2\u0170\u0171\7>\2\2\u0171\u0172\5\64\33\2\u0172\u0173\b"+
		"\23\1\2\u0173%\3\2\2\2\u0174\u0175\7A\2\2\u0175\u0176\5(\25\2\u0176\u0177"+
		"\b\24\1\2\u0177\'\3\2\2\2\u0178\u0181\7\13\2\2\u0179\u017e\5\b\5\2\u017a"+
		"\u017b\7\r\2\2\u017b\u017d\5\b\5\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2"+
		"\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0182\3\2\2\2\u0180"+
		"\u017e\3\2\2\2\u0181\u0179\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0184\7@\2\2\u0184\u0185\5H%\2\u0185\u0186\b\25\1\2\u0186\u018b"+
		"\3\2\2\2\u0187\u0188\5H%\2\u0188\u0189\b\25\1\2\u0189\u018b\3\2\2\2\u018a"+
		"\u0178\3\2\2\2\u018a\u0187\3\2\2\2\u018b)\3\2\2\2\u018c\u018d\7\r\2\2"+
		"\u018d\u018e\5\f\7\2\u018e\u018f\b\26\1\2\u018f+\3\2\2\2\u0190\u0191\5"+
		"\20\t\2\u0191\u0192\7\23\2\2\u0192\u0193\5,\27\2\u0193\u0194\b\27\1\2"+
		"\u0194\u019a\3\2\2\2\u0195\u0196\5\20\t\2\u0196\u0197\7\23\2\2\u0197\u0198"+
		"\b\27\1\2\u0198\u019a\3\2\2\2\u0199\u0190\3\2\2\2\u0199\u0195\3\2\2\2"+
		"\u019a-\3\2\2\2\u019b\u019c\b\30\1\2\u019c\u019d\7\32\2\2\u019d\u019e"+
		"\5\2\2\2\u019e\u019f\b\30\1\2\u019f\u01b6\3\2\2\2\u01a0\u01a1\7\13\2\2"+
		"\u01a1\u01a2\5.\30\2\u01a2\u01a3\7@\2\2\u01a3\u01a4\b\30\1\2\u01a4\u01b6"+
		"\3\2\2\2\u01a5\u01a6\7=\2\2\u01a6\u01a7\5.\30\2\u01a7\u01a8\7?\2\2\u01a8"+
		"\u01a9\b\30\1\2\u01a9\u01b6\3\2\2\2\u01aa\u01ab\5\16\b\2\u01ab\u01ac\b"+
		"\30\1\2\u01ac\u01b6\3\2\2\2\u01ad\u01ae\7\3\2\2\u01ae\u01af\5\32\16\2"+
		"\u01af\u01b0\b\30\1\2\u01b0\u01b6\3\2\2\2\u01b1\u01b2\7\3\2\2\u01b2\u01b3"+
		"\5:\36\2\u01b3\u01b4\b\30\1\2\u01b4\u01b6\3\2\2\2\u01b5\u019b\3\2\2\2"+
		"\u01b5\u01a0\3\2\2\2\u01b5\u01a5\3\2\2\2\u01b5\u01aa\3\2\2\2\u01b5\u01ad"+
		"\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b6\u01bd\3\2\2\2\u01b7\u01b8\f\5\2\2\u01b8"+
		"\u01b9\5\64\33\2\u01b9\u01ba\b\30\1\2\u01ba\u01bc\3\2\2\2\u01bb\u01b7"+
		"\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be"+
		"/\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\7A\2\2\u01c1\u01c2\5B\"\2\u01c2"+
		"\u01c3\b\31\1\2\u01c3\61\3\2\2\2\u01c4\u01c5\7\r\2\2\u01c5\u01c6\7N\2"+
		"\2\u01c6\u01c7\7\b\2\2\u01c7\u01c8\5\f\7\2\u01c8\u01c9\b\32\1\2\u01c9"+
		"\63\3\2\2\2\u01ca\u01cb\b\33\1\2\u01cb\u01cc\7+\2\2\u01cc\u01cd\5\64\33"+
		"\'\u01cd\u01ce\b\33\1\2\u01ce\u026a\3\2\2\2\u01cf\u01d0\7O\2\2\u01d0\u01d1"+
		"\5\64\33\37\u01d1\u01d2\b\33\1\2\u01d2\u026a\3\2\2\2\u01d3\u01d4\7B\2"+
		"\2\u01d4\u01d5\5\64\33\31\u01d5\u01d6\b\33\1\2\u01d6\u026a\3\2\2\2\u01d7"+
		"\u01d8\7;\2\2\u01d8\u01d9\5\64\33\30\u01d9\u01da\b\33\1\2\u01da\u026a"+
		"\3\2\2\2\u01db\u01dc\7C\2\2\u01dc\u01dd\5\64\33\27\u01dd\u01de\b\33\1"+
		"\2\u01de\u026a\3\2\2\2\u01df\u01e0\7&\2\2\u01e0\u01e1\5\64\33\2\u01e1"+
		"\u01e2\7\34\2\2\u01e2\u01e3\5\64\33\2\u01e3\u01e4\7<\2\2\u01e4\u01e5\5"+
		"\64\33\f\u01e5\u01e6\b\33\1\2\u01e6\u026a\3\2\2\2\u01e7\u01e8\7&\2\2\u01e8"+
		"\u01e9\5\64\33\2\u01e9\u01ea\7\34\2\2\u01ea\u01eb\5\64\33\13\u01eb\u01ec"+
		"\b\33\1\2\u01ec\u026a\3\2\2\2\u01ed\u01ee\7J\2\2\u01ee\u026a\b\33\1\2"+
		"\u01ef\u01f0\5\16\b\2\u01f0\u01f1\b\33\1\2\u01f1\u026a\3\2\2\2\u01f2\u01f3"+
		"\5\4\3\2\u01f3\u01f4\b\33\1\2\u01f4\u026a\3\2\2\2\u01f5\u01f6\7\13\2\2"+
		"\u01f6\u01f7\5\64\33\2\u01f7\u01f8\7@\2\2\u01f8\u01f9\b\33\1\2\u01f9\u026a"+
		"\3\2\2\2\u01fa\u01fb\7=\2\2\u01fb\u01fc\5\64\33\2\u01fc\u01fd\7?\2\2\u01fd"+
		"\u01fe\b\33\1\2\u01fe\u026a\3\2\2\2\u01ff\u0200\7\13\2\2\u0200\u0201\5"+
		"\64\33\2\u0201\u0202\7\63\2\2\u0202\u0203\5\34\17\2\u0203\u0204\7@\2\2"+
		"\u0204\u0205\b\33\1\2\u0205\u026a\3\2\2\2\u0206\u0207\7\13\2\2\u0207\u020c"+
		"\5\64\33\2\u0208\u0209\7\r\2\2\u0209\u020b\5\64\33\2\u020a\u0208\3\2\2"+
		"\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020f"+
		"\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0210\7@\2\2\u0210\u0211\b\33\1\2\u0211"+
		"\u026a\3\2\2\2\u0212\u0213\7\64\2\2\u0213\u0218\5\64\33\2\u0214\u0215"+
		"\7\r\2\2\u0215\u0217\5\64\33\2\u0216\u0214\3\2\2\2\u0217\u021a\3\2\2\2"+
		"\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0218"+
		"\3\2\2\2\u021b\u021c\7\24\2\2\u021c\u021d\b\33\1\2\u021d\u026a\3\2\2\2"+
		"\u021e\u021f\7)\2\2\u021f\u0221\5> \2\u0220\u0222\7$\2\2\u0221\u0220\3"+
		"\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\7\27\2\2\u0224"+
		"\u0225\b\33\1\2\u0225\u026a\3\2\2\2\u0226\u0227\7)\2\2\u0227\u0229\5\64"+
		"\33\2\u0228\u022a\7$\2\2\u0229\u0228\3\2\2\2\u0229\u022a\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022c\7\27\2\2\u022c\u022d\b\33\1\2\u022d\u026a\3"+
		"\2\2\2\u022e\u022f\7\5\2\2\u022f\u0234\5 \21\2\u0230\u0231\7\r\2\2\u0231"+
		"\u0233\5 \21\2\u0232\u0230\3\2\2\2\u0233\u0236\3\2\2\2\u0234\u0232\3\2"+
		"\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2\2\2\u0236\u0234\3\2\2\2\u0237"+
		"\u0238\7%\2\2\u0238\u0239\b\33\1\2\u0239\u026a\3\2\2\2\u023a\u023b\7\4"+
		"\2\2\u023b\u023c\5\64\33\2\u023c\u023d\7\n\2\2\u023d\u023e\5\64\33\2\u023e"+
		"\u023f\7\17\2\2\u023f\u0240\b\33\1\2\u0240\u026a\3\2\2\2\u0241\u0242\7"+
		"\t\2\2\u0242\u0243\5\16\b\2\u0243\u0244\7\b\2\2\u0244\u0245\5\64\33\2"+
		"\u0245\u0246\7\33\2\2\u0246\u0247\5\64\33\2\u0247\u0248\7\n\2\2\u0248"+
		"\u0249\5\64\33\2\u0249\u024a\7\17\2\2\u024a\u024b\b\33\1\2\u024b\u026a"+
		"\3\2\2\2\u024c\u024d\7\t\2\2\u024d\u024e\5\16\b\2\u024e\u024f\7\b\2\2"+
		"\u024f\u0250\5\64\33\2\u0250\u0251\7\61\2\2\u0251\u0252\5\64\33\2\u0252"+
		"\u0253\7\n\2\2\u0253\u0254\5\64\33\2\u0254\u0255\7\17\2\2\u0255\u0256"+
		"\b\33\1\2\u0256\u026a\3\2\2\2\u0257\u0258\7\31\2\2\u0258\u0259\5\64\33"+
		"\2\u0259\u025a\7\67\2\2\u025a\u025b\5\2\2\2\u025b\u025c\b\33\1\2\u025c"+
		"\u026a\3\2\2\2\u025d\u025e\5.\30\2\u025e\u025f\b\33\1\2\u025f\u026a\3"+
		"\2\2\2\u0260\u0261\7\'\2\2\u0261\u0262\5\64\33\2\u0262\u0263\7\67\2\2"+
		"\u0263\u0264\5\2\2\2\u0264\u0265\b\33\1\2\u0265\u026a\3\2\2\2\u0266\u0267"+
		"\5$\23\2\u0267\u0268\b\33\1\2\u0268\u026a\3\2\2\2\u0269\u01ca\3\2\2\2"+
		"\u0269\u01cf\3\2\2\2\u0269\u01d3\3\2\2\2\u0269\u01d7\3\2\2\2\u0269\u01db"+
		"\3\2\2\2\u0269\u01df\3\2\2\2\u0269\u01e7\3\2\2\2\u0269\u01ed\3\2\2\2\u0269"+
		"\u01ef\3\2\2\2\u0269\u01f2\3\2\2\2\u0269\u01f5\3\2\2\2\u0269\u01fa\3\2"+
		"\2\2\u0269\u01ff\3\2\2\2\u0269\u0206\3\2\2\2\u0269\u0212\3\2\2\2\u0269"+
		"\u021e\3\2\2\2\u0269\u0226\3\2\2\2\u0269\u022e\3\2\2\2\u0269\u023a\3\2"+
		"\2\2\u0269\u0241\3\2\2\2\u0269\u024c\3\2\2\2\u0269\u0257\3\2\2\2\u0269"+
		"\u025d\3\2\2\2\u0269\u0260\3\2\2\2\u0269\u0266\3\2\2\2\u026a\u02ae\3\2"+
		"\2\2\u026b\u026c\f\36\2\2\u026c\u026d\7\7\2\2\u026d\u026e\5\64\33\36\u026e"+
		"\u026f\b\33\1\2\u026f\u02ad\3\2\2\2\u0270\u0271\f\26\2\2\u0271\u0272\7"+
		"\20\2\2\u0272\u0273\5\64\33\27\u0273\u0274\b\33\1\2\u0274\u02ad\3\2\2"+
		"\2\u0275\u0276\f\25\2\2\u0276\u0277\t\2\2\2\u0277\u0278\5\64\33\26\u0278"+
		"\u0279\b\33\1\2\u0279\u02ad\3\2\2\2\u027a\u027b\f\24\2\2\u027b\u027c\t"+
		"\3\2\2\u027c\u027d\5\64\33\25\u027d\u027e\b\33\1\2\u027e\u02ad\3\2\2\2"+
		"\u027f\u0280\f\23\2\2\u0280\u0281\t\4\2\2\u0281\u0282\5\64\33\24\u0282"+
		"\u0283\b\33\1\2\u0283\u02ad\3\2\2\2\u0284\u0285\f\21\2\2\u0285\u0286\7"+
		".\2\2\u0286\u0287\7N\2\2\u0287\u0288\7\16\2\2\u0288\u0289\5\64\33\22\u0289"+
		"\u028a\b\33\1\2\u028a\u02ad\3\2\2\2\u028b\u028c\f\17\2\2\u028c\u028d\7"+
		"!\2\2\u028d\u028e\5\64\33\2\u028e\u028f\7@\2\2\u028f\u0290\7\16\2\2\u0290"+
		"\u0291\5\64\33\20\u0291\u0292\b\33\1\2\u0292\u02ad\3\2\2\2\u0293\u0294"+
		"\f\16\2\2\u0294\u0295\t\5\2\2\u0295\u0296\5\64\33\17\u0296\u0297\b\33"+
		"\1\2\u0297\u02ad\3\2\2\2\u0298\u0299\f\r\2\2\u0299\u029a\t\6\2\2\u029a"+
		"\u029b\5\64\33\16\u029b\u029c\b\33\1\2\u029c\u02ad\3\2\2\2\u029d\u029e"+
		"\f\7\2\2\u029e\u029f\7$\2\2\u029f\u02a0\5\64\33\7\u02a0\u02a1\b\33\1\2"+
		"\u02a1\u02ad\3\2\2\2\u02a2\u02a3\f\22\2\2\u02a3\u02a4\7.\2\2\u02a4\u02a5"+
		"\7N\2\2\u02a5\u02ad\b\33\1\2\u02a6\u02a7\f\20\2\2\u02a7\u02a8\7!\2\2\u02a8"+
		"\u02a9\5\64\33\2\u02a9\u02aa\7@\2\2\u02aa\u02ab\b\33\1\2\u02ab\u02ad\3"+
		"\2\2\2\u02ac\u026b\3\2\2\2\u02ac\u0270\3\2\2\2\u02ac\u0275\3\2\2\2\u02ac"+
		"\u027a\3\2\2\2\u02ac\u027f\3\2\2\2\u02ac\u0284\3\2\2\2\u02ac\u028b\3\2"+
		"\2\2\u02ac\u0293\3\2\2\2\u02ac\u0298\3\2\2\2\u02ac\u029d\3\2\2\2\u02ac"+
		"\u02a2\3\2\2\2\u02ac\u02a6\3\2\2\2\u02ad\u02b0\3\2\2\2\u02ae\u02ac\3\2"+
		"\2\2\u02ae\u02af\3\2\2\2\u02af\65\3\2\2\2\u02b0\u02ae\3\2\2\2\u02b1\u02b2"+
		"\7A\2\2\u02b2\u02b3\5\"\22\2\u02b3\u02b4\b\34\1\2\u02b4\67\3\2\2\2\u02b5"+
		"\u02b6\7O\2\2\u02b6\u02b7\7 \2\2\u02b7\u02b8\5\34\17\2\u02b8\u02b9\b\35"+
		"\1\2\u02b9\u02bd\3\2\2\2\u02ba\u02bb\7O\2\2\u02bb\u02bd\b\35\1\2\u02bc"+
		"\u02b5\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd9\3\2\2\2\u02be\u02c0\5\f\7\2"+
		"\u02bf\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1\u02c2"+
		"\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\7\60\2\2\u02c4\u02c5\5\64\33"+
		"\2\u02c5\u02c6\b\36\1\2\u02c6;\3\2\2\2\u02c7\u02c8\5,\27\2\u02c8\u02c9"+
		"\b\37\1\2\u02c9=\3\2\2\2\u02ca\u02cb\5\64\33\2\u02cb\u02cc\7$\2\2\u02cc"+
		"\u02cd\5> \2\u02cd\u02ce\b \1\2\u02ce\u02d5\3\2\2\2\u02cf\u02d0\5\64\33"+
		"\2\u02d0\u02d1\7$\2\2\u02d1\u02d2\5\64\33\2\u02d2\u02d3\b \1\2\u02d3\u02d5"+
		"\3\2\2\2\u02d4\u02ca\3\2\2\2\u02d4\u02cf\3\2\2\2\u02d5?\3\2\2\2\u02d6"+
		"\u02d7\7-\2\2\u02d7\u02d8\5\34\17\2\u02d8\u02d9\b!\1\2\u02d9A\3\2\2\2"+
		"\u02da\u02db\5\16\b\2\u02db\u02dc\7\b\2\2\u02dc\u02dd\5\64\33\2\u02dd"+
		"\u02de\b\"\1\2\u02de\u02f3\3\2\2\2\u02df\u02e0\7\13\2\2\u02e0\u02e1\5"+
		"\16\b\2\u02e1\u02e2\7\63\2\2\u02e2\u02e3\5\34\17\2\u02e3\u02e4\7@\2\2"+
		"\u02e4\u02e5\7\b\2\2\u02e5\u02e6\5\64\33\2\u02e6\u02e7\b\"\1\2\u02e7\u02f3"+
		"\3\2\2\2\u02e8\u02ea\5\16\b\2\u02e9\u02eb\5\f\7\2\u02ea\u02e9\3\2\2\2"+
		"\u02eb\u02ec\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee"+
		"\3\2\2\2\u02ee\u02ef\7\b\2\2\u02ef\u02f0\5\64\33\2\u02f0\u02f1\b\"\1\2"+
		"\u02f1\u02f3\3\2\2\2\u02f2\u02da\3\2\2\2\u02f2\u02df\3\2\2\2\u02f2\u02e8"+
		"\3\2\2\2\u02f3C\3\2\2\2\u02f4\u02f5\7A\2\2\u02f5\u02f6\7O\2\2\u02f6\u02fe"+
		"\b#\1\2\u02f7\u02f8\7A\2\2\u02f8\u02f9\7O\2\2\u02f9\u02fa\7 \2\2\u02fa"+
		"\u02fb\5\34\17\2\u02fb\u02fc\b#\1\2\u02fc\u02fe\3\2\2\2\u02fd\u02f4\3"+
		"\2\2\2\u02fd\u02f7\3\2\2\2\u02feE\3\2\2\2\u02ff\u0300\5B\"\2\u0300\u0301"+
		"\b$\1\2\u0301\u030b\3\2\2\2\u0302\u0304\5B\"\2\u0303\u0305\5\60\31\2\u0304"+
		"\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0304\3\2\2\2\u0306\u0307\3\2"+
		"\2\2\u0307\u0308\3\2\2\2\u0308\u0309\b$\1\2\u0309\u030b\3\2\2\2\u030a"+
		"\u02ff\3\2\2\2\u030a\u0302\3\2\2\2\u030bG\3\2\2\2\u030c\u030d\7N\2\2\u030d"+
		"\u030e\7\b\2\2\u030e\u030f\7O\2\2\u030f\u0310\7 \2\2\u0310\u0314\5\34"+
		"\17\2\u0311\u0313\5\22\n\2\u0312\u0311\3\2\2\2\u0313\u0316\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0317\3\2\2\2\u0316\u0314\3\2"+
		"\2\2\u0317\u0318\b%\1\2\u0318\u0337\3\2\2\2\u0319\u031a\7N\2\2\u031a\u031b"+
		"\7\65\2\2\u031b\u031c\5\34\17\2\u031c\u031d\b%\1\2\u031d\u0337\3\2\2\2"+
		"\u031e\u031f\7N\2\2\u031f\u0320\7\b\2\2\u0320\u0324\7O\2\2\u0321\u0323"+
		"\5\26\f\2\u0322\u0321\3\2\2\2\u0323\u0326\3\2\2\2\u0324\u0322\3\2\2\2"+
		"\u0324\u0325\3\2\2\2\u0325\u0327\3\2\2\2\u0326\u0324\3\2\2\2\u0327\u0337"+
		"\b%\1\2\u0328\u0329\5\16\b\2\u0329\u032a\7\b\2\2\u032a\u032b\7\5\2\2\u032b"+
		"\u0330\5\6\4\2\u032c\u032d\7\r\2\2\u032d\u032f\5\6\4\2\u032e\u032c\3\2"+
		"\2\2\u032f\u0332\3\2\2\2\u0330\u032e\3\2\2\2\u0330\u0331\3\2\2\2\u0331"+
		"\u0333\3\2\2\2\u0332\u0330\3\2\2\2\u0333\u0334\7%\2\2\u0334\u0335\b%\1"+
		"\2\u0335\u0337\3\2\2\2\u0336\u030c\3\2\2\2\u0336\u0319\3\2\2\2\u0336\u031e"+
		"\3\2\2\2\u0336\u0328\3\2\2\2\u0337I\3\2\2\2\63Viv\u0089\u0094\u009e\u00ab"+
		"\u00af\u00bd\u00de\u00f0\u00fc\u00fe\u010a\u011a\u0133\u013e\u0142\u0144"+
		"\u014f\u015c\u0162\u016d\u017e\u0181\u018a\u0199\u01b5\u01bd\u020c\u0218"+
		"\u0221\u0229\u0234\u0269\u02ac\u02ae\u02bc\u02c1\u02d4\u02ec\u02f2\u02fd"+
		"\u0306\u030a\u0314\u0324\u0330\u0336";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}