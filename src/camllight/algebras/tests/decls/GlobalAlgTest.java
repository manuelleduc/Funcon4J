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

        CamlLight.eval("type some_record = {a:int};;");
        assertEquals("", out.toString());
    }
}