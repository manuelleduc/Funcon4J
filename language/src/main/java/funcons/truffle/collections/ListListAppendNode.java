package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IList;

@NodeInfo(description = "List List Append Node")
public class ListListAppendNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode list1;

    @Child
    private FNCExpressionNode list2;

    public ListListAppendNode(FNCExpressionNode list1, FNCExpressionNode list2) {
        super();
        this.list1 = list1;
        this.list2 = list2;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final IList l1 = (IList) list1.executeGeneric(frame);
        final IList l2 = (IList) list2.executeGeneric(frame);
        return l1.concat(l2);
    }
}
