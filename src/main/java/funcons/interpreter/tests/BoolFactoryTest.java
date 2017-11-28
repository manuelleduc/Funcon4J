package funcons.interpreter.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.function.BiFunction;

import org.junit.Test;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import io.usethesource.vallang.IValue;

public class BoolFactoryTest implements AllFactory {
    @Test
    public void testBool() throws Exception {
        assertEquals(bool(true).eval(), bool(true).eval());
        assertEquals(bool(false).eval(), bool(false).eval());
        assertNotEquals(bool(true).eval(), bool(false).eval());
    }

    @Test
    public void testNot() throws Exception {
        assertEquals(bool(true).eval(), not(bool(false)).eval());
        assertEquals(bool(false).eval(), not(bool(true)).eval());
    }

    @Test
    public void testGreater() throws Exception {
        boolOpTester(this::greater, bool(true), bool(false), bool(false));
    }

    @Test
    public void testSmaller() throws Exception {
        boolOpTester(this::smaller, bool(false), bool(true), bool(false));
    }

    @Test
    public void testGreaterEqual() throws Exception {
        boolOpTester(this::greaterEqual, bool(true), bool(false), bool(true));
    }

    @Test
    public void testSmallerEqual() throws Exception {
        boolOpTester(this::smallerEqual, bool(false), bool(true), bool(true));
    }

    private void boolOpTester(
            BiFunction<IEval, IEval, IEval> f,
            IEval greaterThan,
            IEval smallerThan,
            IEval equal) throws Exception {

        assertEquals(greaterThan.eval(), f.apply(lit(6), lit(3)).eval());
        assertEquals(smallerThan.eval(), f.apply(lit(3), lit(6)).eval());
        assertEquals(equal.eval(), f.apply(lit(3), lit(3)).eval());

        assertEquals(greaterThan.eval(), f.apply(lit(6.0), lit(3.0)).eval());
        assertEquals(smallerThan.eval(), f.apply(lit(3.0), lit(6.0)).eval());
        assertEquals(equal.eval(), f.apply(lit(3.0), lit(3.0)).eval());

        assertEquals(greaterThan.eval(), f.apply(lit(6.0), lit(3)).eval());
        assertEquals(smallerThan.eval(), f.apply(lit(3), lit(6.0)).eval());
    }

    @Test
    public void testEqual() throws Exception {
        assertEquals(bool(true).eval(), equal(lit(3), lit(3)).eval());
        assertEquals(bool(false).eval(), equal(bool(true), bool(false)).eval());
    }

    @Test
    public void testPhysicalEqual() throws Exception {
        IValue v = lit(1).eval();
        assertEquals(bool(true).eval(), physicalEqual((e,g) -> v, (e,g) -> v).eval());
        assertEquals(bool(false).eval(), physicalEqual(lit(1), lit(1)).eval());
    }
}