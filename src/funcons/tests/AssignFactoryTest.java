package funcons.tests;

import funcons.Store;
import funcons.algebras.AssignAlg;
import funcons.interpreter.AssignFactory;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.Int;
import funcons.types.Null;
import funcons.types.Variable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssignFactoryTest {

    private AssignAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new AssignFactory() {};
    }

    @Test
    public void testAssign() throws Exception {
        Store store = new Store();
        alg.assign(alg.var("foo"), alg.lit(0)).eval(new Environment(), store, new Null());
        Int i = (Int)store.val(new Variable("foo"));
        assertEquals(i.intValue(), new Integer(0));
    }

    @Test
    public void testAssignedValue() throws Exception {
        Store store = new Store();
        alg.assign(alg.var("foo"), alg.lit(0)).eval(new Environment(), store, new Null());
        Int i = (Int)alg.assignedValue(alg.var("foo")).eval(new Environment(), store, new Null());
        assertEquals(i.intValue(), new Integer(0));
    }
}