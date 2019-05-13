package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;

@NodeInfo(description = "LogicControl WhileTrue Node")
public class LogicControlWhileTrueNode extends FNCExpressionNode {

    @Child
    FNCExpressionNode e;

    @Child
    FNCExpressionNode c;

    public LogicControlWhileTrueNode(FNCExpressionNode e, FNCExpressionNode c) {
        this.e = e;
        this.c = c;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        Object tmp = null;
        try {
            while (c.executeIBool(frame).getValue()) {
                tmp = e.executeGeneric(frame);
            }
        } catch (UnexpectedResultException e) {

        }
        return tmp;
    }

}
