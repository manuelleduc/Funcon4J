package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Assign Alloc Node")
public class AssignAllocNode extends Node implements FNCExecuteNode {

    @Child
    FNCExpressionNode x;

    public AssignAllocNode(FNCExpressionNode x) {
        this.x = x;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new Variable(x.buildAST());
//    }
}
