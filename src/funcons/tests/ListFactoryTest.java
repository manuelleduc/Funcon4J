package funcons.tests;

import funcons.Store;
import funcons.algebras.ListAlg;
import funcons.interpreter.ListFactory;
import funcons.sorts.IEval;
import funcons.types.Environment;
import funcons.types.Int;
import funcons.types.List;
import funcons.types.Null;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ListFactoryTest {

    ListAlg<IEval> alg;

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
}