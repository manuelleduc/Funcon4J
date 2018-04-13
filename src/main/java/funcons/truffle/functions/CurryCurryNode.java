package funcons.truffle.functions;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Curry Curry Node")
public class CurryCurryNode extends Node implements FNCExecuteNode {
    @Child
    FNCExpressionNode a;

    public CurryCurryNode(FNCExpressionNode a) {
        this.a = a;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        final CLExecuteNode clExecuteNode = alg.partialApp(a, () -> given);
//        return clExecuteNode.buildAST();
//    }
}
