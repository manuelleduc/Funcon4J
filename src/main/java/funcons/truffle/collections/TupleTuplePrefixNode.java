package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.IListWriter;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public class TupleTuplePrefixNode extends FNCExpressionNode {
    private final FNCExpressionNode x;
    private final FNCExpressionNode tup;


    public static final ValueFactory vf = ValueFactory.getInstance();
    public TupleTuplePrefixNode(FNCExpressionNode x, FNCExpressionNode tup) {
        this.x = x;
        this.tup = tup;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final Iterable<IValue> o = (Iterable<IValue>) tup.executeGeneric(frame);
        final IListWriter lw = vf.listWriter();
        lw.appendAll(o);
        lw.append((IValue) x.executeGeneric(frame));
        return lw.done();
    }
}
