package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoolLogicAlgTest extends TestStub {
    @Test
    public void testLAnd() throws Exception {
        CamlLight.eval("false & false;;");
        assertEquals("false", out.toString());
        out.reset();

        CamlLight.eval("true & false;;");
        assertEquals("false", out.toString());
        out.reset();

        CamlLight.eval("false & true;;");
        assertEquals("false", out.toString());
        out.reset();

        CamlLight.eval("true & true;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("true && true;;");
        assertEquals("true", out.toString());
    }

    @Test
    public void testLOr() throws Exception {
        CamlLight.eval("false || false;;");
        assertEquals("false", out.toString());
        out.reset();

        CamlLight.eval("true || false;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("false || true;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("true || true;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("true or true;;");
        assertEquals("true", out.toString());
    }

    @Test
    public void testLNot() throws Exception {
        CamlLight.eval("not false;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("not true;;");
        assertEquals("false", out.toString());
    }
}