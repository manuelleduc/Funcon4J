package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Exception PrefereOver Node")
public class ExceptionPrefereOverNode extends FNCExpressionNode  {


    @Child
    FNCExpressionNode a1;

    @Child
    FNCExpressionNode a2;

    public ExceptionPrefereOverNode(FNCExpressionNode a1, FNCExpressionNode a2) {
        this.a1 = a1;
        this.a2 = a2;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("executeGeneric not implemented");
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return falg.abs(ealg.else_(
//                ((Abs<CLExecuteNode>) a1.buildAST()).body(),
//                ((Abs<CLExecuteNode>) a2.buildAST()).body()
//        )).buildAST();
//    }
}
