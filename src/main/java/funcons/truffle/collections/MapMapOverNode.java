package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;

@NodeInfo(description = "Map MapOver Node")
public class MapMapOverNode extends Node implements CLExecuteNode {

    @Node.Child
    private CLExecuteNode map1;

    @Node.Child
    private CLExecuteNode map2;

    public MapMapOverNode(CLExecuteNode map1, CLExecuteNode map2) {
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
