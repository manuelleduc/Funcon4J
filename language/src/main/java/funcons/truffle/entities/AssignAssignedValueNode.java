package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Assign AssignedValue Node")
public class AssignAssignedValueNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode var;

    public AssignAssignedValueNode(FNCExpressionNode var) {
        this.var = var;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return var.executeGeneric(frame);
    }
}
