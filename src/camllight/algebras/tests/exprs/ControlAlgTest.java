package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import funcons.values.cl.CLMatchFailureException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ControlAlgTest extends TestStub {
    @Test
    public void testIf_() throws Exception {
        CamlLight.eval("if true then 0;;");
        assertEquals("0", out.toString());
        out.reset();

        CamlLight.eval("if false then 0;;");
        assertEquals("NULL", out.toString());
    }

    @Test
    public void testIfElse() throws Exception {
        CamlLight.eval("if true then 0 else 1;;");
        assertEquals("0", out.toString());
        out.reset();

        CamlLight.eval("if false then 0 else 1;;");
        assertEquals("1", out.toString());
    }

    @Test
    public void testWhileTrue() throws Exception {
        CamlLight.eval("while false do 1 done;;");
        assertEquals("NULL", out.toString());
    }

    @Test
    public void testFor_() throws Exception {
        CamlLight.eval("for i = 1 to 10 do print i done;;");
        assertEquals("12345678910NULL", out.toString());
    }

    @Test
    public void testForDownto() throws Exception {
        CamlLight.eval("for i = 10 downto 1 do print i done;;");
        assertEquals("10987654321NULL", out.toString());
    }

    @Test
    public void testMatchWith() throws Exception {
        CamlLight.eval("match 0 with 0 -> true;;");
        assertEquals("true", out.toString());

        try {
            CamlLight.eval("match 0 with 1 -> true;;");
        } catch (CLMatchFailureException ignore) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testSeq() throws Exception {
        CamlLight.eval("0 ; 1;;");
        assertEquals("1", out.toString());
    }
}