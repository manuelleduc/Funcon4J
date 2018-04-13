package funcons.truffle.functions;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.truffle.nodes.FNCContext;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;

import static com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import static com.oracle.truffle.api.CompilerDirectives.transferToInterpreterAndInvalidate;

public class FunctionLiteralNode extends FNCExpressionNode {
    private final String functionName;
    private final TruffleLanguage.ContextReference<FNCContext> reference;

    public FunctionLiteralNode(FNCLanguage language, String functionName) {
        this.reference = language.getContextReference();
        this.functionName = functionName;
    }

    @CompilationFinal
    private FunctionAbs cachedFunction;

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        if (cachedFunction == null) {
            transferToInterpreterAndInvalidate();
            /* We are about to change a @CompilationFinal field. */
            transferToInterpreterAndInvalidate();
            /* First execution of the node: lookup the function in the function registry. */
            cachedFunction = reference.get().getFunctionRegistry().lookup(functionName, true);
        }
        return cachedFunction;
    }
}
