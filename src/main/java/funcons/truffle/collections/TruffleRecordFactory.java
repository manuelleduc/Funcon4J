package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.RecordAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.values.IntAlg;

public interface TruffleRecordFactory extends
        PatternAlg<CLExecuteNode>,
        BindingAlg<CLExecuteNode>,
        MapAlg<CLExecuteNode>,
        ListAlg<CLExecuteNode>,
        IntAlg<CLExecuteNode>,
        RecordAlg<CLExecuteNode> {


    @Override
    default CLExecuteNode record(CLExecuteNode field, CLExecuteNode val) {
//        return (env, given) -> {
//            IMapWriter mw = vf.mapWriter();
//            mw.put(field.eval(env, given),
//                    val.eval(env, given));
//            return mw.done();
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode field(java.lang.String name) {
//        return (env, given) -> vf.string(name);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode recordSelect(CLExecuteNode record, CLExecuteNode field) {
//        return (env, given) ->
//                ((IMap) record.eval(env, given))
//                        .get(field.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode recordOver(CLExecuteNode rec1, CLExecuteNode rec2) {
//        return recordUnion(rec2, rec1);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode recordUnion(CLExecuteNode rec1, CLExecuteNode rec2) {
//        return (env, given) ->
//                ((IMap) rec1.eval(env, given))
//                        .join(((IMap) rec2.eval(env, given)));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode recordMatch(CLExecuteNode rec, CLExecuteNode pattMap) {
//        return (env, given) -> {
//            IMap recVal = (IMap) rec.eval(env, given);
//            IValue pattMapVal = pattMap.eval(env, given);
//            IValue environment = environment().eval(env, given);
//
//            IValue fields = mapDomain((e, g) -> pattMapVal).eval(env, given);
//            int length = ((IInteger) listLength((e, g) -> fields).eval(env, given)).intValue();
//
//            for (int i = 0; i < length; i++) {
//                IValue environment2 = environment;
//                IValue field = projectList(lit(i), (e, g) -> fields).eval(env, given);
//                environment = mapUnion(
//                        (e, g) -> environment2,
//                        match(
//                                recordSelect((e, g) -> recVal, (e, g) -> field),
//                                mapGet((e, g) -> pattMapVal, (e, g) -> field)
//                        )
//                ).eval(env, given);
//            }
//
//            return environment;
//        };
        throw new RuntimeException("Not implemented");
    }
}

