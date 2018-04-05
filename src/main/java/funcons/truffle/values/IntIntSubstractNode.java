package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.INumber;

@NodeInfo(description = "Int IntSubstract Node")
public class IntIntSubstractNode extends Node implements CLExecuteNode {

    @Child
    private CLExecuteNode a;

    @Child
    private CLExecuteNode b;

    public IntIntSubstractNode(CLExecuteNode a, CLExecuteNode b) {
        this.a = a;
        this.b = b;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return ((INumber) a.buildAST()).toInteger()
//                .subtract(((INumber) b.buildAST()).toInteger());
//    }
}
