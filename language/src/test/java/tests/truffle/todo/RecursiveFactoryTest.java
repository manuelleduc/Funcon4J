package tests.truffle.todo;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import io.usethesource.vallang.IValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class RecursiveFactoryTest implements AllFactory {

    @Test
    public void testFreshFwd() throws Exception {
        assertNotEquals(freshFwd().eval(), freshFwd().eval());
    }

    @Test
    public void testFreshFwds() throws Exception {
        IEval fwds = freshFwds(list(id("x"), id("y")));
        assertEquals(undefined().eval(), followFwd(scope(fwds, boundValue(id("x")))).eval());
    }

    @Test
    public void testSetForwards() throws Exception {
        IEval bindings = accum(bindValue(id("foo"), lit(3)), bindValue(id("bar"), lit(5)));
        IValue fwdsEnvironment = freshFwds(listPrefix(id("foo"), list(id("bar"), id("baz")))).eval();
        IEval settingFwds = setForwards((e,g)->fwdsEnvironment);
        scope(bindings, settingFwds).eval();

        assertEquals(lit(3).eval(), followFwd(mapGet((e,g)->fwdsEnvironment, id("foo"))).eval());
        assertEquals(lit(5).eval(),  followFwd(mapGet((e,g)->fwdsEnvironment, id("bar"))).eval());
        assertEquals(undefined().eval(), followFwd(mapGet((e,g)->fwdsEnvironment, id("baz"))).eval());
    }

    @Test
    public void testReclose() throws Exception {
        IEval recloseEval = reclose(freshFwds(list(id("foo"), id("bar"))), bindValue(id("foo"), lit(0)));
        assertEquals(lit(0).eval(), scope(recloseEval, boundValue(id("foo"))).eval());
        assertEquals(null, scope(recloseEval, boundValue(id("bar"))).eval());
    }

    @Test
    public void testRecursive() throws Exception {
        IEval env = recursive(list(id("foo")), bindValue(id("foo"), lit(0)));
        assertEquals(lit(0).eval(), scope(env, boundValue(id("foo"))).eval());
    }

    @Test
    public void testFollowFwd() throws Exception {
        IValue fwdEnvironment = freshFwds(list(id("foo"))).eval();
        scope(bindValue(id("foo"), lit(0)), setForwards((e,g)->fwdEnvironment)).eval();
        assertEquals(lit(0).eval(), followFwd(scope((e,g)->fwdEnvironment, boundValue(id("foo")))).eval());
    }

    @Test
    public void testFollowIfFwd() throws Exception {
        IValue fwdEnvironment = freshFwds(list(id("foo"))).eval();
        scope(bindValue(id("foo"), lit(0)), setForwards((e,g)->fwdEnvironment)).eval();
        assertEquals(lit(0).eval(), followIfFwd(scope((e,g) -> fwdEnvironment, boundValue(id("foo")))).eval());

        assertEquals(lit(1).eval(), followIfFwd(lit(1)).eval());
    }

    @Test
    public void testRecursiveTyped() throws Exception {
        IEval map = mapUpdate(environment(), id("foo"), type("bar"));
        IEval env = recursiveTyped(map, bindValue(id("foo"), lit(0)));
        assertEquals(lit(0).eval(), scope(env, boundValue(id("foo"))).eval());
    }
}