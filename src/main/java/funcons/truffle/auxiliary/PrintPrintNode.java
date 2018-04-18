package funcons.truffle.auxiliary;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.values.NullNullNode;
import funcons.values.Null;
import funcons.values.signals.RunTimeFunconException;


@NodeInfo(description = "Print Print Node")
public class PrintPrintNode extends FNCExpressionNode  {

    @Child
    private FNCExpressionNode x;


    public PrintPrintNode(FNCExpressionNode x) {
        this.x = x;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        System.out.println(x.executeGeneric(frame));
        return  new NullNullNode().executeGeneric(frame);
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
