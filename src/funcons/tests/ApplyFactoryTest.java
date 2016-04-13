package funcons.tests;

import funcons.Store;
import funcons.algebras.ApplyAlg;
import funcons.interpreter.ApplyFactory;
import funcons.sorts.IEval;
import funcons.types.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplyFactoryTest {

    private ApplyAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new ApplyFactory() {};
    }

    @Test
    public void testAbs() throws Exception {
        Store store = new Store();
        @SuppressWarnings("unchecked")
        Abs<IEval> abs = (Abs<IEval>)alg.abs(alg.lit(1)).eval(new Environment(), store, alg.given(new Null()));
        Int result = (Int)abs.body().eval(new Environment(), store, alg.given(new Null()));
        assertEquals(result.intValue(), new Integer(1));
    }

    @Test
    public void testApply() throws Exception {
        IEval add = (env, store, given) -> alg.abs(alg.intAdd(alg.lit(1), given)).eval(env, store, given);
        Int i = (Int)alg.apply(add, alg.lit(2)).eval(new Environment(), new Store(), alg.given(new Null()));
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testCompose() throws Exception {
        IEval incr = (env, store, given) -> alg.abs(alg.intAdd(given, alg.lit(1))).eval(env, store, given);
        IEval double_ = (env, store, given) -> alg.abs(alg.intMultiply(given, alg.lit(2))).eval(env, store, given);
        Int i = (Int)alg.apply(alg.compose(double_, incr), alg.lit(3)).eval(new Environment(), new Store(), alg.given(new Null()));
        assertEquals(new Integer(8), i.intValue());
    }

    @Test
    public void testClosure() throws Exception {
        IEval closure = alg.closure(alg.boundValue(alg.id("foo")), (e,s,g) -> new Environment(new Id("foo"), new Int(0)));
        Int i = (Int)closure.eval(new Environment(new Id("foo"), new Int(1)), new Store(), alg.given(new Null()));
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testClose() throws Exception {
        IEval close = alg.close(alg.abs(alg.boundValue(alg.id("foo"))));
        @SuppressWarnings("unchecked")
        Abs<IEval> f = (Abs<IEval>)close.eval(new Environment(new Id("foo"), new Int(0)), new Store(), alg.given(new Null()));
        Int i = (Int)f.body().eval(new Environment(new Id("foo"), new Int(1)), new Store(), alg.given(new Null()));
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testBind() throws Exception {
        Store store = new Store();
        Environment env = (Environment)alg.apply(alg.bind(alg.id("foo")), alg.lit(3)).eval(new Environment(), store, alg.given(new Null()));
        assertEquals(((Int)alg.boundValue(alg.id("foo")).eval(env, store, alg.given(new Null()))).intValue(), new Integer(3));
    }
}