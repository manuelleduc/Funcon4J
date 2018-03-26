package funcons.truffle.functions;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.values.BoolAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TrufflePatternFactory extends
        BoolAlg<CLStatementNode>,
        LogicControlAlg<CLStatementNode>,
        SupplyGivenAlg<CLStatementNode>,
        FunctionAlg<CLStatementNode>,
        ExceptionAlg<CLStatementNode>,
        BindingAlg<CLStatementNode>,
        MapAlg<CLStatementNode>,
        PatternAlg<CLStatementNode> {

    @Override
    default CLStatementNode only(CLStatementNode v) {
//        return abs(ifTrue(equal(given(), v), environment(), fail()));
        return null; // TODO
    }

    @Override
    default CLStatementNode any() {
//        return abs(environment());
        return null; // TODO
    }

    @Override
    default CLStatementNode match(CLStatementNode exp, CLStatementNode pat) {
//        return apply(pat, exp);
        return null; // TODO
    }

    @Override
    default CLStatementNode pattAbs(CLStatementNode pat, CLStatementNode x) {
//        return abs(scope(match(given(), pat), x));
        return null; // TODO
    }

    @Override
    @SuppressWarnings("unchecked")
    default CLStatementNode pattUnion(CLStatementNode pat1, CLStatementNode pat2) {
//        return abs((env, given) -> {
//            CLStatementNode env1 = ((Abs<CLStatementNode>) pat1.eval(env, given)).body();
//            CLStatementNode env2 = ((Abs<CLStatementNode>) pat2.eval(env, given)).body();
//            return mapUnion(env1, env2).eval(env, given);
//        });
        return null; // TODO
    }

    @Override
    @SuppressWarnings("unchecked")
    default CLStatementNode pattNonBinding(CLStatementNode patt) {
//        return abs((env, given) -> {
//            ((Abs<CLStatementNode>) patt.eval(env, given)).body().eval(env, given);
//            return environment().eval(env, given);
//        });
        return null; // TODO
    }
}