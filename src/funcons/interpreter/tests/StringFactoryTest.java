package funcons.interpreter.tests;

import funcons.entities.Forwards;
import funcons.entities.Store;
import funcons.interpreter.AllFactory;
import funcons.values.Char;
import funcons.values.Environment;
import funcons.values.Null;
import funcons.values.String;
import funcons.values.cl.CLChar;
import funcons.values.cl.CLString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringFactoryTest implements AllFactory {

    @Test
    public void testString() throws Exception {
        String s = (String)string("foo")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new String("foo"), s);
        assertEquals("foo", s.toString());
    }

    @Test
    public void testCamlLightString() throws Exception {
        CLString s = (CLString)camlLightString("foo")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new String("foo"), s);
        assertEquals("foo", s.toString());

        s = (CLString)camlLightString("\\\\ \\\" \\n \\r \\t \\b \\065")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new String("\\ \" \n \r \t \b A"), s);
    }

    @Test
    public void testChar_() throws Exception {
        Char c = (Char)char_('a')
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new Char('a'), c);
    }

    @Test
    public void testCamlLightChar() throws Exception {
        CLChar c = (CLChar)camlLightChar("a")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals(new CLChar("a"), c);

        c = (CLChar)camlLightChar("\\\\")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("\\", c.toString());

        c = (CLChar)camlLightChar("\\`")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("`", c.toString());

        c = (CLChar)camlLightChar("\\n")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("\n", c.toString());

        c = (CLChar)camlLightChar("\\r")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("\r", c.toString());

        c = (CLChar)camlLightChar("\\t")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("\t", c.toString());

        c = (CLChar)camlLightChar("\\b")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("\b", c.toString());

        c = (CLChar)camlLightChar("\\065")
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("A", c.toString());
    }

    @Test
    public void testStringAppend() throws Exception {
        String s = (String)stringAppend(string("foo"), string("bar"))
                .eval(new Environment(), new Forwards(), new Store(), new Null());
        assertEquals("foobar", s.stringValue());
    }
}