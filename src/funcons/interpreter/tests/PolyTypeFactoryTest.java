package funcons.interpreter.tests;

import funcons.interpreter.AllFactory;
import funcons.values.Int;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PolyTypeFactoryTest implements AllFactory {

    @Test
    public void testInstantiatePoly() throws Exception {
        Int i = (Int)instantiatePoly(lit(0)).eval();
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testInstantiateIfPoly() throws Exception {
        Int i = (Int)instantiateIfPoly(lit(0)).eval();
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testGeneralise() throws Exception {
        Int i = (Int)generalise(lit(0)).eval();
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testGeneraliseIfPoly() throws Exception {
        Int i = (Int)generaliseIfPoly(lit(0)).eval();
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testGeneraliseDecl() throws Exception {
        Int i = (Int)generaliseDecl(lit(0)).eval();
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testGeneraliseMap() throws Exception {
        Int i = (Int)generaliseMap(lit(0)).eval();
        assertEquals(new Integer(0), i.intValue());
    }
}