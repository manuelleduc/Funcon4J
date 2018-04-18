package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.functions.FunctionAbs;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.recursion.Fwd;

@NodeInfo(description = "Recursive FollowIfFwd Node")
public class RecursiveFollowIfFwdNode extends FNCExpressionNode {
    @Child
    private FNCExpressionNode fwd;

    public RecursiveFollowIfFwdNode(FNCExpressionNode fwd) {
        this.fwd = fwd;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final Object v = fwd.executeGeneric(frame);
        if (v instanceof Fwd) {
            return ((Fwd) v).follow();
        } else if (v instanceof FunctionAbs) {
            return ((FunctionAbs) v).getName();
        }
        return v;
    }

    @Override
    public String toString() {
        return "RecursiveFollowIfFwdNode{" +
                "fwd=" + fwd +
                '}';
    }
}
