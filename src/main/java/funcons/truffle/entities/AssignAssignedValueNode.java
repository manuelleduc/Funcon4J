package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;


@NodeInfo(description = "Assign AssignedValue Node")
public class AssignAssignedValueNode extends FNCStatementNode {

    @Child
    FNCExpressionNode var;

    public AssignAssignedValueNode(FNCExpressionNode var) {
        this.var = var;
    }

    @Override
    public void executeVoid(VirtualFrame frame) throws RunTimeFunconException {
        throw new RuntimeException("Not Implemented ");
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return ((Variable) var.buildAST()).value();
//    }
}
