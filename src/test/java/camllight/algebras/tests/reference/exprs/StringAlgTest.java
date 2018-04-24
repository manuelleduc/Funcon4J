package camllight.algebras.tests.reference.exprs;

import camllight.algebras.tests.reference.TestStub;
import org.junit.Test;

public class StringAlgTest extends TestStub {

    @Test
    public void testStringAppendExp() throws Exception {
        test("\"foo\" ^ \"bar\";;", "\"foobar\"");
    }
}