package funcons.interpreter;

import funcons.algebras.TypeAlg;
import funcons.sorts.IEval;
import funcons.values.Environment;
import funcons.values.Int;
import funcons.values.ids.Meta;
import funcons.values.ids.TypeVar;
import funcons.values.types.*;

public interface TypeFactory extends ListFactory, TypeAlg<IEval> {
    @Override
    default IEval type(java.lang.String name) {
        return (env, store, given) -> new Type(name);
    }

    @Override
    default IEval tag(java.lang.String name) {
        return (env, store, given) -> new Tag(name);
    }

    @Override
    default IEval typeVar(java.lang.String name) {
        return (env, store, given) -> new TypeVar(name);
    }

    @Override
    default IEval variant(java.lang.String tagName, IEval exp) {
        return (env, store, given) -> new Variant(tagName, exp.eval(env, store, given));
    }

    @Override
    default IEval meta(java.lang.String name) {
        return (env, store, given) -> new Meta(name);
    }

    @Override
    default IEval nomVal(IEval nomTag, IEval val) {
        return (env, store, given) -> new NominalVal((NominalTag)nomTag.eval(env, store, given), val.eval(env, store, given));
    }

    @Override
    default IEval nomTag(IEval token) {
        return (env, store, given) -> new NominalTag((Token)token.eval(env, store, given));
    }

    @Override
    default IEval nomValSelect(IEval nomTag, IEval nomVal) {
        return (env, store, given) -> {
            NominalVal nVal = (NominalVal)nomVal.eval(env, store, given);
            return whenTrue(equal(nomTag, (e,s,g) -> nVal.tag()), (e,s,g) -> nVal.val()).eval(env, store, given);
        };
    }

    @Override
    default IEval scopeNominalCoercion(IEval type1, IEval type2, IEval abs) {
        return apply(abs, nomTag(freshToken()));
    }

    @Override
    default IEval depends(IEval type1, IEval type2) {
        return (env, store, given) -> new Depends((Type)type1.eval(env, store, given), (Type)type2.eval(env, store, given));
    }

    @Override
    default IEval typed(IEval exp, IEval type) {
        return exp;
    }

    @Override
    default IEval tupleType() {
        return (env, store, given) -> new TupleType();
    }

    @Override
    default IEval tupleType(IEval x) {
        return (env, store, given) -> new TupleType((Type)x.eval(env, store, given));
    }

    @Override
    default IEval tupleType(IEval x1, IEval x2) {
        return (env, store, given) -> new TupleType(
                (Type)x1.eval(env, store, given),
                (Type)x2.eval(env, store, given));
    }

    @Override
    default IEval tupleType(IEval x1, IEval x2, IEval x3) {
        return (env, store, given) -> new TupleType(
                (Type)x1.eval(env, store, given),
                (Type)x2.eval(env, store, given),
                (Type)x3.eval(env, store, given));
    }

    @Override
    default IEval tupleTypePrefix(IEval x, IEval tup) {
        return (env, store, given) -> {
            TupleType tt = (TupleType)tup.eval(env, store, given);
            Type t = (Type)x.eval(env, store, given);
            return tt.prepend(t);
        };
    }

    @Override
    default IEval projectType(IEval index, IEval tup) {
        return (env, store, given) -> {
            TupleType tt = (TupleType)tup.eval(env, store, given);
            Int i = (Int)index.eval(env, store, given);
            return tt.get(i);
        };
    }

    @Override
    default IEval boundType(IEval id) {
        return null_(); // TODO evaluated statically?
    }

    @Override
    default IEval freshToken() {
        return (env, store, given) -> new Token();
    }

    @Override
    default IEval newType(IEval name) {
        return (env, store, given) -> new NominalType(name.eval(env, store, given), (Token)freshToken().eval(env, store, given));
    }

    @Override
    default IEval typeDef(IEval id, IEval type) {
        return (env, store, given) -> new Environment();
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
        return (env, store, given) -> {
            Variant v = (Variant)variant.eval(env, store, given);
            return whenTrue(equal(tag, (e,s,g) -> v.tag), match((e,s,g) -> v.value, patt)).eval(env, store, given);
        };
    }
}
