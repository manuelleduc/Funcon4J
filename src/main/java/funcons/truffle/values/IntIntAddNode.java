package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.INumber;


@NodeInfo(description = "Int IntAdd Node")
public class IntIntAddNode extends Node implements CLExecuteNode {
    @Node.Child
    private CLExecuteNode a;

    @Node.Child
    private CLExecuteNode b;

    public IntIntAddNode(CLExecuteNode a, CLExecuteNode b) {
        this.a = a;
        this.b = b;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return ((INumber) a.buildAST()).toInteger()
//                .add(((INumber) b.buildAST()).toInteger());
//    }
}
