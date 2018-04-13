package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

import static com.oracle.truffle.api.nodes.Node.*;


@NodeInfo(description = "Assign AssignedValue Node")
public class AssignAssignedValueNode extends Node implements FNCExecuteNode {

    @Child
    FNCExpressionNode var;

    public AssignAssignedValueNode(FNCExpressionNode var) {
        this.var = var;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return ((Variable) var.buildAST()).value();
//    }
}
