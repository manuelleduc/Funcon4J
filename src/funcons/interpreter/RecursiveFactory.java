package funcons.interpreter;

import funcons.algebras.RecursiveAlg;
import funcons.sorts.IEval;
import funcons.values.List;
import funcons.values.ids.Id;
import funcons.values.recursion.Forwards;
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

            while(list.head() != null) {
                Id id = (Id)list.head();
                Fwd fwd = (Fwd)freshFwd().eval(env, forward, store, given);

                Forwards oldForward = forward;
                forward = (Forwards)mapUpdate((e,f,s,g) -> oldForward, (e,f,s,g) -> fwd, undefined()).eval(env, forward, store, given);

                envEval = mapUpdate(envEval, (e,f,s,g) -> id, (e,f,s,g) -> fwd);

                list = list.tail();
            }

            return envEval.eval(env, forward, store, given);
        };
    }
}
