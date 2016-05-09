package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

import java.util.List;

public interface ListAlg<E> extends TupleAlg<E> {
    @Syntax("exp = <assoc=right> exp '::' exp") @Level(2000)
    default E headTailListExp(E e1, E e2) {
        return alg().listPrefix(e1, e2);
    }

    @Syntax("exp = '[' exp ']'") @Level(1901)
    default E expListSingle(E e) {
        return alg().listPrefix(e, alg().list());
    }

    @Syntax("exp = '[' explist ']'") @Level(1902)
    default E expList(E e) {
        return e;
    }

    @Syntax("explist = exp ';' exp") @Level(0)
    default E innerExpListDouble(E e1, E e2) {
        return alg().listPrefix(e1, alg().list(e2));
    }

    @Syntax("explist = exp ';' explist") @Level(1)
    default E innerExpListMulti(E e1, E e2) {
        return alg().listPrefix(e1, e2);
    }
}
