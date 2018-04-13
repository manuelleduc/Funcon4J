package funcons.truffle.collections;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "List ProjectList Node")
public class ListProjectListNode extends Node implements FNCExecuteNode {

    @Child
    FNCExpressionNode index;

    @Child
    FNCExpressionNode list;

    public ListProjectListNode(FNCExpressionNode index, FNCExpressionNode list) {
        this.index = index;
        this.list = list;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        final IInteger i = (IInteger) index.buildAST();
////        final IList l = (IList) list.buildAST();
////        return l.get(i.intValue());
//        return this;
//    }
}
