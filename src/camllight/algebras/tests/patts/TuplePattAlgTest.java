package camllight.algebras.tests.patts;

import camllight.CamlLight;
import funcons.values.signals.FailureTrue;
import funcons.values.signals.MatchFailureException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TuplePattAlgTest {
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
    public void testPattTuple() throws Exception {
        CamlLight.eval("match (1) with (1) -> true;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match (1,2,3,4) with (1,2,3,4) -> true;;");
        assertEquals("true", out.toString());

        try {
            CamlLight.eval("match (1,2,3,4) with (1,2,5,4) -> true;;");
        } catch (MatchFailureException ignore) {
            return;
        }
        assertTrue(false);
    }
}