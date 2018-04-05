package funcons.truffle.controlflow;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.functions.FunctionAlg;


@NodeInfo(description = "Exception PrefereOver Node")
public class ExceptionPrefereOverNode extends Node implements FNCExecuteNode {

    private final FunctionAlg<FNCExecuteNode> falg;
    private final ExceptionAlg<FNCExecuteNode> ealg;
    @Node.Child
    private FNCExecuteNode a1;

    @Node.Child
    private FNCExecuteNode a2;

    public ExceptionPrefereOverNode(FNCExecuteNode a1, FNCExecuteNode a2, FunctionAlg<FNCExecuteNode> falg, ExceptionAlg<FNCExecuteNode> ealg) {
        this.a1 = a1;
        this.a2 = a2;
        this.falg = falg;
        this.ealg = ealg;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return falg.abs(ealg.else_(
//                ((Abs<CLExecuteNode>) a1.buildAST()).body(),
//                ((Abs<CLExecuteNode>) a2.buildAST()).body()
//        )).buildAST();
//    }
}
