package camllight.algebras.tests.typeexprs;

import camllight.CamlLight;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TypeExpAlgTest {
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
    public void testBracketedType() throws Exception {
        CamlLight.eval("match (3 : int) with (3 : (int)) -> true | _ -> false;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match (3 : (int)) with 3 -> true | _ -> false;;");
        assertEquals("true", out.toString());
    }

    @Test
    public void testTypeId() throws Exception {
        CamlLight.eval("match (3 : int) with (3 : int) -> true | _ -> false;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match (3 : int) with 3 -> true | _ -> false;;");
        assertEquals("true", out.toString());
    }

    @Test
    public void testFunctionType() throws Exception {
        CamlLight.eval("match (3 : int -> float) with (3 : int -> float) -> true | _ -> false;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match (3 : int -> float) with 3 -> true | _ -> false;;");
        assertEquals("true", out.toString());
    }

    @Test
    public void testVarType() throws Exception {
        CamlLight.eval("let x = 1 in match (3 : 'x) with (3 : 'x) -> true | _ -> false;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("let x = 1 in match (3 : 'x) with 3 -> true | _ -> false;;");
        assertEquals("true", out.toString());
    }

    @Test
    public void testTupleType() throws Exception {
        CamlLight.eval("match (3 : int * float) with (3 : int * float) -> true | _ -> false;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match (3 : int * float) with 3 -> true | _ -> false;;");
        assertEquals("true", out.toString());
    }
}