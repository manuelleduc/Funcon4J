package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IList;

public class VectorVectorSelectNode extends FNCExpressionNode {
    private final FNCExpressionNode vector;
    private final FNCExpressionNode index;

    public VectorVectorSelectNode(FNCExpressionNode vector, FNCExpressionNode index) {
        super();
        this.vector = vector;
        this.index = index;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        IList vectorVal = (IList) vector.executeGeneric(frame);
        return vectorVal.get(((IInteger) index.executeGeneric(frame)).intValue());
    }


}
