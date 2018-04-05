package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.INumber;
import io.usethesource.vallang.IValue;

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

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return ((INumber) a.buildAST(env, given)).toInteger()
                .subtract(((INumber) b.buildAST(env, given)).toInteger());
    }
}
