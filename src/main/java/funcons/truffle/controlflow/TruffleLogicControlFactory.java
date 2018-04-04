package funcons.truffle.controlflow;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.NullAlg;

public interface TruffleLogicControlFactory extends
        NullAlg<CLExecuteNode>,
        FunctionAlg<CLExecuteNode>,
        BindingAlg<CLExecuteNode>,
        MapAlg<CLExecuteNode>,
        BoolAlg<CLExecuteNode>,
        LogicControlAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode effect(CLExecuteNode e) {
//        return (env, given) -> {
//            e.eval(env, given);
//            return null_().eval(env, given);
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode seq(CLExecuteNode c, CLExecuteNode t) {
        return new LogicControlSeqNode(c, t);
    }

    @Override
    default CLExecuteNode ifTrue(CLExecuteNode e, CLExecuteNode c1, CLExecuteNode c2) {
        return new LogicControlIfTrueNode(e, c1, c2);
    }

    @Override
    default CLExecuteNode whileTrue(CLExecuteNode e, CLExecuteNode c) {
//        return (env, given) -> {
//            while (((IBool) e.eval(env, given)).getValue()) {
//                c.eval(env, given);
//            }
//            return null_().eval(env, given);
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode for_(CLExecuteNode cond, CLExecuteNode incr, CLExecuteNode exp) {
//        return (env, given) -> {
//            for (; (((IBool) cond.eval(env, given)).getValue()); env = env.join((IMap) incr.eval(env, given))) {
//                exp.eval(env, given);
//            }
//            return null_().eval(env, given);
//        };
        return null; // TODO
    }
}
