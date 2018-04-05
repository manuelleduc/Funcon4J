package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

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

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return x.buildAST(env, exp.buildAST(env, given));

    }
}
