package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "Recursive Fwd Node")
public class RecursiveFwdNode extends FNCStatementNode {
    @Override
    public void executeVoid(VirtualFrame frame) {
        throw new RuntimeException("Not implemented");
    }
}
