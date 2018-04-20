package funcons.interpreter.tests.truffle;

import com.oracle.truffle.api.source.Source;
import funcons.truffle.nodes.FNCLanguage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AssignFactoryTest extends AbstractTruffleTest {

    @Test
    public void testAlloc() throws Exception {
//        let n = 1;;
//        n;;

        engine.eval(Source.newBuilder("let foo = 0;; foo;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("0", getAndFlush());

//        assertEquals(
//                lit(0).eval(),
//                scope(
//                        bindValue(id("foo"), alloc(lit(0))),
//                        assignedValue(boundValue(id("foo")))
//                ).eval());
    }

    @Test
    public void testAssign() throws Exception {

        engine.eval(Source.newBuilder("let foo = 0;; let foo = 1;; foo;;").mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        assertEquals("1", getAndFlush());

//        assertEquals(
//                lit(1).eval(),
//                scope(
//                        bindValue(id("foo"), alloc(lit(0))),
//                        seq(
//                                assign(boundValue(id("foo")), lit(1)),
//                                assignedValue(boundValue(id("foo"))))).eval());
    }

    @Test
    public void testAssignedValue() throws Exception {
//        assertEquals(lit(0).eval(), assignedValue(alloc(lit(0))).eval());
    }

    @Test
    public void testAssignedValueIfVar() throws Exception {
//        assertEquals(lit(0).eval(), assignedValueIfVar(alloc(lit(0))).eval());
    }
}