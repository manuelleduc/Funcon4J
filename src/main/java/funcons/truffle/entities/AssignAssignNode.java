package funcons.truffle.entities;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Assign Assign Node")
public class AssignAssignNode extends Node implements FNCExecuteNode {


    @Child
    FNCExpressionNode var;

    @Child
    FNCExpressionNode x;

    public AssignAssignNode(FNCExpressionNode var, FNCExpressionNode x) {
        this.var = var;
        this.x = x;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        ((Variable) var.buildAST()).store(x.buildAST());
//        return nalg.null_().buildAST();
//    }
}
