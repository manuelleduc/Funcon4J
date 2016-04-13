package funcons.tests;

import funcons.Store;
import funcons.algebras.AssignAlg;
import funcons.interpreter.AssignFactory;
import funcons.sorts.IEval;
import funcons.types.*;
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
    public void testAlloc() throws Exception {
        Store store = new Store();
        Variable v = (Variable)alg.alloc(alg.lit(0)).eval(new Environment(), store, new Null());
        assertEquals(new Integer(0), ((Int)store.val(v)).intValue());
    }

    @Test
    public void testAssign() throws Exception {
        Store store = new Store();
        Variable v = (Variable)alg.alloc(alg.lit(0)).eval(new Environment(), store, new Null());
        alg.assign((e,s,g) -> v, alg.lit(1)).eval(new Environment(), store, new Null());
        Int i = (Int)store.val(v);
        assertEquals(new Integer(1), i.intValue());
    }

    @Test
    public void testAssignedValue() throws Exception {
        Store store = new Store();
        Variable v = (Variable)alg.alloc(alg.lit(0)).eval(new Environment(), store, new Null());
        alg.assign((e,s,g) -> v, alg.lit(1)).eval(new Environment(), store, new Null());
        Int i = (Int)alg.assignedValue((e,s,g) -> v).eval(new Environment(), store, new Null());
        assertEquals(new Integer(1), i.intValue());
    }

    @Test
    public void testAssignedValueIfVar() throws Exception {
        Int i = (Int)alg.assignedValueIfVar(alg.alloc(alg.lit(0))).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());

        i = (Int)alg.assignedValueIfVar(alg.lit(1)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(1), i.intValue());
    }
}