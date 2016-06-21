package funcons.interpreter.tests;

import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.AllFactory;
import funcons.values.Environment;
import funcons.values.Null;
import funcons.values.Undefined;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NullFactoryTest implements AllFactory {

    @Test
    public void testNull_() throws Exception {
        Null n = (Null)null_().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(n, new Null());
    }

    @Test
    public void testUndefined() throws Exception {
        Undefined u = (Undefined)undefined().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Undefined(), u);
    }
}