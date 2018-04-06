package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Binding BoundValue Node")
public class BindingBoundValueNode extends FNCExpressionNode implements FNCExecuteNode {
    @Child
    private FNCExpressionNode id;

    public BindingBoundValueNode(FNCExpressionNode id) {
        this.id = id;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        // TODO find bound variable
        return null;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return env.get(id.buildAST());
//    }
}
