package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Bool Bool Node")
public class BoolBoolNode extends Node implements CLExecuteNode {
    private final Boolean b;

    ValueFactory vf = ValueFactory.getInstance();

    public BoolBoolNode(Boolean b) {
        this.b = b;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.bool(b);
//    }
}
