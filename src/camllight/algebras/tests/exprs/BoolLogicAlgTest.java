package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BoolLogicAlgTest {
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