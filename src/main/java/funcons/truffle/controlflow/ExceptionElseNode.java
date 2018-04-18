package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "Exception Else Node")
public class ExceptionElseNode extends FNCStatementNode {

    @Child
    FNCExpressionNode x2;

    @Child
    FNCExpressionNode x1;

    public ExceptionElseNode(FNCExpressionNode x1, FNCExpressionNode x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public void executeVoid(VirtualFrame frame) throws funcons.values.signals.RunTimeFunconException {
        throw new RuntimeException("Not implemented");
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        try {
//            return x1.buildAST();
//        } catch (FailureTrue f) {
//            return x2.buildAST();
//        }
//    }
}
