package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TupleAlgTest {
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
    public void testExprTupleMulti() throws Exception {
        CamlLight.eval("(0,1);;");
        assertEquals("(0, (1, ()))", out.toString());
        out.reset();

        CamlLight.eval("(0,1,2);;");
        assertEquals("(0, (1, (2, ())))", out.toString());
    }
}