package funcons.tests;

import funcons.Store;
import funcons.algebras.ListAlg;
import funcons.interpreter.ListFactory;
import funcons.sorts.IEval;
import funcons.types.*;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ListFactoryTest {

    private ListAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new ListFactory() {};
    }

    @Test
    public void testList() throws Exception {
        List l = (List)alg.list().eval(new Environment(), new Store(), new Null());
        assertEquals(l, new List());
        l = (List)alg.list(alg.lit(0)).eval(new Environment(), new Store(), new Null());
        assertEquals(l, new List(new Int(0)));
        l = (List)alg.list(alg.lit(0), alg.lit(1)).eval(new Environment(), new Store(), new Null());
        assertEquals(l, new List(new Int(0), new Int(1)));
    }

    @Test
    public void testListPrefix() throws Exception {
        List l = (List)alg.listPrefix(alg.lit(0), alg.list(alg.lit(1))).eval(new Environment(), new Store(), new Null());
        assertEquals(l, new List(new Int(0), new Int(1)));
    }

    @Test
    public void testApplyToEach() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        IEval printList = alg.applyToEach(alg.abs(alg.print(alg.given())), alg.list(alg.lit(0), alg.lit(1)));
        printList.eval(new Environment(), new Store(), new Null());
        assertEquals("01", outContent.toString());
    }

    @Test
    public void testListPrefixMatch() throws Exception {
        IEval onlyZero = alg.abs(alg.seq(alg.match(alg.given(), alg.only(alg.lit(0))), alg.bindValue(alg.id("x"), alg.lit(5))));
        IEval anything = alg.abs(alg.seq(alg.match(alg.given(), alg.any()), alg.bindValue(alg.id("y"), alg.lit(6))));
        Environment env = (Environment)alg.listPrefixMatch(alg.list(alg.lit(0), alg.lit(1)), onlyZero, anything)
                .eval(new Environment(), new Store(), new Null());
        assertEquals(new Integer(5), ((Int)env.val(new Id("x"))).intValue());
        assertEquals(new Integer(6), ((Int)env.val(new Id("y"))).intValue());

        IEval shouldFail = alg.listPrefixMatch(alg.list(alg.lit(9), alg.lit(1)), onlyZero, anything);
        Bool b = (Bool)alg.catch_(shouldFail, alg.abs(alg.bool(true))).eval(new Environment(), new Store(), new Null());
        assertTrue(b.boolValue());
    }

    @Test
    public void testIntClosedInterval() throws Exception {
        List l = (List)alg.intClosedInterval(alg.lit(0), alg.lit(1)).eval(new Environment(), new Store(), new Null());
        assertEquals(new List(new Int(0), new Int(1)), l);
    }
}