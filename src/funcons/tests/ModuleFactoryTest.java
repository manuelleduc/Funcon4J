package funcons.tests;

import funcons.Store;
import funcons.algebras.ModuleAlg;
import funcons.interpreter.ModuleFactory;
import funcons.sorts.IEval;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.Null;
import funcons.values.ids.Id;
import funcons.values.recursion.Forwards;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ModuleFactoryTest {

    private ModuleAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new ModuleFactory() {};
    }

    @Test
    public void testAccum() throws Exception {
        IEval accum = alg.accum(alg.bindValue(alg.id("bar"), alg.lit(1)),
                alg.bindValue(alg.id("foo"), alg.intAdd(alg.boundValue(alg.id("bar")), alg.lit(2))));
        Environment env = (Environment)accum.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(1), ((Int)env.val(new Id("bar"))).intValue());
        assertEquals(new Integer(3), ((Int)env.val(new Id("foo"))).intValue());
    }
}