package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Recursive SetForwards Node")
public class RecursiveSetForwardsNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode idFwdMap;

    public RecursiveSetForwardsNode(FNCExpressionNode idFwdMap) {
        this.idFwdMap = idFwdMap;

    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("Not Implemented");
    }

}
