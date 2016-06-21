package funcons.interpreter.tests;

import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SupplyGivenFactoryTest extends TestStub {

    @Test
    public void testGiven() throws Exception {
        Int i = (Int)alg.given().eval(new Environment(), new Forwards(), new Store(), new Int(0));
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testSupply() throws Exception {
        Int i = (Int)alg.supply(alg.lit(0), alg.given()).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(0));
    }
}