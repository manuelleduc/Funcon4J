package funcons.truffle.types;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Type TypeVar Node")
public class TypeTypeVarNode extends FNCExpressionNode {
    private final IValueFactory vf = ValueFactory.getInstance();

    private final String name;

    public TypeTypeVarNode(String name) {
        this.name = name;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.string(name);
    }
}
