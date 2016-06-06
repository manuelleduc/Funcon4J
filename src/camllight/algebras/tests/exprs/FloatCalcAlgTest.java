package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.*;

public class FloatCalcAlgTest extends TestStub {

    @Test
    public void testFloatNegateExp() throws Exception {
        CamlLight.eval("-.1.;;");
        assertEquals("-1.0", out.toString());
    }

    @Test
    public void testFloatAddExp() throws Exception {
        CamlLight.eval("3.5 +. 1.2;;");
        assertEquals("4.700000047683716", out.toString());
    }

    @Test
    public void testFloatSubtractExp() throws Exception {
        CamlLight.eval("3.5 -. 1.2;;");
        assertEquals("2.299999952316284", out.toString());
    }

    @Test
    public void testFloatMultiplyExp() throws Exception {
        CamlLight.eval("3.0 *. 1.5;;");
        assertEquals("4.5", out.toString());
    }

    @Test
    public void testFloatDivideExp() throws Exception {
        CamlLight.eval("3.0 /. 1.5;;");
        assertEquals("2.0", out.toString());
    }

    @Test
    public void testFloatPowerExp() throws Exception {
        CamlLight.eval("4.0 ** 2.0;;");
        assertEquals("16.0", out.toString());
    }
}