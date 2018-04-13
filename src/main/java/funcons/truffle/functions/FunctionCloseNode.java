package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Function Close Node")
public class FunctionCloseNode extends FNCExpressionNode  {
    @Child
    FNCExpressionNode abs;

    public FunctionCloseNode(FNCExpressionNode abs) {
        this.abs = abs;
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
