package funcons.truffle.collections;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;

@NodeInfo(description = "Map MapOver Node")
public class MapMapOverNode extends Node implements FNCExecuteNode {

    @Node.Child
    private FNCExecuteNode map1;

    @Node.Child
    private FNCExecuteNode map2;

    public MapMapOverNode(FNCExecuteNode map1, FNCExecuteNode map2) {
        this.map1 = map1;
        this.map2 = map2;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        final IMap m1 = (IMap) map1.buildAST();
////        final IMap m2 = (IMap) map2.buildAST();
////        return m2.join(m1);
//
//        return this;
//    }
}
