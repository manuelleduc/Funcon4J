package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.entities.BindingAlg;

@NodeInfo(description = "Binding Accum Node")
public class BindingAccumNode extends FNCExpressionNode implements FNCExecuteNode {

    private final BindingAlg<FNCExecuteNode> balg;
    private final MapAlg<FNCExecuteNode> malg;

    @Child
    private FNCExecuteNode environment;

    @Child
    private FNCExpressionNode decl;

    public BindingAccumNode(FNCExecuteNode environment, FNCExpressionNode decl, BindingAlg<FNCExecuteNode> balg, MapAlg<FNCExecuteNode> malg) {
        this.environment = environment;
        this.decl = decl;
        this.balg = balg;
        this.malg = malg;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        final IValue currentEnv = environment.buildAST();
//        return balg.scope(() -> currentEnv, malg.mapOver(decl, () -> currentEnv)).buildAST();
//
//    }


    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return this.decl.executeGeneric(frame);
    }
}
