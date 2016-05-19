package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListAlgTest extends TestStub {

    @Test
    public void testHeadTailListExp() throws Exception {
        CamlLight.eval("1 :: 2 :: [];;");
        assertEquals("[1, [2, []]]", out.toString());
        out.reset();

        CamlLight.eval("1 :: 2 :: 3 :: [];;");
        assertEquals("[1, [2, [3, []]]]", out.toString());
    }

    @Test
    public void testExpList() throws Exception {
        CamlLight.eval("[1 , 2];;");
        assertEquals("[1, [2, []]]", out.toString());
        out.reset();

        CamlLight.eval("[1 , 2 , 3 , 4];;");
        assertEquals("[1, [2, [3, [4, []]]]]", out.toString());
    }

    @Test
    public void testExpListSingle() throws Exception {
        CamlLight.eval("[1];;");
        assertEquals("[1, []]", out.toString());
    }
}