package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Curry Curry Node")
public class CurryCurryNode extends FNCExpressionNode {
    @Child
    FNCExpressionNode a;

    public CurryCurryNode(FNCExpressionNode a) {
        this.a = a;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("Not implemented");
    }


}
