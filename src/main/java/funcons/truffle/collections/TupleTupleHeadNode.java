package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IList;

@NodeInfo(description = "Tuple Tuple Head Node")
public class TupleTupleHeadNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode tupl;

    public TupleTupleHeadNode(FNCExpressionNode tupl) {
        this.tupl = tupl;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return ((IList) tupl.executeGeneric(frame)).get(0);
    }
}
