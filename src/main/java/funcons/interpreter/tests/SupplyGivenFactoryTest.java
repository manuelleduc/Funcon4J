package funcons.interpreter.tests;

import funcons.interpreter.AllFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SupplyGivenFactoryTest implements AllFactory {

    @Test
    public void testGiven() throws Exception {
        assertEquals(lit(0).eval(), supply(lit(0), given()).eval());
    }

    @Test
    public void testSupply() throws Exception {
        assertEquals(lit(0).eval(), supply(lit(0), given()).eval());
    }
}