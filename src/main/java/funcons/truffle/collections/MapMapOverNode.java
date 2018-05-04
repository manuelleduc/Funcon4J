package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Map MapOver Node")
public class MapMapOverNode extends FNCExpressionNode {


    public static final ValueFactory vf = ValueFactory.getInstance();
    @Child
    private FNCExpressionNode map1;

    @Child
    private FNCExpressionNode map2;

    public MapMapOverNode(FNCExpressionNode map1, FNCExpressionNode map2) {
        this.map1 = map1;
        this.map2 = map2;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        map2.executeGeneric(frame);
        return map1.executeGeneric(frame);
    }

}
