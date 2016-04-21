package funcons.interpreter;

import funcons.algebras.TupleAlg;
import funcons.sorts.IEval;
import funcons.types.*;

import java.util.NoSuchElementException;

public interface TupleFactory extends AssignFactory, TupleAlg<IEval> {

    @Override
    default IEval tuple() {
        return (env, store, given) -> new Tuple();
    }

    @Override
    default IEval tuple(IEval x) {
        return (env, store, given) -> new Tuple(x.eval(env, store, given));
    }

    @Override
    default IEval tuple(IEval x1, IEval x2) {
        return (env, store, given) -> new Tuple(
                x1.eval(env, store, given),
                x2.eval(env, store, given)
        );
    }

    @Override
    default IEval tuple(IEval x1, IEval x2, IEval x3) {
        return (env, store, given) -> new Tuple(
                x1.eval(env, store, given),
                x2.eval(env, store, given),
                x3.eval(env, store, given)
        );
    }

    @Override
    default IEval tuplePrefix(IEval x, IEval tup) {
        return (env, store, given) -> {
            Tuple t = (Tuple)tup.eval(env, store, given);
            return t.prepend(x.eval(env, store, given));
        };
    }

    @Override
    default IEval tupleTail(IEval tup) {
        return (env, store, given) -> {
            Tuple t = (Tuple)tup.eval(env, store, given);
            Tuple tail = t.tail();
            if (tail == null) {
                throw new NoSuchElementException();
            }
            return tail;
        };
    }

    @Override
    default IEval tupleHead(IEval tup) {
        return (env, store, given) -> {
            Tuple t = (Tuple)tup.eval(env, store, given);
            Value head = t.head();
            if (head == null) {
                throw new NoSuchElementException();
            }
            return head;
        };
    }

    //@Override
    //default IEval invert(IEval tup) {
    //    return (env, store, given) -> ((Tuple)tup.eval(env, store,given)).invert();
    //}

    @Override
    default IEval project(IEval index, IEval tup) {
        return (env, store, given) -> ((Tuple) tup.eval(env, store, given)).get((Int) index.eval(env, store, given));
    }

    @Override
    default IEval partialApp(IEval f, IEval x) {
        return abs(apply(f, tuple(x, given())));
    }

    @Override
    default IEval partialAppN(IEval f, IEval x) {
        return abs(apply(f, tuplePrefix(x, given())));
    }

    @Override
    default IEval curry(IEval f) {
        return abs((env, store, given) -> partialApp(f, (e,s,g) -> given).eval(env, store, given));
    }

    @Override
    default IEval curryN(IEval n, IEval f) {
        return (env, store, given) -> {
            Int index = (Int)n.eval(env, store, given);
            if (index.intValue() == 0) {
                return apply(f, tuple()).eval(env, store, given);
            }

            return new Abs<IEval>(
                    (localEnv, localStore, localGiven) -> curryN(
                            (e,s,g) -> new Int(index.intValue() - 1),
                            partialAppN(f, (e,s,g) -> localGiven)).eval(localEnv, localStore, localGiven)
            );
        };
    }

    @Override
    default IEval uncurry(IEval f) {
        return abs(apply(apply(f, project(lit(0), given())), project(lit(1), given())));
    }

    @Override
    default IEval tuplePrefixMatch(IEval tup, IEval p1, IEval p2) {
        return (env, store, given) -> {
            Tuple t = (Tuple)tup.eval(env, store, given);
            Environment e1 = (Environment)match((e, s, g) -> t.head(), p1).eval(env, store, given);
            Environment e2 = (Environment)match((e, s, g) -> t.tail(), p2).eval(env, store, given);
            return e1.extend(e2);
        };
    }

    @Override
    default IEval tuplePrefixPatt(IEval p1, IEval p2) {
        return abs(tuplePrefixMatch(given(), p1, p2));
    }
}
