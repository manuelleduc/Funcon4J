package funcons.truffle.entities;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCContext;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import io.usethesource.vallang.IString;

import static com.oracle.truffle.api.CompilerDirectives.CompilationFinal;
import static com.oracle.truffle.api.CompilerDirectives.transferToInterpreterAndInvalidate;

@NodeInfo(description = "Binding BoundValue Node")
public class BindingBoundValueNode extends FNCExpressionNode {
    @Child
    private FNCExpressionNode id;

    private TruffleLanguage.ContextReference<FNCContext> reference;

    @CompilationFinal
    private Object cachedFunction;

    public BindingBoundValueNode(FNCLanguage l, FNCExpressionNode id) {
        this.id = id;
        this.reference = l.getContextReference();
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {

        final String functionName = ((IString) id.executeGeneric(frame)).getValue();

        if (cachedFunction == null) {
            transferToInterpreterAndInvalidate();
            /* We are about to change a @CompilationFinal field. */
            transferToInterpreterAndInvalidate();
            /* First execution of the node: lookup the function in the function registry. */
            cachedFunction = reference.get().getFunctionRegistry().lookup(functionName, true);
        }
        return cachedFunction;
    }

    @Override
    public String toString() {
        return "BindingBoundValueNode{" +
                "id=" + id +
                ", reference=" + reference +
                ", cachedFunction=" + cachedFunction +
                '}';
    }
}
