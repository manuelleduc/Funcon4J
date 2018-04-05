package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.values.BoolAlg;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IBool;

@NodeInfo(description = "Bool GreaterEqual Node")
public class BoolGreaterEqualNode extends Node implements CLExecuteNode {

    @Child
    private CLExecuteNode a;
    @Child
    private CLExecuteNode b;
    private final BoolAlg<CLExecuteNode> alg;

    public BoolGreaterEqualNode(CLExecuteNode a, CLExecuteNode b, BoolAlg<CLExecuteNode> alg) {
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
