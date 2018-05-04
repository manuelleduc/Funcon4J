package tests.truffle;

import camllight.CamlLight;
import funcons.values.signals.FunconException;
import org.apache.commons.io.output.WriterOutputStream;
import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.junit.Before;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;

import static org.junit.Assert.assertEquals;

public abstract class TestStub {
    protected Context engine;
    private WriterOutputStream os;
    private StringWriter writer;


    @Before
    public void initEngine() throws Exception {
        this.writer = new StringWriter();
        this.os = new WriterOutputStream(writer, Charset.defaultCharset());
        engine = Context.newBuilder().out(os).build();

    }

//    @After
//    public void dispose() {
//        engine.dispose();
//    }

    protected String getAndFlush() throws IOException {
        this.os.flush();
        final String valTrue = this.writer.getBuffer().toString();
        this.writer.getBuffer().replace(0, this.writer.getBuffer().length(), "");
        return valTrue;
    }

    public void test(String input) throws FunconException {
        try {
            engine.eval(Source.newBuilder("fnc", input, "FNC").build());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void test(String input, String expectedOutput) throws FunconException, IOException {
        engine.eval(Source.newBuilder("fnc", input, "FNC").build());
        String res = getAndFlush();
        assertEquals(expectedOutput, res);
    }

    public void testFirstCharOutput(String input, String expectedOutput, int nChar) throws FunconException, IOException {
        engine.eval(Source.newBuilder("fnc", input, "FNC").build());
        CamlLight.eval(input);
        String res = getAndFlush();
        assertEquals(expectedOutput, res.substring(0, nChar));

    }
}
