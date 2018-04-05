package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.helper.RascalValueComperator;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Bool Greater Node ")
public class BoolGreaterNode extends Node implements CLExecuteNode {

    ValueFactory vf = ValueFactory.getInstance();

    @Node.Child
    private CLExecuteNode a;

    @Node.Child
    private CLExecuteNode b;

    public BoolGreaterNode(CLExecuteNode a, CLExecuteNode b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        final IValue aVal = a.buildAST(env, given);
        final IValue bVal = b.buildAST(env, given);
        return vf.bool(RascalValueComperator.compare(aVal, bVal) == 1);
    }
}
