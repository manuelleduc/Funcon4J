package funcons.interpreter.tests;

import funcons.interpreter.AllFactory;
import funcons.values.signals.FailureTrue;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListFactoryTest implements AllFactory {

    @Test
    public void testList() throws Exception {
        assertEquals(list().eval(), list().eval());
        assertEquals(lit(1).eval(), projectList(lit(0), list(lit(1))).eval());
        assertEquals(lit(2).eval(), projectList(lit(1), list(lit(1), lit(2))).eval());
    }

    @Test
    public void testListPrefix() throws Exception {
        assertEquals(list(lit(0), lit(1)).eval(), listPrefix(lit(0), list(lit(1))).eval());
    }

    @Test
    public void testListPrefixMatch() throws Exception {
        // should pass
        listPrefixMatch(list(lit(0), lit(1)), only(lit(0)), any()).eval();

        // should fail
        try {
            listPrefixMatch(list(lit(1), lit(1)), only(lit(0)), any()).eval();
            assertFalse(true);
        } catch (FailureTrue ignore) {}
    }

    @Test
    public void testListPrefixPatt() throws Exception {
        // should pass
        match(list(lit(0), lit(1)), listPrefixPatt(only(lit(0)), any())).eval();

        // should fail
        try {
            match(list(lit(1), lit(0)), listPrefixPatt(only(lit(0)), any())).eval();
            assertTrue(false);
        } catch(FailureTrue ignore) {}
    }

    @Test
    public void testIntClosedInterval() throws Exception {
        assertEquals(list(lit(0), lit(1)).eval(), intClosedInterval(lit(0), lit(1)).eval());
    }

    @Test
    public void testListReverse() throws Exception {
        assertEquals(list(lit(1), lit(2)).eval(), listReverse(list(lit(2), lit(1))).eval());
    }

    @Test
    public void testListAppend() throws Exception {
        assertEquals(list(lit(2), lit(3)).eval(), listAppend(list(lit(2)), list(lit(3))).eval());
    }

    @Test
    public void testProjectList() throws Exception {
        assertEquals(lit(5).eval(), projectList(lit(0), list(lit(5), lit(6))).eval());
        assertEquals(lit(6).eval(), projectList(lit(1), list(lit(5), lit(6))).eval());
    }

    @Test
    public void testListLength() throws Exception {
        assertEquals(lit(0).eval(), listLength(list()).eval());
        assertEquals(lit(1).eval(), listLength(list(lit(0))).eval());
        assertEquals(lit(2).eval(), listLength(list(lit(0), lit(1))).eval());
    }

    @Test
    public void testListHead() throws Exception {
        assertEquals(lit(0).eval(), listHead(list(lit(0))).eval());
        assertEquals(lit(0).eval(), listHead(list(lit(0), lit(1))).eval());
    }

    @Test
    public void testListTail() throws Exception {
        assertEquals(list().eval(), listTail(list(lit(0))).eval());
        assertEquals(list(lit(1)).eval(), listTail(list(lit(0), lit(1))).eval());
    }
}