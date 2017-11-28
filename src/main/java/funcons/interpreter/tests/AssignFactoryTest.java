package funcons.interpreter.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import funcons.interpreter.AllFactory;

public class AssignFactoryTest implements AllFactory {

    @Test
    public void testAlloc() throws Exception {
        assertEquals(
                lit(0).eval(),
                scope(
                        bindValue(id("foo"), alloc(lit(0))),
                        assignedValue(boundValue(id("foo")))
                ).eval());
    }

    @Test
    public void testAssign() throws Exception {
        assertEquals(
                lit(1).eval(),
                scope(
                        bindValue(id("foo"), alloc(lit(0))),
                        seq(
                                assign(boundValue(id("foo")), lit(1)),
                                assignedValue(boundValue(id("foo"))))).eval());
    }

    @Test
    public void testAssignedValue() throws Exception {
        assertEquals(lit(0).eval(), assignedValue(alloc(lit(0))).eval());
    }

    @Test
    public void testAssignedValueIfVar() throws Exception {
        assertEquals(lit(0).eval(), assignedValueIfVar(alloc(lit(0))).eval());
    }
}