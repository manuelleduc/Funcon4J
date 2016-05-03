package funcons.interpreter;

import funcons.algebras.RecursiveAlg;
import funcons.sorts.IEval;
import funcons.values.List;
import funcons.values.Map;
import funcons.values.Undefined;
import funcons.values.ids.Id;
import funcons.values.recursion.Fwd;

public interface RecursiveFactory extends ListFactory, RecursiveAlg<IEval> {

    @Override
    default IEval freshFwd() {
        return (env, forward, store, given) -> forward.freshFwd();
    }

    @Override
    default IEval freshFwds(IEval idList) {
        return (env, forward, store, given) -> {
            null_();
            IEval envEval = environment();
            List list = (List)idList.eval(env, forward, store, given);
            Undefined undefined = (Undefined)undefined().eval(env, forward, store, given);

            while(list.head() != null) {
                Id id = (Id)list.head();
                Fwd fwd = (Fwd)freshFwd().eval(env, forward, store, given);

                forward.add(fwd, undefined);

                envEval = mapUpdate(envEval, (e,f,s,g) -> id, (e,f,s,g) -> fwd);

                list = list.tail();
            }

            return envEval.eval(env, forward, store, given);
        };
    }

    @Override
    default IEval setForwards(IEval idFwdMap) {
        return (env, forward, store, given) -> {
            Map map = (Map)idFwdMap.eval(env, forward, store, given);
            for (Object idObject : map.keys()) {
                Id id = (Id)idObject;
                @SuppressWarnings("unchecked")
                Fwd fwd = (Fwd)map.val(id);
                forward.add(fwd, env.val(id));
            }
            return null_().eval(env, forward, store, given);
        };
    }
}
