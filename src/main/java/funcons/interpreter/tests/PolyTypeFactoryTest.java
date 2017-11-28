package funcons.interpreter.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import funcons.interpreter.AllFactory;

public class PolyTypeFactoryTest implements AllFactory {

    @Test
    public void testInstantiatePoly() throws Exception {
        assertEquals(lit(0).eval(), instantiatePoly(lit(0)).eval());
    }

    @Test
    public void testInstantiateIfPoly() throws Exception {
        assertEquals(lit(0).eval(), instantiateIfPoly(lit(0)).eval());
    }

    @Test
    public void testGeneralise() throws Exception {
        assertEquals(lit(0).eval(), generalise(lit(0)).eval());
    }

    @Test
    public void testGeneraliseIfPoly() throws Exception {
        assertEquals(lit(0).eval(), generaliseIfPoly(lit(0)).eval());
    }

    @Test
    public void testGeneraliseDecl() throws Exception {
        assertEquals(lit(0).eval(), generaliseDecl(lit(0)).eval());
    }

    @Test
    public void testGeneraliseMap() throws Exception {
        assertEquals(lit(0).eval(), generaliseMap(lit(0)).eval());
    }
}