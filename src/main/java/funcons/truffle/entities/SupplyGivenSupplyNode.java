package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

import static com.oracle.truffle.api.nodes.Node.*;

@NodeInfo(description = "SupplyGiven Supply Node")
public class SupplyGivenSupplyNode extends Node implements FNCExecuteNode {

    @Child
    FNCExpressionNode exp;

    @Child
    FNCExpressionNode x;

    public SupplyGivenSupplyNode(FNCExpressionNode exp, FNCExpressionNode x) {
        this.exp = exp;
        this.x = x;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return x.buildAST();
//
//    }
}
