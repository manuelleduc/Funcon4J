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

        CamlLight.eval("{ mutable a = 3 }.a;;");
        assertEquals("3", out.toString());
        out.reset();

        CamlLight.eval("{ a = 3 , b = \"foo\" , c = false };;");
        assertEquals("{a=3; b=foo; c=false}", out.toString());
    }

    @Test
    public void testRecordSelectExp() throws Exception {
        CamlLight.eval("{ a = 3 }.a;;");
        assertEquals("3", out.toString());
        out.reset();

        CamlLight.eval("let bar = {a=3,b=4,c=false,d=\"foo\"} in bar.d;;");
        assertEquals("foo", out.toString());
    }

    @Test
    public void testRecordAssignExp() throws Exception {
        CamlLight.eval("let x = {mutable a = 4};; (x.a <- 5); x.a;;");
        assertEquals("5", out.toString());
        out.reset();

        CamlLight.eval("let x = {b = 3, mutable a = 1};; (x.a <- 2); x.b;; x.a;;");
        assertEquals("32", out.toString());
    }
}