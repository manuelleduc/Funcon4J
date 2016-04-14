package funcons.interpreter;

import funcons.algebras.ListAlg;
import funcons.sorts.IEval;
import funcons.types.*;

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

            if (list.equals(new List())) {
                return new Null();
            }

            return seq(apply(a, (e,s,g) -> head), applyToEach(a, (e,s,g) -> tail)).eval(env, store, given);
        };
    }

    @Override
    default IEval listPrefixMatch(IEval l, IEval p1, IEval p2) {
        return (env, store, given) -> {
            List list = (List)l.eval(env, store, given);
            Environment e1 = (Environment)match((e, s, g) -> list.head(), p1).eval(env, store, given);
            Environment e2 = (Environment)match((e, s, g) -> list.tail(), p2).eval(env, store, given);
            return e1.extend(e2);
        };
    }

    @Override
    default IEval intClosedInterval(IEval m, IEval n) {
        return (env, store, given) -> {
            Int mValue = (Int)m.eval(env, store, given);
            Int nValue = (Int)n.eval(env, store, given);

            if (((Bool)intGreater((e,s,g) -> mValue, (e,s,g) -> nValue).eval(env, store, given)).boolValue()) {
                return new List();
            }

            return listPrefix(m, intClosedInterval(intAdd((e,s,g) -> mValue, lit(1)), (e,s,g) -> nValue)).eval(env, store, given);
        };
    }
}
