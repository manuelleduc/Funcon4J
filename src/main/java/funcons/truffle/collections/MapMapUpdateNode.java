package funcons.truffle.collections;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;


@NodeInfo(description = "Map MapUpdate Node")
public class MapMapUpdateNode extends Node implements FNCExecuteNode {

    @Node.Child
    private FNCExecuteNode map;

    @Node.Child
    private FNCExecuteNode key;

    @Node.Child
    private FNCExecuteNode val;

    public MapMapUpdateNode(FNCExecuteNode map, FNCExecuteNode key, FNCExecuteNode val) {
        this.map = map;
        this.key = key;
        this.val = val;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        final IValue k = key.buildAST();
////        final IValue v = val.buildAST();
////        final IMap m = (IMap) map.buildAST();
////        return m.put(k, v);
//        return this;
//
//    }
}
