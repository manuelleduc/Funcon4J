package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;


@NodeInfo(description = "Assign Alloc Node")
public class AssignAllocNode extends Node implements FNCExecuteNode {

    @Child
    private FNCExecuteNode x;

    public AssignAllocNode(FNCExecuteNode x) {
        this.x = x;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new Variable(x.buildAST());
//    }
}
