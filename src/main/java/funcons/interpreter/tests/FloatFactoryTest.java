package funcons.interpreter.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import funcons.interpreter.AllFactory;

public class FloatFactoryTest implements AllFactory {

    @Test
    public void testLit() throws Exception {
        assertEquals(lit(1.0).eval(), lit(1.0).eval());
        assertNotEquals(lit(1.0).eval(), lit(2.0).eval());
    }

    @Test
    public void testFloatAdd() throws Exception {
        assertEquals(lit(4.0).eval(), floatAdd(lit(1.5), lit(2.5)).eval());
        assertEquals(lit(3.5).eval(), floatAdd(lit(1), lit(2.5)).eval());
    }

    @Test
    public void testFloatNegate() throws Exception {
        assertEquals(lit(-1.5).eval(), floatNegate(lit(1.5)).eval());
    }

    @Test
    public void testFloatSubtract() throws Exception {
        assertEquals(lit(1.0).eval(), floatSubtract(lit(2.5), lit(1.5)).eval());
        assertEquals(lit(1.5).eval(), floatSubtract(lit(2.5), lit(1)).eval());
    }

    @Test
    public void testFloatMultiply() throws Exception {
        assertEquals(lit(3.75).eval(), floatMultiply(lit(2.5), lit(1.5)).eval());
        assertEquals(lit(5.0).eval(), floatMultiply(lit(2.5), lit(2)).eval());
    }

    @Test
    public void testFloatDivide() throws Exception {
        assertEquals(lit(2.5).eval(), floatDivide(lit(3.75), lit(1.5)).eval());
        assertEquals(lit(1.5).eval(), floatDivide(lit(3.0), lit(2)).eval());
    }

    @Test
    public void testFloatModulo() throws Exception {
        assertEquals(lit(1.0).eval(), floatModulo(lit(4.0), lit(1.5)).eval());
        assertEquals(lit(0.5).eval(), floatModulo(lit(2.5), lit(1)).eval());
    }

    @Test
    public void testFloatPowerOf() throws Exception {
        assertEquals("16.00000", floatPowerOf(lit(4.0), lit(2.0)).eval().toString());
        assertEquals("2.82843", floatPowerOf(lit(2), lit(1.5)).eval().toString());
    }
}