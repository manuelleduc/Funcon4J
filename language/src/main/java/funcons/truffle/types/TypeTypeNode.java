package funcons.truffle.types;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IString;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Type Type Node")
public class TypeTypeNode extends FNCExpressionNode {
    private final IString name;

    public TypeTypeNode(String name) {
        this.name = ValueFactory.getInstance().string(name);
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return name;
    }
}
