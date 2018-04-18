package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "Map MapGet Node")
public class MapMapGetNode extends FNCExpressionNode {

    @Child
    FNCExpressionNode map;

    @Child
    FNCExpressionNode key;

    public MapMapGetNode(FNCExpressionNode map, FNCExpressionNode key) {
        this.map = map;
        this.key = key;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("Not implemented");
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        final IMap m = (IMap) map.buildAST();
////        return m.get((IValue) key.buildAST());
//        return this;
//    }
}
