package funcons.truffle.controlflow;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleLogicControlFactory extends
        NullAlg<CLStatementNode>,
        FunctionAlg<CLStatementNode>,
        BindingAlg<CLStatementNode>,
        MapAlg<CLStatementNode>,
        BoolAlg<CLStatementNode>,
        LogicControlAlg<CLStatementNode> {

    @Override
    default CLStatementNode effect(CLStatementNode e) {
//        return (env, given) -> {
//            e.eval(env, given);
//            return null_().eval(env, given);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode seq(CLStatementNode c, CLStatementNode t) {
//        return (env, given) -> {
//            c.eval(env, given);
//            return t.eval(env, given);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode ifTrue(CLStatementNode e, CLStatementNode c1, CLStatementNode c2) {
//        return (env, given) ->
//                (((IBool) e.eval(env, given)).getValue() ? c1 : c2).eval(env, given);
        return null; // TODO
    }

    @Override
    default CLStatementNode whileTrue(CLStatementNode e, CLStatementNode c) {
//        return (env, given) -> {
//            while (((IBool) e.eval(env, given)).getValue()) {
//                c.eval(env, given);
//            }
//            return null_().eval(env, given);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode for_(CLStatementNode cond, CLStatementNode incr, CLStatementNode exp) {
//        return (env, given) -> {
//            for (; (((IBool) cond.eval(env, given)).getValue()); env = env.join((IMap) incr.eval(env, given))) {
//                exp.eval(env, given);
//            }
//            return null_().eval(env, given);
//        };
        return null; // TODO
    }
}
