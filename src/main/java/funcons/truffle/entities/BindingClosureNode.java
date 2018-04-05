package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Binding Closure Node")
public class BindingClosureNode extends Node
        implements CLExecuteNode {

    @Node.Child
    private CLExecuteNode x;

    @Node.Child
    private CLExecuteNode environment;

    public BindingClosureNode(CLExecuteNode x, CLExecuteNode environment) {
        this.x = x;
        this.environment = environment;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return x.buildAST((IMap) environment.buildAST(env, given), given);
    }
}
