package funcons.interpreter.recursion;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.storage.EnvironmentAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.carriers.IEval;
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
        return (env, store, given) -> new Fwd();
    }

    @Override
    default IEval freshFwds(IEval idList) {
        return (env, store, given) -> {
            IEval envEval = environment();
            Value idListVal = idList.eval(env, store, given);
            int length = ((IInteger)listLength((e,s,g)->idListVal).eval(env, store, given)).intValue();
            Value undefined = undefined().eval(env, store, given);

            for (int i = 0; i < length; i++) {
                Value id = projectList(lit(i), (e,s,g)->idListVal).eval(env, store, given);
                Fwd fwd = (Fwd)freshFwd().eval(env, store, given);
                fwd.add(undefined);

                envEval = mapUpdate(envEval, (e,s,g) -> id, (e,s,g) -> fwd);
            }

            return envEval.eval(env, store, given);
        };
    }

    @Override
    default IEval setForwards(IEval idFwdMap) {
        return (env, store, given) -> {
            Value mapVal = idFwdMap.eval(env, store, given);
            Value mapKeys = mapDomain((e,s,g)->mapVal).eval(env, store, given);
            int length = ((IInteger)listLength((e,s,g)->mapKeys).eval(env, store, given)).intValue();

            for (int i = 0; i < length; i++) {
                Value id = projectList(lit(i), (e,s,g)->mapKeys).eval(env, store, given);
                Value v = boundValue((e,s,g)->id).eval(env, store, given);
                if (v == null) {
                    v = undefined().eval(env, store, given);
                }
                Fwd fwd = (Fwd)mapGet((e,s,g)->mapVal, (e,s,g)->id).eval(env, store, given);
                fwd.add(v);
            }

            return null_().eval(env, store, given);
        };
    }

    @Override
    default IEval reclose(IEval map, IEval decl) {
        return (env, store, given) -> {
            Value m = map.eval(env, store, given);
            return accum(scope((e,s,g) -> m, decl), seq(setForwards((e,s,g) -> m), environment())).eval(env, store, given);
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
        return (env, store, given) -> ((Fwd)fwd.eval(env, store, given)).follow();
    }

    @Override
    default IEval followIfFwd(IEval fwd) {
        return (env, store, given) -> {
            Value v = fwd.eval(env, store, given);
            if (v instanceof Fwd) {
                return ((Fwd)v).follow();
            }
            return v;
        };
    }
}
