package funcons.interpreter.collections;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.storage.EnvironmentAlg;
import funcons.algebras.storage.SupplyGivenAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;
import funcons.carriers.IEval;
import funcons.values.Bool;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.List;

public interface ListFactory extends
        EnvironmentAlg<IEval>,
        LogicControlAlg<IEval>,
        FunctionAlg<IEval>,
        PatternAlg<IEval>,
        IntAlg<IEval>,
        BoolAlg<IEval>,
        SupplyGivenAlg<IEval>,
        ListAlg<IEval> {

    @Override
    default IEval list() {
        return (env, forward, store, given) -> new List();
    }

    @Override
    default IEval list(IEval x) {
        return (env, forward, store, given) -> new List(x.eval(env, forward, store, given));
    }

    @Override
    default IEval list(IEval x1, IEval x2) {
        return (env, forward, store, given) -> new List(x1.eval(env, forward, store, given), x2.eval(env, forward, store, given));
    }

    @Override
    default IEval listPrefix(IEval x, IEval l) {
        return (env, forward, store, given) ->
                ((List)l.eval(env, forward, store, given)).prepend(x.eval(env, forward, store, given));
    }

    @Override
    default IEval listPrefixMatch(IEval l, IEval p1, IEval p2) {
        return (env, forward, store, given) -> {
            List list = (List)l.eval(env, forward, store, given);
            Environment e1 = (Environment)match((e, f, s, g) -> list.head(), p1).eval(env, forward, store, given);
            Environment e2 = (Environment)match((e, f, s, g) -> list.tail(), p2).eval(env, forward, store, given);
            return e1.join(e2);
        };
    }

    @Override
    default IEval listPrefixPatt(IEval p1, IEval p2) {
        return abs(listPrefixMatch(given(), p1, p2));
    }

    @Override
    default IEval intClosedInterval(IEval m, IEval n) {
        return (env, forward, store, given) -> {
            Int mValue = (Int)m.eval(env, forward, store, given);
            Int nValue = (Int)n.eval(env, forward, store, given);

            if (((Bool)greater((e,f,s,g) -> mValue, (e,f,s,g) -> nValue).eval(env, forward, store, given)).boolValue()) {
                return new List();
            }

            return listPrefix(m, intClosedInterval(intAdd((e,f,s,g) -> mValue, lit(1)), (e,f,s,g) -> nValue)).eval(env, forward, store, given);
        };
    }

    @Override
    default IEval listReverse(IEval l) {
        return (env, forward, store, given) -> ((List)l.eval(env, forward, store, given)).reverse();
    }

    @Override
    default IEval listAppend(IEval list1, IEval list2) {
        return (env, forward, store, given) -> {
            List l1 = (List)list1.eval(env, forward, store, given);
            List l2 = (List)list2.eval(env, forward, store, given);
            return l1.append(l2);
        };
    }

    @Override
    default IEval listHead(IEval list) {
        return (env, forwards, store, given) -> ((List)list.eval(env, forwards, store, given)).head();
    }

    @Override
    default IEval listTail(IEval list) {
        return (env, forwards, store, given) -> ((List)list.eval(env, forwards, store, given)).tail();
    }

    @Override
    default IEval projectList(IEval index, IEval list)  {
        return (env, forwards, store, given) -> {
            Int i = (Int)index.eval(env, forwards, store, given);
            List l = (List)list.eval(env, forwards, store, given);
            return l.get(i);
        };
    }

    @Override
    default IEval listLength(IEval list) {
        return (env, forwards, store, given) ->
                ((List)list.eval(env, forwards, store, given)).length();
    }
}
