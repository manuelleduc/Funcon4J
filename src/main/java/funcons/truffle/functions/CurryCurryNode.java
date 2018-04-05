package funcons.truffle.functions;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.functions.CurryAlg;
import funcons.values.signals.FunconException;

@NodeInfo(description = "Curry Curry Node")
public class CurryCurryNode extends Node implements CLExecuteNode {
    @Child
    private CLExecuteNode a;

    private CurryAlg<CLExecuteNode> alg;

    public CurryCurryNode(CLExecuteNode a, CurryAlg<CLExecuteNode> alg) {
        this.a = a;
        this.alg = alg;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        final CLExecuteNode clExecuteNode = alg.partialApp(a, () -> given);
//        return clExecuteNode.buildAST();
//    }
}
