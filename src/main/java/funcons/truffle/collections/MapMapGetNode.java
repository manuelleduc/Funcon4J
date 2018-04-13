package funcons.truffle.collections;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Map MapGet Node")
public class MapMapGetNode extends Node implements FNCExecuteNode {

    @Child
    FNCExpressionNode map;

    @Child
    FNCExpressionNode key;

    public MapMapGetNode(FNCExpressionNode map, FNCExpressionNode key) {
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
