package funcons.truffle.types;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.types.TupleTypeAlg;

public interface TruffleTupleTypeFactory extends TupleTypeAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode tupleType() {
//        return (env, given) -> vf.list();
        return null; // TODO
    }

    @Override
    default CLExecuteNode tupleType(CLExecuteNode x) {
//        return (env, given) -> vf.list((IValue) x.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLExecuteNode tupleType(CLExecuteNode x1, CLExecuteNode x2) {
//        return (env, given) -> vf.list(
//                (IValue) x1.eval(env, given),
//                (IValue) x2.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLExecuteNode tupleType(CLExecuteNode x1, CLExecuteNode x2, CLExecuteNode x3) {
//        return (env, given) -> vf.list(
//                (IValue) x1.eval(env, given),
//                (IValue) x2.eval(env, given),
//                (IValue) x3.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLExecuteNode tupleTypePrefix(CLExecuteNode x, CLExecuteNode tup) {
//        return (env, given) ->
//                ((IList) tup.eval(env, given))
//                        .insert((IValue) x.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLExecuteNode projectType(CLExecuteNode index, CLExecuteNode tup) {
//        return (env, given) ->
//                ((IList) tup.eval(env, given))
//                        .get(((IInteger) index.eval(env, given)).intValue());
        return null; // TODO
    }
}

