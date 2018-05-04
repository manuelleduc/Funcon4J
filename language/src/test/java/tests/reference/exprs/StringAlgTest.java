package tests.reference.exprs;

import tests.reference.TestStub;
import org.junit.Test;

public class StringAlgTest extends TestStub {

    @Test
    public void testStringAppendExp() throws Exception {
        test("\"foo\" ^ \"bar\";;", "\"foobar\"");
    }
}