package camllight.algebras.tests.reference.decls;

import camllight.algebras.tests.reference.TestStub;
import org.junit.Test;

public class RecBindAlgTest extends TestStub {
    @Test
    public void testDeclRec() throws Exception {
        test("let rec power a b = if b = 0 then 1 else a * (power a (b - 1));; power 3 4;;", "81");
    }
}
