package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IBool;

import static com.oracle.truffle.api.nodes.Node.*;

@NodeInfo(description = "Bool Not Node")
public class BoolNotNode extends FNCExpressionNode  {
    @Child
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
