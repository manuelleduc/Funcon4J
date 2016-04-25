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
		WILDCARD=40, WS=41, NUM=42, BOOL=43, ID=44;
	public static final String[] tokenNames = {
		"<INVALID>", "'as'", "'fun'", "'||'", "';'", "'while'", "'&&'", "'='", 
		"'for'", "'if'", "'<='", "'&'", "'print'", "'do'", "'('", "'*'", "','", 
		"'->'", "'done'", "'to'", "':'", "'>='", "'<'", "'|'", "'with'", "'>'", 
		"'or'", "'let'", "'match'", "'else'", "'begin'", "'in'", "'function'", 
		"'end'", "')'", "'downto'", "'and'", "'+'", "'then'", "'not'", "'_'", 
		"WS", "NUM", "BOOL", "ID"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_pattmatchcurried = 2, RULE_decl = 3, 
		RULE_patt = 4, RULE_ident = 5, RULE_type = 6, RULE_pattmatchmultiple = 7, 
		RULE_pattmatchsingle = 8, RULE_prog = 9, RULE_exptuple = 10, RULE_declpattmono = 11, 
		RULE_letExp = 12, RULE_patttuple = 13, RULE_function = 14, RULE_exp = 15;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "pattmatchcurried", "decl", "patt", "ident", 
		"type", "pattmatchmultiple", "pattmatchsingle", "prog", "exptuple", "declpattmono", 
		"letExp", "patttuple", "function", "exp"
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
		public PattmatchContext pattmatch_0;
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
			setState(42);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch1((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35); match(23);
				setState(36); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39); ((PattmatchContext)_localctx).pattmatchmultiple_0 = pattmatchmultiple();
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

	public static class ConstantContext extends ParserRuleContext {
		public Object _constant;
		public Token NUM_0;
		public Token BOOL_0;
		public TerminalNode BOOL() { return getToken(CLParser.BOOL, 0); }
		public TerminalNode NUM() { return getToken(CLParser.NUM, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constant);
		try {
			setState(48);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); ((ConstantContext)_localctx).NUM_0 = match(NUM);
				((ConstantContext)_localctx)._constant =  builder.int_(num((((ConstantContext)_localctx).NUM_0!=null?((ConstantContext)_localctx).NUM_0.getText():null)));
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(46); ((ConstantContext)_localctx).BOOL_0 = match(BOOL);
				((ConstantContext)_localctx)._constant =  builder.bool(bool((((ConstantContext)_localctx).BOOL_0!=null?((ConstantContext)_localctx).BOOL_0.getText():null)));
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
		enterRule(_localctx, 4, RULE_pattmatchcurried);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50); ((PattmatchcurriedContext)_localctx).patt = patt(0);
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 14) | (1L << WILDCARD) | (1L << NUM) | (1L << BOOL) | (1L << ID))) != 0) );
			setState(55); match(17);
			setState(56); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 6, RULE_decl);
		try {
			setState(73);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59); ((DeclContext)_localctx).patt_0 = patt(0);
				setState(60); match(7);
				setState(61); ((DeclContext)_localctx).exp_1 = exp(0);
				((DeclContext)_localctx)._decl =  builder.declBindPatt((((DeclContext)_localctx).patt_0._patt),(((DeclContext)_localctx).exp_1._exp));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64); match(27);
				setState(65); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68); ((DeclContext)_localctx).declpattmono_0 = declpattmono();
				setState(69); match(36);
				setState(70); ((DeclContext)_localctx).decl_1 = decl();
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
		public TypeContext type_1;
		public Token WILDCARD_0;
		public ConstantContext constant_0;
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
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public PattContext patt() {
			return getRuleContext(PattContext.class,0);
		}
		public TerminalNode WILDCARD() { return getToken(CLParser.WILDCARD, 0); }
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
			setState(106);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(76); match(14);
				setState(77); ((PattContext)_localctx).patt_0 = patt(0);
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(78); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(81); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==16 );
				setState(83); match(34);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 2:
				{
				setState(86); match(14);
				setState(87); ((PattContext)_localctx).patt_0 = patt(0);
				setState(88); match(34);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 3:
				{
				setState(91); match(14);
				setState(92); ((PattContext)_localctx).patt_0 = patt(0);
				setState(93); match(20);
				setState(94); ((PattContext)_localctx).type_1 = type();
				setState(95); match(34);
				((PattContext)_localctx)._patt =  builder.pattType((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).type_1._type));
				}
				break;

			case 4:
				{
				setState(98); ((PattContext)_localctx).WILDCARD_0 = match(WILDCARD);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcard((((PattContext)_localctx).WILDCARD_0!=null?((PattContext)_localctx).WILDCARD_0.getText():null)));
				}
				break;

			case 5:
				{
				setState(100); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 6:
				{
				setState(103); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PattContext(_parentctx, _parentState);
					_localctx.patt_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_patt);
					setState(108);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(109); match(1);
					setState(110); ((PattContext)_localctx).ident_1 = ident();
					((PattContext)_localctx)._patt =  builder.pattAs((((PattContext)_localctx).patt_0._patt),(((PattContext)_localctx).ident_1._ident));
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		public Token ID_0;
		public TerminalNode ID() { return getToken(CLParser.ID, 0); }
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
			setState(118); ((IdentContext)_localctx).ID_0 = match(ID);
			((IdentContext)_localctx)._ident =  builder.id(id((((IdentContext)_localctx).ID_0!=null?((IdentContext)_localctx).ID_0.getText():null)));
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
		public Token ID_0;
		public TerminalNode ID() { return getToken(CLParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); ((TypeContext)_localctx).ID_0 = match(ID);
			((TypeContext)_localctx)._type =  builder.typeId(id((((TypeContext)_localctx).ID_0!=null?((TypeContext)_localctx).ID_0.getText():null)));
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
		enterRule(_localctx, 14, RULE_pattmatchmultiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124); ((PattmatchmultipleContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
			setState(125); match(23);
			setState(126); ((PattmatchmultipleContext)_localctx).pattmatch_1 = pattmatch();
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
		enterRule(_localctx, 16, RULE_pattmatchsingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); ((PattmatchsingleContext)_localctx).patt_0 = patt(0);
			setState(130); match(17);
			setState(131); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 18, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134); ((ProgContext)_localctx).exp_0 = exp(0);
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
		enterRule(_localctx, 20, RULE_exptuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137); match(16);
			setState(138); ((ExptupleContext)_localctx).exp_0 = exp(0);
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
		enterRule(_localctx, 22, RULE_declpattmono);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); ((DeclpattmonoContext)_localctx).patt_0 = patt(0);
			setState(142); match(7);
			setState(143); ((DeclpattmonoContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 24, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); ((LetExpContext)_localctx).decl_0 = decl();
			setState(147); match(31);
			setState(148); ((LetExpContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 26, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(16);
			setState(152); ((PatttupleContext)_localctx).patt_0 = patt(0);
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
		public Token ID_0;
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchcurriedContext pattmatchcurried_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ID() { return getToken(CLParser.ID, 0); }
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(156); match(32);
				setState(157); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(160); match(14);
				setState(161); ((FunctionContext)_localctx).function_0 = function(0);
				setState(162); match(34);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(165); match(30);
				setState(166); ((FunctionContext)_localctx).function_0 = function(0);
				setState(167); match(33);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 4:
				{
				setState(170); ((FunctionContext)_localctx).ID_0 = match(ID);
				((FunctionContext)_localctx)._function =  builder.functionId(id((((FunctionContext)_localctx).ID_0!=null?((FunctionContext)_localctx).ID_0.getText():null)));
				}
				break;

			case 5:
				{
				setState(172); match(2);
				setState(173); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(176); match(2);
				setState(177); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(188);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(182);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(183); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(190);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(192); match(12);
				setState(193); ((ExpContext)_localctx).exp_0 = exp(22);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(196); match(9);
				setState(197); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(198); match(38);
				setState(199); ((ExpContext)_localctx).exp_1 = exp(21);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 3:
				{
				setState(202); match(9);
				setState(203); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(204); match(38);
				setState(205); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(206); match(29);
				setState(207); ((ExpContext)_localctx).exp_2 = exp(16);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 4:
				{
				setState(210); match(39);
				setState(211); ((ExpContext)_localctx).exp_0 = exp(4);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(214); match(8);
				setState(215); ((ExpContext)_localctx).ident_0 = ident();
				setState(216); match(7);
				setState(217); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(218); match(19);
				setState(219); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(220); match(13);
				setState(221); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(222); match(18);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 6:
				{
				setState(225); match(28);
				setState(226); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(227); match(24);
				setState(228); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 7:
				{
				setState(231); match(5);
				setState(232); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(233); match(13);
				setState(234); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(235); match(18);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 8:
				{
				setState(238); match(8);
				setState(239); ((ExpContext)_localctx).ident_0 = ident();
				setState(240); match(7);
				setState(241); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(242); match(35);
				setState(243); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(244); match(13);
				setState(245); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(246); match(18);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 9:
				{
				setState(249); match(14);
				setState(250); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(251); match(34);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 10:
				{
				setState(254); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 11:
				{
				setState(257); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 12:
				{
				setState(260); match(30);
				setState(261); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(262); match(33);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(265); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;

			case 14:
				{
				setState(268); match(14);
				setState(269); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(271); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(270); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(273); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==16 );
				setState(275); match(34);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;

			case 15:
				{
				setState(278); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(320);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(318);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(283);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(284); match(4);
						setState(285); ((ExpContext)_localctx).exp_1 = exp(16);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(288);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(289); match(15);
						setState(290); ((ExpContext)_localctx).exp_1 = exp(8);
						((ExpContext)_localctx)._exp =  builder.intMultiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(293);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(294); match(37);
						setState(295); ((ExpContext)_localctx).exp_1 = exp(7);
						((ExpContext)_localctx)._exp =  builder.intAdd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(298);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(299);
						((ExpContext)_localctx).op_80 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 7) | (1L << 10) | (1L << 21) | (1L << 22) | (1L << 25))) != 0)) ) {
							((ExpContext)_localctx).op_80 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(300); ((ExpContext)_localctx).exp_1 = exp(6);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(303);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(304);
						_la = _input.LA(1);
						if ( !(_la==6 || _la==11) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(305); ((ExpContext)_localctx).exp_1 = exp(4);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(308);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(309);
						_la = _input.LA(1);
						if ( !(_la==3 || _la==26) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(310); ((ExpContext)_localctx).exp_1 = exp(3);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 7:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(313);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(314); match(20);
						setState(315); ((ExpContext)_localctx).type_1 = type();
						((ExpContext)_localctx)._exp =  builder.typedExp((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).type_1._type));
						}
						break;
					}
					} 
				}
				setState(322);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4: return patt_sempred((PattContext)_localctx, predIndex);

		case 14: return function_sempred((FunctionContext)_localctx, predIndex);

		case 15: return exp_sempred((ExpContext)_localctx, predIndex);
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
		case 1: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return precpred(_ctx, 15);

		case 3: return precpred(_ctx, 7);

		case 4: return precpred(_ctx, 6);

		case 5: return precpred(_ctx, 5);

		case 6: return precpred(_ctx, 3);

		case 7: return precpred(_ctx, 2);

		case 8: return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0146\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2-\n\2\3\3\3\3\3\3\3\3\5\3\63\n\3\3\4"+
		"\6\4\66\n\4\r\4\16\4\67\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\6\6R\n\6\r\6\16\6"+
		"S\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\5\6m\n\6\3\6\3\6\3\6\3\6\3\6\7\6t\n\6\f\6\16"+
		"\6w\13\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\5\20\u00b7\n\20\3\20\3\20\3\20\3\20\7\20\u00bd\n\20\f\20"+
		"\16\20\u00c0\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\6"+
		"\21\u0112\n\21\r\21\16\21\u0113\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u011c"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0141\n\21\f\21\16\21\u0144"+
		"\13\21\3\21\2\5\n\36 \22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\6"+
		"\2\t\t\f\f\27\30\33\33\4\2\b\b\r\r\4\2\5\5\34\34\u015e\2,\3\2\2\2\4\62"+
		"\3\2\2\2\6\65\3\2\2\2\bK\3\2\2\2\nl\3\2\2\2\fx\3\2\2\2\16{\3\2\2\2\20"+
		"~\3\2\2\2\22\u0083\3\2\2\2\24\u0088\3\2\2\2\26\u008b\3\2\2\2\30\u008f"+
		"\3\2\2\2\32\u0094\3\2\2\2\34\u0099\3\2\2\2\36\u00b6\3\2\2\2 \u011b\3\2"+
		"\2\2\"#\5\22\n\2#$\b\2\1\2$-\3\2\2\2%&\7\31\2\2&\'\5\2\2\2\'(\b\2\1\2"+
		"(-\3\2\2\2)*\5\20\t\2*+\b\2\1\2+-\3\2\2\2,\"\3\2\2\2,%\3\2\2\2,)\3\2\2"+
		"\2-\3\3\2\2\2./\7,\2\2/\63\b\3\1\2\60\61\7-\2\2\61\63\b\3\1\2\62.\3\2"+
		"\2\2\62\60\3\2\2\2\63\5\3\2\2\2\64\66\5\n\6\2\65\64\3\2\2\2\66\67\3\2"+
		"\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29:\7\23\2\2:;\5 \21\2;<\b\4\1"+
		"\2<\7\3\2\2\2=>\5\n\6\2>?\7\t\2\2?@\5 \21\2@A\b\5\1\2AL\3\2\2\2BC\7\35"+
		"\2\2CD\5\b\5\2DE\b\5\1\2EL\3\2\2\2FG\5\30\r\2GH\7&\2\2HI\5\b\5\2IJ\b\5"+
		"\1\2JL\3\2\2\2K=\3\2\2\2KB\3\2\2\2KF\3\2\2\2L\t\3\2\2\2MN\b\6\1\2NO\7"+
		"\20\2\2OQ\5\n\6\2PR\5\34\17\2QP\3\2\2\2RS\3\2\2\2SQ\3\2\2\2ST\3\2\2\2"+
		"TU\3\2\2\2UV\7$\2\2VW\b\6\1\2Wm\3\2\2\2XY\7\20\2\2YZ\5\n\6\2Z[\7$\2\2"+
		"[\\\b\6\1\2\\m\3\2\2\2]^\7\20\2\2^_\5\n\6\2_`\7\26\2\2`a\5\16\b\2ab\7"+
		"$\2\2bc\b\6\1\2cm\3\2\2\2de\7*\2\2em\b\6\1\2fg\5\4\3\2gh\b\6\1\2hm\3\2"+
		"\2\2ij\5\f\7\2jk\b\6\1\2km\3\2\2\2lM\3\2\2\2lX\3\2\2\2l]\3\2\2\2ld\3\2"+
		"\2\2lf\3\2\2\2li\3\2\2\2mu\3\2\2\2no\f\6\2\2op\7\3\2\2pq\5\f\7\2qr\b\6"+
		"\1\2rt\3\2\2\2sn\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\13\3\2\2\2wu\3"+
		"\2\2\2xy\7.\2\2yz\b\7\1\2z\r\3\2\2\2{|\7.\2\2|}\b\b\1\2}\17\3\2\2\2~\177"+
		"\5\22\n\2\177\u0080\7\31\2\2\u0080\u0081\5\2\2\2\u0081\u0082\b\t\1\2\u0082"+
		"\21\3\2\2\2\u0083\u0084\5\n\6\2\u0084\u0085\7\23\2\2\u0085\u0086\5 \21"+
		"\2\u0086\u0087\b\n\1\2\u0087\23\3\2\2\2\u0088\u0089\5 \21\2\u0089\u008a"+
		"\b\13\1\2\u008a\25\3\2\2\2\u008b\u008c\7\22\2\2\u008c\u008d\5 \21\2\u008d"+
		"\u008e\b\f\1\2\u008e\27\3\2\2\2\u008f\u0090\5\n\6\2\u0090\u0091\7\t\2"+
		"\2\u0091\u0092\5 \21\2\u0092\u0093\b\r\1\2\u0093\31\3\2\2\2\u0094\u0095"+
		"\5\b\5\2\u0095\u0096\7!\2\2\u0096\u0097\5 \21\2\u0097\u0098\b\16\1\2\u0098"+
		"\33\3\2\2\2\u0099\u009a\7\22\2\2\u009a\u009b\5\n\6\2\u009b\u009c\b\17"+
		"\1\2\u009c\35\3\2\2\2\u009d\u009e\b\20\1\2\u009e\u009f\7\"\2\2\u009f\u00a0"+
		"\5\2\2\2\u00a0\u00a1\b\20\1\2\u00a1\u00b7\3\2\2\2\u00a2\u00a3\7\20\2\2"+
		"\u00a3\u00a4\5\36\20\2\u00a4\u00a5\7$\2\2\u00a5\u00a6\b\20\1\2\u00a6\u00b7"+
		"\3\2\2\2\u00a7\u00a8\7 \2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\7#\2\2\u00aa"+
		"\u00ab\b\20\1\2\u00ab\u00b7\3\2\2\2\u00ac\u00ad\7.\2\2\u00ad\u00b7\b\20"+
		"\1\2\u00ae\u00af\7\4\2\2\u00af\u00b0\5\22\n\2\u00b0\u00b1\b\20\1\2\u00b1"+
		"\u00b7\3\2\2\2\u00b2\u00b3\7\4\2\2\u00b3\u00b4\5\6\4\2\u00b4\u00b5\b\20"+
		"\1\2\u00b5\u00b7\3\2\2\2\u00b6\u009d\3\2\2\2\u00b6\u00a2\3\2\2\2\u00b6"+
		"\u00a7\3\2\2\2\u00b6\u00ac\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6\u00b2\3\2"+
		"\2\2\u00b7\u00be\3\2\2\2\u00b8\u00b9\f\5\2\2\u00b9\u00ba\5 \21\2\u00ba"+
		"\u00bb\b\20\1\2\u00bb\u00bd\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\u00c0\3"+
		"\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\37\3\2\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c1\u00c2\b\21\1\2\u00c2\u00c3\7\16\2\2\u00c3\u00c4\5"+
		" \21\30\u00c4\u00c5\b\21\1\2\u00c5\u011c\3\2\2\2\u00c6\u00c7\7\13\2\2"+
		"\u00c7\u00c8\5 \21\2\u00c8\u00c9\7(\2\2\u00c9\u00ca\5 \21\27\u00ca\u00cb"+
		"\b\21\1\2\u00cb\u011c\3\2\2\2\u00cc\u00cd\7\13\2\2\u00cd\u00ce\5 \21\2"+
		"\u00ce\u00cf\7(\2\2\u00cf\u00d0\5 \21\2\u00d0\u00d1\7\37\2\2\u00d1\u00d2"+
		"\5 \21\22\u00d2\u00d3\b\21\1\2\u00d3\u011c\3\2\2\2\u00d4\u00d5\7)\2\2"+
		"\u00d5\u00d6\5 \21\6\u00d6\u00d7\b\21\1\2\u00d7\u011c\3\2\2\2\u00d8\u00d9"+
		"\7\n\2\2\u00d9\u00da\5\f\7\2\u00da\u00db\7\t\2\2\u00db\u00dc\5 \21\2\u00dc"+
		"\u00dd\7\25\2\2\u00dd\u00de\5 \21\2\u00de\u00df\7\17\2\2\u00df\u00e0\5"+
		" \21\2\u00e0\u00e1\7\24\2\2\u00e1\u00e2\b\21\1\2\u00e2\u011c\3\2\2\2\u00e3"+
		"\u00e4\7\36\2\2\u00e4\u00e5\5 \21\2\u00e5\u00e6\7\32\2\2\u00e6\u00e7\5"+
		"\2\2\2\u00e7\u00e8\b\21\1\2\u00e8\u011c\3\2\2\2\u00e9\u00ea\7\7\2\2\u00ea"+
		"\u00eb\5 \21\2\u00eb\u00ec\7\17\2\2\u00ec\u00ed\5 \21\2\u00ed\u00ee\7"+
		"\24\2\2\u00ee\u00ef\b\21\1\2\u00ef\u011c\3\2\2\2\u00f0\u00f1\7\n\2\2\u00f1"+
		"\u00f2\5\f\7\2\u00f2\u00f3\7\t\2\2\u00f3\u00f4\5 \21\2\u00f4\u00f5\7%"+
		"\2\2\u00f5\u00f6\5 \21\2\u00f6\u00f7\7\17\2\2\u00f7\u00f8\5 \21\2\u00f8"+
		"\u00f9\7\24\2\2\u00f9\u00fa\b\21\1\2\u00fa\u011c\3\2\2\2\u00fb\u00fc\7"+
		"\20\2\2\u00fc\u00fd\5 \21\2\u00fd\u00fe\7$\2\2\u00fe\u00ff\b\21\1\2\u00ff"+
		"\u011c\3\2\2\2\u0100\u0101\5\4\3\2\u0101\u0102\b\21\1\2\u0102\u011c\3"+
		"\2\2\2\u0103\u0104\5\f\7\2\u0104\u0105\b\21\1\2\u0105\u011c\3\2\2\2\u0106"+
		"\u0107\7 \2\2\u0107\u0108\5 \21\2\u0108\u0109\7#\2\2\u0109\u010a\b\21"+
		"\1\2\u010a\u011c\3\2\2\2\u010b\u010c\5\32\16\2\u010c\u010d\b\21\1\2\u010d"+
		"\u011c\3\2\2\2\u010e\u010f\7\20\2\2\u010f\u0111\5 \21\2\u0110\u0112\5"+
		"\26\f\2\u0111\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7$\2\2\u0116\u0117\b\21"+
		"\1\2\u0117\u011c\3\2\2\2\u0118\u0119\5\36\20\2\u0119\u011a\b\21\1\2\u011a"+
		"\u011c\3\2\2\2\u011b\u00c1\3\2\2\2\u011b\u00c6\3\2\2\2\u011b\u00cc\3\2"+
		"\2\2\u011b\u00d4\3\2\2\2\u011b\u00d8\3\2\2\2\u011b\u00e3\3\2\2\2\u011b"+
		"\u00e9\3\2\2\2\u011b\u00f0\3\2\2\2\u011b\u00fb\3\2\2\2\u011b\u0100\3\2"+
		"\2\2\u011b\u0103\3\2\2\2\u011b\u0106\3\2\2\2\u011b\u010b\3\2\2\2\u011b"+
		"\u010e\3\2\2\2\u011b\u0118\3\2\2\2\u011c\u0142\3\2\2\2\u011d\u011e\f\21"+
		"\2\2\u011e\u011f\7\6\2\2\u011f\u0120\5 \21\22\u0120\u0121\b\21\1\2\u0121"+
		"\u0141\3\2\2\2\u0122\u0123\f\t\2\2\u0123\u0124\7\21\2\2\u0124\u0125\5"+
		" \21\n\u0125\u0126\b\21\1\2\u0126\u0141\3\2\2\2\u0127\u0128\f\b\2\2\u0128"+
		"\u0129\7\'\2\2\u0129\u012a\5 \21\t\u012a\u012b\b\21\1\2\u012b\u0141\3"+
		"\2\2\2\u012c\u012d\f\7\2\2\u012d\u012e\t\2\2\2\u012e\u012f\5 \21\b\u012f"+
		"\u0130\b\21\1\2\u0130\u0141\3\2\2\2\u0131\u0132\f\5\2\2\u0132\u0133\t"+
		"\3\2\2\u0133\u0134\5 \21\6\u0134\u0135\b\21\1\2\u0135\u0141\3\2\2\2\u0136"+
		"\u0137\f\4\2\2\u0137\u0138\t\4\2\2\u0138\u0139\5 \21\5\u0139\u013a\b\21"+
		"\1\2\u013a\u0141\3\2\2\2\u013b\u013c\f\r\2\2\u013c\u013d\7\26\2\2\u013d"+
		"\u013e\5\16\b\2\u013e\u013f\b\21\1\2\u013f\u0141\3\2\2\2\u0140\u011d\3"+
		"\2\2\2\u0140\u0122\3\2\2\2\u0140\u0127\3\2\2\2\u0140\u012c\3\2\2\2\u0140"+
		"\u0131\3\2\2\2\u0140\u0136\3\2\2\2\u0140\u013b\3\2\2\2\u0141\u0144\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2\2\2\u0143!\3\2\2\2\u0144\u0142"+
		"\3\2\2\2\17,\62\67KSlu\u00b6\u00be\u0113\u011b\u0140\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}