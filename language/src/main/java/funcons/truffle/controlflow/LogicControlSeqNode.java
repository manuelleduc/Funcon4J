package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "LogicControl Seq Node")
public class LogicControlSeqNode extends FNCExpressionNode {
    @Child
    private FNCExpressionNode c;
    @Child
    private FNCExpressionNode t;

    public LogicControlSeqNode(FNCExpressionNode c, FNCExpressionNode t) {
        //System.out.println("Seq node build with c=" + c + " and t=" + t);
        this.c = c;
        this.t = t;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        this.c.executeGeneric(frame);
        return this.t.executeGeneric(frame);
    }
}
