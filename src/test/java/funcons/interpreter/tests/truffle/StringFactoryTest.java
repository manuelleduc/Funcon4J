package funcons.interpreter.tests.truffle;

import funcons.interpreter.AllFactory;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class StringFactoryTest implements AllFactory {

    @Test
    public void testString() throws Exception {
        assertEquals(string("foo").eval(), string("foo").eval());
        assertNotEquals(string("bar").eval(), string("foo").eval());
    }

    @Test
    public void testCamlLightString() throws Exception {
        assertEquals(string("foo").eval(), camlLightString("foo").eval());
        assertEquals(string("\\ \" \n \r \t \b A").eval(), camlLightString("\\\\ \\\" \\n \\r \\t \\b \\065").eval());
    }

    @Test
    public void testChar_() throws Exception {
        assertEquals(char_('a').eval(), char_('a').eval());
        assertNotEquals(char_('b').eval(), char_('a').eval());
    }

    @Test
    public void testCamlLightChar() throws Exception {
        assertEquals(camlLightChar("a").eval(), camlLightChar("a").eval());
        assertEquals(char_('\\').eval(), camlLightChar("\\\\").eval());
        assertEquals(char_('`').eval(), camlLightChar("\\`").eval());
        assertEquals(char_('\n').eval(), camlLightChar("\\n").eval());
        assertEquals(char_('\r').eval(), camlLightChar("\\r").eval());
        assertEquals(char_('\t').eval(), camlLightChar("\\t").eval());
        assertEquals(char_('\b').eval(), camlLightChar("\\b").eval());
        assertEquals(char_('A').eval(), camlLightChar("\\065").eval());
    }

    @Test
    public void testStringAppend() throws Exception {
        assertEquals(string("foobar").eval(), stringAppend(string("foo"), string("bar")).eval());
    }
}