package camllight.algebras.tests.patts;

import camllight.CamlLight;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PattMatchAlgTest {
    private ByteArrayOutputStream out;
    private java.io.PrintStream oldOut;

    @Before
    public void setUp() throws Exception {
        oldOut = System.out;
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(oldOut);
    }

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
        CamlLight.eval("let f = fun a b c -> 1 * a + 2 * b + 3 * c in f 2 3 4;;");
        assertEquals("20", out.toString());
    }
}