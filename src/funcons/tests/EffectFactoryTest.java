package funcons.tests;

import funcons.Store;
import funcons.algebras.EffectAlg;
import funcons.interpreter.EffectFactory;
import funcons.sorts.IEval;
import funcons.values.Environment;
import funcons.values.Null;
import funcons.values.recursion.Forwards;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EffectFactoryTest {

    private EffectAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new EffectFactory() {};
    }

    @Test
    public void testEffect() throws Exception {
        Null n = (Null)alg.effect(alg.intAdd(alg.lit(2), alg.lit(3))).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Null(), n);
    }
}