package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IList;


@NodeInfo(description = "Vectore VectorAppend Node")
public class VectorVectorAppendNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode vector1;

    @Child
    private FNCExpressionNode vector2;

    public VectorVectorAppendNode(FNCExpressionNode vector1, FNCExpressionNode vector2) {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final IList vector1Val = (IList) vector1.executeGeneric(frame);
        final IList vector2Val = (IList) vector2.executeGeneric(frame);
        return vector1Val.concat(vector2Val);
    }
}
