package funcons.truffle.functions;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.entities.BindingAlg;


@NodeInfo(description = "Function Abs Node 2")
public class FunctionAbsNode2 extends Node implements FNCExecuteNode {

    private final BindingAlg<FNCExecuteNode> alg;

    @Child
    private FNCExecuteNode patt;

    @Child
    private FNCExecuteNode exp;

    public FunctionAbsNode2(FNCExecuteNode patt, FNCExecuteNode exp, BindingAlg<FNCExecuteNode> alg) {
        this.patt = patt;
        this.exp = exp;
        this.alg = alg;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return new Abs<CLExecuteNode>(() -> {
//            @SuppressWarnings("unchecked")
//            CLExecuteNode environment = ((Abs<CLExecuteNode>) patt.buildAST()).body();
//            return alg.scope(environment, exp).buildAST();
//        });
//    }
}
