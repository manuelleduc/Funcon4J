package funcons.interpreter.tests;

import funcons.interpreter.AllFactory;
import funcons.values.Float;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FloatFactoryTest implements AllFactory {

    @Test
    public void testLit() throws Exception {
        Float f = (Float)lit(1.0).eval();
        assertEquals(new Float(1.0), f);
    }

    @Test
    public void testFloatAdd() throws Exception {
        Float f = (Float)floatAdd(lit(1.5), lit(2.5))
                .eval();
        assertEquals(new Float(4.0), f);

        f = (Float)floatAdd(lit(1), lit(2.5))
                .eval();
        assertEquals(new Float(3.5), f);
    }

    @Test
    public void testFloatNegate() throws Exception {
        Float f = (Float)floatNegate(lit(1.5))
                .eval();
        assertEquals(new Float(-1.5), f);
    }

    @Test
    public void testFloatSubtract() throws Exception {
        Float f = (Float)floatSubtract(lit(2.5), lit(1.5))
                .eval();
        assertEquals(new Float(1.0), f);

        f = (Float)floatSubtract(lit(2.5), lit(1))
                .eval();
        assertEquals(new Float(1.5), f);
    }

    @Test
    public void testFloatMultiply() throws Exception {
        Float f = (Float)floatMultiply(lit(2.5), lit(1.5))
                .eval();
        assertEquals(new Float(3.75), f);

        f = (Float)floatMultiply(lit(2.5), lit(2))
                .eval();
        assertEquals(new Float(5.0), f);
    }

    @Test
    public void testFloatDivide() throws Exception {
        Float f = (Float)floatDivide(lit(3.75), lit(1.5))
                .eval();
        assertEquals(new Float(2.5), f);

        f = (Float)floatDivide(lit(3.0), lit(2))
                .eval();
        assertEquals(new Float(1.5), f);
    }

    @Test
    public void testFloatModulo() throws Exception {
        Float f = (Float)floatModulo(lit(4.0), lit(1.5))
                .eval();
        assertEquals(new Float(1.0), f);

        f = (Float)floatModulo(lit(2.5), lit(1))
                .eval();
        assertEquals(new Float(.5), f);
    }

    @Test
    public void testFloatPowerOf() throws Exception {
        Float f = (Float)floatPowerOf(lit(4.0), lit(2.0))
                .eval();
        assertEquals(new Float(16.0), f);

        f = (Float)floatPowerOf(lit(2), lit(1.5))
                .eval();
        assertEquals(new Float(2.8284271247461903), f);
    }
}