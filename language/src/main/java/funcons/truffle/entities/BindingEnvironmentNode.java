package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

/**
 * Initializes a new empty environment
 */
@NodeInfo(description = "Binding Environment Node")
public class BindingEnvironmentNode extends FNCExpressionNode {
    private final ValueFactory vf = ValueFactory.getInstance();

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.mapWriter().done();
    }

}
