package funcons.truffle.collections;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(description = "Map MapGet Node")
public class MapMapGetNode extends Node implements FNCExecuteNode {

    @Node.Child
    private FNCExecuteNode map;

    @Node.Child
    private FNCExecuteNode key;

    public MapMapGetNode(FNCExecuteNode map, FNCExecuteNode key) {
        this.map = map;
        this.key = key;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        final IMap m = (IMap) map.buildAST();
////        return m.get((IValue) key.buildAST());
//        return this;
//    }
}
