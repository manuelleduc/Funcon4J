package funcons.interpreter.tests.truffle.todo;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class FunctionFactoryTest implements AllFactory {

    @Test
    public void testAbs() throws Exception {
        assertEquals(lit(0).eval(), apply(abs(given()), lit(0)).eval());
        assertEquals(lit(3).eval(), apply(abs(bind(id("foo")), intAdd(boundValue(id("foo")), lit(1))), lit(2)).eval());
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
    public void testApply() throws Exception {
        assertEquals(lit(3).eval(), apply(abs(intAdd(lit(1), given())), lit(2)).eval());
    }

    @Test
    public void testCompose() throws Exception {
        IEval incr = abs(intAdd(given(), lit(1)));
        IEval double_ = abs(intMultiply(given(), lit(2)));
        assertEquals(lit(8).eval(), apply(compose(double_, incr), lit(3)).eval());
    }

    @Test
    public void testClose() throws Exception {
        IEval close = close(abs(boundValue(id("foo"))));
        assertEquals(
                lit(0).eval(),
                scope(
                        bindValue(id("foo"), lit(0)),
                        scope(
                                bindValue(id("bar"), close),
                                scope(
                                        bindValue(id("foo"), lit(1)),
                                        apply(boundValue(id("bar")), lit(2))
                                )
                        )
                ).eval()
        );
    }
}