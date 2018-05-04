package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Vector VectoreLength Node")
public class VectorVectorLengthNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode vector;

    private final ValueFactory vf = ValueFactory.getInstance();

    public VectorVectorLengthNode(FNCExpressionNode vector) {
        this.vector = vector;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("Not implemented");
    }
}