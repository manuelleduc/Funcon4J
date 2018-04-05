package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Int Lit Node")
public class IntLitNode extends Node implements CLExecuteNode {
    private final Integer i;
    ValueFactory vf = ValueFactory.getInstance();

    public IntLitNode(Integer i) {
        this.i = i;
    }
//
//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.integer(i);
//    }
}
