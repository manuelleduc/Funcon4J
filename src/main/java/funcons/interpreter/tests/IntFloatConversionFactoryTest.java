package funcons.interpreter.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import funcons.interpreter.AllFactory;

public class IntFloatConversionFactoryTest implements AllFactory {

    @Test
    public void testIntToFloat() throws Exception {
        assertEquals(lit(0).eval(), floatToInt(intToFloat(lit(0))).eval());
    }

    @Test
    public void testFloatToInt() throws Exception {
        assertEquals(lit(0).eval(), floatToInt(lit(0.0)).eval());
    }
}