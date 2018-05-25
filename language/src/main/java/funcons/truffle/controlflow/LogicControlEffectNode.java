package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Logic Control Effect Node")
public class LogicControlEffectNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode e;

    @Child
    private FNCExpressionNode n;

    public LogicControlEffectNode(FNCExpressionNode e, FNCExpressionNode n) {
        super();
        this.e = e;
        this.n = n;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        e.executeGeneric(frame);
        return n.executeGeneric(frame);
    }
}
