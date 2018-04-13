package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;


@NodeInfo(description = "Assign Alloc Node")
public class AssignAllocNode extends FNCStatementNode {

    @Child
    FNCExpressionNode x;

    public AssignAllocNode(FNCExpressionNode x) {
        this.x = x;
    }

    @Override
    public void executeVoid(VirtualFrame frame) throws RunTimeFunconException {
        throw new RuntimeException("Not Implemented ");
    }
//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new Variable(x.buildAST());
//    }
}
