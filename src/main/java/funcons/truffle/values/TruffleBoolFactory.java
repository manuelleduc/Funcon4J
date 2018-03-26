package funcons.truffle.values;

import funcons.algebras.values.BoolAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleBoolFactory extends BoolAlg<CLStatementNode> {
    @Override
    default CLStatementNode bool(Boolean b) {
//        return (env, given) -> vf.bool(b);
        return null; // TODO
    }

    @Override
    default CLStatementNode not(CLStatementNode b) {
//        return (env, given) -> ((IBool)b.eval(env, given)).not();
        return null; // TODO
    }

    @Override
    default CLStatementNode greater(CLStatementNode a, CLStatementNode b) {
//        return (env, given) -> {
//            IValue aVal = (IValue)a.eval(env, given);
//            IValue bVal = (IValue)b.eval(env, given);
//            return vf.bool(RascalValueComperator.compare(aVal, bVal) == 1);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode smaller(CLStatementNode a, CLStatementNode b) {
//        return not(greaterEqual(a, b));
        return null; // TODO
    }

    @Override
    default CLStatementNode greaterEqual(CLStatementNode a, CLStatementNode b) {
//        return (env, given) -> {
//            if (((IBool)greater(a,b).eval(env, given)).getValue()) {
//                return bool(true).eval(env, given);
//            }
//            return equal(a, b).eval(env, given);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode smallerEqual(CLStatementNode a, CLStatementNode b) {
//        return not(greater(a, b));
        return null; // TODO
    }

    @Override
    default CLStatementNode equal(CLStatementNode e1, CLStatementNode e2) {
//        return (env, given) ->
//                vf.bool(((IValue)e1.eval(env, given)).isEqual((IValue)e2.eval(env, given)));
        return null; // TODO
    }

    @Override
    default CLStatementNode physicalEqual(CLStatementNode e1, CLStatementNode e2) {
//        return (env, given) ->
//                vf.bool(e1.eval(env, given) == e2.eval(env, given));
        return null; // TODO
    }
}
