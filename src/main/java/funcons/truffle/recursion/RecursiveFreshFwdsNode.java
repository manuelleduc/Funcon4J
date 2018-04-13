package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Recursive FreshFwds Node")
public class RecursiveFreshFwdsNode extends FNCExpressionNode implements FNCExecuteNode {


    @Child
    FNCExpressionNode idList;

    public RecursiveFreshFwdsNode(FNCExpressionNode idList) {
        this.idList = idList;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
        return null;
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
