package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "List ListPrefix Node")
public class ListListPrefixNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode x;

    @Child
    private FNCExpressionNode l;

    public ListListPrefixNode(FNCExpressionNode x, FNCExpressionNode l) {
        this.x = x;
        this.l = l;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final IList list = (IList) l.executeGeneric(frame);
        return list.insert((IValue) x.executeGeneric(frame));
    }
}
