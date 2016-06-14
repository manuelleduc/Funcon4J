package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayAlgTest extends TestStub {

    @Test
    public void testEmptyArray() throws Exception {
        CamlLight.eval("[||];;");
        assertEquals("Vector<[]>", out.toString());
        out.reset();

        CamlLight.eval("[|        |];;");
        assertEquals("Vector<[]>", out.toString());
    }

    @Test
    public void testArraySingle() throws Exception {
        CamlLight.eval("[|2|].(0);;");
        assertEquals("2", out.toString());
    }

    @Test
    public void testArrayMulti() throws Exception {
        CamlLight.eval("[|1,2,3|].(1);;");
        assertEquals("2", out.toString());
    }

    @Test
    public void testArraySelect() throws Exception {
        CamlLight.eval("[| 1 , 2 , 3|].(0);;");
        assertEquals("1", out.toString());
        out.reset();

        CamlLight.eval("[| 1 , 2 , 3|].(1);;");
        assertEquals("2", out.toString());
        out.reset();

        CamlLight.eval("[| 1 , 2 , 3|].(2);;");
        assertEquals("3", out.toString());
    }

    @Test
    public void testArrayAssign() throws Exception {
        CamlLight.eval("let v = [| 1 , 2 , 3 |];; v.(0) <- 4; v.(0);; v.(1);; v.(2);;");
        assertEquals("423", out.toString());
    }
}