package camllight.algebras.tests.patts;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PattAlgTest extends TestStub {

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