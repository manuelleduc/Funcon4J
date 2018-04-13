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
    public void executeVoid(VirtualFrame frame) throws RunTimeFunconException {
        throw new RuntimeException("Not implemented");
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        final IInteger i = (IInteger) index.buildAST();
////        final IList l = (IList) list.buildAST();
////        return l.get(i.intValue());
//        return this;
//    }
}
