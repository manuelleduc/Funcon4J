package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.AllFactory;
import funcons.values.Abs;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import funcons.values.ids.Id;
import funcons.values.ids.NameId;
import org.junit.Test;

import static org.junit.Assert.*;

public class EnvironmentFactoryTest implements AllFactory {

    @Test
    public void testId() throws Exception {
        Id v = (Id)id("foo").eval();
        assertEquals(v.stringValue(), "foo");
    }

    @Test
    public void testNameId() throws Exception {
        NameId v = (NameId)nameId("foo", "bar").eval();
        assertEquals(new NameId("foo", "bar"), v);
        assertNotEquals(new NameId("bar", "bar"), v);
        assertNotEquals(new NameId("bar", "foo"), v);
    }

    @Test
    public void testBindValue() throws Exception {
        Store store = new Store();
        Environment env = (Environment)bindValue(id("foo"), lit(3)).eval(new Environment(), new Forwards(), store, new Null());
        Id v = (Id)id("foo").eval(new Environment(), new Forwards(), store, new Null());
        assertEquals(((Int)env.val(v)).intValue(), new Integer(3));
    }

    @Test
    public void testBoundValue() throws Exception {
        Store store = new Store();
        Environment env = (Environment)bindValue(id("foo"), lit(3)).eval(new Environment(), new Forwards(), store, new Null());
        Int i = (Int)boundValue(id("foo")).eval(env, new Forwards(), store, new Null());
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testScope() throws Exception {
        IEval env1 = bindValue(id("foo"), lit(3));
        IEval env2 = bindValue(id("foo"), lit(2));

        Int i = (Int)scope(env1, scope(env2, boundValue(id("foo")))).eval();

        assertEquals(i.intValue(), new Integer(2));
    }

    @Test
    public void testEnvironment() throws Exception {
        Environment env = (Environment)environment().eval();
        assertNotNull(env);

        env = (Environment)environment(id("foo"), lit(0))
                .eval();
        assertEquals(new Int(0), env.val(new Id("foo")));
    }

    @Test
    public void testAccum() throws Exception {
        IEval accum = accum(bindValue(id("bar"), lit(1)),
                bindValue(id("foo"), intAdd(boundValue(id("bar")), lit(2))));
        Environment env = (Environment)accum.eval();
        assertEquals(new Integer(1), ((Int)env.val(new Id("bar"))).intValue());
        assertEquals(new Integer(3), ((Int)env.val(new Id("foo"))).intValue());
    }

    @Test
    public void testClosure() throws Exception {
        IEval closure = closure(boundValue(id("foo")), (e,f,s,g) -> new Environment(new Id("foo"), new Int(0)));
        Int i = (Int)closure.eval(new Environment(new Id("foo"), new Int(1)), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testClose() throws Exception {
        IEval close = close(abs(boundValue(id("foo"))));
        @SuppressWarnings("unchecked")
        Abs<IEval> f = (Abs<IEval>)close.eval(new Environment(new Id("foo"), new Int(0)), new Forwards(), new Store(), new Null());
        Int i = (Int)f.body().eval(new Environment(new Id("foo"), new Int(1)), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testBind() throws Exception {
        Store store = new Store();
        Environment env = (Environment)apply(bind(id("foo")), lit(3)).eval(new Environment(), new Forwards(), store, new Null());
        assertEquals(((Int)boundValue(id("foo")).eval(env, new Forwards(), store, new Null())).intValue(), new Integer(3));
    }
}