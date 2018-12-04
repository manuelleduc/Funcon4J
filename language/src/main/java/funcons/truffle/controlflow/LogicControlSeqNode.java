package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.ExplodeLoop;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "LogicControl Seq Node")
public class LogicControlSeqNode extends FNCExpressionNode {
    @Children
    private final FNCExpressionNode[] c;
//    @Child
//    private FNCExpressionNode t;

    public LogicControlSeqNode(FNCExpressionNode... c) {
//        this.c = c;
        this.c = c;
    }

    @Override
    @ExplodeLoop
    public Object executeGeneric(VirtualFrame frame) {
        Object ret = null;
        for (int i = 0; i < c.length; i++) {
            ret = c[i].executeGeneric(frame);
        }

        return ret;
    }
}
