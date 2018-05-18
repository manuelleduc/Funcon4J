package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;

@NodeInfo(description = "Recursive FreshFwds Node")
public class RecursiveFreshFwdsNode extends FNCExpressionNode {


    @Child
    private FNCExpressionNode idList;

    private long freshCptr = 0;

    public RecursiveFreshFwdsNode(FNCExpressionNode idList) {
        this.idList = idList;
    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {

        final Object res = this.idList.executeGeneric(frame);

        final long current = freshCptr;
        freshCptr = freshCptr + 1;
        return "v" + current;
    }

}

//    IEval envEval = environment();
//    IValue idListVal = idList.eval(env, given);
//    int length = ((IInteger)listLength((e, g)->idListVal).eval(env, given)).intValue();
//    IValue undefined = undefined().eval(env, given);
//
//            for (int i = 0; i < length; i++) {
//        IValue id = projectList(lit(i), (e,g)->idListVal).eval(env, given);
//        Fwd fwd = (Fwd)freshFwd().eval(env, given);
//        fwd.add(undefined);
//
//        envEval = mapUpdate(envEval, (e,g) -> id, (e,g) -> fwd);
//        }
//
//        return envEval.eval(env, given);
