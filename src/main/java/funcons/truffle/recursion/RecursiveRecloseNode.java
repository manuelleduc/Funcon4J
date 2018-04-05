package funcons.truffle.recursion;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Recursive Reclose Node")
public class RecursiveRecloseNode extends Node implements CLExecuteNode {

    private final BindingAlg<CLExecuteNode> balg;
    private final LogicControlAlg<CLExecuteNode> lalg;
    private final RecursiveAlg<CLExecuteNode> ralg;
    @Node.Child
    private CLExecuteNode map;
    @Node.Child
    private CLExecuteNode decl;

    public RecursiveRecloseNode(CLExecuteNode map, CLExecuteNode decl, BindingAlg<CLExecuteNode> balg, LogicControlAlg<CLExecuteNode> lalg,
                                RecursiveAlg<CLExecuteNode> ralg) {
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
