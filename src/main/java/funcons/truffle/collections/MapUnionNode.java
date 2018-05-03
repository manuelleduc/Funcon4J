package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Map Union Node")
public class MapUnionNode extends FNCExpressionNode {
    private final FNCExpressionNode map1;
    private final FNCExpressionNode map2;

    public MapUnionNode(FNCExpressionNode map1, FNCExpressionNode map2) {
        this.map1 = map1;
        this.map2 = map2;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        Object o = map1.executeGeneric(frame);
        Object o1 = map2.executeGeneric(frame);
        return o1;
    }


}
