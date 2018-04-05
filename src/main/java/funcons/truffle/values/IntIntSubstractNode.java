package funcons.truffle.values;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(description = "Int IntSubstract Node")
public class IntIntSubstractNode extends Node implements FNCExecuteNode {

    @Child
    private FNCExecuteNode a;

    @Child
    private FNCExecuteNode b;

    public IntIntSubstractNode(FNCExecuteNode a, FNCExecuteNode b) {
        this.a = a;
        this.b = b;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return ((INumber) a.buildAST()).toInteger()
//                .subtract(((INumber) b.buildAST()).toInteger());
//    }
}
