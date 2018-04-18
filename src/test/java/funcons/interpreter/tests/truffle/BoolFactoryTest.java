package funcons.interpreter.tests.truffle;

import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.vm.PolyglotEngine;
import funcons.truffle.TruffleAllFactory;
import funcons.truffle.nodes.FNCLanguage;
import org.apache.commons.io.output.WriterOutputStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.StringWriter;
import java.nio.charset.Charset;

import static org.junit.Assert.assertEquals;

public class BoolFactoryTest implements TruffleAllFactory {

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
        this.os.flush();
        final String valTrue = getAndFlush();
        assertEquals("true", valTrue);
        engine.eval(Source.newBuilder("false;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        this.os.flush();
        final String valFalse = getAndFlush();
        assertEquals("false", valFalse);
    }

    private String getAndFlush() {
        final String valTrue = this.writer.getBuffer().toString();
        this.writer.getBuffer().replace(0, this.writer.getBuffer().length(), "");
        return valTrue;
    }

    @Test
    public void testNot() throws Exception {
        engine.eval(Source.newBuilder("not true;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        this.os.flush();
        final String valTrue = getAndFlush();
        assertEquals("false", valTrue);
        engine.eval(Source.newBuilder("not false;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        this.os.flush();
        final String valFalse = getAndFlush();
        assertEquals("true", valFalse);
    }
//
//    @Test
//    public void testGreater() throws Exception {
//        boolOpTester(this::greater, bool(true), bool(false), bool(false));
//    }
//
//    @Test
//    public void testSmaller() throws Exception {
//        boolOpTester(this::smaller, bool(false), bool(true), bool(false));
//    }
//
//    @Test
//    public void testGreaterEqual() throws Exception {
//        boolOpTester(this::greaterEqual, bool(true), bool(false), bool(true));
//    }
//
//    @Test
//    public void testSmallerEqual() throws Exception {
//        boolOpTester(this::smallerEqual, bool(false), bool(true), bool(true));
//    }
//
//    private void boolOpTester(
//            BiFunction<IEval, IEval, IEval> f,
//            IEval greaterThan,
//            IEval smallerThan,
//            IEval equal) throws Exception {
//
//        assertEquals(greaterThan.eval(), f.apply(lit(6), lit(3)).eval());
//        assertEquals(smallerThan.eval(), f.apply(lit(3), lit(6)).eval());
//        assertEquals(equal.eval(), f.apply(lit(3), lit(3)).eval());
//
//        assertEquals(greaterThan.eval(), f.apply(lit(6.0), lit(3.0)).eval());
//        assertEquals(smallerThan.eval(), f.apply(lit(3.0), lit(6.0)).eval());
//        assertEquals(equal.eval(), f.apply(lit(3.0), lit(3.0)).eval());
//
//        assertEquals(greaterThan.eval(), f.apply(lit(6.0), lit(3)).eval());
//        assertEquals(smallerThan.eval(), f.apply(lit(3), lit(6.0)).eval());
//    }
//
//    @Test
//    public void testEqual() throws Exception {
//        assertEquals(bool(true).eval(), equal(lit(3), lit(3)).eval());
//        assertEquals(bool(false).eval(), equal(bool(true), bool(false)).eval());
//    }
//
//    /**
//     * TODO: To be fixed
//     * @throws Exception
//     */
//    @Test
//    @Ignore
//    public void testPhysicalEqual() throws Exception {
//        IValue v = lit(1).eval();
//        assertEquals(bool(true).eval(), physicalEqual((e,g) -> v, (e,g) -> v).eval());
//        assertEquals(bool(false).eval(), physicalEqual(lit(1), lit(1)).eval());
//    }
}