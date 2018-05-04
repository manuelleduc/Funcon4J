package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Tuple Tuple Node0")
public class TupleTupleNode0 extends FNCExpressionNode {

    private final ValueFactory vf = ValueFactory.getInstance();

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.tuple();
    }
}
