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
		T__32=1, T__31=2, T__30=3, T__29=4, T__28=5, T__27=6, T__26=7, T__25=8, 
		T__24=9, T__23=10, T__22=11, T__21=12, T__20=13, T__19=14, T__18=15, T__17=16, 
		T__16=17, T__15=18, T__14=19, T__13=20, T__12=21, T__11=22, T__10=23, 
		T__9=24, T__8=25, T__7=26, T__6=27, T__5=28, T__4=29, T__3=30, T__2=31, 
		T__1=32, T__0=33, WILDCARD=34, WS=35, NUM=36, BOOL=37, ID=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'||'", "';'", "'while'", "'&&'", "'='", "'for'", 
		"'if'", "'<='", "'&'", "'print'", "'do'", "'('", "'*'", "','", "'->'", 
		"'done'", "'to'", "'>='", "'<'", "'|'", "'>'", "'or'", "'let'", "'in'", 
		"'else'", "'begin'", "'function'", "'end'", "')'", "'+'", "'then'", "'not'", 
		"'_'", "WS", "NUM", "BOOL", "ID"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_pattmatchcurried = 2, RULE_decl = 3, 
		RULE_patt = 4, RULE_ident = 5, RULE_pattmatchmultiple = 6, RULE_pattmatchsingle = 7, 
		RULE_prog = 8, RULE_exptuple = 9, RULE_declpattmono = 10, RULE_patttuple = 11, 
		RULE_function = 12, RULE_exp = 13;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "pattmatchcurried", "decl", "patt", "ident", 
		"pattmatchmultiple", "pattmatchsingle", "prog", "exptuple", "declpattmono", 
		"patttuple", "function", "exp"
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
			setState(38);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28); match(21);
				setState(29); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatchStripe((((PattmatchContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch1((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(35); ((PattmatchContext)_localctx).pattmatchmultiple_0 = pattmatchmultiple();
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
		public Token BOOL_0;
		public Token NUM_0;
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
			setState(44);
			switch (_input.LA(1)) {
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(40); ((ConstantContext)_localctx).BOOL_0 = match(BOOL);
				((ConstantContext)_localctx)._constant =  builder.bool(bool((((ConstantContext)_localctx).BOOL_0!=null?((ConstantContext)_localctx).BOOL_0.getText():null)));
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(42); ((ConstantContext)_localctx).NUM_0 = match(NUM);
				((ConstantContext)_localctx)._constant =  builder.int_(num((((ConstantContext)_localctx).NUM_0!=null?((ConstantContext)_localctx).NUM_0.getText():null)));
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
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46); ((PattmatchcurriedContext)_localctx).patt = patt();
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << WILDCARD) | (1L << NUM) | (1L << BOOL) | (1L << ID))) != 0) );
			setState(51); match(16);
			setState(52); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
		public DeclContext decl_0;
		public PattContext patt_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
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
			setState(64);
			switch (_input.LA(1)) {
			case 24:
				enterOuterAlt(_localctx, 1);
				{
				setState(55); match(24);
				setState(56); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
				}
				break;
			case 13:
			case WILDCARD:
			case NUM:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(59); ((DeclContext)_localctx).patt_0 = patt();
				setState(60); match(6);
				setState(61); ((DeclContext)_localctx).exp_1 = exp(0);
				((DeclContext)_localctx)._decl =  builder.declBindPatt((((DeclContext)_localctx).patt_0._patt),(((DeclContext)_localctx).exp_1._exp));
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

	public static class PattContext extends ParserRuleContext {
		public Object _patt;
		public PattContext patt_0;
		public PatttupleContext patttuple;
		public List<PatttupleContext> patttuple_1_list = new ArrayList<PatttupleContext>();
		public ConstantContext constant_0;
		public Token WILDCARD_0;
		public IdentContext ident_0;
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
		PattContext _localctx = new PattContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_patt);
		int _la;
		try {
			setState(89);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66); match(13);
				setState(67); ((PattContext)_localctx).patt_0 = patt();
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(68); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==15 );
				setState(73); match(30);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76); match(13);
				setState(77); ((PattContext)_localctx).patt_0 = patt();
				setState(78); match(30);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(84); ((PattContext)_localctx).WILDCARD_0 = match(WILDCARD);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcard((((PattContext)_localctx).WILDCARD_0!=null?((PattContext)_localctx).WILDCARD_0.getText():null)));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(86); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
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
			setState(91); ((IdentContext)_localctx).ID_0 = match(ID);
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
		enterRule(_localctx, 12, RULE_pattmatchmultiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94); ((PattmatchmultipleContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
			setState(95); match(21);
			setState(96); ((PattmatchmultipleContext)_localctx).pattmatch_1 = pattmatch();
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
		enterRule(_localctx, 14, RULE_pattmatchsingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99); ((PattmatchsingleContext)_localctx).patt_0 = patt();
			setState(100); match(16);
			setState(101); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 16, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104); ((ProgContext)_localctx).exp_0 = exp(0);
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
		enterRule(_localctx, 18, RULE_exptuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(15);
			setState(108); ((ExptupleContext)_localctx).exp_0 = exp(0);
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
		enterRule(_localctx, 20, RULE_declpattmono);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); ((DeclpattmonoContext)_localctx).patt_0 = patt();
			setState(112); match(6);
			setState(113); ((DeclpattmonoContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 22, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116); match(15);
			setState(117); ((PatttupleContext)_localctx).patt_0 = patt();
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
		public PattmatchsingleContext pattmatchsingle_0;
		public PattmatchcurriedContext pattmatchcurried_0;
		public ExpContext exp_1;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(121); match(28);
				setState(122); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(125); match(13);
				setState(126); ((FunctionContext)_localctx).function_0 = function(0);
				setState(127); match(30);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 3:
				{
				setState(130); match(27);
				setState(131); ((FunctionContext)_localctx).function_0 = function(0);
				setState(132); match(29);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 4:
				{
				setState(135); match(1);
				setState(136); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 5:
				{
				setState(139); match(1);
				setState(140); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new FunctionContext(_parentctx, _parentState);
					_localctx.function_0 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_function);
					setState(145);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(146); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(153);
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

	public static class ExpContext extends ParserRuleContext {
		public Object _exp;
		public ExpContext exp_0;
		public ExpContext exp_1;
		public ExpContext exp_2;
		public DeclContext decl_0;
		public IdentContext ident_0;
		public ExpContext exp_3;
		public ConstantContext constant_0;
		public FunctionContext function_0;
		public ExptupleContext exptuple;
		public List<ExptupleContext> exptuple_1_list = new ArrayList<ExptupleContext>();
		public Token op_80;
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExptupleContext exptuple(int i) {
			return getRuleContext(ExptupleContext.class,i);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<ExptupleContext> exptuple() {
			return getRuleContexts(ExptupleContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(155); match(11);
				setState(156); ((ExpContext)_localctx).exp_0 = exp(19);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(159); match(8);
				setState(160); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(161); match(32);
				setState(162); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(163); match(26);
				setState(164); ((ExpContext)_localctx).exp_2 = exp(18);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				{
				setState(167); match(8);
				setState(168); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(169); match(32);
				setState(170); ((ExpContext)_localctx).exp_1 = exp(16);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 4:
				{
				setState(173); ((ExpContext)_localctx).decl_0 = decl();
				setState(174); match(25);
				setState(175); ((ExpContext)_localctx).exp_1 = exp(9);
				((ExpContext)_localctx)._exp =  builder.letIn((((ExpContext)_localctx).decl_0._decl),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 5:
				{
				setState(178); match(33);
				setState(179); ((ExpContext)_localctx).exp_0 = exp(3);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 6:
				{
				setState(182); match(4);
				setState(183); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(184); match(12);
				setState(185); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(186); match(17);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 7:
				{
				setState(189); match(7);
				setState(190); ((ExpContext)_localctx).ident_0 = ident();
				setState(191); match(6);
				setState(192); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(193); match(18);
				setState(194); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(195); match(12);
				setState(196); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(197); match(17);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 8:
				{
				setState(200); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 9:
				{
				setState(203); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 10:
				{
				setState(206); match(13);
				setState(207); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(208); match(30);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 11:
				{
				setState(211); match(27);
				setState(212); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(213); match(29);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 12:
				{
				setState(216); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;

			case 13:
				{
				setState(219); match(13);
				setState(220); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(221); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(224); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==15 );
				setState(226); match(30);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(263);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(261);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(231);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(232); match(3);
						setState(233); ((ExpContext)_localctx).exp_1 = exp(15);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(236);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(237); match(14);
						setState(238); ((ExpContext)_localctx).exp_1 = exp(7);
						((ExpContext)_localctx)._exp =  builder.intMultiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(241);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(242); match(31);
						setState(243); ((ExpContext)_localctx).exp_1 = exp(6);
						((ExpContext)_localctx)._exp =  builder.intAdd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(246);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(247);
						((ExpContext)_localctx).op_80 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 9) | (1L << 19) | (1L << 20) | (1L << 22))) != 0)) ) {
							((ExpContext)_localctx).op_80 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(248); ((ExpContext)_localctx).exp_1 = exp(5);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(251);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(252);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==10) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(253); ((ExpContext)_localctx).exp_1 = exp(3);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(256);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(257);
						_la = _input.LA(1);
						if ( !(_la==2 || _la==23) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(258); ((ExpContext)_localctx).exp_1 = exp(2);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(265);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12: return function_sempred((FunctionContext)_localctx, predIndex);

		case 13: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 14);

		case 2: return precpred(_ctx, 6);

		case 3: return precpred(_ctx, 5);

		case 4: return precpred(_ctx, 4);

		case 5: return precpred(_ctx, 2);

		case 6: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u010d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2)\n\2\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\6\4\62\n\4\r\4\16\4\63"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3\6\3\6"+
		"\3\6\6\6H\n\6\r\6\16\6I\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0092\n\16"+
		"\3\16\3\16\3\16\3\16\7\16\u0098\n\16\f\16\16\16\u009b\13\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\6\17\u00e1\n\17\r\17"+
		"\16\17\u00e2\3\17\3\17\3\17\5\17\u00e8\n\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0108\n\17"+
		"\f\17\16\17\u010b\13\17\3\17\2\4\32\34\20\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\2\5\6\2\b\b\13\13\25\26\30\30\4\2\7\7\f\f\4\2\4\4\31\31\u0120\2"+
		"(\3\2\2\2\4.\3\2\2\2\6\61\3\2\2\2\bB\3\2\2\2\n[\3\2\2\2\f]\3\2\2\2\16"+
		"`\3\2\2\2\20e\3\2\2\2\22j\3\2\2\2\24m\3\2\2\2\26q\3\2\2\2\30v\3\2\2\2"+
		"\32\u0091\3\2\2\2\34\u00e7\3\2\2\2\36\37\7\27\2\2\37 \5\2\2\2 !\b\2\1"+
		"\2!)\3\2\2\2\"#\5\20\t\2#$\b\2\1\2$)\3\2\2\2%&\5\16\b\2&\'\b\2\1\2\')"+
		"\3\2\2\2(\36\3\2\2\2(\"\3\2\2\2(%\3\2\2\2)\3\3\2\2\2*+\7\'\2\2+/\b\3\1"+
		"\2,-\7&\2\2-/\b\3\1\2.*\3\2\2\2.,\3\2\2\2/\5\3\2\2\2\60\62\5\n\6\2\61"+
		"\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65"+
		"\66\7\22\2\2\66\67\5\34\17\2\678\b\4\1\28\7\3\2\2\29:\7\32\2\2:;\5\b\5"+
		"\2;<\b\5\1\2<C\3\2\2\2=>\5\n\6\2>?\7\b\2\2?@\5\34\17\2@A\b\5\1\2AC\3\2"+
		"\2\2B9\3\2\2\2B=\3\2\2\2C\t\3\2\2\2DE\7\17\2\2EG\5\n\6\2FH\5\30\r\2GF"+
		"\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7 \2\2LM\b\6\1\2M\\"+
		"\3\2\2\2NO\7\17\2\2OP\5\n\6\2PQ\7 \2\2QR\b\6\1\2R\\\3\2\2\2ST\5\4\3\2"+
		"TU\b\6\1\2U\\\3\2\2\2VW\7$\2\2W\\\b\6\1\2XY\5\f\7\2YZ\b\6\1\2Z\\\3\2\2"+
		"\2[D\3\2\2\2[N\3\2\2\2[S\3\2\2\2[V\3\2\2\2[X\3\2\2\2\\\13\3\2\2\2]^\7"+
		"(\2\2^_\b\7\1\2_\r\3\2\2\2`a\5\20\t\2ab\7\27\2\2bc\5\2\2\2cd\b\b\1\2d"+
		"\17\3\2\2\2ef\5\n\6\2fg\7\22\2\2gh\5\34\17\2hi\b\t\1\2i\21\3\2\2\2jk\5"+
		"\34\17\2kl\b\n\1\2l\23\3\2\2\2mn\7\21\2\2no\5\34\17\2op\b\13\1\2p\25\3"+
		"\2\2\2qr\5\n\6\2rs\7\b\2\2st\5\34\17\2tu\b\f\1\2u\27\3\2\2\2vw\7\21\2"+
		"\2wx\5\n\6\2xy\b\r\1\2y\31\3\2\2\2z{\b\16\1\2{|\7\36\2\2|}\5\2\2\2}~\b"+
		"\16\1\2~\u0092\3\2\2\2\177\u0080\7\17\2\2\u0080\u0081\5\32\16\2\u0081"+
		"\u0082\7 \2\2\u0082\u0083\b\16\1\2\u0083\u0092\3\2\2\2\u0084\u0085\7\35"+
		"\2\2\u0085\u0086\5\32\16\2\u0086\u0087\7\37\2\2\u0087\u0088\b\16\1\2\u0088"+
		"\u0092\3\2\2\2\u0089\u008a\7\3\2\2\u008a\u008b\5\20\t\2\u008b\u008c\b"+
		"\16\1\2\u008c\u0092\3\2\2\2\u008d\u008e\7\3\2\2\u008e\u008f\5\6\4\2\u008f"+
		"\u0090\b\16\1\2\u0090\u0092\3\2\2\2\u0091z\3\2\2\2\u0091\177\3\2\2\2\u0091"+
		"\u0084\3\2\2\2\u0091\u0089\3\2\2\2\u0091\u008d\3\2\2\2\u0092\u0099\3\2"+
		"\2\2\u0093\u0094\f\6\2\2\u0094\u0095\5\34\17\2\u0095\u0096\b\16\1\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0093\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\33\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d"+
		"\b\17\1\2\u009d\u009e\7\r\2\2\u009e\u009f\5\34\17\25\u009f\u00a0\b\17"+
		"\1\2\u00a0\u00e8\3\2\2\2\u00a1\u00a2\7\n\2\2\u00a2\u00a3\5\34\17\2\u00a3"+
		"\u00a4\7\"\2\2\u00a4\u00a5\5\34\17\2\u00a5\u00a6\7\34\2\2\u00a6\u00a7"+
		"\5\34\17\24\u00a7\u00a8\b\17\1\2\u00a8\u00e8\3\2\2\2\u00a9\u00aa\7\n\2"+
		"\2\u00aa\u00ab\5\34\17\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad\5\34\17\22\u00ad"+
		"\u00ae\b\17\1\2\u00ae\u00e8\3\2\2\2\u00af\u00b0\5\b\5\2\u00b0\u00b1\7"+
		"\33\2\2\u00b1\u00b2\5\34\17\13\u00b2\u00b3\b\17\1\2\u00b3\u00e8\3\2\2"+
		"\2\u00b4\u00b5\7#\2\2\u00b5\u00b6\5\34\17\5\u00b6\u00b7\b\17\1\2\u00b7"+
		"\u00e8\3\2\2\2\u00b8\u00b9\7\6\2\2\u00b9\u00ba\5\34\17\2\u00ba\u00bb\7"+
		"\16\2\2\u00bb\u00bc\5\34\17\2\u00bc\u00bd\7\23\2\2\u00bd\u00be\b\17\1"+
		"\2\u00be\u00e8\3\2\2\2\u00bf\u00c0\7\t\2\2\u00c0\u00c1\5\f\7\2\u00c1\u00c2"+
		"\7\b\2\2\u00c2\u00c3\5\34\17\2\u00c3\u00c4\7\24\2\2\u00c4\u00c5\5\34\17"+
		"\2\u00c5\u00c6\7\16\2\2\u00c6\u00c7\5\34\17\2\u00c7\u00c8\7\23\2\2\u00c8"+
		"\u00c9\b\17\1\2\u00c9\u00e8\3\2\2\2\u00ca\u00cb\5\4\3\2\u00cb\u00cc\b"+
		"\17\1\2\u00cc\u00e8\3\2\2\2\u00cd\u00ce\5\f\7\2\u00ce\u00cf\b\17\1\2\u00cf"+
		"\u00e8\3\2\2\2\u00d0\u00d1\7\17\2\2\u00d1\u00d2\5\34\17\2\u00d2\u00d3"+
		"\7 \2\2\u00d3\u00d4\b\17\1\2\u00d4\u00e8\3\2\2\2\u00d5\u00d6\7\35\2\2"+
		"\u00d6\u00d7\5\34\17\2\u00d7\u00d8\7\37\2\2\u00d8\u00d9\b\17\1\2\u00d9"+
		"\u00e8\3\2\2\2\u00da\u00db\5\32\16\2\u00db\u00dc\b\17\1\2\u00dc\u00e8"+
		"\3\2\2\2\u00dd\u00de\7\17\2\2\u00de\u00e0\5\34\17\2\u00df\u00e1\5\24\13"+
		"\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7 \2\2\u00e5\u00e6\b\17\1\2\u00e6"+
		"\u00e8\3\2\2\2\u00e7\u009c\3\2\2\2\u00e7\u00a1\3\2\2\2\u00e7\u00a9\3\2"+
		"\2\2\u00e7\u00af\3\2\2\2\u00e7\u00b4\3\2\2\2\u00e7\u00b8\3\2\2\2\u00e7"+
		"\u00bf\3\2\2\2\u00e7\u00ca\3\2\2\2\u00e7\u00cd\3\2\2\2\u00e7\u00d0\3\2"+
		"\2\2\u00e7\u00d5\3\2\2\2\u00e7\u00da\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e8"+
		"\u0109\3\2\2\2\u00e9\u00ea\f\20\2\2\u00ea\u00eb\7\5\2\2\u00eb\u00ec\5"+
		"\34\17\21\u00ec\u00ed\b\17\1\2\u00ed\u0108\3\2\2\2\u00ee\u00ef\f\b\2\2"+
		"\u00ef\u00f0\7\20\2\2\u00f0\u00f1\5\34\17\t\u00f1\u00f2\b\17\1\2\u00f2"+
		"\u0108\3\2\2\2\u00f3\u00f4\f\7\2\2\u00f4\u00f5\7!\2\2\u00f5\u00f6\5\34"+
		"\17\b\u00f6\u00f7\b\17\1\2\u00f7\u0108\3\2\2\2\u00f8\u00f9\f\6\2\2\u00f9"+
		"\u00fa\t\2\2\2\u00fa\u00fb\5\34\17\7\u00fb\u00fc\b\17\1\2\u00fc\u0108"+
		"\3\2\2\2\u00fd\u00fe\f\4\2\2\u00fe\u00ff\t\3\2\2\u00ff\u0100\5\34\17\5"+
		"\u0100\u0101\b\17\1\2\u0101\u0108\3\2\2\2\u0102\u0103\f\3\2\2\u0103\u0104"+
		"\t\4\2\2\u0104\u0105\5\34\17\4\u0105\u0106\b\17\1\2\u0106\u0108\3\2\2"+
		"\2\u0107\u00e9\3\2\2\2\u0107\u00ee\3\2\2\2\u0107\u00f3\3\2\2\2\u0107\u00f8"+
		"\3\2\2\2\u0107\u00fd\3\2\2\2\u0107\u0102\3\2\2\2\u0108\u010b\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\35\3\2\2\2\u010b\u0109\3\2\2"+
		"\2\16(.\63BI[\u0091\u0099\u00e2\u00e7\u0107\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}