package funcons.truffle.nodes;

import com.oracle.truffle.api.Assumption;
import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.interop.ForeignAccess;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.nodes.RootNode;
import com.oracle.truffle.api.utilities.CyclicAssumption;

public class FNCFunction implements TruffleObject {
    private RootCallTarget callTarget;
    private CyclicAssumption callTargetStable;

    public FNCFunction(RootNode rootNode) {
        this.callTarget = Truffle.getRuntime().createCallTarget(rootNode);
        this.callTargetStable = new CyclicAssumption(this.getClass().getName()+""+this.hashCode());
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

    public Assumption getCallTargetStable() {
        return callTargetStable.getAssumption();
    }


}
