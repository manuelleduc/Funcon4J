package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;


@NodeInfo(description = "Map MapUpdate Node")
public class MapMapUpdateNode extends FNCExpressionNode {

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
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("Not implemented");
    }

}
