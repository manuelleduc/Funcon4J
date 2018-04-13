package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;


@NodeInfo(description = "Assign Assign Node")
public class AssignAssignNode extends FNCStatementNode {


    @Child
    FNCExpressionNode var;

    @Child
    FNCExpressionNode x;

    public AssignAssignNode(FNCExpressionNode var, FNCExpressionNode x) {
        this.var = var;
        this.x = x;
    }

    @Override
    public void executeVoid(VirtualFrame frame) throws RunTimeFunconException {
        throw new RuntimeException("Not implemented AssignAssignNode");
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        ((Variable) var.buildAST()).store(x.buildAST());
//        return nalg.null_().buildAST();
//    }
}
