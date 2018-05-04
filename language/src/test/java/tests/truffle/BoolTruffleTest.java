package tests.truffle;

import org.graalvm.polyglot.Source;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoolTruffleTest extends AbstractTruffleTest {


    @Test
    public void testBool() throws Exception {
        engine.eval(Source.newBuilder("fnc", "true;;", "fnc").build());
        assertEquals("true", getAndFlush());
        engine.eval(Source.newBuilder("fnc", "false;;", "fnc").build());
        assertEquals("false", getAndFlush());
    }

    @Test
    public void testNot() throws Exception {
        engine.eval(Source.newBuilder("fnc", "not true;;", "fnc").build());
        assertEquals("false", getAndFlush());
        engine.eval(Source.newBuilder("fnc", "not false;;", "fnc").build());
        assertEquals("true", getAndFlush());
    }

    //
    @Test
    public void testGreater() throws Exception {
//        boolOpTester(this::greater, bool(true), bool(false), bool(false));
        boolOpTester(">", "true", "false", "false");
    }

    //
    @Test
    public void testSmaller() throws Exception {
//        boolOpTester(this::smaller, bool(false), bool(true), bool(false));
        boolOpTester("<", "false", "true", "false");
    }

    //
    @Test
    public void testGreaterEqual() throws Exception {
//        boolOpTester(this::greaterEqual, bool(true), bool(false), bool(true));
        boolOpTester(">=", "true", "false", "true");
    }

    //
    @Test
    public void testSmallerEqual() throws Exception {
//        boolOpTester(this::smallerEqual, bool(false), bool(true), bool(true));
        boolOpTester("<=", "false", "true", "true");
    }

    //
    private void boolOpTester(String operator, String greaterThan, String smallerThan, String equal) throws Exception {

        engine.eval(org.graalvm.polyglot.Source.newBuilder("fnc", "6 " + operator + " 3;;", "fnc").build());
        assertEquals(greaterThan, getAndFlush());
        engine.eval(org.graalvm.polyglot.Source.newBuilder("fnc", "3 " + operator + " 6;;", "fnc").build());
        assertEquals(smallerThan, getAndFlush());
        engine.eval(org.graalvm.polyglot.Source.newBuilder("fnc", "3 " + operator + " 3;;", "fnc").build());
        assertEquals(equal, getAndFlush());

        engine.eval(org.graalvm.polyglot.Source.newBuilder("fnc", "6.0 " + operator + " 3.0;;", "fnc").build());
        assertEquals(greaterThan, getAndFlush());
        engine.eval(org.graalvm.polyglot.Source.newBuilder("fnc", "3.0 " + operator + " 6.0;;", "fnc").build());
        assertEquals(smallerThan, getAndFlush());
        engine.eval(org.graalvm.polyglot.Source.newBuilder("fnc", "3.0 " + operator + " 3.0;;", "fnc").build());
        assertEquals(equal, getAndFlush());

        engine.eval(org.graalvm.polyglot.Source.newBuilder("fnc", "6.0 " + operator + " 3;;", "fnc").build());
        assertEquals(greaterThan, getAndFlush());
        engine.eval(org.graalvm.polyglot.Source.newBuilder("fnc", "3 " + operator + " 6.0;;", "fnc").build());
        assertEquals(smallerThan, getAndFlush());
    }

    //
    @Test
    public void testEqual() throws Exception {
//        assertEquals(bool(true).eval(), equal(lit(3), lit(3)).eval());
//        assertEquals(bool(false).eval(), equal(bool(true), bool(false)).eval());

        engine.eval(Source.newBuilder("fnc", "3 = 3;;", "fnc").build());
        assertEquals("true", getAndFlush());

        engine.eval(Source.newBuilder("fnc", "true = false;;", "fnc").build());
        assertEquals("false", getAndFlush());
    }

//    //
////    /**
////     * TODO: To be fixed
////     * @throws Exception
////     */
//    @Test
////    @Ignore
//    public void testPhysicalEqual() throws Exception {
////        IValue v = lit(1).eval();
////        assertEquals(bool(true).eval(), physicalEqual((e,g) -> v, (e,g) -> v).eval());
////        assertEquals(bool(false).eval(), physicalEqual(lit(1), lit(1)).eval());
//        engine.eval(Source.newBuilder("fnc", "3 = 3;;", "fnc").build());
//        assertEquals("true", getAndFlush());
//
//        engine.eval(Source.newBuilder("fnc", "true = false;;", "fnc").build());
//        assertEquals("false", getAndFlush());
//    }
}