package funcons.truffle.functions;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.values.BoolAlg;

public interface TrufflePatternFactory extends
        BoolAlg<FNCExecuteNode>,
        LogicControlAlg<FNCExecuteNode>,
        SupplyGivenAlg<FNCExecuteNode>,
        FunctionAlg<FNCExecuteNode>,
        ExceptionAlg<FNCExecuteNode>,
        BindingAlg<FNCExecuteNode>,
        MapAlg<FNCExecuteNode>,
        PatternAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode only(FNCExecuteNode v) {
//        return abs(ifTrue(equal(given(), v), environment(), fail()));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode any() {
//        return abs(environment());
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode match(FNCExecuteNode exp, FNCExecuteNode pat) {
//        return apply(pat, exp);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode pattAbs(FNCExecuteNode pat, FNCExecuteNode x) {
//        return abs(scope(match(given(), pat), x));
        throw new RuntimeException("Not implemented");
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCExecuteNode pattUnion(FNCExecuteNode pat1, FNCExecuteNode pat2) {
//        return abs((env, given) -> {
//            CLExecuteNode env1 = ((Abs<CLExecuteNode>) pat1.eval(env, given)).body();
//            CLExecuteNode env2 = ((Abs<CLExecuteNode>) pat2.eval(env, given)).body();
//            return mapUnion(env1, env2).eval(env, given);
//        });
        throw new RuntimeException("Not implemented");
    }

    @Override
    @SuppressWarnings("unchecked")
    default FNCExecuteNode pattNonBinding(FNCExecuteNode patt) {
//        return abs((env, given) -> {
//            ((Abs<CLExecuteNode>) patt.eval(env, given)).body().eval(env, given);
//            return environment().eval(env, given);
//        });
        throw new RuntimeException("Not implemented");
    }
}