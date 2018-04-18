package funcons.interpreter.tests.truffle;

import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.vm.PolyglotEngine;
import funcons.truffle.nodes.FNCLanguage;
import org.apache.commons.io.output.WriterOutputStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;

import static org.junit.Assert.assertEquals;

public class BoolFactoryTest {

    private PolyglotEngine engine;
    private WriterOutputStream os;
    private StringWriter writer;


    @Before
    public void initEngine() throws Exception {
        this.writer = new StringWriter();
        this.os = new WriterOutputStream(writer, Charset.defaultCharset());
        engine = PolyglotEngine.newBuilder().setOut(os).build();

    }

    @After
    public void dispose() {
        engine.dispose();
    }

    @Test
    public void testBool() throws Exception {
        engine.eval(Source.newBuilder("true;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("true", getAndFlush());
        engine.eval(Source.newBuilder("false;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("false", getAndFlush());
    }

    private String getAndFlush() throws IOException {
        this.os.flush();
        final String valTrue = this.writer.getBuffer().toString();
        this.writer.getBuffer().replace(0, this.writer.getBuffer().length(), "");
        return valTrue;
    }

    @Test
    public void testNot() throws Exception {
        engine.eval(Source.newBuilder("not true;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("false", getAndFlush());
        engine.eval(Source.newBuilder("not false;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
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
    private void boolOpTester(
            String operator,
            String greaterThan,
            String smallerThan,
            String equal) throws Exception {

        engine.eval(Source.newBuilder("6 " + operator + " 3;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals(greaterThan, getAndFlush());
        engine.eval(Source.newBuilder("3 " + operator + " 6;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals(smallerThan, getAndFlush());
        engine.eval(Source.newBuilder("3 " + operator + " 3;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals(equal, getAndFlush());

        engine.eval(Source.newBuilder("6.0 " + operator + " 3.0;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals(greaterThan, getAndFlush());
        engine.eval(Source.newBuilder("3.0 " + operator + " 6.0;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals(smallerThan, getAndFlush());
        engine.eval(Source.newBuilder("3.0 " + operator + " 3.0;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals(equal, getAndFlush());

        engine.eval(Source.newBuilder("6.0 " + operator + " 3;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals(greaterThan, getAndFlush());
        engine.eval(Source.newBuilder("3 " + operator + " 6.0;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals(smallerThan, getAndFlush());
    }

    //
    @Test
    public void testEqual() throws Exception {
//        assertEquals(bool(true).eval(), equal(lit(3), lit(3)).eval());
//        assertEquals(bool(false).eval(), equal(bool(true), bool(false)).eval());

        engine.eval(Source.newBuilder("3 = 3;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("true", getAndFlush());

        engine.eval(Source.newBuilder("true = false;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
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
//        engine.eval(Source.newBuilder("3 = 3;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
//        assertEquals("true", getAndFlush());
//
//        engine.eval(Source.newBuilder("true = false;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
//        assertEquals("false", getAndFlush());
//    }
}