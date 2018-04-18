package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.signals.FailureTrue;

public class ExceptionFailNode extends FNCExpressionNode {

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new FailureTrue();
    }
}
