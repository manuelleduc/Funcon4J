package funcons.interpreter.tests.truffle;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LogicControlFactoryTest implements AllFactory {

    @Test
    public void testEffect() throws Exception {
        assertEquals(null_().eval(), effect(intAdd(lit(2), lit(3))).eval());
    }

    @Test
    public void testSeq() throws Exception {
        assertEquals(lit(2).eval(), seq(lit(3), lit(2)).eval());
    }

    @Test
    public void testIfTrue() throws Exception {
        assertEquals(lit(3).eval(), ifTrue(bool(false), lit(2), lit(3)).eval());
    }

    @Test
    public void testWhileTrue() throws Exception {
        assertEquals(null_().eval(), whileTrue(bool(false), intAdd(lit(2), lit(3))).eval());
    }

    @Test
    public void testFor_() throws Exception {
        IEval bindings = accum(bindValue(id("foo"), lit(0)), bindValue(id("bar"), alloc(lit(10))));
        IEval forLoop = for_(
                                smallerEqual(boundValue(id("foo")), lit(10)),
                                bindValue(id("foo"), intAdd(boundValue(id("foo")), lit(1))),
                                assign(boundValue(id("bar")), intAdd(assignedValue(boundValue(id("bar"))), lit(1)))
                        );

        assertEquals(lit(21).eval(), scope(bindings, seq(forLoop, assignedValue(boundValue(id("bar"))))).eval());
    }
}