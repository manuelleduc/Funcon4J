package funcons.truffle.entities;

import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;


/**
 * is a declaration funcon used to compute the single-point envi- ronment that maps I to the value of E
 */
@NodeInfo(description = "Binding Bind Value Node")
public class BindingBindValueNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode id;

    @Child
    private FNCExpressionNode exp;

    public BindingBindValueNode(FNCExpressionNode id, FNCExpressionNode exp) {
        this.id = id;
        this.exp = exp;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final Object name = this.id.executeGeneric(frame);
        final Object value = this.exp.executeGeneric(frame);
        final FrameSlot frameDescriptor = frame.getFrameDescriptor().findOrAddFrameSlot(name);
        frame.setObject(frameDescriptor, value);
        return value;
    }

}
