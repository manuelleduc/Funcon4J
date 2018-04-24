package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.Variable;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IValue;


@NodeInfo(description = "Assign Alloc Node")
public class AssignAllocNode extends FNCExpressionNode {

    @Child
    FNCExpressionNode x;

    public AssignAllocNode(FNCExpressionNode x) {
        this.x = x;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return x.executeGeneric(frame);
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new Variable(x.buildAST());
//    }
}
