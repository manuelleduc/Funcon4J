package funcons.truffle.types;

import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.types.TypeAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.cl.CLVariant;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.ITuple;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.IValueFactory;
import io.usethesource.vallang.impl.persistent.ValueFactory;

public interface TruffleTypeFactory extends
        BoolAlg<FNCBuildAST>,
        FunctionAlg<FNCBuildAST>,
        PatternAlg<FNCBuildAST>,
        ExceptionAlg<FNCBuildAST>,
        NullAlg<FNCBuildAST>,
        BindingAlg<FNCBuildAST>,
        TypeAlg<FNCBuildAST> {


    @Override
    default FNCBuildAST type(java.lang.String name) {
        return new Type(name);

    }

    @Override
    default FNCBuildAST unknownType() {
        return new UnknownType();
    }

    @Override
    default FNCBuildAST tag(java.lang.String name) {
//        return (env, given) -> vf.string(name);
        TypeTagNode typeTagNode = new TypeTagNode(name);
        return l -> typeTagNode;
    }

    @Override
    default FNCBuildAST typeVar(java.lang.String name) {
        return new TypeVar(name);
    }

    @Override
    default FNCBuildAST clVariant(java.lang.String tagName, FNCBuildAST exp) {
//        return (env, given) -> new CLVariant(vf.string(tagName), exp.eval(env, given));
        return l -> new TypeClVariantNode(tagName, exp.buildAST(l));
    }

    @Override
    default FNCBuildAST meta(java.lang.String name) {
        return l -> {
            return new TypeMetaNode(name);
        };
    }

    @Override
    default FNCBuildAST nomVal(FNCBuildAST nomTag, FNCBuildAST val) {
        return l -> {
            final FNCExpressionNode nte = nomTag.buildAST(l);
            final FNCExpressionNode ve = val.buildAST(l);

            return new TypeNomValNode(nte, ve);
        };
    }

    @Override
    default FNCBuildAST nomTag(FNCBuildAST token) {
        return token;
    }

    @Override
    default FNCBuildAST nomValSelect(FNCBuildAST nomTag, FNCBuildAST nomVal) {
//        return (env, given) -> {
//            ITuple nVal = (ITuple) nomVal.eval(env, given);
//            return whenTrue(equal(nomTag, (e, g) -> nVal.get(0)), (e, g) -> nVal.get(1)).eval(env, given);
//        };
//        throw new RuntimeException("Not implemented");
        return l -> {
            final FNCExpressionNode nve = nomVal.buildAST(l);
            final TypeNomValSelectNode ret = new TypeNomValSelectNode(nve);

            final FNCExpressionNode subnode = whenTrue(equal(nomTag, z -> ret.buildA()), (z) -> ret.buildB()).buildAST(l);
            ret.subnode = subnode;
            return ret;
        };
    }

    @Override
    default FNCBuildAST scopeNominalCoercion(FNCBuildAST type1, FNCBuildAST type2, FNCBuildAST abs) {
        return apply(abs, nomTag(freshToken()));
    }

    @Override
    default FNCBuildAST depends(FNCBuildAST type1, FNCBuildAST type2) {
//        return (env, given) ->
//                vf.tuple(
//                        type1.eval(env, given),
//                        type2.eval(env, given));
//        throw new RuntimeException("Not implemented");
        return l -> {
            return new TypeDependsNode(type1.buildAST(l), type2.buildAST(l));
        };
    }

    @Override
    default FNCBuildAST typed(FNCBuildAST exp, FNCBuildAST type) {
        return exp;
    }

    @Override
    default FNCBuildAST boundType(FNCBuildAST id) {
        return null_(); // TODO evaluated statically?
    }

    @Override
    default FNCBuildAST freshToken() {
//        return (env, given) -> new Token();
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST newType(FNCBuildAST name) {
//        return (env, given) ->
//                vf.tuple(
//                        name.eval(env, given),
//                        freshToken().eval(env, given));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST typeDef(FNCBuildAST id, FNCBuildAST type) {
        return environment();
    }

    @Override
    default FNCBuildAST restrictDomain(FNCBuildAST abs, FNCBuildAST type) {
        return abs;
    }

    @Override
    default FNCBuildAST pattAtType(FNCBuildAST patt, FNCBuildAST type) {
        return restrictDomain(patt, type);
    }

    @Override
    default FNCBuildAST variantMatch(FNCBuildAST tag, FNCBuildAST variant, FNCBuildAST patt) {
//        return (env, given) -> {
//            IValue v = variant.eval(env, given);
//            if (v instanceof CLVariant) {
//                CLVariant vVar = (CLVariant) v;
//                return whenTrue(equal(tag, (e, g) -> vVar.tag()), match((e, g) -> vVar.value(), patt)).eval(env, given);
//            }
//            return fail().eval(env, given);
//        };
        return l -> {
            final FNCExpressionNode z = fail().buildAST(l);
            final FNCExpressionNode ve = variant.buildAST(l);

            final TypeVariantMatchNode variantMatch = new TypeVariantMatchNode(ve, z);


            final FNCExpressionNode alte = whenTrue(equal(tag, (lo) -> variantMatch.buildA()), match(lo -> variantMatch.buildB(), patt)).buildAST(l);

            variantMatch.alte = alte;

            return variantMatch;
        };
    }

    class UnknownType implements FNCBuildAST {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new TypeUnknowTypeNode();
        }
    }

    class TypeVar implements FNCBuildAST {
        private final String name;

        public TypeVar(String name) {
            this.name = name;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {

            return new TypeTypeVarNode(name);
        }

    }

    class Type implements FNCBuildAST {
        private final String name;

        public Type(String name) {
            this.name = name;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new TypeTypeNode(name);
        }
    }

    @NodeInfo(description = "Type NomValSelect Node")
    class TypeNomValSelectNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode nve;
        @Child
        private FNCExpressionNode subnode;
        private ITuple nVal;


        public TypeNomValSelectNode(FNCExpressionNode nve) {
            this.nve = nve;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            this.nVal = (ITuple) nve.executeGeneric(frame);
            return subnode.executeGeneric(frame);
        }

        public FNCExpressionNode buildA() {
            return new TypeNomValSelectSubnode1();
        }

        public FNCExpressionNode buildB() {
            return new TypeNomValSelectSubnode2();
        }

        @NodeInfo(description = "TypeNomValSelectSubnode1")
        private class TypeNomValSelectSubnode1 extends FNCExpressionNode {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return nVal.get(0);
            }
        }

        @NodeInfo(description = "TypeNomValSelectSubnode2")
        private class TypeNomValSelectSubnode2 extends FNCExpressionNode {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return nVal.get(1);
            }
        }
    }

    @NodeInfo(description = "Type VariantMatch Node")
    class TypeVariantMatchNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode ve;

        @Child
        private FNCExpressionNode alte;

        @Child
        private FNCExpressionNode z;

        private CLVariant vVar;

        public TypeVariantMatchNode(FNCExpressionNode ve, FNCExpressionNode z) {
            this.ve = ve;
            this.z = z;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            final IValue v = (IValue) ve.executeGeneric(frame);
            if (v instanceof CLVariant) {
                this.vVar = (CLVariant) v;
                return alte.executeGeneric(frame);
            }
            return z.executeGeneric(frame);
        }

        public FNCExpressionNode buildA() {
            return new TypeVariantMatchSubnode1();
        }

        public FNCExpressionNode buildB() {
            return new TypeVariantMatchSubnode2();
        }

        @NodeInfo(description = "TypeVariantMatchSubnode1")
        private class TypeVariantMatchSubnode1 extends FNCExpressionNode {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return vVar.tag();
            }
        }

        @NodeInfo(description = "TypeVariantMatchSubnode2")
        private class TypeVariantMatchSubnode2 extends FNCExpressionNode {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return vVar.value();
            }
        }
    }

    @NodeInfo(description = "Type Meta Node")
    class TypeMetaNode extends FNCExpressionNode {
        private final String name;

        public TypeMetaNode(String name) {
            this.name = name;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            final IValueFactory vf = ValueFactory.getInstance();
            return vf.string(name);
        }
    }

    @NodeInfo(description = "Type NomVal Node")
    class TypeNomValNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode nte;

        @Child
        private FNCExpressionNode ve;

        public TypeNomValNode(FNCExpressionNode nte, FNCExpressionNode ve) {
            this.nte = nte;
            this.ve = ve;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            final IValueFactory vf = ValueFactory.getInstance();
            return vf.tuple((IValue) nte.executeGeneric(frame), (IValue) ve.executeGeneric(frame));
        }
    }

    @NodeInfo(description = "Type Depends Node")
    class TypeDependsNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode t1e;

        @Child
        private FNCExpressionNode t2e;

        public TypeDependsNode(FNCExpressionNode t1e, FNCExpressionNode t2e) {
            this.t1e = t1e;
            this.t2e = t2e;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            final IValueFactory vf = ValueFactory.getInstance();
            return vf.tuple((IValue) t1e.executeGeneric(frame), (IValue) t2e.executeGeneric(frame));
        }
    }
}

