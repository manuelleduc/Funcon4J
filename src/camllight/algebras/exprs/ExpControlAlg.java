package camllight.algebras.exprs;

import noa.syntax.Syntax;

public interface ExpControlAlg<E> extends BoolLogicAlg<E> {
    @Syntax("exp = 'if' exp 'then' exp")
    default E if_(E e1, E e2) {
        return ifElse(e1, e2, alg().tuple());
    }

    @Syntax("exp = 'if' exp 'then' exp 'else' exp")
    default E ifElse(E e1, E e2, E e3) {
        return alg().ifTrue(e1, e2, e3);
    }

    @Syntax("exp = 'while' exp 'do' exp 'done'")
    default E whileTrue(E e, E c) {
        return alg().whileTrue(e, alg().effect(c));
    }

    @Syntax("exp = 'for' exp '=' exp 'to' exp 'do' exp 'done'")
    default E for_(E id, E start, E finish, E e3) {
        return alg().applyToEach(alg().abs(alg().bind(id), alg().effect(e3)), alg().intClosedInterval(start, finish));
    }

    @Syntax("exp = exp ';' exp")
    default E seq(E e1, E e2) {
        return alg().seq(alg().effect(e1), e2);
    }
}