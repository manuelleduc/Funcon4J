package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Int Lit Node")
public class IntLitNode extends FNCExpressionNode {
    private final Integer i;
    private final ValueFactory vf = ValueFactory.getInstance();

    public IntLitNode(Integer i) {
        this.i = i;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.integer(i);
    }
}
