package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.List;
import funcons.values.ids.Id;
import funcons.values.signals.FailureTrue;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ListFactoryTest implements AllFactory {

    @Test
    public void testList() throws Exception {
        List l = (List)list().eval();
        assertEquals(l, new List());
        l = (List)list(lit(0)).eval();
        assertEquals(l, new List(new Int(0)));
        l = (List)list(lit(0), lit(1)).eval();
        assertEquals(l, new List(new Int(0), new Int(1)));
    }

    @Test
    public void testListPrefix() throws Exception {
        List l = (List)listPrefix(lit(0), list(lit(1))).eval();
        assertEquals(l, new List(new Int(0), new Int(1)));
    }

    @Test
    public void testApplyToEach() throws Exception {
        {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            IEval printList = applyToEach(abs(print(given())), list(lit(0), lit(1)));
            printList.eval();
            assertEquals("01", outContent.toString());
        }
        {
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            IEval printList = applyToEach(abs(bind(id("foo")), effect(print(boundValue(id("foo"))))),
                    intClosedInterval(lit(0), lit(3)));
            printList.eval();
            assertEquals("0123", outContent.toString());
        }
    }

    @Test
    public void testListPrefixMatch() throws Exception {
        IEval onlyZero = abs(seq(match(given(), only(lit(0))), bindValue(id("x"), lit(5))));
        IEval anything = abs(seq(match(given(), any()), bindValue(id("y"), lit(6))));
        Environment env = (Environment)listPrefixMatch(list(lit(0), lit(1)), onlyZero, anything)
                .eval();
        assertEquals(new Integer(5), ((Int)env.val(new Id("x"))).intValue());
        assertEquals(new Integer(6), ((Int)env.val(new Id("y"))).intValue());

        IEval shouldFail = listPrefixMatch(list(lit(9), lit(1)), onlyZero, anything);
        try {
            shouldFail.eval();
        } catch (FailureTrue f) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testListPrefixPatt() throws Exception {
        IEval headIsZero = listPrefixPatt(only(lit(0)), any());
        Environment env = (Environment)match(list(lit(0), lit(1)), headIsZero).eval();
        assertNotNull(env);

        try {
            @SuppressWarnings("unused")
            Environment e = (Environment)match(list(lit(1), lit(0)), headIsZero).eval();
        } catch(FailureTrue ignore) {
            return;
        }
        assertTrue(false);
    }

    @Test
    public void testIntClosedInterval() throws Exception {
        List l = (List)intClosedInterval(lit(0), lit(1)).eval();
        assertEquals(new List(new Int(0), new Int(1)), l);
    }

    @Test
    public void testListReverse() throws Exception {
        List l1 = (List)listReverse(list(lit(2), lit(1))).eval();
        List l2 = (List)list(lit(1), lit(2)).eval();
        assertEquals(l2, l1);
    }

    @Test
    public void testListAppend() throws Exception {
        List l = (List)listAppend(list(lit(2)), list(lit(3)))
                .eval();
        assertEquals(new List(new Int(2), new Int(3)), l);
    }

    @Test
    public void testProjectList() throws Exception {
        assertEquals(lit(5).eval(), projectList(lit(0), list(lit(5), lit(6))).eval());
        assertEquals(lit(6).eval(), projectList(lit(1), list(lit(5), lit(6))).eval());
    }
}