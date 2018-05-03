package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCFunction;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCRootNode;


@NodeInfo(description = "Function Abs Node 2")
public class FunctionAbsNode2 extends FNCExpressionNode {

    @Child
    FNCExpressionNode patt;

    @Child
    FNCExpressionNode exp;

    private final FNCLanguage l;

    public FunctionAbsNode2(FNCExpressionNode patt, FNCExpressionNode exp, FNCLanguage l) {
        this.patt = patt;
        this.exp = exp;
        this.l = l;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        Object pa = this.patt.executeGeneric(frame);
        return exp.executeGeneric(frame);
    }

}
