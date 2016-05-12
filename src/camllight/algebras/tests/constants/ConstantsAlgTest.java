package camllight.algebras.tests.constants;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConstantsAlgTest extends TestStub {

    @Test
    public void testInt_() throws Exception {
        CamlLight.eval("3;;");
        assertEquals("3", out.toString());
    }

    @Test
    public void testBool() throws Exception {
        CamlLight.eval("true;;");
        assertEquals("true", out.toString());
    }

    @Test
    public void testNull_() throws Exception {
        CamlLight.eval("();;");
        assertEquals("NULL", out.toString());
    }

    @Test
    public void testEmptyListConstant() throws Exception {
        CamlLight.eval("[];;");
        assertEquals("[]", out.toString());
        out.reset();
        CamlLight.eval("[];;");
        assertEquals("[]", out.toString());
    }

    @Test
    public void testEmptyList() throws Exception {
        CamlLight.eval("[];;");
        assertEquals("[]", out.toString());
        out.reset();
        CamlLight.eval("[];;");
        assertEquals("[]", out.toString());
    }
}