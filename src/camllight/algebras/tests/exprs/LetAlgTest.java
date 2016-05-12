package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetAlgTest extends TestStub {
    @Test
    public void testLetExp() throws Exception {
        CamlLight.eval("let x = 3;; x;;");
        assertEquals("3", out.toString());
        out.reset();

        CamlLight.eval("let add1 = fun x -> x + 1;; add1 10;;");
        assertEquals("11", out.toString());
    }

    @Test
    public void testLetInExp() throws Exception {
        CamlLight.eval("let x = 3 in x;;");
        assertEquals("3", out.toString());
        out.reset();

        CamlLight.eval("let add1 = fun x -> x + 1 in add1 10;;");
        assertEquals("11", out.toString());
    }
}