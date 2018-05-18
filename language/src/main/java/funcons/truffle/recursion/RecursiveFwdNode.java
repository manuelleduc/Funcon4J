package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.recursion.Fwd;

@NodeInfo(description = "Recursive Fwd Node")
public class RecursiveFwdNode extends FNCExpressionNode {
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return new Fwd();
    }

}
