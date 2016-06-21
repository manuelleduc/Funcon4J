package funcons.interpreter.tests;

import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.AllFactory;
import funcons.values.Environment;
import funcons.values.Int;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SupplyGivenFactoryTest implements AllFactory {

    @Test
    public void testGiven() throws Exception {
        Int i = (Int)given().eval(new Environment(), new Forwards(), new Store(), new Int(0));
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testSupply() throws Exception {
        Int i = (Int)supply(lit(0), given()).eval();
        assertEquals(i.intValue(), new Integer(0));
    }
}