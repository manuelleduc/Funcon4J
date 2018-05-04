package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.*;


@NodeInfo(description = "Function Close Node")
public class FunctionCloseNode extends FNCExpressionNode  {
    @Child
    FNCExpressionNode abs;

    private final FNCLanguage l;

    public FunctionCloseNode(FNCExpressionNode abs, FNCLanguage l) {
        this.abs = abs;
        this.l = l;

    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return new FNCFunction(new FNCRootNode(l, abs));
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return falg.abs(alg.closure(
//                ((Abs<CLExecuteNode>) abs.buildAST()).body(),
//                () -> env)).buildAST();
//    }
}
