package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Tuple Tuple Prefix Match Node")
public class TupleTuplePrefixMatchNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode p1;

    @Child
    private FNCExpressionNode p2;

    public TupleTuplePrefixMatchNode(FNCExpressionNode p1, FNCExpressionNode p2) {
        super();
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("not implemented");
    }

}
