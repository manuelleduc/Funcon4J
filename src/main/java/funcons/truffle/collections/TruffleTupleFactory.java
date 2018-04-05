package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.TupleAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;

public interface TruffleTupleFactory extends
        PatternAlg<CLExecuteNode>,
        MapAlg<CLExecuteNode>,
        SupplyGivenAlg<CLExecuteNode>,
        FunctionAlg<CLExecuteNode>,
        TupleAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode tuple() {
//        return (env, given) -> vf.list();
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode tuple(CLExecuteNode x) {
//        return (env, given) -> vf.list((IValue) x.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode tuple(CLExecuteNode x1, CLExecuteNode x2) {
//        return (env, given) -> vf.list(
//                x1.eval(env, given),
//                x2.eval(env, given)
//        );
        return new TupleTupleNode(x1, x2);
    }

    @Override
    default CLExecuteNode tuple(CLExecuteNode x1, CLExecuteNode x2, CLExecuteNode x3) {
//        return (env, given) -> vf.list(
//                x1.eval(env, given),
//                x2.eval(env, given),
//                x3.eval(env, given)
//        );
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode tuplePrefix(CLExecuteNode x, CLExecuteNode tup) {
//        return (env, given) ->
//                ((IList) tup.eval(env, given))
//                        .insert(x.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode tupleHead(CLExecuteNode tup) {
//        return (env, given) -> ((IList) tup.eval(env, given)).get(0);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode tupleTail(CLExecuteNode tup) {
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
    default CLExecuteNode project(CLExecuteNode index, CLExecuteNode tup) {
//        return (env, given) ->
//                ((IList) tup.eval(env, given))
//                        .get(((IInteger) index.eval(env, given)).intValue());
        return new TupleProjectNode(index, tup);
    }

    @Override
    default CLExecuteNode tuplePrefixMatch(CLExecuteNode tup, CLExecuteNode p1, CLExecuteNode p2) {
//        return (env, given) -> {
//            IValue tupVal = tup.eval(env, given);
//            return mapUnion(
//                    match(tupleHead((e, g) -> tupVal), p1),
//                    match(tupleTail((e, g) -> tupVal), p2)
//            ).eval(env, given);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode tuplePrefixPatt(CLExecuteNode p1, CLExecuteNode p2) {
//        return abs(tuplePrefixMatch(given(), p1, p2));
        throw new RuntimeException("Not implemented");
    }
}

