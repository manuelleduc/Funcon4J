package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.fast.ValueFactory;

@NodeInfo(description = "List List Node")
public class ListListNode extends FNCExpressionNode {
    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return ValueFactory.getInstance().list();
    }
}
