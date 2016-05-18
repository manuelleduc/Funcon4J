package funcons.interpreter;

import funcons.algebras.RecordAlg;
import funcons.carriers.IEval;
import funcons.values.Field;
import funcons.values.Map;
import funcons.values.Record;
import funcons.values.Value;

public interface RecordFactory extends RecursiveFactory, RecordAlg<IEval> {
    @Override
    default IEval record(IEval field, IEval val) {
        return (env, forward, store, given) -> {
            Field f = (Field)field.eval(env, forward, store, given);
            Value v = val.eval(env, forward, store, given);
            return new Record(new Map<>(f, v));
        };
    }

    @Override
    default IEval field(String name) {
        return (env, forward, store, given) -> new Field(name);
    }

    @Override
    default IEval recordSelect(IEval record, IEval field) {
        return (env, forward, store, given) -> {
            Record r = (Record)record.eval(env, forward, store, given);
            Field f = (Field)field.eval(env, forward, store, given);
            return r.select(f);
        };
    }

    @Override
    default IEval recordOver(IEval rec1, IEval rec2) {
        return (env, forward, store, given) -> {
            Record r1 = (Record)rec1.eval(env, forward, store, given);
            Record r2 = (Record)rec2.eval(env, forward, store, given);
            return r1.over(r2);
        };
    }

    @Override
    default IEval recordUnion(IEval rec1, IEval rec2) {
        return (env, forward, store, given) -> {
            Record r1 = (Record)rec1.eval(env, forward, store, given);
            Record r2 = (Record)rec2.eval(env, forward, store, given);
            return r1.union(r2);
        };
    }
}
