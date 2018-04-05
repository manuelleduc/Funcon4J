package funcons.truffle.values;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Bool Bool Node")
public class BoolBoolNode extends Node implements FNCExecuteNode {
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
