package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IList;


@NodeInfo(description = "Tuple Project Node")
public class TupleProjectNode extends FNCExpressionNode  {
    @Child
    private FNCExpressionNode index;

    @Child
    private FNCExpressionNode tup;

    public TupleProjectNode(FNCExpressionNode index, FNCExpressionNode tup) {
        this.index = index;
        this.tup = tup;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final int i = ((IInteger) index.executeGeneric(frame)).intValue();
        final IList iValues = (IList) tup.executeGeneric(frame);
        return iValues.get(i);
    }

}
