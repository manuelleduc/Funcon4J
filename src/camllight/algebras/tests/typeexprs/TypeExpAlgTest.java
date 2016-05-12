package camllight.algebras.tests.typeexprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TypeExpAlgTest extends TestStub {

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