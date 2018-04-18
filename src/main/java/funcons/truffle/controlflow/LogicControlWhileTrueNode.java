package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "LogicControl WhileTrue Node")
public class LogicControlWhileTrueNode extends FNCStatementNode {

    @Child
    FNCExpressionNode e;

    @Child
    FNCExpressionNode c;

    public LogicControlWhileTrueNode(FNCExpressionNode e, FNCExpressionNode c) {
        this.e = e;
        this.c = c;
    }

    @Override
    public void executeVoid(VirtualFrame frame) throws funcons.values.signals.RunTimeFunconException {
        throw new RuntimeException("Not implemented");
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        while (((IBool) e.buildAST()).getValue()) {
//            c.buildAST();
//        }
//        return nalg.null_().buildAST();
//    }
}
