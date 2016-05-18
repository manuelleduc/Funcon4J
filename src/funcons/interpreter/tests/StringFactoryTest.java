package funcons.interpreter.tests;

import funcons.algebras.StringAlg;
import funcons.carriers.IEval;
import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.StringFactory;
import funcons.values.Environment;
import funcons.values.Null;
import funcons.values.String;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringFactoryTest {

    private StringAlg<IEval> alg;

    @Before
    public void setUp() throws Exception {
        alg = new StringFactory() {};
    }

    @Test
    public void testString() throws Exception {
        String s = (String)alg.string("foo")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new String("foo"), s);
        assertEquals("foo", s.toString());
    }

    @Test
    public void testCamlLightString() throws Exception {
        String s = (String)alg.camlLightString("foo")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new String("foo"), s);
        assertEquals("foo", s.toString());

        s = (String)alg.camlLightString("\\\\ \\\" \\n \\r \\t \\b \\065")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new String("\\ \" \n \r \t \b A"), s);
    }
}