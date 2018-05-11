package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.values.NullNullNode;
import io.usethesource.vallang.IBool;

@NodeInfo(description = "LogicControl WhileTrue Node")
public class LogicControlWhileTrueNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode e;

    @Child
    private FNCExpressionNode c;

    public LogicControlWhileTrueNode(FNCExpressionNode e, FNCExpressionNode c) {
        this.e = e;
        this.c = c;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        while (((IBool) e.executeGeneric(frame)).getValue()) {
            c.executeGeneric(frame);
        }
        return new NullNullNode().executeGeneric(frame);
    }

}
