package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.*;

public class RefAlgTest extends TestStub {

    @Test
    public void testDereferenceExp() throws Exception {
        CamlLight.eval("!(ref 3);;");
        assertEquals("3", out.toString());
        out.reset();

        CamlLight.eval("let x = ref 5;; !x;;");
        assertEquals("5", out.toString());
    }

    @Test
    public void testRefAssignExp() throws Exception {
        CamlLight.eval("let x = ref 3;; x := 4; !x;;");
        assertEquals("4", out.toString());
        out.reset();

        CamlLight.eval("(ref 1) := 2;;");
        assertEquals("NULL", out.toString());
    }
}