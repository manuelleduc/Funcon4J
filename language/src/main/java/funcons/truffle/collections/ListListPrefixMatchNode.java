package funcons.truffle.collections;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
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
        this.list = (IList) l.executeGeneric(frame);
        if (list.length() == 0) {
            return f.executeGeneric(frame);
        }
        return g.executeGeneric(frame);
    }

    public void setG(FNCExpressionNode g) {
        this.g = g;
    }

    public FNCExpressionNode buildE1() {
        return new ListListPrefixMatchSubnode1();
    }

    public FNCExpressionNode buildE2() {
        return new ListListPrefixMatchSubnode2();
    }

    @NodeInfo(description = "ListListPrefixMatchSubnode1")
    private class ListListPrefixMatchSubnode1 extends FNCExpressionNode {
        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return list.get(0);
        }
    }

    @NodeInfo(description = "ListListPrefixMatchSubnode2")
    private class ListListPrefixMatchSubnode2 extends FNCExpressionNode {
        @Override
        public Object executeGeneric(VirtualFrame frame) {
            return list.delete(0);
        }
    }
}
