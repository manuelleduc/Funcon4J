package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import funcons.values.signals.FailureTrue;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternFactoryTest implements AllFactory {

    @Test
    public void testOnly() throws Exception {
        assertEquals(bool(true).eval(), seq(apply(only(lit(0)), lit(0)), bool(true)).eval());
        assertEquals(bool(false).eval(), else_(apply(only(lit(0)), lit(1)), bool(false)).eval());
    }

    @Test
    public void testAny() throws Exception {
        assertEquals(bool(true).eval(), seq(apply(any(), lit(0)), bool(true)).eval());
    }

    @Test
    public void testMatch() throws Exception {
        assertEquals(bool(true).eval(), seq(match(lit(0), any()), bool(true)).eval());
        assertEquals(bool(false).eval(), else_(match(lit(0), only(lit(1))), bool(false)).eval());
    }

    @Test
    public void testPattAbs() throws Exception {
        IEval part1 = bind(id("x"));
        IEval part2 = intAdd(boundValue(id("x")), lit(1));
        IEval incr = pattAbs(part1, part2);
        assertEquals(lit(3).eval(), apply(incr, lit(2)).eval());
    }

    @Test
    public void testPattUnion() throws Exception {
        IEval patt1 = bind(id("foo"));
        IEval patt2 = bind(id("bar"));
        assertEquals(lit(1).eval(), scope(match(lit(1), patt1), boundValue(id("foo"))).eval());

        IEval matching = match(lit(1), pattUnion(patt1, patt2));
        assertEquals(lit(1).eval(), scope(matching, boundValue(id("foo"))).eval());
        assertEquals(lit(1).eval(), scope(matching, boundValue(id("bar"))).eval());
    }

    @Test
    public void testPattNonBinding() throws Exception {
        IEval pat = pattNonBinding(bind(id("foo")));
        assertNull(scope(match(lit(0), pat), boundValue(id("foo"))).eval());

        try {
            match(lit(0), pattNonBinding(only(lit(1)))).eval();
            assertTrue(false);
        } catch (FailureTrue ignore) {}
    }

    @Test
    public void testBind() throws Exception {
        assertEquals(lit(3).eval(), scope(apply(bind(id("foo")), lit(3)), boundValue(id("foo"))).eval());
    }
}