package camllight.algebras.tests.patts;

import camllight.CamlLight;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class PattAlgTest {private ByteArrayOutputStream out;
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
    public void testBracketedPatt() throws Exception {
        CamlLight.eval("let isZero = function | (0) -> true | (_) -> false in isZero 1;;");
        assertEquals("false", out.toString());
    }

    @Test
    public void testPattId() throws Exception {
        CamlLight.eval("let add1 = function x -> x + 1 in add1 2;;");
        assertEquals("3", out.toString());
    }

    @Test
    public void testPattType() throws Exception {
        CamlLight.eval("let isZero = function | (0 : int) -> true | _ -> false in isZero 1;;");
        assertEquals("false", out.toString());
    }

    @Test
    public void testPattAs() throws Exception {
        CamlLight.eval("let double = function x as y -> x + y in double 2;;");
        assertEquals("4", out.toString());
        out.reset();

        CamlLight.eval("let id = function | 0 as x -> x | _ as x -> x in id 1;;");
        assertEquals("1", out.toString());
    }

    @Test
    public void testPattWildcard() throws Exception {
        CamlLight.eval("match 1 with _ -> true;;");
        assertEquals("true", out.toString());
    }

    @Test
    public void testPattConstant() throws Exception {
        CamlLight.eval("match 1 with 1 -> true;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match 1 with 0 -> true | _ -> false;;");
        assertEquals("false", out.toString());
    }

    @Test
    public void testPattConstr() throws Exception {
        // TODO
    }

    @Test
    public void testPattConstrPatt() throws Exception {
        // TODO
    }

    @Test
    public void testOptionalPatt() throws Exception {
        CamlLight.eval("match 1 with 0 | 1 -> true;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match 0 with 0 | 1 -> true;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match 4 with 0 | 1 -> true | 3 | 4 -> false;;");
        assertEquals("false", out.toString());
    }
}