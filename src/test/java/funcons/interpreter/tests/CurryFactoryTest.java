package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CurryFactoryTest implements AllFactory {

    @Test
    public void testPartialApp() throws Exception {
        IEval incr = partialApp(abs(intAdd(project(lit(0), given()), project(lit(1), given()))), lit(1));
        assertEquals(lit(3).eval(), apply(incr, lit(2)).eval());
    }

    @Test
    public void testPartialAppN() throws Exception {
        IEval uncurriedAdd = abs(intAdd(project(lit(0), given()), project(lit(1), given())));
        IEval add2 = partialAppN(uncurriedAdd, lit(2));
        IEval add2to3 = partialAppN(add2, lit(3));
        assertEquals(lit(5).eval(), apply(add2to3, tuple()).eval());
    }

    @Test
    public void testCurry() throws Exception {
        IEval uncurriedAdd = abs(intAdd(project(lit(0), given()), project(lit(1), given())));
        IEval addTwo = apply(curry(uncurriedAdd), lit(2));
        assertEquals(lit(5).eval(), apply(addTwo, lit(3)).eval());
    }

    @Test
    public void testCurryN() throws Exception {
        IEval uncurriedAdd = abs(intAdd(project(lit(0), given()), project(lit(1), given())));
        IEval curriedAdd = curryN(lit(2), uncurriedAdd);
        IEval add2 = apply(curriedAdd, lit(2));
        IEval add2to3 = apply(add2, lit(3));
        assertEquals(lit(5).eval(), add2to3.eval());
    }

    @Test
    public void testUncurry() throws Exception {
        IEval curriedAdd = curry(abs(intAdd(project(lit(0), given()), project(lit(1), given()))));
        IEval uncurriedAdd = uncurry(curriedAdd);
        assertEquals(lit(5).eval(), apply(uncurriedAdd, tuple(lit(2), lit(3))).eval());
    }
}