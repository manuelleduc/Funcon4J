package funcons.tests;

import funcons.algebras.EffectAlg;
import funcons.interpreter.EffectFactory;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.Null;
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
        Null n = (Null)alg.effect(alg.intAdd(alg.lit(2), alg.lit(3))).eval(new Environment());
        assertEquals(new Null(), n);
    }
}