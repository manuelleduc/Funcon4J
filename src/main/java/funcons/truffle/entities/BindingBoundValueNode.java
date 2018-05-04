package funcons.truffle.entities;

import com.oracle.truffle.api.TruffleLanguage;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCContext;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;

import static com.oracle.truffle.api.CompilerDirectives.CompilationFinal;

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

        final Object functionName = id.executeGeneric(frame);

        try {
            final FrameDescriptor frameDescriptor = frame.getFrameDescriptor();
            final FrameSlot frameSlot = frameDescriptor.findFrameSlot(functionName);
            if (frameSlot == null)
                return null;
            return frame.getObject(frameSlot);
        } catch (FrameSlotTypeException e) {
            throw new RuntimeException("Identifier " + functionName + " not found", e);
        }
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
