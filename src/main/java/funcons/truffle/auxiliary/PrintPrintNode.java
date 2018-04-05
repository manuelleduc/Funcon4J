package funcons.truffle.auxiliary;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.values.NullAlg;


@NodeInfo(description = "Print Print Node")
public class PrintPrintNode extends FNCExpressionNode implements FNCExecuteNode {

    @Child
    private FNCExpressionNode x;

    private NullAlg<FNCExecuteNode> alg;

    public PrintPrintNode(FNCExpressionNode x, NullAlg<FNCExecuteNode> alg) {
        this.x = x;
        this.alg = alg;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        System.out.println(x.executeGeneric(frame));
        return ((FNCExpressionNode) alg.null_().buildAST()).executeGeneric(frame);
    }

    //
//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        System.out.println(x.buildAST());
//        return alg.null_().buildAST();
//    }
}
