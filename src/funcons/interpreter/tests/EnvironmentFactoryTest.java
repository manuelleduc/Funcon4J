package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.functions.FunctionFactory;
import funcons.interpreter.storage.EnvironmentFactory;
import funcons.interpreter.values.IntFactory;
import funcons.values.Abs;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import funcons.values.ids.Id;
import funcons.values.ids.NameId;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnvironmentFactoryTest {
    private interface Alg extends EnvironmentFactory, FunctionFactory, IntFactory {}
    private Alg alg;

    @Before
    public void setUp() throws Exception {
        alg = new Alg() {};
    }

    @Test
    public void testId() throws Exception {
        Id v = (Id)alg.id("foo").eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(v.stringValue(), "foo");
    }

    @Test
    public void testNameId() throws Exception {
        NameId v = (NameId)alg.nameId("foo", "bar").eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new NameId("foo", "bar"), v);
        assertNotEquals(new NameId("bar", "bar"), v);
        assertNotEquals(new NameId("bar", "foo"), v);
    }

    @Test
    public void testBindValue() throws Exception {
        Store store = new Store();
        Environment env = (Environment)alg.bindValue(alg.id("foo"), alg.lit(3)).eval(new Environment(), new Forwards(), store, new Null());
        Id v = (Id)alg.id("foo").eval(new Environment(), new Forwards(), store, new Null());
        assertEquals(((Int)env.val(v)).intValue(), new Integer(3));
    }

    @Test
    public void testBoundValue() throws Exception {
        Store store = new Store();
        Environment env = (Environment)alg.bindValue(alg.id("foo"), alg.lit(3)).eval(new Environment(), new Forwards(), store, new Null());
        Int i = (Int)alg.boundValue(alg.id("foo")).eval(env, new Forwards(), store, new Null());
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testScope() throws Exception {
        IEval env1 = alg.bindValue(alg.id("foo"), alg.lit(3));
        IEval env2 = alg.bindValue(alg.id("foo"), alg.lit(2));

        Int i = (Int)alg.scope(env1, alg.scope(env2, alg.boundValue(alg.id("foo")))).eval(new Environment(), new Forwards(), new Store(), new Null());

        assertEquals(i.intValue(), new Integer(2));
    }

    @Test
    public void testEnvironment() throws Exception {
        Environment env = (Environment)alg.environment().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertNotNull(env);

        env = (Environment)alg.environment(alg.id("foo"), alg.lit(0))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Int(0), env.val(new Id("foo")));
    }

    @Test
    public void testAccum() throws Exception {
        IEval accum = alg.accum(alg.bindValue(alg.id("bar"), alg.lit(1)),
                alg.bindValue(alg.id("foo"), alg.intAdd(alg.boundValue(alg.id("bar")), alg.lit(2))));
        Environment env = (Environment)accum.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(1), ((Int)env.val(new Id("bar"))).intValue());
        assertEquals(new Integer(3), ((Int)env.val(new Id("foo"))).intValue());
    }

    @Test
    public void testClosure() throws Exception {
        IEval closure = alg.closure(alg.boundValue(alg.id("foo")), (e,f,s,g) -> new Environment(new Id("foo"), new Int(0)));
        Int i = (Int)closure.eval(new Environment(new Id("foo"), new Int(1)), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testClose() throws Exception {
        IEval close = alg.close(alg.abs(alg.boundValue(alg.id("foo"))));
        @SuppressWarnings("unchecked")
        Abs<IEval> f = (Abs<IEval>)close.eval(new Environment(new Id("foo"), new Int(0)), new Forwards(), new Store(), new Null());
        Int i = (Int)f.body().eval(new Environment(new Id("foo"), new Int(1)), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testBind() throws Exception {
        Store store = new Store();
        Environment env = (Environment)alg.apply(alg.bind(alg.id("foo")), alg.lit(3)).eval(new Environment(), new Forwards(), store, new Null());
        assertEquals(((Int)alg.boundValue(alg.id("foo")).eval(env, new Forwards(), store, new Null())).intValue(), new Integer(3));
    }
}