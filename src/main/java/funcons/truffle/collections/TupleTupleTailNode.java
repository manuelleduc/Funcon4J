package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.collections.TruffleTupleFactory;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IList;

@NodeInfo(description = "Tuple Tail Tail Node")
public class TupleTupleTailNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode tupl;

    public TupleTupleTailNode(FNCExpressionNode tupl) {
        this.tupl = tupl;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        IList tupVal = ((IList) tupl.executeGeneric(frame));
        if (tupVal.length() <= 1) {
            return TruffleTupleFactory.vf.list();
        }
        return tupVal.sublist(1, tupVal.length() - 1);
    }
}
