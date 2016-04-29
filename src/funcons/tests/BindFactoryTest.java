package funcons.tests;

import funcons.Store;
import funcons.algebras.BindAlg;
import funcons.interpreter.BindFactory;
import funcons.sorts.IEval;
import funcons.values.*;
import funcons.values.ids.Id;
import funcons.values.ids.NameId;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BindFactoryTest {

    private BindAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new BindFactory() {};
    }

    @Test
    public void testId() throws Exception {
        Id v = (Id)alg.id("foo").eval(new Environment(), new Store(), new Null());
        assertEquals(v.stringValue(), "foo");
    }

    @Test
    public void testNameId() throws Exception {
        NameId v = (NameId)alg.nameId("foo", "bar").eval(new Environment(), new Store(), new Null());
        assertEquals(new NameId("foo", "bar"), v);
        assertNotEquals(new NameId("bar", "bar"), v);
        assertNotEquals(new NameId("bar", "foo"), v);
    }

    @Test
    public void testBindValue() throws Exception {
        Store store = new Store();
        Environment env = (Environment)alg.bindValue(alg.id("foo"), alg.lit(3)).eval(new Environment(), store, new Null());
        Id v = (Id)alg.id("foo").eval(new Environment(), store, new Null());
        assertEquals(((Int)env.val(v)).intValue(), new Integer(3));
    }

    @Test
    public void testBoundValue() throws Exception {
        Store store = new Store();
        Environment env = (Environment)alg.bindValue(alg.id("foo"), alg.lit(3)).eval(new Environment(), store, new Null());
        Int i = (Int)alg.boundValue(alg.id("foo")).eval(env, store, new Null());
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testScope() throws Exception {
        IEval env1 = alg.bindValue(alg.id("foo"), alg.lit(3));
        IEval env2 = alg.bindValue(alg.id("foo"), alg.lit(2));

        Int i = (Int)alg.scope(env1, alg.scope(env2, alg.boundValue(alg.id("foo")))).eval(new Environment(), new Store(), new Null());

        assertEquals(i.intValue(), new Integer(2));
    }

    @Test
    public void testGiven() throws Exception {
        Int i = (Int)alg.given().eval(new Environment(), new Store(), new Int(0));
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testSupply() throws Exception {
        Int i = (Int)alg.supply(alg.lit(0), alg.given()).eval(new Environment(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testEnvironmentUnion() throws Exception {
        IEval e1 = alg.bindValue(alg.id("x"), alg.lit(1));
        IEval e2 = alg.bindValue(alg.id("y"), alg.lit(2));
        Environment env = (Environment)alg.environmentUnion(e1, e2).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(1), ((Int)env.val(new Id("x"))).intValue());
        assertEquals(new Integer(2), ((Int)env.val(new Id("y"))).intValue());

        e1 = alg.bindValue(alg.id("x"), alg.lit(1));
        e2 = alg.bindValue(alg.id("x"), alg.lit(2));
        env = (Environment)alg.environmentUnion(e1, e2).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(2), ((Int)env.val(new Id("x"))).intValue());
    }

    @Test
    public void testEnvironmentOver() throws Exception {
        IEval e1 = alg.bindValue(alg.id("x"), alg.lit(1));
        IEval e2 = alg.bindValue(alg.id("y"), alg.lit(2));
        Environment env = (Environment)alg.environmentOver(e1, e2).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(1), ((Int)env.val(new Id("x"))).intValue());
        assertEquals(new Integer(2), ((Int)env.val(new Id("y"))).intValue());

        e1 = alg.bindValue(alg.id("x"), alg.lit(1));
        e2 = alg.bindValue(alg.id("x"), alg.lit(2));
        env = (Environment)alg.environmentOver(e1, e2).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(1), ((Int)env.val(new Id("x"))).intValue());

    }
}