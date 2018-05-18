package funcons.truffle.collections;

import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.RecordAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.values.IntAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface TruffleRecordFactory extends
        PatternAlg<FNCExecuteNode>,
        BindingAlg<FNCExecuteNode>,
        MapAlg<FNCExecuteNode>,
        ListAlg<FNCExecuteNode>,
        IntAlg<FNCExecuteNode>,
        RecordAlg<FNCExecuteNode> {


    IValueFactory vf = ValueFactory.getInstance();

    @Override
    default FNCExecuteNode record(FNCExecuteNode field, FNCExecuteNode val) {
//        return (env, given) -> {
//            IMapWriter mw = vf.mapWriter();
//            mw.put(field.eval(env, given),
//                    val.eval(env, given));
//            return mw.done();
//        };
        return new Record(field, val);
    }

    @Override
    default FNCExecuteNode field(java.lang.String name) {
        return new Field(name);
    }

    @Override
    default FNCExecuteNode recordSelect(FNCExecuteNode record, FNCExecuteNode field) {
//        return (env, given) ->
//                ((IMap) record.eval(env, given))
//                        .get(field.eval(env, given));
        return l -> new RecordRecordSelectNode(record.buildAST(l), field.buildAST(l));
    }

    @Override
    default FNCExecuteNode recordOver(FNCExecuteNode rec1, FNCExecuteNode rec2) {
//        return recordUnion(rec2, rec1);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode recordUnion(FNCExecuteNode rec1, FNCExecuteNode rec2) {

        return new RecordUnion(rec1, rec2);
    }

    @Override
    default FNCExecuteNode recordMatch(FNCExecuteNode rec, FNCExecuteNode pattMap) {
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
            return null;
        };
    }

    class RecordMatch implements FNCExecuteNode {


        private final FNCExecuteNode rec;
        private final FNCExecuteNode pattMap;

        public RecordMatch(FNCExecuteNode rec, FNCExecuteNode pattMap) {
            this.rec = rec;
            this.pattMap = pattMap;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new RecordRecordMatchNode(this.rec.buildAST(l), this.pattMap.buildAST(l));
        }
    }

    class Field implements FNCExecuteNode {
        private final String name;

        public Field(String name) {
            this.name = name;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new RecordFieldNode(name);
        }
    }

    class Record implements FNCExecuteNode {
        private final FNCExecuteNode field;
        private final FNCExecuteNode val;

        public Record(FNCExecuteNode field, FNCExecuteNode val) {
            this.field = field;
            this.val = val;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new RecordRecordNode(this.field.buildAST(l), this.val.buildAST(l));
        }
    }

    class RecordUnion implements FNCExecuteNode {
        private final FNCExecuteNode rec1;
        private final FNCExecuteNode rec2;

        public RecordUnion(FNCExecuteNode rec1, FNCExecuteNode rec2) {
            this.rec1 = rec1;
            this.rec2 = rec2;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new RecordRecordUnionNode(this.rec1.buildAST(l), this.rec2.buildAST(l));
        }
    }
}

