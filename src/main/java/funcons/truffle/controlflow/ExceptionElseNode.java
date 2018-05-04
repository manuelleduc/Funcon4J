package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.signals.FailureTrue;

@NodeInfo(description = "Exception Else Node")
public class ExceptionElseNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode x2;

    @Child
    private FNCExpressionNode x1;

    public ExceptionElseNode(FNCExpressionNode x1, FNCExpressionNode x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        try {
            return x1.executeGeneric(frame);
        } catch (FailureTrue f) {
            return x2.executeGeneric(frame);
        }
    }

}
