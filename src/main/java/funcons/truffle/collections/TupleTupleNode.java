package funcons.truffle.collections;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Tuple Tuple Node")
public class TupleTupleNode extends Node implements FNCExecuteNode {

    ValueFactory vf = ValueFactory.getInstance();


    @Child
    private FNCExecuteNode x1;

    @Child
    private FNCExecuteNode x2;

    public TupleTupleNode(FNCExecuteNode x1, FNCExecuteNode x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.list(
//                x1.buildAST(),
//                x2.buildAST()
//        );
//    }
}
