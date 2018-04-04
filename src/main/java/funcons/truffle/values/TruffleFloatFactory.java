package funcons.truffle.values;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.values.FloatAlg;

public interface TruffleFloatFactory extends FloatAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode lit(Double i) {
//        return (env, given) -> vf.real(i);
        return null; // TODO
    }

    @Override
    default CLExecuteNode floatAdd(CLExecuteNode a, CLExecuteNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.add(bVal).toReal(5);
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode floatNegate(CLExecuteNode x) {
//        return (env, given) ->
//                ((INumber) x.eval(env, given)).negate().toReal(5);
        return null; // TODO
    }

    @Override
    default CLExecuteNode floatSubtract(CLExecuteNode a, CLExecuteNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.subtract(bVal).toReal(5);
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode floatMultiply(CLExecuteNode a, CLExecuteNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.multiply(bVal).toReal(5);
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode floatDivide(CLExecuteNode a, CLExecuteNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.divide(bVal, 5).toReal(5);
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode floatModulo(CLExecuteNode a, CLExecuteNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.subtract(aVal.divide(bVal, 5).toReal(5).floor().multiply(bVal)).toReal(5);
//        };
        return null; // TODO
    }

    @Override
    default CLExecuteNode floatPowerOf(CLExecuteNode a, CLExecuteNode b) {
//        return (env, given) -> {
//            INumber aVal = (INumber) a.eval(env, given);
//            INumber bVal = (INumber) b.eval(env, given);
//            return aVal.toReal(5).pow(bVal.toReal(5), 5);
//        };
        return null; // TODO
    }
}
