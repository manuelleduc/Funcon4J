package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Vector vector Node")
public class VectorVectorNode extends Node implements CLExecuteNode {

    ValueFactory vf = ValueFactory.getInstance();

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.list();
//    }
}
