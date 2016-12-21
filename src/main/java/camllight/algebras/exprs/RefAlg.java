package camllight.algebras.exprs;

import funcons.algebras.entities.AssignAlg;
import noa.syntax.Level;
import noa.syntax.Syntax;

public interface RefAlg<E, A extends AssignAlg<E>> {
    A alg();

    @Syntax("exp = '!' exp") @Level(1519)
    default E dereferenceExp(E exp) {
        return alg().assignedValue(exp);
    }

    @Syntax("exp = <assoc=right> exp ':=' exp") @Level(1503)
    default E refAssignExp(E exp1, E exp2) {
        return alg().assign(exp1, exp2);
    }
}
