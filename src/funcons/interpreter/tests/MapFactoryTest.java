package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.storage.EnvironmentFactory;
import funcons.interpreter.values.IntFactory;
import funcons.interpreter.values.MapFactory;
import funcons.values.*;
import funcons.values.ids.Id;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapFactoryTest {
    private interface Alg extends EnvironmentFactory, IntFactory, MapFactory {}
    private Alg alg;

    @Before
    public void setUp() throws Exception {
        alg = new Alg() {};
    }

    @Test
    public void testMapUnion() throws Exception {
        IEval e1 = alg.bindValue(alg.id("x"), alg.lit(1));
        IEval e2 = alg.bindValue(alg.id("y"), alg.lit(2));
        Environment env = (Environment)alg.mapUnion(e1, e2).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(1), ((Int)env.val(new Id("x"))).intValue());
        assertEquals(new Integer(2), ((Int)env.val(new Id("y"))).intValue());

        e1 = alg.bindValue(alg.id("x"), alg.lit(1));
        e2 = alg.bindValue(alg.id("x"), alg.lit(2));
        env = (Environment)alg.mapUnion(e1, e2).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(2), ((Int)env.val(new Id("x"))).intValue());
    }

    @Test
    public void testMapOver() throws Exception {
        IEval e1 = alg.bindValue(alg.id("x"), alg.lit(1));
        IEval e2 = alg.bindValue(alg.id("y"), alg.lit(2));
        Environment env = (Environment)alg.mapOver(e1, e2).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(1), ((Int)env.val(new Id("x"))).intValue());
        assertEquals(new Integer(2), ((Int)env.val(new Id("y"))).intValue());

        e1 = alg.bindValue(alg.id("x"), alg.lit(1));
        e2 = alg.bindValue(alg.id("x"), alg.lit(2));
        env = (Environment)alg.mapOver(e1, e2).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(1), ((Int)env.val(new Id("x"))).intValue());
    }

    @Test
    public void testMapUpdate() throws Exception {
        IEval mapEval = alg.mapUpdate(alg.environment(), alg.id("foo"), alg.lit(0));
        Environment map = (Environment) mapEval.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(0), ((Int)map.val(new Id("foo"))).intValue());

        mapEval = alg.mapUpdate(mapEval, alg.id("foo"), alg.lit(1));
        map = (Environment) mapEval.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(1), ((Int)map.val(new Id("foo"))).intValue());

        mapEval = alg.mapUpdate(mapEval, alg.id("bar"), alg.lit(2));
        map = (Environment) mapEval.eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Integer(1), ((Int)map.val(new Id("foo"))).intValue());
        assertEquals(new Integer(2), ((Int)map.val(new Id("bar"))).intValue());
    }

    @Test
    public void testMapDomain() throws Exception {
        IEval mapEval = alg.mapUpdate(alg.environment(), alg.id("foo"), alg.lit(0));
        List l = (List)alg.mapDomain(mapEval).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new List(new Id("foo")), l);
    }

    @Test
    public void testMap() throws Exception {
        Map m = (Map)alg.map(alg.id("foo"), alg.lit(0)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Map<>(new Id("foo"), new Int(0)), m);
    }
}