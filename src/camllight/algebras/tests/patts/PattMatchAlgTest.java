package camllight.algebras.tests.patts;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PattMatchAlgTest extends TestStub {

    @Test
    public void testPattMatch() throws Exception {
        CamlLight.eval("match 1 with 1 -> true;;");
        assertEquals("true", out.toString());
    }

    @Test
    public void testPattMatchMulti() throws Exception {
        CamlLight.eval("match 1 with 1 -> true | _ -> false;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match 1 with 0 -> true | _ -> false;;");
        assertEquals("false", out.toString());
    }

    @Test
    public void testPattMatchStripe() throws Exception {
        CamlLight.eval("match 1 with 1 -> true;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match 1 with | 1 -> true;;");
        assertEquals("true", out.toString());
    }

    @Test
    public void testPattMatchCurriedMulti() throws Exception {
        CamlLight.eval("let f = fun a b c -> 1 * a + 2 * b + 3 * c in f 2 3 5;;");
        assertEquals("23", out.toString());
    }
}