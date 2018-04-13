package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Supply Given Given Node")
public class SupplyGivenGivenNode extends FNCExpressionNode  {
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return null;
    }
//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return given;
//    }
}
