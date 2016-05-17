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
    public void testFloat_() throws Exception {
        CamlLight.eval("1.;;");
        assertEquals("1.0", out.toString());
        out.reset();

        CamlLight.eval("2.;;");
        assertEquals("2.0", out.toString());
    }

    @Test
    public void testBool() throws Exception {
        CamlLight.eval("true;;");
        assertEquals("true", out.toString());
    }

    @Test
    public void testString() throws Exception {
        CamlLight.eval("\"foo\";;");
        assertEquals("foo", out.toString());
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