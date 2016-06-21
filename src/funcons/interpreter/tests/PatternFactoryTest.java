package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.AllFactory;
import funcons.values.Bool;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import funcons.values.ids.Id;
import funcons.values.properties.Value;
import funcons.values.signals.FailureTrue;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternFactoryTest implements AllFactory {

    @Test
    public void testOnly() throws Exception {
        Bool b = (Bool)seq(apply(only(lit(0)), lit(0)), bool(true)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertTrue(b.boolValue());

        b = (Bool)else_(apply(only(lit(0)), lit(1)), bool(false)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertFalse(b.boolValue());
    }

    @Test
    public void testAny() throws Exception {
        Bool b = (Bool)seq(apply(any(), lit(0)), bool(true)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertTrue(b.boolValue());
    }

    @Test
    public void testMatch() throws Exception {
        Bool b = (Bool)seq(match(lit(0), any()), bool(true)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertTrue(b.boolValue());

        b = (Bool)else_(match(lit(0), only(lit(1))), bool(false)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertFalse(b.boolValue());
    }

    @Test
    public void testPattAbs() throws Exception {
        IEval part1 = bind(id("x"));
        IEval part2 = intAdd(boundValue(id("x")), lit(1));
        IEval incr = pattAbs(part1, part2);
        Int i = (Int)apply(incr, lit(2)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(3), i.intValue());
    }

    @Test
    public void testPattUnion() throws Exception {
        Store store = new Store();
        IEval patt1 = bind(id("foo"));
        IEval patt2 = bind(id("bar"));

        Environment env1 = (Environment) match(lit(1), patt1).eval(new Environment(), new Forwards(), store, new Null());
        assertEquals(new Integer(1), ((Int)env1.val(new Id("foo"))).intValue());

        @SuppressWarnings("unchecked")
        Environment env = (Environment)match(lit(1), pattUnion(patt1, patt2)).eval(new Environment(), new Forwards(), store, new Null());

        assertEquals(new Integer(1), ((Int)env.val(new Id("foo"))).intValue());
        assertEquals(new Integer(1), ((Int)env.val(new Id("bar"))).intValue());
    }

    @Test
    public void testPattNonBinding() throws Exception {
        Store store = new Store();
        IEval pat = pattNonBinding(bind(id("foo")));
        Environment env = (Environment)match(lit(0), pat).eval(new Environment(), new Forwards(), store, new Null());
        Value null_ = boundValue(id("foo")).eval(env, new Forwards(), store, new Null());
        assertNull(null_);

        try {
            match(lit(0), pattNonBinding(only(lit(1))))
                    .eval(new Environment(), new Forwards(), store, new Null());
        } catch (FailureTrue ignore) {
            return;
        }
        assertTrue(false);
    }
}