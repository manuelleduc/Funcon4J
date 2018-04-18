package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Map Union Node")
public class MapUnionNode extends FNCExpressionNode {
    public static final ValueFactory vf = ValueFactory.getInstance();


    private final FNCExpressionNode map1;
    private final FNCExpressionNode map2;

    public MapUnionNode(FNCExpressionNode map1, FNCExpressionNode map2) {
        this.map1 = map1;
        this.map2 = map2;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {

        final IMap m1 = (IMap) map1.executeGeneric(frame);
        final IMap m2 = (IMap) map2.executeGeneric(frame);
        return m1.join(m2);
    }


}
