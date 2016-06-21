package funcons.interpreter.collections;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.storage.SupplyGivenAlg;
import funcons.carriers.IEval;
import org.rascalmpl.value.IInteger;
import org.rascalmpl.value.IList;
import org.rascalmpl.value.IListWriter;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface RascalListFactory extends
        PatternAlg<IEval>,
        MapAlg<IEval>,
        FunctionAlg<IEval>,
        SupplyGivenAlg<IEval>,
        ListAlg<IEval> {

    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval projectList(IEval index, IEval list) {
        return (env, forwards, store, given) -> {
            IInteger i = (IInteger)index.eval(env, forwards, store, given);
            IList l = (IList)list.eval(env, forwards, store, given);
            return l.get(i.intValue());
        };
    }

    @Override
    default IEval list() {
        return (env, forwards, store, given) -> vf.list();
    }

    @Override
    default IEval list(IEval x) {
        return (env, forwards, store, given) -> vf.list((IValue)x.eval(env, forwards, store, given));
    }

    @Override
    default IEval list(IEval x1, IEval x2) {
        return (env, forwards, store, given) -> vf.list(
                (IValue)x1.eval(env, forwards, store, given),
                (IValue)x2.eval(env, forwards, store, given));
    }

    @Override
    default IEval listPrefix(IEval x, IEval l) {
        return (env, forwards, store, given) -> {
            IList list = (IList)l.eval(env, forwards, store, given);
            return list.insert((IValue)x.eval(env, forwards, store, given));
        };
    }

    @Override
    default IEval listPrefixMatch(IEval l, IEval p1, IEval p2) {
        return (env, forwards, store, given) -> {
            IList list = (IList)l.eval(env, forwards, store, given);
            IValue head = list.get(0);
            IList tail = list.delete(0);
            return mapOver(match((e,f,s,g)->head, p1), match((e,f,s,g)->tail, p2)).eval(env, forwards, store, given);
        };
    }

    @Override
    default IEval listPrefixPatt(IEval p1, IEval p2) {
        return abs(listPrefixMatch(given(), p1, p2));
    }

    @Override
    default IEval intClosedInterval(IEval m, IEval n) {
        return (env, forwards, store, given) -> {
            int start = ((IInteger)m.eval(env, forwards, store, given)).intValue();
            int finish = ((IInteger)n.eval(env, forwards, store, given)).intValue();
            IListWriter lw = vf.listWriter();
            for (int i = start; i <= finish; i++) {
                lw.append(vf.integer(i));
            }
            return lw.done();
        };
    }

    @Override
    default IEval listReverse(IEval l) {
        return (env, forwards, store, given) -> ((IList)l.eval(env, forwards, store, given)).reverse();
    }

    @Override
    default IEval listAppend(IEval list1, IEval list2) {
        return (env, forwards, store, given) -> {
            IList l1 = (IList)list1.eval(env, forwards, store, given);
            IList l2 = (IList)list2.eval(env, forwards, store, given);
            return l1.concat(l2);
        };
    }
}
