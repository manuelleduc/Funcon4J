package funcons.tests;

import funcons.Store;
import funcons.algebras.TypeAlg;
import funcons.interpreter.TypeFactory;
import funcons.sorts.IEval;
import funcons.values.*;
import funcons.values.signals.FailureTrue;
import funcons.values.types.Token;
import funcons.values.types.Type;
import funcons.values.types.Variant;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TypeFactoryTest {

    private TypeAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new TypeFactory() {};
    }

    @Test
    public void testType() throws Exception {
        Type t = (Type)alg.type("foo").eval(new Environment(), new Store(), new Null());
        assertEquals(new Type("foo"), t);
    }

    @Test
    public void testTag() throws Exception {
        Tag t = (Tag)alg.tag("foo").eval(new Environment(), new Store(), new Null());
        assertEquals(new Tag("foo"), t);
    }

    @Test
    public void testVariant() throws Exception {
        Variant v = (Variant)alg.variant("foo", alg.lit(0)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Variant("foo", new Int(0)), v);
    }

    @Test
    public void testTyped() throws Exception {
        Int i = (Int)alg.typed(alg.lit(0), alg.type("foo")).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testFreshToken() throws Exception {
        Token t1 = (Token)alg.freshToken().eval(new Environment(), new Store(), new Null());
        Token t2 = (Token)alg.freshToken().eval(new Environment(), new Store(), new Null());
        assertNotEquals(t1, t2);
    }

    @Test
    public void testRestrictDomain() throws Exception {
        IEval id = alg.restrictDomain(alg.abs(alg.given()), alg.type("foo"));
        Int i = (Int)alg.apply(id, alg.lit(0)).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testPattAtType() throws Exception {
        IEval patt = alg.pattAtType(alg.bind(alg.id("foo")), alg.type("bar"));
        IEval env = alg.match(alg.lit(0), patt);
        Int i = (Int)alg.scope(env, alg.boundValue(alg.id("foo"))).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testVariantMatch() throws Exception {
        IEval env = alg.variantMatch(alg.tag("foo"), alg.variant("foo", alg.lit(0)), alg.bind(alg.id("bar")));
        Int i = (Int)alg.scope(env, alg.boundValue(alg.id("bar"))).eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());

        try {
            env = alg.variantMatch(alg.tag("foobar"), alg.variant("foo", alg.lit(0)), alg.bind(alg.id("bar")));
            i = (Int)alg.scope(env, alg.boundValue(alg.id("bar"))).eval(new Environment(), new Store(), new Null());
            assertEquals(new Integer(0), i.intValue());
        } catch(FailureTrue ignore) {
            return;
        }
        assertTrue(false);
    }
}