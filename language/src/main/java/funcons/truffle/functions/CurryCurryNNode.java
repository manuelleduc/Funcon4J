package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Curry CurryN Node")
public class CurryCurryNNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode n;

    @Child
    private FNCExpressionNode a;

    public CurryCurryNNode(FNCExpressionNode n, FNCExpressionNode a) {
        super();
        this.n = n;
        this.a = a;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        a.executeGeneric(frame);
        return null;
    }

}
