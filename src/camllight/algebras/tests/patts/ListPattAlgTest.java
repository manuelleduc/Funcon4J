package camllight.algebras.tests.patts;

import camllight.CamlLight;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Calendar;

import static org.junit.Assert.*;

public class ListPattAlgTest {
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
        CamlLight.eval("match [1 ; 2]  with [h :: t] -> h;;");
        assertEquals("1", out.toString());
        out.reset();

        CamlLight.eval("match [1 ; 2]  with [h :: t] -> t;;");
        assertEquals("[2, []]", out.toString());
        out.reset();

        CamlLight.eval("match [1 ; 2]  with [h :: h2 :: _] -> h + h2;;");
        assertEquals("3", out.toString());
        out.reset();

        CamlLight.eval("match [1 ; 2] with [h :: 3] -> true | _ -> false;;");
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

        CamlLight.eval("match [1 ; 2] with [1 ; 2] -> true | _ -> false;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match [1 ; 2] with [2 ; 1] -> true | [1 ; 3] -> true | _ -> false;;");
        assertEquals("false", out.toString());
    }
}