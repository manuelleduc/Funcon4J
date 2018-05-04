package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IList;

@NodeInfo(description = "Vector Vector Select Node")
public class VectorVectorSelectNode extends FNCExpressionNode {
    @Child
    private FNCExpressionNode vector;

    @Child
    private FNCExpressionNode index;

    public VectorVectorSelectNode(FNCExpressionNode vector, FNCExpressionNode index) {
        super();
        this.vector = vector;
        this.index = index;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final IList vectorVal = (IList) vector.executeGeneric(frame);
        return vectorVal.get(((IInteger) index.executeGeneric(frame)).intValue());
    }


}
