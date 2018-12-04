package tests.truffle.patts;

import org.junit.Test;
import tests.truffle.TestStub;

public class RecordPattAlgTest extends TestStub {

    @Test
    public void testRecordPatt1() throws Exception {
        test("let f = function {a = 1} -> true;; f {a = 1};;", "true");
    }

    @Test
    public void testRecordPatt2() throws Exception {
        test("let f = function {a = 1} -> false;; f {a = 1, b = 2};;", "false");
    }

    @Test
    public void testRecordPatt() throws Exception {
        test("let f = function {b = x} -> x;; f {a = 1, b = 2};;", "2");
        test("let f = function {a = 1, b = 2} -> true;; f {a = 1, b = 2};;", "true");
        test("let f = function {a = 1, b = 3} -> true | _ -> false;; f {a = 1, b = 2};;", "false");
    }
}