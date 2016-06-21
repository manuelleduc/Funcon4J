package funcons.interpreter.tests;

import funcons.interpreter.AllFactory;
import funcons.values.Float;
import funcons.values.Int;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntFloatConversionFactoryTest implements AllFactory {

    @Test
    public void testIntToFloat() throws Exception {
        Float f = (Float)intToFloat(lit(0)).eval();
        assertEquals(new Float((double)0), f);
    }

    @Test
    public void testFloatToInt() throws Exception {
        Int i = (Int)floatToInt(lit(0.0)).eval();
        assertEquals(new Int(0), i);
    }
}