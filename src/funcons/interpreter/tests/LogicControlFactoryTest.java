package funcons.interpreter.tests;

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
}