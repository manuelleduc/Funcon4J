package funcons.interpreter.tests;

import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.AllFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import funcons.values.Variable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StoreFactoryTest implements AllFactory {

    @Test
    public void testAlloc() throws Exception {
        Store store = new Store();
        Variable v = (Variable)alloc(lit(0)).eval(new Environment(), new Forwards(), store, new Null());
        assertEquals(new Integer(0), ((Int)store.val(v)).intValue());
    }

    @Test
    public void testAssign() throws Exception {
        Store store = new Store();
        Variable v = (Variable)alloc(lit(0)).eval(new Environment(), new Forwards(), store, new Null());
        assign((e,f,s,g) -> v, lit(1)).eval(new Environment(), new Forwards(), store, new Null());
        Int i = (Int)store.val(v);
        assertEquals(new Integer(1), i.intValue());
    }

    @Test
    public void testAssignedValue() throws Exception {
        Store store = new Store();
        Variable v = (Variable)alloc(lit(0)).eval(new Environment(), new Forwards(), store, new Null());
        assign((e,f,s,g) -> v, lit(1)).eval(new Environment(), new Forwards(), store, new Null());
        Int i = (Int)assignedValue((e,f,s,g) -> v).eval(new Environment(), new Forwards(), store, new Null());
        assertEquals(new Integer(1), i.intValue());
    }

    @Test
    public void testAssignedValueIfVar() throws Exception {
        Int i = (Int)assignedValueIfVar(alloc(lit(0))).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());

        i = (Int)assignedValueIfVar(lit(1)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(1), i.intValue());
    }
}