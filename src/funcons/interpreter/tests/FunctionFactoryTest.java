package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.AllFactory;
import funcons.values.Abs;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunctionFactoryTest implements AllFactory {

    @Test
    public void testAbs() throws Exception {
        {
            Store store = new Store();
            @SuppressWarnings("unchecked")
            Abs<IEval> abs = (Abs<IEval>) abs(lit(1)).eval(new Environment(), new Forwards(), store, new Null());
            Int result = (Int) abs.body().eval(new Environment(), new Forwards(), store, new Null());
            assertEquals(result.intValue(), new Integer(1));
        }
        {
            Store store = new Store();
            @SuppressWarnings("unchecked")
            Abs<IEval> abs = (Abs<IEval>) abs(bind(id("foo")), boundValue(id("foo"))).eval(new Environment(), new Forwards(), store, new Null());
            Int result = (Int) abs.body().eval(new Environment(), new Forwards(), store, new Int(10));
            assertEquals(result.intValue(), new Integer(10));
        }
    }

    @Test
    public void testApply() throws Exception {
        Int i = (Int)apply(abs(intAdd(lit(1), given())), lit(2)).eval();
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testCompose() throws Exception {
        IEval incr = abs(intAdd(given(), lit(1)));
        IEval double_ = abs(intMultiply(given(), lit(2)));
        Int i = (Int)apply(compose(double_, incr), lit(3)).eval();
        assertEquals(new Integer(8), i.intValue());
    }
}