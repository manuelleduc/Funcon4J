package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IList;

@NodeInfo(description = "List ListReverse Node")
public class ListListReverseNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode l;

    public ListListReverseNode(FNCExpressionNode l) {
        super();
        this.l = l;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return ((IList) l.executeGeneric(frame)).reverse();
    }
}
