package funcons.truffle.recursion;

import com.oracle.truffle.api.Assumption;
import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.dsl.*;
import com.oracle.truffle.api.interop.Message;
import com.oracle.truffle.api.interop.TruffleObject;
import com.oracle.truffle.api.nodes.DirectCallNode;
import com.oracle.truffle.api.nodes.IndirectCallNode;
import com.oracle.truffle.api.nodes.Node;
import funcons.truffle.nodes.FNCFunction;
import funcons.truffle.nodes.FNCTypes;

@ReportPolymorphism
@TypeSystemReference(FNCTypes.class)
public abstract class FNCDispatchNode extends Node {

    public static final int INLINE_CACHE_SIZE = 2;

    public abstract Object executeDispatch(Object function, Object[] arguments);

    @Specialization(limit = "INLINE_CACHE_SIZE", //
            guards = "function.getCallTarget() == cachedTarget", //
            assumptions = "callTargetStable")
    @SuppressWarnings("unused")
    protected static Object doDirect(FNCFunction function, Object[] arguments,
                                     @Cached("function.getCallTargetStable()") Assumption callTargetStable,
                                     @Cached("function.getCallTarget()") RootCallTarget cachedTarget,
                                     @Cached("create(cachedTarget)") DirectCallNode callNode) {

        /* Inline cache hit, we are safe to execute the cached call target. */
        return callNode.call(arguments);
    }

    /**
     * Slow-path code for a call, used when the polymorphic inline cache exceeded its maximum size
     * specified in <code>INLINE_CACHE_SIZE</code>. Such calls are not optimized any further, e.g.,
     * no method inlining is performed.
     */
    @Specialization(replaces = "doDirect")
    protected static Object doIndirect(FNCFunction function, Object[] arguments,
                                       @Cached("create()") IndirectCallNode callNode) {
        /*
         * SL has a quite simple call lookup: just ask the function for the current call target, and
         * call it.
         */
        return callNode.call(function.getCallTarget(), arguments);
    }

    /**
     * When no specialization fits, the receiver is not an object (which is a type error).
     */
    @Fallback
    protected Object unknownFunction(Object function, @SuppressWarnings("unused") Object[] arguments) {
        throw new RuntimeException("unknownFunction");
    }

    protected static boolean isForeignFunction(TruffleObject function) {
        return !(function instanceof FNCFunction);
    }

    protected static Node createCrossLanguageCallNode(Object[] arguments) {
        return Message.createExecute(arguments.length).createNode();
    }

}