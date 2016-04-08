package funcons.tests;

import funcons.algebras.ApplyAlg;
import funcons.interpreter.ApplyFactory;
import funcons.sorts.IEval;
import funcons.types.Abs;
import funcons.types.Environment;
import funcons.types.Int;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplyFactoryTest {

    private ApplyAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new ApplyFactory() {};
    }

    @Test
    public void testAbs() throws Exception {
        Abs<IEval> abs = (Abs<IEval>)alg.abs(alg.lit(1)).eval(new Environment());
        Int result = (Int)abs.body().eval(new Environment());
        assertEquals(result.intValue(), new Integer(1));
    }

    @Test
    public void testApply() throws Exception {
        Int i = (Int)alg.apply(alg.abs(alg.intAdd(alg.lit(1), alg.given())), alg.lit(2)).eval(new Environment());
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testBind() throws Exception {
        Environment env = (Environment)alg.apply(alg.bind(alg.var("id")), alg.lit(3)).eval(new Environment());
        assertEquals(((Int)alg.boundValue(alg.var("id")).eval(env)).intValue(), new Integer(3));
    }
}