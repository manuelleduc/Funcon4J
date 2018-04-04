package camllight;

import camllight.lib.StandardLibrary;
import camllight.parser.CLLexer;
import camllight.parser.CLParser;
import camllight.truffle.nodes.CLExecuteNode;
import camllight.truffle.nodes.FNCLanguage;
import com.oracle.truffle.api.source.Source;
import com.oracle.truffle.api.vm.PolyglotEngine;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;
import noa.proxy.Recorder;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import static java.lang.System.in;
import static java.lang.System.out;

public class CamlLightTruffle {


    public static void main(String[] args) throws FunconException, IOException {

        PolyglotEngine engine = PolyglotEngine.newBuilder().setIn(in).setOut(out).build();
        Source source = Source.newBuilder("").mimeType(FNCLanguage.MIME_TYPE).name("ELT").build();
        PolyglotEngine.Value result = engine.eval(source);

        engine.dispose();


        // interpret a FunCaml program given as String



//        interpret("1 + \"a\"");
        // run examples found in the examples folder
        //   runExamples();

        // run tests as provided by Mosses
        //runGivenTests();

        // run several performance tests
        //runPerformanceTests();
    }
}