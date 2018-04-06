package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.recursion.Fwd;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Recursive FollowIfFwd Node")
public class RecursiveFollowIfFwdNode extends FNCExpressionNode implements FNCExecuteNode {
    @Child
    private FNCExpressionNode fwd;

    public RecursiveFollowIfFwdNode(FNCExpressionNode fwd) {
        this.fwd = fwd;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final IValue v = (IValue) fwd.executeGeneric(frame);
        if (v instanceof Fwd) {
            return ((Fwd) v).follow();
        }
        return v;
    }
}
