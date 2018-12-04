package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "LogicControl Seq Node")
public class LogicControlSeqNode extends FNCExpressionNode {
    @Child
    private FNCExpressionNode lhs;
    @Child
    private FNCExpressionNode rhs;

    public LogicControlSeqNode(FNCExpressionNode lhs, FNCExpressionNode rhs) {
        //System.out.println("Seq node build with c=" + c + " and t=" + t);
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        Object o1 = this.lhs.executeGeneric(frame);
        Object o = this.rhs.executeGeneric(frame);
        return o;
    }
}
