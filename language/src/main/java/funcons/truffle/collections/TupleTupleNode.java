package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Tuple Tuple Node")
public class TupleTupleNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode x1;

    @Child
    private FNCExpressionNode x2;

    public TupleTupleNode(FNCExpressionNode x1, FNCExpressionNode x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final Object v1 = x1.executeGeneric(frame);
        final Object v2 = x2.executeGeneric(frame);
        return new Tuple(v1, v2);
    }

    public class Tuple {

        public final Object[] v1;

        public Tuple(Object... v1) {
            this.v1 = v1;
        }
    }
}
