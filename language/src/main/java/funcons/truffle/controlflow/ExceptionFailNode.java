package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.signals.FailureTrue;

@NodeInfo(description = "Exception Fail Node")
public class ExceptionFailNode extends FNCExpressionNode {

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new FailureTrue();
    }
}
