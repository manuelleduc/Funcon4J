package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "SupplyGiven Supply Node")
public class SupplyGivenSupplyNode extends funcons.truffle.nodes.FNCStatementNode {

    @Child
    FNCExpressionNode exp;

    @Child
    FNCExpressionNode x;

    public SupplyGivenSupplyNode(FNCExpressionNode exp, FNCExpressionNode x) {
        this.exp = exp;
        this.x = x;
    }

    @Override
    public void executeVoid(VirtualFrame frame) throws funcons.values.signals.RunTimeFunconException {
        throw new RuntimeException("Not implemented");
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return x.buildAST();
//
//    }
}
