package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Binding BoundValue Node")
public class BindingBoundValueNode extends Node implements CLExecuteNode {
    @Child
    private CLExecuteNode id;

    public BindingBoundValueNode(CLExecuteNode id) {
        this.id = id;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return env.get(id.buildAST(env, given));
    }
}
