package funcons.truffle.types;

import funcons.algebras.types.TupleTypeAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IList;

public interface TruffleTupleTypeFactory extends TupleTypeAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode tupleType() {
//        return (env, given) -> vf.list();
        return new TupleType();
    }

    @Override
    default FNCExecuteNode tupleType(FNCExecuteNode x) {
//        return (env, given) -> vf.list((IValue) x.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode tupleType(FNCExecuteNode x1, FNCExecuteNode x2) {
//        return (env, given) -> vf.list(
//                (IValue) x1.eval(env, given),
//                (IValue) x2.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode tupleType(FNCExecuteNode x1, FNCExecuteNode x2, FNCExecuteNode x3) {
//        return (env, given) -> vf.list(
//                (IValue) x1.eval(env, given),
//                (IValue) x2.eval(env, given),
//                (IValue) x3.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode tupleTypePrefix(FNCExecuteNode x, FNCExecuteNode tup) {
        return new TupleTypePrefix();

    }

    @Override
    default FNCExecuteNode projectType(FNCExecuteNode index, FNCExecuteNode tup) {
//        return (env, given) ->
//                ((IList) tup.eval(env, given))
//                        .get(((IInteger) index.eval(env, given)).intValue());
        throw new RuntimeException("Not implemented");
    }

    class TupleType implements FNCExecuteNode {
        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new TupleTypeTupleTypeNode();
        }
    }

    class TupleTypePrefix implements FNCExecuteNode {
        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return null;
        }
    }
}

