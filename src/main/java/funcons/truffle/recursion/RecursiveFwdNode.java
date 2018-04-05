package funcons.truffle.recursion;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Null;
import funcons.values.recursion.Fwd;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Recursive Fwd Node")
public class RecursiveFwdNode extends Node implements CLExecuteNode {
    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return new Fwd();
    }
}
