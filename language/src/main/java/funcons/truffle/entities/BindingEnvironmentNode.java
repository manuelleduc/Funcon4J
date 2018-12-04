package funcons.truffle.entities;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Binding Environment Node")
public class BindingEnvironmentNode extends FNCExpressionNode {
    private final IMap vf = ValueFactory.getInstance().mapWriter().done();

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf;
    }

}
