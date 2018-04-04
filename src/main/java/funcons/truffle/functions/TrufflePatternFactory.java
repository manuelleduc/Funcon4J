package funcons.truffle.functions;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.values.BoolAlg;

public interface TrufflePatternFactory extends
        BoolAlg<CLExecuteNode>,
        LogicControlAlg<CLExecuteNode>,
        SupplyGivenAlg<CLExecuteNode>,
        FunctionAlg<CLExecuteNode>,
        ExceptionAlg<CLExecuteNode>,
        BindingAlg<CLExecuteNode>,
        MapAlg<CLExecuteNode>,
        PatternAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode only(CLExecuteNode v) {
//        return abs(ifTrue(equal(given(), v), environment(), fail()));
        return null; // TODO
    }

    @Override
    default CLExecuteNode any() {
//        return abs(environment());
        return null; // TODO
    }

    @Override
    default CLExecuteNode match(CLExecuteNode exp, CLExecuteNode pat) {
//        return apply(pat, exp);
        return null; // TODO
    }

    @Override
    default CLExecuteNode pattAbs(CLExecuteNode pat, CLExecuteNode x) {
//        return abs(scope(match(given(), pat), x));
        return null; // TODO
    }

    @Override
    @SuppressWarnings("unchecked")
    default CLExecuteNode pattUnion(CLExecuteNode pat1, CLExecuteNode pat2) {
//        return abs((env, given) -> {
//            CLExecuteNode env1 = ((Abs<CLExecuteNode>) pat1.eval(env, given)).body();
//            CLExecuteNode env2 = ((Abs<CLExecuteNode>) pat2.eval(env, given)).body();
//            return mapUnion(env1, env2).eval(env, given);
//        });
        return null; // TODO
    }

    @Override
    @SuppressWarnings("unchecked")
    default CLExecuteNode pattNonBinding(CLExecuteNode patt) {
//        return abs((env, given) -> {
//            ((Abs<CLExecuteNode>) patt.eval(env, given)).body().eval(env, given);
//            return environment().eval(env, given);
//        });
        return null; // TODO
    }
}