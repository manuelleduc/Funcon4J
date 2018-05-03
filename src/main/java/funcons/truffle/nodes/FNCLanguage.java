package funcons.truffle.nodes;

import camllight.lib.StandardLibrary;
import camllight.parser.CLLexer;
import camllight.parser.CLParser;
import com.oracle.truffle.api.CallTarget;
import com.oracle.truffle.api.Scope;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.Frame;
import com.oracle.truffle.api.nodes.Node;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IValue;
import noa.proxy.Recorder;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.apache.commons.io.IOUtils;

import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

@TruffleLanguage.Registration(id = "fnc", name = "FNC",
        version = "0.12", mimeType = FNCLanguage.MIME_TYPE)
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
    protected Object getLanguageGlobal(FNCContext context) {
        return null;
    }

    @Override
    protected boolean isObjectOfLanguage(Object object) {
        return false;
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
        final FNCRootNode rootNode = new FNCRootNode(this, clExecuteNode);
//        System.out.println(clExecuteNode);
        return Truffle.getRuntime().createCallTarget(rootNode);
    }

    public IValue importStandardLibrary(IValue env) throws FunconException {
        return importStandardLibrary(env, new HashSet<>());
    }

    public IValue importStandardLibrary(IValue env, Set<String> excludes) throws FunconException {
        funcons.algebras.AllAlg<FNCExecuteNode> alg = new funcons.truffle.TruffleAllFactory() {
        };
        StandardLibrary<FNCExecuteNode> lib = () -> alg;

        for (Method m : lib.getClass().getMethods()) {
            String methodName = m.getName();
            if (!methodName.endsWith("Fun")) {
                continue;
            }
            methodName = methodName.substring(0, methodName.length() - 3);

            if (excludes.contains(methodName)) {
                continue;
            }

//            try {
//                final IValue env2 = env;
////                env = alg.mapUnion(
////                        () -> null,
////                        alg.bindValue(alg.id(methodName), (CLExecuteNode) m.invoke(lib))
////                ).buildAST();
//                env = null;
//            } catch (IllegalAccessException | InvocationTargetException e) {
//                e.printStackTrace();
//            }
        }

        return env;
    }


    @Override
    protected Iterable<Scope> findLocalScopes(FNCContext context, Node node, Frame frame) {
        final FNCLexicalScope scope = FNCLexicalScope.createScope(node);
        return () -> new Iterator<Scope>() {
            private FNCLexicalScope previousScope;
            private FNCLexicalScope nextScope = scope;

            @Override
            public boolean hasNext() {
                if (nextScope == null) {
                    nextScope = previousScope.findParent();
                }
                return nextScope != null;
            }

            @Override
            public Scope next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Scope vscope = Scope.newBuilder(nextScope.getName(), nextScope.getVariables(frame)).node(nextScope.getNode()).arguments(nextScope.getArguments(frame)).build();
                previousScope = nextScope;
                nextScope = null;
                return vscope;
            }
        };
    }

    @Override
    protected Iterable<Scope> findTopScopes(FNCContext context) {
        return context.getTopScopes();
    }

    public static FNCContext getCurrentContext() {
        return getCurrentContext(FNCLanguage.class);
    }

}
