package funcons.interpreter.tests;

import funcons.entities.Store;
import funcons.algebras.SeqAlg;
import funcons.interpreter.SeqFactory;
import funcons.carriers.IEval;
import funcons.values.Environment;
import funcons.values.Null;
import funcons.entities.Forwards;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeqFactoryTest {

    private SeqAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new SeqFactory() {};
    }

    @Test
    public void testSeq() throws Exception {
        funcons.values.Int i = (funcons.values.Int)alg.seq(alg.lit(3), alg.lit(2)).eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(i.intValue(), new Integer(2));
    }
}