package tests.truffle.todo;

import funcons.interpreter.AllFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntFactoryTest implements AllFactory {

    @Test
    public void testLit() throws Exception {
        assertEquals(lit(0).eval(), lit(0).eval());
    }

    @Test
    public void testIntAdd() throws Exception {
        assertEquals(lit(9).eval(), intAdd(lit(3), lit(6)).eval());
    }

    @Test
    public void testIntNegate() throws Exception {
        assertEquals(lit(-1).eval(), intNegate(lit(1)).eval());
    }

    @Test
    public void testIntSubtract() throws Exception {
        assertEquals(lit(3).eval(), intSubtract(lit(6), lit(3)).eval());
    }

    @Test
    public void testIntMultiply() throws Exception {
        assertEquals(lit(18).eval(), intMultiply(lit(6), lit(3)).eval());
    }

    @Test
    public void testIntDivide() throws Exception {
        assertEquals(lit(2).eval(), intDivide(lit(6), lit(3)).eval());
    }

    @Test
    public void testIntModulo() throws Exception {
        assertEquals(lit(0).eval(), intModulo(lit(6), lit(3)).eval());
    }
}