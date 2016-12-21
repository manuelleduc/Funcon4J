package camllightnocollections;

import camllight.CamlLight;
import camllightnocollections.parser.CLNoColLexer;
import camllightnocollections.parser.CLNoColParser;
import funcons.carriers.IEval;
import funcons.values.Null;
import funcons.values.signals.FunconException;
import noa.proxy.Recorder;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.rascalmpl.value.IMap;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.persistent.ValueFactory;

public class CamlLightNoCollections {
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static <X> X parse(String s, NoCollectionsAlg alg) {
        CLNoColLexer lexer = new CLNoColLexer(new ANTLRInputStream(s));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CLNoColParser parser = new CLNoColParser(tokens);
        parser.setBuilder(alg);
        return (X) parser.prog()._prog;
    }

    public static IValue eval(String src, NoCollectionsAlg alg) throws FunconException {
        Recorder builder = parse(src, Recorder.create(NoCollectionsAlg.class));
        IEval eval = builder.build(alg);
        IValue env = CamlLight.importStandardLibrary(ValueFactory.getInstance().mapWriter().done());
        return eval.eval((IMap)env, new Null());
    }

    public static void main(String[] args) throws FunconException {
        //eval("let add a b = a + b;; (add 4 5);;", () -> new funcons.interpreter.AllFactory() {} );
        //eval("let rec countdown = fun x -> ((print_int x) ; if x > 0 then countdown (x - 1));; countdown 10;;", () -> new funcons.interpreter.AllFactory() {} );
        //eval("let rec countdown = function x -> ((print_int x) ; if x > 0 then countdown (x - 1));; countdown 10;;", () -> new funcons.interpreter.AllFactory() {} );
        //eval("let rec countdown x = ((print_int x) ; if x > 0 then countdown (x - 1));; countdown 10;;", () -> new funcons.interpreter.AllFactory() {} );
    }
}
