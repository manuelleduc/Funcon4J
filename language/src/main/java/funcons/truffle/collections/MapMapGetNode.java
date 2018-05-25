package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Map MapGet Node")
public class MapMapGetNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode map;

    @Child
    private FNCExpressionNode key;

    public MapMapGetNode(FNCExpressionNode map, FNCExpressionNode key) {
        this.map = map;
        this.key = key;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        Object o = map.executeGeneric(frame);
        if (o instanceof IMap) {
            IMap m = (IMap) o;
            return m.get((IValue) key.executeGeneric(frame));
        } else {
            return null;
        }
    }

}
