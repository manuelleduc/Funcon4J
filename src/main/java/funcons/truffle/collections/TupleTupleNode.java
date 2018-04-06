package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Tuple Tuple Node")
public class TupleTupleNode extends FNCExpressionNode implements FNCExecuteNode {

    ValueFactory vf = ValueFactory.getInstance();

    @Child
    private FNCExpressionNode x1;

    @Child
    private FNCExpressionNode x2;

    public TupleTupleNode(FNCExpressionNode x1, FNCExpressionNode x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return vf.list((IList) x1.executeGeneric(frame), (IList) x2.executeGeneric(frame));
    }

}
