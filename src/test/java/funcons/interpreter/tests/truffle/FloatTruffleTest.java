package funcons.interpreter.tests.truffle;

import com.oracle.truffle.api.source.Source;
import funcons.truffle.nodes.FNCLanguage;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FloatTruffleTest extends AbstractTruffleTest {

    @Test
    public void testLit() throws Exception {
        engine.eval(Source.newBuilder("1.0;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("1.0", getAndFlush());
//        assertEquals(lit(1.0).eval(), lit(1.0).eval());
//        assertNotEquals(lit(1.0).eval(), lit(2.0).eval());
    }

    @Test
    public void testFloatAdd() throws Exception {
        engine.eval(Source.newBuilder("1.5 + 2.5;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("4.0", getAndFlush());
//        assertEquals(lit(4.0).eval(), floatAdd(lit(1.5), lit(2.5)).eval());


        engine.eval(Source.newBuilder("1 + 2.5;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("3.5", getAndFlush());
//        assertEquals(lit(3.5).eval(), floatAdd(lit(1), lit(2.5)).eval());
    }

    /**
     * Impossible to express with CamlLight
     *
     * @throws Exception
     */
    @Test
    @Ignore
    public void testFloatNegate() throws Exception {
//        assertEquals(lit(-1.5).eval(), floatNegate(lit(1.5)).eval());
        engine.eval(Source.newBuilder("-1.5;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("-1.5", getAndFlush());
    }

    @Test
    public void testFloatSubtract() throws Exception {
        engine.eval(Source.newBuilder("2.5 - 1.5;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("1.0", getAndFlush());
        engine.eval(Source.newBuilder("2.5-1;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("1.5", getAndFlush());
//        assertEquals(lit(1.0).eval(), floatSubtract(lit(2.5), lit(1.5)).eval());
//        assertEquals(lit(1.5).eval(), floatSubtract(lit(2.5), lit(1)).eval());
    }

    @Test
    public void testFloatMultiply() throws Exception {
        engine.eval(Source.newBuilder("2.5 * 1.5;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("3.75", getAndFlush());
        engine.eval(Source.newBuilder("2.5 * 2;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("5.0", getAndFlush());
//        assertEquals(lit(3.75).eval(), floatMultiply(lit(2.5), lit(1.5)).eval());
//        assertEquals(lit(5.0).eval(), floatMultiply(lit(2.5), lit(2)).eval());
    }

    @Test
    public void testFloatDivide() throws Exception {
        engine.eval(Source.newBuilder("3.75 / 1.5;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("2.5", getAndFlush());
        engine.eval(Source.newBuilder("3.0 / 2;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("1.5", getAndFlush());
//        assertEquals(lit(2.5).eval(), floatDivide(lit(3.75), lit(1.5)).eval());
//        assertEquals(lit(1.5).eval(), floatDivide(lit(3.0), lit(2)).eval());
    }

    @Test
    public void testFloatModulo() throws Exception {
        engine.eval(Source.newBuilder("4.0 mod 1.5;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("1.0", getAndFlush());
        engine.eval(Source.newBuilder("2.5 mod 1;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("0.5", getAndFlush());
//        assertEquals(lit(1.0).eval(), floatModulo(lit(4.0), lit(1.5)).eval());
//        assertEquals(lit(0.5).eval(), floatModulo(lit(2.5), lit(1)).eval());
    }

    @Test
    public void testFloatPowerOf() throws Exception {
        engine.eval(Source.newBuilder("4.0 ** 2.0;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("16.00000", getAndFlush());
        engine.eval(Source.newBuilder("2 ** 1.5;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("2.82843", getAndFlush());
//        assertEquals("16.00000", floatPowerOf(lit(4.0), lit(2.0)).eval().toString());
//        assertEquals("2.82843", floatPowerOf(lit(2), lit(1.5)).eval().toString());
    }
}