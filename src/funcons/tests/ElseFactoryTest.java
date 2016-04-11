package funcons.tests;

import funcons.algebras.ElseAlg;
import funcons.interpreter.ElseFactory;
import funcons.signals.FailureTrueSignal;
import funcons.sorts.IEval;
import funcons.types.Bool;
import funcons.types.Environment;
import funcons.types.Int;
import funcons.types.Null;
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
        assertTrue(((Bool)alg.equal(alg.lit(3), alg.lit(3)).eval(new Environment(), new Null())).boolValue());
        assertFalse(((Bool)alg.equal(alg.bool(true), alg.bool(false)).eval(new Environment(), new Null())).boolValue());
    }

    @Test
    public void testFail() throws Exception {
        try {
            alg.fail().eval(new Environment(), new Null());
        } catch (FailureTrueSignal ignored) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testElse_() throws Exception {
        Int i = (Int)alg.else_(alg.fail(), alg.lit(3)).eval(new Environment(), new Null());
        assertEquals(i.intValue(), new Integer(3));

        i = (Int)alg.else_(alg.lit(2), alg.lit(3)).eval(new Environment(), new Null());
        assertEquals(i.intValue(), new Integer(2));
    }

    @Test
    public void testOnly() throws Exception {
        Bool b = (Bool)alg.seq(alg.apply(alg.only(alg.lit(0)), alg.lit(0)), alg.bool(true)).eval(new Environment(), new Null());
        assertTrue(b.boolValue());

        b = (Bool)alg.else_(alg.apply(alg.only(alg.lit(0)), alg.lit(1)), alg.bool(false)).eval(new Environment(), new Null());
        assertFalse(b.boolValue());
    }

    @Test
    public void testAny() throws Exception {
        Bool b = (Bool)alg.seq(alg.apply(alg.any(), alg.lit(0)), alg.bool(true)).eval(new Environment(), new Null());
        assertTrue(b.boolValue());
    }

    @Test
    public void testMatch() throws Exception {
        Bool b = (Bool)alg.seq(alg.match(alg.lit(0), alg.any()), alg.bool(true)).eval(new Environment(), new Null());
        assertTrue(b.boolValue());

        b = (Bool)alg.else_(alg.match(alg.lit(0), alg.only(alg.lit(1))), alg.bool(false)).eval(new Environment(), new Null());
        assertFalse(b.boolValue());
    }

    @Test
    public void testPattAbs() throws Exception {
        IEval part1 = alg.bind(alg.var("x"));
        IEval part2 = alg.intAdd(alg.boundValue(alg.var("x")), alg.lit(1));
        IEval incr = alg.pattAbs(part1, part2);
        Int i = (Int)alg.apply(incr, alg.lit(2)).eval(new Environment(), new Null());
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testThrow_() throws Exception {
        
    }

    @Test
    public void testPreferOver() throws Exception {

    }
}