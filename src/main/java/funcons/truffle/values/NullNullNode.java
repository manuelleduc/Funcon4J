package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.Null;

@NodeInfo(description = "Null Null Node")
public class NullNullNode extends FNCExpressionNode {
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return new Null();
    }
}
