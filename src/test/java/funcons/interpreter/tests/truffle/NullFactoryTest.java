package funcons.interpreter.tests.truffle;

import funcons.interpreter.AllFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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