package funcons.truffle.recursion;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.recursion.RecursiveAlg;

@NodeInfo(description = "Recursive Reclose Node")
public class RecursiveRecloseNode extends Node implements FNCExecuteNode {

    private final BindingAlg<FNCExecuteNode> balg;
    private final LogicControlAlg<FNCExecuteNode> lalg;
    private final RecursiveAlg<FNCExecuteNode> ralg;
    @Node.Child
    private FNCExecuteNode map;
    @Node.Child
    private FNCExecuteNode decl;

    public RecursiveRecloseNode(FNCExecuteNode map, FNCExecuteNode decl, BindingAlg<FNCExecuteNode> balg, LogicControlAlg<FNCExecuteNode> lalg,
                                RecursiveAlg<FNCExecuteNode> ralg) {
        this.map = map;
        this.decl = decl;
        this.balg = balg;
        this.lalg = lalg;
        this.ralg = ralg;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        final IValue m = map.buildAST();
//        return balg.accum(balg.scope(() -> m, decl), lalg.seq(ralg.setForwards(() -> m), balg.environment())).buildAST();
//    }
}
