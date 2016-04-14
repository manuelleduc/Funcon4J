package funcons.interpreter;

import funcons.algebras.ListAlg;
import funcons.sorts.IEval;
import funcons.types.List;
import funcons.types.Null;
import funcons.types.Value;

public interface ListFactory extends TupleFactory, ListAlg<IEval> {
    @Override
    default IEval list() {
        return (env, store, given) -> new List();
    }

    @Override
    default IEval list(IEval x) {
        return (env, store, given) -> new List(x.eval(env, store, given));
    }

    @Override
    default IEval list(IEval x1, IEval x2) {
        return (env, store, given) -> new List(x1.eval(env, store, given), x2.eval(env, store, given));
    }

    @Override
    default IEval listPrefix(IEval x, IEval l) {
        return (env, store, given) -> ((List)l.eval(env, store, given)).prepend(x.eval(env, store, given));
    }

    @Override
    default IEval applyToEach(IEval a, IEval l) {
        return (env, store, given) -> {
            List list = (List)l.eval(env, store, given);
            Value head = list.head();
            List tail = list.tail();

            if (head == null || tail == null) {
                return new Null();
            }

            return seq(apply(a, (e,s,g) -> head), applyToEach(a, (e,s,g) -> tail)).eval(env, store, given);
        };
    }
}
