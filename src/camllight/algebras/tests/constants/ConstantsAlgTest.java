package camllight.algebras.tests.constants;

import camllight.CamlLight;
import funcons.values.Int;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class ConstantsAlgTest {
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