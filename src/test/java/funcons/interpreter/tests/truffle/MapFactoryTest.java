package funcons.interpreter.tests.truffle;

import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapFactoryTest implements AllFactory {

    @Test
    public void testMapUnion() throws Exception {
        IEval mEval1 = map(lit(0), lit(1));
        IEval mEval2 = map(lit(2), lit(3));
        IEval mapEval = mapUnion(mEval1, mEval2);
        assertEquals(lit(1).eval(), mapGet(mapEval, lit(0)).eval());
        assertEquals(lit(3).eval(), mapGet(mapEval, lit(2)).eval());

        mEval1 = map(lit(0), lit(1));
        mEval2 = map(lit(0), lit(2));
        mapEval = mapUnion(mEval1, mEval2);
        assertEquals(lit(2).eval(), mapGet(mapEval, lit(0)).eval());

        /*
        IEval e1 = bindValue(id("x"), lit(1));
        IEval e2 = bindValue(id("y"), lit(2));
        Environment env = (Environment)mapUnion(e1, e2).eval();
        assertEquals(new Integer(1), ((Int)env.val(new Id("x"))).intValue());
        assertEquals(new Integer(2), ((Int)env.val(new Id("y"))).intValue());

        e1 = bindValue(id("x"), lit(1));
        e2 = bindValue(id("x"), lit(2));
        env = (Environment)mapUnion(e1, e2).eval();
        assertEquals(new Integer(2), ((Int)env.val(new Id("x"))).intValue());*/
    }

    @Test
    public void testMapOver() throws Exception {
        IEval mEval1 = map(lit(0), lit(1));
        IEval mEval2 = map(lit(2), lit(3));
        IEval mapEval = mapOver(mEval1, mEval2);
        assertEquals(lit(1).eval(), mapGet(mapEval, lit(0)).eval());
        assertEquals(lit(3).eval(), mapGet(mapEval, lit(2)).eval());

        mEval1 = map(lit(0), lit(1));
        mEval2 = map(lit(0), lit(2));
        mapEval = mapOver(mEval1, mEval2);
        assertEquals(lit(1).eval(), mapGet(mapEval, lit(0)).eval());

        /*
        IEval e1 = bindValue(id("x"), lit(1));
        IEval e2 = bindValue(id("y"), lit(2));
        Environment env = (Environment)mapOver(e1, e2).eval();
        assertEquals(new Integer(1), ((Int)env.val(new Id("x"))).intValue());
        assertEquals(new Integer(2), ((Int)env.val(new Id("y"))).intValue());

        e1 = bindValue(id("x"), lit(1));
        e2 = bindValue(id("x"), lit(2));
        env = (Environment)mapOver(e1, e2).eval();
        assertEquals(new Integer(1), ((Int)env.val(new Id("x"))).intValue());*/
    }

    @Test
    public void testMapUpdate() throws Exception {
        IEval mapEval = mapUpdate(map(lit(0), lit(1)), lit(2), lit(3));
        assertEquals(lit(1).eval(), mapGet(mapEval, lit(0)).eval());
        assertEquals(lit(3).eval(), mapGet(mapEval, lit(2)).eval());

        mapEval = mapUpdate(map(lit(0), lit(1)), lit(0), lit(2));
        assertEquals(lit(2).eval(), mapGet(mapEval, lit(0)).eval());
        /*
        IEval mapEval = mapUpdate(environment(), id("foo"), lit(0));
        Environment map = (Environment) mapEval.eval();
        assertEquals(new Integer(0), ((Int)map.val(new Id("foo"))).intValue());

        mapEval = mapUpdate(mapEval, id("foo"), lit(1));
        map = (Environment) mapEval.eval();
        assertEquals(new Integer(1), ((Int)map.val(new Id("foo"))).intValue());

        mapEval = mapUpdate(mapEval, id("bar"), lit(2));
        map = (Environment) mapEval.eval();
        assertEquals(new Integer(1), ((Int)map.val(new Id("foo"))).intValue());
        assertEquals(new Integer(2), ((Int)map.val(new Id("bar"))).intValue());*/
    }

    @Test
    public void testMapDomain() throws Exception {
        assertEquals(lit(1).eval(), projectList(lit(0), mapDomain(map(lit(1), lit(2)))).eval());

        //IEval mapEval = mapUpdate(environment(), id("foo"), lit(0));
        //List l = (List)mapDomain(mapEval).eval();
        //assertEquals(new List(new Id("foo")), l);
    }

    @Test
    public void testMap() throws Exception {
        assertEquals(lit(1).eval(), mapGet(map(lit(0), lit(1)), lit(0)).eval());
        //Map m = (Map)map(id("foo"), lit(0)).eval();
        //assertEquals(new Map<>(new Id("foo"), new Int(0)), m);
    }

    @Test
    public void testMapGet() throws Exception {
        assertEquals(lit(1).eval(), mapGet(map(lit(0), lit(1)), lit(0)).eval());
    }
}