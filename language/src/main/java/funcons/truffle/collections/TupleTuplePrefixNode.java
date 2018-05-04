package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IListWriter;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Tuple Tuple Prefix Node")
public class TupleTuplePrefixNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode x;

    @Child
    private FNCExpressionNode tup;


    public static final ValueFactory vf = ValueFactory.getInstance();

    public TupleTuplePrefixNode(FNCExpressionNode x, FNCExpressionNode tup) {
        this.x = x;
        this.tup = tup;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final IListWriter lw = vf.listWriter();
        lw.append((IValue) x.executeGeneric(frame));
        final Iterable<IValue> o = (Iterable<IValue>) tup.executeGeneric(frame);
        lw.appendAll(o);
        return lw.done();
    }
}
