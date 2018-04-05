package funcons.truffle.collections;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;


@NodeInfo(description = "Vectore VectorAppend Node")
public class VectorVectorAppendNode extends Node implements FNCExecuteNode {

    @Child
    private FNCExecuteNode vector1;

    @Child
    private FNCExecuteNode vector2;

    public VectorVectorAppendNode(FNCExecuteNode vector1, FNCExecuteNode vector2) {
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
