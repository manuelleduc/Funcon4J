package funcons.truffle.types;

import funcons.algebras.types.TupleTypeAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;

public interface TruffleTupleTypeFactory extends TupleTypeAlg<FNCBuildAST> {

    @Override
    default FNCBuildAST tupleType() {
        return new TupleType();
    }

    @Override
    default FNCBuildAST tupleType(FNCBuildAST x) {
//        return (env, given) -> vf.list((IValue) x.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST tupleType(FNCBuildAST x1, FNCBuildAST x2) {
//        return (env, given) -> vf.list(
//                (IValue) x1.eval(env, given),
//                (IValue) x2.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST tupleType(FNCBuildAST x1, FNCBuildAST x2, FNCBuildAST x3) {
//        return (env, given) -> vf.list(
//                (IValue) x1.eval(env, given),
//                (IValue) x2.eval(env, given),
//                (IValue) x3.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST tupleTypePrefix(FNCBuildAST x, FNCBuildAST tup) {
        return new TupleTypePrefix();

    }

    @Override
    default FNCBuildAST projectType(FNCBuildAST index, FNCBuildAST tup) {
//        return (env, given) ->
//                ((IList) tup.eval(env, given))
//                        .get(((IInteger) index.eval(env, given)).intValue());
        throw new RuntimeException("Not implemented");
    }

    class TupleType implements FNCBuildAST {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new TupleTypeTupleTypeNode();
        }
    }

    class TupleTypePrefix implements FNCBuildAST {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return null;
        }
    }
}

