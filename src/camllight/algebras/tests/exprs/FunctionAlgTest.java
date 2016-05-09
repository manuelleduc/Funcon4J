package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class FunctionAlgTest {
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
    public void testFunctionId() throws Exception {
        CamlLight.eval("let id x = x in id 1;;");
        assertEquals("1", out.toString());
    }

    @Test
    public void testFuncAplication() throws Exception {
        CamlLight.eval("let id x = x in id 1;;");
        assertEquals("1", out.toString());
    }

    @Test
    public void testBracketedFunction() throws Exception {
        CamlLight.eval("let id = (function x -> x) in id 1;;");
        assertEquals("1", out.toString());
        out.reset();

        CamlLight.eval("let id = function x -> x in (id) 2;;");
        assertEquals("2", out.toString());
    }

    @Test
    public void testBeginEndFunction() throws Exception {
        CamlLight.eval("let id = begin function x -> x end in id 1;;");
        assertEquals("1", out.toString());
        out.reset();

        CamlLight.eval("let id = function x -> x in begin id end 2;;");
        assertEquals("2", out.toString());
    }

    @Test
    public void testFunction() throws Exception {
        CamlLight.eval("function x -> x;;");
        assertEquals("ABS", out.toString().substring(0, 3));
        out.reset();

        CamlLight.eval("function 0 -> true | _ -> false;;");
        assertEquals("ABS", out.toString().substring(0, 3));
    }

    @Test
    public void testFunc() throws Exception {
        CamlLight.eval("fun x -> x;;");
        assertEquals("ABS", out.toString().substring(0, 3));
    }

    @Test
    public void testCurriedFunc() throws Exception {
        CamlLight.eval("fun a b c -> a + b + c;;");
        assertEquals("ABS", out.toString().substring(0, 3));
    }
}