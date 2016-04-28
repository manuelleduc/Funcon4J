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
		T__41=1, T__40=2, T__39=3, T__38=4, T__37=5, T__36=6, T__35=7, T__34=8, 
		T__33=9, T__32=10, T__31=11, T__30=12, T__29=13, T__28=14, T__27=15, T__26=16, 
		T__25=17, T__24=18, T__23=19, T__22=20, T__21=21, T__20=22, T__19=23, 
		T__18=24, T__17=25, T__16=26, T__15=27, T__14=28, T__13=29, T__12=30, 
		T__11=31, T__10=32, T__9=33, T__8=34, T__7=35, T__6=36, T__5=37, T__4=38, 
		T__3=39, T__2=40, T__1=41, T__0=42, WS=43, NULLTOKEN=44, EMPTYLISTTOKEN=45, 
		WILDCARDTOKEN=46, BOOLTOKEN=47, NUMTOKEN=48, IDTOKEN=49;
	public static final String[] tokenNames = {
		"<INVALID>", "'as'", "'fun'", "'while'", "'||'", "';'", "'&&'", "'::'", 
		"'='", "'for'", "'if'", "'<='", "'&'", "'print'", "'do'", "'('", "'*'", 
		"','", "'->'", "'done'", "'to'", "':'", "'>='", "'['", "'<'", "'|'", "'with'", 
		"']'", "'>'", "'or'", "'let'", "'match'", "'else'", "'begin'", "'in'", 
		"'function'", "'end'", "')'", "'downto'", "'and'", "'then'", "'+'", "'not'", 
		"WS", "NULLTOKEN", "EMPTYLISTTOKEN", "'_'", "BOOLTOKEN", "NUMTOKEN", "IDTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_optionalpattremainder = 1, RULE_constant = 2, 
		RULE_pattmatchcurried = 3, RULE_decl = 4, RULE_headtaillistexp = 5, RULE_patt = 6, 
		RULE_ident = 7, RULE_pattlist = 8, RULE_emptylist = 9, RULE_pattmatchsingle = 10, 
		RULE_pattmatchmultiple = 11, RULE_explist = 12, RULE_type = 13, RULE_prog = 14, 
		RULE_headtaillistpatt = 15, RULE_exptuple = 16, RULE_declmono = 17, RULE_letExp = 18, 
		RULE_patttuple = 19, RULE_function = 20, RULE_exp = 21;
	public static final String[] ruleNames = {
		"pattmatch", "optionalpattremainder", "constant", "pattmatchcurried", 
		"decl", "headtaillistexp", "patt", "ident", "pattlist", "emptylist", "pattmatchsingle", 
		"pattmatchmultiple", "explist", "type", "prog", "headtaillistpatt", "exptuple", 
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
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchmultipleContext pattmatchmultiple_0;
		public PattmatchContext pattmatch_0;
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
				setState(44); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch1((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47); ((PattmatchContext)_localctx).pattmatchmultiple_0 = pattmatchmultiple();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch2((((PattmatchContext)_localctx).pattmatchmultiple_0._pattmatchmultiple));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(50); match(25);
				setState(51); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
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
				setState(60); match(25);
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
		public Token BOOLTOKEN_0;
		public Token NULLTOKEN_0;
		public Token NUMTOKEN_0;
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
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.bool(booltoken((((ConstantContext)_localctx).BOOLTOKEN_0!=null?((ConstantContext)_localctx).BOOLTOKEN_0.getText():null)));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(68); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case NUMTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(70); ((ConstantContext)_localctx).NUMTOKEN_0 = match(NUMTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(numtoken((((ConstantContext)_localctx).NUMTOKEN_0!=null?((ConstantContext)_localctx).NUMTOKEN_0.getText():null)));
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
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 23) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN))) != 0) );
			setState(82); match(18);
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
				setState(89); match(30);
				setState(90); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(94); match(39);
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
		public PattlistContext pattlist_0;
		public EmptylistContext emptylist_0;
		public HeadtaillistpattContext headtaillistpatt_0;
		public PatttupleContext patttuple;
		public List<PatttupleContext> patttuple_1_list = new ArrayList<PatttupleContext>();
		public IdentContext ident_0;
		public TypeContext type_1;
		public Token WILDCARDTOKEN_0;
		public ConstantContext constant_0;
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode WILDCARDTOKEN() { return getToken(CLParser.WILDCARDTOKEN, 0); }
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
				setState(111); match(23);
				setState(112); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(113); match(27);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
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
				setState(119); match(23);
				setState(120); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(121); match(27);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;

			case 4:
				{
				setState(124); match(23);
				setState(125); ((PattContext)_localctx).patt_0 = patt(0);
				setState(126); match(27);
				((PattContext)_localctx)._patt =  builder.singleElementListPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 5:
				{
				setState(129); match(15);
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
				} while ( _la==17 );
				setState(136); match(37);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 6:
				{
				setState(139); match(15);
				setState(140); ((PattContext)_localctx).patt_0 = patt(0);
				setState(141); match(37);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 7:
				{
				setState(144); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 8:
				{
				setState(147); match(15);
				setState(148); ((PattContext)_localctx).patt_0 = patt(0);
				setState(149); match(21);
				setState(150); ((PattContext)_localctx).type_1 = type();
				setState(151); match(37);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 9:
				{
				setState(154); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 10:
				{
				setState(156); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 11:
				{
				setState(159); match(15);
				setState(160); ((PattContext)_localctx).optionalpattremainder_0 = optionalpattremainder();
				setState(161); match(37);
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
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
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
				((PattlistContext)_localctx)._pattlist =  builder.pattListSingle((((PattlistContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(183); match(5);
				setState(184); ((PattlistContext)_localctx).pattlist_1 = pattlist();
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
			setState(192); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(193); match(18);
			setState(194); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 22, RULE_pattmatchmultiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); ((PattmatchmultipleContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
			setState(198); match(25);
			setState(199); ((PattmatchmultipleContext)_localctx).pattmatch_1 = pattmatch();
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
		public IdentContext ident_0;
		public TypeContext type_0;
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_type);
		try {
			setState(222);
			switch (_input.LA(1)) {
			case IDTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(214); ((TypeContext)_localctx).ident_0 = ident();
				((TypeContext)_localctx)._type =  builder.typeId((((TypeContext)_localctx).ident_0._ident));
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 2);
				{
				setState(217); match(15);
				setState(218); ((TypeContext)_localctx).type_0 = type();
				setState(219); match(37);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
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
			setState(224); ((ProgContext)_localctx).exp_0 = exp(0);
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
			setState(235);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(228); match(7);
				setState(229); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
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
			setState(237); match(17);
			setState(238); ((ExptupleContext)_localctx).exp_0 = exp(0);
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
			setState(256);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 23) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN))) != 0) );
				setState(247); match(8);
				setState(248); ((DeclmonoContext)_localctx).exp_2 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMonoFunc((((DeclmonoContext)_localctx).ident_0._ident),lift("_patt", ((DeclmonoContext)_localctx).patt_1_list),(((DeclmonoContext)_localctx).exp_2._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(251); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(252); match(8);
				setState(253); ((DeclmonoContext)_localctx).exp_1 = exp(0);
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
			setState(258); ((LetExpContext)_localctx).decl_0 = decl();
			setState(259); match(34);
			setState(260); ((LetExpContext)_localctx).exp_1 = exp(0);
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
			setState(263); match(17);
			setState(264); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
			setState(293);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(268); match(35);
				setState(269); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(272); match(33);
				setState(273); ((FunctionContext)_localctx).function_0 = function(0);
				setState(274); match(36);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(277); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				{
				setState(280); match(15);
				setState(281); ((FunctionContext)_localctx).function_0 = function(0);
				setState(282); match(37);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(285); match(2);
				setState(286); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(289); match(2);
				setState(290); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(301);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(295);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(296); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(303);
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
			setState(416);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(305); match(13);
				setState(306); ((ExpContext)_localctx).exp_0 = exp(25);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(309); match(42);
				setState(310); ((ExpContext)_localctx).exp_0 = exp(15);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 3:
				{
				setState(313); match(10);
				setState(314); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(315); match(40);
				setState(316); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(317); match(32);
				setState(318); ((ExpContext)_localctx).exp_2 = exp(9);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 4:
				{
				setState(321); match(10);
				setState(322); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(323); match(40);
				setState(324); ((ExpContext)_localctx).exp_1 = exp(8);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 5:
				{
				setState(327); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 6:
				{
				setState(330); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 7:
				{
				setState(333); match(15);
				setState(334); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(335); match(37);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 8:
				{
				setState(338); match(33);
				setState(339); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(340); match(36);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 9:
				{
				setState(343); match(15);
				setState(344); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(345); match(21);
				setState(346); ((ExpContext)_localctx).type_1 = type();
				setState(347); match(37);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 10:
				{
				setState(350); match(15);
				setState(351); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(353); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(352); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(355); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==17 );
				setState(357); match(37);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;

			case 11:
				{
				setState(360); match(23);
				setState(361); ((ExpContext)_localctx).explist_0 = explist();
				setState(362); match(27);
				((ExpContext)_localctx)._exp =  builder.expList((((ExpContext)_localctx).explist_0._explist));
				}
				break;

			case 12:
				{
				setState(365); match(23);
				setState(366); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(367); match(27);
				((ExpContext)_localctx)._exp =  builder.singleElementListExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(370); match(23);
				setState(371); ((ExpContext)_localctx).headtaillistexp_0 = headtaillistexp();
				setState(372); match(27);
				((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).headtaillistexp_0._headtaillistexp));
				}
				break;

			case 14:
				{
				setState(375); match(3);
				setState(376); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(377); match(14);
				setState(378); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(379); match(19);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 15:
				{
				setState(382); match(9);
				setState(383); ((ExpContext)_localctx).ident_0 = ident();
				setState(384); match(8);
				setState(385); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(386); match(38);
				setState(387); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(388); match(14);
				setState(389); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(390); match(19);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 16:
				{
				setState(393); match(9);
				setState(394); ((ExpContext)_localctx).ident_0 = ident();
				setState(395); match(8);
				setState(396); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(397); match(20);
				setState(398); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(399); match(14);
				setState(400); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(401); match(19);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 17:
				{
				setState(404); match(31);
				setState(405); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(406); match(26);
				setState(407); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 18:
				{
				setState(410); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 19:
				{
				setState(413); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(448);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(418);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(419); match(16);
						setState(420); ((ExpContext)_localctx).exp_1 = exp(15);
						((ExpContext)_localctx)._exp =  builder.intMultiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(423);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(424); match(41);
						setState(425); ((ExpContext)_localctx).exp_1 = exp(14);
						((ExpContext)_localctx)._exp =  builder.intAdd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(428);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(429);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 22) | (1L << 24) | (1L << 28))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(430); ((ExpContext)_localctx).exp_1 = exp(13);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(433);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(434);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==12) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(435); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(438);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(439);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==29) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(440); ((ExpContext)_localctx).exp_1 = exp(11);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(443);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(444); match(5);
						setState(445); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(452);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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

		case 20: return function_sempred((FunctionContext)_localctx, predIndex);

		case 21: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean patt_sempred(PattContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 14);

		case 3: return precpred(_ctx, 13);

		case 4: return precpred(_ctx, 12);

		case 5: return precpred(_ctx, 11);

		case 6: return precpred(_ctx, 10);

		case 7: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\63\u01c8\4\2\t\2"+
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
		"\5\17\u00e1\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\5\21\u00ee\n\21\3\22\3\22\3\22\3\22\3\23\3\23\6\23\u00f6\n\23\r\23\16"+
		"\23\u00f7\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0103\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0128\n\26\3\26\3\26\3\26\3\26"+
		"\7\26\u012e\n\26\f\26\16\26\u0131\13\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\6\27\u0164\n\27\r\27\16\27\u0165\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01a3\n\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\7\27\u01c3\n\27\f\27\16\27\u01c6\13\27\3\27\2\5\16*,\30\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,\2\5\7\2\n\n\r\r\30\30\32\32"+
		"\36\36\4\2\b\b\16\16\4\2\6\6\37\37\u01ec\28\3\2\2\2\4B\3\2\2\2\6M\3\2"+
		"\2\2\bP\3\2\2\2\nd\3\2\2\2\fn\3\2\2\2\16\u00a6\3\2\2\2\20\u00b2\3\2\2"+
		"\2\22\u00bd\3\2\2\2\24\u00bf\3\2\2\2\26\u00c2\3\2\2\2\30\u00c7\3\2\2\2"+
		"\32\u00d6\3\2\2\2\34\u00e0\3\2\2\2\36\u00e2\3\2\2\2 \u00ed\3\2\2\2\"\u00ef"+
		"\3\2\2\2$\u0102\3\2\2\2&\u0104\3\2\2\2(\u0109\3\2\2\2*\u0127\3\2\2\2,"+
		"\u01a2\3\2\2\2./\5\26\f\2/\60\b\2\1\2\609\3\2\2\2\61\62\5\30\r\2\62\63"+
		"\b\2\1\2\639\3\2\2\2\64\65\7\33\2\2\65\66\5\2\2\2\66\67\b\2\1\2\679\3"+
		"\2\2\28.\3\2\2\28\61\3\2\2\28\64\3\2\2\29\3\3\2\2\2:;\5\16\b\2;<\b\3\1"+
		"\2<C\3\2\2\2=>\5\16\b\2>?\7\33\2\2?@\5\4\3\2@A\b\3\1\2AC\3\2\2\2B:\3\2"+
		"\2\2B=\3\2\2\2C\5\3\2\2\2DE\7\61\2\2EN\b\4\1\2FG\7.\2\2GN\b\4\1\2HI\7"+
		"\62\2\2IN\b\4\1\2JK\5\24\13\2KL\b\4\1\2LN\3\2\2\2MD\3\2\2\2MF\3\2\2\2"+
		"MH\3\2\2\2MJ\3\2\2\2N\7\3\2\2\2OQ\5\16\b\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2"+
		"\2RS\3\2\2\2ST\3\2\2\2TU\7\24\2\2UV\5,\27\2VW\b\5\1\2W\t\3\2\2\2XY\5$"+
		"\23\2YZ\b\6\1\2Ze\3\2\2\2[\\\7 \2\2\\]\5\n\6\2]^\b\6\1\2^e\3\2\2\2_`\5"+
		"$\23\2`a\7)\2\2ab\5\n\6\2bc\b\6\1\2ce\3\2\2\2dX\3\2\2\2d[\3\2\2\2d_\3"+
		"\2\2\2e\13\3\2\2\2fg\5,\27\2gh\7\t\2\2hi\5\f\7\2ij\b\7\1\2jo\3\2\2\2k"+
		"l\5,\27\2lm\b\7\1\2mo\3\2\2\2nf\3\2\2\2nk\3\2\2\2o\r\3\2\2\2pq\b\b\1\2"+
		"qr\7\31\2\2rs\5\22\n\2st\7\35\2\2tu\b\b\1\2u\u00a7\3\2\2\2vw\5\24\13\2"+
		"wx\b\b\1\2x\u00a7\3\2\2\2yz\7\31\2\2z{\5 \21\2{|\7\35\2\2|}\b\b\1\2}\u00a7"+
		"\3\2\2\2~\177\7\31\2\2\177\u0080\5\16\b\2\u0080\u0081\7\35\2\2\u0081\u0082"+
		"\b\b\1\2\u0082\u00a7\3\2\2\2\u0083\u0084\7\21\2\2\u0084\u0086\5\16\b\2"+
		"\u0085\u0087\5(\25\2\u0086\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0086"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\7\'\2\2\u008b"+
		"\u008c\b\b\1\2\u008c\u00a7\3\2\2\2\u008d\u008e\7\21\2\2\u008e\u008f\5"+
		"\16\b\2\u008f\u0090\7\'\2\2\u0090\u0091\b\b\1\2\u0091\u00a7\3\2\2\2\u0092"+
		"\u0093\5\20\t\2\u0093\u0094\b\b\1\2\u0094\u00a7\3\2\2\2\u0095\u0096\7"+
		"\21\2\2\u0096\u0097\5\16\b\2\u0097\u0098\7\27\2\2\u0098\u0099\5\34\17"+
		"\2\u0099\u009a\7\'\2\2\u009a\u009b\b\b\1\2\u009b\u00a7\3\2\2\2\u009c\u009d"+
		"\7\60\2\2\u009d\u00a7\b\b\1\2\u009e\u009f\5\6\4\2\u009f\u00a0\b\b\1\2"+
		"\u00a0\u00a7\3\2\2\2\u00a1\u00a2\7\21\2\2\u00a2\u00a3\5\4\3\2\u00a3\u00a4"+
		"\7\'\2\2\u00a4\u00a5\b\b\1\2\u00a5\u00a7\3\2\2\2\u00a6p\3\2\2\2\u00a6"+
		"v\3\2\2\2\u00a6y\3\2\2\2\u00a6~\3\2\2\2\u00a6\u0083\3\2\2\2\u00a6\u008d"+
		"\3\2\2\2\u00a6\u0092\3\2\2\2\u00a6\u0095\3\2\2\2\u00a6\u009c\3\2\2\2\u00a6"+
		"\u009e\3\2\2\2\u00a6\u00a1\3\2\2\2\u00a7\u00af\3\2\2\2\u00a8\u00a9\f\6"+
		"\2\2\u00a9\u00aa\7\3\2\2\u00aa\u00ab\5\20\t\2\u00ab\u00ac\b\b\1\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\17\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3"+
		"\7\63\2\2\u00b3\u00b4\b\t\1\2\u00b4\21\3\2\2\2\u00b5\u00b6\5\16\b\2\u00b6"+
		"\u00b7\b\n\1\2\u00b7\u00be\3\2\2\2\u00b8\u00b9\5\16\b\2\u00b9\u00ba\7"+
		"\7\2\2\u00ba\u00bb\5\22\n\2\u00bb\u00bc\b\n\1\2\u00bc\u00be\3\2\2\2\u00bd"+
		"\u00b5\3\2\2\2\u00bd\u00b8\3\2\2\2\u00be\23\3\2\2\2\u00bf\u00c0\7/\2\2"+
		"\u00c0\u00c1\b\13\1\2\u00c1\25\3\2\2\2\u00c2\u00c3\5\16\b\2\u00c3\u00c4"+
		"\7\24\2\2\u00c4\u00c5\5,\27\2\u00c5\u00c6\b\f\1\2\u00c6\27\3\2\2\2\u00c7"+
		"\u00c8\5\26\f\2\u00c8\u00c9\7\33\2\2\u00c9\u00ca\5\2\2\2\u00ca\u00cb\b"+
		"\r\1\2\u00cb\31\3\2\2\2\u00cc\u00cd\5,\27\2\u00cd\u00ce\7\7\2\2\u00ce"+
		"\u00cf\5\32\16\2\u00cf\u00d0\b\16\1\2\u00d0\u00d7\3\2\2\2\u00d1\u00d2"+
		"\5,\27\2\u00d2\u00d3\7\7\2\2\u00d3\u00d4\5,\27\2\u00d4\u00d5\b\16\1\2"+
		"\u00d5\u00d7\3\2\2\2\u00d6\u00cc\3\2\2\2\u00d6\u00d1\3\2\2\2\u00d7\33"+
		"\3\2\2\2\u00d8\u00d9\5\20\t\2\u00d9\u00da\b\17\1\2\u00da\u00e1\3\2\2\2"+
		"\u00db\u00dc\7\21\2\2\u00dc\u00dd\5\34\17\2\u00dd\u00de\7\'\2\2\u00de"+
		"\u00df\b\17\1\2\u00df\u00e1\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00db\3"+
		"\2\2\2\u00e1\35\3\2\2\2\u00e2\u00e3\5,\27\2\u00e3\u00e4\b\20\1\2\u00e4"+
		"\37\3\2\2\2\u00e5\u00e6\5\16\b\2\u00e6\u00e7\7\t\2\2\u00e7\u00e8\5 \21"+
		"\2\u00e8\u00e9\b\21\1\2\u00e9\u00ee\3\2\2\2\u00ea\u00eb\5\16\b\2\u00eb"+
		"\u00ec\b\21\1\2\u00ec\u00ee\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ed\u00ea\3"+
		"\2\2\2\u00ee!\3\2\2\2\u00ef\u00f0\7\23\2\2\u00f0\u00f1\5,\27\2\u00f1\u00f2"+
		"\b\22\1\2\u00f2#\3\2\2\2\u00f3\u00f5\5\20\t\2\u00f4\u00f6\5\16\b\2\u00f5"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\n\2\2\u00fa\u00fb\5,\27\2\u00fb"+
		"\u00fc\b\23\1\2\u00fc\u0103\3\2\2\2\u00fd\u00fe\5\16\b\2\u00fe\u00ff\7"+
		"\n\2\2\u00ff\u0100\5,\27\2\u0100\u0101\b\23\1\2\u0101\u0103\3\2\2\2\u0102"+
		"\u00f3\3\2\2\2\u0102\u00fd\3\2\2\2\u0103%\3\2\2\2\u0104\u0105\5\n\6\2"+
		"\u0105\u0106\7$\2\2\u0106\u0107\5,\27\2\u0107\u0108\b\24\1\2\u0108\'\3"+
		"\2\2\2\u0109\u010a\7\23\2\2\u010a\u010b\5\16\b\2\u010b\u010c\b\25\1\2"+
		"\u010c)\3\2\2\2\u010d\u010e\b\26\1\2\u010e\u010f\7%\2\2\u010f\u0110\5"+
		"\2\2\2\u0110\u0111\b\26\1\2\u0111\u0128\3\2\2\2\u0112\u0113\7#\2\2\u0113"+
		"\u0114\5*\26\2\u0114\u0115\7&\2\2\u0115\u0116\b\26\1\2\u0116\u0128\3\2"+
		"\2\2\u0117\u0118\5\20\t\2\u0118\u0119\b\26\1\2\u0119\u0128\3\2\2\2\u011a"+
		"\u011b\7\21\2\2\u011b\u011c\5*\26\2\u011c\u011d\7\'\2\2\u011d\u011e\b"+
		"\26\1\2\u011e\u0128\3\2\2\2\u011f\u0120\7\4\2\2\u0120\u0121\5\26\f\2\u0121"+
		"\u0122\b\26\1\2\u0122\u0128\3\2\2\2\u0123\u0124\7\4\2\2\u0124\u0125\5"+
		"\b\5\2\u0125\u0126\b\26\1\2\u0126\u0128\3\2\2\2\u0127\u010d\3\2\2\2\u0127"+
		"\u0112\3\2\2\2\u0127\u0117\3\2\2\2\u0127\u011a\3\2\2\2\u0127\u011f\3\2"+
		"\2\2\u0127\u0123\3\2\2\2\u0128\u012f\3\2\2\2\u0129\u012a\f\7\2\2\u012a"+
		"\u012b\5,\27\2\u012b\u012c\b\26\1\2\u012c\u012e\3\2\2\2\u012d\u0129\3"+
		"\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"+\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\b\27\1\2\u0133\u0134\7\17\2"+
		"\2\u0134\u0135\5,\27\33\u0135\u0136\b\27\1\2\u0136\u01a3\3\2\2\2\u0137"+
		"\u0138\7,\2\2\u0138\u0139\5,\27\21\u0139\u013a\b\27\1\2\u013a\u01a3\3"+
		"\2\2\2\u013b\u013c\7\f\2\2\u013c\u013d\5,\27\2\u013d\u013e\7*\2\2\u013e"+
		"\u013f\5,\27\2\u013f\u0140\7\"\2\2\u0140\u0141\5,\27\13\u0141\u0142\b"+
		"\27\1\2\u0142\u01a3\3\2\2\2\u0143\u0144\7\f\2\2\u0144\u0145\5,\27\2\u0145"+
		"\u0146\7*\2\2\u0146\u0147\5,\27\n\u0147\u0148\b\27\1\2\u0148\u01a3\3\2"+
		"\2\2\u0149\u014a\5\20\t\2\u014a\u014b\b\27\1\2\u014b\u01a3\3\2\2\2\u014c"+
		"\u014d\5\6\4\2\u014d\u014e\b\27\1\2\u014e\u01a3\3\2\2\2\u014f\u0150\7"+
		"\21\2\2\u0150\u0151\5,\27\2\u0151\u0152\7\'\2\2\u0152\u0153\b\27\1\2\u0153"+
		"\u01a3\3\2\2\2\u0154\u0155\7#\2\2\u0155\u0156\5,\27\2\u0156\u0157\7&\2"+
		"\2\u0157\u0158\b\27\1\2\u0158\u01a3\3\2\2\2\u0159\u015a\7\21\2\2\u015a"+
		"\u015b\5,\27\2\u015b\u015c\7\27\2\2\u015c\u015d\5\34\17\2\u015d\u015e"+
		"\7\'\2\2\u015e\u015f\b\27\1\2\u015f\u01a3\3\2\2\2\u0160\u0161\7\21\2\2"+
		"\u0161\u0163\5,\27\2\u0162\u0164\5\"\22\2\u0163\u0162\3\2\2\2\u0164\u0165"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\7\'\2\2\u0168\u0169\b\27\1\2\u0169\u01a3\3\2\2\2\u016a\u016b\7"+
		"\31\2\2\u016b\u016c\5\32\16\2\u016c\u016d\7\35\2\2\u016d\u016e\b\27\1"+
		"\2\u016e\u01a3\3\2\2\2\u016f\u0170\7\31\2\2\u0170\u0171\5,\27\2\u0171"+
		"\u0172\7\35\2\2\u0172\u0173\b\27\1\2\u0173\u01a3\3\2\2\2\u0174\u0175\7"+
		"\31\2\2\u0175\u0176\5\f\7\2\u0176\u0177\7\35\2\2\u0177\u0178\b\27\1\2"+
		"\u0178\u01a3\3\2\2\2\u0179\u017a\7\5\2\2\u017a\u017b\5,\27\2\u017b\u017c"+
		"\7\20\2\2\u017c\u017d\5,\27\2\u017d\u017e\7\25\2\2\u017e\u017f\b\27\1"+
		"\2\u017f\u01a3\3\2\2\2\u0180\u0181\7\13\2\2\u0181\u0182\5\20\t\2\u0182"+
		"\u0183\7\n\2\2\u0183\u0184\5,\27\2\u0184\u0185\7(\2\2\u0185\u0186\5,\27"+
		"\2\u0186\u0187\7\20\2\2\u0187\u0188\5,\27\2\u0188\u0189\7\25\2\2\u0189"+
		"\u018a\b\27\1\2\u018a\u01a3\3\2\2\2\u018b\u018c\7\13\2\2\u018c\u018d\5"+
		"\20\t\2\u018d\u018e\7\n\2\2\u018e\u018f\5,\27\2\u018f\u0190\7\26\2\2\u0190"+
		"\u0191\5,\27\2\u0191\u0192\7\20\2\2\u0192\u0193\5,\27\2\u0193\u0194\7"+
		"\25\2\2\u0194\u0195\b\27\1\2\u0195\u01a3\3\2\2\2\u0196\u0197\7!\2\2\u0197"+
		"\u0198\5,\27\2\u0198\u0199\7\34\2\2\u0199\u019a\5\2\2\2\u019a\u019b\b"+
		"\27\1\2\u019b\u01a3\3\2\2\2\u019c\u019d\5*\26\2\u019d\u019e\b\27\1\2\u019e"+
		"\u01a3\3\2\2\2\u019f\u01a0\5&\24\2\u01a0\u01a1\b\27\1\2\u01a1\u01a3\3"+
		"\2\2\2\u01a2\u0132\3\2\2\2\u01a2\u0137\3\2\2\2\u01a2\u013b\3\2\2\2\u01a2"+
		"\u0143\3\2\2\2\u01a2\u0149\3\2\2\2\u01a2\u014c\3\2\2\2\u01a2\u014f\3\2"+
		"\2\2\u01a2\u0154\3\2\2\2\u01a2\u0159\3\2\2\2\u01a2\u0160\3\2\2\2\u01a2"+
		"\u016a\3\2\2\2\u01a2\u016f\3\2\2\2\u01a2\u0174\3\2\2\2\u01a2\u0179\3\2"+
		"\2\2\u01a2\u0180\3\2\2\2\u01a2\u018b\3\2\2\2\u01a2\u0196\3\2\2\2\u01a2"+
		"\u019c\3\2\2\2\u01a2\u019f\3\2\2\2\u01a3\u01c4\3\2\2\2\u01a4\u01a5\f\20"+
		"\2\2\u01a5\u01a6\7\22\2\2\u01a6\u01a7\5,\27\21\u01a7\u01a8\b\27\1\2\u01a8"+
		"\u01c3\3\2\2\2\u01a9\u01aa\f\17\2\2\u01aa\u01ab\7+\2\2\u01ab\u01ac\5,"+
		"\27\20\u01ac\u01ad\b\27\1\2\u01ad\u01c3\3\2\2\2\u01ae\u01af\f\16\2\2\u01af"+
		"\u01b0\t\2\2\2\u01b0\u01b1\5,\27\17\u01b1\u01b2\b\27\1\2\u01b2\u01c3\3"+
		"\2\2\2\u01b3\u01b4\f\r\2\2\u01b4\u01b5\t\3\2\2\u01b5\u01b6\5,\27\16\u01b6"+
		"\u01b7\b\27\1\2\u01b7\u01c3\3\2\2\2\u01b8\u01b9\f\f\2\2\u01b9\u01ba\t"+
		"\4\2\2\u01ba\u01bb\5,\27\r\u01bb\u01bc\b\27\1\2\u01bc\u01c3\3\2\2\2\u01bd"+
		"\u01be\f\6\2\2\u01be\u01bf\7\7\2\2\u01bf\u01c0\5,\27\7\u01c0\u01c1\b\27"+
		"\1\2\u01c1\u01c3\3\2\2\2\u01c2\u01a4\3\2\2\2\u01c2\u01a9\3\2\2\2\u01c2"+
		"\u01ae\3\2\2\2\u01c2\u01b3\3\2\2\2\u01c2\u01b8\3\2\2\2\u01c2\u01bd\3\2"+
		"\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"-\3\2\2\2\u01c6\u01c4\3\2\2\2\278BMRdn\u0088\u00a6\u00af\u00bd\u00d6\u00e0"+
		"\u00ed\u00f7\u0102\u0127\u012f\u0165\u01a2\u01c2\u01c4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}