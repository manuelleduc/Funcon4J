package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Map MapGet Node")
public class MapMapGetNode extends Node implements CLExecuteNode {

    @Node.Child
    private CLExecuteNode map;

    @Node.Child
    private CLExecuteNode key;

    public MapMapGetNode(CLExecuteNode map, CLExecuteNode key) {
        this.map = map;
        this.key = key;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        final IMap m = (IMap) map.buildAST(env, given);
        return m.get((IValue) key.buildAST(env, given));
    }
}
