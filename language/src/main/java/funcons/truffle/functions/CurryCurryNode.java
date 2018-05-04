package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "Curry Curry Node")
public class CurryCurryNode extends FNCStatementNode {
    @Child
    FNCExpressionNode a;

    public CurryCurryNode(FNCExpressionNode a) {
        this.a = a;
    }

    @Override
    public void executeVoid(VirtualFrame frame) throws funcons.values.signals.RunTimeFunconException {
        throw new RuntimeException("Not implemented");
    }

}
