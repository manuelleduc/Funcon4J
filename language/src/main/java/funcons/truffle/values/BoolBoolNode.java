package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IBool;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Bool Bool Node")
public class BoolBoolNode extends FNCExpressionNode {
    private final IBool b;

    private final ValueFactory vf = ValueFactory.getInstance();

    public BoolBoolNode(Boolean b) {
        this.b = vf.bool(b);
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return b;
    }
}
