package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Vector VectoreLength Node")
public class VectorVectorLengthNode extends FNCExpressionNode {

    @Child
    FNCExpressionNode vector;

    ValueFactory vf = ValueFactory.getInstance();

    public VectorVectorLengthNode(FNCExpressionNode vector) {
        this.vector = vector;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("Not implemented");
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.integer(((IList) vector.buildAST()).length());
//    }
}
