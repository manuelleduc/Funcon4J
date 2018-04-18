package funcons.truffle.auxiliary;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IReal;

@NodeInfo(description = "IntoFloatConversion FloatToInto Node")
public class IntoFloatConversionFloatToIntoNode extends FNCExpressionNode {

    @Child
    FNCExpressionNode f;

    public IntoFloatConversionFloatToIntoNode(FNCExpressionNode f) {
        this.f = f;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return ((IReal) f.executeGeneric(frame)).toInteger();
    }
}
