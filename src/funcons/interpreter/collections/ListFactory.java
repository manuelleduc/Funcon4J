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

public interface ListFactory extends
        PatternAlg<IEval>,
        MapAlg<IEval>,
        FunctionAlg<IEval>,
        SupplyGivenAlg<IEval>,
        ListAlg<IEval> {

    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval projectList(IEval index, IEval list) {
        return (env, given) -> {
            IInteger i = (IInteger)index.eval(env, given);
            IList l = (IList)list.eval(env, given);
            return l.get(i.intValue());
        };
    }

    @Override
    default IEval list() {
        return (env, given) -> vf.list();
    }

    @Override
    default IEval list(IEval x) {
        return (env, given) -> vf.list((IValue)x.eval(env, given));
    }

    @Override
    default IEval list(IEval x1, IEval x2) {
        return (env, given) -> vf.list(
                (IValue)x1.eval(env, given),
                (IValue)x2.eval(env, given));
    }

    @Override
    default IEval listPrefix(IEval x, IEval l) {
        return (env, given) -> {
            IList list = (IList)l.eval(env, given);
            return list.insert((IValue)x.eval(env, given));
        };
    }

    @Override
    default IEval listPrefixMatch(IEval l, IEval p1, IEval p2) {
        return (env, given) -> {
            IList list = (IList)l.eval(env, given);
            IValue head = list.get(0);
            IList tail = list.delete(0);
            return mapOver(match((e,g)->head, p1), match((e,g)->tail, p2)).eval(env, given);
        };
    }

    @Override
    default IEval listPrefixPatt(IEval p1, IEval p2) {
        return abs(listPrefixMatch(given(), p1, p2));
    }

    @Override
    default IEval intClosedInterval(IEval m, IEval n) {
        return (env, given) -> {
            int start = ((IInteger)m.eval(env, given)).intValue();
            int finish = ((IInteger)n.eval(env, given)).intValue();
            IListWriter lw = vf.listWriter();
            for (int i = start; i <= finish; i++) {
                lw.append(vf.integer(i));
            }
            return lw.done();
        };
    }

    @Override
    default IEval listReverse(IEval l) {
        return (env, given) -> ((IList)l.eval(env, given)).reverse();
    }

    @Override
    default IEval listAppend(IEval list1, IEval list2) {
        return (env, given) -> {
            IList l1 = (IList)list1.eval(env, given);
            IList l2 = (IList)list2.eval(env, given);
            return l1.concat(l2);
        };
    }

    @Override
    default IEval listHead(IEval list) {
        return (env, given) -> ((IList)list.eval(env, given)).get(0);
    }

    @Override
    default IEval listTail(IEval list) {
        return (env, given) -> {
            IList listVal = ((IList)list.eval(env, given));
            if (listVal.length() <= 1) {
                return vf.list();
            }
            return listVal.sublist(1, listVal.length() - 1);
        };
    }

    @Override
    default IEval listLength(IEval list) {
        return (env, given) ->
                vf.integer(((IList)list.eval(env, given)).length());
    }
}
