package funcons.truffle.types;

import camllight.truffle.nodes.CLExecuteNode;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.types.TypeAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.NullAlg;

public interface TruffleTypeFactory extends
        BoolAlg<CLExecuteNode>,
        FunctionAlg<CLExecuteNode>,
        PatternAlg<CLExecuteNode>,
        ExceptionAlg<CLExecuteNode>,
        NullAlg<CLExecuteNode>,
        BindingAlg<CLExecuteNode>,
        TypeAlg<CLExecuteNode> {


    @Override
    default CLExecuteNode type(java.lang.String name) {
//        return (env, given) -> vf.string(name);
        throw new RuntimeException("Not implemented");

    }

    @Override
    default CLExecuteNode unknownType() {
//        return (env, given) -> vf.string("UnknownType");
        return new TypeUnknowTypeNode();
    }

    @Override
    default CLExecuteNode tag(java.lang.String name) {
//        return (env, given) -> vf.string(name);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode typeVar(java.lang.String name) {
//        return (env, given) -> vf.string(name);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode clVariant(java.lang.String tagName, CLExecuteNode exp) {
//        return (env, given) -> new CLVariant(vf.string(tagName), exp.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode meta(java.lang.String name) {
//        return (env, given) -> vf.string(name);
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode nomVal(CLExecuteNode nomTag, CLExecuteNode val) {
//        return (env, given) -> vf.tuple(nomTag.eval(env, given), val.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode nomTag(CLExecuteNode token) {
        return token;
    }

    @Override
    default CLExecuteNode nomValSelect(CLExecuteNode nomTag, CLExecuteNode nomVal) {
//        return (env, given) -> {
//            ITuple nVal = (ITuple) nomVal.eval(env, given);
//            return whenTrue(equal(nomTag, (e, g) -> nVal.get(0)), (e, g) -> nVal.get(1)).eval(env, given);
//        };
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode scopeNominalCoercion(CLExecuteNode type1, CLExecuteNode type2, CLExecuteNode abs) {
//        return apply(abs, nomTag(freshToken()));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode depends(CLExecuteNode type1, CLExecuteNode type2) {
//        return (env, given) ->
//                vf.tuple(
//                        type1.eval(env, given),
//                        type2.eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode typed(CLExecuteNode exp, CLExecuteNode type) {
        return exp;
    }

    @Override
    default CLExecuteNode boundType(CLExecuteNode id) {
        return null_(); // TODO evaluated statically?
    }

    @Override
    default CLExecuteNode freshToken() {
//        return (env, given) -> new Token();
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode newType(CLExecuteNode name) {
//        return (env, given) ->
//                vf.tuple(
//                        name.eval(env, given),
//                        freshToken().eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default CLExecuteNode typeDef(CLExecuteNode id, CLExecuteNode type) {
        return environment();
    }

    @Override
    default CLExecuteNode restrictDomain(CLExecuteNode abs, CLExecuteNode type) {
        return abs;
    }

    @Override
    default CLExecuteNode pattAtType(CLExecuteNode patt, CLExecuteNode type) {
        return restrictDomain(patt, type);
    }

    @Override
    default CLExecuteNode variantMatch(CLExecuteNode tag, CLExecuteNode variant, CLExecuteNode patt) {
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
}

