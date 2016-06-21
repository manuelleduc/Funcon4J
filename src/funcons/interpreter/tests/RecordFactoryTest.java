package funcons.interpreter.tests;

import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.AllFactory;
import funcons.values.*;
import funcons.values.ids.Id;
import funcons.values.signals.FailureTrue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RecordFactoryTest implements AllFactory {

    @Test
    public void testRecord() throws Exception {
        Record r = (Record)record(field("foo"), lit(1))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Int(1), r.select(new Field("foo")));
        assertEquals(new Record(new Map<>(new Field("foo"), new Int(1))), r);
    }

    @Test
    public void testField() throws Exception {
        Field f = (Field)field("foo")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Field("foo"), f);
    }

    @Test
    public void testRecordSelect() throws Exception {
        Int i = (Int)recordSelect(record(field("foo"), lit(1)), field("foo"))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Int(1), i);
    }

    @Test
    public void testRecordOver() throws Exception {
        Record r = (Record)recordOver(
                record(field("foo"), lit(0)),
                record(field("foo"), lit(1))
        ).eval(new Environment(), new Forwards(), new Store(), new Null());

        assertEquals(new Int(0), r.select(new Field("foo")));
    }

    @Test
    public void testRecordUnion() throws Exception {
        Record r = (Record)recordUnion(
                record(field("foo"), lit(0)),
                record(field("foo"), lit(1))
        ).eval(new Environment(), new Forwards(), new Store(), new Null());

        assertEquals(new Int(1), r.select(new Field("foo")));
    }

    @Test
    public void testRecordMatch() throws Exception {
        Environment env = (Environment)recordMatch(
                record(field("foo"), lit(0)),
                map(field("foo"), bind(id("x")))
        ).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Int(0), env.val(new Id("x")));

        env = (Environment)recordMatch(
                record(field("foo"), lit(1)),
                map(field("foo"), only(lit(1)))
        ).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Environment(), env);

        env = (Environment)recordMatch(
                recordUnion(record(field("foo"), lit(1)), record(field("bar"), lit(2))),
                map(field("foo"), only(lit(1)))
        ).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Environment(), env);

        try {
            @SuppressWarnings("unused")
            Environment ignore = (Environment)recordMatch(
                    record(field("foo"), lit(1)),
                    map(field("foo"), only(lit(2)))
            ).eval(new Environment(), new Forwards(), new Store(), new Null());
        } catch (FailureTrue e) {
            return;
        }
        assertTrue(false);
    }
}