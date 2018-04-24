package camllight.algebras.tests.truffle.exprs;

import camllight.algebras.tests.truffle.TestStub;
import org.junit.Test;

public class StringAlgTest extends TestStub {

    @Test
    public void testStringAppendExp() throws Exception {
        test("\"foo\" ^ \"bar\";;", "\"foobar\"");
    }
}