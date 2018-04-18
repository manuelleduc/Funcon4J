package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Assign AssignedValue Node")
public class AssignAssignedValueNode extends FNCExpressionNode {

    @Child
    FNCExpressionNode var;

    public AssignAssignedValueNode(FNCExpressionNode var) {
        this.var = var;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("Not Implemented ");
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return ((Variable) var.buildAST()).value();
//    }
}
