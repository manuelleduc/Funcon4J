package funcons.interpreter.tests;

import funcons.algebras.AllAlg;
import funcons.carriers.IEval;
import funcons.interpreter.AllFactory;
import org.junit.Before;

public class TestStub {
    protected AllAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new AllFactory() {};
    }
}
