package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import funcons.values.Null;
import funcons.values.cl.CLVariant;
import funcons.values.signals.RunTimeFunconException;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionAlgTest extends TestStub {

    @Test
    public void testTryWithExp() throws Exception {
        CamlLight.eval("exception Match_failure of int;; try (match 0 with 1 -> true) with Match_failure _ -> false;;");
        assertEquals("false", out.toString());
        out.reset();

        CamlLight.eval("exception Foo;; try raise Foo with Foo -> true;;");
        assertEquals("true", out.toString());
        out.reset();

        try {
            CamlLight.eval("exception Foo;; exception Bar;; try raise Foo with Bar -> true;;");
            assertTrue(false);
        } catch (RunTimeFunconException e) {
            assertEquals(new CLVariant("Foo", new Null()), e);
        }
    }


    @Test
    public void testRaiseExp() throws Exception {
        try {
            CamlLight.eval("exception Foo;; raise Foo;;");
            assertTrue(false);
        } catch (RunTimeFunconException e) {
            assertEquals(new CLVariant("Foo", new Null()), e);
        }
    }

    @Test
    public void testRaiseWithArgumentExp() throws Exception {
        try {
            CamlLight.eval("exception Foo of int;; raise Foo 3;;");
            assertTrue(false);
        } catch (RunTimeFunconException e) {
            assertEquals(new CLVariant("Foo", new funcons.values.Int(3)), e);
            assertNotEquals(new CLVariant("Foo", new funcons.values.Int(2)), e);
        }
    }
}