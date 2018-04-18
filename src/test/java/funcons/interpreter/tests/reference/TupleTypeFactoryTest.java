package funcons.interpreter.tests.reference;

import funcons.interpreter.AllFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TupleTypeFactoryTest implements AllFactory {

    @Test
    public void testTupleType() throws Exception {
        assertEquals(
                tupleType().eval(),
                tupleType().eval());
        assertNotEquals(
                tupleType().eval(),
                tupleType(type("foo")).eval());

        assertEquals(
                tupleType(type("foo")).eval(),
                tupleType(type("foo")).eval());
        assertNotEquals(
                tupleType(type("bar")).eval(),
                tupleType(type("foo")).eval());
        assertNotEquals(
                tupleType(type("foo"), type("bar")).eval(),
                tupleType(type("foo")).eval());

        assertEquals(
                tupleType(type("foo"), type("bar")).eval(),
                tupleType(type("foo"), type("bar")).eval());
        assertNotEquals(
                tupleType(type("foo"), type("baz")).eval(),
                tupleType(type("foo"), type("bar")).eval());
        assertNotEquals(
                tupleType(type("foo"), type("bar"), type("baz")).eval(),
                tupleType(type("foo"), type("bar")).eval());

        assertEquals(
                tupleType(type("foo"), type("bar"), type("baz")).eval(),
                tupleType(type("foo"), type("bar"), type("baz")).eval());
        assertNotEquals(
                tupleType(type("foo"), type("bar"), type("foo")).eval(),
                tupleType(type("foo"), type("bar"), type("baz")).eval());
    }

    @Test
    public void testTupleTypePrefix() throws Exception {
        assertEquals(
                tupleTypePrefix(type("foo"), tupleType(type("bar"))).eval(),
                tupleTypePrefix(type("foo"), tupleType(type("bar"))).eval());
        assertNotEquals(
                tupleTypePrefix(type("baz"), tupleType(type("bar"))).eval(),
                tupleTypePrefix(type("foo"), tupleType(type("bar"))).eval());
    }

    @Test
    public void testProjectType() throws Exception {
        assertEquals(
                type("bar").eval(),
                projectType(lit(1), tupleType(type("foo"), type("bar"), type("baz"))).eval());
    }
}