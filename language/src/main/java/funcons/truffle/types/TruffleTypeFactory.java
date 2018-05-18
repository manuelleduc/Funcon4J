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
import funcons.values.cl.CLVariant;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.ITuple;
import io.usethesource.vallang.IValue;
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
        return l -> new TypeTagNode(name);
    }

    @Override
    default FNCExecuteNode typeVar(java.lang.String name) {
        return new TypeVar(name);
    }

    @Override
    default FNCExecuteNode clVariant(java.lang.String tagName, FNCExecuteNode exp) {
//        return (env, given) -> new CLVariant(vf.string(tagName), exp.eval(env, given));
        return l -> new TypeClVariantNode(tagName, exp.buildAST(l));
    }

    @Override
    default FNCExecuteNode meta(java.lang.String name) {
        return l -> new FNCExpressionNode() {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                final IValueFactory vf = ValueFactory.getInstance();
                return vf.string(name);
            }
        };
    }

    @Override
    default FNCExecuteNode nomVal(FNCExecuteNode nomTag, FNCExecuteNode val) {
        return l -> {
            final FNCExpressionNode nte = nomTag.buildAST(l);
            final FNCExpressionNode ve = val.buildAST(l);

            return new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    final IValueFactory vf = ValueFactory.getInstance();
                    return vf.tuple((IValue) nte.executeGeneric(frame), (IValue) ve.executeGeneric(frame));
                }
            };
        };
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
//        throw new RuntimeException("Not implemented");
        return l -> {
            FNCExpressionNode nve = nomVal.buildAST(l);
            TypeNomValSelectNode ret = new TypeNomValSelectNode(nve);

            FNCExpressionNode subnode = whenTrue(equal(nomTag, z -> ret.buildA()), (z) -> ret.buildB()).buildAST(l);
            ret.subnode = subnode;
            return ret;
        };
    }

    @Override
    default FNCExecuteNode scopeNominalCoercion(FNCExecuteNode type1, FNCExecuteNode type2, FNCExecuteNode abs) {
        return apply(abs, nomTag(freshToken()));
    }

    @Override
    default FNCExecuteNode depends(FNCExecuteNode type1, FNCExecuteNode type2) {
//        return (env, given) ->
//                vf.tuple(
//                        type1.eval(env, given),
//                        type2.eval(env, given));
//        throw new RuntimeException("Not implemented");
        return l -> {
            final FNCExpressionNode t1e = type1.buildAST(l);
            final FNCExpressionNode t2e = type2.buildAST(l);
            return new FNCExpressionNode() {

                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    final IValueFactory vf = ValueFactory.getInstance();
                    return vf.tuple((IValue) t1e.executeGeneric(frame), (IValue) t2e.executeGeneric(frame));
                }
            };
        };
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
        return l -> {
            FNCExpressionNode z = fail().buildAST(l);
            FNCExpressionNode ve = variant.buildAST(l);

            final VariantMatch variantMatch = new VariantMatch(ve, z);


            FNCExpressionNode alte = whenTrue(equal(tag, (lo) -> variantMatch.buildA()), match(lo -> variantMatch.buildB(), patt)).buildAST(l);

            variantMatch.alte = alte;

            return variantMatch;
        };
    }

    class UnknownType implements FNCExecuteNode {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new TypeUnknowTypeNode();
        }
    }

    class TypeVar implements FNCExecuteNode {
        private final String name;

        public TypeVar(String name) {
            this.name = name;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {

            return new TypeTypeVarNode(name);
        }

    }

    class Type implements FNCExecuteNode {
        private final String name;

        public Type(String name) {
            this.name = name;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws RunTimeFunconException {
            return new TypeTypeNode(name);
        }
    }

    class TypeNomValSelectNode extends FNCExpressionNode {
        private final FNCExpressionNode nve;
        private ITuple nVal;

        private FNCExpressionNode subnode;

        public TypeNomValSelectNode(FNCExpressionNode nve) {
            this.nve = nve;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            this.nVal = (ITuple) nve.executeGeneric(frame);
            return subnode.executeGeneric(frame);
        }

        public FNCExpressionNode buildA() {
            return new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return nVal.get(0);
                }
            };
        }

        public FNCExpressionNode buildB() {
            return new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return nVal.get(1);
                }
            };
        }
    }

    class VariantMatch extends FNCExpressionNode {
        private final FNCExpressionNode ve;
        private FNCExpressionNode alte;
        private final FNCExpressionNode z;
        private CLVariant vVar;

        public VariantMatch(FNCExpressionNode ve, FNCExpressionNode z) {
            this.ve = ve;
            this.z = z;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            IValue v = (IValue) ve.executeGeneric(frame);
            if (v instanceof CLVariant) {
                this.vVar = (CLVariant) v;
                return alte.executeGeneric(frame);
            }
            return z.executeGeneric(frame);
        }

        public FNCExpressionNode buildA() {
            return new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return vVar.tag();
                }
            };
        }

        public FNCExpressionNode buildB() {
            return new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return vVar.value();
                }
            };
        }
    }
}

