package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionAlgTest extends TestStub {

    @Test
    public void testTryWithExp() throws Exception {
        CamlLight.eval("try (match 0 with 1 -> true) with 0 -> false;;");
        assertEquals("", out.toString());
    }
}