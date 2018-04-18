package funcons.truffle.collections;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.TupleAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface TruffleTupleFactory extends
        PatternAlg<FNCExecuteNode>,
        MapAlg<FNCExecuteNode>,
        SupplyGivenAlg<FNCExecuteNode>,
        FunctionAlg<FNCExecuteNode>,
        TupleAlg<FNCExecuteNode> {

    final ValueFactory vf = ValueFactory.getInstance();

    @Override
    default FNCExecuteNode tuple() {
//        return (env, given) -> vf.list();
        return new Tuple0();
    }

    @Override
    default FNCExecuteNode tuple(FNCExecuteNode x) {
//        return (env, given) -> vf.list((IValue) x.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode tuple(FNCExecuteNode x1, FNCExecuteNode x2) {
        return language -> new TupleTupleNode((FNCExpressionNode) x1.buildAST(language), (FNCExpressionNode) x2.buildAST(language));
    }

    @Override
    default FNCExecuteNode tuple(FNCExecuteNode x1, FNCExecuteNode x2, FNCExecuteNode x3) {
//        return (env, given) -> vf.list(
//                x1.eval(env, given),
//                x2.eval(env, given),
//                x3.eval(env, given)
//        );
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode tuplePrefix(FNCExecuteNode x, FNCExecuteNode tup) {
//        return (env, given) ->
//                ((IList) tup.eval(env, given))
//                        .insert(x.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode tupleHead(FNCExecuteNode tup) {
//        return (env, given) -> ((IList) tup.eval(env, given)).get(0);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode tupleTail(FNCExecuteNode tup) {
//        return (env, given) -> {
//            IList tupVal = ((IList) tup.eval(env, given));
//            if (tupVal.length() <= 1) {
//                return vf.list();
//            }
//            return tupVal.sublist(1, tupVal.length() - 1);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode project(FNCExecuteNode index, FNCExecuteNode tup) {
        return language -> new TupleProjectNode((FNCExpressionNode) index.buildAST(language), (FNCExpressionNode) tup.buildAST(language));
    }

    @Override
    default FNCExecuteNode tuplePrefixMatch(FNCExecuteNode tup, FNCExecuteNode p1, FNCExecuteNode p2) {
//         l -> {
//            IValue tupVal = tup.eval(env, given);
//            return mapUnion(
//                    match(tupleHead((e, g) -> tupVal), p1),
//                    match(tupleTail((e, g) -> tupVal), p2)
//            ).eval(env, given);
//        };

        return new TuplePrefixMatch(p1, p2);

    }

    @Override
    default FNCExecuteNode tuplePrefixPatt(FNCExecuteNode p1, FNCExecuteNode p2) {
        return abs(tuplePrefixMatch(given(), p1, p2));
    }

    class Tuple0 implements FNCExecuteNode {
        @Override
        public FNCStatementNode buildAST(FNCLanguage language) {
            return new TupleTupleNode0();
        }
    }

    class TuplePrefixMatch implements FNCExecuteNode {
        private final FNCExecuteNode p1;
        private final FNCExecuteNode p2;

        public TuplePrefixMatch(FNCExecuteNode p1, FNCExecuteNode p2) {
            this.p1 = p1;
            this.p2 = p2;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new TupleTuplePrefixMatchNode((FNCExpressionNode) p1.buildAST(l), (FNCExpressionNode) p2.buildAST(l));
        }
    }
}

