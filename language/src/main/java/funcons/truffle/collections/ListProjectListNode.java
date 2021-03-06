package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "List ProjectList Node")
public class ListProjectListNode extends FNCExpressionNode {

    @Child
    FNCExpressionNode index;

    @Child
    FNCExpressionNode list;

    public ListProjectListNode(FNCExpressionNode index, FNCExpressionNode list) {
        this.index = index;
        this.list = list;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("Not implemented");
    }
}
