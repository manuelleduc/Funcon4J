package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "Binding Closure Node")
public class BindingClosureNode extends FNCStatementNode {

    @Child
    FNCExpressionNode x;

    @Child
    FNCExpressionNode environment;

    public BindingClosureNode(FNCExpressionNode x, FNCExpressionNode environment) {
        this.x = x;
        this.environment = environment;
    }

    @Override
    public void executeVoid(VirtualFrame frame) throws funcons.values.signals.RunTimeFunconException {
        throw new RuntimeException("Not Implemented ");
    }
}
