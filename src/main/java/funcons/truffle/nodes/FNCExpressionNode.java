package funcons.truffle.nodes;

import com.oracle.truffle.api.dsl.TypeSystemReference;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import io.usethesource.vallang.IBool;
import io.usethesource.vallang.IInteger;

@TypeSystemReference(FNCTypes.class)
@NodeInfo(description = "Abstract expression node")
public abstract class FNCExpressionNode extends FNCStatementNode {
    public abstract Object executeGeneric(VirtualFrame frame);

    @Override
    public void executeVoid(VirtualFrame frame) {
        executeGeneric(frame);
    }

    public IInteger executeIInteger(VirtualFrame frame) throws UnexpectedResultException {
        return FNCTypesGen.expectIInteger(executeGeneric(frame));
    }

    public IBool executeIBool(VirtualFrame frame) throws UnexpectedResultException {
        return FNCTypesGen.expectIBool(executeGeneric(frame));
    }

}
