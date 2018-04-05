package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.Null;
import funcons.values.Undefined;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;


@NodeInfo(description = "Null Undefined Node")
public class NullUndefinedNode extends Node implements CLExecuteNode {
    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return new Undefined();
    }
}
