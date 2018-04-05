package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;


@NodeInfo(description = "Map MapUpdate Node")
public class MapMapUpdateNode extends Node implements CLExecuteNode {

    @Node.Child
    private CLExecuteNode map;

    @Node.Child
    private CLExecuteNode key;

    @Node.Child
    private CLExecuteNode val;

    public MapMapUpdateNode(CLExecuteNode map, CLExecuteNode key, CLExecuteNode val) {
        this.map = map;
        this.key = key;
        this.val = val;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        final IValue k = key.buildAST(env, given);
        final IValue v = val.buildAST(env, given);
        final IMap m = (IMap) map.buildAST(env, given);
        return m.put(k, v);

    }
}
