package camllight.algebras.tests.truffle;

import camllight.CamlLight;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.vm.PolyglotEngine;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.FunconException;
import org.apache.commons.io.output.WriterOutputStream;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;

import static org.junit.Assert.assertEquals;

public abstract class TestStub {
    protected PolyglotEngine engine;
    private WriterOutputStream os;
    private StringWriter writer;


    @Before
    public void initEngine() throws Exception {
        this.writer = new StringWriter();
        this.os = new WriterOutputStream(writer, Charset.defaultCharset());
        engine = PolyglotEngine.newBuilder().setOut(os).build();

    }

    @After
    public void dispose() {
        engine.dispose();
    }

    protected String getAndFlush() throws IOException {
        this.os.flush();
        final String valTrue = this.writer.getBuffer().toString();
        this.writer.getBuffer().replace(0, this.writer.getBuffer().length(), "");
        return valTrue;
    }

    public void test(String input) throws FunconException {
        engine.eval(Source.newBuilder(input).mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());

    }

    public void test(String input, String expectedOutput) throws FunconException, IOException {
        engine.eval(Source.newBuilder(input).mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        String res = getAndFlush();
        assertEquals(expectedOutput, res);
    }

    public void testFirstCharOutput(String input, String expectedOutput, int nChar) throws FunconException, IOException {
        engine.eval(Source.newBuilder(input).mimeType(FNCLanguage.MIME_TYPE).name("FNC").build());
        CamlLight.eval(input);
        String res = getAndFlush();
        assertEquals(expectedOutput, res.substring(0, nChar));

    }
}
