package funcons.truffle.controlflow;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.values.cl.CLMatchFailureException;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Exception MatchFailure Node")
public class ExceptionMatchFailureNode extends FNCExpressionNode {

    private final IValueFactory vf = ValueFactory.getInstance();

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return new CLMatchFailureException(vf);
    }

}
