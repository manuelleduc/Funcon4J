package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.values.BoolAlg;

public interface TruffleBoolFactory extends BoolAlg<CLExecuteNode> {
    @Override
    default CLExecuteNode bool(Boolean b) {
//        return (env, given) -> vf.bool(b);
        return new BoolBoolNode(b); // TODO
    }

    @Override
    default CLExecuteNode not(CLExecuteNode b) {
//        return (env, given) -> ((IBool)b.eval(env, given)).not();
        return new BoolNotNode(b);
    }

    @Override
    default CLExecuteNode greater(CLExecuteNode a, CLExecuteNode b) {
//        return (env, given) -> {
//            IValue aVal = (IValue)a.eval(env, given);
//            IValue bVal = (IValue)b.eval(env, given);
//            return vf.bool(RascalValueComperator.compare(aVal, bVal) == 1);
//        };
        return new BoolGreaterNode(a, b);
    }

    @Override
    default CLExecuteNode smaller(CLExecuteNode a, CLExecuteNode b) {
        return not(greaterEqual(a, b));
    }

    @Override
    default CLExecuteNode greaterEqual(CLExecuteNode a, CLExecuteNode b) {
        return new BoolGreaterEqualNode(a, b, this);
    }

    @Override
    default CLExecuteNode smallerEqual(CLExecuteNode a, CLExecuteNode b) {
//        return not(greater(a, b));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode equal(CLExecuteNode e1, CLExecuteNode e2) {
//        return (env, given) ->
//                vf.bool(((IValue)e1.eval(env, given)).isEqual((IValue)e2.eval(env, given)));
        return new BoolEqualNode(e1, e2);
    }

    @Override
    default CLExecuteNode physicalEqual(CLExecuteNode e1, CLExecuteNode e2) {
//        return (env, given) ->
//                vf.bool(e1.eval(env, given) == e2.eval(env, given));
        throw new RuntimeException("Not implemented");
    }
}
