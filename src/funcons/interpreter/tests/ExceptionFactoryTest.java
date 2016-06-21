package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import funcons.values.Bool;
import funcons.values.Int;
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
        Int i =(Int)whenTrue(bool(true), lit(0)).eval();
        assertEquals(new Integer(0), i.intValue());
    }

    @Test
    public void testElse_() throws Exception {
        Int i = (Int)else_(fail(), lit(3)).eval();
        assertEquals(i.intValue(), new Integer(3));

        i = (Int)else_(lit(2), lit(3)).eval();
        assertEquals(i.intValue(), new Integer(2));
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

        Bool b = (Bool)apply(preferOver(f1, f2), lit(0)).eval();
        assertTrue(b.boolValue());

        b = (Bool)apply(preferOver(f2, f1), lit(1)).eval();
        assertTrue(b.boolValue());
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
            assertEquals(new RunTimeFunconException("Match_failure", new Int(3)), e);
            assertNotEquals(new RunTimeFunconException("Match_failure", new Int(4)), e);
            assertNotEquals(new RunTimeFunconException("Match_failure"), e);
            assertNotEquals(new CLMatchFailureException(), e);
            assertNotEquals(new FailureTrue(), e);
        }
    }
}
