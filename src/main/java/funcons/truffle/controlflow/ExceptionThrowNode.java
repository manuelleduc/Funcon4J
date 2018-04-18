package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.cl.CLMatchFailureException;

@NodeInfo(description = "Exception Thrown Node")
public class ExceptionThrowNode extends FNCExpressionNode {
    @Child
    private FNCExpressionNode s;

    public ExceptionThrowNode(FNCExpressionNode s) {
        this.s = s;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException(((CLMatchFailureException) s.executeGeneric(frame)).getCause());
    }
}
