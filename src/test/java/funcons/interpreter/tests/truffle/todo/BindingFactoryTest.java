package funcons.interpreter.tests.truffle.todo;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BindingFactoryTest implements AllFactory {

    @Test
    public void testId() throws Exception {
        assertEquals(id("foo").eval(), id("foo").eval());
        assertNotEquals(id("bar").eval(), id("foo").eval());
    }

    @Test
    public void testNameId() throws Exception {
        IEval v = nameId("foo", "bar");
        assertEquals(nameId("foo", "bar").eval(), v.eval());
        assertNotEquals(nameId("bar", "bar").eval(), v.eval());
        assertNotEquals(nameId("bar", "foo").eval(), v.eval());
    }

    @Test
    public void testBindValue() throws Exception {
        assertEquals(lit(3).eval(), scope(bindValue(id("foo"), lit(3)), boundValue(id("foo"))).eval());
    }

    @Test
    public void testBoundValue() throws Exception {
        assertEquals(lit(3).eval(), scope(bindValue(id("foo"), lit(3)), boundValue(id("foo"))).eval());
    }

    @Test
    public void testScope() throws Exception {
        IEval env1 = bindValue(id("foo"), lit(3));
        IEval env2 = bindValue(id("foo"), lit(2));
        assertEquals(lit(2).eval(), scope(env1, scope(env2, boundValue(id("foo")))).eval());
    }

    @Test
    public void testEnvironment() throws Exception {
        assertEquals(environment().eval(), environment().eval());
    }

    @Test
    public void testAccum() throws Exception {
        IEval a = accum(
                bindValue(id("bar"), lit(1)),
                bindValue(id("foo"), intAdd(boundValue(id("bar")), lit(2))));
        assertEquals(lit(1).eval(), scope(a, boundValue(id("bar"))).eval());
        assertEquals(lit(3).eval(), scope(a, boundValue(id("foo"))).eval());
    }

    @Test
    public void testClosure() throws Exception {
        assertEquals(
                lit(0).eval(),
                scope(bindValue(id("foo"), lit(0)), closure(boundValue(id("foo")), bindValue(id("foo"), lit(0)))).eval());
    }
}