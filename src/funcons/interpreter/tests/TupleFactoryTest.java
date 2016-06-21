package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Tuple;
import funcons.values.ids.Id;
import funcons.values.signals.FailureTrue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TupleFactoryTest implements AllFactory {

    @Test
    public void testTuple() throws Exception {
        Tuple t = (Tuple)tuple().eval();
        assertEquals(new Tuple(), t);
        t = (Tuple)tuple(lit(0)).eval();
        assertEquals(new Tuple(new Int(0)), t);
        t = (Tuple)tuple(lit(0), lit(1)).eval();
        assertEquals(new Tuple(new Int(0), new Int(1)), t);
        t = (Tuple)tuple(lit(0), lit(1), lit(2)).eval();
        assertEquals(new Tuple(new Int(0), new Int(1), new Int(2)), t);
        System.out.println(t);
    }

    @Test
    public void testTuplePrefix() throws Exception {
        Tuple t = (Tuple)tuplePrefix(lit(5), tuple()).eval();
        assertEquals(new Integer(5), ((Int)t.get(new Int(0))).intValue());

        t = (Tuple)tuplePrefix(lit(1), tuplePrefix(lit(2), tuplePrefix(lit(3), tuple())))
                .eval();
        assertEquals(t, tuple(lit(1), lit(2), lit(3)).eval());
    }

    @Test
    public void testProject() throws Exception {
        IEval tup1 = tuple(lit(1));
        IEval tup2 = tuple(lit(1), lit(2));
        IEval tup3 = tuple(lit(1), lit(2), lit(3));

        Int i = (Int)project(lit(0), tup1).eval();
        assertEquals(new Integer(1), i.intValue());
        i = (Int)project(lit(1), tup2).eval();
        assertEquals(new Integer(2), i.intValue());
        i = (Int)project(lit(2), tup3).eval();
        assertEquals(new Integer(3), i.intValue());
    }

    @Test
    public void testTuplePrefixMatch() throws Exception {
        IEval onlyZero = abs(seq(match(given(), only(lit(0))), bindValue(id("x"), lit(5))));
        IEval anything = abs(seq(match(given(), any()), bindValue(id("y"), lit(6))));
        Environment env = (Environment)tuplePrefixMatch(tuple(lit(0), lit(1), lit(2)), onlyZero, anything)
                .eval();
        assertEquals(new Integer(5), ((Int)env.val(new Id("x"))).intValue());
        assertEquals(new Integer(6), ((Int)env.val(new Id("y"))).intValue());

        IEval shouldFail = tuplePrefixMatch(tuple(lit(9), lit(1), lit(2)), onlyZero, anything);
        try {
            shouldFail.eval();
        } catch (FailureTrue f) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testTuplePrefixPatt() throws Exception {
        IEval pattBindY = tuplePrefixPatt(bind(id("y")), only(tuple()));
        IEval pattBindXY = tuplePrefixPatt(bind(id("x")), pattBindY);
        Environment env = (Environment)match(tuple(lit(1), lit(2)), pattBindXY).eval();
        assertEquals(new Int(1), env.val(new Id("x")));
        assertEquals(new Int(2), env.val(new Id("y")));
    }

    @Test
    public void testTupleTail() throws Exception {
        IEval tailEval = tupleTail(tuple(lit(0), lit(1), lit(2)));
        Tuple t = (Tuple)tailEval.eval();
        assertEquals(new Tuple(new Int(1), new Int(2)), t);
    }

    @Test
    public void testTupleHead() throws Exception {
        IEval headEval = tupleHead(tuple(lit(0), lit(1), lit(2)));
        Int i = (Int)headEval.eval();
        assertEquals(new Integer(0), i.intValue());
    }
}