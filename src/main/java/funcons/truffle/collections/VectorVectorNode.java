package funcons.truffle.collections;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Vector vector Node")
public class VectorVectorNode extends Node implements FNCExecuteNode {

    ValueFactory vf = ValueFactory.getInstance();

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.list();
//    }
}
