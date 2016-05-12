package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExpAlgTest extends TestStub {

    @Test
    public void testConstExp() throws Exception {
        CamlLight.eval("3;;");
        assertEquals("3", out.toString());
    }

    @Test
    public void testIdExp() throws Exception {
        CamlLight.eval("foo;;");
        assertEquals("null", out.toString());
    }

    @Test
    public void testBracketedExp() throws Exception {
        CamlLight.eval("(3);;");
        String result = out.toString();
        out.reset();
        CamlLight.eval("3;;");
        assertEquals(result, out.toString());

        out.reset();

        CamlLight.eval("(1 + 2) * 3;;");
        assertEquals("9", out.toString());
    }

    @Test
    public void testBeginEndExp() throws Exception {
        CamlLight.eval("begin 3 end;;");
        String result = out.toString();
        out.reset();
        CamlLight.eval("3;;");
        assertEquals(result, out.toString());

        out.reset();

        CamlLight.eval("begin 1 + 2 end * 3;;");
        assertEquals("9", out.toString());
    }

    @Test
    public void testTypedExp() throws Exception {
        CamlLight.eval("(3 : int);;");
        assertEquals("3", out.toString());
    }
}