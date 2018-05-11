package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "List ProjectList Node")
public class ListProjectListNode extends FNCStatementNode {

    @Child
    FNCExpressionNode index;

    @Child
    FNCExpressionNode list;

    public ListProjectListNode(FNCExpressionNode index, FNCExpressionNode list) {
        this.index = index;
        this.list = list;
    }

    @Override
    public void executeVoid(VirtualFrame frame) {
        throw new RuntimeException("Not implemented");
    }
}
