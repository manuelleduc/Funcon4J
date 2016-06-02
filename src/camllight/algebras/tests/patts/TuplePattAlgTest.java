package camllight.algebras.tests.patts;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import funcons.values.cl.CLMatchFailureException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TuplePattAlgTest extends TestStub {

    @Test
    public void testPattTuple() throws Exception {
        CamlLight.eval("match (1) with (1) -> true;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("match (1,2,3,4) with (1,2,3,4) -> true;;");
        assertEquals("true", out.toString());

        try {
            CamlLight.eval("match (1,2,3,4) with (1,2,5,4) -> true;;");
        } catch (CLMatchFailureException ignore) {
            return;
        }
        assertTrue(false);
    }
}