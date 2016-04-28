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
		T__42=1, T__41=2, T__40=3, T__39=4, T__38=5, T__37=6, T__36=7, T__35=8, 
		T__34=9, T__33=10, T__32=11, T__31=12, T__30=13, T__29=14, T__28=15, T__27=16, 
		T__26=17, T__25=18, T__24=19, T__23=20, T__22=21, T__21=22, T__20=23, 
		T__19=24, T__18=25, T__17=26, T__16=27, T__15=28, T__14=29, T__13=30, 
		T__12=31, T__11=32, T__10=33, T__9=34, T__8=35, T__7=36, T__6=37, T__5=38, 
		T__4=39, T__3=40, T__2=41, T__1=42, T__0=43, WS=44, NULLTOKEN=45, EMPTYLISTTOKEN=46, 
		WILDCARDTOKEN=47, BOOLTOKEN=48, NUMTOKEN=49, IDTOKEN=50;
	public static final String[] tokenNames = {
		"<INVALID>", "'as'", "'fun'", "'while'", "'||'", "';'", "'&&'", "'::'", 
		"'='", "'for'", "'if'", "'<='", "'&'", "'print'", "'do'", "'''", "'('", 
		"'*'", "','", "'->'", "'done'", "'to'", "':'", "'>='", "'['", "'<'", "'|'", 
		"'with'", "']'", "'>'", "'or'", "'let'", "'match'", "'else'", "'begin'", 
		"'in'", "'function'", "'end'", "')'", "'downto'", "'and'", "'then'", "'+'", 
		"'not'", "WS", "NULLTOKEN", "EMPTYLISTTOKEN", "'_'", "BOOLTOKEN", "NUMTOKEN", 
		"IDTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_optionalpattremainder = 1, RULE_constant = 2, 
		RULE_pattmatchcurried = 3, RULE_decl = 4, RULE_headtaillistexp = 5, RULE_patt = 6, 
		RULE_ident = 7, RULE_pattlist = 8, RULE_emptylist = 9, RULE_pattmatchmultiple = 10, 
		RULE_pattmatchsingle = 11, RULE_explist = 12, RULE_type = 13, RULE_prog = 14, 
		RULE_headtaillistpatt = 15, RULE_exptuple = 16, RULE_declmono = 17, RULE_letExp = 18, 
		RULE_patttuple = 19, RULE_function = 20, RULE_exp = 21;
	public static final String[] ruleNames = {
		"pattmatch", "optionalpattremainder", "constant", "pattmatchcurried", 
		"decl", "headtaillistexp", "patt", "ident", "pattlist", "emptylist", "pattmatchmultiple", 
		"pattmatchsingle", "explist", "type", "prog", "headtaillistpatt", "exptuple", 
		"declmono", "letExp", "patttuple", "function", "exp"
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
		public PattmatchmultipleContext pattmatchmultiple_0;
		public PattmatchmultipleContext pattmatchmultiple() {
			return getRuleContext(PattmatchmultipleContext.class,0);
		}
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
			setState(54);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); match(26);
				setState(45); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch1((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51); ((PattmatchContext)_localctx).pattmatchmultiple_0 = pattmatchmultiple();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch2((((PattmatchContext)_localctx).pattmatchmultiple_0._pattmatchmultiple));
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

	public static class OptionalpattremainderContext extends ParserRuleContext {
		public Object _optionalpattremainder;
		public PattContext patt_0;
		public OptionalpattremainderContext optionalpattremainder_1;
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public OptionalpattremainderContext optionalpattremainder() {
			return getRuleContext(OptionalpattremainderContext.class,0);
		}
		public OptionalpattremainderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalpattremainder; }
	}

	public final OptionalpattremainderContext optionalpattremainder() throws RecognitionException {
		OptionalpattremainderContext _localctx = new OptionalpattremainderContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_optionalpattremainder);
		try {
			setState(64);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56); ((OptionalpattremainderContext)_localctx).patt_0 = patt(0);
				((OptionalpattremainderContext)_localctx)._optionalpattremainder =  builder.optionalPattRemainderSingle((((OptionalpattremainderContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); ((OptionalpattremainderContext)_localctx).patt_0 = patt(0);
				setState(60); match(26);
				setState(61); ((OptionalpattremainderContext)_localctx).optionalpattremainder_1 = optionalpattremainder();
				((OptionalpattremainderContext)_localctx)._optionalpattremainder =  builder.optionalPattRemainderMulti((((OptionalpattremainderContext)_localctx).patt_0._patt),(((OptionalpattremainderContext)_localctx).optionalpattremainder_1._optionalpattremainder));
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
		public Token NUMTOKEN_0;
		public Token BOOLTOKEN_0;
		public Token NULLTOKEN_0;
		public EmptylistContext emptylist_0;
		public TerminalNode NULLTOKEN() { return getToken(CLParser.NULLTOKEN, 0); }
		public TerminalNode BOOLTOKEN() { return getToken(CLParser.BOOLTOKEN, 0); }
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public TerminalNode NUMTOKEN() { return getToken(CLParser.NUMTOKEN, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constant);
		try {
			setState(75);
			switch (_input.LA(1)) {
			case NUMTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); ((ConstantContext)_localctx).NUMTOKEN_0 = match(NUMTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(numtoken((((ConstantContext)_localctx).NUMTOKEN_0!=null?((ConstantContext)_localctx).NUMTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(70); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(72); ((ConstantContext)_localctx).emptylist_0 = emptylist();
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
		enterRule(_localctx, 6, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(77); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 24) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN))) != 0) );
			setState(82); match(19);
			setState(83); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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

	public static class DeclContext extends ParserRuleContext {
		public Object _decl;
		public DeclmonoContext declmono_0;
		public DeclContext decl_0;
		public DeclContext decl_1;
		public DeclmonoContext declmono() {
			return getRuleContext(DeclmonoContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_decl);
		try {
			setState(98);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); match(31);
				setState(90); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(94); match(40);
				setState(95); ((DeclContext)_localctx).decl_1 = decl();
				((DeclContext)_localctx)._decl =  builder.andDecl((((DeclContext)_localctx).declmono_0._declmono),(((DeclContext)_localctx).decl_1._decl));
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

	public static class HeadtaillistexpContext extends ParserRuleContext {
		public Object _headtaillistexp;
		public ExpContext exp_0;
		public HeadtaillistexpContext headtaillistexp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public HeadtaillistexpContext headtaillistexp() {
			return getRuleContext(HeadtaillistexpContext.class,0);
		}
		public HeadtaillistexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_headtaillistexp; }
	}

	public final HeadtaillistexpContext headtaillistexp() throws RecognitionException {
		HeadtaillistexpContext _localctx = new HeadtaillistexpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_headtaillistexp);
		try {
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100); ((HeadtaillistexpContext)_localctx).exp_0 = exp(0);
				setState(101); match(7);
				setState(102); ((HeadtaillistexpContext)_localctx).headtaillistexp_1 = headtaillistexp();
				((HeadtaillistexpContext)_localctx)._headtaillistexp =  builder.headTailListExpMulti((((HeadtaillistexpContext)_localctx).exp_0._exp),(((HeadtaillistexpContext)_localctx).headtaillistexp_1._headtaillistexp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105); ((HeadtaillistexpContext)_localctx).exp_0 = exp(0);
				((HeadtaillistexpContext)_localctx)._headtaillistexp =  builder.headTailListExpSingle((((HeadtaillistexpContext)_localctx).exp_0._exp));
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
		public HeadtaillistpattContext headtaillistpatt_0;
		public EmptylistContext emptylist_0;
		public PattlistContext pattlist_0;
		public PatttupleContext patttuple;
		public List<PatttupleContext> patttuple_1_list = new ArrayList<PatttupleContext>();
		public Token WILDCARDTOKEN_0;
		public ConstantContext constant_0;
		public IdentContext ident_0;
		public TypeContext type_1;
		public OptionalpattremainderContext optionalpattremainder_0;
		public IdentContext ident_1;
		public PatttupleContext patttuple(int i) {
			return getRuleContext(PatttupleContext.class,i);
		}
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
		public TerminalNode WILDCARDTOKEN() { return getToken(CLParser.WILDCARDTOKEN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public OptionalpattremainderContext optionalpattremainder() {
			return getRuleContext(OptionalpattremainderContext.class,0);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_patt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(111); match(24);
				setState(112); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(113); match(28);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;

			case 2:
				{
				setState(116); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 3:
				{
				setState(119); match(24);
				setState(120); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(121); match(28);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 4:
				{
				setState(124); match(24);
				setState(125); ((PattContext)_localctx).patt_0 = patt(0);
				setState(126); match(28);
				((PattContext)_localctx)._patt =  builder.singleElementListPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 5:
				{
				setState(129); match(16);
				setState(130); ((PattContext)_localctx).patt_0 = patt(0);
				setState(132); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(131); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(134); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==18 );
				setState(136); match(38);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 6:
				{
				setState(139); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 7:
				{
				setState(141); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 8:
				{
				setState(144); match(16);
				setState(145); ((PattContext)_localctx).patt_0 = patt(0);
				setState(146); match(38);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 9:
				{
				setState(149); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 10:
				{
				setState(152); match(16);
				setState(153); ((PattContext)_localctx).patt_0 = patt(0);
				setState(154); match(22);
				setState(155); ((PattContext)_localctx).type_1 = type(0);
				setState(156); match(38);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 11:
				{
				setState(159); match(16);
				setState(160); ((PattContext)_localctx).optionalpattremainder_0 = optionalpattremainder();
				setState(161); match(38);
				((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).optionalpattremainder_0._optionalpattremainder));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PattContext(_parentctx, _parentState);
					_localctx.patt_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_patt);
					setState(166);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(167); match(1);
					setState(168); ((PattContext)_localctx).ident_1 = ident();
					((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
					}
					} 
				}
				setState(175);
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
		enterRule(_localctx, 14, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
			setState(187);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(180); match(5);
				setState(181); ((PattlistContext)_localctx).pattlist_1 = pattlist();
				((PattlistContext)_localctx)._pattlist =  builder.pattListMulti((((PattlistContext)_localctx).patt_0._patt),(((PattlistContext)_localctx).pattlist_1._pattlist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); ((PattlistContext)_localctx).patt_0 = patt(0);
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
			setState(189); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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

	public static class PattmatchmultipleContext extends ParserRuleContext {
		public Object _pattmatchmultiple;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchContext pattmatch_1;
		public PattmatchsingleContext pattmatchsingle() {
			return getRuleContext(PattmatchsingleContext.class,0);
		}
		public PattmatchContext pattmatch() {
			return getRuleContext(PattmatchContext.class,0);
		}
		public PattmatchmultipleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattmatchmultiple; }
	}

	public final PattmatchmultipleContext pattmatchmultiple() throws RecognitionException {
		PattmatchmultipleContext _localctx = new PattmatchmultipleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pattmatchmultiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192); ((PattmatchmultipleContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
			setState(193); match(26);
			setState(194); ((PattmatchmultipleContext)_localctx).pattmatch_1 = pattmatch();
			((PattmatchmultipleContext)_localctx)._pattmatchmultiple =  builder.pattMatchMulti((((PattmatchmultipleContext)_localctx).pattmatchsingle_0._pattmatchsingle),(((PattmatchmultipleContext)_localctx).pattmatch_1._pattmatch));
			}
		}
		catch (RecognitionException re) {
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
			setState(197); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(198); match(19);
			setState(199); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 24, RULE_explist);
		try {
			setState(212);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(203); match(5);
				setState(204); ((ExplistContext)_localctx).explist_1 = explist();
				((ExplistContext)_localctx)._explist =  builder.expListMulti((((ExplistContext)_localctx).exp_0._exp),(((ExplistContext)_localctx).explist_1._explist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(208); match(5);
				setState(209); ((ExplistContext)_localctx).exp_1 = exp(0);
				((ExplistContext)_localctx)._explist =  builder.expListDouble((((ExplistContext)_localctx).exp_0._exp),(((ExplistContext)_localctx).exp_1._exp));
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
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
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
			setState(225);
			switch (_input.LA(1)) {
			case 15:
				{
				setState(215); match(15);
				setState(216); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.varType(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			case 16:
				{
				setState(218); match(16);
				setState(219); ((TypeContext)_localctx).type_0 = type(0);
				setState(220); match(38);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;
			case IDTOKEN:
				{
				setState(223); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(234);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					_localctx.type_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(227);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(228); match(19);
					setState(229); ((TypeContext)_localctx).type_1 = type(4);
					((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
					}
					} 
				}
				setState(236);
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

	public static class ProgContext extends ParserRuleContext {
		public Object _prog;
		public ExpContext exp_0;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); ((ProgContext)_localctx).exp_0 = exp(0);
			((ProgContext)_localctx)._prog =  builder.start((((ProgContext)_localctx).exp_0._exp));
			}
		}
		catch (RecognitionException re) {
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
			setState(248);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(240); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattSingle((((HeadtaillistpattContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(244); match(7);
				setState(245); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
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
		enterRule(_localctx, 32, RULE_exptuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(18);
			setState(251); ((ExptupleContext)_localctx).exp_0 = exp(0);
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
			setState(269);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(254); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(255); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(258); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 24) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN))) != 0) );
				setState(260); match(8);
				setState(261); ((DeclmonoContext)_localctx).exp_2 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMonoFunc((((DeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((DeclmonoContext)_localctx).patt_1_list),(((DeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(265); match(8);
				setState(266); ((DeclmonoContext)_localctx).exp_1 = exp(0);
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
			setState(271); ((LetExpContext)_localctx).decl_0 = decl();
			setState(272); match(35);
			setState(273); ((LetExpContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 38, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276); match(18);
			setState(277); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(281); match(36);
				setState(282); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(285); match(34);
				setState(286); ((FunctionContext)_localctx).function_0 = function(0);
				setState(287); match(37);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(290); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(293); match(16);
				setState(294); ((FunctionContext)_localctx).function_0 = function(0);
				setState(295); match(38);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(298); match(2);
				setState(299); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(302); match(2);
				setState(303); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(314);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(308);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(309); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(316);
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

	public static class ExpContext extends ParserRuleContext {
		public Object _exp;
		public ExpContext exp_0;
		public ExpContext exp_1;
		public ExpContext exp_2;
		public IdentContext ident_0;
		public ConstantContext constant_0;
		public TypeContext type_1;
		public ExptupleContext exptuple;
		public List<ExptupleContext> exptuple_1_list = new ArrayList<ExptupleContext>();
		public ExplistContext explist_0;
		public HeadtaillistexpContext headtaillistexp_0;
		public ExpContext exp_3;
		public PattmatchContext pattmatch_1;
		public FunctionContext function_0;
		public LetExpContext letExp_0;
		public Token op_1508;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExptupleContext exptuple(int i) {
			return getRuleContext(ExptupleContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public LetExpContext letExp() {
			return getRuleContext(LetExpContext.class,0);
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
		public List<ExptupleContext> exptuple() {
			return getRuleContexts(ExptupleContext.class);
		}
		public HeadtaillistexpContext headtaillistexp() {
			return getRuleContext(HeadtaillistexpContext.class,0);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(318); match(13);
				setState(319); ((ExpContext)_localctx).exp_0 = exp(25);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(322); match(43);
				setState(323); ((ExpContext)_localctx).exp_0 = exp(15);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 3:
				{
				setState(326); match(10);
				setState(327); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(328); match(41);
				setState(329); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(330); match(33);
				setState(331); ((ExpContext)_localctx).exp_2 = exp(9);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 4:
				{
				setState(334); match(10);
				setState(335); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(336); match(41);
				setState(337); ((ExpContext)_localctx).exp_1 = exp(8);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 5:
				{
				setState(340); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 6:
				{
				setState(343); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 7:
				{
				setState(346); match(16);
				setState(347); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(348); match(38);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 8:
				{
				setState(351); match(34);
				setState(352); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(353); match(37);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 9:
				{
				setState(356); match(16);
				setState(357); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(358); match(22);
				setState(359); ((ExpContext)_localctx).type_1 = type(0);
				setState(360); match(38);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 10:
				{
				setState(363); match(16);
				setState(364); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(365); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(368); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==18 );
				setState(370); match(38);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;

			case 11:
				{
				setState(373); match(24);
				setState(374); ((ExpContext)_localctx).explist_0 = explist();
				setState(375); match(28);
				((ExpContext)_localctx)._exp =  builder.expList((((ExpContext)_localctx).explist_0._explist));
				}
				break;

			case 12:
				{
				setState(378); match(24);
				setState(379); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(380); match(28);
				((ExpContext)_localctx)._exp =  builder.singleElementListExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(383); match(24);
				setState(384); ((ExpContext)_localctx).headtaillistexp_0 = headtaillistexp();
				setState(385); match(28);
				((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).headtaillistexp_0._headtaillistexp));
				}
				break;

			case 14:
				{
				setState(388); match(3);
				setState(389); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(390); match(14);
				setState(391); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(392); match(20);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 15:
				{
				setState(395); match(9);
				setState(396); ((ExpContext)_localctx).ident_0 = ident();
				setState(397); match(8);
				setState(398); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(399); match(39);
				setState(400); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(401); match(14);
				setState(402); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(403); match(20);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 16:
				{
				setState(406); match(9);
				setState(407); ((ExpContext)_localctx).ident_0 = ident();
				setState(408); match(8);
				setState(409); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(410); match(21);
				setState(411); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(412); match(14);
				setState(413); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(414); match(20);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 17:
				{
				setState(417); match(32);
				setState(418); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(419); match(27);
				setState(420); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 18:
				{
				setState(423); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 19:
				{
				setState(426); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(461);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(431);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(432); match(17);
						setState(433); ((ExpContext)_localctx).exp_1 = exp(15);
						((ExpContext)_localctx)._exp =  builder.intMultiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(436);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(437); match(42);
						setState(438); ((ExpContext)_localctx).exp_1 = exp(14);
						((ExpContext)_localctx)._exp =  builder.intAdd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(441);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(442);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 23) | (1L << 25) | (1L << 29))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(443); ((ExpContext)_localctx).exp_1 = exp(13);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(446);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(447);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==12) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(448); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(451);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(452);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==30) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(453); ((ExpContext)_localctx).exp_1 = exp(11);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(456);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(457); match(5);
						setState(458); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(465);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6: return patt_sempred((PattContext)_localctx, predIndex);

		case 13: return type_sempred((TypeContext)_localctx, predIndex);

		case 20: return function_sempred((FunctionContext)_localctx, predIndex);

		case 21: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean patt_sempred(PattContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 14);

		case 4: return precpred(_ctx, 13);

		case 5: return precpred(_ctx, 12);

		case 6: return precpred(_ctx, 11);

		case 7: return precpred(_ctx, 10);

		case 8: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u01d5\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\29\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3C\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\5\6\5Q\n\5\r\5\16\5R\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6e\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u0087"+
		"\n\b\r\b\16\b\u0088\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a7"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\7\b\u00ae\n\b\f\b\16\b\u00b1\13\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00be\n\n\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00d7\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\5\17\u00e4\n\17\3\17\3\17\3\17\3\17\3\17\7\17\u00eb\n"+
		"\17\f\17\16\17\u00ee\13\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00fb\n\21\3\22\3\22\3\22\3\22\3\23\3\23\6\23\u0103\n"+
		"\23\r\23\16\23\u0104\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0110\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0135\n\26\3\26\3\26"+
		"\3\26\3\26\7\26\u013b\n\26\f\26\16\26\u013e\13\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\6\27\u0171\n\27\r\27\16\27\u0172\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01b0"+
		"\n\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\7\27\u01d0\n\27\f\27\16\27\u01d3\13\27\3\27\2\6\16\34"+
		"*,\30\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\5\7\2\n\n\r\r\31"+
		"\31\33\33\37\37\4\2\b\b\16\16\4\2\6\6  \u01fb\28\3\2\2\2\4B\3\2\2\2\6"+
		"M\3\2\2\2\bP\3\2\2\2\nd\3\2\2\2\fn\3\2\2\2\16\u00a6\3\2\2\2\20\u00b2\3"+
		"\2\2\2\22\u00bd\3\2\2\2\24\u00bf\3\2\2\2\26\u00c2\3\2\2\2\30\u00c7\3\2"+
		"\2\2\32\u00d6\3\2\2\2\34\u00e3\3\2\2\2\36\u00ef\3\2\2\2 \u00fa\3\2\2\2"+
		"\"\u00fc\3\2\2\2$\u010f\3\2\2\2&\u0111\3\2\2\2(\u0116\3\2\2\2*\u0134\3"+
		"\2\2\2,\u01af\3\2\2\2./\7\34\2\2/\60\5\2\2\2\60\61\b\2\1\2\619\3\2\2\2"+
		"\62\63\5\30\r\2\63\64\b\2\1\2\649\3\2\2\2\65\66\5\26\f\2\66\67\b\2\1\2"+
		"\679\3\2\2\28.\3\2\2\28\62\3\2\2\28\65\3\2\2\29\3\3\2\2\2:;\5\16\b\2;"+
		"<\b\3\1\2<C\3\2\2\2=>\5\16\b\2>?\7\34\2\2?@\5\4\3\2@A\b\3\1\2AC\3\2\2"+
		"\2B:\3\2\2\2B=\3\2\2\2C\5\3\2\2\2DE\7\63\2\2EN\b\4\1\2FG\7\62\2\2GN\b"+
		"\4\1\2HI\7/\2\2IN\b\4\1\2JK\5\24\13\2KL\b\4\1\2LN\3\2\2\2MD\3\2\2\2MF"+
		"\3\2\2\2MH\3\2\2\2MJ\3\2\2\2N\7\3\2\2\2OQ\5\16\b\2PO\3\2\2\2QR\3\2\2\2"+
		"RP\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\25\2\2UV\5,\27\2VW\b\5\1\2W\t\3\2\2"+
		"\2XY\5$\23\2YZ\b\6\1\2Ze\3\2\2\2[\\\7!\2\2\\]\5\n\6\2]^\b\6\1\2^e\3\2"+
		"\2\2_`\5$\23\2`a\7*\2\2ab\5\n\6\2bc\b\6\1\2ce\3\2\2\2dX\3\2\2\2d[\3\2"+
		"\2\2d_\3\2\2\2e\13\3\2\2\2fg\5,\27\2gh\7\t\2\2hi\5\f\7\2ij\b\7\1\2jo\3"+
		"\2\2\2kl\5,\27\2lm\b\7\1\2mo\3\2\2\2nf\3\2\2\2nk\3\2\2\2o\r\3\2\2\2pq"+
		"\b\b\1\2qr\7\32\2\2rs\5 \21\2st\7\36\2\2tu\b\b\1\2u\u00a7\3\2\2\2vw\5"+
		"\24\13\2wx\b\b\1\2x\u00a7\3\2\2\2yz\7\32\2\2z{\5\22\n\2{|\7\36\2\2|}\b"+
		"\b\1\2}\u00a7\3\2\2\2~\177\7\32\2\2\177\u0080\5\16\b\2\u0080\u0081\7\36"+
		"\2\2\u0081\u0082\b\b\1\2\u0082\u00a7\3\2\2\2\u0083\u0084\7\22\2\2\u0084"+
		"\u0086\5\16\b\2\u0085\u0087\5(\25\2\u0086\u0085\3\2\2\2\u0087\u0088\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\7(\2\2\u008b\u008c\b\b\1\2\u008c\u00a7\3\2\2\2\u008d\u008e\7\61"+
		"\2\2\u008e\u00a7\b\b\1\2\u008f\u0090\5\6\4\2\u0090\u0091\b\b\1\2\u0091"+
		"\u00a7\3\2\2\2\u0092\u0093\7\22\2\2\u0093\u0094\5\16\b\2\u0094\u0095\7"+
		"(\2\2\u0095\u0096\b\b\1\2\u0096\u00a7\3\2\2\2\u0097\u0098\5\20\t\2\u0098"+
		"\u0099\b\b\1\2\u0099\u00a7\3\2\2\2\u009a\u009b\7\22\2\2\u009b\u009c\5"+
		"\16\b\2\u009c\u009d\7\30\2\2\u009d\u009e\5\34\17\2\u009e\u009f\7(\2\2"+
		"\u009f\u00a0\b\b\1\2\u00a0\u00a7\3\2\2\2\u00a1\u00a2\7\22\2\2\u00a2\u00a3"+
		"\5\4\3\2\u00a3\u00a4\7(\2\2\u00a4\u00a5\b\b\1\2\u00a5\u00a7\3\2\2\2\u00a6"+
		"p\3\2\2\2\u00a6v\3\2\2\2\u00a6y\3\2\2\2\u00a6~\3\2\2\2\u00a6\u0083\3\2"+
		"\2\2\u00a6\u008d\3\2\2\2\u00a6\u008f\3\2\2\2\u00a6\u0092\3\2\2\2\u00a6"+
		"\u0097\3\2\2\2\u00a6\u009a\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a7\u00af\3\2"+
		"\2\2\u00a8\u00a9\f\4\2\2\u00a9\u00aa\7\3\2\2\u00aa\u00ab\5\20\t\2\u00ab"+
		"\u00ac\b\b\1\2\u00ac\u00ae\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\17\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b2\u00b3\7\64\2\2\u00b3\u00b4\b\t\1\2\u00b4\21\3\2\2\2\u00b5"+
		"\u00b6\5\16\b\2\u00b6\u00b7\7\7\2\2\u00b7\u00b8\5\22\n\2\u00b8\u00b9\b"+
		"\n\1\2\u00b9\u00be\3\2\2\2\u00ba\u00bb\5\16\b\2\u00bb\u00bc\b\n\1\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\23\3\2\2"+
		"\2\u00bf\u00c0\7\60\2\2\u00c0\u00c1\b\13\1\2\u00c1\25\3\2\2\2\u00c2\u00c3"+
		"\5\30\r\2\u00c3\u00c4\7\34\2\2\u00c4\u00c5\5\2\2\2\u00c5\u00c6\b\f\1\2"+
		"\u00c6\27\3\2\2\2\u00c7\u00c8\5\16\b\2\u00c8\u00c9\7\25\2\2\u00c9\u00ca"+
		"\5,\27\2\u00ca\u00cb\b\r\1\2\u00cb\31\3\2\2\2\u00cc\u00cd\5,\27\2\u00cd"+
		"\u00ce\7\7\2\2\u00ce\u00cf\5\32\16\2\u00cf\u00d0\b\16\1\2\u00d0\u00d7"+
		"\3\2\2\2\u00d1\u00d2\5,\27\2\u00d2\u00d3\7\7\2\2\u00d3\u00d4\5,\27\2\u00d4"+
		"\u00d5\b\16\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00cc\3\2\2\2\u00d6\u00d1\3"+
		"\2\2\2\u00d7\33\3\2\2\2\u00d8\u00d9\b\17\1\2\u00d9\u00da\7\21\2\2\u00da"+
		"\u00db\7\64\2\2\u00db\u00e4\b\17\1\2\u00dc\u00dd\7\22\2\2\u00dd\u00de"+
		"\5\34\17\2\u00de\u00df\7(\2\2\u00df\u00e0\b\17\1\2\u00e0\u00e4\3\2\2\2"+
		"\u00e1\u00e2\7\64\2\2\u00e2\u00e4\b\17\1\2\u00e3\u00d8\3\2\2\2\u00e3\u00dc"+
		"\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00ec\3\2\2\2\u00e5\u00e6\f\5\2\2\u00e6"+
		"\u00e7\7\25\2\2\u00e7\u00e8\5\34\17\6\u00e8\u00e9\b\17\1\2\u00e9\u00eb"+
		"\3\2\2\2\u00ea\u00e5\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\35\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\5,\27"+
		"\2\u00f0\u00f1\b\20\1\2\u00f1\37\3\2\2\2\u00f2\u00f3\5\16\b\2\u00f3\u00f4"+
		"\b\21\1\2\u00f4\u00fb\3\2\2\2\u00f5\u00f6\5\16\b\2\u00f6\u00f7\7\t\2\2"+
		"\u00f7\u00f8\5 \21\2\u00f8\u00f9\b\21\1\2\u00f9\u00fb\3\2\2\2\u00fa\u00f2"+
		"\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb!\3\2\2\2\u00fc\u00fd\7\24\2\2\u00fd"+
		"\u00fe\5,\27\2\u00fe\u00ff\b\22\1\2\u00ff#\3\2\2\2\u0100\u0102\5\20\t"+
		"\2\u0101\u0103\5\16\b\2\u0102\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0107\7\n"+
		"\2\2\u0107\u0108\5,\27\2\u0108\u0109\b\23\1\2\u0109\u0110\3\2\2\2\u010a"+
		"\u010b\5\16\b\2\u010b\u010c\7\n\2\2\u010c\u010d\5,\27\2\u010d\u010e\b"+
		"\23\1\2\u010e\u0110\3\2\2\2\u010f\u0100\3\2\2\2\u010f\u010a\3\2\2\2\u0110"+
		"%\3\2\2\2\u0111\u0112\5\n\6\2\u0112\u0113\7%\2\2\u0113\u0114\5,\27\2\u0114"+
		"\u0115\b\24\1\2\u0115\'\3\2\2\2\u0116\u0117\7\24\2\2\u0117\u0118\5\16"+
		"\b\2\u0118\u0119\b\25\1\2\u0119)\3\2\2\2\u011a\u011b\b\26\1\2\u011b\u011c"+
		"\7&\2\2\u011c\u011d\5\2\2\2\u011d\u011e\b\26\1\2\u011e\u0135\3\2\2\2\u011f"+
		"\u0120\7$\2\2\u0120\u0121\5*\26\2\u0121\u0122\7\'\2\2\u0122\u0123\b\26"+
		"\1\2\u0123\u0135\3\2\2\2\u0124\u0125\5\20\t\2\u0125\u0126\b\26\1\2\u0126"+
		"\u0135\3\2\2\2\u0127\u0128\7\22\2\2\u0128\u0129\5*\26\2\u0129\u012a\7"+
		"(\2\2\u012a\u012b\b\26\1\2\u012b\u0135\3\2\2\2\u012c\u012d\7\4\2\2\u012d"+
		"\u012e\5\30\r\2\u012e\u012f\b\26\1\2\u012f\u0135\3\2\2\2\u0130\u0131\7"+
		"\4\2\2\u0131\u0132\5\b\5\2\u0132\u0133\b\26\1\2\u0133\u0135\3\2\2\2\u0134"+
		"\u011a\3\2\2\2\u0134\u011f\3\2\2\2\u0134\u0124\3\2\2\2\u0134\u0127\3\2"+
		"\2\2\u0134\u012c\3\2\2\2\u0134\u0130\3\2\2\2\u0135\u013c\3\2\2\2\u0136"+
		"\u0137\f\7\2\2\u0137\u0138\5,\27\2\u0138\u0139\b\26\1\2\u0139\u013b\3"+
		"\2\2\2\u013a\u0136\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d+\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\b\27\1\2"+
		"\u0140\u0141\7\17\2\2\u0141\u0142\5,\27\33\u0142\u0143\b\27\1\2\u0143"+
		"\u01b0\3\2\2\2\u0144\u0145\7-\2\2\u0145\u0146\5,\27\21\u0146\u0147\b\27"+
		"\1\2\u0147\u01b0\3\2\2\2\u0148\u0149\7\f\2\2\u0149\u014a\5,\27\2\u014a"+
		"\u014b\7+\2\2\u014b\u014c\5,\27\2\u014c\u014d\7#\2\2\u014d\u014e\5,\27"+
		"\13\u014e\u014f\b\27\1\2\u014f\u01b0\3\2\2\2\u0150\u0151\7\f\2\2\u0151"+
		"\u0152\5,\27\2\u0152\u0153\7+\2\2\u0153\u0154\5,\27\n\u0154\u0155\b\27"+
		"\1\2\u0155\u01b0\3\2\2\2\u0156\u0157\5\20\t\2\u0157\u0158\b\27\1\2\u0158"+
		"\u01b0\3\2\2\2\u0159\u015a\5\6\4\2\u015a\u015b\b\27\1\2\u015b\u01b0\3"+
		"\2\2\2\u015c\u015d\7\22\2\2\u015d\u015e\5,\27\2\u015e\u015f\7(\2\2\u015f"+
		"\u0160\b\27\1\2\u0160\u01b0\3\2\2\2\u0161\u0162\7$\2\2\u0162\u0163\5,"+
		"\27\2\u0163\u0164\7\'\2\2\u0164\u0165\b\27\1\2\u0165\u01b0\3\2\2\2\u0166"+
		"\u0167\7\22\2\2\u0167\u0168\5,\27\2\u0168\u0169\7\30\2\2\u0169\u016a\5"+
		"\34\17\2\u016a\u016b\7(\2\2\u016b\u016c\b\27\1\2\u016c\u01b0\3\2\2\2\u016d"+
		"\u016e\7\22\2\2\u016e\u0170\5,\27\2\u016f\u0171\5\"\22\2\u0170\u016f\3"+
		"\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\7(\2\2\u0175\u0176\b\27\1\2\u0176\u01b0\3\2"+
		"\2\2\u0177\u0178\7\32\2\2\u0178\u0179\5\32\16\2\u0179\u017a\7\36\2\2\u017a"+
		"\u017b\b\27\1\2\u017b\u01b0\3\2\2\2\u017c\u017d\7\32\2\2\u017d\u017e\5"+
		",\27\2\u017e\u017f\7\36\2\2\u017f\u0180\b\27\1\2\u0180\u01b0\3\2\2\2\u0181"+
		"\u0182\7\32\2\2\u0182\u0183\5\f\7\2\u0183\u0184\7\36\2\2\u0184\u0185\b"+
		"\27\1\2\u0185\u01b0\3\2\2\2\u0186\u0187\7\5\2\2\u0187\u0188\5,\27\2\u0188"+
		"\u0189\7\20\2\2\u0189\u018a\5,\27\2\u018a\u018b\7\26\2\2\u018b\u018c\b"+
		"\27\1\2\u018c\u01b0\3\2\2\2\u018d\u018e\7\13\2\2\u018e\u018f\5\20\t\2"+
		"\u018f\u0190\7\n\2\2\u0190\u0191\5,\27\2\u0191\u0192\7)\2\2\u0192\u0193"+
		"\5,\27\2\u0193\u0194\7\20\2\2\u0194\u0195\5,\27\2\u0195\u0196\7\26\2\2"+
		"\u0196\u0197\b\27\1\2\u0197\u01b0\3\2\2\2\u0198\u0199\7\13\2\2\u0199\u019a"+
		"\5\20\t\2\u019a\u019b\7\n\2\2\u019b\u019c\5,\27\2\u019c\u019d\7\27\2\2"+
		"\u019d\u019e\5,\27\2\u019e\u019f\7\20\2\2\u019f\u01a0\5,\27\2\u01a0\u01a1"+
		"\7\26\2\2\u01a1\u01a2\b\27\1\2\u01a2\u01b0\3\2\2\2\u01a3\u01a4\7\"\2\2"+
		"\u01a4\u01a5\5,\27\2\u01a5\u01a6\7\35\2\2\u01a6\u01a7\5\2\2\2\u01a7\u01a8"+
		"\b\27\1\2\u01a8\u01b0\3\2\2\2\u01a9\u01aa\5*\26\2\u01aa\u01ab\b\27\1\2"+
		"\u01ab\u01b0\3\2\2\2\u01ac\u01ad\5&\24\2\u01ad\u01ae\b\27\1\2\u01ae\u01b0"+
		"\3\2\2\2\u01af\u013f\3\2\2\2\u01af\u0144\3\2\2\2\u01af\u0148\3\2\2\2\u01af"+
		"\u0150\3\2\2\2\u01af\u0156\3\2\2\2\u01af\u0159\3\2\2\2\u01af\u015c\3\2"+
		"\2\2\u01af\u0161\3\2\2\2\u01af\u0166\3\2\2\2\u01af\u016d\3\2\2\2\u01af"+
		"\u0177\3\2\2\2\u01af\u017c\3\2\2\2\u01af\u0181\3\2\2\2\u01af\u0186\3\2"+
		"\2\2\u01af\u018d\3\2\2\2\u01af\u0198\3\2\2\2\u01af\u01a3\3\2\2\2\u01af"+
		"\u01a9\3\2\2\2\u01af\u01ac\3\2\2\2\u01b0\u01d1\3\2\2\2\u01b1\u01b2\f\20"+
		"\2\2\u01b2\u01b3\7\23\2\2\u01b3\u01b4\5,\27\21\u01b4\u01b5\b\27\1\2\u01b5"+
		"\u01d0\3\2\2\2\u01b6\u01b7\f\17\2\2\u01b7\u01b8\7,\2\2\u01b8\u01b9\5,"+
		"\27\20\u01b9\u01ba\b\27\1\2\u01ba\u01d0\3\2\2\2\u01bb\u01bc\f\16\2\2\u01bc"+
		"\u01bd\t\2\2\2\u01bd\u01be\5,\27\17\u01be\u01bf\b\27\1\2\u01bf\u01d0\3"+
		"\2\2\2\u01c0\u01c1\f\r\2\2\u01c1\u01c2\t\3\2\2\u01c2\u01c3\5,\27\16\u01c3"+
		"\u01c4\b\27\1\2\u01c4\u01d0\3\2\2\2\u01c5\u01c6\f\f\2\2\u01c6\u01c7\t"+
		"\4\2\2\u01c7\u01c8\5,\27\r\u01c8\u01c9\b\27\1\2\u01c9\u01d0\3\2\2\2\u01ca"+
		"\u01cb\f\6\2\2\u01cb\u01cc\7\7\2\2\u01cc\u01cd\5,\27\7\u01cd\u01ce\b\27"+
		"\1\2\u01ce\u01d0\3\2\2\2\u01cf\u01b1\3\2\2\2\u01cf\u01b6\3\2\2\2\u01cf"+
		"\u01bb\3\2\2\2\u01cf\u01c0\3\2\2\2\u01cf\u01c5\3\2\2\2\u01cf\u01ca\3\2"+
		"\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"-\3\2\2\2\u01d3\u01d1\3\2\2\2\308BMRdn\u0088\u00a6\u00af\u00bd\u00d6\u00e3"+
		"\u00ec\u00fa\u0104\u010f\u0134\u013c\u0172\u01af\u01cf\u01d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}