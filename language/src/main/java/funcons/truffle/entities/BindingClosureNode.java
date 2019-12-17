package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Binding Closure Node")
public class BindingClosureNode extends FNCExpressionNode {

    @Child
    FNCExpressionNode x;

    @Child
    FNCExpressionNode environment;

    public BindingClosureNode(FNCExpressionNode x, FNCExpressionNode environment) {
        this.x = x;
        this.environment = environment;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("Not Implemented ");
    }
}
