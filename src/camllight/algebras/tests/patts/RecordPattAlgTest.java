package camllight.algebras.tests.patts;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordPattAlgTest extends TestStub {

    @Test
    public void testRecordPatt() throws Exception {
        CamlLight.eval("let f = function {a = 1} -> true;; f {a = 1};;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("let f = function {a = 1} -> false;; f {a = 1, b = 2};;");
        assertEquals("false", out.toString());
        out.reset();

        CamlLight.eval("let f = function {b = x} -> x;; f {a = 1, b = 2};;");
        assertEquals("2", out.toString());
        out.reset();

        CamlLight.eval("let f = function {a = 1, b = 2} -> true;; f {a = 1, b = 2};;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("let f = function {a = 1, b = 3} -> true | _ -> false;; f {a = 1, b = 2};;");
        assertEquals("false", out.toString());
    }
}