package funcons.interpreter.types;

import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.types.TypeAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.NullAlg;
import funcons.carriers.IEval;
import funcons.values.cl.CLVariant;
import funcons.values.types.Token;
import io.usethesource.vallang.ITuple;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface TypeFactory extends
        BoolAlg<IEval>,
        FunctionAlg<IEval>,
        PatternAlg<IEval>,
        ExceptionAlg<IEval>,
        NullAlg<IEval>,
        BindingAlg<IEval>,
        TypeAlg<IEval> {

        ValueFactory vf = ValueFactory.getInstance();

        @Override
        default IEval type(java.lang.String name) {
            return (env, given) -> vf.string(name);
        }

        @Override
        default IEval unknownType() {
            return (env, given) -> vf.string("UnknownType");
        }

        @Override
        default IEval tag(java.lang.String name) {
            return (env, given) -> vf.string(name);
        }

        @Override
        default IEval typeVar(java.lang.String name) {
            return (env, given) -> vf.string(name);
        }

        @Override
        default IEval clVariant(java.lang.String tagName, IEval exp) {
            return (env, given) -> new CLVariant(vf.string(tagName), exp.eval(env, given));
        }

        @Override
        default IEval meta(java.lang.String name) {
            return (env, given) -> vf.string(name);
        }

        @Override
        default IEval nomVal(IEval nomTag, IEval val) {
            return (env, given) -> vf.tuple(nomTag.eval(env, given), val.eval(env, given));
        }

        @Override
        default IEval nomTag(IEval token) {
            return token;
        }

        @Override
        default IEval nomValSelect(IEval nomTag, IEval nomVal) {
            return (env, given) -> {
                ITuple nVal = (ITuple)nomVal.eval(env, given);
                return whenTrue(equal(nomTag, (e,g) -> nVal.get(0)), (e,g) -> nVal.get(1)).eval(env, given);
            };
        }

        @Override
        default IEval scopeNominalCoercion(IEval type1, IEval type2, IEval abs) {
            return apply(abs, nomTag(freshToken()));
        }

        @Override
        default IEval depends(IEval type1, IEval type2) {
            return (env, given) ->
                    vf.tuple(
                            type1.eval(env, given),
                            type2.eval(env, given));
        }

        @Override
        default IEval typed(IEval exp, IEval type) {
            return exp;
        }

        @Override
        default IEval boundType(IEval id) {
            return null_(); // TODO.executeGenericd statically?
        }

        @Override
        default IEval freshToken() {
            return (env, given) -> new Token();
        }

        @Override
        default IEval newType(IEval name) {
            return (env, given) ->
                    vf.tuple(
                            name.eval(env, given),
                            freshToken().eval(env, given));
        }

        @Override
        default IEval typeDef(IEval id, IEval type) {
            return environment();
        }

        @Override
        default IEval restrictDomain(IEval abs, IEval type) {
            return abs;
        }

        @Override
        default IEval pattAtType(IEval patt, IEval type) {
            return restrictDomain(patt, type);
        }

        @Override
        default IEval variantMatch(IEval tag, IEval variant, IEval patt) {
            return (env, given) -> {
                IValue v = variant.eval(env, given);
                if (v instanceof CLVariant) {
                    CLVariant vVar  = (CLVariant)v;
                    return whenTrue(equal(tag, (e,g) -> vVar.tag()), match((e,g) -> vVar.value(), patt)).eval(env, given);
                }
                return fail().eval(env, given);
            };
        }
}
