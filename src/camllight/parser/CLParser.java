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
		T__35=1, T__34=2, T__33=3, T__32=4, T__31=5, T__30=6, T__29=7, T__28=8, 
		T__27=9, T__26=10, T__25=11, T__24=12, T__23=13, T__22=14, T__21=15, T__20=16, 
		T__19=17, T__18=18, T__17=19, T__16=20, T__15=21, T__14=22, T__13=23, 
		T__12=24, T__11=25, T__10=26, T__9=27, T__8=28, T__7=29, T__6=30, T__5=31, 
		T__4=32, T__3=33, T__2=34, T__1=35, T__0=36, WILDCARD=37, WS=38, NUM=39, 
		BOOL=40, ID=41;
	public static final String[] tokenNames = {
		"<INVALID>", "'fun'", "'||'", "'while'", "';'", "'&&'", "'='", "'if'", 
		"'for'", "'<='", "'&'", "'print'", "'do'", "'('", "'*'", "','", "'->'", 
		"'done'", "'to'", "'>='", "'<'", "'|'", "'with'", "'>'", "'or'", "'let'", 
		"'match'", "'else'", "'begin'", "'in'", "'function'", "'end'", "')'", 
		"'downto'", "'+'", "'then'", "'not'", "'_'", "WS", "NUM", "BOOL", "ID"
	};
	public static final int
		RULE_pattmatch = 0, RULE_constant = 1, RULE_pattmatchcurried = 2, RULE_decl = 3, 
		RULE_patt = 4, RULE_ident = 5, RULE_pattmatchsingle = 6, RULE_pattmatchmultiple = 7, 
		RULE_prog = 8, RULE_exptuple = 9, RULE_declpattmono = 10, RULE_letExp = 11, 
		RULE_patttuple = 12, RULE_function = 13, RULE_exp = 14;
	public static final String[] ruleNames = {
		"pattmatch", "constant", "pattmatchcurried", "decl", "patt", "ident", 
		"pattmatchsingle", "pattmatchmultiple", "prog", "exptuple", "declpattmono", 
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
		public PattmatchmultipleContext pattmatchmultiple_0;
		public PattmatchsingleContext pattmatchsingle_0;
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
			setState(40);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30); ((PattmatchContext)_localctx).pattmatchmultiple_0 = pattmatchmultiple();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch2((((PattmatchContext)_localctx).pattmatchmultiple_0._pattmatchmultiple));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33); ((PattmatchContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((PattmatchContext)_localctx)._pattmatch =  builder.pattMatch1((((PattmatchContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36); match(21);
				setState(37); ((PattmatchContext)_localctx).pattmatch_0 = pattmatch();
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
			setState(46);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(42); ((ConstantContext)_localctx).NUM_0 = match(NUM);
				((ConstantContext)_localctx)._constant =  builder.int_(num((((ConstantContext)_localctx).NUM_0!=null?((ConstantContext)_localctx).NUM_0.getText():null)));
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); ((ConstantContext)_localctx).BOOL_0 = match(BOOL);
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48); ((PattmatchcurriedContext)_localctx).patt = patt();
				((PattmatchcurriedContext)_localctx).patt_0_list.add(((PattmatchcurriedContext)_localctx).patt);
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 13) | (1L << WILDCARD) | (1L << NUM) | (1L << BOOL) | (1L << ID))) != 0) );
			setState(53); match(16);
			setState(54); ((PattmatchcurriedContext)_localctx).exp_1 = exp(0);
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
			setState(66);
			switch (_input.LA(1)) {
			case 13:
			case WILDCARD:
			case NUM:
			case BOOL:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); ((DeclContext)_localctx).patt_0 = patt();
				setState(58); match(6);
				setState(59); ((DeclContext)_localctx).exp_1 = exp(0);
				((DeclContext)_localctx)._decl =  builder.declBindPatt((((DeclContext)_localctx).patt_0._patt),(((DeclContext)_localctx).exp_1._exp));
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); match(25);
				setState(63); ((DeclContext)_localctx).decl_0 = decl();
				((DeclContext)_localctx)._decl =  builder.decl((((DeclContext)_localctx).decl_0._decl));
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
		public Token WILDCARD_0;
		public IdentContext ident_0;
		public ConstantContext constant_0;
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
			setState(91);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68); match(13);
				setState(69); ((PattContext)_localctx).patt_0 = patt();
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70); ((PattContext)_localctx).patttuple = patttuple();
					((PattContext)_localctx).patttuple_1_list.add(((PattContext)_localctx).patttuple);
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==15 );
				setState(75); match(32);
				((PattContext)_localctx)._patt =  builder.pattTuple((((PattContext)_localctx).patt_0._patt),lift("_patttuple", ((PattContext)_localctx).patttuple_1_list));
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); ((PattContext)_localctx).WILDCARD_0 = match(WILDCARD);
				((PattContext)_localctx)._patt =  builder.pattWildcard(wildcard((((PattContext)_localctx).WILDCARD_0!=null?((PattContext)_localctx).WILDCARD_0.getText():null)));
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80); ((PattContext)_localctx).ident_0 = ident();
				((PattContext)_localctx)._patt =  builder.pattId((((PattContext)_localctx).ident_0._ident));
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83); match(13);
				setState(84); ((PattContext)_localctx).patt_0 = patt();
				setState(85); match(32);
				((PattContext)_localctx)._patt =  builder.bracketedPatt((((PattContext)_localctx).patt_0._patt));
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(88); ((PattContext)_localctx).constant_0 = constant();
				((PattContext)_localctx)._patt =  builder.pattConstant((((PattContext)_localctx).constant_0._constant));
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
			setState(93); ((IdentContext)_localctx).ID_0 = match(ID);
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
		enterRule(_localctx, 12, RULE_pattmatchsingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96); ((PattmatchsingleContext)_localctx).patt_0 = patt();
			setState(97); match(16);
			setState(98); ((PattmatchsingleContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 14, RULE_pattmatchmultiple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); ((PattmatchmultipleContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
			setState(102); match(21);
			setState(103); ((PattmatchmultipleContext)_localctx).pattmatch_1 = pattmatch();
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
		enterRule(_localctx, 16, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); ((ProgContext)_localctx).exp_0 = exp(0);
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
			setState(109); match(15);
			setState(110); ((ExptupleContext)_localctx).exp_0 = exp(0);
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
			setState(113); ((DeclpattmonoContext)_localctx).patt_0 = patt();
			setState(114); match(6);
			setState(115); ((DeclpattmonoContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 22, RULE_letExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); ((LetExpContext)_localctx).decl_0 = decl();
			setState(119); match(29);
			setState(120); ((LetExpContext)_localctx).exp_1 = exp(0);
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
		enterRule(_localctx, 24, RULE_patttuple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123); match(15);
			setState(124); ((PatttupleContext)_localctx).patt_0 = patt();
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
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_function, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(128); match(30);
				setState(129); ((FunctionContext)_localctx).pattmatch_0 = pattmatch();
				((FunctionContext)_localctx)._function =  builder.function((((FunctionContext)_localctx).pattmatch_0._pattmatch));
				}
				break;

			case 2:
				{
				setState(132); ((FunctionContext)_localctx).ID_0 = match(ID);
				((FunctionContext)_localctx)._function =  builder.functionId(id((((FunctionContext)_localctx).ID_0!=null?((FunctionContext)_localctx).ID_0.getText():null)));
				}
				break;

			case 3:
				{
				setState(134); match(28);
				setState(135); ((FunctionContext)_localctx).function_0 = function(0);
				setState(136); match(31);
				((FunctionContext)_localctx)._function =  builder.beginEndFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 4:
				{
				setState(139); match(13);
				setState(140); ((FunctionContext)_localctx).function_0 = function(0);
				setState(141); match(32);
				((FunctionContext)_localctx)._function =  builder.bracketedFunction((((FunctionContext)_localctx).function_0._function));
				}
				break;

			case 5:
				{
				setState(144); match(1);
				setState(145); ((FunctionContext)_localctx).pattmatchsingle_0 = pattmatchsingle();
				((FunctionContext)_localctx)._function =  builder.func((((FunctionContext)_localctx).pattmatchsingle_0._pattmatchsingle));
				}
				break;

			case 6:
				{
				setState(148); match(1);
				setState(149); ((FunctionContext)_localctx).pattmatchcurried_0 = pattmatchcurried();
				((FunctionContext)_localctx)._function =  builder.curriedFunc((((FunctionContext)_localctx).pattmatchcurried_0._pattmatchcurried));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
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
					setState(154);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(155); ((FunctionContext)_localctx).exp_1 = exp(0);
					((FunctionContext)_localctx)._function =  builder.funcAplication((((FunctionContext)_localctx).function_0._function),(((FunctionContext)_localctx).exp_1._exp));
					}
					} 
				}
				setState(162);
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
		public IdentContext ident_0;
		public ExpContext exp_3;
		public PattmatchContext pattmatch_1;
		public ConstantContext constant_0;
		public LetExpContext letExp_0;
		public ExptupleContext exptuple;
		public List<ExptupleContext> exptuple_1_list = new ArrayList<ExptupleContext>();
		public FunctionContext function_0;
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
		public LetExpContext letExp() {
			return getRuleContext(LetExpContext.class,0);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_exp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(164); match(11);
				setState(165); ((ExpContext)_localctx).exp_0 = exp(21);
				((ExpContext)_localctx)._exp =  builder.print((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 2:
				{
				setState(168); match(7);
				setState(169); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(170); match(35);
				setState(171); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(172); match(27);
				setState(173); ((ExpContext)_localctx).exp_2 = exp(18);
				((ExpContext)_localctx)._exp =  builder.ifElse((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp));
				}
				break;

			case 3:
				{
				setState(176); match(7);
				setState(177); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(178); match(35);
				setState(179); ((ExpContext)_localctx).exp_1 = exp(16);
				((ExpContext)_localctx)._exp =  builder.if_((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 4:
				{
				setState(182); match(36);
				setState(183); ((ExpContext)_localctx).exp_0 = exp(4);
				((ExpContext)_localctx)._exp =  builder.lNot((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 5:
				{
				setState(186); match(8);
				setState(187); ((ExpContext)_localctx).ident_0 = ident();
				setState(188); match(6);
				setState(189); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(190); match(33);
				setState(191); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(192); match(12);
				setState(193); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(194); match(17);
				((ExpContext)_localctx)._exp =  builder.forDownto((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 6:
				{
				setState(197); match(8);
				setState(198); ((ExpContext)_localctx).ident_0 = ident();
				setState(199); match(6);
				setState(200); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(201); match(18);
				setState(202); ((ExpContext)_localctx).exp_2 = exp(0);
				setState(203); match(12);
				setState(204); ((ExpContext)_localctx).exp_3 = exp(0);
				setState(205); match(17);
				((ExpContext)_localctx)._exp =  builder.for_((((ExpContext)_localctx).ident_0._ident),(((ExpContext)_localctx).exp_1._exp),(((ExpContext)_localctx).exp_2._exp),(((ExpContext)_localctx).exp_3._exp));
				}
				break;

			case 7:
				{
				setState(208); match(3);
				setState(209); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(210); match(12);
				setState(211); ((ExpContext)_localctx).exp_1 = exp(0);
				setState(212); match(17);
				((ExpContext)_localctx)._exp =  builder.whileTrue((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
				}
				break;

			case 8:
				{
				setState(215); match(26);
				setState(216); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(217); match(22);
				setState(218); ((ExpContext)_localctx).pattmatch_1 = pattmatch();
				((ExpContext)_localctx)._exp =  builder.matchWith((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).pattmatch_1._pattmatch));
				}
				break;

			case 9:
				{
				setState(221); match(28);
				setState(222); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(223); match(31);
				((ExpContext)_localctx)._exp =  builder.beginEndExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 10:
				{
				setState(226); ((ExpContext)_localctx).constant_0 = constant();
				((ExpContext)_localctx)._exp =  builder.constExp((((ExpContext)_localctx).constant_0._constant));
				}
				break;

			case 11:
				{
				setState(229); ((ExpContext)_localctx).ident_0 = ident();
				((ExpContext)_localctx)._exp =  builder.idExp((((ExpContext)_localctx).ident_0._ident));
				}
				break;

			case 12:
				{
				setState(232); match(13);
				setState(233); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(234); match(32);
				((ExpContext)_localctx)._exp =  builder.bracketedExp((((ExpContext)_localctx).exp_0._exp));
				}
				break;

			case 13:
				{
				setState(237); ((ExpContext)_localctx).letExp_0 = letExp();
				((ExpContext)_localctx)._exp =  builder.letExp((((ExpContext)_localctx).letExp_0._letExp));
				}
				break;

			case 14:
				{
				setState(240); match(13);
				setState(241); ((ExpContext)_localctx).exp_0 = exp(0);
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(242); ((ExpContext)_localctx).exptuple = exptuple();
					((ExpContext)_localctx).exptuple_1_list.add(((ExpContext)_localctx).exptuple);
					}
					}
					setState(245); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==15 );
				setState(247); match(32);
				((ExpContext)_localctx)._exp =  builder.exprTupleMulti((((ExpContext)_localctx).exp_0._exp),lift("_exptuple", ((ExpContext)_localctx).exptuple_1_list));
				}
				break;

			case 15:
				{
				setState(250); ((ExpContext)_localctx).function_0 = function(0);
				((ExpContext)_localctx)._exp =  builder.functionExpr((((ExpContext)_localctx).function_0._function));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(287);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(285);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(255);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(256); match(4);
						setState(257); ((ExpContext)_localctx).exp_1 = exp(21);
						((ExpContext)_localctx)._exp =  builder.seq((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 2:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(260);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(261); match(14);
						setState(262); ((ExpContext)_localctx).exp_1 = exp(8);
						((ExpContext)_localctx)._exp =  builder.intMultiply((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 3:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(265);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(266); match(34);
						setState(267); ((ExpContext)_localctx).exp_1 = exp(7);
						((ExpContext)_localctx)._exp =  builder.intAdd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 4:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(270);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(271);
						((ExpContext)_localctx).op_80 = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 6) | (1L << 9) | (1L << 19) | (1L << 20) | (1L << 23))) != 0)) ) {
							((ExpContext)_localctx).op_80 = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(272); ((ExpContext)_localctx).exp_1 = exp(6);
						((ExpContext)_localctx)._exp =  (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<=") ? builder.intSmallerEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">=") ? builder.intGreaterEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("<") ? builder.intSmaller(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals("=") ? builder.intEqual(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : (((ExpContext)_localctx).op_80!=null?((ExpContext)_localctx).op_80.getText():null).equals(">") ? builder.intGreater(((ExpContext)_localctx).exp_0._exp, ((ExpContext)_localctx).exp_1._exp) : null;
						}
						break;

					case 5:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(275);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(276);
						_la = _input.LA(1);
						if ( !(_la==5 || _la==10) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(277); ((ExpContext)_localctx).exp_1 = exp(4);
						((ExpContext)_localctx)._exp =  builder.lAnd((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;

					case 6:
						{
						_localctx = new ExpContext(_parentctx, _parentState);
						_localctx.exp_0 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_exp);
						setState(280);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(281);
						_la = _input.LA(1);
						if ( !(_la==2 || _la==24) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(282); ((ExpContext)_localctx).exp_1 = exp(3);
						((ExpContext)_localctx)._exp =  builder.lOr((((ExpContext)_localctx).exp_0._exp),(((ExpContext)_localctx).exp_1._exp));
						}
						break;
					}
					} 
				}
				setState(289);
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
		case 13: return function_sempred((FunctionContext)_localctx, predIndex);

		case 14: return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean function_sempred(FunctionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 20);

		case 2: return precpred(_ctx, 7);

		case 3: return precpred(_ctx, 6);

		case 4: return precpred(_ctx, 5);

		case 5: return precpred(_ctx, 3);

		case 6: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\5\2+\n\2\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\6\4\64\n"+
		"\4\r\4\16\4\65\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"E\n\5\3\6\3\6\3\6\6\6J\n\6\r\6\16\6K\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009b\n\17\3\17\3\17\3\17\3\17\7\17"+
		"\u00a1\n\17\f\17\16\17\u00a4\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\6\20\u00f6\n\20\r\20\16\20\u00f7\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\5\20\u0100\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0120\n\20\f\20\16\20\u0123\13"+
		"\20\3\20\2\4\34\36\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2\5\6\2\b"+
		"\b\13\13\25\26\31\31\4\2\7\7\f\f\4\2\4\4\32\32\u013a\2*\3\2\2\2\4\60\3"+
		"\2\2\2\6\63\3\2\2\2\bD\3\2\2\2\n]\3\2\2\2\f_\3\2\2\2\16b\3\2\2\2\20g\3"+
		"\2\2\2\22l\3\2\2\2\24o\3\2\2\2\26s\3\2\2\2\30x\3\2\2\2\32}\3\2\2\2\34"+
		"\u009a\3\2\2\2\36\u00ff\3\2\2\2 !\5\20\t\2!\"\b\2\1\2\"+\3\2\2\2#$\5\16"+
		"\b\2$%\b\2\1\2%+\3\2\2\2&\'\7\27\2\2\'(\5\2\2\2()\b\2\1\2)+\3\2\2\2* "+
		"\3\2\2\2*#\3\2\2\2*&\3\2\2\2+\3\3\2\2\2,-\7)\2\2-\61\b\3\1\2./\7*\2\2"+
		"/\61\b\3\1\2\60,\3\2\2\2\60.\3\2\2\2\61\5\3\2\2\2\62\64\5\n\6\2\63\62"+
		"\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\7"+
		"\22\2\289\5\36\20\29:\b\4\1\2:\7\3\2\2\2;<\5\n\6\2<=\7\b\2\2=>\5\36\20"+
		"\2>?\b\5\1\2?E\3\2\2\2@A\7\33\2\2AB\5\b\5\2BC\b\5\1\2CE\3\2\2\2D;\3\2"+
		"\2\2D@\3\2\2\2E\t\3\2\2\2FG\7\17\2\2GI\5\n\6\2HJ\5\32\16\2IH\3\2\2\2J"+
		"K\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\"\2\2NO\b\6\1\2O^\3\2\2\2"+
		"PQ\7\'\2\2Q^\b\6\1\2RS\5\f\7\2ST\b\6\1\2T^\3\2\2\2UV\7\17\2\2VW\5\n\6"+
		"\2WX\7\"\2\2XY\b\6\1\2Y^\3\2\2\2Z[\5\4\3\2[\\\b\6\1\2\\^\3\2\2\2]F\3\2"+
		"\2\2]P\3\2\2\2]R\3\2\2\2]U\3\2\2\2]Z\3\2\2\2^\13\3\2\2\2_`\7+\2\2`a\b"+
		"\7\1\2a\r\3\2\2\2bc\5\n\6\2cd\7\22\2\2de\5\36\20\2ef\b\b\1\2f\17\3\2\2"+
		"\2gh\5\16\b\2hi\7\27\2\2ij\5\2\2\2jk\b\t\1\2k\21\3\2\2\2lm\5\36\20\2m"+
		"n\b\n\1\2n\23\3\2\2\2op\7\21\2\2pq\5\36\20\2qr\b\13\1\2r\25\3\2\2\2st"+
		"\5\n\6\2tu\7\b\2\2uv\5\36\20\2vw\b\f\1\2w\27\3\2\2\2xy\5\b\5\2yz\7\37"+
		"\2\2z{\5\36\20\2{|\b\r\1\2|\31\3\2\2\2}~\7\21\2\2~\177\5\n\6\2\177\u0080"+
		"\b\16\1\2\u0080\33\3\2\2\2\u0081\u0082\b\17\1\2\u0082\u0083\7 \2\2\u0083"+
		"\u0084\5\2\2\2\u0084\u0085\b\17\1\2\u0085\u009b\3\2\2\2\u0086\u0087\7"+
		"+\2\2\u0087\u009b\b\17\1\2\u0088\u0089\7\36\2\2\u0089\u008a\5\34\17\2"+
		"\u008a\u008b\7!\2\2\u008b\u008c\b\17\1\2\u008c\u009b\3\2\2\2\u008d\u008e"+
		"\7\17\2\2\u008e\u008f\5\34\17\2\u008f\u0090\7\"\2\2\u0090\u0091\b\17\1"+
		"\2\u0091\u009b\3\2\2\2\u0092\u0093\7\3\2\2\u0093\u0094\5\16\b\2\u0094"+
		"\u0095\b\17\1\2\u0095\u009b\3\2\2\2\u0096\u0097\7\3\2\2\u0097\u0098\5"+
		"\6\4\2\u0098\u0099\b\17\1\2\u0099\u009b\3\2\2\2\u009a\u0081\3\2\2\2\u009a"+
		"\u0086\3\2\2\2\u009a\u0088\3\2\2\2\u009a\u008d\3\2\2\2\u009a\u0092\3\2"+
		"\2\2\u009a\u0096\3\2\2\2\u009b\u00a2\3\2\2\2\u009c\u009d\f\7\2\2\u009d"+
		"\u009e\5\36\20\2\u009e\u009f\b\17\1\2\u009f\u00a1\3\2\2\2\u00a0\u009c"+
		"\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\35\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\b\20\1\2\u00a6\u00a7\7\r\2"+
		"\2\u00a7\u00a8\5\36\20\27\u00a8\u00a9\b\20\1\2\u00a9\u0100\3\2\2\2\u00aa"+
		"\u00ab\7\t\2\2\u00ab\u00ac\5\36\20\2\u00ac\u00ad\7%\2\2\u00ad\u00ae\5"+
		"\36\20\2\u00ae\u00af\7\35\2\2\u00af\u00b0\5\36\20\24\u00b0\u00b1\b\20"+
		"\1\2\u00b1\u0100\3\2\2\2\u00b2\u00b3\7\t\2\2\u00b3\u00b4\5\36\20\2\u00b4"+
		"\u00b5\7%\2\2\u00b5\u00b6\5\36\20\22\u00b6\u00b7\b\20\1\2\u00b7\u0100"+
		"\3\2\2\2\u00b8\u00b9\7&\2\2\u00b9\u00ba\5\36\20\6\u00ba\u00bb\b\20\1\2"+
		"\u00bb\u0100\3\2\2\2\u00bc\u00bd\7\n\2\2\u00bd\u00be\5\f\7\2\u00be\u00bf"+
		"\7\b\2\2\u00bf\u00c0\5\36\20\2\u00c0\u00c1\7#\2\2\u00c1\u00c2\5\36\20"+
		"\2\u00c2\u00c3\7\16\2\2\u00c3\u00c4\5\36\20\2\u00c4\u00c5\7\23\2\2\u00c5"+
		"\u00c6\b\20\1\2\u00c6\u0100\3\2\2\2\u00c7\u00c8\7\n\2\2\u00c8\u00c9\5"+
		"\f\7\2\u00c9\u00ca\7\b\2\2\u00ca\u00cb\5\36\20\2\u00cb\u00cc\7\24\2\2"+
		"\u00cc\u00cd\5\36\20\2\u00cd\u00ce\7\16\2\2\u00ce\u00cf\5\36\20\2\u00cf"+
		"\u00d0\7\23\2\2\u00d0\u00d1\b\20\1\2\u00d1\u0100\3\2\2\2\u00d2\u00d3\7"+
		"\5\2\2\u00d3\u00d4\5\36\20\2\u00d4\u00d5\7\16\2\2\u00d5\u00d6\5\36\20"+
		"\2\u00d6\u00d7\7\23\2\2\u00d7\u00d8\b\20\1\2\u00d8\u0100\3\2\2\2\u00d9"+
		"\u00da\7\34\2\2\u00da\u00db\5\36\20\2\u00db\u00dc\7\30\2\2\u00dc\u00dd"+
		"\5\2\2\2\u00dd\u00de\b\20\1\2\u00de\u0100\3\2\2\2\u00df\u00e0\7\36\2\2"+
		"\u00e0\u00e1\5\36\20\2\u00e1\u00e2\7!\2\2\u00e2\u00e3\b\20\1\2\u00e3\u0100"+
		"\3\2\2\2\u00e4\u00e5\5\4\3\2\u00e5\u00e6\b\20\1\2\u00e6\u0100\3\2\2\2"+
		"\u00e7\u00e8\5\f\7\2\u00e8\u00e9\b\20\1\2\u00e9\u0100\3\2\2\2\u00ea\u00eb"+
		"\7\17\2\2\u00eb\u00ec\5\36\20\2\u00ec\u00ed\7\"\2\2\u00ed\u00ee\b\20\1"+
		"\2\u00ee\u0100\3\2\2\2\u00ef\u00f0\5\30\r\2\u00f0\u00f1\b\20\1\2\u00f1"+
		"\u0100\3\2\2\2\u00f2\u00f3\7\17\2\2\u00f3\u00f5\5\36\20\2\u00f4\u00f6"+
		"\5\24\13\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb"+
		"\b\20\1\2\u00fb\u0100\3\2\2\2\u00fc\u00fd\5\34\17\2\u00fd\u00fe\b\20\1"+
		"\2\u00fe\u0100\3\2\2\2\u00ff\u00a5\3\2\2\2\u00ff\u00aa\3\2\2\2\u00ff\u00b2"+
		"\3\2\2\2\u00ff\u00b8\3\2\2\2\u00ff\u00bc\3\2\2\2\u00ff\u00c7\3\2\2\2\u00ff"+
		"\u00d2\3\2\2\2\u00ff\u00d9\3\2\2\2\u00ff\u00df\3\2\2\2\u00ff\u00e4\3\2"+
		"\2\2\u00ff\u00e7\3\2\2\2\u00ff\u00ea\3\2\2\2\u00ff\u00ef\3\2\2\2\u00ff"+
		"\u00f2\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100\u0121\3\2\2\2\u0101\u0102\f\26"+
		"\2\2\u0102\u0103\7\6\2\2\u0103\u0104\5\36\20\27\u0104\u0105\b\20\1\2\u0105"+
		"\u0120\3\2\2\2\u0106\u0107\f\t\2\2\u0107\u0108\7\20\2\2\u0108\u0109\5"+
		"\36\20\n\u0109\u010a\b\20\1\2\u010a\u0120\3\2\2\2\u010b\u010c\f\b\2\2"+
		"\u010c\u010d\7$\2\2\u010d\u010e\5\36\20\t\u010e\u010f\b\20\1\2\u010f\u0120"+
		"\3\2\2\2\u0110\u0111\f\7\2\2\u0111\u0112\t\2\2\2\u0112\u0113\5\36\20\b"+
		"\u0113\u0114\b\20\1\2\u0114\u0120\3\2\2\2\u0115\u0116\f\5\2\2\u0116\u0117"+
		"\t\3\2\2\u0117\u0118\5\36\20\6\u0118\u0119\b\20\1\2\u0119\u0120\3\2\2"+
		"\2\u011a\u011b\f\4\2\2\u011b\u011c\t\4\2\2\u011c\u011d\5\36\20\5\u011d"+
		"\u011e\b\20\1\2\u011e\u0120\3\2\2\2\u011f\u0101\3\2\2\2\u011f\u0106\3"+
		"\2\2\2\u011f\u010b\3\2\2\2\u011f\u0110\3\2\2\2\u011f\u0115\3\2\2\2\u011f"+
		"\u011a\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2"+
		"\2\2\u0122\37\3\2\2\2\u0123\u0121\3\2\2\2\16*\60\65DK]\u009a\u00a2\u00f7"+
		"\u00ff\u011f\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}