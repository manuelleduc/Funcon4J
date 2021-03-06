package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Float Lit Node")
public class FloatLitNode extends FNCExpressionNode {

    public static final ValueFactory vf = ValueFactory.getInstance();
    private final Double i;

    public FloatLitNode(Double i) {
        super();
        this.i = i;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.real(i);
    }
}
