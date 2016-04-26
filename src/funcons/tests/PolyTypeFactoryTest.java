package funcons.tests;

import funcons.Store;
import funcons.algebras.PolyTypeAlg;
import funcons.interpreter.PolyTypeFactory;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.Int;
import funcons.types.Null;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PolyTypeFactoryTest {

    PolyTypeAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new PolyTypeFactory() {};
    }

    @Test
    public void testInstantiatePoly() throws Exception {
        Int i = (Int)alg.instantiatePoly(alg.lit(0)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testInstantiateIfPoly() throws Exception {
        Int i = (Int)alg.instantiateIfPoly(alg.lit(0)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }
}