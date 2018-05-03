package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.functions.FNCUndefinedNameException;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCFunction;
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
        if (v instanceof FNCFunction) {
            try {
                return ((FNCFunction) v).getCallTarget().getRootNode().execute(frame);
            } catch (FNCUndefinedNameException e) {
                return null;
            }
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
