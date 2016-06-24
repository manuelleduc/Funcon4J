package funcons.interpreter.recursion;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.storage.EnvironmentAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.carriers.IEval;
import funcons.values.Undefined;
import funcons.values.properties.Value;
import funcons.values.recursion.Fwd;
import org.rascalmpl.value.IInteger;

public interface RecursiveFactory extends
        NullAlg<IEval>,
        LogicControlAlg<IEval>,
        EnvironmentAlg<IEval>,
        MapAlg<IEval>,
        ListAlg<IEval>,
        IntAlg<IEval>,
        RecursiveAlg<IEval> {

    @Override
    default IEval freshFwd() {
        return (env, forward, store, given) -> forward.freshFwd();
    }

    @Override
    default IEval freshFwds(IEval idList) {
        return (env, forward, store, given) -> {
            IEval envEval = environment();
            Value idListVal = idList.eval(env, forward, store, given);
            int length = ((IInteger)listLength((e, f, s, g)->idListVal).eval(env, forward, store, given)).intValue();
            Value undefined = undefined().eval(env, forward, store, given);

            for (int i = 0; i < length; i++) {
                Value id = projectList(lit(i), (e,f,s,g)->idListVal).eval(env, forward, store, given);
                Value fwd = freshFwd().eval(env, forward, store, given);
                forward.add((Fwd)fwd, undefined);

                envEval = mapUpdate(envEval, (e,f,s,g) -> id, (e,f,s,g) -> fwd);
            }

            return envEval.eval(env, forward, store, given);
        };
    }

    @Override
    default IEval setForwards(IEval idFwdMap) {
        return (env, forward, store, given) -> {
            Value mapVal = idFwdMap.eval(env, forward, store, given);
            Value mapKeys = mapDomain((e,f,s,g)->mapVal).eval(env, forward, store, given);
            int length = ((IInteger)listLength((e,f,s,g)->mapKeys).eval(env, forward, store, given)).intValue();

            for (int i = 0; i < length; i++) {
                Value id = projectList(lit(i), (e,f,s,g)->mapKeys).eval(env, forward, store, given);
                Value v = boundValue((e,f,s,g)->id).eval(env, forward, store, given);
                if (v == null) {
                    v = new Undefined();
                }
                Value fwd = mapGet((e,f,s,g)->mapVal, (e,f,s,g)->id).eval(env, forward, store, given);
                forward.add((Fwd)fwd, v);
            }

            return null_().eval(env, forward, store, given);
        };
    }

    @Override
    default IEval reclose(IEval map, IEval decl) {
        return (env, forward, store, given) -> {
            Value m = map.eval(env, forward, store, given);
            return accum(scope((e,s,f,g) -> m, decl), seq(setForwards((e,s,f,g) -> m), environment())).eval(env, forward, store, given);
        };
    }

    @Override
    default IEval recursive(IEval idList, IEval decl) {
        return reclose(freshFwds(idList), decl);
    }

    @Override
    default IEval recursiveTyped(IEval idTypeMap, IEval decl) {
        return recursive(mapDomain(idTypeMap), decl);
    }

    @Override
    default IEval followFwd(IEval fwd) {
        return (env, forward, store, given) -> forward.follow((Fwd)fwd.eval(env, forward, store, given));
    }

    @Override
    default IEval followIfFwd(IEval fwd) {
        return (env, forward, store, given) -> {
            Value v = fwd.eval(env, forward, store, given);
            try {
                return forward.follow((Fwd)v);
            } catch (ClassCastException ignore) {
                return v;
            }
        };
    }
}
