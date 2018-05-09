package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(shortName = "body")
public class FunctionAbsNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode bodyNode;

    public FunctionAbsNode(FNCExpressionNode exp) {
        this.bodyNode = exp;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return bodyNode.executeGeneric(frame);
    }

}
