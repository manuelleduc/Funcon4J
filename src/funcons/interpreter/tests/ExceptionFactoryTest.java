package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import funcons.values.cl.CLMatchFailureException;
import funcons.values.signals.FailureTrue;
import funcons.values.signals.RunTimeFunconException;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExceptionFactoryTest implements AllFactory {

    @Test
    public void testFail() throws Exception {
        try {
            fail().eval();
            assertTrue(false);
        } catch (FailureTrue ignored) {}
    }

    @Test
    public void testWhenTrue() throws Exception {
        assertEquals(lit(0).eval(), whenTrue(bool(true), lit(0)).eval());
    }

    @Test
    public void testElse_() throws Exception {
        assertEquals(lit(3).eval(), else_(fail(), lit(3)).eval());
        assertEquals(lit(2).eval(), else_(lit(2), lit(3)).eval());
    }

    @Test
    public void testThrow_() throws Exception {
        try {
            throw_(matchFailure()).eval();
            assertTrue(false);
        } catch (CLMatchFailureException ignore) {}
    }

    @Test
    public void testCatch_() throws Exception {
        IEval c = catch_(throw_(matchFailure()), abs(given()));
        CLMatchFailureException e = (CLMatchFailureException)c.eval();
        assertNotNull(e);
    }

    @Test
    public void testCatchElseRethrow() throws Exception {
        IEval fail = throw_(matchFailure());

        IEval c = catchElseRethrow(fail, abs(given()));
        CLMatchFailureException e = (CLMatchFailureException)c.eval();
        assertNotNull(e);

        try {
            catchElseRethrow(fail, fail).eval();
            assertTrue(false);
        } catch (CLMatchFailureException ignore) {}
    }

    @Test
    public void testPreferOver() throws Exception {
        IEval f1 = abs(seq(fail(), bool(false)));
        IEval f2 = abs(bool(true));
        assertEquals(bool(true).eval(), apply(preferOver(f1, f2), lit(0)).eval());
        assertEquals(bool(true).eval(), apply(preferOver(f2, f1), lit(1)).eval());
    }

    @Test
    public void testMatchFailure() throws Exception {
        CLMatchFailureException e = (CLMatchFailureException)matchFailure().eval();
        assertNotNull(e);
    }

    @Test
    public void testException() throws Exception {
        try {
            throw_(exception("Match_failure")).eval();
            assertTrue(false);
        } catch(RunTimeFunconException e) {
            assertEquals(new RunTimeFunconException("Match_failure"), e);
            assertNotEquals(new CLMatchFailureException(), e);
            assertNotEquals(new FailureTrue(), e);
        }

        try {
            throw_(exception("Match_failure", lit(3))).eval();
            assertTrue(false);
        } catch(RunTimeFunconException e) {
            assertEquals(exception("Match_failure", lit(3)).eval(), e);
            assertNotEquals(exception("Match_failure", lit(4)).eval(), e);
            assertNotEquals(exception("Match_failure").eval(), e);
            assertNotEquals(exception("Match_fail").eval(), e);
        }
    }
}
