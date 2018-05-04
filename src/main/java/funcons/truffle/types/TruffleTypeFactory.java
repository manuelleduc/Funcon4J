package funcons.truffle.types;

import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.types.TypeAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.truffle.nodes.FNCStatementNode;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface TruffleTypeFactory extends
        BoolAlg<FNCExecuteNode>,
        FunctionAlg<FNCExecuteNode>,
        PatternAlg<FNCExecuteNode>,
        ExceptionAlg<FNCExecuteNode>,
        NullAlg<FNCExecuteNode>,
        BindingAlg<FNCExecuteNode>,
        TypeAlg<FNCExecuteNode> {


    @Override
    default FNCExecuteNode type(java.lang.String name) {
        return new Type(name);

    }

    @Override
    default FNCExecuteNode unknownType() {
        return new UnknownType();
    }

    @Override
    default FNCExecuteNode tag(java.lang.String name) {
//        return (env, given) -> vf.string(name);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode typeVar(java.lang.String name) {
        return new TypeVar(name);
    }

    @Override
    default FNCExecuteNode clVariant(java.lang.String tagName, FNCExecuteNode exp) {
//        return (env, given) -> new CLVariant(vf.string(tagName), exp.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode meta(java.lang.String name) {
//        return (env, given) -> vf.string(name);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode nomVal(FNCExecuteNode nomTag, FNCExecuteNode val) {
//        return (env, given) -> vf.tuple(nomTag.eval(env, given), val.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode nomTag(FNCExecuteNode token) {
        return token;
    }

    @Override
    default FNCExecuteNode nomValSelect(FNCExecuteNode nomTag, FNCExecuteNode nomVal) {
//        return (env, given) -> {
//            ITuple nVal = (ITuple) nomVal.eval(env, given);
//            return whenTrue(equal(nomTag, (e, g) -> nVal.get(0)), (e, g) -> nVal.get(1)).eval(env, given);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode scopeNominalCoercion(FNCExecuteNode type1, FNCExecuteNode type2, FNCExecuteNode abs) {
//        return apply(abs, nomTag(freshToken()));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode depends(FNCExecuteNode type1, FNCExecuteNode type2) {
//        return (env, given) ->
//                vf.tuple(
//                        type1.eval(env, given),
//                        type2.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode typed(FNCExecuteNode exp, FNCExecuteNode type) {
        return exp;
    }

    @Override
    default FNCExecuteNode boundType(FNCExecuteNode id) {
        return null_(); // TODO evaluated statically?
    }

    @Override
    default FNCExecuteNode freshToken() {
//        return (env, given) -> new Token();
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode newType(FNCExecuteNode name) {
//        return (env, given) ->
//                vf.tuple(
//                        name.eval(env, given),
//                        freshToken().eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode typeDef(FNCExecuteNode id, FNCExecuteNode type) {
        return environment();
    }

    @Override
    default FNCExecuteNode restrictDomain(FNCExecuteNode abs, FNCExecuteNode type) {
        return abs;
    }

    @Override
    default FNCExecuteNode pattAtType(FNCExecuteNode patt, FNCExecuteNode type) {
        return restrictDomain(patt, type);
    }

    @Override
    default FNCExecuteNode variantMatch(FNCExecuteNode tag, FNCExecuteNode variant, FNCExecuteNode patt) {
//        return (env, given) -> {
//            IValue v = variant.eval(env, given);
//            if (v instanceof CLVariant) {
//                CLVariant vVar = (CLVariant) v;
//                return whenTrue(equal(tag, (e, g) -> vVar.tag()), match((e, g) -> vVar.value(), patt)).eval(env, given);
//            }
//            return fail().eval(env, given);
//        };
        throw new RuntimeException("Not implemented");
    }

    class UnknownType implements FNCExecuteNode {
        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new TypeUnknowTypeNode();
        }
    }

    class TypeVar implements FNCExecuteNode {
        private final String name;

        public TypeVar(String name) {
            this.name = name;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {

            return new TypeTypeVarNode(name);
        }

    }

    class Type implements FNCExecuteNode {
        private final String name;

        public Type(String name) {
            this.name = name;
        }

        @Override
        public FNCStatementNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new TypeTypeNode(name);
        }
    }
}

