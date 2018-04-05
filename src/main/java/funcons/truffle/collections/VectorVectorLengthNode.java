package funcons.truffle.collections;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Vector VectoreLength Node")
public class VectorVectorLengthNode extends Node implements FNCExecuteNode {

    @Node.Child
    private FNCExecuteNode vector;

    ValueFactory vf = ValueFactory.getInstance();

    public VectorVectorLengthNode(FNCExecuteNode vector) {
        this.vector = vector;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.integer(((IList) vector.buildAST()).length());
//    }
}
