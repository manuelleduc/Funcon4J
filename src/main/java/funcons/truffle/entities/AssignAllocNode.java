package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Assign Alloc Node")
public class AssignAllocNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode x;

    public AssignAllocNode(FNCExpressionNode x) {
        this.x = x;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return x.executeGeneric(frame);
    }
}
