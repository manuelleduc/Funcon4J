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
		T__38=1, T__37=2, T__36=3, T__35=4, T__34=5, T__33=6, T__32=7, T__31=8, 
		T__30=9, T__29=10, T__28=11, T__27=12, T__26=13, T__25=14, T__24=15, T__23=16, 
		T__22=17, T__21=18, T__20=19, T__19=20, T__18=21, T__17=22, T__16=23, 
		T__15=24, T__14=25, T__13=26, T__12=27, T__11=28, T__10=29, T__9=30, T__8=31, 
		T__7=32, T__6=33, T__5=34, T__4=35, T__3=36, T__2=37, T__1=38, T__0=39, 
		WS=40, NULLTOKEN=41, EMPTYLISTTOKEN=42, WILDCARDTOKEN=43, BOOLTOKEN=44, 
		NUMTOKEN=45, IDTOKEN=46;
	public static final String[] tokenNames = {
		"<INVALID>", "'as'", "'fun'", "'||'", "'while'", "';'", "'&&'", "'='", 
		"'for'", "'if'", "'<='", "'&'", "'print'", "'do'", "'('", "'*'", "','", 
		"'->'", "'done'", "'to'", "':'", "'>='", "'<'", "'|'", "'with'", "'>'", 
		"'or'", "'let'", "'match'", "'else'", "'begin'", "'in'", "'function'", 
		"'end'", "')'", "'downto'", "'and'", "'+'", "'then'", "'not'", "WS", "NULLTOKEN", 
		"EMPTYLISTTOKEN", "'_'", "BOOLTOKEN", "NUMTOKEN", "IDTOKEN"
	};
	public static final int
		RULE_pattmatch = 0, RULE_optionalpattremainder = 1, RULE_constant = 2, 
		RULE_pattmatchcurried = 3, RULE_decl = 4, RULE_patt = 5, RULE_ident = 6, 
		RULE_type = 7, RULE_emptylist = 8, RULE_pattmatchsingle = 9, RULE_pattmatchmultiple = 10, 
		RULE_prog = 11, RULE_exptuple = 12, RULE_declpattmono = 13, RULE_letExp = 14, 
		RULE_patttuple = 15, RULE_function = 16, RULE_exp = 17;
	public static final String[] ruleNames = {
		"pattmatch", "optionalpattremainder", "constant", "pattmatchcurried", 
		"decl", "patt", "ident", "type", "emptylist", "pattmatchsingle", "pattmatchmultiple", 
		"prog", "exptuple", "declpattmono", "letExp", "patttuple", "function", 
		"exp"
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
		public PattmatchmultipleContext pattmatchmultiple_0;
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
			setState(46);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36); match(23);
				setState(37); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40); ((PattmatchContext)_localctx).pattmatchmultiple_0 = pattmatchmultiple();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch2((((PattmatchContext)_localctx).pattmatchmultiple_0._pattmatchmultiple));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
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
			setState(56);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); ((OptionalpattremainderContext)_localctx).patt_0 = patt(0);
				setState(49); match(23);
				setState(50); ((OptionalpattremainderContext)_localctx).optionalpattremainder_1 = optionalpattremainder();
				((OptionalpattremainderContext)_localctx)._optionalpattremainder =  builder.optionalPattRemainderMulti((((OptionalpattremainderContext)_localctx).patt_0._patt),(((OptionalpattremainderContext)_localctx).optionalpattremainder_1._optionalpattremainder));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53); ((OptionalpattremainderContext)_localctx).patt_0 = patt(0);
				((OptionalpattremainderContext)_localctx)._optionalpattremainder =  builder.optionalPattRemainderSingle((((OptionalpattremainderContext)_localctx).patt_0._patt));
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
			setState(67);
			switch (_input.LA(1)) {
			case EMPTYLISTTOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); ((ConstantContext)_localctx).emptylist_0 = emptylist();
				((ConstantContext)_localctx)._constant =  builder.emptyListConstant((((ConstantContext)_localctx).emptylist_0._emptylist));
				}
				break;
			case NULLTOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(61); ((ConstantContext)_localctx).NULLTOKEN_0 = match(NULLTOKEN);
				((ConstantContext)_localctx)._constant =  builder.null_(nulltoken((((ConstantContext)_localctx).NULLTOKEN_0!=null?((ConstantContext)_localctx).NULLTOKEN_0.getText():null)));
				}
				break;
			case NUMTOKEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(63); ((ConstantContext)_localctx).NUMTOKEN_0 = match(NUMTOKEN);
				((ConstantContext)_localctx)._constant =  builder.int_(numtoken((((ConstantContext)_localctx).NUMTOKEN_0!=null?((ConstantContext)_localctx).NUMTOKEN_0.getText():null)));
				}
				break;
			case BOOLTOKEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(65); ((ConstantContext)_localctx).BOOLTOKEN_0 = match(BOOLTOKEN);
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
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(69); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << NULLTOKEN) | (1L << EMPTYLISTTOKEN) | (1L << WILDCARDTOKEN) | (1L << BOOLTOKEN) | (1L << NUMTOKEN) | (1L << IDTOKEN))) != 0) );
			setState(74); match(17);
			setState(75); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
		public PattContext patt_0;
		public ExpContext exp_1;
		public DeclContext decl_0;
		public DeclpattmonoContext declpattmono_0;
		public DeclContext decl_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public DeclpattmonoContext declpattmono() {
			return getRuleContext(DeclpattmonoContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
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
			setState(92);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78); ((DeclContext)_localctx).patt_0 = patt(0);
				setState(79); match(7);
				setState(80); ((DeclContext)_localctx).exp_1 = exp(0);
				((DeclContext)_localctx)._decl =  builder.declBindPatt((((DeclContext)_localctx).patt_0._patt),(((DeclContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83); match(27);
				setState(84); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87); ((DeclContext)_localctx).declpattmono_0 = declpattmono();
				setState(88); match(36);
				setState(89); ((DeclContext)_localctx).decl_1 = decl();
				((DeclContext)_localctx)._decl =  builder.andDecl((((DeclContext)_localctx).declpattmono_0._declpattmono),(((DeclContext)_localctx).decl_1._decl));
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
		public PatttupleContext patttuple;
		public List<PatttupleContext> patttuple_1_list = new ArrayList<PatttupleContext>();
		public Token WILDCARDTOKEN_0;
		public ConstantContext constant_0;
		public OptionalpattremainderContext optionalpattremainder_0;
		public TypeContext type_1;
		public IdentContext ident_0;
		public IdentContext ident_1;
		public PatttupleContext patttuple(int i) {
			return getRuleContext(PatttupleContext.class,i);
		}
		public List<PatttupleContext> patttuple() {
			return getRuleContexts(PatttupleContext.class);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_patt, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(95); match(14);
				setState(96); ((PattContext)_localctx).patt_0 = patt(0);
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==16 );
				setState(102); match(34);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 2:
				{
				setState(105); ((PattContext)_localctx).WILDCARDTOKEN_0 = match(WILDCARDTOKEN);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcardtoken((((PattContext)_localctx).WILDCARDTOKEN_0!=null?((PattContext)_localctx).WILDCARDTOKEN_0.getText():null)));
				}
				break;

			case 3:
				{
				setState(107); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 4:
				{
				setState(110); match(14);
				setState(111); ((PattContext)_localctx).optionalpattremainder_0 = optionalpattremainder();
				setState(112); match(34);
				((PattContext)_localctx)._patt =  builder.optionalPatt((((PattContext)_localctx).optionalpattremainder_0._optionalpattremainder));
				}
				break;

			case 5:
				{
				setState(115); match(14);
				setState(116); ((PattContext)_localctx).patt_0 = patt(0);
				setState(117); match(20);
				setState(118); ((PattContext)_localctx).type_1 = type();
				setState(119); match(34);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 6:
				{
				setState(122); match(14);
				setState(123); ((PattContext)_localctx).patt_0 = patt(0);
				setState(124); match(34);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 7:
				{
				setState(127); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PattContext(_parentctx, _parentState);
					_localctx.patt_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_patt);
					setState(132);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(133); match(1);
					setState(134); ((PattContext)_localctx).ident_1 = ident();
					((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(142); ((IdentContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
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

	public static class TypeContext extends ParserRuleContext {
		public Object _type;
		public Token IDTOKEN_0;
		public TerminalNode IDTOKEN() { return getToken(CLParser.IDTOKEN, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); ((TypeContext)_localctx).IDTOKEN_0 = match(IDTOKEN);
			((TypeContext)_localctx)._type =  builder.typeId(idtoken((((TypeContext)_localctx).IDTOKEN_0!=null?((TypeContext)_localctx).IDTOKEN_0.getText():null)));
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 16, RULE_emptylist);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); ((EmptylistContext)_localctx).EMPTYLISTTOKEN_0 = match(EMPTYLISTTOKEN);
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
			setState(151); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(152); match(17);
			setState(153); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 20, RULE_pattmatchmultiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156); ((PattmatchmultipleContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
			setState(157); match(23);
			setState(158); ((PattmatchmultipleContext)_localctx).pattmatch_1 = pattmatch();
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
		enterRule(_localctx, 22, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161); ((ProgContext)_localctx).exp_0 = exp(0);
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
		enterRule(_localctx, 24, RULE_exptuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(16);
			setState(165); ((ExptupleContext)_localctx).exp_0 = exp(0);
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

	public static class DeclpattmonoContext extends ParserRuleContext {
		public Object _declpattmono;
		public PattContext patt_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public DeclpattmonoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declpattmono; }
	}

	public final DeclpattmonoContext declpattmono() throws RecognitionException {
		DeclpattmonoContext _localctx = new DeclpattmonoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_declpattmono);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); ((DeclpattmonoContext)_localctx).patt_0 = patt(0);
			setState(169); match(7);
			setState(170); ((DeclpattmonoContext)_localctx).exp_1 = exp(0);
			((DeclpattmonoContext)_localctx)._declpattmono =  builder.declBindPattMono((((DeclpattmonoContext)_localctx).patt_0._patt),(((DeclpattmonoContext)_localctx).exp_1._exp));
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 28, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173); ((LetExpContext)_localctx).decl_0 = decl();
			setState(174); match(31);
			setState(175); ((LetExpContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 30, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178); match(16);
			setState(179); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(183); match(32);
				setState(184); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(187); match(14);
				setState(188); ((FunctionContext)_localctx).function_0 = function(0);
				setState(189); match(34);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(192); match(30);
				setState(193); ((FunctionContext)_localctx).function_0 = function(0);
				setState(194); match(33);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 4:
				{
				setState(197); ((FunctionContext)_localctx).ident_0 = ident();
				((FunctionContext)_localctx)._function =  builder.functionId((((FunctionContext)_localctx).ident_0._ident));
				}
				break;

			case 5:
				{
				setState(200); match(2);
				setState(201); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(204); match(2);
				setState(205); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(210);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(211); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public ExpContext exp_3;
		public PattmatchContext pattmatch_1;
		public ConstantContext constant_0;
		public LetExpContext letExp_0;
		public ExptupleContext exptuple;
		public List<ExptupleContext> exptuple_1_list = new ArrayList<ExptupleContext>();
		public FunctionContext function_0;
		public Token op_80;
		public TypeContext type_1;
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
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<ExptupleContext> exptuple() {
			return getRuleContexts(ExptupleContext.class);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(220); match(12);
				setState(221); ((ExpContext)_localctx).exp_0 = exp(22);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(224); match(9);
				setState(225); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(226); match(38);
				setState(227); ((ExpContext)_localctx).exp_1 = exp(21);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 3:
				{
				setState(230); match(9);
				setState(231); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(232); match(38);
				setState(233); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(234); match(29);
				setState(235); ((ExpContext)_localctx).exp_2 = exp(16);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 4:
				{
				setState(238); match(39);
				setState(239); ((ExpContext)_localctx).exp_0 = exp(4);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(242); match(8);
				setState(243); ((ExpContext)_localctx).ident_0 = ident();
				setState(244); match(7);
				setState(245); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(246); match(35);
				setState(247); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(248); match(13);
				setState(249); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(250); match(18);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 6:
				{
				setState(253); match(8);
				setState(254); ((ExpContext)_localctx).ident_0 = ident();
				setState(255); match(7);
				setState(256); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(257); match(19);
				setState(258); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(259); match(13);
				setState(260); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(261); match(18);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 7:
				{
				setState(264); match(28);
				setState(265); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(266); match(24);
				setState(267); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 8:
				{
				setState(270); match(4);
				setState(271); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(272); match(13);
				setState(273); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(274); match(18);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 9:
				{
				setState(277); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 10:
				{
				setState(280); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 11:
				{
				setState(283); match(30);
				setState(284); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(285); match(33);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 12:
				{
				setState(288); match(14);
				setState(289); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(290); match(34);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(293); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;

			case 14:
				{
				setState(296); match(14);
				setState(297); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(299); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(298); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(301); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==16 );
				setState(303); match(34);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;

			case 15:
				{
				setState(306); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(346);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(311);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(312); match(5);
						setState(313); ((ExpContext)_localctx).exp_1 = exp(20);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(316);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(317); match(15);
						setState(318); ((ExpContext)_localctx).exp_1 = exp(8);
						((ExpContext)_localctx)._exp =  builder.intMultiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(321);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(322); match(37);
						setState(323); ((ExpContext)_localctx).exp_1 = exp(7);
						((ExpContext)_localctx)._exp =  builder.intAdd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(326);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(327);
						((ExpContext)_localctx).op_80 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 10) | (1L << 21) | (1L << 22) | (1L << 25))) != 0)) ) {
							((ExpContext)_localctx).op_80 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(328); ((ExpContext)_localctx).exp_1 = exp(6);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(331);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(332);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==11) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(333); ((ExpContext)_localctx).exp_1 = exp(4);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(336);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(337);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==26) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(338); ((ExpContext)_localctx).exp_1 = exp(3);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(341);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(342); match(20);
						setState(343); ((ExpContext)_localctx).type_1 = type();
						((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
						}
						break;
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		case 5: return patt_sempred((PattContext)_localctx, predIndex);

		case 16: return function_sempred((FunctionContext)_localctx, predIndex);

		case 17: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean patt_sempred(PattContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 19);

		case 3: return precpred(_ctx, 7);

		case 4: return precpred(_ctx, 6);

		case 5: return precpred(_ctx, 5);

		case 6: return precpred(_ctx, 3);

		case 7: return precpred(_ctx, 2);

		case 8: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\60\u0162\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\61\n\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4F\n\4\3\5\6\5I\n\5\r\5\16\5J\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6_\n\6\3\7\3\7\3\7\3\7\6\7e\n\7\r"+
		"\7\16\7f\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0085\n\7\3\7\3"+
		"\7\3\7\3\7\3\7\7\7\u008c\n\7\f\7\16\7\u008f\13\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\5\22\u00d3\n\22\3\22\3\22\3\22\3\22\7\22\u00d9\n\22\f\22"+
		"\16\22\u00dc\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\6"+
		"\23\u012e\n\23\r\23\16\23\u012f\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0138"+
		"\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u015d\n\23\f\23\16\23\u0160"+
		"\13\23\3\23\2\5\f\"$\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$\2\5"+
		"\6\2\t\t\f\f\27\30\33\33\4\2\b\b\r\r\4\2\5\5\34\34\u017c\2\60\3\2\2\2"+
		"\4:\3\2\2\2\6E\3\2\2\2\bH\3\2\2\2\n^\3\2\2\2\f\u0084\3\2\2\2\16\u0090"+
		"\3\2\2\2\20\u0093\3\2\2\2\22\u0096\3\2\2\2\24\u0099\3\2\2\2\26\u009e\3"+
		"\2\2\2\30\u00a3\3\2\2\2\32\u00a6\3\2\2\2\34\u00aa\3\2\2\2\36\u00af\3\2"+
		"\2\2 \u00b4\3\2\2\2\"\u00d2\3\2\2\2$\u0137\3\2\2\2&\'\7\31\2\2\'(\5\2"+
		"\2\2()\b\2\1\2)\61\3\2\2\2*+\5\26\f\2+,\b\2\1\2,\61\3\2\2\2-.\5\24\13"+
		"\2./\b\2\1\2/\61\3\2\2\2\60&\3\2\2\2\60*\3\2\2\2\60-\3\2\2\2\61\3\3\2"+
		"\2\2\62\63\5\f\7\2\63\64\7\31\2\2\64\65\5\4\3\2\65\66\b\3\1\2\66;\3\2"+
		"\2\2\678\5\f\7\289\b\3\1\29;\3\2\2\2:\62\3\2\2\2:\67\3\2\2\2;\5\3\2\2"+
		"\2<=\5\22\n\2=>\b\4\1\2>F\3\2\2\2?@\7+\2\2@F\b\4\1\2AB\7/\2\2BF\b\4\1"+
		"\2CD\7.\2\2DF\b\4\1\2E<\3\2\2\2E?\3\2\2\2EA\3\2\2\2EC\3\2\2\2F\7\3\2\2"+
		"\2GI\5\f\7\2HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KL\3\2\2\2LM\7\23"+
		"\2\2MN\5$\23\2NO\b\5\1\2O\t\3\2\2\2PQ\5\f\7\2QR\7\t\2\2RS\5$\23\2ST\b"+
		"\6\1\2T_\3\2\2\2UV\7\35\2\2VW\5\n\6\2WX\b\6\1\2X_\3\2\2\2YZ\5\34\17\2"+
		"Z[\7&\2\2[\\\5\n\6\2\\]\b\6\1\2]_\3\2\2\2^P\3\2\2\2^U\3\2\2\2^Y\3\2\2"+
		"\2_\13\3\2\2\2`a\b\7\1\2ab\7\20\2\2bd\5\f\7\2ce\5 \21\2dc\3\2\2\2ef\3"+
		"\2\2\2fd\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7$\2\2ij\b\7\1\2j\u0085\3\2\2\2"+
		"kl\7-\2\2l\u0085\b\7\1\2mn\5\6\4\2no\b\7\1\2o\u0085\3\2\2\2pq\7\20\2\2"+
		"qr\5\4\3\2rs\7$\2\2st\b\7\1\2t\u0085\3\2\2\2uv\7\20\2\2vw\5\f\7\2wx\7"+
		"\26\2\2xy\5\20\t\2yz\7$\2\2z{\b\7\1\2{\u0085\3\2\2\2|}\7\20\2\2}~\5\f"+
		"\7\2~\177\7$\2\2\177\u0080\b\7\1\2\u0080\u0085\3\2\2\2\u0081\u0082\5\16"+
		"\b\2\u0082\u0083\b\7\1\2\u0083\u0085\3\2\2\2\u0084`\3\2\2\2\u0084k\3\2"+
		"\2\2\u0084m\3\2\2\2\u0084p\3\2\2\2\u0084u\3\2\2\2\u0084|\3\2\2\2\u0084"+
		"\u0081\3\2\2\2\u0085\u008d\3\2\2\2\u0086\u0087\f\7\2\2\u0087\u0088\7\3"+
		"\2\2\u0088\u0089\5\16\b\2\u0089\u008a\b\7\1\2\u008a\u008c\3\2\2\2\u008b"+
		"\u0086\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\r\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0091\7\60\2\2\u0091\u0092"+
		"\b\b\1\2\u0092\17\3\2\2\2\u0093\u0094\7\60\2\2\u0094\u0095\b\t\1\2\u0095"+
		"\21\3\2\2\2\u0096\u0097\7,\2\2\u0097\u0098\b\n\1\2\u0098\23\3\2\2\2\u0099"+
		"\u009a\5\f\7\2\u009a\u009b\7\23\2\2\u009b\u009c\5$\23\2\u009c\u009d\b"+
		"\13\1\2\u009d\25\3\2\2\2\u009e\u009f\5\24\13\2\u009f\u00a0\7\31\2\2\u00a0"+
		"\u00a1\5\2\2\2\u00a1\u00a2\b\f\1\2\u00a2\27\3\2\2\2\u00a3\u00a4\5$\23"+
		"\2\u00a4\u00a5\b\r\1\2\u00a5\31\3\2\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8"+
		"\5$\23\2\u00a8\u00a9\b\16\1\2\u00a9\33\3\2\2\2\u00aa\u00ab\5\f\7\2\u00ab"+
		"\u00ac\7\t\2\2\u00ac\u00ad\5$\23\2\u00ad\u00ae\b\17\1\2\u00ae\35\3\2\2"+
		"\2\u00af\u00b0\5\n\6\2\u00b0\u00b1\7!\2\2\u00b1\u00b2\5$\23\2\u00b2\u00b3"+
		"\b\20\1\2\u00b3\37\3\2\2\2\u00b4\u00b5\7\22\2\2\u00b5\u00b6\5\f\7\2\u00b6"+
		"\u00b7\b\21\1\2\u00b7!\3\2\2\2\u00b8\u00b9\b\22\1\2\u00b9\u00ba\7\"\2"+
		"\2\u00ba\u00bb\5\2\2\2\u00bb\u00bc\b\22\1\2\u00bc\u00d3\3\2\2\2\u00bd"+
		"\u00be\7\20\2\2\u00be\u00bf\5\"\22\2\u00bf\u00c0\7$\2\2\u00c0\u00c1\b"+
		"\22\1\2\u00c1\u00d3\3\2\2\2\u00c2\u00c3\7 \2\2\u00c3\u00c4\5\"\22\2\u00c4"+
		"\u00c5\7#\2\2\u00c5\u00c6\b\22\1\2\u00c6\u00d3\3\2\2\2\u00c7\u00c8\5\16"+
		"\b\2\u00c8\u00c9\b\22\1\2\u00c9\u00d3\3\2\2\2\u00ca\u00cb\7\4\2\2\u00cb"+
		"\u00cc\5\24\13\2\u00cc\u00cd\b\22\1\2\u00cd\u00d3\3\2\2\2\u00ce\u00cf"+
		"\7\4\2\2\u00cf\u00d0\5\b\5\2\u00d0\u00d1\b\22\1\2\u00d1\u00d3\3\2\2\2"+
		"\u00d2\u00b8\3\2\2\2\u00d2\u00bd\3\2\2\2\u00d2\u00c2\3\2\2\2\u00d2\u00c7"+
		"\3\2\2\2\u00d2\u00ca\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3\u00da\3\2\2\2\u00d4"+
		"\u00d5\f\5\2\2\u00d5\u00d6\5$\23\2\u00d6\u00d7\b\22\1\2\u00d7\u00d9\3"+
		"\2\2\2\u00d8\u00d4\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00db#\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\b\23\1\2"+
		"\u00de\u00df\7\16\2\2\u00df\u00e0\5$\23\30\u00e0\u00e1\b\23\1\2\u00e1"+
		"\u0138\3\2\2\2\u00e2\u00e3\7\13\2\2\u00e3\u00e4\5$\23\2\u00e4\u00e5\7"+
		"(\2\2\u00e5\u00e6\5$\23\27\u00e6\u00e7\b\23\1\2\u00e7\u0138\3\2\2\2\u00e8"+
		"\u00e9\7\13\2\2\u00e9\u00ea\5$\23\2\u00ea\u00eb\7(\2\2\u00eb\u00ec\5$"+
		"\23\2\u00ec\u00ed\7\37\2\2\u00ed\u00ee\5$\23\22\u00ee\u00ef\b\23\1\2\u00ef"+
		"\u0138\3\2\2\2\u00f0\u00f1\7)\2\2\u00f1\u00f2\5$\23\6\u00f2\u00f3\b\23"+
		"\1\2\u00f3\u0138\3\2\2\2\u00f4\u00f5\7\n\2\2\u00f5\u00f6\5\16\b\2\u00f6"+
		"\u00f7\7\t\2\2\u00f7\u00f8\5$\23\2\u00f8\u00f9\7%\2\2\u00f9\u00fa\5$\23"+
		"\2\u00fa\u00fb\7\17\2\2\u00fb\u00fc\5$\23\2\u00fc\u00fd\7\24\2\2\u00fd"+
		"\u00fe\b\23\1\2\u00fe\u0138\3\2\2\2\u00ff\u0100\7\n\2\2\u0100\u0101\5"+
		"\16\b\2\u0101\u0102\7\t\2\2\u0102\u0103\5$\23\2\u0103\u0104\7\25\2\2\u0104"+
		"\u0105\5$\23\2\u0105\u0106\7\17\2\2\u0106\u0107\5$\23\2\u0107\u0108\7"+
		"\24\2\2\u0108\u0109\b\23\1\2\u0109\u0138\3\2\2\2\u010a\u010b\7\36\2\2"+
		"\u010b\u010c\5$\23\2\u010c\u010d\7\32\2\2\u010d\u010e\5\2\2\2\u010e\u010f"+
		"\b\23\1\2\u010f\u0138\3\2\2\2\u0110\u0111\7\6\2\2\u0111\u0112\5$\23\2"+
		"\u0112\u0113\7\17\2\2\u0113\u0114\5$\23\2\u0114\u0115\7\24\2\2\u0115\u0116"+
		"\b\23\1\2\u0116\u0138\3\2\2\2\u0117\u0118\5\6\4\2\u0118\u0119\b\23\1\2"+
		"\u0119\u0138\3\2\2\2\u011a\u011b\5\16\b\2\u011b\u011c\b\23\1\2\u011c\u0138"+
		"\3\2\2\2\u011d\u011e\7 \2\2\u011e\u011f\5$\23\2\u011f\u0120\7#\2\2\u0120"+
		"\u0121\b\23\1\2\u0121\u0138\3\2\2\2\u0122\u0123\7\20\2\2\u0123\u0124\5"+
		"$\23\2\u0124\u0125\7$\2\2\u0125\u0126\b\23\1\2\u0126\u0138\3\2\2\2\u0127"+
		"\u0128\5\36\20\2\u0128\u0129\b\23\1\2\u0129\u0138\3\2\2\2\u012a\u012b"+
		"\7\20\2\2\u012b\u012d\5$\23\2\u012c\u012e\5\32\16\2\u012d\u012c\3\2\2"+
		"\2\u012e\u012f\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131"+
		"\3\2\2\2\u0131\u0132\7$\2\2\u0132\u0133\b\23\1\2\u0133\u0138\3\2\2\2\u0134"+
		"\u0135\5\"\22\2\u0135\u0136\b\23\1\2\u0136\u0138\3\2\2\2\u0137\u00dd\3"+
		"\2\2\2\u0137\u00e2\3\2\2\2\u0137\u00e8\3\2\2\2\u0137\u00f0\3\2\2\2\u0137"+
		"\u00f4\3\2\2\2\u0137\u00ff\3\2\2\2\u0137\u010a\3\2\2\2\u0137\u0110\3\2"+
		"\2\2\u0137\u0117\3\2\2\2\u0137\u011a\3\2\2\2\u0137\u011d\3\2\2\2\u0137"+
		"\u0122\3\2\2\2\u0137\u0127\3\2\2\2\u0137\u012a\3\2\2\2\u0137\u0134\3\2"+
		"\2\2\u0138\u015e\3\2\2\2\u0139\u013a\f\25\2\2\u013a\u013b\7\7\2\2\u013b"+
		"\u013c\5$\23\26\u013c\u013d\b\23\1\2\u013d\u015d\3\2\2\2\u013e\u013f\f"+
		"\t\2\2\u013f\u0140\7\21\2\2\u0140\u0141\5$\23\n\u0141\u0142\b\23\1\2\u0142"+
		"\u015d\3\2\2\2\u0143\u0144\f\b\2\2\u0144\u0145\7\'\2\2\u0145\u0146\5$"+
		"\23\t\u0146\u0147\b\23\1\2\u0147\u015d\3\2\2\2\u0148\u0149\f\7\2\2\u0149"+
		"\u014a\t\2\2\2\u014a\u014b\5$\23\b\u014b\u014c\b\23\1\2\u014c\u015d\3"+
		"\2\2\2\u014d\u014e\f\5\2\2\u014e\u014f\t\3\2\2\u014f\u0150\5$\23\6\u0150"+
		"\u0151\b\23\1\2\u0151\u015d\3\2\2\2\u0152\u0153\f\4\2\2\u0153\u0154\t"+
		"\4\2\2\u0154\u0155\5$\23\5\u0155\u0156\b\23\1\2\u0156\u015d\3\2\2\2\u0157"+
		"\u0158\f\f\2\2\u0158\u0159\7\26\2\2\u0159\u015a\5\20\t\2\u015a\u015b\b"+
		"\23\1\2\u015b\u015d\3\2\2\2\u015c\u0139\3\2\2\2\u015c\u013e\3\2\2\2\u015c"+
		"\u0143\3\2\2\2\u015c\u0148\3\2\2\2\u015c\u014d\3\2\2\2\u015c\u0152\3\2"+
		"\2\2\u015c\u0157\3\2\2\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f%\3\2\2\2\u0160\u015e\3\2\2\2\20\60:EJ^f\u0084\u008d"+
		"\u00d2\u00da\u012f\u0137\u015c\u015e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}