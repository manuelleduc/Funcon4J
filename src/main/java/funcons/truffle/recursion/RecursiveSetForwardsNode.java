package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Recursive SetForwards Node")
public class RecursiveSetForwardsNode extends FNCExpressionNode implements FNCExecuteNode {


    @Child
    private FNCExpressionNode idFwdMap;

    public RecursiveSetForwardsNode(FNCExpressionNode idFwdMap) {
        this.idFwdMap = idFwdMap;

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
