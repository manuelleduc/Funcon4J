package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.fast.ValueFactory;

@NodeInfo(description = "Tuple Tuple Head Node")
public class TupleTupleHeadNode extends FNCExpressionNode {

    private final IValueFactory vf = ValueFactory.getInstance();

    @Child
    private FNCExpressionNode tupl;

    public TupleTupleHeadNode(FNCExpressionNode tupl) {
        this.tupl = tupl;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        //final IListWriter lw = vf.listWriter();
        final Object o = tupl.executeGeneric(frame);
        //lw.append((IValue) o);
        //return lw.done();
        return o;
    }
}
