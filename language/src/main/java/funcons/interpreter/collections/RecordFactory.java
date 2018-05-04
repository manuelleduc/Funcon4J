package funcons.interpreter.collections;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.RecordAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.values.IntAlg;
import funcons.carriers.IEval;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IMapWriter;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface RecordFactory extends
        PatternAlg<IEval>,
        BindingAlg<IEval>,
        MapAlg<IEval>,
        ListAlg<IEval>,
        IntAlg<IEval>,
        RecordAlg<IEval> {

    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval record(IEval field, IEval val) {
        return (env, given) -> {
            IMapWriter mw = vf.mapWriter();
            mw.put(field.eval(env, given),
                    val.eval(env, given));
            return mw.done();
        };
    }

    @Override
    default IEval field(java.lang.String name) {
        return (env, given) -> vf.string(name);
    }

    @Override
    default IEval recordSelect(IEval record, IEval field) {
        return (env, given) ->
                ((IMap)record.eval(env, given))
                        .get(field.eval(env, given));
    }

    @Override
    default IEval recordOver(IEval rec1, IEval rec2) {
        return recordUnion(rec2, rec1);
    }

    @Override
    default IEval recordUnion(IEval rec1, IEval rec2) {
        return (env, given) ->
                ((IMap)rec1.eval(env, given))
                        .join(((IMap)rec2.eval(env, given)));
    }

    @Override
    default IEval recordMatch(IEval rec, IEval pattMap) {
        return (env, given) -> {
            IMap recVal = (IMap)rec.eval(env, given);
            IValue pattMapVal = pattMap.eval(env, given);
            IValue environment = environment().eval(env, given);

            IValue fields = mapDomain((e,g)->pattMapVal).eval(env, given);
            int length = ((IInteger)listLength((e,g)->fields).eval(env, given)).intValue();

            for (int i = 0; i < length; i++) {
                IValue environment2 = environment;
                IValue field = projectList(lit(i), (e,g)->fields).eval(env, given);
                environment = mapUnion(
                        (e,g)->environment2,
                        match(
                                recordSelect((e,g)->recVal, (e,g)->field),
                                mapGet((e,g)->pattMapVal, (e,g)->field)
                        )
                ).eval(env, given);
            }

            return environment;
        };
    }
}
