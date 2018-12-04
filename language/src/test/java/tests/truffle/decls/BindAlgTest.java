package tests.truffle.decls;

import org.junit.Test;
import tests.truffle.TestStub;

public class BindAlgTest extends TestStub {

    @Test
    public void testDecl() throws Exception {
        test("let x = 3;; let y = 4;; x;;", "3");
    }

    @Test
    public void testAndDecl() throws Exception {
        test("let x = 1 and y = 2;; x + y;;", "3");
        test("let x = 3 and y = 4 and z = 5;; x + y + z;;", "12");
    }

    @Test
    public void testDeclBindMono1() throws Exception {
        test("let f = fun 3 -> true in f 3;;", "true");
    }

    @Test
    public void testDeclBindMono2() throws Exception {
        test("let f = fun _ -> true in f 3;;", "true");
    }

    @Test
    public void testDeclBindMono3() throws Exception {
        test("let f = fun x -> x in f 3;;", "3");
    }

    @Test
    public void testDeclBindMonoFunc0() throws Exception {
        test("let f 20 = true in f 20;;", "true");
    }

    @Test
    public void testDeclBindMonoFunc01() throws Exception {
        test("let f 20 30 = true in f 20 30;;", "true");
    }

    @Test
    public void testDeclBindMonoFunc() throws Exception {
        test("let f 20 30 40 = true in (f 20) 30 40;;", "true");

    }

    @Test
    public void testDeclBindMonoFunc2() throws Exception {
        test("let f _ 3 = true in f 1 3;;", "true");
        test("let f x y z = z in f 1 2 3;;", "3");

        try {
            test("let f x y 3 = x in (f 1 2 4);;");
            assert false;
        } catch (Exception ignore) {
        }
    }
}