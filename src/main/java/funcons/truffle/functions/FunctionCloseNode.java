package funcons.truffle.functions;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.FunctionAlg;


@NodeInfo(description = "Function Close Node")
public class FunctionCloseNode extends Node implements FNCExecuteNode {
    private final BindingAlg<FNCExecuteNode> alg;
    private final FunctionAlg<FNCExecuteNode> falg;
    @Child
    private FNCExecuteNode abs;

    public FunctionCloseNode(FNCExecuteNode abs, BindingAlg<FNCExecuteNode> alg, FunctionAlg<FNCExecuteNode> falg) {
        this.abs = abs;
        this.alg = alg;

        this.falg = falg;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return falg.abs(alg.closure(
//                ((Abs<CLExecuteNode>) abs.buildAST()).body(),
//                () -> env)).buildAST();
//    }
}
