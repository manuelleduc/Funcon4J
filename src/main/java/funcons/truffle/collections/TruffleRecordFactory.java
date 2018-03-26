package funcons.truffle.collections;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.RecordAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.values.IntAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleRecordFactory extends
        PatternAlg<CLStatementNode>,
        BindingAlg<CLStatementNode>,
        MapAlg<CLStatementNode>,
        ListAlg<CLStatementNode>,
        IntAlg<CLStatementNode>,
        RecordAlg<CLStatementNode> {


    @Override
    default CLStatementNode record(CLStatementNode field, CLStatementNode val) {
//        return (env, given) -> {
//            IMapWriter mw = vf.mapWriter();
//            mw.put(field.eval(env, given),
//                    val.eval(env, given));
//            return mw.done();
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode field(java.lang.String name) {
//        return (env, given) -> vf.string(name);
        return null; // TODO
    }

    @Override
    default CLStatementNode recordSelect(CLStatementNode record, CLStatementNode field) {
//        return (env, given) ->
//                ((IMap) record.eval(env, given))
//                        .get(field.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode recordOver(CLStatementNode rec1, CLStatementNode rec2) {
//        return recordUnion(rec2, rec1);
        return null; // TODO
    }

    @Override
    default CLStatementNode recordUnion(CLStatementNode rec1, CLStatementNode rec2) {
//        return (env, given) ->
//                ((IMap) rec1.eval(env, given))
//                        .join(((IMap) rec2.eval(env, given)));
        return null; // TODO
    }

    @Override
    default CLStatementNode recordMatch(CLStatementNode rec, CLStatementNode pattMap) {
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
        return null; // TODO
    }
}

