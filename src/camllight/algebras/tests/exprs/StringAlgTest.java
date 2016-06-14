package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringAlgTest extends TestStub {

    @Test
    public void testStringAppendExp() throws Exception {
        test("\"foo\" ^ \"bar\";;", "foobar");
    }
}