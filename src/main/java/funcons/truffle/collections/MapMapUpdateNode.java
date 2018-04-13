package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;


@NodeInfo(description = "Map MapUpdate Node")
public class MapMapUpdateNode extends FNCStatementNode {

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

    @Override
    public void executeVoid(VirtualFrame frame) throws RunTimeFunconException {
        throw new RuntimeException("Not implemented");
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
