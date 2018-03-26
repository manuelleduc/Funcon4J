package funcons.truffle.auxiliary;

import funcons.algebras.auxiliary.PrintAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TrufflePrintFactory extends NullAlg<CLStatementNode>, PrintAlg<CLStatementNode> {
    @Override
    default CLStatementNode print(CLStatementNode x) {
//        return (env, given) -> {
//            System.out.print(x.eval(env, given));
//            return null_().eval(env, given);
//        };
        return null; // TODO
    }
}
