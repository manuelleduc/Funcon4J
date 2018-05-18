package funcons.truffle.collections;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.RecordAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.values.IntAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface TruffleRecordFactory extends
        PatternAlg<FNCBuildAST>,
        BindingAlg<FNCBuildAST>,
        MapAlg<FNCBuildAST>,
        ListAlg<FNCBuildAST>,
        IntAlg<FNCBuildAST>,
        RecordAlg<FNCBuildAST> {


    IValueFactory vf = ValueFactory.getInstance();

    @Override
    default FNCBuildAST record(FNCBuildAST field, FNCBuildAST val) {
//        return (env, given) -> {
//            IMapWriter mw = vf.mapWriter();
//            mw.put(field.eval(env, given),
//                    val.eval(env, given));
//            return mw.done();
//        };
        return new Record(field, val);
    }

    @Override
    default FNCBuildAST field(java.lang.String name) {
        return new Field(name);
    }

    @Override
    default FNCBuildAST recordSelect(FNCBuildAST record, FNCBuildAST field) {
//        return (env, given) ->
//                ((IMap) record.eval(env, given))
//                        .get(field.eval(env, given));
        return l -> new RecordRecordSelectNode(record.buildAST(l), field.buildAST(l));
    }

    @Override
    default FNCBuildAST recordOver(FNCBuildAST rec1, FNCBuildAST rec2) {
//        return recordUnion(rec2, rec1);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST recordUnion(FNCBuildAST rec1, FNCBuildAST rec2) {

        return new RecordUnion(rec1, rec2);
    }

    @Override
    default FNCBuildAST recordMatch(FNCBuildAST rec, FNCBuildAST pattMap) {
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
        // TODO
        return l -> {
            // TODO: implement
            throw new RuntimeException("Not Implemented");
        };
    }

    class RecordMatch implements FNCBuildAST {


        private final FNCBuildAST rec;
        private final FNCBuildAST pattMap;

        public RecordMatch(FNCBuildAST rec, FNCBuildAST pattMap) {
            this.rec = rec;
            this.pattMap = pattMap;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new RecordRecordMatchNode(this.rec.buildAST(l), this.pattMap.buildAST(l));
        }
    }

    class Field implements FNCBuildAST {
        private final String name;

        public Field(String name) {
            this.name = name;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new RecordFieldNode(name);
        }
    }

    class Record implements FNCBuildAST {
        private final FNCBuildAST field;
        private final FNCBuildAST val;

        public Record(FNCBuildAST field, FNCBuildAST val) {
            this.field = field;
            this.val = val;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new RecordRecordNode(this.field.buildAST(l), this.val.buildAST(l));
        }
    }

    class RecordUnion implements FNCBuildAST {
        private final FNCBuildAST rec1;
        private final FNCBuildAST rec2;

        public RecordUnion(FNCBuildAST rec1, FNCBuildAST rec2) {
            this.rec1 = rec1;
            this.rec2 = rec2;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new RecordRecordUnionNode(this.rec1.buildAST(l), this.rec2.buildAST(l));
        }
    }
}

