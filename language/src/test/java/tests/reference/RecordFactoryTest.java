package tests.reference;

import funcons.interpreter.AllFactory;
import funcons.values.signals.FailureTrue;
import org.junit.Test;

import static org.junit.Assert.*;

public class RecordFactoryTest implements AllFactory {

    @Test
    public void testRecord() throws Exception {
        assertEquals(record(field("foo"), lit(1)).eval(), record(field("foo"), lit(1)).eval());
        assertNotEquals(record(field("foo"), lit(2)).eval(), record(field("foo"), lit(1)).eval());
        assertNotEquals(record(field("bar"), lit(1)).eval(), record(field("foo"), lit(1)).eval());
    }

    @Test
    public void testField() throws Exception {
        assertEquals(field("foo").eval(), field("foo").eval());
        assertNotEquals(field("bar").eval(), field("foo").eval());
    }

    @Test
    public void testRecordSelect() throws Exception {
        assertEquals(lit(1).eval(), recordSelect(record(field("foo"), lit(1)), field("foo")).eval());
    }

    @Test
    public void testRecordOver() throws Exception {
        assertEquals(
                lit(0).eval(),
                recordSelect(
                        recordOver(record(field("foo"), lit(0)), record(field("foo"), lit(1))),
                        field("foo")
                ).eval());
    }

    @Test
    public void testRecordUnion() throws Exception {
        assertEquals(
                lit(1).eval(),
                recordSelect(
                        recordUnion(record(field("foo"), lit(0)), record(field("foo"), lit(1))),
                        field("foo")
                ).eval());

        assertEquals(
                lit(0).eval(),
                recordSelect(
                        recordUnion(record(field("foo"), lit(0)), record(field("bar"), lit(1))),
                        field("foo")
                ).eval());
    }

    @Test
    public void testRecordMatch() throws Exception {
        assertEquals(
                lit(0).eval(),
                scope(
                        recordMatch(record(field("foo"), lit(0)), map(field("foo"), bind(id("x")))),
                        boundValue(id("x"))
                ).eval());


        assertEquals(
                environment().eval(),
                recordMatch(
                    record(field("foo"), lit(1)),
                    map(field("foo"), only(lit(1)))
                ).eval());

        assertEquals(
                environment().eval(),
                recordMatch(
                        recordUnion(record(field("foo"), lit(1)), record(field("bar"), lit(2))),
                        map(field("foo"), only(lit(1)))
                ).eval());

        // should fail
        try {
            recordMatch(
                    record(field("foo"), lit(1)),
                    map(field("foo"), only(lit(2)))
            ).eval();
            assertTrue(false);

        } catch (FailureTrue ignore) {}
    }
}