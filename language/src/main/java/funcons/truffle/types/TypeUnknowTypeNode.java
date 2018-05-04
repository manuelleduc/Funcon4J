package funcons.truffle.types;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;


@NodeInfo(description = "Type UnknowType Node")
public class TypeUnknowTypeNode extends FNCExpressionNode {

    private final ValueFactory vf = ValueFactory.getInstance();

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.string("UnknownType");
    }
}
