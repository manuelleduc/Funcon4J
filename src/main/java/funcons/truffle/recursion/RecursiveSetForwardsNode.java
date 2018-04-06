package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Recursive SetForwards Node")
public class RecursiveSetForwardsNode extends FNCExpressionNode implements FNCExecuteNode {

    private final MapAlg<FNCExecuteNode> malg;
    private final ListAlg<FNCExecuteNode> lalg;
    private final IntAlg<FNCExecuteNode> ialg;
    private final BindingAlg<FNCExecuteNode> balg;
    private final NullAlg<FNCExecuteNode> nalg;
    @Child
    private FNCExpressionNode idFwdMap;

    public RecursiveSetForwardsNode(FNCExpressionNode idFwdMap, MapAlg<FNCExecuteNode> malg,
                                    ListAlg<FNCExecuteNode> lalg, IntAlg<FNCExecuteNode> ialg,
                                    BindingAlg<FNCExecuteNode> balg,

                                    NullAlg<FNCExecuteNode> nalg) {
        this.idFwdMap = idFwdMap;
        this.malg = malg;
        this.lalg = lalg;
        this.ialg = ialg;
        this.balg = balg;
        this.nalg = nalg;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
//        IValue mapVal = (IValue) idFwdMap.executeGeneric(frame);
//        IValue mapKeys = malg.mapDomain(() -> mapVal).buildAST();
//        int length = ((IInteger) lalg.listLength(() -> mapKeys).buildAST()).intValue();
//
//        for (int i = 0; i < length; i++) {
//            IValue id = lalg.projectList(ialg.lit(i), () -> mapKeys).buildAST();
//            IValue v = balg.boundValue(() -> id).buildAST();
//            if (v == null) {
//                v = nalg.undefined().buildAST();
//            }
//            Fwd fwd = (Fwd) malg.mapGet(() -> mapVal, () -> id).buildAST();
//            fwd.add(v);
//        }
//
//        return nalg.null_().buildAST();


        // TODO ???
        return null;
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        IValue mapVal = idFwdMap.buildAST();
//        IValue mapKeys = malg.mapDomain(() -> mapVal).buildAST();
//        int length = ((IInteger) lalg.listLength(() -> mapKeys).buildAST()).intValue();
//
//        for (int i = 0; i < length; i++) {
//            IValue id = lalg.projectList(ialg.lit(i), () -> mapKeys).buildAST();
//            IValue v = balg.boundValue(() -> id).buildAST();
//            if (v == null) {
//                v = nalg.undefined().buildAST();
//            }
//            Fwd fwd = (Fwd) malg.mapGet(() -> mapVal, () -> id).buildAST();
//            fwd.add(v);
//        }
//
//        return nalg.null_().buildAST();
//    }
}
