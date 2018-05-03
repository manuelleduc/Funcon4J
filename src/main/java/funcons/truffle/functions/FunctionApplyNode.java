package funcons.truffle.functions;

import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.FrameDescriptor;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.IndirectCallNode;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCFunction;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCRootNode;
import funcons.values.signals.RunTimeFunconException;

@NodeInfo(description = "Function Apply Node")
public class FunctionApplyNode extends FNCExpressionNode {

    private final FNCLanguage language;
    private final IndirectCallNode callNode;
    @Child
    private FNCExpressionNode functionNode;

    @Child
    private FNCExpressionNode argumentNode;

    @Child
    private FNCDispatchNode dispatchNode;

    public FunctionApplyNode(FNCLanguage language, FNCExpressionNode functionNode, FNCExpressionNode argumentNode) {
        this.functionNode = functionNode;
        this.argumentNode = argumentNode;
        this.callNode = Truffle.getRuntime().createIndirectCallNode();;
        this.language = language;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
//        // (String) functionNode.executeGeneric(frame)
//        Object res = functionNode.executeGeneric(frame);
//        final FunctionLiteralNode function = new FunctionLiteralNode(this.language, "TMP");
//
////        final FunctionLiteralNode child = language.getContextReference().get().getFunctionRegistry().lookupFunctionLiteral(function.getFunctionName());
//        final FrameDescriptor frameDescriptorFact = new FrameDescriptor();
//        final FNCRootNode rootNode = new FNCRootNode(language, frameDescriptorFact, function);
//        function.setCallTarget(Truffle.getRuntime().createCallTarget(rootNode));
//
//        final Object[] argumentValues = new Object[]{argumentNode.executeGeneric(frame)};
//
////        FunctionAbs lookup = l.getContextReference().get().getFunctionRegistry().lookup(name, false);
////        if (lookup == null) {
////            l.getContextReference().get().getFunctionRegistry().register(name, rootNode);
////            return BindingScopeNodeGen.create(child, frameSlot);
////        } else {
////            throw new RuntimeException("TOLOOOO");
//        Object o = dispatchNode.executeDispatch(function, argumentValues);
//        if(o instanceof FNCFunction) {
//            return ((FNCFunction) o).getCallTarget().getRootNode().execute(frame);
//        }
//        return o;
//
//        callNode.call(this.functionNode, new Object[] {
//
//        });

        Object res = functionNode.executeGeneric(frame);

        return argumentNode.executeGeneric(frame);
    }

    @Override
    public String toString() {
        return "FunctionApplyNode{" +
                "functionNode=" + functionNode +
                ", argumentNode=" + argumentNode +
                ", dispatchNode=" + dispatchNode +
                '}';
    }

}
