package funcons.tests;

import funcons.Store;
import funcons.algebras.LogicIfTrueAlg;
import funcons.interpreter.LogicIfTrueFactory;
import funcons.sorts.IEval;
import funcons.types.Bool;
import funcons.types.Environment;
import funcons.types.Int;
import funcons.types.Null;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicIfTrueFactoryTest {

    private LogicIfTrueAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new LogicIfTrueFactory() {};
    }

    @Test
    public void testBool() throws Exception {
        Bool b = (Bool)alg.bool(false).eval(new Environment(), new Store(), new Null());
        assertEquals(b.boolValue(), false);
    }

    @Test
    public void testNot() throws Exception {
        Bool b = (Bool)alg.not(alg.bool(true)).eval(new Environment(), new Store(), new Null());
        assertFalse(b.boolValue());

        b = (Bool)alg.not(alg.bool(false)).eval(new Environment(), new Store(), new Null());
        assertTrue(b.boolValue());
    }

    @Test
    public void testIfTrue() throws Exception {
        Int i = (Int)alg.ifTrue(alg.bool(false), alg.lit(2), alg.lit(3)).eval(new Environment(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(3));
    }
}