package funcons.truffle.nodes;

import camllight.parser.CLLexer;
import camllight.parser.CLParser;
import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import noa.proxy.Recorder;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.IOUtils;

import java.nio.charset.Charset;

@TruffleLanguage.Registration(id = "fnc", name = "FNC", version = "0.12", mimeType = FNCLanguage.MIME_TYPE)
public class FNCLanguage extends TruffleLanguage<FNCContext> {
    public static final String MIME_TYPE = "application/x-fnc";

    @SuppressWarnings({"unchecked", "rawtypes"})
    public <X> X parse(String s, camllight.algebras.AllAlg alg) {
        CLLexer lexer = new CLLexer(new ANTLRInputStream(s));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CLParser parser = new CLParser(tokens);
        parser.setBuilder(alg);
        return (X) parser.prog()._prog;
    }


    @Override
    protected FNCContext createContext(Env env) {
        FNCContext fncContext = new FNCContext(this, env);
        fncContext.initRegistry(this);
        return fncContext;
    }

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        final String program = IOUtils.toString(request.getSource().getInputStream(), Charset.defaultCharset());
        final Recorder builder = parse(program, Recorder.create(camllight.algebras.AllAlg.class));
        final funcons.algebras.AllAlg<FNCExecuteNode> evalAlg = new funcons.truffle.TruffleAllFactory() {
        };
        final camllight.algebras.AllAlg alg = () -> evalAlg;
        final FNCExecuteNode eval = builder.build(alg);
//        final IValue env = importStandardLibrary(ValueFactory.getInstance().mapWriter().done());
//        this.getContextReference().initRegistry(this);

        final FNCExpressionNode clExecuteNode = (FNCExpressionNode) eval.buildAST(this);


        // TODO: write a visitor that register callables with name?

        // useless so far, just to avoir an ugly runtime exception when the execution ends.
        final FNCRootNode rootNode = new FNCMainRootNode(this, clExecuteNode);
//        System.out.println(clExecuteNode);
        return Truffle.getRuntime().createCallTarget(rootNode);
    }

    @Override
    protected boolean isObjectOfLanguage(Object object) {
        return false;
    }


}
