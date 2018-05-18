package funcons.truffle.entities;

import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Binding Scope Node")
public class BindingScopeNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode localBinding;
    @Child
    private FNCExpressionNode exp;

    public BindingScopeNode(FNCExpressionNode localBinding, FNCExpressionNode exp) {
        this.localBinding = localBinding;
        this.exp = exp;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        Object tmp = this.localBinding.executeGeneric(frame);
        return exp.executeGeneric(frame);
    }


}
