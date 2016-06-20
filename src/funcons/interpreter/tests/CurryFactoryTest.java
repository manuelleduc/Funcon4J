package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.functions.CurryFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CurryFactoryTest {
    private interface Alg extends CurryFactory {}
    private Alg alg;

    @Before
    public void setUp() throws Exception {
        alg = new Alg() {};
    }

    @Test
    public void testPartialApp() throws Exception {
        IEval incr = alg.partialApp(alg.abs(alg.intAdd(alg.project(alg.lit(0), alg.given()), alg.project(alg.lit(1), alg.given()))), alg.lit(1));
        Int i = (Int)alg.apply(incr, alg.lit(2)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(3), i.intValue());
    }

    @Test
    public void testPartialAppN() throws Exception {
        IEval uncurriedAdd = alg.abs(alg.intAdd(alg.project(alg.lit(0), alg.given()), alg.project(alg.lit(1), alg.given())));
        IEval add2 = alg.partialAppN(uncurriedAdd, alg.lit(2));
        IEval add2to3 = alg.partialAppN(add2, alg.lit(3));
        Int i = (Int)alg.apply(add2to3, alg.tuple()).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), i.intValue());
    }

    @Test
    public void testCurry() throws Exception {
        IEval uncurriedAdd = alg.abs(alg.intAdd(alg.project(alg.lit(0), alg.given()), alg.project(alg.lit(1), alg.given())));
        IEval addTwo = alg.apply(alg.curry(uncurriedAdd), alg.lit(2));
        Int i = (Int) alg.apply(addTwo, alg.lit(3)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), i.intValue());
    }

    @Test
    public void testCurryN() throws Exception {
        IEval uncurriedAdd = alg.abs(alg.intAdd(alg.project(alg.lit(0), alg.given()), alg.project(alg.lit(1), alg.given())));
        IEval curriedAdd = alg.curryN(alg.lit(2), uncurriedAdd);
        IEval add2 = alg.apply(curriedAdd, alg.lit(2));
        IEval add2to3 = alg.apply(add2, alg.lit(3));
        Int i = (Int)add2to3.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), i.intValue());
    }

    @Test
    public void testUncurry() throws Exception {
        IEval curriedAdd = alg.curry(alg.abs(alg.intAdd(alg.project(alg.lit(0), alg.given()), alg.project(alg.lit(1), alg.given()))));
        IEval uncurriedAdd = alg.uncurry(curriedAdd);
        Int i = (Int)alg.apply(uncurriedAdd, alg.tuple(alg.lit(2), alg.lit(3))).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(5), i.intValue());
    }
}