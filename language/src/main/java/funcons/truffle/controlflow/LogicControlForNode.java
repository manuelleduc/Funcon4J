package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IBool;

@NodeInfo(description = "LogicControl For Node")
public class LogicControlForNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode ret;

    @Child
    private FNCExpressionNode cond;

    @Child
    private FNCExpressionNode incr;

    @Child
    private FNCExpressionNode exp;

    public LogicControlForNode(FNCExpressionNode ret, FNCExpressionNode cond, FNCExpressionNode incr, FNCExpressionNode exp) {
        this.ret = ret;
        this.cond = cond;
        this.incr = incr;
        this.exp = exp;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        for (; (((IBool) cond.executeGeneric(frame)).getValue()); incr.executeGeneric(frame)) {
            exp.executeGeneric(frame);
        }
        return ret.executeGeneric(frame);
    }
}
