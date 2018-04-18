package funcons.interpreter.tests.reference;

import funcons.interpreter.AllFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VectorFactoryTest implements AllFactory {

    @Test
    public void testVector() throws Exception {
        assertEquals(vector().eval(), vector().eval());
    }

    @Test
    public void testVector1() throws Exception {
        assertEquals(lit(3).eval(), vectorSelect(vector(lit(3)), lit(0)).eval());
    }

    @Test
    public void testVectorSelect() throws Exception {
        assertEquals(lit(1).eval(), vectorSelect(vector(lit(1)), lit(0)).eval());
    }

    @Test
    public void testVectorAppend() throws Exception {
        assertEquals(lit(3).eval(), vectorSelect(vectorAppend(vector(lit(2)), vector(lit(3))), lit(1)).eval());
    }

    @Test
    public void testVectorAssign() throws Exception {
        assertEquals(
                bool(true).eval(),
                equal(
                        vector(lit(4)),
                        scope(
                                bindValue(id("foo"), vector(lit(3))),
                                seq(
                                        vectorAssign(boundValue(id("foo")), lit(0), lit(4)),
                                        boundValue(id("foo"))
                                )
                        )
                ).eval()
        );
    }

    @Test
    public void testVectorLength() throws Exception {
        assertEquals(lit(0).eval(), vectorLength(vector()).eval());
        assertEquals(lit(1).eval(), vectorLength(vector(lit(2))).eval());
        assertEquals(lit(2).eval(), vectorLength(vectorAppend(vector(lit(3)), vector(lit(4)))).eval());
    }
}