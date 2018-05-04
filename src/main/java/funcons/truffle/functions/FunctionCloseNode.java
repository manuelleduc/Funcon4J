package funcons.truffle.functions;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCFunction;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCRootNode;


@NodeInfo(description = "Function Close Node")
public class FunctionCloseNode extends FNCExpressionNode {
    @Child
    private FNCExpressionNode abs;

    private final FNCLanguage l;

    public FunctionCloseNode(FNCExpressionNode abs, FNCLanguage l) {
        this.abs = abs;
        this.l = l;

    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return new FNCFunction(new FNCRootNode(l, abs));
    }
}
