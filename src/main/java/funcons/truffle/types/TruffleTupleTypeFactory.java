package funcons.truffle.types;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.algebras.types.TupleTypeAlg;

public interface TruffleTupleTypeFactory extends TupleTypeAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode tupleType() {
//        return (env, given) -> vf.list();
        throw new RuntimeException("Not implemented");
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
//        return (env, given) ->
//                ((IList) tup.eval(env, given))
//                        .insert((IValue) x.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode projectType(FNCExecuteNode index, FNCExecuteNode tup) {
//        return (env, given) ->
//                ((IList) tup.eval(env, given))
//                        .get(((IInteger) index.eval(env, given)).intValue());
        throw new RuntimeException("Not implemented");
    }
}

