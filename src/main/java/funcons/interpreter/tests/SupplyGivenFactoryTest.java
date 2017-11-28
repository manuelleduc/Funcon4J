package funcons.interpreter.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import funcons.interpreter.AllFactory;

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