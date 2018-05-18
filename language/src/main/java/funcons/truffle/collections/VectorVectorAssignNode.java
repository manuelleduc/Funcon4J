package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.entities.AssignAssignNode;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Vector Vector Assign Node")
public class VectorVectorAssignNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode vector;

    @Child
    private FNCExpressionNode index;

    public VectorVectorAssignNode(FNCExpressionNode vector, FNCExpressionNode index) {
        super();
        this.vector = vector;
        this.index = index;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final IList vectorVal = (IList) vector.executeGeneric(frame);
        final IValue var = vectorVal.get(((IInteger) index.executeGeneric(frame)).intValue());
        return new AssignAssignNode(new FNCExpressionNode() {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return var;
            }
        }, new FNCExpressionNode() {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return vectorVal;
            }
        }).executeGeneric(frame);

    }

}
