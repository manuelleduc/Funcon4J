package funcons.tests;

import funcons.Store;
import funcons.algebras.ElseAlg;
import funcons.interpreter.ElseFactory;
import funcons.sorts.IEval;
import funcons.types.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElseFactoryTest {

    private ElseAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new ElseFactory() {};
    }

    @Test
    public void testEqual() throws Exception {
        assertTrue(((Bool)alg.equal(alg.lit(3), alg.lit(3)).eval(new Environment(), new Store(), alg.given(new Null()))).boolValue());
        assertFalse(((Bool)alg.equal(alg.bool(true), alg.bool(false)).eval(new Environment(), new Store(), alg.given(new Null()))).boolValue());
    }

    @Test
    public void testOnly() throws Exception {
        Bool b = (Bool)alg.seq(alg.apply(alg.only(alg.lit(0)), alg.lit(0)), alg.bool(true)).eval(new Environment(), new Store(), alg.given(new Null()));
        assertTrue(b.boolValue());

        b = (Bool)alg.else_(alg.apply(alg.only(alg.lit(0)), alg.lit(1)), alg.bool(false)).eval(new Environment(), new Store(), alg.given(new Null()));
        assertFalse(b.boolValue());
    }

    @Test
    public void testAny() throws Exception {
        Bool b = (Bool)alg.seq(alg.apply(alg.any(), alg.lit(0)), alg.bool(true)).eval(new Environment(), new Store(), alg.given(new Null()));
        assertTrue(b.boolValue());
    }

    @Test
    public void testWhenTrue() throws Exception {
        Int i =(Int)alg.whenTrue(alg.bool(true), alg.lit(0)).eval(new Environment(), new Store(), alg.given(new Null()));
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testMatch() throws Exception {
        Bool b = (Bool)alg.seq(alg.match(alg.lit(0), alg.any()), alg.bool(true)).eval(new Environment(), new Store(), alg.given(new Null()));
        assertTrue(b.boolValue());

        b = (Bool)alg.else_(alg.match(alg.lit(0), alg.only(alg.lit(1))), alg.bool(false)).eval(new Environment(), new Store(), alg.given(new Null()));
        assertFalse(b.boolValue());
    }

    @Test
    public void testPattAbs() throws Exception {
        IEval part1 = alg.bind(alg.id("x"));
        IEval part2 = alg.intAdd(alg.boundValue(alg.id("x")), alg.lit(1));
        IEval incr = alg.pattAbs(part1, part2);
        Int i = (Int)alg.apply(incr, alg.lit(2)).eval(new Environment(), new Store(), alg.given(new Null()));
        assertEquals(new Integer(3), i.intValue());
    }

    @Test
    public void testPattUnion() throws Exception {
        {
            Store store = new Store();
            IEval patt1 = alg.abs(alg.bindValue(alg.id("foo"), alg.lit(1)));
            IEval patt2 = alg.abs(alg.bindValue(alg.id("bar"), alg.lit(2)));

            @SuppressWarnings("unchecked")
            Abs<IEval> abs = (Abs<IEval>) alg.pattUnion(patt1, patt2).eval(new Environment(), store, alg.given(new Null()));

            Int i = (Int) alg.scope(
                    abs.body(),
                    alg.intAdd(alg.boundValue(alg.id("foo")), alg.boundValue(alg.id("bar")))
            ).eval(new Environment(), store, alg.given(new Null()));

            assertEquals(new Integer(3), i.intValue());
        }
        {
            Store store = new Store();
            IEval patt1 = alg.abs(alg.bindValue(alg.id("foo"), alg.lit(1)));
            IEval patt2 = alg.abs(alg.bindValue(alg.id("foo"), alg.lit(2)));

            @SuppressWarnings("unchecked")
            Abs<IEval> abs2 = (Abs<IEval>) alg.pattUnion(patt1, patt2).eval(new Environment(), store, alg.given(new Null()));
            Int i = (Int)alg.scope(abs2.body(), alg.boundValue(alg.id("foo"))).eval(new Environment(), store, alg.given(new Null()));
            assertEquals(new Integer(2), i.intValue());
        }
    }

    @Test
    public void testPattNonBinding() throws Exception {
        Store store = new Store();
        IEval pat = alg.pattNonBinding(alg.bind(alg.id("foo")));
        Environment env = (Environment)pat.eval(new Environment(), store, alg.given(new Null()));
        Value null_ = alg.boundValue(alg.id("foo")).eval(env, store, alg.given(new Null()));
        assertNull(null_);
    }
}