package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Function Abs Node 2")
public class FunctionAbsNode2 extends FNCExpressionNode {

    @Child
    private FNCExpressionNode patt;

    @Child
    private FNCExpressionNode exp;

    public FunctionAbsNode2(FNCExpressionNode patt, FNCExpressionNode exp) {
        this.patt = patt;
        this.exp = exp;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        this.patt.executeGeneric(frame);
        return exp.executeGeneric(frame);
    }

}
