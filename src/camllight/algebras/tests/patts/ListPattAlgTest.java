package camllight.algebras.tests.patts;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListPattAlgTest extends TestStub {

    @Test
    public void testEmptyListPatt() throws Exception {
        CamlLight.eval("match [] with [] -> true | _ -> false;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match [1] with [] -> true | _ -> false;;");
        assertEquals("false", out.toString());
        out.reset();

        CamlLight.eval("match 3 with [] -> true | _ -> false;;");
        assertEquals("false", out.toString());
    }

    @Test
    public void testHeadTailListPatt() throws Exception {
        CamlLight.eval("match [1 , 2]  with [h :: t] -> h;;");
        assertEquals("1", out.toString());
        out.reset();

        CamlLight.eval("match [1 , 2]  with [h :: t] -> t;;");
        assertEquals("[2, []]", out.toString());
        out.reset();

        CamlLight.eval("match [1 , 2]  with [h :: h2 :: _] -> h + h2;;");
        assertEquals("3", out.toString());
        out.reset();

        CamlLight.eval("match [1 , 2] with [h :: 3] -> true | _ -> false;;");
        assertEquals("false", out.toString());
    }

    @Test
    public void testPattList() throws Exception {
        CamlLight.eval("match [1] with [1] -> true;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match [1] with [0] -> true | _ -> false;;");
        assertEquals("false", out.toString());
        out.reset();

        CamlLight.eval("match [1 , 2] with [1 , 2] -> true | _ -> false;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match [1 , 2] with [2 , 1] -> true | [1 , 3] -> true | _ -> false;;");
        assertEquals("false", out.toString());
        out.reset();

        CamlLight.eval("match [1,2,3,4] with [1, 2, 3, 4] -> true | _ -> false;;");
        assertEquals("true", out.toString());
    }
}