package funcons.truffle.entities;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.entities.SupplyGivenAlg;

public interface TruffleSupplyGivenFactory extends SupplyGivenAlg<CLExecuteNode> {

    @Override
    default CLExecuteNode given() {
//        return (env, given) -> given;
        return new SupplyGivenGivenNode(); // TODO
    }

    @Override
    default CLExecuteNode supply(CLExecuteNode exp, CLExecuteNode x) {
//        return (env, given) -> x.eval(env, exp.eval(env, given));
        return new SupplyGivenSupplyNode(exp, x);
    }
}
