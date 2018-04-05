package funcons.truffle.collections;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(description = "List ProjectList Node")
public class ListProjectListNode extends Node implements FNCExecuteNode {

    @Node.Child
    private FNCExecuteNode index;

    @Node.Child
    private FNCExecuteNode list;

    public ListProjectListNode(FNCExecuteNode index, FNCExecuteNode list) {
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
