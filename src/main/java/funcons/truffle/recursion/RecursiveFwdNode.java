package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "Recursive Fwd Node")
public class RecursiveFwdNode extends FNCStatementNode {
    @Override
    public void executeVoid(VirtualFrame frame) throws funcons.values.signals.RunTimeFunconException {
        throw new RuntimeException("Not implemented");
    }
//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new Fwd();
//    }
}
