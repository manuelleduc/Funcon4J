package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Tuple Tuple Node")
public class TupleTupleNode extends Node implements CLExecuteNode {

    ValueFactory vf = ValueFactory.getInstance();


    @Child
    private CLExecuteNode x1;

    @Child
    private CLExecuteNode x2;

    public TupleTupleNode(CLExecuteNode x1, CLExecuteNode x2) {
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
