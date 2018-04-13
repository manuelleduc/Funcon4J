package funcons.truffle.collections;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Vectore VectorAppend Node")
public class VectorVectorAppendNode extends Node implements FNCExecuteNode {

    @Child
    FNCExpressionNode vector1;

    @Child
    FNCExpressionNode vector2;

    public VectorVectorAppendNode(FNCExpressionNode vector1, FNCExpressionNode vector2) {
        this.vector1 = vector1;
        this.vector2 = vector2;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        final IList vector1Val = (IList) vector1.buildAST();
//        final IList vector2Val = (IList) vector2.buildAST();
//        return vector1Val.concat(vector2Val);
//    }
}
