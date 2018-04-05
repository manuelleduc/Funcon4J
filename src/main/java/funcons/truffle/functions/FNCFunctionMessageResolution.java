package funcons.truffle.functions;

import com.oracle.truffle.api.interop.CanResolve;
import com.oracle.truffle.api.interop.MessageResolution;
import com.oracle.truffle.api.interop.Resolve;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.nodes.Node;

import static funcons.truffle.nodes.FNCContext.fromForeignValue;


@MessageResolution(receiverType = FunctionAbs.class)
public class FNCFunctionMessageResolution {
    @Resolve(message = "EXECUTE")
    public abstract static class SLForeignFunctionExecuteNode extends Node {

        @Child
        private FNCDispatchNode dispatch = FNCDispatchNodeGen.create();
        @Child
        private FNCTypeToForeignNode toForeign = FNCTypeToForeignNodeGen.create();

        public Object access(FunctionAbs receiver, Object[] arguments) {
            Object[] arr = new Object[arguments.length];
            // Before the arguments can be used by the SLFunction, they need to be converted to SL
            // values.
            for (int i = 0; i < arr.length; i++) {
                arr[i] = fromForeignValue(arguments[i]);
            }
            Object result = dispatch.executeDispatch(receiver, arr);
            return toForeign.executeConvert(result);
        }
    }

    /*
     * An SL function should respond to an IS_EXECUTABLE message with true.
     */
    @Resolve(message = "IS_EXECUTABLE")
    public abstract static class SLForeignIsExecutableNode extends Node {
        public Object access(Object receiver) {
            return receiver instanceof FunctionAbs;
        }
    }

    @CanResolve
    public abstract static class CheckFunction extends Node {

        protected static boolean test(TruffleObject receiver) {
            return receiver instanceof FunctionAbs;
        }
    }
}
