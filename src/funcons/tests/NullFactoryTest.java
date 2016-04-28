package funcons.tests;

import funcons.Store;
import funcons.algebras.NullAlg;
import funcons.interpreter.NullFactory;
import funcons.sorts.IEval;
import funcons.values.Environment;
import funcons.values.Null;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NullFactoryTest {

    private NullAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new NullFactory() {};
    }

    @Test
    public void testNull_() throws Exception {
        Null n = (Null)alg.null_().eval(new Environment(), new Store(), new Null());
        assertEquals(n, new Null());
    }
}