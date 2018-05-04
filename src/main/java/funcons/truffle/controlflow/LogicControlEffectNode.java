package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "Logic Control Effect Node")
public class LogicControlEffectNode extends FNCExpressionNode {

    @Child
    private FNCStatementNode e;

    @Child
    private FNCExpressionNode n;

    public LogicControlEffectNode(FNCStatementNode e, FNCExpressionNode n) {
        super();
        this.e = e;
        this.n = n;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        try {
            e.executeVoid(frame);
        } catch (RunTimeFunconException e1) {
            e1.printStackTrace();
        }
        return n.executeGeneric(frame);
    }
}
