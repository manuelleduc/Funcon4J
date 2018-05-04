package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Map MapDomain Node")
public class MapMapDomainNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode map;

    public MapMapDomainNode(FNCExpressionNode map) {
        this.map = map;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        throw new RuntimeException("executeGeneric not implemented");
    }
}
