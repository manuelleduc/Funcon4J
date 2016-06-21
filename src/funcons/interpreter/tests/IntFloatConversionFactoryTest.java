package funcons.interpreter.tests;

import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.values.Environment;
import funcons.values.Float;
import funcons.values.Int;
import funcons.values.Null;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntFloatConversionFactoryTest extends TestStub {

    @Test
    public void testIntToFloat() throws Exception {
        Float f = (Float)alg.intToFloat(alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Float((double)0), f);
    }

    @Test
    public void testFloatToInt() throws Exception {
        Int i = (Int)alg.floatToInt(alg.lit(0.0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Int(0), i);
    }
}