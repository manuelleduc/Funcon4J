package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.Undefined;


@NodeInfo(description = "Null Undefined Node")
public class NullUndefinedNode extends FNCExpressionNode {
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return new Undefined();
    }
}
