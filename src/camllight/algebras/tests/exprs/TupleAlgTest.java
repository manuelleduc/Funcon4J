package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TupleAlgTest extends TestStub {

    @Test
    public void testExprTupleMulti() throws Exception {
        CamlLight.eval("(0,1);;");
        assertEquals("(0, (1, ()))", out.toString());
        out.reset();

        CamlLight.eval("(0,1,2,3,4);;");
        assertEquals("(0, (1, (2, (3, (4, ())))))", out.toString());
    }
}