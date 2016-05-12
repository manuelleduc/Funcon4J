package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VectorAlgTest extends TestStub {

    @Test
    public void testEmptyVector() throws Exception {
        CamlLight.eval("[||];;");
        assertEquals("Vector<[]>", out.toString());
        out.reset();

        CamlLight.eval("[|        |];;");
        assertEquals("Vector<[]>", out.toString());
    }

    @Test
    public void testVector() throws Exception {
        CamlLight.eval("[|3|]");
        assertEquals("Vector<[3, []]>", out.toString());
        out.reset();

        CamlLight.eval("[| 3 |]");
        assertEquals("Vector<[3, []]>", out.toString());
    }

    @Test
    public void testVectorMulti() throws Exception {
        CamlLight.eval("[|1;2;3|]");
        assertEquals("Vector<[1, [2, [3, []]]]>", out.toString());
        out.reset();

        CamlLight.eval("[| 1 ; 2 ; 3|]");
        assertEquals("Vector<[1, [2, [3, []]]]>", out.toString());
    }
}