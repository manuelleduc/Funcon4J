package camllight.algebras.tests.decls;

import camllight.CamlLight;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BindAlgTest {
    private ByteArrayOutputStream out;
    private java.io.PrintStream oldOut;

    @Before
    public void setUp() throws Exception {
        oldOut = System.out;
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(oldOut);
    }

    @Test
    public void testDeclRec() throws Exception {
        CamlLight.eval("let rec power a b = if b = 0 then 1 else a * power a (b - 1) in power 3 4;;");
        assertEquals("81", out.toString());
    }

    @Test
    public void testDecl() throws Exception {
        CamlLight.eval("let x = 3;; x;;");
        assertEquals("3", out.toString());
    }

    @Test
    public void testAndDecl() throws Exception {
        CamlLight.eval("let x = 1 and y = 2;; x + y;;");
        assertEquals("3", out.toString());
        out.reset();

        CamlLight.eval("let x = 3 and y = 4 and z = 5;; x + y + z;;");
        assertEquals("12", out.toString());
    }

    @Test
    public void testDeclBindMono() throws Exception {
        CamlLight.eval("let f = fun 3 -> true in f 3;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("let f = fun _ -> true in f 3;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("let f = fun x -> x in f 3;;");
        assertEquals("3", out.toString());
    }

    @Test
    public void testDeclBindMonoFunc() throws Exception {
        CamlLight.eval("let f 2 3 4 = true in f 2 3 4;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("let f _ 3 = true in f 1 3;;");
        assertEquals("true", out.toString());
        out.reset();

        CamlLight.eval("let f x y z = z in f 1 2 3;;");
        assertEquals("3", out.toString());
    }

    @Test
    public void testVariantDecl() throws Exception {
        // TODO
    }

    @Test
    public void testVariantTypeDecl() throws Exception {
        // TODO
    }
}