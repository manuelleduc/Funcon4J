package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface ExceptionAlg<E, A extends funcons.algebras.controlflow.ExceptionAlg<E>> {
    A alg();

    @Syntax("exp = 'try' exp 'with' pattmatch") @Level(100)
    default E tryWithExp(E exp, E pattmatch) {
        return alg().catchElseRethrow(exp, pattmatch);
    }
}
