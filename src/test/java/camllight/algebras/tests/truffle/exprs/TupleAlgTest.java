package camllight.algebras.tests.truffle.exprs;

import camllight.algebras.tests.truffle.TestStub;
import org.junit.Test;

public class TupleAlgTest extends TestStub {

    @Test
    public void testExprTupleMulti() throws Exception {
        test("(0,1);;", "[0,1]");
        test("(0,1,2,3,4);;", "[0,1,2,3,4]");
    }
}