package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.values.IntAlg;

public interface TruffleIntFactory extends IntAlg<CLExecuteNode> {


    @Override
    default CLExecuteNode lit(Integer i) {
        return new IntLitNode(i);
    }

    @Override
    default CLExecuteNode intAdd(CLExecuteNode a, CLExecuteNode b) {
        return new IntIntAddNode(a, b);
    }

    @Override
    default CLExecuteNode intNegate(CLExecuteNode x) {
//        return (env, given) ->
//                ((INumber) x.eval(env, given)).toInteger().negate();
        return null; // TODO
    }

    @Override
    default CLExecuteNode intSubtract(CLExecuteNode a, CLExecuteNode b) {
//        return (env, given) ->
//                ((INumber) a.eval(env, given)).toInteger()
//                        .subtract(((INumber) b.eval(env, given)).toInteger());
        return null; // TODO
    }

    @Override
    default CLExecuteNode intMultiply(CLExecuteNode a, CLExecuteNode b) {
//        return (env, given) ->
//                ((INumber) a.eval(env, given)).toInteger()
//                        .multiply(((INumber) b.eval(env, given)).toInteger());
        return null; // TODO
    }

    @Override
    default CLExecuteNode intDivide(CLExecuteNode a, CLExecuteNode b) {
//        return (env, given) ->
//                ((INumber) a.eval(env, given)).toInteger()
//                        .divide(((INumber) b.eval(env, given)).toInteger());
        return null; // TODO
    }

    @Override
    default CLExecuteNode intModulo(CLExecuteNode a, CLExecuteNode b) {
//        return (env, given) -> {
//            IInteger aNumber = ((INumber) a.eval(env, given)).toInteger();
//            IInteger bNumber = ((INumber) b.eval(env, given)).toInteger();
//            return aNumber.subtract(aNumber.divide(bNumber).multiply(bNumber));
//        };
        return null; // TODO
    }
}
