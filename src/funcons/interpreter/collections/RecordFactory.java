package funcons.interpreter.collections;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.RecordAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.storage.EnvironmentAlg;
import funcons.algebras.values.IntAlg;
import funcons.carriers.IEval;
import funcons.values.properties.Value;
import org.rascalmpl.value.IInteger;
import org.rascalmpl.value.IMap;
import org.rascalmpl.value.IMapWriter;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface RecordFactory extends
        PatternAlg<IEval>,
        EnvironmentAlg<IEval>,
        MapAlg<IEval>,
        ListAlg<IEval>,
        IntAlg<IEval>,
        RecordAlg<IEval> {

    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval record(IEval field, IEval val) {
        return (env, store, given) -> {
            IMapWriter mw = vf.mapWriter();
            mw.put((IValue)field.eval(env, store, given),
                    (IValue)val.eval(env, store, given));
            return mw.done();
        };
    }

    @Override
    default IEval field(java.lang.String name) {
        return (env, store, given) -> vf.string(name);
    }

    @Override
    default IEval recordSelect(IEval record, IEval field) {
        return (env, store, given) ->
                ((IMap)record.eval(env, store, given))
                        .get((IValue)field.eval(env, store, given));
    }

    @Override
    default IEval recordOver(IEval rec1, IEval rec2) {
        return recordUnion(rec2, rec1);
    }

    @Override
    default IEval recordUnion(IEval rec1, IEval rec2) {
        return (env, store, given) ->
                ((IMap)rec1.eval(env, store, given))
                        .join(((IMap)rec2.eval(env, store, given)));
    }

    @Override
    default IEval recordMatch(IEval rec, IEval pattMap) {
        return (env, store, given) -> {
            IMap recVal = (IMap)rec.eval(env, store, given);
            IValue pattMapVal = (IValue)pattMap.eval(env, store, given);
            Value environment = environment().eval(env, store, given);

            IValue fields = (IValue)mapDomain((e,s,g)->pattMapVal).eval(env, store, given);
            int length = ((IInteger)listLength((e,s,g)->fields).eval(env, store, given)).intValue();

            for (int i = 0; i < length; i++) {
                Value environment2 = environment;
                IValue field = (IValue)projectList(lit(i), (e,s,g)->fields).eval(env, store, given);
                environment = mapUnion(
                        (e,s,g)->environment2,
                        match(
                                recordSelect((e,s,g)->recVal, (e,s,g)->field),
                                mapGet((e,s,g)->pattMapVal, (e,s,g)->field)
                        )
                ).eval(env, store, given);
            }

            return environment;
        };
    }
}
