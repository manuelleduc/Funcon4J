package funcons.truffle.collections;

import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Map MapUpdate Node")
public class MapMapUpdateNode extends Node implements FNCExecuteNode {

    @Child
    FNCExpressionNode map;

    @Child
    FNCExpressionNode key;

    @Child
    FNCExpressionNode val;

    public MapMapUpdateNode(FNCExpressionNode map, FNCExpressionNode key, FNCExpressionNode val) {
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
