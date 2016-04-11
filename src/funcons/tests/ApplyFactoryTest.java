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
        Abs<IEval> abs = (Abs<IEval>)alg.abs(alg.lit(1)).eval(new Environment(), store, new Null());
        Int result = (Int)abs.body().eval(new Environment(), store, new Null());
        assertEquals(result.intValue(), new Integer(1));
    }

    @Test
    public void testApply() throws Exception {
        Int i = (Int)alg.apply(alg.abs(alg.intAdd(alg.lit(1), alg.given())), alg.lit(2)).eval(new Environment(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testClosure() throws Exception {
        IEval closure = alg.closure(alg.boundValue(alg.var("foo")), (e,s,g) -> new Environment(new Variable("foo"), new Int(0)));
        Int i = (Int)closure.eval(new Environment(new Variable("foo"), new Int(1)), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testClose() throws Exception {
        IEval close = alg.close(alg.abs(alg.boundValue(alg.var("foo"))));
        @SuppressWarnings("unchecked")
        Abs<IEval> f = (Abs<IEval>)close.eval(new Environment(new Variable("foo"), new Int(0)), new Store(), new Null());
        Int i = (Int)f.body().eval(new Environment(new Variable("foo"), new Int(1)), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testBind() throws Exception {
        Store store = new Store();
        Environment env = (Environment)alg.apply(alg.bind(alg.var("foo")), alg.lit(3)).eval(new Environment(), store, new Null());
        assertEquals(((Int)alg.boundValue(alg.var("foo")).eval(env, store, new Null())).intValue(), new Integer(3));
    }
}