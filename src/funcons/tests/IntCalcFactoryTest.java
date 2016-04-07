package funcons.tests;

import funcons.algebras.IntCalcAlg;
import funcons.interpreter.IntCalcFactory;
import funcons.sorts.IEval;
import funcons.types.Environment;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntCalcFactoryTest {
    private IntCalcAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new IntCalcFactory() {};
    }

    @Test
    public void testLit() throws Exception {
        funcons.types.Int i = (funcons.types.Int)alg.lit(0).eval(new Environment());
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testBool() throws Exception {
        funcons.types.Bool b = (funcons.types.Bool)alg.bool(false).eval(new Environment());
        assertEquals(b.boolValue(), false);
    }

    @Test
    public void testIntAdd() throws Exception {
        funcons.types.Int i = (funcons.types.Int)alg.intAdd(alg.lit(6), alg.lit(3)).eval(new Environment());
        assertEquals(i.intValue(), new Integer(9));
    }

    @Test
    public void testIntSubtract() throws Exception {
        funcons.types.Int i = (funcons.types.Int)alg.intSubtract(alg.lit(6), alg.lit(3)).eval(new Environment());
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testIntMultiply() throws Exception {
        funcons.types.Int i = (funcons.types.Int)alg.intMultiply(alg.lit(6), alg.lit(3)).eval(new Environment());
        assertEquals(i.intValue(), new Integer(18));
    }

    @Test
    public void testIntDivide() throws Exception {
        funcons.types.Int i = (funcons.types.Int)alg.intDivide(alg.lit(6), alg.lit(3)).eval(new Environment());
        assertEquals(i.intValue(), new Integer(2));
    }
}