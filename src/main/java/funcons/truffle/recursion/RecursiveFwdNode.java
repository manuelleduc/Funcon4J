package funcons.truffle.recursion;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.recursion.Fwd;
import funcons.values.signals.FunconException;

@NodeInfo(description = "Recursive Fwd Node")
public class RecursiveFwdNode extends Node implements CLExecuteNode {
//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new Fwd();
//    }
}
