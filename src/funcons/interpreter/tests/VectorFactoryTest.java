package funcons.interpreter.tests;

import funcons.algebras.VectorAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.VectorFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import funcons.values.Vector;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorFactoryTest {

    private VectorAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new VectorFactory() {};
    }

    @Test
    public void testVector() throws Exception {
        Vector v = (Vector)alg.vector().eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Vector(), v);
    }

    @Test
    public void testVector1() throws Exception {
        Vector v = (Vector)alg.vector(alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Vector(new Int(0)), v);
    }

    @Test
    public void testVectorSelect() throws Exception {
        Int i = (Int)alg.vectorSelect(alg.vector(alg.lit(1)), alg.lit(0))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(1), i.intValue());
    }
}