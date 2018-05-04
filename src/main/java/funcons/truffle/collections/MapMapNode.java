package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IMapWriter;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Map Map Node")
public class MapMapNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode key;

    @Child
    private FNCExpressionNode val;


    private final IValueFactory vf = ValueFactory.getInstance();

    public MapMapNode(FNCExpressionNode key, FNCExpressionNode val) {
        super();
        this.key = key;
        this.val = val;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final IValue k = (IValue) key.executeGeneric(frame);
        final IValue v = (IValue) val.executeGeneric(frame);
        final IMapWriter mw = vf.mapWriter();
        mw.put(k, v);
        return mw.done();
    }
}
