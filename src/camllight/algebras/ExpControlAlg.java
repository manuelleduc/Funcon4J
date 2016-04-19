package camllight.algebras;

import noa.syntax.Syntax;

public interface ExpControlAlg<E> extends BoolLogicAlg<E> {
    @Syntax("exp = ID")
    E id(java.lang.String name);

    @Syntax("exp = exp ';' exp")
    E seq(E e1, E e2);

    @Syntax("exp = 'if' exp 'then' exp")
    default E if_(E e1, E e2) {
        return ifElse(e1, e2, alg().tuple());
    }

    @Syntax("exp = 'if' exp 'then' exp 'else' exp")
    E ifElse(E e1, E e2, E e3);

    @Syntax("exp = 'while' exp 'do' exp 'done'")
    E whileTrue(E e, E c);

    @Syntax("exp = 'for' exp '=' exp 'to' exp 'do' exp 'done'")
    E for_(E id, E start, E finish, E e3);
}