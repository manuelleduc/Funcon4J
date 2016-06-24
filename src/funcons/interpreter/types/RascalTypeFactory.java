package funcons.interpreter.types;

import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.storage.EnvironmentAlg;
import funcons.algebras.types.TypeAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.NullAlg;
import funcons.carriers.IEval;
import funcons.values.cl.RascalCLVariant;
import funcons.values.ids.Meta;
import funcons.values.ids.TypeVar;
import funcons.values.types.Token;
import org.rascalmpl.value.ITuple;
import org.rascalmpl.value.IValue;
import org.rascalmpl.value.impl.fast.ValueFactory;

public interface RascalTypeFactory extends
        BoolAlg<IEval>,
        FunctionAlg<IEval>,
        PatternAlg<IEval>,
        ExceptionAlg<IEval>,
        NullAlg<IEval>,
        EnvironmentAlg<IEval>,
        TypeAlg<IEval> {

        ValueFactory vf = ValueFactory.getInstance();

        @Override
        default IEval type(java.lang.String name) {
            return (env, forward, store, given) -> vf.string(name);
        }

        @Override
        default IEval unknownType() {
            return (env, forward, store, given) -> vf.string("UnknownType");
        }

        @Override
        default IEval tag(java.lang.String name) {
            return (env, forward, store, given) -> vf.string(name);
        }

        @Override
        default IEval typeVar(java.lang.String name) {
            return (env, forward, store, given) -> new TypeVar(name);
        }

        @Override
        default IEval clVariant(java.lang.String tagName, IEval exp) {
            return (env, forward, store, given) -> new RascalCLVariant(vf.string(tagName), exp.eval(env, forward, store, given));
        }

        @Override
        default IEval meta(java.lang.String name) {
            return (env, forward, store, given) -> new Meta(name);
        }

        @Override
        default IEval nomVal(IEval nomTag, IEval val) {
            return (env, forward, store, given) ->
                    vf.tuple((IValue)nomTag.eval(env, forward, store, given), (IValue)val.eval(env, forward, store, given));
        }

        @Override
        default IEval nomTag(IEval token) {
            return token;
        }

        @Override
        default IEval nomValSelect(IEval nomTag, IEval nomVal) {
            return (env, forward, store, given) -> {
                ITuple nVal = (ITuple)nomVal.eval(env, forward, store, given);
                return whenTrue(equal(nomTag, (e,f,s,g) -> nVal.get(0)), (e,f,s,g) -> nVal.get(1)).eval(env, forward, store, given);
            };
        }

        @Override
        default IEval scopeNominalCoercion(IEval type1, IEval type2, IEval abs) {
            return apply(abs, nomTag(freshToken()));
        }

        @Override
        default IEval depends(IEval type1, IEval type2) {
            return (env, forward, store, given) ->
                    vf.tuple(
                            (IValue)type1.eval(env, forward, store, given),
                            (IValue)type2.eval(env, forward, store, given));
        }

        @Override
        default IEval typed(IEval exp, IEval type) {
            return exp;
        }

        @Override
        default IEval boundType(IEval id) {
            return null_(); // TODO evaluated statically?
        }

        @Override
        default IEval freshToken() {
            return (env, forward, store, given) -> new Token();
        }

        @Override
        default IEval newType(IEval name) {
            return (env, forward, store, given) ->
                    vf.tuple(
                            (IValue)name.eval(env, forward, store, given),
                            (IValue)freshToken().eval(env, forward, store, given));
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
            return (env, forward, store, given) -> {
                try {
                    RascalCLVariant v = (RascalCLVariant)variant.eval(env, forward, store, given);
                    return whenTrue(equal(tag, (e, f, s, g) -> v.tag()), match((e, f, s, g) -> v.value(), patt)).eval(env, forward, store, given);
                } catch (ClassCastException e) {
                    return fail().eval(env, forward, store, given);
                }
            };
        }
}
