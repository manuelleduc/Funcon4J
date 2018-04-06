package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Function Close Node")
public class FunctionCloseNode extends FNCExpressionNode implements FNCExecuteNode {
    private final BindingAlg<FNCExecuteNode> alg;
    private final FunctionAlg<FNCExecuteNode> falg;
    @Child
    private FNCExecuteNode abs;

    public FunctionCloseNode(FNCExecuteNode abs, BindingAlg<FNCExecuteNode> alg, FunctionAlg<FNCExecuteNode> falg) {
        this.abs = abs;
        this.alg = alg;

        this.falg = falg;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        // TODO ????
        return null;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return falg.abs(alg.closure(
//                ((Abs<CLExecuteNode>) abs.buildAST()).body(),
//                () -> env)).buildAST();
//    }
}
