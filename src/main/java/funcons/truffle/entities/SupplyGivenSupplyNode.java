package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;

@NodeInfo(description = "SupplyGiven Supply Node")
public class SupplyGivenSupplyNode extends Node implements CLExecuteNode {

    @Node.Child
    private CLExecuteNode exp;

    @Node.Child
    private CLExecuteNode x;

    public SupplyGivenSupplyNode(CLExecuteNode exp, CLExecuteNode x) {
        this.exp = exp;
        this.x = x;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return x.buildAST();
//
//    }
}
