package camllight.algebras.exprs;

import noa.syntax.Level;
import noa.syntax.Syntax;

public interface ListAlg<E> extends TupleAlg<E> {
    @Syntax("exp = '[' headtaillistexp ']'") @Level(2000)
    default E headTailListExp(E e) {
        return e;
    }

    @Syntax("headtaillistexp = exp")
    default E headTailListExpSingle(E e) {
        return e;
    }

    @Syntax("headtaillistexp = exp '::' headtaillistexp")
    default E headTailListExpMulti(E e1, E e2) {
        return alg().listPrefix(e1, e2);
    }

    @Syntax("exp = '[' exp ']'") @Level(2001)
    default E singleElementListExp(E e) {
        return headTailListExpMulti(e, alg().list());
    }

    @Syntax("exp = '[' explist ']'") @Level(2002)
    default E expList(E e) {
        return e;
    }

    @Syntax("explist = exp ';' exp") @Level(0)
    default E expListDouble(E e1, E e2) {
        return headTailListExpMulti(e1, alg().list(e2));
    }

    @Syntax("explist = exp ';' explist") @Level(1)
    default E expListMulti(E e1, E e2) {
        return headTailListExpMulti(e1, e2);
    }
}
