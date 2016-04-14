package funcons.tests;

import funcons.Store;
import funcons.algebras.IntCalcAlg;
import funcons.interpreter.IntCalcFactory;
import funcons.sorts.IEval;
import funcons.types.Bool;
import funcons.types.Environment;
import funcons.types.Null;
import org.junit.Before;
import org.junit.Test;

import java.util.function.BiFunction;

import static org.junit.Assert.*;

public class IntCalcFactoryTest {
    private IntCalcAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new IntCalcFactory() {};
    }

    @Test
    public void testLit() throws Exception {
        funcons.types.Int i = (funcons.types.Int)alg.lit(0).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testIntAdd() throws Exception {
        funcons.types.Int i = (funcons.types.Int)alg.intAdd(alg.lit(6), alg.lit(3)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(9), i.intValue());
    }

    @Test
    public void testIntNegate() throws Exception {
        funcons.types.Int i = (funcons.types.Int)alg.intNegate(alg.lit(1)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(-1), i.intValue());
    }

    @Test
    public void testIntSubtract() throws Exception {
        funcons.types.Int i = (funcons.types.Int)alg.intSubtract(alg.lit(6), alg.lit(3)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(3), i.intValue());
    }

    @Test
    public void testIntMultiply() throws Exception {
        funcons.types.Int i = (funcons.types.Int)alg.intMultiply(alg.lit(6), alg.lit(3)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(18), i.intValue());
    }

    @Test
    public void testIntDivide() throws Exception {
        funcons.types.Int i = (funcons.types.Int)alg.intDivide(alg.lit(6), alg.lit(3)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(2), i.intValue());
    }


    @Test
    public void testIntModulo() throws Exception {
        funcons.types.Int i = (funcons.types.Int)alg.intModulo(alg.lit(6), alg.lit(3)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testIntGreater() throws Exception {
        boolOpTester(alg::intGreater, true, false, false);
    }

    @Test
    public void testIntSmaller() throws Exception {
        boolOpTester(alg::intSmaller, false, true, false);
    }

    @Test
    public void testIntGreaterEqual() throws Exception {
        boolOpTester(alg::intGreaterEqual, true, false, true);
    }

    @Test
    public void testIntSmallerEqual() throws Exception {
        boolOpTester(alg::intSmallerEqual, false, true, true);
    }

    private void boolOpTester(BiFunction<IEval, IEval, IEval> f, boolean greaterThan, boolean smallerThan, boolean equal) throws Exception {
        assertEquals(greaterThan, ((Bool)f.apply(alg.lit(6), alg.lit(3)).eval(new Environment(), new Store(), new Null())).boolValue());
        assertEquals(smallerThan, ((Bool)f.apply(alg.lit(3), alg.lit(6)).eval(new Environment(), new Store(), new Null())).boolValue());
        assertEquals(equal, ((Bool)f.apply(alg.lit(3), alg.lit(3)).eval(new Environment(), new Store(), new Null())).boolValue());
    }
}