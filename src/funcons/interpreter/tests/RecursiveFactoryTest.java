package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursiveFactoryTest implements AllFactory {

    @Test
    public void testFreshFwd() throws Exception {
        assertEquals(freshFwd().eval(), freshFwd().eval());
    }

    @Test
    public void testFreshFwds() throws Exception {
        IEval fwds = freshFwds(list(id("x"), id("y")));
        assertEquals(freshFwd().eval(), accum(fwds, boundValue(id("x"))));
    }

    @Test
    public void testSetForwards() throws Exception {
        // TODO
        /*
        Forwards forwards = new Forwards();
        Environment env = new Environment();
        env = env.add(new Id("foo"), new Int(3));
        env = env.add(new Id("bar"), new Int(5));
        IEval bindings = accum(bindValue(id("foo"), lit(3)), bindValue(id("bar"), lit(5)));
        IEval settingFwds = setForwards(freshFwds(listPrefix(id("foo"), list(id("bar"), id("baz")))));
        accum(bindings, settingFwds).eval();

        IEval fwdsEval = freshFwds(listPrefix(id("foo"), list(id("bar"), id("baz"))));
        Map fwds = (Map)fwdsEval.eval(env, forwards, new Store(), new Null());
        setForwards((e,f,s,g) -> fwds).eval(env, forwards, new Store(), new Null());

        assertEquals(new Integer(3), ((Int)forwards.follow(new Fwd(0))).intValue());
        assertEquals(new Integer(5), ((Int)forwards.follow(new Fwd(1))).intValue());
        assertEquals(new Undefined(), forwards.follow(new Fwd(2)));
        */
    }

    @Test
    public void testReclose() throws Exception {
        // TODO
        /*
        IEval recloseEval = reclose(freshFwds(list(id("foo"), id("bar"))), bindValue(id("foo"), lit(0)));
        Forwards forwards = new Forwards();
        recloseEval.eval(new Environment(), forwards, new Store(), new Null());
        assertEquals(new Integer(0), ((Int)forwards.follow(new Fwd(0))).intValue());
        assertEquals(new Undefined(), forwards.follow(new Fwd(1)));
        */
    }

    @Test
    public void testRecursive() throws Exception {
        // TODO
        /*
        Forwards forwards = new Forwards();
        recursive(list(id("foo")), bindValue(id("foo"), lit(0)))
                .eval(new Environment(), forwards, new Store(), new Null());
        assertEquals(new Integer(0), ((Int)forwards.follow(new Fwd(0))).intValue());
        */
    }

    @Test
    public void testFollowFwd() throws Exception {
        // TODO
        /*
        Forwards forwards = new Forwards();

        Environment env = new Environment();
        env = env.add(new Id("foo"), new Int(0));
        setForwards(freshFwds(list(id("foo")))).eval(env, forwards, new Store(), new Null());
        Int i = (Int)followFwd((e,f,s,g) -> new Fwd(0)).eval(env, forwards, new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());
         */
    }

    @Test
    public void testFollowIfFwd() throws Exception {
        // TODO
        /*
        Forwards forwards = new Forwards();
        Environment env = new Environment();
        env = env.add(new Id("foo"), new Int(0));
        setForwards(freshFwds(list(id("foo")))).eval(env, forwards, new Store(), new Null());
        Int i = (Int)followIfFwd((e,f,s,g) -> new Fwd(0)).eval(env, forwards, new Store(), new Null());
        assertEquals(new Integer(0), i.intValue());

        i = (Int)followIfFwd(lit(1)).eval(env, forwards, new Store(), new Null());
        assertEquals(new Integer(1), i.intValue());
        */
    }

    @Test
    public void testRecursiveTyped() throws Exception {
        // TODO
        /*
        Forwards forwards = new Forwards();
        IEval map = mapUpdate(environment(), id("foo"), type("bar"));
        recursiveTyped(map, bindValue(id("foo"), lit(0)))
                .eval(new Environment(), forwards, new Store(), new Null());
        assertEquals(new Integer(0), ((Int)forwards.follow(new Fwd(0))).intValue());
        */
    }
}