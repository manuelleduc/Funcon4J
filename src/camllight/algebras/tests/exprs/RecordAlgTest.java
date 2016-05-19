package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordAlgTest extends TestStub {

    @Test
    public void testRecordExp() throws Exception {
        CamlLight.eval("{ a = 3 };;");
        assertEquals("{a=3}", out.toString());
        out.reset();

        CamlLight.eval("{ a = 3 , b = \"foo\" , c = false };;");
        assertEquals("{a=3; b=foo; c=false}", out.toString());
    }
}