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

        CamlLight.eval("2.0;;");
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
        out.reset();

        CamlLight.eval("\"\\\\ \\\" \\n \\r \\t \\b \\065\";;");
        assertEquals("\\ \" \n \r \t \b A", out.toString());
    }

    @Test
    public void testChar_() throws Exception {
        CamlLight.eval("`a`;;");
        assertEquals("a", out.toString());
        out.reset();

        CamlLight.eval("`\\\\`;;");
        assertEquals("\\", out.toString());
        out.reset();

        CamlLight.eval("`\\``;;");
        assertEquals("`", out.toString());
        out.reset();

        CamlLight.eval("`\\n`;;");
        assertEquals("\n", out.toString());
        out.reset();


        CamlLight.eval("`\\r`;;");
        assertEquals("\r", out.toString());
        out.reset();

        CamlLight.eval("`\\t`;;");
        assertEquals("\t", out.toString());
        out.reset();

        CamlLight.eval("`\\b`;;");
        assertEquals("\b", out.toString());
        out.reset();

        CamlLight.eval("`\\065`;;");
        assertEquals("A", out.toString());
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