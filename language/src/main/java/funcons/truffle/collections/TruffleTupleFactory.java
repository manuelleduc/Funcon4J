package funcons.truffle.collections;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.TupleAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface TruffleTupleFactory extends
        PatternAlg<FNCBuildAST>,
        MapAlg<FNCBuildAST>,
        SupplyGivenAlg<FNCBuildAST>,
        FunctionAlg<FNCBuildAST>,
        TupleAlg<FNCBuildAST> {

    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default FNCBuildAST tuple() {
        return new Tuple0();
    }

    @Override
    default FNCBuildAST tuple(FNCBuildAST x) {
//        return (env, given) -> vf.list((IValue) x.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST tuple(FNCBuildAST x1, FNCBuildAST x2) {
        return language -> new TupleTupleNode(x1.buildAST(language), x2.buildAST(language));
    }

    @Override
    default FNCBuildAST tuple(FNCBuildAST x1, FNCBuildAST x2, FNCBuildAST x3) {
//        return (env, given) -> vf.list(
//                x1.eval(env, given),
//                x2.eval(env, given),
//                x3.eval(env, given)
//        );
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST tuplePrefix(FNCBuildAST x, FNCBuildAST tup) {
//        return (env, given) ->
//                ((IList) tup.eval(env, given))
//                        .insert(x.eval(env, given));
        return new TuplePrefix(x, tup);
    }

    @Override
    default FNCBuildAST tupleHead(FNCBuildAST tup) {
        return new TupleHead(tup);
    }

    @Override
    default FNCBuildAST tupleTail(FNCBuildAST tup) {
//        return (env, given) -> {
//            IList tupVal = ((IList) tup.eval(env, given));
//            if (tupVal.length() <= 1) {
//                return vf.list();
//            }
//            return tupVal.sublist(1, tupVal.length() - 1);
//        };
        return new TupleTail(tup);
    }

    @Override
    default FNCBuildAST project(FNCBuildAST index, FNCBuildAST tup) {
        return language -> new TupleProjectNode(index.buildAST(language), tup.buildAST(language));
    }

    @Override
    default FNCBuildAST tuplePrefixMatch(FNCBuildAST tup, FNCBuildAST p1, FNCBuildAST p2) {

        return new FNCBuildAST() {
            @Override
            public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
                return mapUnion(
                        match(tupleHead(tup), p1),
                        match(tupleTail(tup), p2)
                ).buildAST(l);
            }
        };

    }

    @Override
    default FNCBuildAST tuplePrefixPatt(FNCBuildAST p1, FNCBuildAST p2) {
        return abs(tuplePrefixMatch(given(), p1, p2));
    }

    class Tuple0 implements FNCBuildAST {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage language) {
            return new TupleTupleNode0();
        }
    }

    class TuplePrefix implements FNCBuildAST {
        private final FNCBuildAST x;
        private final FNCBuildAST tup;

        public TuplePrefix(FNCBuildAST x, FNCBuildAST tup) {
            this.x = x;
            this.tup = tup;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new TupleTuplePrefixNode(x.buildAST(l), tup.buildAST(l));
        }
    }

    class TupleHead implements FNCBuildAST {
        private final FNCBuildAST tup;

        public TupleHead(FNCBuildAST tup) {
            this.tup = tup;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new TupleTupleHeadNode(tup.buildAST(l));
        }
    }

    class TupleTail implements FNCBuildAST {
        private final FNCBuildAST tup;

        public TupleTail(FNCBuildAST tup) {
            this.tup = tup;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new TupleTupleTailNode(tup.buildAST(l));
        }

    }
}

