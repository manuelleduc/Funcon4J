package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;


@NodeInfo(description = "Tuple Project Node")
public class TupleProjectNode extends FNCExpressionNode {
    @Child
    private FNCExpressionNode index;

    @Child
    private FNCExpressionNode tup;

    public TupleProjectNode(FNCExpressionNode index, FNCExpressionNode tup) {
        this.index = index;
        this.tup = tup;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final int i = ((IInteger) index.executeGeneric(frame)).intValue();
        final TupleTupleNode.Tuple iValues = (TupleTupleNode.Tuple) tup.executeGeneric(frame);
        return iValues.v1[i];
    }

}
