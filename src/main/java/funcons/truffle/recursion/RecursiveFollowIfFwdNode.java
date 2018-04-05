package funcons.truffle.recursion;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(description = "Recursive FollowIfFwd Node")
public class RecursiveFollowIfFwdNode extends Node implements FNCExecuteNode {
    @Child
    private FNCExecuteNode fwd;

    public RecursiveFollowIfFwdNode(FNCExecuteNode fwd) {
        this.fwd = fwd;
    }
//
//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        final IValue v = fwd.buildAST();
//        if (v instanceof Fwd) {
//            return ((Fwd) v).follow();
//        }
//        return v;
//    }
}
