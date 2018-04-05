package funcons.truffle.controlflow;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.NullAlg;

public interface TruffleLogicControlFactory extends
        NullAlg<FNCExecuteNode>,
        FunctionAlg<FNCExecuteNode>,
        BindingAlg<FNCExecuteNode>,
        MapAlg<FNCExecuteNode>,
        BoolAlg<FNCExecuteNode>,
        LogicControlAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode effect(FNCExecuteNode e) {
//        return (env, given) -> {
//            e.eval(env, given);
//            return null_().eval(env, given);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode seq(FNCExecuteNode c, FNCExecuteNode t) {
        return new LogicControlSeqNode((FNCExpressionNode) c, (FNCExpressionNode) t);
    }

    @Override
    default FNCExecuteNode ifTrue(FNCExecuteNode e, FNCExecuteNode c1, FNCExecuteNode c2) {
        return new LogicControlIfTrueNode(e, c1, c2);
    }

    @Override
    default FNCExecuteNode whileTrue(FNCExecuteNode e, FNCExecuteNode c) {
        return new LogicControlWhileTrueNode(e, c, this);
    }

    @Override
    default FNCExecuteNode for_(FNCExecuteNode cond, FNCExecuteNode incr, FNCExecuteNode exp) {
//        return (env, given) -> {
//            for (; (((IBool) cond.eval(env, given)).getValue()); env = env.join((IMap) incr.eval(env, given))) {
//                exp.eval(env, given);
//            }
//            return null_().eval(env, given);
//        };
        throw new RuntimeException("Not implemented");
    }
}
