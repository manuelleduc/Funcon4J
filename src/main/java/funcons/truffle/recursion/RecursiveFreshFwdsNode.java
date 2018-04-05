package funcons.truffle.recursion;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.values.recursion.Fwd;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Recursive FreshFwds Node")
public class RecursiveFreshFwdsNode extends Node implements CLExecuteNode {


    private final BindingAlg<CLExecuteNode> balg;
    private final ListAlg<CLExecuteNode> lalg;
    private final NullAlg<CLExecuteNode> nalg;
    private final IntAlg<CLExecuteNode> ialg;
    private final RecursiveAlg<CLExecuteNode> ralg;
    private final MapAlg<CLExecuteNode> malg;

    @Child
    private CLExecuteNode idList;

    public RecursiveFreshFwdsNode(CLExecuteNode idList, BindingAlg<CLExecuteNode> balg, ListAlg<CLExecuteNode> lalg,
                                  NullAlg<CLExecuteNode> nalg, IntAlg<CLExecuteNode> ialg, RecursiveAlg<CLExecuteNode> ralg, MapAlg<CLExecuteNode> malg) {
        this.idList = idList;
        this.balg = balg;
        this.lalg = lalg;
        this.nalg = nalg;
        this.ialg = ialg;
        this.ralg = ralg;
        this.malg = malg;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
////        CLExecuteNode envEval = balg.environment();
////        IValue idListVal = idList.buildAST();
////        int length = ((IInteger) lalg.listLength(() -> idListVal).buildAST()).intValue();
////        IValue undefined = nalg.undefined().buildAST();
////
////        for (int i = 0; i < length; i++) {
////            IValue id = lalg.projectList(ialg.lit(i), () -> idListVal).buildAST();
////            Fwd fwd = (Fwd) ralg.freshFwd().buildAST();
////            fwd.add(undefined);
////
////            envEval = malg.mapUpdate(envEval, () -> id, () -> fwd);
////        }
////
////        return envEval.buildAST();
//        return this;
//    }
}
