package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;

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
    public void executeVoid(VirtualFrame frame) {
        throw new RuntimeException("Not implemented");
    }

}
