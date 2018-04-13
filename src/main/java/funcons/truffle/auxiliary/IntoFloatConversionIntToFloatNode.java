package funcons.truffle.auxiliary;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;

@NodeInfo(description = "IntoFloatConversion IntToFloat Node")
public class IntoFloatConversionIntToFloatNode extends FNCExpressionNode {

    @Child
    FNCExpressionNode i;

    public IntoFloatConversionIntToFloatNode(FNCExpressionNode i) {
        this.i = i;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return ((IInteger) i.executeGeneric(frame)).toReal(5);
    }

}
