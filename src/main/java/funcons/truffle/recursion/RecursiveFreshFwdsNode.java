package funcons.truffle.recursion;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;

@NodeInfo(description = "Recursive FreshFwds Node")
public class RecursiveFreshFwdsNode extends Node implements FNCExecuteNode {


    private final BindingAlg<FNCExecuteNode> balg;
    private final ListAlg<FNCExecuteNode> lalg;
    private final NullAlg<FNCExecuteNode> nalg;
    private final IntAlg<FNCExecuteNode> ialg;
    private final RecursiveAlg<FNCExecuteNode> ralg;
    private final MapAlg<FNCExecuteNode> malg;

    @Child
    private FNCExecuteNode idList;

    public RecursiveFreshFwdsNode(FNCExecuteNode idList, BindingAlg<FNCExecuteNode> balg, ListAlg<FNCExecuteNode> lalg,
                                  NullAlg<FNCExecuteNode> nalg, IntAlg<FNCExecuteNode> ialg, RecursiveAlg<FNCExecuteNode> ralg, MapAlg<FNCExecuteNode> malg) {
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
