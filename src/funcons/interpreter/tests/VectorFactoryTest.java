package funcons.interpreter.tests;

import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.AllFactory;
import funcons.values.*;
import funcons.values.ids.Id;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VectorFactoryTest implements AllFactory {

    @Test
    public void testVector() throws Exception {
        Vector v = (Vector)vector().eval();
        assertEquals(new Vector(), v);
    }

    @Test
    public void testVector1() throws Exception {
        Store store = new Store();
        Vector v = (Vector)vector(lit(3)).eval(new Environment(), new Forwards(), store, new Null());
        assertEquals(new Int(3), store.val((Variable)v.get(new Int(0))));
    }

    @Test
    public void testVectorSelect() throws Exception {
        Int i = (Int)vectorSelect(vector(lit(1)), lit(0))
                .eval();
        assertEquals(new Integer(1), i.intValue());
    }

    @Test
    public void testVectorAppend() throws Exception {
        Store store = new Store();
        Vector v = (Vector)vectorAppend(vector(lit(2)), vector(lit(3)))
                .eval(new Environment(), new Forwards(), store, new Null());
        assertEquals(new Int(2), store.val((Variable)v.get(new Int(0))));
        assertEquals(new Int(3), store.val((Variable)v.get(new Int(1))));
    }

    @Test
    public void testVectorAssign() throws Exception {
        Store store = new Store();
        Environment env = (Environment)bindValue(id("foo"), vector(lit(2)))
                .eval(new Environment(), new Forwards(), store, new Null());
        vectorAssign(boundValue(id("foo")), lit(0), lit(3))
                .eval(env, new Forwards(), store, new Null());
        assertEquals(new Vector(new Variable(0, store)), env.val(new Id("foo")));
        assertEquals(new Int(3), store.val((Variable)((Vector)env.val(new Id("foo"))).get(new Int(0))));

    }

    @Test
    public void testVectorLength() throws Exception {
        Int i = (Int)vectorLength(vector())
                .eval();
        assertEquals(new Int(0), i);

        i = (Int)vectorLength(vector(lit(5)))
                .eval();
        assertEquals(new Int(1), i);

        i = (Int)vectorLength(
                vectorAppend(vector(lit(6)), vector(lit(7)))
        ).eval();
        assertEquals(new Int(2), i);
    }
}