package funcons.truffle.entities;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.algebras.entities.SupplyGivenAlg;

public interface TruffleSupplyGivenFactory extends SupplyGivenAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode given() {
//        return (env, given) -> given;
        return new SupplyGivenGivenNode(); // TODO
    }

    @Override
    default FNCExecuteNode supply(FNCExecuteNode exp, FNCExecuteNode x) {
//        return (env, given) -> x.eval(env, exp.eval(env, given));
        return new SupplyGivenSupplyNode(exp, x);
    }
}
