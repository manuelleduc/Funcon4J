package camllightnosideeffects;

import camllight.CamlLight;
import camllightnosideeffects.parser.CLNoSELexer;
import camllightnosideeffects.parser.CLNoSEParser;
import funcons.carriers.IEval;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import noa.proxy.Recorder;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.rascalmpl.value.IMap;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.persistent.ValueFactory;

import java.util.HashSet;
import java.util.Set;

public class CamlLightNoSideEffects {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static <X> X parse(String s, NoSEAlg alg) {
        CLNoSELexer lexer = new CLNoSELexer(new ANTLRInputStream(s));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CLNoSEParser parser = new CLNoSEParser(tokens);
        parser.setBuilder(alg);
        return (X) parser.prog()._prog;
    }

    public static IValue eval(String src, NoSEAlg alg) throws FunconException {
        Recorder builder = parse(src, Recorder.create(NoSEAlg.class));
        IEval eval = builder.build(alg);
        Set<String> excludes = new HashSet<>();
        excludes.add("ref");
        excludes.add("print_int");
        excludes.add("print_float");
        excludes.add("print_string");
        excludes.add("print_newline");
        excludes.add("vect_length");
        excludes.add("concat_vect");
        excludes.add("make_vect");
        excludes.add("raise");
        IValue env = CamlLight.importStandardLibrary(ValueFactory.getInstance().mapWriter().done(), excludes);
        return eval.eval((IMap)env, new Null());
    }

    public static void main(String[] args) throws FunconException {
        // Testing a program without side effects (printing) is tricky
        // try including (i.e. not excluding) a printing function from above so you can see results ;)
        //eval("print_int 4;;", () -> new funcons.interpreter.AllFactory() {} );
    }
}
