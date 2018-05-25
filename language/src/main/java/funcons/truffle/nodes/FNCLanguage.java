package funcons.truffle.nodes;

import camllight.lib.StandardLibrary;
import camllight.parser.CLLexer;
import camllight.parser.CLParser;
import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.TruffleAllFactory;
import funcons.truffle.values.NullNullNode;
import funcons.values.signals.FunconException;
import noa.proxy.Recorder;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.IOUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

@TruffleLanguage.Registration(id = "fnc", name = "fnc   ", version = "0.12", mimeType = FNCLanguage.MIME_TYPE)
public class FNCLanguage extends TruffleLanguage<FNCContext> {
    public static final String MIME_TYPE = "application/x-fnc";

    @SuppressWarnings({"unchecked", "rawtypes"})
    public <X> X parse(String s, camllight.algebras.AllAlg alg) {
        final CLLexer lexer = new CLLexer(new ANTLRInputStream(s));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final CLParser parser = new CLParser(tokens);
        parser.setBuilder(alg);
        return (X) parser.prog()._prog;
    }


    @Override
    protected FNCContext createContext(Env env) {
        final FNCContext fncContext = new FNCContext(this, env);
        fncContext.initRegistry(this);
        return fncContext;
    }

    @Override
    protected CallTarget parse(ParsingRequest request) throws Exception {
        final String program = IOUtils.toString(request.getSource().getInputStream(), Charset.defaultCharset());
        final Recorder builder = parse(program, Recorder.create(camllight.algebras.AllAlg.class));
        final funcons.algebras.AllAlg<FNCBuildAST> evalAlg = new funcons.truffle.TruffleAllFactory() {
        };
        final camllight.algebras.AllAlg alg = () -> evalAlg;
        final FNCBuildAST eval = builder.build(alg);
        final FNCExpressionNode libs = importStandardLibrary();
//        this.getContextReference().initRegistry(this);

        final FNCExpressionNode clExecuteNode = eval.buildAST(this);


        // TODO: write a visitor that register callables with name?

        // useless so far, just to avoir an ugly runtime exception when the execution ends.
        final FNCRootNode rootNode = new FNCMainRootNode(this, clExecuteNode, libs);
//        System.out.println(clExecuteNode);
        return Truffle.getRuntime().createCallTarget(rootNode);
    }

    @Override
    protected boolean isObjectOfLanguage(Object object) {
        return false;
    }


    public FNCExpressionNode importStandardLibrary() throws FunconException {
        final funcons.algebras.AllAlg<FNCBuildAST> alg = new TruffleAllFactory() {
        };
        final StandardLibrary<FNCBuildAST> lib = () -> alg;

        FNCExpressionNode ret = new NullNullNode();
        for (Method m : lib.getClass().getMethods()) {
            java.lang.String methodName = m.getName();
            if (!methodName.endsWith("Fun")) {
                continue;
            }
            methodName = methodName.substring(0, methodName.length() - 3);


            final FNCExpressionNode env2 = ret;
            ret = alg.mapUnion(
                    l -> env2,
                    alg.bindValue(alg.id(methodName), language -> {

                        try {
                            FNCStatementNode abcd = ((FNCBuildAST) m.invoke(lib)).buildAST(language);
                            return new WrapperNode(abcd);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                        return null;
                    })
            ).buildAST(this);

        }

        return ret;
    }


    @NodeInfo(description = "Library Import wrapper")
    public static class WrapperNode extends FNCExpressionNode {
        @Child
        private FNCStatementNode abcd;

        public WrapperNode(FNCStatementNode abcd) {
            this.abcd = abcd;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return abcd;
        }
    }
}
