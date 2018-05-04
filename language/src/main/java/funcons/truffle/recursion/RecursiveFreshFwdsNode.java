package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Recursive FreshFwds Node")
public class RecursiveFreshFwdsNode extends FNCExpressionNode {


    @Child
    private FNCExpressionNode idList;

    private long freshCptr = 0;

    public RecursiveFreshFwdsNode(FNCExpressionNode idList) {
        this.idList = idList;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final long current = freshCptr;
        freshCptr = freshCptr + 1;
        return "v" + current;
    }

}
