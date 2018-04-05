package funcons.truffle.values;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Bool Greater Node ")
public class BoolGreaterNode extends Node implements FNCExecuteNode {

    ValueFactory vf = ValueFactory.getInstance();

    @Node.Child
    private FNCExecuteNode a;

    @Node.Child
    private FNCExecuteNode b;

    public BoolGreaterNode(FNCExecuteNode a, FNCExecuteNode b) {
        this.a = a;
        this.b = b;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        final IValue aVal = a.buildAST();
//        final IValue bVal = b.buildAST();
//        return vf.bool(RascalValueComperator.compare(aVal, bVal) == 1);
//    }
}
