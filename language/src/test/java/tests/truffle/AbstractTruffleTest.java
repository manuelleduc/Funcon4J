package tests.truffle;

import org.apache.commons.io.output.WriterOutputStream;
import org.graalvm.polyglot.Context;
import org.junit.Before;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;

public abstract class AbstractTruffleTest {


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
}
