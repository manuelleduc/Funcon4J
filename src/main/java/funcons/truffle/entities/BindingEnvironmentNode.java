package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Binding Environment Node")
public class BindingEnvironmentNode extends FNCExpressionNode  {
    ValueFactory vf = ValueFactory.getInstance();

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.mapWriter().done();
    }


    @Override
    public String toString() {
        return "BindingEnvironmentNode{}";
    }
}
