package funcons.interpreter.tests.reference;

import funcons.interpreter.AllFactory;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class PrintFactoryTest implements AllFactory {

    @Test
    public void testPrint() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        print(lit(0)).eval();
        assertEquals("0", outContent.toString());
    }
}