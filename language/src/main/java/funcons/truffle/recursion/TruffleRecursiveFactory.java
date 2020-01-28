package funcons.truffle.recursion;

import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.functions.FNCUndefinedNameException;
import funcons.truffle.functions.TruffleFunctionFactory;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCFunction;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.Abs;
import io.usethesource.vallang.IValue;

public interface TruffleRecursiveFactory extends
        NullAlg<FNCBuildAST>,
        LogicControlAlg<FNCBuildAST>,
        BindingAlg<FNCBuildAST>,
        MapAlg<FNCBuildAST>,
        ListAlg<FNCBuildAST>,
        IntAlg<FNCBuildAST>,
        RecursiveAlg<FNCBuildAST> {

    @Override
    default FNCBuildAST freshFwd() {
        return new FreshFwd();
    }

    @Override
    default FNCBuildAST freshFwds(FNCBuildAST idList) {

        return l -> {
            return new FreshFwdsSubnode(idList.buildAST(l));
        };
    }


    @Override
    default FNCBuildAST setForwards(FNCBuildAST idFwdMap) {

        return l -> {
            final FNCExpressionNode idFwMape = idFwdMap.buildAST(l);
            final FNCExpressionNode undefe = undefined().buildAST(l);
            final FNCExpressionNode nullz = null_().buildAST(l);
            final SetForwardsNode setForwardsNode = new SetForwardsNode(idFwMape, undefe, nullz);
            final FNCExpressionNode a = setForwardsNode.getA();
            final FNCExpressionNode b = setForwardsNode.getB();
            setForwardsNode.mapDomain = mapDomain(l2 -> a).buildAST(l);
            setForwardsNode.mapGet = mapGet(z -> a, z -> b).buildAST(l);
            final FNCExpressionNode c = setForwardsNode.getC();
            setForwardsNode.lengthNode = listLength(n -> c).buildAST(l);
            return setForwardsNode;
        };
    }


    class SetForwardsNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode idFwMape;

        @Child
        private FNCExpressionNode undef;

        @Child
        private FNCExpressionNode nullz;

        @Child
        public FNCExpressionNode mapDomain;

        @Child
        public FNCExpressionNode mapGet;

        @Child
        public FNCExpressionNode lengthNode;
        private IValue mapVal;
        private IValue id;
        private IValue mapKeys;

        public SetForwardsNode(FNCExpressionNode idFwMape, FNCExpressionNode undefe, FNCExpressionNode nullz) {
            this.idFwMape = idFwMape;
            this.undef = undefe;
            this.nullz = nullz;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
         /*   // TODO: inspect for recursive error
            this.mapVal = (IList) idFwMape.executeGeneric(frame);
            this.mapKeys = (IValue) mapDomain.executeGeneric(frame);
            int length = ((IInteger) lengthNode.executeGeneric(frame)).intValue();
            for (int i = 0; i < length; i++) {
                this.id = ((IList) mapVal).get(i);

                final FrameSlot given = frame.getFrameDescriptor().findOrAddFrameSlot(id);
                IValue v = null;
                try {
                    v = (IValue) frame.getObject(given);
                } catch (FrameSlotTypeException e) {
                    e.printStackTrace();
                }

                if (v == null) {
                    v = (IValue) undef.executeGeneric(frame);
                }

                Fwd fwd = (Fwd) this.mapGet.executeGeneric(frame);
                if (fwd != null)
                    fwd.add(v);
            }
            return nullz.executeGeneric(frame);*/


            return null;
        }

        public FNCExpressionNode getA() {
            return new SetForwardsSubnode();
        }

        public FNCExpressionNode getB() {
            return new SetForwardsSubnode2();
        }

        public FNCExpressionNode getC() {
            return new SetForwardsSubnode3();
        }

        private class SetForwardsSubnode extends FNCExpressionNode {

            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return mapVal;
            }
        }

        private class SetForwardsSubnode2 extends FNCExpressionNode {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return id;
            }
        }

        private class SetForwardsSubnode3 extends FNCExpressionNode {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return mapKeys;
            }
        }
    }

    @Override
    default FNCBuildAST reclose(FNCBuildAST map, FNCBuildAST decl) {
        return l -> {
            final Recrec recrec = new Recrec(map.buildAST(l));
            final FNCExpressionNode m = recrec.buildM();
            recrec.acc = accum(scope(aaa -> m, decl), seq(setForwards(aa -> m), environment())).buildAST(l);
            return recrec;
        };
    }

    @Override
    default FNCBuildAST recursive(FNCBuildAST idList, FNCBuildAST decl) {
        return reclose(freshFwds(idList), decl);
    }

    @Override
    default FNCBuildAST recursiveTyped(FNCBuildAST idTypeMap, FNCBuildAST decl) {
        return recursive(mapDomain(idTypeMap), decl);
    }

    @Override
    default FNCBuildAST followFwd(FNCBuildAST fwd) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST followIfFwd(FNCBuildAST fwd) {
        return language -> {
            final FNCExpressionNode fwde = fwd.buildAST(language);
            return new RecursiveFollowIfFwdNode(fwde);
        };
    }

    class FreshFwd implements FNCBuildAST {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new RecursiveFwdNode();
        }
    }


    @NodeInfo(description = "Recursive FollowIfFwd Node")
    class RecursiveFollowIfFwdNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode fwde;

        public RecursiveFollowIfFwdNode(FNCExpressionNode fwde) {
            this.fwde = fwde;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            final Object v = fwde.executeGeneric(frame);
            if (v instanceof FNCFunction) {
                try {
                    final RootCallTarget callTarget = ((FNCFunction) v).getCallTarget();

                    final VirtualFrame virtualFrame = Truffle.getRuntime().createVirtualFrame(
                            frame.getArguments(), frame.getFrameDescriptor());

                    try {
                        for (FrameSlot s : frame.getFrameDescriptor().getSlots()) {
                            final Object val = frame.getObject(s);
                            virtualFrame.setObject(s, val);
                        }
                    } catch (FrameSlotTypeException e) {
                        e.printStackTrace();
                    }


                    return callTarget.getRootNode().execute(virtualFrame);
                } catch (FNCUndefinedNameException e) {
                    return null;
                }
            } else if (v instanceof TruffleFunctionFactory.FunctionAbsNode) {
                return ((TruffleFunctionFactory.FunctionAbsNode) v).executeGeneric(frame);
            } else if (v instanceof Abs) {
                return ((Abs) v).body();
            }
            return v;
        }
    }

    class Recrec extends FNCExpressionNode {
        @Child
        private FNCExpressionNode mape;

        @Child
        public FNCExpressionNode acc;
        private IValue m;

        public Recrec(FNCExpressionNode mape) {
            this.mape = mape;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            this.m = (IValue) mape.executeGeneric(frame);
            return acc.executeGeneric(frame);
        }

        public FNCExpressionNode buildM() {
            return new RecrecSubnode();
        }

        private class RecrecSubnode extends FNCExpressionNode {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return m;
            }
        }
    }

    class FreshFwdsSubnode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode idListe;

        public FreshFwdsSubnode(FNCExpressionNode idListe) {
            this.idListe = idListe;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            // TODO: Inspect in details
          /*  final IList idListVal = (IList) idListe.executeGeneric(frame);
            int listLength = idListVal.length();
            Fwd fwd = null;
            final IValueFactory vf = ValueFactory.getInstance();
            IListWriter lw = vf.listWriter();
            for (int i = 0; i < listLength; i++) {
                IValue id = idListVal.get(i);
                fwd = new Fwd();
                final FrameSlot given = frame.getFrameDescriptor().findOrAddFrameSlot(id);
                frame.setObject(given, fwd);
                lw.append(fwd);
            }
            return lw.done();*/

            return null;
        }
    }
}