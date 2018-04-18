package funcons.truffle.values;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Bool Bool Node")
public class BoolBoolNode extends FNCExpressionNode {
    private final Boolean b;

    ValueFactory vf = ValueFactory.getInstance();

    public BoolBoolNode(Boolean b) {
        this.b = b;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.bool(b);
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.bool(b);
//    }
}
