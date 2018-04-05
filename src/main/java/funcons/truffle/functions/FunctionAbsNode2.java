package funcons.truffle.functions;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.entities.BindingAlg;
import funcons.values.Abs;
import funcons.values.signals.FunconException;


@NodeInfo(description = "Function Abs Node 2")
public class FunctionAbsNode2 extends Node implements CLExecuteNode {

    private final BindingAlg<CLExecuteNode> alg;

    @Child
    private CLExecuteNode patt;

    @Child
    private CLExecuteNode exp;

    public FunctionAbsNode2(CLExecuteNode patt, CLExecuteNode exp, BindingAlg<CLExecuteNode> alg) {
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
