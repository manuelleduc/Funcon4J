package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IListWriter;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "List IntCloseInterval Node")
public class ListIntCloseIntervalNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode m;

    @Child
    private FNCExpressionNode n;

    private final IValueFactory vf = ValueFactory.getInstance();

    public ListIntCloseIntervalNode(FNCExpressionNode m, FNCExpressionNode n) {
        super();
        this.m = m;
        this.n = n;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        int start = ((IInteger) m.executeGeneric(frame)).intValue();
        int finish = ((IInteger) n.executeGeneric(frame)).intValue();
        final IListWriter lw = vf.listWriter();
        for (int i = start; i <= finish; i++) {
            lw.append(vf.integer(i));
        }
        return lw.done();
    }
}
