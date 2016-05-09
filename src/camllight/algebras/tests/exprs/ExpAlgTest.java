package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ExpAlgTest {
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