package funcons.truffle.entities;

import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "SupplyGiven Supply Node")
public class SupplyGivenSupplyNode extends funcons.truffle.nodes.FNCExpressionNode {

    @Child
    FNCExpressionNode exp;

    @Child
    FNCExpressionNode x;

    public SupplyGivenSupplyNode(FNCExpressionNode exp, FNCExpressionNode x) {
        this.exp = exp;
        this.x = x;

    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final Object res = exp.executeGeneric(frame);
        final FrameSlot given = frame.getFrameDescriptor().findOrAddFrameSlot("given");
        frame.setObject(given, res);
        return x.executeGeneric(frame);
    }

}
