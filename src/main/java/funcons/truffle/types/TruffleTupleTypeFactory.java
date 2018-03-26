package funcons.truffle.types;

import funcons.algebras.types.TupleTypeAlg;
import funcons.truffle.nodes.CLStatementNode;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IList;
import io.usethesource.vallang.IValue;

public interface TruffleTupleTypeFactory extends TupleTypeAlg<CLStatementNode> {

    @Override
    default CLStatementNode tupleType() {
//        return (env, given) -> vf.list();
        return null; // TODO
    }

    @Override
    default CLStatementNode tupleType(CLStatementNode x) {
//        return (env, given) -> vf.list((IValue) x.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode tupleType(CLStatementNode x1, CLStatementNode x2) {
//        return (env, given) -> vf.list(
//                (IValue) x1.eval(env, given),
//                (IValue) x2.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode tupleType(CLStatementNode x1, CLStatementNode x2, CLStatementNode x3) {
//        return (env, given) -> vf.list(
//                (IValue) x1.eval(env, given),
//                (IValue) x2.eval(env, given),
//                (IValue) x3.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode tupleTypePrefix(CLStatementNode x, CLStatementNode tup) {
//        return (env, given) ->
//                ((IList) tup.eval(env, given))
//                        .insert((IValue) x.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode projectType(CLStatementNode index, CLStatementNode tup) {
//        return (env, given) ->
//                ((IList) tup.eval(env, given))
//                        .get(((IInteger) index.eval(env, given)).intValue());
        return null; // TODO
    }
}

