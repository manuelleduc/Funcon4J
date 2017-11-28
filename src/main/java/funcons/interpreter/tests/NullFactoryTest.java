package funcons.interpreter.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import funcons.interpreter.AllFactory;

public class NullFactoryTest implements AllFactory {

    @Test
    public void testNull_() throws Exception {
        assertEquals(null_().eval(), null_().eval());
    }

    @Test
    public void testUndefined() throws Exception {
        assertEquals(undefined().eval(), undefined().eval());
    }
}