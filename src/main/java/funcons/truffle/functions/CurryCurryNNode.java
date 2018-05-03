package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.truffle.nodes.FNCExpressionNode;

public class CurryCurryNNode extends FNCExpressionNode {
    private final FNCExpressionNode n;
    private final FNCExpressionNode a;

    public CurryCurryNNode(FNCExpressionNode n, FNCExpressionNode a) {
        super();
        this.n = n;
        this.a = a;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        Object res = a.executeGeneric(frame);

        return null;
    }

}
