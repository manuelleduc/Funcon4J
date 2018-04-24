package camllight.algebras.tests.reference.exprs;

import camllight.algebras.tests.reference.TestStub;
import org.junit.Test;

public class FloatCalcAlgTest extends TestStub {

    @Test
    public void testFloatNegateExp() throws Exception {
        test("-.1.;;", "-1.0");
    }

    @Test
    public void testFloatAddExp() throws Exception {
        test("3.5 +. 1.2;;", "4.7000000476837158");
    }

    @Test
    public void testFloatSubtractExp() throws Exception {
        test("3.5 -. 1.2;;", "2.2999999523162842");
    }

    @Test
    public void testFloatMultiplyExp() throws Exception {
        test("3.0 *. 1.5;;", "4.50");
    }

    @Test
    public void testFloatDivideExp() throws Exception {
        test("3.0 /. 1.5;;", "2.");
    }

    @Test
    public void testFloatPowerExp() throws Exception {
        test("4.0 ** 2.0;;", "16.00000");
    }
}