package camllight.algebras.tests.exprs;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntCalcAlgTest extends TestStub {

    @Test
    public void testIntUnarySub() throws Exception {
        CamlLight.eval("-1;;");
        assertEquals("-1", out.toString());
        out.reset();

        CamlLight.eval("--1;;");
        assertEquals("1", out.toString());
    }

    @Test
    public void testIntAdd() throws Exception {
        CamlLight.eval("1 + 2;;");
        assertEquals("3", out.toString());
    }

    @Test
    public void testIntSub() throws Exception {
        CamlLight.eval("3 - 2;;");
        assertEquals("1", out.toString());
    }

    @Test
    public void testIntMultiply() throws Exception {
        CamlLight.eval("2 * 3;;");
        assertEquals("6", out.toString());
    }

    @Test
    public void testIntDivide() throws Exception {
        CamlLight.eval("6 / 2;;");
        assertEquals("3", out.toString());
        out.reset();

        CamlLight.eval("1 / 2;;");
        assertEquals("0", out.toString());
    }

    @Test
    public void testIntMod() throws Exception {
        CamlLight.eval("3 mod 2;;");
        assertEquals("1", out.toString());
    }

    @Test
    public void testIntGreater() throws Exception {
        CamlLight.eval("3 > 2;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("3 > 3;;");
        assertEquals("false", out.toString());
        out.reset();

        CamlLight.eval("3 > 4;;");
        assertEquals("false", out.toString());
    }

    @Test
    public void testIntSmaller() throws Exception {
        CamlLight.eval("3 < 2;;");
        assertEquals("false", out.toString());
        out.reset();

        CamlLight.eval("3 < 3;;");
        assertEquals("false", out.toString());
        out.reset();

        CamlLight.eval("3 < 4;;");
        assertEquals("true", out.toString());
    }

    @Test
    public void testIntGreaterEqual() throws Exception {
        CamlLight.eval("3 >= 2;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("3 >= 3;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("3 >= 4;;");
        assertEquals("false", out.toString());
    }

    @Test
    public void testIntSmallerEqual() throws Exception {
        CamlLight.eval("3 <= 2;;");
        assertEquals("false", out.toString());
        out.reset();

        CamlLight.eval("3 <= 3;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("3 <= 4;;");
        assertEquals("true", out.toString());
    }

    @Test
    public void testIntEqual() throws Exception {
        CamlLight.eval("3 = 2;;");
        assertEquals("false", out.toString());
        out.reset();

        CamlLight.eval("3 = 3;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("3 = 4;;");
        assertEquals("false", out.toString());
    }
}