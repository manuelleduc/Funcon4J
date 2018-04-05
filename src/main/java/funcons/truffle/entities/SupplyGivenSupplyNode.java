package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(description = "SupplyGiven Supply Node")
public class SupplyGivenSupplyNode extends Node implements FNCExecuteNode {

    @Node.Child
    private FNCExecuteNode exp;

    @Node.Child
    private FNCExecuteNode x;

    public SupplyGivenSupplyNode(FNCExecuteNode exp, FNCExecuteNode x) {
        this.exp = exp;
        this.x = x;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return x.buildAST();
//
//    }
}
