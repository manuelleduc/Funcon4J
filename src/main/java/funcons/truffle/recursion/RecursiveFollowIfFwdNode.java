package funcons.truffle.recursion;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.recursion.Fwd;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Recursive FollowIfFwd Node")
public class RecursiveFollowIfFwdNode extends Node implements CLExecuteNode {
    @Child
    private CLExecuteNode fwd;

    public RecursiveFollowIfFwdNode(CLExecuteNode fwd) {
        this.fwd = fwd;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        final IValue v = fwd.buildAST(env, given);
        if (v instanceof Fwd) {
            return ((Fwd) v).follow();
        }
        return v;
    }
}
