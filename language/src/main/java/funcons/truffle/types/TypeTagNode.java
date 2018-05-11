package funcons.truffle.types;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Type Tag Node")
public class TypeTagNode extends FNCExpressionNode {
    private final String name;

    private IValueFactory vf = ValueFactory.getInstance();

    public TypeTagNode(String name) {
        super();
        this.name = name;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.string(name);
    }
}
