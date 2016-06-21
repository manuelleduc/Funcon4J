package funcons.interpreter.tests;

import funcons.interpreter.AllFactory;
import funcons.values.Null;
import funcons.values.Undefined;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NullFactoryTest implements AllFactory {

    @Test
    public void testNull_() throws Exception {
        Null n = (Null)null_().eval();
        assertEquals(n, new Null());
    }

    @Test
    public void testUndefined() throws Exception {
        Undefined u = (Undefined)undefined().eval();
        assertEquals(new Undefined(), u);
    }
}