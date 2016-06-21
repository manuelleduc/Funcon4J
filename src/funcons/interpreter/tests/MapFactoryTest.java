package funcons.interpreter.tests;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.List;
import funcons.values.Map;
import funcons.values.ids.Id;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapFactoryTest implements AllFactory {

    @Test
    public void testMapUnion() throws Exception {
        IEval e1 = bindValue(id("x"), lit(1));
        IEval e2 = bindValue(id("y"), lit(2));
        Environment env = (Environment)mapUnion(e1, e2).eval();
        assertEquals(new Integer(1), ((Int)env.val(new Id("x"))).intValue());
        assertEquals(new Integer(2), ((Int)env.val(new Id("y"))).intValue());

        e1 = bindValue(id("x"), lit(1));
        e2 = bindValue(id("x"), lit(2));
        env = (Environment)mapUnion(e1, e2).eval();
        assertEquals(new Integer(2), ((Int)env.val(new Id("x"))).intValue());
    }

    @Test
    public void testMapOver() throws Exception {
        IEval e1 = bindValue(id("x"), lit(1));
        IEval e2 = bindValue(id("y"), lit(2));
        Environment env = (Environment)mapOver(e1, e2).eval();
        assertEquals(new Integer(1), ((Int)env.val(new Id("x"))).intValue());
        assertEquals(new Integer(2), ((Int)env.val(new Id("y"))).intValue());

        e1 = bindValue(id("x"), lit(1));
        e2 = bindValue(id("x"), lit(2));
        env = (Environment)mapOver(e1, e2).eval();
        assertEquals(new Integer(1), ((Int)env.val(new Id("x"))).intValue());
    }

    @Test
    public void testMapUpdate() throws Exception {
        IEval mapEval = mapUpdate(environment(), id("foo"), lit(0));
        Environment map = (Environment) mapEval.eval();
        assertEquals(new Integer(0), ((Int)map.val(new Id("foo"))).intValue());

        mapEval = mapUpdate(mapEval, id("foo"), lit(1));
        map = (Environment) mapEval.eval();
        assertEquals(new Integer(1), ((Int)map.val(new Id("foo"))).intValue());

        mapEval = mapUpdate(mapEval, id("bar"), lit(2));
        map = (Environment) mapEval.eval();
        assertEquals(new Integer(1), ((Int)map.val(new Id("foo"))).intValue());
        assertEquals(new Integer(2), ((Int)map.val(new Id("bar"))).intValue());
    }

    @Test
    public void testMapDomain() throws Exception {
        IEval mapEval = mapUpdate(environment(), id("foo"), lit(0));
        List l = (List)mapDomain(mapEval).eval();
        assertEquals(new List(new Id("foo")), l);
    }

    @Test
    public void testMap() throws Exception {
        Map m = (Map)map(id("foo"), lit(0)).eval();
        assertEquals(new Map<>(new Id("foo"), new Int(0)), m);
    }
}