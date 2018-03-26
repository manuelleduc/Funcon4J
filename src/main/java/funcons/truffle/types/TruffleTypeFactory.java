package funcons.truffle.types;

import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.types.TypeAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.CLStatementNode;

public interface TruffleTypeFactory extends
        BoolAlg<CLStatementNode>,
        FunctionAlg<CLStatementNode>,
        PatternAlg<CLStatementNode>,
        ExceptionAlg<CLStatementNode>,
        NullAlg<CLStatementNode>,
        BindingAlg<CLStatementNode>,
        TypeAlg<CLStatementNode> {


    @Override
    default CLStatementNode type(java.lang.String name) {
//        return (env, given) -> vf.string(name);
        return null; // TODO
    }

    @Override
    default CLStatementNode unknownType() {
//        return (env, given) -> vf.string("UnknownType");
        return null; // TODO
    }

    @Override
    default CLStatementNode tag(java.lang.String name) {
//        return (env, given) -> vf.string(name);
        return null; // TODO
    }

    @Override
    default CLStatementNode typeVar(java.lang.String name) {
//        return (env, given) -> vf.string(name);
        return null; // TODO
    }

    @Override
    default CLStatementNode clVariant(java.lang.String tagName, CLStatementNode exp) {
//        return (env, given) -> new CLVariant(vf.string(tagName), exp.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode meta(java.lang.String name) {
//        return (env, given) -> vf.string(name);
        return null; // TODO
    }

    @Override
    default CLStatementNode nomVal(CLStatementNode nomTag, CLStatementNode val) {
//        return (env, given) -> vf.tuple(nomTag.eval(env, given), val.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode nomTag(CLStatementNode token) {
        return token;
    }

    @Override
    default CLStatementNode nomValSelect(CLStatementNode nomTag, CLStatementNode nomVal) {
//        return (env, given) -> {
//            ITuple nVal = (ITuple) nomVal.eval(env, given);
//            return whenTrue(equal(nomTag, (e, g) -> nVal.get(0)), (e, g) -> nVal.get(1)).eval(env, given);
//        };
        return null; // TODO
    }

    @Override
    default CLStatementNode scopeNominalCoercion(CLStatementNode type1, CLStatementNode type2, CLStatementNode abs) {
//        return apply(abs, nomTag(freshToken()));
        return null; // TODO
    }

    @Override
    default CLStatementNode depends(CLStatementNode type1, CLStatementNode type2) {
//        return (env, given) ->
//                vf.tuple(
//                        type1.eval(env, given),
//                        type2.eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode typed(CLStatementNode exp, CLStatementNode type) {
        return exp;
    }

    @Override
    default CLStatementNode boundType(CLStatementNode id) {
        return null_(); // TODO evaluated statically?
    }

    @Override
    default CLStatementNode freshToken() {
//        return (env, given) -> new Token();
        return null; // TODO
    }

    @Override
    default CLStatementNode newType(CLStatementNode name) {
//        return (env, given) ->
//                vf.tuple(
//                        name.eval(env, given),
//                        freshToken().eval(env, given));
        return null; // TODO
    }

    @Override
    default CLStatementNode typeDef(CLStatementNode id, CLStatementNode type) {
        return environment();
    }

    @Override
    default CLStatementNode restrictDomain(CLStatementNode abs, CLStatementNode type) {
        return abs;
    }

    @Override
    default CLStatementNode pattAtType(CLStatementNode patt, CLStatementNode type) {
        return restrictDomain(patt, type);
    }

    @Override
    default CLStatementNode variantMatch(CLStatementNode tag, CLStatementNode variant, CLStatementNode patt) {
//        return (env, given) -> {
//            IValue v = variant.eval(env, given);
//            if (v instanceof CLVariant) {
//                CLVariant vVar = (CLVariant) v;
//                return whenTrue(equal(tag, (e, g) -> vVar.tag()), match((e, g) -> vVar.value(), patt)).eval(env, given);
//            }
//            return fail().eval(env, given);
//        };
        return null; // TODO
    }
}

