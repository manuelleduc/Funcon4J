package funcons.truffle.functions;

import com.oracle.truffle.api.Assumption;
import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.utilities.CyclicAssumption;
import funcons.truffle.nodes.FNCContext;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCFunction;
import funcons.truffle.nodes.FNCLanguage;

import static com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import static com.oracle.truffle.api.CompilerDirectives.transferToInterpreterAndInvalidate;

@NodeInfo(description = "Function Literal Node ")
public class FunctionLiteralNode extends FNCExpressionNode {
    private final String functionName;
    private final TruffleLanguage.ContextReference<FNCContext> reference;


    private RootCallTarget callTarget;
    private final CyclicAssumption callTargetStable;


    public FunctionLiteralNode(FNCLanguage language, String functionName) {
        this.reference = language.getContextReference();
        this.functionName = functionName;
        this.callTarget = Truffle.getRuntime().createCallTarget(new FNCUndefinedFunctionRootNode(language, functionName));
        this.callTargetStable = new CyclicAssumption(functionName);


    }

    @CompilationFinal
    private FNCFunction cachedFunction;

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

    public void setCallTarget(RootCallTarget callTarget) {
        this.callTarget = callTarget;
        /*
         * We have a new call target. Invalidate all code that speculated that the old call target
         * was stable.
         */
        callTargetStable.invalidate();
    }

    public RootCallTarget getCallTarget() {
        return callTarget;
    }

    public Assumption getCallTargetStable() {
        return callTargetStable.getAssumption();
    }

    public String getFunctionName() {
        return functionName;
    }
}
