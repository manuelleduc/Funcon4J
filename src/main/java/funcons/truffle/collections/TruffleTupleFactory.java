package funcons.truffle.collections;

import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.TupleAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleTupleFactory extends
        PatternAlg<CLStatementNode>,
        MapAlg<CLStatementNode>,
        SupplyGivenAlg<CLStatementNode>,
        FunctionAlg<CLStatementNode>,
        TupleAlg<CLStatementNode> {

    @Override
    default CLStatementNode tuple() {
//        return (env, given) -> vf.list();
        return null; // TODO
    }

    @Override
    default CLStatementNode tuple(CLStatementNode x) {
//        return (env, given) -> vf.list((IValue) x.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode tuple(CLStatementNode x1, CLStatementNode x2) {
//        return (env, given) -> vf.list(
//                x1.eval(env, given),
//                x2.eval(env, given)
//        );
        return null; // TODO
    }

    @Override
    default CLStatementNode tuple(CLStatementNode x1, CLStatementNode x2, CLStatementNode x3) {
//        return (env, given) -> vf.list(
//                x1.eval(env, given),
//                x2.eval(env, given),
//                x3.eval(env, given)
//        );
        return null; // TODO
    }

    @Override
    default CLStatementNode tuplePrefix(CLStatementNode x, CLStatementNode tup) {
//        return (env, given) ->
//                ((IList) tup.eval(env, given))
//                        .insert(x.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode tupleHead(CLStatementNode tup) {
//        return (env, given) -> ((IList) tup.eval(env, given)).get(0);
        return null; // TODO
    }

    @Override
    default CLStatementNode tupleTail(CLStatementNode tup) {
//        return (env, given) -> {
//            IList tupVal = ((IList) tup.eval(env, given));
//            if (tupVal.length() <= 1) {
//                return vf.list();
//            }
//            return tupVal.sublist(1, tupVal.length() - 1);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode project(CLStatementNode index, CLStatementNode tup) {
//        return (env, given) ->
//                ((IList) tup.eval(env, given))
//                        .get(((IInteger) index.eval(env, given)).intValue());
        return null; // TODO
    }

    @Override
    default CLStatementNode tuplePrefixMatch(CLStatementNode tup, CLStatementNode p1, CLStatementNode p2) {
//        return (env, given) -> {
//            IValue tupVal = tup.eval(env, given);
//            return mapUnion(
//                    match(tupleHead((e, g) -> tupVal), p1),
//                    match(tupleTail((e, g) -> tupVal), p2)
//            ).eval(env, given);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode tuplePrefixPatt(CLStatementNode p1, CLStatementNode p2) {
//        return abs(tuplePrefixMatch(given(), p1, p2));
        return null; // TODO
    }
}

