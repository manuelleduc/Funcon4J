package funcons.tests;

import funcons.Store;
import funcons.algebras.LogicWhileTrueAlg;
import funcons.interpreter.LogicWhileTrueFactory;
import funcons.sorts.IEval;
import funcons.values.Environment;
import funcons.values.Null;
import funcons.values.recursion.Forwards;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LogicWhileTrueFactoryTest {

    private LogicWhileTrueAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new LogicWhileTrueFactory() {};
    }

    @Test
    public void testWhileTrue() throws Exception {
        Null n = (Null)alg.whileTrue(alg.bool(false), alg.intAdd(alg.lit(2), alg.lit(3))).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Null(), n);
    }
}