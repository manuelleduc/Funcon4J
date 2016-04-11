package funcons.tests;

import funcons.algebras.BindAlg;
import funcons.interpreter.BindFactory;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.Int;
import funcons.types.Null;
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
        Variable v = (Variable)alg.var("foo").eval(new Environment(), new Null());
        assertEquals(v.stringValue(), "foo");
    }

    @Test
    public void testBindValue() throws Exception {
        Environment env = (Environment)alg.bindValue(alg.var("foo"), alg.lit(3)).eval(new Environment(), new Null());
        Variable v = (Variable)alg.var("foo").eval(new Environment(), new Null());
        assertEquals(((Int)env.val(v)).intValue(), new Integer(3));
    }

    @Test
    public void testBoundValue() throws Exception {
        Environment env = (Environment)alg.bindValue(alg.var("foo"), alg.lit(3)).eval(new Environment(), new Null());
        Int i = (Int)alg.boundValue(alg.var("foo")).eval(env, new Null());
        assertEquals(i.intValue(), new Integer(3));
    }

    @Test
    public void testScope() throws Exception {
        IEval env1 = alg.bindValue(alg.var("foo"), alg.lit(3));
        IEval env2 = alg.bindValue(alg.var("foo"), alg.lit(2));

        Int i = (Int)alg.scope(env2, alg.boundValue(alg.var("foo"))).eval((Environment)env1.eval(new Environment(), new Null()), new Null());
        assertEquals(i.intValue(), new Integer(2));
    }

    @Test
    public void testSupplyAndGiven() throws Exception {
        Int i = (Int)alg.supply(alg.lit(3), alg.given()).eval(new Environment(), new Null());
        assertEquals(i.intValue(), new Integer(3));
    }
}