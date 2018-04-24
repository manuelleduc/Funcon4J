package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

public class LogicControlEffectNode extends FNCExpressionNode {
    private final FNCStatementNode e;
    private final FNCExpressionNode n;

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
