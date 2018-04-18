package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCFunction;
import funcons.values.recursion.Fwd;
import funcons.values.signals.RunTimeFunconException;

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
        } else if (v instanceof FNCFunction) {
            return ((FNCFunction) v).getName();
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
