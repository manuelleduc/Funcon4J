package tests.truffle.patts;

import org.junit.Assert;
import org.junit.Test;
import tests.truffle.TestStub;

public class TuplePattAlgTest extends TestStub {

    @Test
    public void testPattTuple1() throws Exception {
        test("match (1) with (1) -> true;;", "true");
    }

    @Test
    public void testPattTuple2() throws Exception {
        test("match (1,2,3,4) with (10,2,3,4) -> true;;", "true");
    }

    @Test
    public void testPattTuple() throws Exception {
        try {
            test("match (1,2,3,4) with (1,2,5,4) -> true;;", "false");
            Assert.fail();
        } catch (Exception ignore) {
        }
    }
}