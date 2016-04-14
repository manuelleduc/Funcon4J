package funcons.interpreter;

import funcons.algebras.ListAlg;
import funcons.sorts.IEval;
import funcons.types.List;

public interface ListFactory extends TupleFactory, ListAlg<IEval> {
    default IEval list() {
        return (env, store, given) -> new List();
    }

    default IEval list(IEval x) {
        return (env, store, given) -> new List(x.eval(env, store, given));
    }


    default IEval list(IEval x1, IEval x2) {
        return (env, store, given) -> new List(x1.eval(env, store, given), x2.eval(env, store, given));
    }

    default IEval listPrefix(IEval x, IEval l) {
        return (env, store, given) -> ((List)l.eval(env, store, given)).prepend(x.eval(env, store, given));
    }
}
