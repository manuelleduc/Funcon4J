package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IBool;

@NodeInfo(description = "Bool Not Node")
public class BoolNotNode extends FNCExpressionNode implements FNCExecuteNode {
    @Node.Child
    private FNCExpressionNode b;

    public BoolNotNode(FNCExpressionNode b) {
        this.b = b;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return ((IBool) b.executeGeneric(frame)).not();
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return ((IBool) b.buildAST()).not();
//    }
}
