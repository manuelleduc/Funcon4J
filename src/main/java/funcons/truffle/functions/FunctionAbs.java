package funcons.truffle.functions;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.Assumption;
import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.interop.ForeignAccess;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.utilities.CyclicAssumption;


//@NodeInfo(description = "Function Abs Node")
public class FunctionAbs implements FNCExecuteNode, TruffleObject {


    private RootCallTarget callTarget;
    private final CyclicAssumption callTargetStable;
    private final String name;
    //    @Child
    private FNCExecuteNode exp;

    public FunctionAbs(FNCExecuteNode exp) {
        this.exp = exp;
        this.name = "name";
        this.callTarget = Truffle.getRuntime().createCallTarget(new FNCUndefinedFunctionRootNode(null, name));
        this.callTargetStable = new CyclicAssumption(name);
    }

    public String getName() {
        return name;
    }

    protected void setCallTarget(RootCallTarget callTarget) {
        this.callTarget = callTarget;
        /*
         * We have a new call target. Invalidate all code that speculated that the old call target
         * was stable.
         */
        callTargetStable.invalidate();
    }

    public RootCallTarget getCallTarget() {
        return callTarget;
    }

    public Assumption getCallTargetStable() {
        return callTargetStable.getAssumption();
    }

    /**
     * This method is, e.g., called when using a function literal in a string concatenation. So
     * changing it has an effect on SL programs.
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * In case you want some of your objects to co-operate with other languages, you need to make
     * them implement {@link TruffleObject} and provide additional
     */
    @Override
    public ForeignAccess getForeignAccess() {

        //return ELTFunctionMessageResolutionForeign.ACCESS;
        return null;
    }
}
