package funcons.truffle.values;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;


@NodeInfo(description = "Int IntAdd Node")
public class IntIntAddNode extends Node implements FNCExecuteNode {
    @Node.Child
    private FNCExecuteNode a;

    @Node.Child
    private FNCExecuteNode b;

    public IntIntAddNode(FNCExecuteNode a, FNCExecuteNode b) {
        this.a = a;
        this.b = b;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return ((INumber) a.buildAST()).toInteger()
//                .add(((INumber) b.buildAST()).toInteger());
//    }
}
