package funcons.truffle.types;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IString;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public class TypeTypeVarNode extends FNCExpressionNode {
    private final IValueFactory vf = ValueFactory.getInstance();

    private final IString name;

    public TypeTypeVarNode(String name) {
        this.name = vf.string(name);
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return name;
    }
}
