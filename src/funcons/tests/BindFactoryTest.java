package funcons.tests;

import funcons.algebras.BindAlg;
import funcons.interpreter.BindFactory;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.Int;
import funcons.types.Variable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BindFactoryTest {

    private BindAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new BindFactory() {};
    }

    @Test
    public void testVar() throws Exception {
        Variable v = (Variable)alg.var("id").eval(new Environment());
        assertEquals(v.stringValue(), "id");
    }

    @Test
    public void testBindValue() throws Exception {
        Environment env = (Environment)alg.bindValue(alg.var("id"), alg.lit(3)).eval(new Environment());
        Variable v = (Variable)alg.var("id").eval(new Environment());
        assertEquals(((Int)env.val(v)).intValue(), new Integer(3));
    }

    @Test
    public void testBoundValue() throws Exception {
        Environment env = (Environment)alg.bindValue(alg.var("id"), alg.lit(3)).eval(new Environment());
        Int i = (Int)alg.boundValue(alg.var("id")).eval(env);
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testScope() throws Exception {
        IEval env1 = alg.bindValue(alg.var("id"), alg.lit(3));
        IEval env2 = alg.bindValue(alg.var("id"), alg.lit(2));
        Environment scopedEnv = (Environment)alg.scope(env2, env1).eval(new Environment());
        assertEquals(((Int)scopedEnv.val(new Variable("id"))).intValue(), new Integer(2));
    }

    @Test
    public void testSupplyAndGiven() throws Exception {
        Int i = (Int)alg.supply(alg.lit(3), alg.given()).eval(new Environment());
        assertEquals(i.intValue(), new Integer(3));
    }
}