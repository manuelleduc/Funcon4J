package funcons.tests;

import funcons.Store;
import funcons.algebras.PartialAppAlg;
import funcons.interpreter.PartialAppFactory;
import funcons.sorts.IEval;
import funcons.types.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartialAppFactoryTest {

    private PartialAppAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new PartialAppFactory() {};
    }

    @Test
    public void testTuple() throws Exception {
        Tuple t = (Tuple)alg.tuple().eval(new Environment(), new Store(), new Null());
        assertEquals(new Tuple(), t);
        t = (Tuple)alg.tuple(alg.lit(0)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Tuple(new Int(0)), t);
        t = (Tuple)alg.tuple(alg.lit(0), alg.lit(1)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Tuple(new Int(0), new Int(1)), t);
        t = (Tuple)alg.tuple(alg.lit(0), alg.lit(1), alg.lit(2)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Tuple(new Int(0), new Int(1), new Int(2)), t);
    }

    @Test
    public void testProject() throws Exception {
        IEval tup1 = alg.tuple(alg.lit(1));
        IEval tup2 = alg.tuple(alg.lit(1), alg.lit(2));
        IEval tup3 = alg.tuple(alg.lit(1), alg.lit(2), alg.lit(3));

        Int i = (Int)alg.project(alg.lit(0), tup1).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(1), i.intValue());
        i = (Int)alg.project(alg.lit(1), tup2).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(2), i.intValue());
        i = (Int)alg.project(alg.lit(2), tup3).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(3), i.intValue());
    }

    @Test
    public void testPartialApp() throws Exception {
        IEval incr = alg.partialApp(alg.abs(alg.intAdd(alg.project(alg.lit(0), alg.given()), alg.project(alg.lit(1), alg.given()))), alg.lit(1));
        Int i = (Int)alg.apply(incr, alg.lit(2)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(3), i.intValue());
    }

    @Test
    public void testCurry() throws Exception {
        IEval uncurriedAdd = alg.abs(alg.intAdd(alg.project(alg.lit(0), alg.given()), alg.project(alg.lit(1), alg.given())));
        Value v = alg.apply(alg.curry(uncurriedAdd), alg.lit(2)).eval(new Environment(), new Store(), new Null());
        Int i = (Int)alg.apply((x,y,z) -> v, alg.lit(3)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(5), i.intValue());
    }
}