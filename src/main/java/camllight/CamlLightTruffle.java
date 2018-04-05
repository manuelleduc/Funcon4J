package camllight;

import camllight.truffle.nodes.FNCLanguage;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.vm.PolyglotEngine;

import static java.lang.System.in;
import static java.lang.System.out;

public class CamlLightTruffle {

    public static void main(String[] args) {

        final PolyglotEngine engine = PolyglotEngine.newBuilder().setIn(in).setOut(out).build();
        final Source source = Source.newBuilder("").mimeType(FNCLanguage.MIME_TYPE).name("ELT").build();
        final PolyglotEngine.Value result = engine.eval(source);

        engine.dispose();
    }
}