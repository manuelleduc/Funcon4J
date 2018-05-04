package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Record Field Node")
public class RecordFieldNode extends FNCExpressionNode {
    private final String name;

    private final IValueFactory vf = ValueFactory.getInstance();

    public RecordFieldNode(String name) {
        this.name = name;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.string(name);
    }
}
