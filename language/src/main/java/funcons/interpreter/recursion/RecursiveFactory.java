package funcons.interpreter.recursion;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.carriers.IEval;
import funcons.values.recursion.Fwd;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IValue;

public interface RecursiveFactory extends
        NullAlg<IEval>,
        LogicControlAlg<IEval>,
        BindingAlg<IEval>,
        MapAlg<IEval>,
        ListAlg<IEval>,
        IntAlg<IEval>,
        RecursiveAlg<IEval> {

    @Override
    default IEval freshFwd() {
        return (env, given) -> new Fwd();
    }

    @Override
    default IEval freshFwds(IEval idList) {
        return (env, given) -> {
            IEval envEval = environment();
            IValue idListVal = idList.eval(env, given);
            int length = ((IInteger) listLength((e, g) -> idListVal).eval(env, given)).intValue();
            IValue undefined = undefined().eval(env, given);

            for (int i = 0; i < length; i++) {
                IValue id = projectList(lit(i), (e, g) -> idListVal).eval(env, given);
                Fwd fwd = (Fwd) freshFwd().eval(env, given);
                fwd.add(undefined);

                envEval = mapUpdate(envEval, (e, g) -> id, (e, g) -> fwd);
            }

            return envEval.eval(env, given);
        };
    }

    @Override
    default IEval setForwards(IEval idFwdMap) {
        return (env, given) -> {
            IValue mapVal = idFwdMap.eval(env, given);
            IValue mapKeys = mapDomain((e, g) -> mapVal).eval(env, given);
            int length = ((IInteger) listLength((e, g) -> mapKeys).eval(env, given)).intValue();

            for (int i = 0; i < length; i++) {
                IValue id = projectList(lit(i), (e, g) -> mapKeys).eval(env, given);
                IValue v = boundValue((e, g) -> id).eval(env, given);
                if (v == null) {
                    v = undefined().eval(env, given);
                }
                Fwd fwd = (Fwd) mapGet((e, g) -> mapVal, (e, g) -> id).eval(env, given);
                fwd.add(v);
            }

            return null_().eval(env, given);
        };
    }

    @Override
    default IEval reclose(IEval map, IEval decl) {
        return (env, given) -> {
            final IValue m = map.eval(env, given);
            return accum(scope((e, g) -> m, decl), seq(setForwards((e, g) -> m), environment())).eval(env, given);
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
        return (env, given) -> ((Fwd) fwd.eval(env, given)).follow();
    }

    @Override
    default IEval followIfFwd(IEval fwd) {
        return (env, given) -> {
            IValue v = fwd.eval(env, given);
            if (v instanceof Fwd) {
                return ((Fwd) v).follow();
            }
            return v;
        };
    }
}
