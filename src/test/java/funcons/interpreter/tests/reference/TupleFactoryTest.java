package funcons.interpreter.tests.reference;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import funcons.values.signals.FailureTrue;
import org.junit.Test;

import static org.junit.Assert.*;

public class TupleFactoryTest implements AllFactory {

    @Test
    public void testTuple() throws Exception {
        assertEquals(tuple().eval(), tuple().eval());
        assertNotEquals(tuple().eval(), tuple(lit(0)).eval());

        assertEquals(tuple(lit(0)).eval(), tuple(lit(0)).eval());
        assertNotEquals(tuple(lit(1)).eval(), tuple(lit(0)).eval());
        assertNotEquals(tuple(lit(1)).eval(), tuple(lit(0), lit(1)).eval());

        assertEquals(tuple(lit(0), lit(1)).eval(), tuple(lit(0), lit(1)).eval());
        assertNotEquals(tuple(lit(0), lit(2)).eval(), tuple(lit(0), lit(1)).eval());
        assertNotEquals(tuple(lit(0), lit(1)).eval(), tuple(lit(0), lit(1), lit(2)).eval());

        assertEquals(tuple(lit(0), lit(1), lit(2)).eval(), tuple(lit(0), lit(1), lit(2)).eval());
        assertNotEquals(tuple(lit(0), lit(1), lit(2)).eval(), tuple(lit(0), lit(1), lit(3)).eval());
    }

    @Test
    public void testTuplePrefix() throws Exception {
        assertEquals(tuple(lit(5)).eval(), tuplePrefix(lit(5), tuple()).eval());
        assertEquals(
                tuple(lit(1), lit(2), lit(3)).eval(),
                tuplePrefix(lit(1), tuplePrefix(lit(2), tuplePrefix(lit(3), tuple()))).eval());
    }

    @Test
    public void testProject() throws Exception {
        assertEquals(lit(1).eval(), project(lit(0), tuple(lit(1))).eval());
        assertEquals(lit(2).eval(), project(lit(1), tuple(lit(1), lit(2))).eval());
        assertEquals(lit(3).eval(), project(lit(2), tuple(lit(1), lit(2), lit(3))).eval());
    }

    @Test
    public void testTuplePrefixMatch() throws Exception {
        IEval onlyZero = abs(seq(match(given(), only(lit(0))), bindValue(id("x"), lit(5))));
        IEval anything = abs(seq(match(given(), any()), bindValue(id("y"), lit(6))));
        IEval pm = tuplePrefixMatch(tuple(lit(0), lit(1), lit(2)), onlyZero, anything);
        assertEquals(lit(5).eval(), scope(pm, boundValue(id("x"))).eval());
        assertEquals(lit(6).eval(), scope(pm, boundValue(id("y"))).eval());

        // should fail
        try {
            tuplePrefixMatch(tuple(lit(9), lit(1), lit(2)), onlyZero, anything).eval();
            assertTrue(false);
        } catch (FailureTrue ignore) {}
    }

    @Test
    public void testTuplePrefixPatt() throws Exception {
        IEval pattBindY = tuplePrefixPatt(bind(id("y")), only(tuple()));
        IEval pattBindXY = tuplePrefixPatt(bind(id("x")), pattBindY);
        IEval match = match(tuple(lit(1), lit(2)), pattBindXY);
        assertEquals(lit(1).eval(), scope(match, boundValue(id("x"))).eval());
        assertEquals(lit(2).eval(), scope(match, boundValue(id("y"))).eval());
    }

    @Test
    public void testTupleTail() throws Exception {
        assertEquals(tuple(lit(1), lit(2)).eval(), tupleTail(tuple(lit(0), lit(1), lit(2))).eval());
    }

    @Test
    public void testTupleHead() throws Exception {
        assertEquals(lit(0).eval(), tupleHead(tuple(lit(0), lit(1), lit(2))).eval());
    }
}