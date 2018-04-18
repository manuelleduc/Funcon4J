package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IMap;

import java.util.Arrays;

@NodeInfo(description = "Map MapOver Node")
public class MapMapOverNode extends FNCExpressionNode {

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
        System.out.println("executeGeneric[MapMapOverNode] " + this + " frame args : " + Arrays.toString(frame.getArguments()));
        final IMap m1 = (IMap) map1.executeGeneric(frame);
        final IMap m2 = (IMap) map2.executeGeneric(frame);
        return m2.join(m1);
    }

    @Override
    public String toString() {
        return "MapMapOverNode{" +
                "map1=" + map1 +
                ", map2=" + map2 +
                '}';
    }
}
