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
        CamlLight.eval("[|2|];;");
        assertEquals("Vector<[2, []]>", out.toString());
        out.reset();

        CamlLight.eval("[| 3 |];;");
        assertEquals("Vector<[3, []]>", out.toString());
        out.reset();

        CamlLight.eval("[| 4 ;|];;");
        assertEquals("Vector<[4, []]>", out.toString());
    }

    @Test
    public void testArrayMulti() throws Exception {
        CamlLight.eval("[|1;2;3|];;");
        assertEquals("Vector<[1, [2, [3, []]]]>", out.toString());
        out.reset();

        CamlLight.eval("[| 4 ; 5 ; 6|];;");
        assertEquals("Vector<[4, [5, [6, []]]]>", out.toString());
        out.reset();

        CamlLight.eval("[| 7 ; 8 ; 9 ;|];;");
        assertEquals("Vector<[7, [8, [9, []]]]>", out.toString());
    }

    @Test
    public void testArraySelect() throws Exception {
        CamlLight.eval("[| 1 ; 2 ; 3|].(0);;");
        assertEquals("1", out.toString());
        out.reset();

        CamlLight.eval("[| 1 ; 2 ; 3|].(1);;");
        assertEquals("2", out.toString());
        out.reset();

        CamlLight.eval("[| 1 ; 2 ; 3|].(2);;");
        assertEquals("3", out.toString());
    }

    @Test
    public void testArrayAssign() throws Exception {
        CamlLight.eval("[| 1 ; 2 ; 3 |].(0) <- 10;;");
        assertEquals("Vector<[10, [2, [3, []]]]>", out.toString());
        out.reset();

        CamlLight.eval("[| 1 ; 2 ; 3 |].(1) <- 10;;");
        assertEquals("Vector<[1, [10, [3, []]]]>", out.toString());
        out.reset();

        CamlLight.eval("[| 1 ; 2 ; 3 |].(2) <- 10;;");
        assertEquals("Vector<[1, [2, [10, []]]]>", out.toString());
    }
}