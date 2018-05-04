package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.INumber;

@NodeInfo(description = "Int IntSubstract Node")
public class FloatFloatSubstractNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode a;

    @Child
    private FNCExpressionNode b;

    public FloatFloatSubstractNode(FNCExpressionNode a, FNCExpressionNode b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final INumber na = (INumber) a.executeGeneric(frame);
        final INumber nb = (INumber) b.executeGeneric(frame);
        return na.subtract(nb);
    }

}
