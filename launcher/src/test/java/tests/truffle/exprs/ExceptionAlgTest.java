package tests.truffle.exprs;

import org.junit.Test;
import tests.truffle.TestStub;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ExceptionAlgTest extends TestStub {

    @Test
    public void testTryWithExp() throws Exception {
        test("exception Match_failure of int;; try (match 0 with 1 -> true) with Match_failure _ -> false;;", "false");
        test("exception Foo;; try raise Foo with Foo -> true;;", "true");
        try {
            test("exception Foo and Bar;; try raise Foo with Bar -> true;;");
            assertTrue(false);
        } catch (Exception ignore) {
        }
    }


    @Test
    public void testRaiseExp() throws Exception {
        try {
            test("exception Foo;; raise Foo;;");
            assertTrue(false);
        } catch (Exception e) {
            assertEquals("Variant(\"Foo\",NULL)", e.toString());
        }
    }

    @Test
    public void testRaiseWithArgumentExp() throws Exception {
        try {
            test("exception Foo of int;; raise Foo 3;;");
            assertTrue(false);
        } catch (Exception e) {
            assertEquals("Variant(\"Foo\",3)", e.toString());
        }
    }
}