package funcons.truffle.functions;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.functions.CurryAlg;

@NodeInfo(description = "Curry Curry Node")
public class CurryCurryNode extends Node implements FNCExecuteNode {
    @Child
    private FNCExecuteNode a;

    private CurryAlg<FNCExecuteNode> alg;

    public CurryCurryNode(FNCExecuteNode a, CurryAlg<FNCExecuteNode> alg) {
        this.a = a;
        this.alg = alg;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        final CLExecuteNode clExecuteNode = alg.partialApp(a, () -> given);
//        return clExecuteNode.buildAST();
//    }
}
