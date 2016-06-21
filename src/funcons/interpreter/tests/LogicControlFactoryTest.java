package funcons.interpreter.tests;

import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.AllFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogicControlFactoryTest implements AllFactory {

    @Test
    public void testEffect() throws Exception {
        Null n = (Null)effect(intAdd(lit(2), lit(3)))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Null(), n);
    }

    @Test
    public void testSeq() throws Exception {
        funcons.values.Int i = (funcons.values.Int)seq(lit(3), lit(2))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(2));
    }

    @Test
    public void testIfTrue() throws Exception {
        Int i = (Int)ifTrue(bool(false), lit(2), lit(3))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testWhileTrue() throws Exception {
        Null n = (Null)whileTrue(bool(false), intAdd(lit(2), lit(3)))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Null(), n);
    }
}