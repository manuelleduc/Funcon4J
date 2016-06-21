package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.AllFactory;
import funcons.values.Bool;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import org.junit.Test;

import java.util.function.BiFunction;

import static org.junit.Assert.*;

public class BoolFactoryTest implements AllFactory {
    @Test
    public void testBool() throws Exception {
        Bool b = (Bool)bool(false).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(b.boolValue(), false);
    }

    @Test
    public void testNot() throws Exception {
        Bool b = (Bool)not(bool(true)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertFalse(b.boolValue());

        b = (Bool)not(bool(false)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertTrue(b.boolValue());
    }

    @Test
    public void testGreater() throws Exception {
        boolOpTester(this::greater, true, false, false);
    }

    @Test
    public void testSmaller() throws Exception {
        boolOpTester(this::smaller, false, true, false);
    }

    @Test
    public void testGreaterEqual() throws Exception {
        boolOpTester(this::greaterEqual, true, false, true);
    }

    @Test
    public void testSmallerEqual() throws Exception {
        boolOpTester(this::smallerEqual, false, true, true);
    }

    private void boolOpTester(BiFunction<IEval, IEval, IEval> f, boolean greaterThan, boolean smallerThan, boolean equal) throws Exception {
        assertEquals(
                greaterThan,
                ((Bool)f.apply(lit(6), lit(3))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
        assertEquals(
                smallerThan,
                ((Bool)f.apply(lit(3), lit(6))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
        assertEquals(
                equal,
                ((Bool)f.apply(lit(3), lit(3))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());

        assertEquals(
                greaterThan,
                ((Bool)f.apply(lit(6.0), lit(3.0))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
        assertEquals(
                smallerThan,
                ((Bool)f.apply(lit(3.0), lit(6.0))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
        assertEquals(
                equal,
                ((Bool)f.apply(lit(3.0), lit(3.0))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());

        assertEquals(
                greaterThan,
                ((Bool)f.apply(lit(6.0), lit(3))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
        assertEquals(
                smallerThan,
                ((Bool)f.apply(lit(3), lit(6.0))
                        .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
    }

    @Test
    public void testEqual() throws Exception {
        assertTrue(((Bool)equal(lit(3), lit(3)).eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
        assertFalse(((Bool)equal(bool(true), bool(false)).eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
    }

    @Test
    public void testPhysicalEqual() throws Exception {
        Int i = new Int(0);
        assertTrue(((Bool)physicalEqual((e,f,s,g) -> i, (e,f,s,g) -> i)
                .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());

        assertFalse(((Bool)physicalEqual(lit(1), lit(1))
                .eval(new Environment(), new Forwards(), new Store(), new Null())).boolValue());
    }
}