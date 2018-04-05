package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IBool;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Bool Not Node")
public class BoolNotNode extends Node implements CLExecuteNode {
    @Node.Child
    private CLExecuteNode b;

    public BoolNotNode(CLExecuteNode b) {
        this.b = b;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return ((IBool) b.buildAST(env, given)).not();
    }
}
