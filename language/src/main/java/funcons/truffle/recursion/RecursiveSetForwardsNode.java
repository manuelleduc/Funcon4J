package funcons.truffle.recursion;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.collections.MapMapDomainNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.values.NullNullNode;
import funcons.values.recursion.Fwd;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IValue;

@NodeInfo(description = "Recursive SetForwards Node")
public class RecursiveSetForwardsNode extends FNCExpressionNode {

    @Child
    private FNCExpressionNode idFwdMap;

    public RecursiveSetForwardsNode(FNCExpressionNode idFwdMap) {
        this.idFwdMap = idFwdMap;

    }

    @Override
    public Object executeGeneric(VirtualFrame frame) {
//        idFwdMap.executeGeneric(frame);
//        IValue mapVal = (IValue) idFwdMap.executeGeneric(frame);
//        IValue mapKeys = null; //new MapMapDomainNode(mapVal).executeGeneric(frame);
//        int length = 0;

//        for (int i = 0; i < length; i++) {
//            IValue id = projectList(lit(i), (e,g)->mapKeys).eval(env, given);
//            IValue v = boundValue((e,g)->id).eval(env, given);
//            if (v == null) {
//                v = undefined().eval(env, given);
//            }
//            Fwd fwd = (Fwd)mapGet((e, g)->mapVal, (e, g)->id).eval(env, given);
//            fwd.add(v);
//        }
//
//        return null_().eval(env, given);

        return new NullNullNode().executeGeneric(frame);
    }

}
