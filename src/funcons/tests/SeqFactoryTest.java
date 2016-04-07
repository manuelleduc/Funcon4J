package funcons.tests;

import funcons.algebras.SeqAlg;
import funcons.interpreter.SeqFactory;
import funcons.sorts.IEval;
import funcons.types.Environment;
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
        funcons.types.Int i = (funcons.types.Int)alg.seq(alg.lit(3), alg.lit(2)).eval(new Environment());
        assertEquals(i.intValue(), new Integer(2));
    }
}