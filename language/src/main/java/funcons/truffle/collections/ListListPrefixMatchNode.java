package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import io.usethesource.vallang.IList;

@NodeInfo(description = "List ListPrefixMatch Node")
public class ListListPrefixMatchNode extends FNCExpressionNode {
    @Child
    private FNCExpressionNode l;

    @Child
    private FNCExpressionNode f;

    @Child
    private FNCExpressionNode g;

    private IList list;

    public ListListPrefixMatchNode(FNCExpressionNode l, FNCExpressionNode f) {
        super();
        this.l = l;
        this.f = f;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        final IList list = (IList) l.executeGeneric(frame);
        this.list = list;
        if (list.length() == 0) {
            return f.executeGeneric(frame);
        }
        return g.executeGeneric(frame);
    }

    public void setG(FNCExpressionNode g) {
        this.g = g;
    }

    public FNCStatementNode buildE1() {
        return new FNCExpressionNode() {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return list.get(0);
            }
        };
    }

    public FNCStatementNode buildE2() {
        return new FNCExpressionNode() {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return list.delete(0);
            }
        };
    }
}
