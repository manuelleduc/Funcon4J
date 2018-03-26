package funcons.truffle.values;

import funcons.algebras.values.IntAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleIntFactory extends IntAlg<CLStatementNode> {


    @Override
    default CLStatementNode lit(Integer i) {
//        return (env, given) -> vf.integer(i);
        return null; // TODO
    }

    @Override
    default CLStatementNode intAdd(CLStatementNode a, CLStatementNode b) {
//        return (env, given) ->
//                ((INumber) a.eval(env, given)).toInteger()
//                        .add(((INumber) b.eval(env, given)).toInteger());
        return null; // TODO
    }

    @Override
    default CLStatementNode intNegate(CLStatementNode x) {
//        return (env, given) ->
//                ((INumber) x.eval(env, given)).toInteger().negate();
        return null; // TODO
    }

    @Override
    default CLStatementNode intSubtract(CLStatementNode a, CLStatementNode b) {
//        return (env, given) ->
//                ((INumber) a.eval(env, given)).toInteger()
//                        .subtract(((INumber) b.eval(env, given)).toInteger());
        return null; // TODO
    }

    @Override
    default CLStatementNode intMultiply(CLStatementNode a, CLStatementNode b) {
//        return (env, given) ->
//                ((INumber) a.eval(env, given)).toInteger()
//                        .multiply(((INumber) b.eval(env, given)).toInteger());
        return null; // TODO
    }

    @Override
    default CLStatementNode intDivide(CLStatementNode a, CLStatementNode b) {
//        return (env, given) ->
//                ((INumber) a.eval(env, given)).toInteger()
//                        .divide(((INumber) b.eval(env, given)).toInteger());
        return null; // TODO
    }

    @Override
    default CLStatementNode intModulo(CLStatementNode a, CLStatementNode b) {
//        return (env, given) -> {
//            IInteger aNumber = ((INumber) a.eval(env, given)).toInteger();
//            IInteger bNumber = ((INumber) b.eval(env, given)).toInteger();
//            return aNumber.subtract(aNumber.divide(bNumber).multiply(bNumber));
//        };
        return null; // TODO
    }
}
