package funcons.truffle.values;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.values.BoolAlg;

@NodeInfo(description = "Bool GreaterEqual Node")
public class BoolGreaterEqualNode extends Node implements FNCExecuteNode {

    @Child
    private FNCExecuteNode a;
    @Child
    private FNCExecuteNode b;
    private final BoolAlg<FNCExecuteNode> alg;

    public BoolGreaterEqualNode(FNCExecuteNode a, FNCExecuteNode b, BoolAlg<FNCExecuteNode> alg) {
        this.a = a;
        this.b = b;
        this.alg = alg;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        if (((IBool) alg.greater(a, b).buildAST()).getValue()) {
//            return alg.bool(true).buildAST();
//        }
//        return alg.equal(a, b).buildAST();
//    }
}
