package funcons.truffle.nodes;

import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.interop.ForeignAccess;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.nodes.RootNode;

public class FNCFunction implements TruffleObject {
    private RootCallTarget callTarget;

    public FNCFunction(RootNode rootNode) {
        this.callTarget = Truffle.getRuntime().createCallTarget(rootNode);
    }

    public RootCallTarget getCallTarget() {
        return callTarget;
    }

    @Override
    public ForeignAccess getForeignAccess() {
        throw new RuntimeException("Not Implemented");
    }

    @Override
    public String toString() {
        return "ABS";
    }
}
