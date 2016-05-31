package camllight.algebras.tests.decls;

import camllight.CamlLight;
import camllight.algebras.tests.TestStub;
import org.junit.Test;

import static org.junit.Assert.*;

public class GlobalAlgTest extends TestStub {

    @Test
    public void testDeclNewEnumType() throws Exception {
        CamlLight.eval("type suit = Heart | Diamond | Club | Spade;; Club;;");
        assertEquals("Variant(Tag(Club),NULL)", out.toString());
        out.reset();

        CamlLight.eval("type suit = Heart;; Heart;;");
        assertEquals("Variant(Tag(Heart),NULL)", out.toString());
    }

    @Test
    public void testDeclRecordType() throws Exception {
        CamlLight.eval("type some_record = {a:int , b:float, c:string};;");
        assertEquals("", out.toString());
        out.reset();

        CamlLight.eval("type some_record = {a:int , b:float, mutable c:string};;");
        assertEquals("", out.toString());
        out.reset();

        CamlLight.eval("type some_record = {a:int};;");
        assertEquals("", out.toString());
    }

    @Test
    public void testDeclLabelsAndVariantsWithVarTypes() throws Exception {
        CamlLight.eval("type ('a , 'b) pair = {fst:'a , snd:'b};;");
        assertEquals("", out.toString());
        out.reset();

        CamlLight.eval("type ('a) solo = {fst:'a};;");
        assertEquals("", out.toString());
    }

    @Test
    public void testDeclTypeDefEquals() throws Exception {
        CamlLight.eval("type a == int;;");
        assertEquals("", out.toString());
    }

    @Test
    public void testDeclLabelsAndVariantsMultiple() throws Exception {
        CamlLight.eval("type a == int and b == float;;");
        assertEquals("", out.toString());
        out.reset();

        CamlLight.eval("type foo = {a:int} and ('a) x == float;;");
        assertEquals("", out.toString());
    }
}