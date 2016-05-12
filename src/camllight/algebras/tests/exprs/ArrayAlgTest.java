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
    public void testArray() throws Exception {
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
}