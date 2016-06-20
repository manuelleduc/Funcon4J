package funcons.interpreter.tests;

import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.controlflow.LogicControlFactory;
import funcons.interpreter.values.BoolFactory;
import funcons.interpreter.values.IntFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogicControlFactoryTest {
    private interface Alg extends LogicControlFactory, BoolFactory, IntFactory {}
    private Alg alg;

    @Before
    public void setUp() throws Exception {
        alg = new Alg() {};
    }

    @Test
    public void testEffect() throws Exception {
        Null n = (Null)alg.effect(alg.intAdd(alg.lit(2), alg.lit(3)))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Null(), n);
    }

    @Test
    public void testSeq() throws Exception {
        funcons.values.Int i = (funcons.values.Int)alg.seq(alg.lit(3), alg.lit(2))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(2));
    }

    @Test
    public void testIfTrue() throws Exception {
        Int i = (Int)alg.ifTrue(alg.bool(false), alg.lit(2), alg.lit(3))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testWhileTrue() throws Exception {
        Null n = (Null)alg.whileTrue(alg.bool(false), alg.intAdd(alg.lit(2), alg.lit(3)))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Null(), n);
    }
}