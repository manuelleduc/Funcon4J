package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IListWriter;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Map MapDomain Node")
public class MapMapDomainNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode map;

    IValueFactory vf = ValueFactory.getInstance();

    public MapMapDomainNode(FNCExpressionNode map) {
        this.map = map;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final IValue m = (IValue) map.executeGeneric(frame);
        final IListWriter lw = vf.listWriter();
        lw.append(m);
        return lw.done();
    }
}
