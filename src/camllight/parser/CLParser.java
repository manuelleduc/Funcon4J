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
		RULE_tupletypelist = 19, RULE_patttuple = 20, RULE_function = 21, RULE_exp = 22;
	public static final String[] ruleNames = {
		"pattmatch", "optionalpattremainder", "constant", "pattmatchcurried", 
		"decl", "headtaillistexp", "patt", "ident", "pattlist", "emptylist", "pattmatchmultiple", 
		"pattmatchsingle", "explist", "type", "prog", "headtaillistpatt", "exptuple", 
		"declmono", "letExp", "tupletypelist", "patttuple", "function", "exp"
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
		public PattmatchmultipleContext pattmatchmultiple_0;
		public PattmatchContext pattmatch_0;
		public PattmatchsingleContext pattmatchsingle_0;
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
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46); ((PattmatchContext)_localctx).pattmatchmultiple_0 = pattmatchmultiple();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch2((((PattmatchContext)_localctx).pattmatchmultiple_0._pattmatchmultiple));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); match(26);
				setState(50); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch1((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle));
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
			setState(66);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); ((OptionalpattremainderContext)_localctx).patt_0 = patt(0);
				((OptionalpattremainderContext)_localctx)._optionalpattremainder =  builder.optionalPattRemainderSingle((((OptionalpattremainderContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); ((OptionalpattremainderContext)_localctx).patt_0 = patt(0);
				setState(62); match(26);
				setState(63); ((OptionalpattremainderContext)_localctx).optionalpattremainder_1 = optionalpattremainder();
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
		public EmptylistContext emptylist_0;
		public Token NULLTOKEN_0;
		public Token NUMTOKEN_0;
		public Token BOOLTOKEN_0;
		public TerminalNode NULLTOKEN() { return getToken(CLParser.NULLTOKEN, 0); }
		public EmptylistContext emptylist() {
			return getRuleContext(EmptylistContext.class,0);
		}
		public TerminalNode BOOLTOKEN() { return getToken(CLParser.BOOLTOKEN, 0); }
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
			setState(77);
			switch (_input.LA(1)) {
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(71); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case NUMTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(73); ((ConstantContext)_localctx).NUMTOKEN_0 = match(NUMTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(numtoken((((ConstantContext)_localctx).NUMTOKEN_0!=null?((ConstantContext)_localctx).NUMTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(75); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
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
			setState(80); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(82); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 24) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN))) != 0) );
			setState(84); match(19);
			setState(85); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
			setState(100);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); ((DeclContext)_localctx).declmono_0 = declmono();
				((DeclContext)_localctx)._decl =  builder.declBind((((DeclContext)_localctx).declmono_0._declmono));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); match(31);
				setState(92); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(95); ((DeclContext)_localctx).declmono_0 = declmono();
				setState(96); match(40);
				setState(97); ((DeclContext)_localctx).decl_1 = decl();
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
			setState(110);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102); ((HeadtaillistexpContext)_localctx).exp_0 = exp(0);
				setState(103); match(7);
				setState(104); ((HeadtaillistexpContext)_localctx).headtaillistexp_1 = headtaillistexp();
				((HeadtaillistexpContext)_localctx)._headtaillistexp =  builder.headTailListExpMulti((((HeadtaillistexpContext)_localctx).exp_0._exp),(((HeadtaillistexpContext)_localctx).headtaillistexp_1._headtaillistexp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107); ((HeadtaillistexpContext)_localctx).exp_0 = exp(0);
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
		public PattlistContext pattlist_0;
		public EmptylistContext emptylist_0;
		public PatttupleContext patttuple;
		public List<PatttupleContext> patttuple_1_list = new ArrayList<PatttupleContext>();
		public IdentContext ident_0;
		public Token WILDCARDTOKEN_0;
		public TypeContext type_1;
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
			setState(166);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(113); match(24);
				setState(114); ((PattContext)_localctx).headtaillistpatt_0 = headtaillistpatt();
				setState(115); match(28);
				((PattContext)_localctx)._patt =  builder.headTailListPatt((((PattContext)_localctx).headtaillistpatt_0._headtaillistpatt));
				}
				break;

			case 2:
				{
				setState(118); match(24);
				setState(119); ((PattContext)_localctx).pattlist_0 = pattlist();
				setState(120); match(28);
				((PattContext)_localctx)._patt =  builder.pattList((((PattContext)_localctx).pattlist_0._pattlist));
				}
				break;

			case 3:
				{
				setState(123); ((PattContext)_localctx).emptylist_0 = emptylist();
				((PattContext)_localctx)._patt =  builder.emptyListPatt((((PattContext)_localctx).emptylist_0._emptylist));
				}
				break;

			case 4:
				{
				setState(126); match(24);
				setState(127); ((PattContext)_localctx).patt_0 = patt(0);
				setState(128); match(28);
				((PattContext)_localctx)._patt =  builder.singleElementListPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 5:
				{
				setState(131); match(16);
				setState(132); ((PattContext)_localctx).patt_0 = patt(0);
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(133); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==18 );
				setState(138); match(38);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 6:
				{
				setState(141); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 7:
				{
				setState(144); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 8:
				{
				setState(146); match(16);
				setState(147); ((PattContext)_localctx).patt_0 = patt(0);
				setState(148); match(22);
				setState(149); ((PattContext)_localctx).type_1 = type(0);
				setState(150); match(38);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 9:
				{
				setState(153); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 10:
				{
				setState(156); match(16);
				setState(157); ((PattContext)_localctx).patt_0 = patt(0);
				setState(158); match(38);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 11:
				{
				setState(161); match(16);
				setState(162); ((PattContext)_localctx).optionalpattremainder_0 = optionalpattremainder();
				setState(163); match(38);
				((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).optionalpattremainder_0._optionalpattremainder));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(175);
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
					setState(168);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(169); match(1);
					setState(170); ((PattContext)_localctx).ident_1 = ident();
					((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
					}
					} 
				}
				setState(177);
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
			setState(178); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181); ((PattlistContext)_localctx).patt_0 = patt(0);
				((PattlistContext)_localctx)._pattlist =  builder.pattListSingle((((PattlistContext)_localctx).patt_0._patt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); ((PattlistContext)_localctx).patt_0 = patt(0);
				setState(185); match(5);
				setState(186); ((PattlistContext)_localctx).pattlist_1 = pattlist();
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
			setState(191); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
			setState(194); ((PattmatchmultipleContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
			setState(195); match(26);
			setState(196); ((PattmatchmultipleContext)_localctx).pattmatch_1 = pattmatch();
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
			setState(199); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(200); match(19);
			setState(201); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
			setState(214);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(205); match(5);
				setState(206); ((ExplistContext)_localctx).explist_1 = explist();
				((ExplistContext)_localctx)._explist =  builder.expListMulti((((ExplistContext)_localctx).exp_0._exp),(((ExplistContext)_localctx).explist_1._explist));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209); ((ExplistContext)_localctx).exp_0 = exp(0);
				setState(210); match(5);
				setState(211); ((ExplistContext)_localctx).exp_1 = exp(0);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_type, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			switch (_input.LA(1)) {
			case 16:
				{
				setState(217); match(16);
				setState(218); ((TypeContext)_localctx).type_0 = type(0);
				setState(219); match(38);
				((TypeContext)_localctx)._type =  builder.bracketedType((((TypeContext)_localctx).type_0._type));
				}
				break;
			case IDTOKEN:
				{
				setState(222); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			case 15:
				{
				setState(224); match(15);
				setState(225); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
				((TypeContext)_localctx)._type =  builder.varType(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(229);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(230); match(19);
						setState(231); ((TypeContext)_localctx).type_1 = type(4);
						((TypeContext)_localctx)._type =  builder.functionType((((TypeContext)_localctx).type_0._type),(((TypeContext)_localctx).type_1._type));
						}
						break;

					case 2:
						{
						_localctx = new TypeContext(_parentctx, _parentState);
						_localctx.type_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(234);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(236); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(235); ((TypeContext)_localctx).tupletypelist = tupletypelist();
								((TypeContext)_localctx).tupletypelist_1_list.add(((TypeContext)_localctx).tupletypelist);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(238); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
						((TypeContext)_localctx)._type =  builder.doubleTupleType((((TypeContext)_localctx).type_0._type),lift("_tupletypelist", ((TypeContext)_localctx).tupletypelist_1_list));
						}
						break;
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
			setState(247); ((ProgContext)_localctx).exp_0 = exp(0);
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
			setState(258);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(250); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
				setState(251); match(7);
				setState(252); ((HeadtaillistpattContext)_localctx).headtaillistpatt_1 = headtaillistpatt();
				((HeadtaillistpattContext)_localctx)._headtaillistpatt =  builder.headTailListPattMulti((((HeadtaillistpattContext)_localctx).patt_0._patt),(((HeadtaillistpattContext)_localctx).headtaillistpatt_1._headtaillistpatt));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(255); ((HeadtaillistpattContext)_localctx).patt_0 = patt(0);
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
			setState(260); match(18);
			setState(261); ((ExptupleContext)_localctx).exp_0 = exp(0);
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
		enterRule(_localctx, 34, RULE_declmono);
		int _la;
		try {
			setState(279);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264); ((DeclmonoContext)_localctx).patt_0 = patt(0);
				setState(265); match(8);
				setState(266); ((DeclmonoContext)_localctx).exp_1 = exp(0);
				((DeclmonoContext)_localctx)._declmono =  builder.declBindMono((((DeclmonoContext)_localctx).patt_0._patt),(((DeclmonoContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(269); ((DeclmonoContext)_localctx).ident_0 = ident();
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(270); ((DeclmonoContext)_localctx).patt = patt(0);
					((DeclmonoContext)_localctx).patt_1_list.add(((DeclmonoContext)_localctx).patt);
					}
					}
					setState(273); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 16) | (1L << 24) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN))) != 0) );
				setState(275); match(8);
				setState(276); ((DeclmonoContext)_localctx).exp_2 = exp(0);
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
		enterRule(_localctx, 36, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281); ((LetExpContext)_localctx).decl_0 = decl();
			setState(282); match(35);
			setState(283); ((LetExpContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 38, RULE_tupletypelist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286); match(17);
			setState(287); ((TupletypelistContext)_localctx).type_0 = type(0);
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
			setState(290); match(18);
			setState(291); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(295); match(36);
				setState(296); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(299); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 3:
				{
				setState(302); match(34);
				setState(303); ((FunctionContext)_localctx).function_0 = function(0);
				setState(304); match(37);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 4:
				{
				setState(307); match(16);
				setState(308); ((FunctionContext)_localctx).function_0 = function(0);
				setState(309); match(38);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(312); match(2);
				setState(313); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(316); match(2);
				setState(317); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(322);
					if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
					setState(323); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(330);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(332); match(13);
				setState(333); ((ExpContext)_localctx).exp_0 = exp(25);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(336); match(43);
				setState(337); ((ExpContext)_localctx).exp_0 = exp(15);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 3:
				{
				setState(340); match(10);
				setState(341); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(342); match(41);
				setState(343); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(344); match(33);
				setState(345); ((ExpContext)_localctx).exp_2 = exp(9);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 4:
				{
				setState(348); match(10);
				setState(349); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(350); match(41);
				setState(351); ((ExpContext)_localctx).exp_1 = exp(8);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 5:
				{
				setState(354); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 6:
				{
				setState(357); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 7:
				{
				setState(360); match(16);
				setState(361); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(362); match(38);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 8:
				{
				setState(365); match(34);
				setState(366); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(367); match(37);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 9:
				{
				setState(370); match(16);
				setState(371); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(372); match(22);
				setState(373); ((ExpContext)_localctx).type_1 = type(0);
				setState(374); match(38);
				((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
				}
				break;

			case 10:
				{
				setState(377); match(16);
				setState(378); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(380); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(379); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(382); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==18 );
				setState(384); match(38);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;

			case 11:
				{
				setState(387); match(24);
				setState(388); ((ExpContext)_localctx).explist_0 = explist();
				setState(389); match(28);
				((ExpContext)_localctx)._exp =  builder.expList((((ExpContext)_localctx).explist_0._explist));
				}
				break;

			case 12:
				{
				setState(392); match(24);
				setState(393); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(394); match(28);
				((ExpContext)_localctx)._exp =  builder.singleElementListExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(397); match(24);
				setState(398); ((ExpContext)_localctx).headtaillistexp_0 = headtaillistexp();
				setState(399); match(28);
				((ExpContext)_localctx)._exp =  builder.headTailListExp((((ExpContext)_localctx).headtaillistexp_0._headtaillistexp));
				}
				break;

			case 14:
				{
				setState(402); match(3);
				setState(403); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(404); match(14);
				setState(405); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(406); match(20);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 15:
				{
				setState(409); match(9);
				setState(410); ((ExpContext)_localctx).ident_0 = ident();
				setState(411); match(8);
				setState(412); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(413); match(39);
				setState(414); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(415); match(14);
				setState(416); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(417); match(20);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 16:
				{
				setState(420); match(9);
				setState(421); ((ExpContext)_localctx).ident_0 = ident();
				setState(422); match(8);
				setState(423); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(424); match(21);
				setState(425); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(426); match(14);
				setState(427); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(428); match(20);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 17:
				{
				setState(431); match(32);
				setState(432); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(433); match(27);
				setState(434); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 18:
				{
				setState(437); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 19:
				{
				setState(440); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(477);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(475);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(445);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(446); match(17);
						setState(447); ((ExpContext)_localctx).exp_1 = exp(15);
						((ExpContext)_localctx)._exp =  builder.intMultiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(450);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(451); match(42);
						setState(452); ((ExpContext)_localctx).exp_1 = exp(14);
						((ExpContext)_localctx)._exp =  builder.intAdd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(455);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(456);
						((ExpContext)_localctx).op_1508 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 11) | (1L << 23) | (1L << 25) | (1L << 29))) != 0)) ) {
							((ExpContext)_localctx).op_1508 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(457); ((ExpContext)_localctx).exp_1 = exp(13);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_1508!=null?((ExpContext)_localctx).op_1508.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(460);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(461);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==12) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(462); ((ExpContext)_localctx).exp_1 = exp(12);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(465);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(466);
						_la = _input.LA(1);
						if ( !(_la==4 || _la==30) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(467); ((ExpContext)_localctx).exp_1 = exp(11);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(470);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(471); match(5);
						setState(472); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(479);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6: return patt_sempred((PattContext)_localctx, predIndex);

		case 13: return type_sempred((TypeContext)_localctx, predIndex);

		case 21: return function_sempred((FunctionContext)_localctx, predIndex);

		case 22: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean patt_sempred(PattContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 3);

		case 2: return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return precpred(_ctx, 14);

		case 5: return precpred(_ctx, 13);

		case 6: return precpred(_ctx, 12);

		case 7: return precpred(_ctx, 11);

		case 8: return precpred(_ctx, 10);

		case 9: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u01e3\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2;\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3E\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\6\5S\n\5"+
		"\r\5\16\5T\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\6\b\u0089\n\b\r\b\16\b\u008a\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u00a9\n\b\3\b\3\b\3\b\3\b\3\b\7\b\u00b0\n\b\f\b\16\b\u00b3\13"+
		"\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c0\n\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00d9\n\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00e6\n\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\6\17\u00ef\n\17\r\17\16\17\u00f0\3\17\3\17\7\17\u00f5\n\17\f\17"+
		"\16\17\u00f8\13\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\5\21\u0105\n\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\6\23\u0112\n\23\r\23\16\23\u0113\3\23\3\23\3\23\3\23\5\23\u011a"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0143"+
		"\n\27\3\27\3\27\3\27\3\27\7\27\u0149\n\27\f\27\16\27\u014c\13\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u017f\n\30\r\30\16\30\u0180\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\5\30\u01be\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01de\n\30\f\30\16\30\u01e1\13"+
		"\30\3\30\2\6\16\34,.\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\2\5\7\2\n\n\r\r\31\31\33\33\37\37\4\2\b\b\16\16\4\2\6\6  \u020a\2:"+
		"\3\2\2\2\4D\3\2\2\2\6O\3\2\2\2\bR\3\2\2\2\nf\3\2\2\2\fp\3\2\2\2\16\u00a8"+
		"\3\2\2\2\20\u00b4\3\2\2\2\22\u00bf\3\2\2\2\24\u00c1\3\2\2\2\26\u00c4\3"+
		"\2\2\2\30\u00c9\3\2\2\2\32\u00d8\3\2\2\2\34\u00e5\3\2\2\2\36\u00f9\3\2"+
		"\2\2 \u0104\3\2\2\2\"\u0106\3\2\2\2$\u0119\3\2\2\2&\u011b\3\2\2\2(\u0120"+
		"\3\2\2\2*\u0124\3\2\2\2,\u0142\3\2\2\2.\u01bd\3\2\2\2\60\61\5\26\f\2\61"+
		"\62\b\2\1\2\62;\3\2\2\2\63\64\7\34\2\2\64\65\5\2\2\2\65\66\b\2\1\2\66"+
		";\3\2\2\2\678\5\30\r\289\b\2\1\29;\3\2\2\2:\60\3\2\2\2:\63\3\2\2\2:\67"+
		"\3\2\2\2;\3\3\2\2\2<=\5\16\b\2=>\b\3\1\2>E\3\2\2\2?@\5\16\b\2@A\7\34\2"+
		"\2AB\5\4\3\2BC\b\3\1\2CE\3\2\2\2D<\3\2\2\2D?\3\2\2\2E\5\3\2\2\2FG\5\24"+
		"\13\2GH\b\4\1\2HP\3\2\2\2IJ\7/\2\2JP\b\4\1\2KL\7\63\2\2LP\b\4\1\2MN\7"+
		"\62\2\2NP\b\4\1\2OF\3\2\2\2OI\3\2\2\2OK\3\2\2\2OM\3\2\2\2P\7\3\2\2\2Q"+
		"S\5\16\b\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2\2\2VW\7\25\2"+
		"\2WX\5.\30\2XY\b\5\1\2Y\t\3\2\2\2Z[\5$\23\2[\\\b\6\1\2\\g\3\2\2\2]^\7"+
		"!\2\2^_\5\n\6\2_`\b\6\1\2`g\3\2\2\2ab\5$\23\2bc\7*\2\2cd\5\n\6\2de\b\6"+
		"\1\2eg\3\2\2\2fZ\3\2\2\2f]\3\2\2\2fa\3\2\2\2g\13\3\2\2\2hi\5.\30\2ij\7"+
		"\t\2\2jk\5\f\7\2kl\b\7\1\2lq\3\2\2\2mn\5.\30\2no\b\7\1\2oq\3\2\2\2ph\3"+
		"\2\2\2pm\3\2\2\2q\r\3\2\2\2rs\b\b\1\2st\7\32\2\2tu\5 \21\2uv\7\36\2\2"+
		"vw\b\b\1\2w\u00a9\3\2\2\2xy\7\32\2\2yz\5\22\n\2z{\7\36\2\2{|\b\b\1\2|"+
		"\u00a9\3\2\2\2}~\5\24\13\2~\177\b\b\1\2\177\u00a9\3\2\2\2\u0080\u0081"+
		"\7\32\2\2\u0081\u0082\5\16\b\2\u0082\u0083\7\36\2\2\u0083\u0084\b\b\1"+
		"\2\u0084\u00a9\3\2\2\2\u0085\u0086\7\22\2\2\u0086\u0088\5\16\b\2\u0087"+
		"\u0089\5*\26\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2"+
		"\2\2\u008a\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7(\2\2\u008d"+
		"\u008e\b\b\1\2\u008e\u00a9\3\2\2\2\u008f\u0090\5\20\t\2\u0090\u0091\b"+
		"\b\1\2\u0091\u00a9\3\2\2\2\u0092\u0093\7\61\2\2\u0093\u00a9\b\b\1\2\u0094"+
		"\u0095\7\22\2\2\u0095\u0096\5\16\b\2\u0096\u0097\7\30\2\2\u0097\u0098"+
		"\5\34\17\2\u0098\u0099\7(\2\2\u0099\u009a\b\b\1\2\u009a\u00a9\3\2\2\2"+
		"\u009b\u009c\5\6\4\2\u009c\u009d\b\b\1\2\u009d\u00a9\3\2\2\2\u009e\u009f"+
		"\7\22\2\2\u009f\u00a0\5\16\b\2\u00a0\u00a1\7(\2\2\u00a1\u00a2\b\b\1\2"+
		"\u00a2\u00a9\3\2\2\2\u00a3\u00a4\7\22\2\2\u00a4\u00a5\5\4\3\2\u00a5\u00a6"+
		"\7(\2\2\u00a6\u00a7\b\b\1\2\u00a7\u00a9\3\2\2\2\u00a8r\3\2\2\2\u00a8x"+
		"\3\2\2\2\u00a8}\3\2\2\2\u00a8\u0080\3\2\2\2\u00a8\u0085\3\2\2\2\u00a8"+
		"\u008f\3\2\2\2\u00a8\u0092\3\2\2\2\u00a8\u0094\3\2\2\2\u00a8\u009b\3\2"+
		"\2\2\u00a8\u009e\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9\u00b1\3\2\2\2\u00aa"+
		"\u00ab\f\b\2\2\u00ab\u00ac\7\3\2\2\u00ac\u00ad\5\20\t\2\u00ad\u00ae\b"+
		"\b\1\2\u00ae\u00b0\3\2\2\2\u00af\u00aa\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\17\3\2\2\2\u00b3\u00b1\3\2\2"+
		"\2\u00b4\u00b5\7\64\2\2\u00b5\u00b6\b\t\1\2\u00b6\21\3\2\2\2\u00b7\u00b8"+
		"\5\16\b\2\u00b8\u00b9\b\n\1\2\u00b9\u00c0\3\2\2\2\u00ba\u00bb\5\16\b\2"+
		"\u00bb\u00bc\7\7\2\2\u00bc\u00bd\5\22\n\2\u00bd\u00be\b\n\1\2\u00be\u00c0"+
		"\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00ba\3\2\2\2\u00c0\23\3\2\2\2\u00c1"+
		"\u00c2\7\60\2\2\u00c2\u00c3\b\13\1\2\u00c3\25\3\2\2\2\u00c4\u00c5\5\30"+
		"\r\2\u00c5\u00c6\7\34\2\2\u00c6\u00c7\5\2\2\2\u00c7\u00c8\b\f\1\2\u00c8"+
		"\27\3\2\2\2\u00c9\u00ca\5\16\b\2\u00ca\u00cb\7\25\2\2\u00cb\u00cc\5.\30"+
		"\2\u00cc\u00cd\b\r\1\2\u00cd\31\3\2\2\2\u00ce\u00cf\5.\30\2\u00cf\u00d0"+
		"\7\7\2\2\u00d0\u00d1\5\32\16\2\u00d1\u00d2\b\16\1\2\u00d2\u00d9\3\2\2"+
		"\2\u00d3\u00d4\5.\30\2\u00d4\u00d5\7\7\2\2\u00d5\u00d6\5.\30\2\u00d6\u00d7"+
		"\b\16\1\2\u00d7\u00d9\3\2\2\2\u00d8\u00ce\3\2\2\2\u00d8\u00d3\3\2\2\2"+
		"\u00d9\33\3\2\2\2\u00da\u00db\b\17\1\2\u00db\u00dc\7\22\2\2\u00dc\u00dd"+
		"\5\34\17\2\u00dd\u00de\7(\2\2\u00de\u00df\b\17\1\2\u00df\u00e6\3\2\2\2"+
		"\u00e0\u00e1\7\64\2\2\u00e1\u00e6\b\17\1\2\u00e2\u00e3\7\21\2\2\u00e3"+
		"\u00e4\7\64\2\2\u00e4\u00e6\b\17\1\2\u00e5\u00da\3\2\2\2\u00e5\u00e0\3"+
		"\2\2\2\u00e5\u00e2\3\2\2\2\u00e6\u00f6\3\2\2\2\u00e7\u00e8\f\5\2\2\u00e8"+
		"\u00e9\7\25\2\2\u00e9\u00ea\5\34\17\6\u00ea\u00eb\b\17\1\2\u00eb\u00f5"+
		"\3\2\2\2\u00ec\u00ee\f\3\2\2\u00ed\u00ef\5(\25\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f3\b\17\1\2\u00f3\u00f5\3\2\2\2\u00f4\u00e7\3\2\2\2\u00f4"+
		"\u00ec\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\35\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\5.\30\2\u00fa\u00fb"+
		"\b\20\1\2\u00fb\37\3\2\2\2\u00fc\u00fd\5\16\b\2\u00fd\u00fe\7\t\2\2\u00fe"+
		"\u00ff\5 \21\2\u00ff\u0100\b\21\1\2\u0100\u0105\3\2\2\2\u0101\u0102\5"+
		"\16\b\2\u0102\u0103\b\21\1\2\u0103\u0105\3\2\2\2\u0104\u00fc\3\2\2\2\u0104"+
		"\u0101\3\2\2\2\u0105!\3\2\2\2\u0106\u0107\7\24\2\2\u0107\u0108\5.\30\2"+
		"\u0108\u0109\b\22\1\2\u0109#\3\2\2\2\u010a\u010b\5\16\b\2\u010b\u010c"+
		"\7\n\2\2\u010c\u010d\5.\30\2\u010d\u010e\b\23\1\2\u010e\u011a\3\2\2\2"+
		"\u010f\u0111\5\20\t\2\u0110\u0112\5\16\b\2\u0111\u0110\3\2\2\2\u0112\u0113"+
		"\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0116\7\n\2\2\u0116\u0117\5.\30\2\u0117\u0118\b\23\1\2\u0118\u011a\3"+
		"\2\2\2\u0119\u010a\3\2\2\2\u0119\u010f\3\2\2\2\u011a%\3\2\2\2\u011b\u011c"+
		"\5\n\6\2\u011c\u011d\7%\2\2\u011d\u011e\5.\30\2\u011e\u011f\b\24\1\2\u011f"+
		"\'\3\2\2\2\u0120\u0121\7\23\2\2\u0121\u0122\5\34\17\2\u0122\u0123\b\25"+
		"\1\2\u0123)\3\2\2\2\u0124\u0125\7\24\2\2\u0125\u0126\5\16\b\2\u0126\u0127"+
		"\b\26\1\2\u0127+\3\2\2\2\u0128\u0129\b\27\1\2\u0129\u012a\7&\2\2\u012a"+
		"\u012b\5\2\2\2\u012b\u012c\b\27\1\2\u012c\u0143\3\2\2\2\u012d\u012e\5"+
		"\20\t\2\u012e\u012f\b\27\1\2\u012f\u0143\3\2\2\2\u0130\u0131\7$\2\2\u0131"+
		"\u0132\5,\27\2\u0132\u0133\7\'\2\2\u0133\u0134\b\27\1\2\u0134\u0143\3"+
		"\2\2\2\u0135\u0136\7\22\2\2\u0136\u0137\5,\27\2\u0137\u0138\7(\2\2\u0138"+
		"\u0139\b\27\1\2\u0139\u0143\3\2\2\2\u013a\u013b\7\4\2\2\u013b\u013c\5"+
		"\30\r\2\u013c\u013d\b\27\1\2\u013d\u0143\3\2\2\2\u013e\u013f\7\4\2\2\u013f"+
		"\u0140\5\b\5\2\u0140\u0141\b\27\1\2\u0141\u0143\3\2\2\2\u0142\u0128\3"+
		"\2\2\2\u0142\u012d\3\2\2\2\u0142\u0130\3\2\2\2\u0142\u0135\3\2\2\2\u0142"+
		"\u013a\3\2\2\2\u0142\u013e\3\2\2\2\u0143\u014a\3\2\2\2\u0144\u0145\f\b"+
		"\2\2\u0145\u0146\5.\30\2\u0146\u0147\b\27\1\2\u0147\u0149\3\2\2\2\u0148"+
		"\u0144\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b-\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\b\30\1\2\u014e\u014f"+
		"\7\17\2\2\u014f\u0150\5.\30\33\u0150\u0151\b\30\1\2\u0151\u01be\3\2\2"+
		"\2\u0152\u0153\7-\2\2\u0153\u0154\5.\30\21\u0154\u0155\b\30\1\2\u0155"+
		"\u01be\3\2\2\2\u0156\u0157\7\f\2\2\u0157\u0158\5.\30\2\u0158\u0159\7+"+
		"\2\2\u0159\u015a\5.\30\2\u015a\u015b\7#\2\2\u015b\u015c\5.\30\13\u015c"+
		"\u015d\b\30\1\2\u015d\u01be\3\2\2\2\u015e\u015f\7\f\2\2\u015f\u0160\5"+
		".\30\2\u0160\u0161\7+\2\2\u0161\u0162\5.\30\n\u0162\u0163\b\30\1\2\u0163"+
		"\u01be\3\2\2\2\u0164\u0165\5\20\t\2\u0165\u0166\b\30\1\2\u0166\u01be\3"+
		"\2\2\2\u0167\u0168\5\6\4\2\u0168\u0169\b\30\1\2\u0169\u01be\3\2\2\2\u016a"+
		"\u016b\7\22\2\2\u016b\u016c\5.\30\2\u016c\u016d\7(\2\2\u016d\u016e\b\30"+
		"\1\2\u016e\u01be\3\2\2\2\u016f\u0170\7$\2\2\u0170\u0171\5.\30\2\u0171"+
		"\u0172\7\'\2\2\u0172\u0173\b\30\1\2\u0173\u01be\3\2\2\2\u0174\u0175\7"+
		"\22\2\2\u0175\u0176\5.\30\2\u0176\u0177\7\30\2\2\u0177\u0178\5\34\17\2"+
		"\u0178\u0179\7(\2\2\u0179\u017a\b\30\1\2\u017a\u01be\3\2\2\2\u017b\u017c"+
		"\7\22\2\2\u017c\u017e\5.\30\2\u017d\u017f\5\"\22\2\u017e\u017d\3\2\2\2"+
		"\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181\u0182"+
		"\3\2\2\2\u0182\u0183\7(\2\2\u0183\u0184\b\30\1\2\u0184\u01be\3\2\2\2\u0185"+
		"\u0186\7\32\2\2\u0186\u0187\5\32\16\2\u0187\u0188\7\36\2\2\u0188\u0189"+
		"\b\30\1\2\u0189\u01be\3\2\2\2\u018a\u018b\7\32\2\2\u018b\u018c\5.\30\2"+
		"\u018c\u018d\7\36\2\2\u018d\u018e\b\30\1\2\u018e\u01be\3\2\2\2\u018f\u0190"+
		"\7\32\2\2\u0190\u0191\5\f\7\2\u0191\u0192\7\36\2\2\u0192\u0193\b\30\1"+
		"\2\u0193\u01be\3\2\2\2\u0194\u0195\7\5\2\2\u0195\u0196\5.\30\2\u0196\u0197"+
		"\7\20\2\2\u0197\u0198\5.\30\2\u0198\u0199\7\26\2\2\u0199\u019a\b\30\1"+
		"\2\u019a\u01be\3\2\2\2\u019b\u019c\7\13\2\2\u019c\u019d\5\20\t\2\u019d"+
		"\u019e\7\n\2\2\u019e\u019f\5.\30\2\u019f\u01a0\7)\2\2\u01a0\u01a1\5.\30"+
		"\2\u01a1\u01a2\7\20\2\2\u01a2\u01a3\5.\30\2\u01a3\u01a4\7\26\2\2\u01a4"+
		"\u01a5\b\30\1\2\u01a5\u01be\3\2\2\2\u01a6\u01a7\7\13\2\2\u01a7\u01a8\5"+
		"\20\t\2\u01a8\u01a9\7\n\2\2\u01a9\u01aa\5.\30\2\u01aa\u01ab\7\27\2\2\u01ab"+
		"\u01ac\5.\30\2\u01ac\u01ad\7\20\2\2\u01ad\u01ae\5.\30\2\u01ae\u01af\7"+
		"\26\2\2\u01af\u01b0\b\30\1\2\u01b0\u01be\3\2\2\2\u01b1\u01b2\7\"\2\2\u01b2"+
		"\u01b3\5.\30\2\u01b3\u01b4\7\35\2\2\u01b4\u01b5\5\2\2\2\u01b5\u01b6\b"+
		"\30\1\2\u01b6\u01be\3\2\2\2\u01b7\u01b8\5,\27\2\u01b8\u01b9\b\30\1\2\u01b9"+
		"\u01be\3\2\2\2\u01ba\u01bb\5&\24\2\u01bb\u01bc\b\30\1\2\u01bc\u01be\3"+
		"\2\2\2\u01bd\u014d\3\2\2\2\u01bd\u0152\3\2\2\2\u01bd\u0156\3\2\2\2\u01bd"+
		"\u015e\3\2\2\2\u01bd\u0164\3\2\2\2\u01bd\u0167\3\2\2\2\u01bd\u016a\3\2"+
		"\2\2\u01bd\u016f\3\2\2\2\u01bd\u0174\3\2\2\2\u01bd\u017b\3\2\2\2\u01bd"+
		"\u0185\3\2\2\2\u01bd\u018a\3\2\2\2\u01bd\u018f\3\2\2\2\u01bd\u0194\3\2"+
		"\2\2\u01bd\u019b\3\2\2\2\u01bd\u01a6\3\2\2\2\u01bd\u01b1\3\2\2\2\u01bd"+
		"\u01b7\3\2\2\2\u01bd\u01ba\3\2\2\2\u01be\u01df\3\2\2\2\u01bf\u01c0\f\20"+
		"\2\2\u01c0\u01c1\7\23\2\2\u01c1\u01c2\5.\30\21\u01c2\u01c3\b\30\1\2\u01c3"+
		"\u01de\3\2\2\2\u01c4\u01c5\f\17\2\2\u01c5\u01c6\7,\2\2\u01c6\u01c7\5."+
		"\30\20\u01c7\u01c8\b\30\1\2\u01c8\u01de\3\2\2\2\u01c9\u01ca\f\16\2\2\u01ca"+
		"\u01cb\t\2\2\2\u01cb\u01cc\5.\30\17\u01cc\u01cd\b\30\1\2\u01cd\u01de\3"+
		"\2\2\2\u01ce\u01cf\f\r\2\2\u01cf\u01d0\t\3\2\2\u01d0\u01d1\5.\30\16\u01d1"+
		"\u01d2\b\30\1\2\u01d2\u01de\3\2\2\2\u01d3\u01d4\f\f\2\2\u01d4\u01d5\t"+
		"\4\2\2\u01d5\u01d6\5.\30\r\u01d6\u01d7\b\30\1\2\u01d7\u01de\3\2\2\2\u01d8"+
		"\u01d9\f\6\2\2\u01d9\u01da\7\7\2\2\u01da\u01db\5.\30\7\u01db\u01dc\b\30"+
		"\1\2\u01dc\u01de\3\2\2\2\u01dd\u01bf\3\2\2\2\u01dd\u01c4\3\2\2\2\u01dd"+
		"\u01c9\3\2\2\2\u01dd\u01ce\3\2\2\2\u01dd\u01d3\3\2\2\2\u01dd\u01d8\3\2"+
		"\2\2\u01de\u01e1\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0"+
		"/\3\2\2\2\u01e1\u01df\3\2\2\2\32:DOTfp\u008a\u00a8\u00b1\u00bf\u00d8\u00e5"+
		"\u00f0\u00f4\u00f6\u0104\u0113\u0119\u0142\u014a\u0180\u01bd\u01dd\u01df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}