package funcons.interpreter.tests.truffle;

import funcons.interpreter.AllFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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