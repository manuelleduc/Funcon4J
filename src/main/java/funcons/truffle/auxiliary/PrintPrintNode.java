package funcons.truffle.auxiliary;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Print Print Node")
public class PrintPrintNode extends FNCExpressionNode  {

    @Child
    private FNCExpressionNode x;


    public PrintPrintNode(FNCExpressionNode x) {
        this.x = x;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
//        System.out.println(x.executeGeneric(frame));
//        return ((FNCExpressionNode) alg.null_().buildAST()).executeGeneric(frame);
        // FIXME: probably wrong!
        return null;
    }

    @Override
    public String toString() {
        return "PrintPrintNode{" +
                "x=" + x +
                '}';
    }

    //
//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        System.out.println(x.buildAST());
//        return alg.null_().buildAST();
//    }
}
