package funcons.interpreter.tests;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import funcons.interpreter.AllFactory;

public class PrintFactoryTest implements AllFactory {

    @Test
    public void testPrint() throws Exception {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        print(lit(0)).eval();
        assertEquals("0", outContent.toString());
    }
}