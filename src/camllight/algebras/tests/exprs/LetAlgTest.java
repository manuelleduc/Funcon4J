package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class LetAlgTest {
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
    public void testLetExp() throws Exception {
        CamlLight.eval("let x = 3;; x;;");
        assertEquals("3", out.toString());
        out.reset();

        CamlLight.eval("let add1 = fun x -> x + 1;; add1 10;;");
        assertEquals("11", out.toString());
    }

    @Test
    public void testLetInExp() throws Exception {
        CamlLight.eval("let x = 3 in x;;");
        assertEquals("3", out.toString());
        out.reset();

        CamlLight.eval("let add1 = fun x -> x + 1 in add1 10;;");
        assertEquals("11", out.toString());
    }
}