package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.AllFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CurryFactoryTest implements AllFactory {

    @Test
    public void testPartialApp() throws Exception {
        IEval incr = partialApp(abs(intAdd(project(lit(0), given()), project(lit(1), given()))), lit(1));
        Int i = (Int)apply(incr, lit(2)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(3), i.intValue());
    }

    @Test
    public void testPartialAppN() throws Exception {
        IEval uncurriedAdd = abs(intAdd(project(lit(0), given()), project(lit(1), given())));
        IEval add2 = partialAppN(uncurriedAdd, lit(2));
        IEval add2to3 = partialAppN(add2, lit(3));
        Int i = (Int)apply(add2to3, tuple()).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), i.intValue());
    }

    @Test
    public void testCurry() throws Exception {
        IEval uncurriedAdd = abs(intAdd(project(lit(0), given()), project(lit(1), given())));
        IEval addTwo = apply(curry(uncurriedAdd), lit(2));
        Int i = (Int)apply(addTwo, lit(3)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), i.intValue());
    }

    @Test
    public void testCurryN() throws Exception {
        IEval uncurriedAdd = abs(intAdd(project(lit(0), given()), project(lit(1), given())));
        IEval curriedAdd = curryN(lit(2), uncurriedAdd);
        IEval add2 = apply(curriedAdd, lit(2));
        IEval add2to3 = apply(add2, lit(3));
        Int i = (Int)add2to3.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), i.intValue());
    }

    @Test
    public void testUncurry() throws Exception {
        IEval curriedAdd = curry(abs(intAdd(project(lit(0), given()), project(lit(1), given()))));
        IEval uncurriedAdd = uncurry(curriedAdd);
        Int i = (Int)apply(uncurriedAdd, tuple(lit(2), lit(3))).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), i.intValue());
    }
}