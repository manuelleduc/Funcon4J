package funcons.truffle.entities;

import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.values.NullNullNode;


@NodeInfo(description = "Assign Assign Node")
public class AssignAssignNode extends FNCExpressionNode {
    @Child
    private FNCExpressionNode var;

    @Child
    private FNCExpressionNode x;

    public AssignAssignNode(FNCExpressionNode var, FNCExpressionNode x) {
        this.var = var;
        this.x = x;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final Object name = var.executeGeneric(frame);
        final Object value = x.executeGeneric(frame);
        final FrameSlot frameDescriptor = frame.getFrameDescriptor().findOrAddFrameSlot(name);
        frame.setObject(frameDescriptor, value);
        return new NullNullNode().executeGeneric(frame);
    }

}
