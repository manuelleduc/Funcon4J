package funcons.truffle.types;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "TupleType TupleType Node")
public class TupleTypeTupleTypeNode extends FNCExpressionNode {

    public final IList vf = ValueFactory.getInstance().list();

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf;
    }
}
