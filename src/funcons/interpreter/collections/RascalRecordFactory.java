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

public interface RascalRecordFactory extends
        PatternAlg<IEval>,
        EnvironmentAlg<IEval>,
        MapAlg<IEval>,
        ListAlg<IEval>,
        IntAlg<IEval>,
        RecordAlg<IEval> {

    ValueFactory vf = ValueFactory.getInstance();

    @Override
    default IEval record(IEval field, IEval val) {
        return (env, forwards, store, given) -> {
            IMapWriter mw = vf.mapWriter();
            mw.put((IValue)field.eval(env, forwards, store, given),
                    (IValue)val.eval(env, forwards, store, given));
            return mw.done();
        };
    }

    @Override
    default IEval field(java.lang.String name) {
        return (env, forwards, store, given) -> vf.string(name);
    }

    @Override
    default IEval recordSelect(IEval record, IEval field) {
        return (env, forwards, store, given) ->
                ((IMap)record.eval(env, forwards, store, given))
                        .get((IValue)field.eval(env, forwards, store, given));
    }

    @Override
    default IEval recordOver(IEval rec1, IEval rec2) {
        return recordUnion(rec2, rec1);
    }

    @Override
    default IEval recordUnion(IEval rec1, IEval rec2) {
        return (env, forwards, store, given) ->
                ((IMap)rec1.eval(env, forwards, store, given))
                        .join(((IMap)rec2.eval(env, forwards, store, given)));
    }

    @Override
    default IEval recordMatch(IEval rec, IEval pattMap) {
        return (env, forwards, store, given) -> {
            IMap recVal = (IMap)rec.eval(env, forwards, store, given);
            IValue pattMapVal = (IValue)pattMap.eval(env, forwards, store, given);
            Value environment = environment().eval(env, forwards, store, given);

            IValue fields = (IValue)mapDomain((e,f,s,g)->pattMapVal).eval(env, forwards, store, given);
            int length = ((IInteger)listLength((e, f, s, g)->fields).eval(env, forwards, store, given)).intValue();

            for (int i = 0; i < length; i++) {
                Value environment2 = environment;
                IValue field = (IValue)projectList(lit(i), (e,f,s,g)->fields).eval(env, forwards, store, given);
                environment = mapUnion(
                        (e,f,s,g)->environment2,
                        match(
                                recordSelect((e,f,s,g)->recVal, (e,f,s,g)->field),
                                mapGet((e,f,s,g)->pattMapVal, (e,f,s,g)->field)
                        )
                ).eval(env, forwards, store, given);
            }

            return environment;
        };
    }
}
