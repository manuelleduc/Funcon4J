package funcons.truffle.recursion;

import com.oracle.truffle.api.Assumption;
import com.oracle.truffle.api.RootCallTarget;
import com.oracle.truffle.api.Truffle;
import com.oracle.truffle.api.dsl.*;
import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.interop.*;
import com.oracle.truffle.api.nodes.DirectCallNode;
import com.oracle.truffle.api.nodes.IndirectCallNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.values.IntAlg;
import funcons.algebras.values.NullAlg;
import funcons.truffle.functions.FNCUndefinedNameException;
import funcons.truffle.functions.FunctionAbsNode;
import funcons.truffle.functions.TruffleFunctionFactory;
import funcons.truffle.nodes.*;
import funcons.values.Abs;
import funcons.values.recursion.Fwd;
import io.usethesource.vallang.*;
import io.usethesource.vallang.impl.persistent.ValueFactory;

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
//        return (env, given) -> new Fwd();
        return new FreshFwd();
    }

    @Override
    default FNCBuildAST freshFwds(FNCBuildAST idList) {
        /*return (env, given) -> {
            IEval envEval = environment();
            IValue idListVal = idList.eval(env, given);
            int lengthNode = ((IInteger)listLength((e, g)->idListVal).eval(env, given)).intValue();
            IValue undefined = undefined().eval(env, given);

            for (int i = 0; i < lengthNode; i++) {
                IValue id = projectList(lit(i), (e,g)->idListVal).eval(env, given);
                Fwd fwd = (Fwd)freshFwd().eval(env, given);
                fwd.add(undefined);

                envEval = mapUpdate(envEval, (e,g) -> id, (e,g) -> fwd);
            }

            return envEval.eval(env, given);
        };*/
       /* return language -> {
            final FNCExpressionNode envEval = (FNCExpressionNode) environment().buildAST(language);
            final FNCExpressionNode idListe = (FNCExpressionNode) idList.buildAST(language);
            final FNCExpressionNode undef = (FNCExpressionNode) undefined().buildAST(language);
            final FNCExpressionNode fwde = (FNCExpressionNode) freshFwd().buildAST(language);
            final FreshFwdsNode freshFwdsNode = new FreshFwdsNode(idListe, undef, envEval, fwde);
            freshFwdsNode.setLengthNode((FNCExpressionNode) listLength(x -> freshFwdsNode.buildL()).buildAST(language));
            return freshFwdsNode;
        };*/

        return l -> {
            FNCExpressionNode idListe = idList.buildAST(l);
            return new FreshFwdsSubnode(idListe);
        };
    }

    @NodeInfo(description = "FreshFwdsNode")
    class FreshFwdsNode extends FNCExpressionNode {

        @Child
        private FNCExpressionNode fwde;
        @Child
        private FNCExpressionNode envVal;
        @Child
        private FNCExpressionNode undef;
        @Child
        private FNCExpressionNode idListe;

        @Child
        private FNCExpressionNode idExec;

        @Child
        private FNCExpressionNode fwdExec;

        @Child
        private FNCExpressionNode envEvalN;

        @Child
        private FNCExpressionNode lengthNode;
        private IValue isListVal;

        public void setLengthNode(FNCExpressionNode lengthNode) {
            this.lengthNode = lengthNode;
        }

        public FreshFwdsNode(FNCExpressionNode idListe, FNCExpressionNode undef, FNCExpressionNode envEval, FNCExpressionNode fwde) {
            this.idListe = idListe;
            this.undef = undef;
            this.envVal = envEval;
            this.fwde = fwde;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            Object envEval = fwde.executeGeneric(frame);
            this.isListVal = (IValue) idListe.executeGeneric(frame);
            final int length = ((IInteger) lengthNode.executeGeneric(frame)).intValue();
            final IValue undefined = (IValue) undef.executeGeneric(frame);


            for (int i = 0; i < length; i++) {
                final IValue id = (IValue) idExec.executeGeneric(frame);
                final Fwd fwd = (Fwd) fwdExec.executeGeneric(frame);
                fwd.add(undefined);

                envEval = envEvalN.executeGeneric(frame);
            }

            return null;
//            return envEval.executeGeneric(frame);
        }

        public FNCExpressionNode buildL() {

            return new FreshFwdSubnode1();
        }

        private class FreshFwdSubnode1 extends FNCExpressionNode {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return isListVal;
            }
        }
    }

    @Override
    default FNCBuildAST setForwards(FNCBuildAST idFwdMap) {
//        return (env, given) -> {
//            IValue mapVal = idFwdMap.eval(env, given);
//            IValue mapKeys = mapDomain((e,g)->mapVal).eval(env, given);
//            int length = ((IInteger)listLength((e,g)->mapKeys).eval(env, given)).intValue();
//
//            for (int i = 0; i < length; i++) {
//                IValue id = projectList(lit(i), (e,g)->mapKeys).eval(env, given);
//                IValue v = boundValue((e,g)->id).eval(env, given);
//                if (v == null) {
//                    v = undefined().eval(env, given);
//                }
//                Fwd fwd = (Fwd)mapGet((e,g)->mapVal, (e,g)->id).eval(env, given);
//                fwd.add(v);
//            }
//
//            return null_().eval(env, given);
//        };

        return l -> {
            FNCExpressionNode idFwMape = idFwdMap.buildAST(l);
            FNCExpressionNode undefe = undefined().buildAST(l);
            FNCExpressionNode nullz = null_().buildAST(l);
            SetForwardsNode setForwardsNode = new SetForwardsNode(idFwMape, undefe, nullz);
            FNCExpressionNode a = setForwardsNode.getA();
            FNCExpressionNode b = setForwardsNode.getB();
            setForwardsNode.mapDomain = mapDomain(l2 -> a).buildAST(l);
            setForwardsNode.mapGet = mapGet(z -> a, z -> b).buildAST(l);
            //            int length = ((IInteger)listLength((e,g)->mapKeys).eval(env, given)).intValue();
            FNCExpressionNode c = setForwardsNode.getC();
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
            this.mapVal = (IList) idFwMape.executeGeneric(frame);
            this.mapKeys = (IValue) mapDomain.executeGeneric(frame);
            int length = ((IInteger) lengthNode.executeGeneric(frame)).intValue();
            for (int i = 0; i < length; i++) {
//                IValue id = projectList(lit(i), (e,g)->mapKeys).eval(env, given);
//                IValue v = boundValue((e,g)->id).eval(env, given);
//                if (v == null) {
//                    v = undefined().eval(env, given);
//                }
//                Fwd fwd = (Fwd)mapGet((e,g)->mapVal, (e,g)->id).eval(env, given);
//                fwd.add(v);
//                if (this.mapVal instanceof IMap)
//                    this.id = ((IMap) mapVal).get(i);
//                else if (this.mapVal instanceof IList)
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
            return nullz.executeGeneric(frame);
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
//        return new Reclose(map, decl, this);
        return l -> {
            /*
            *  final IValue m = map.eval(env, given);
            return accum(scope((e, g) -> m, decl), seq(setForwards((e, g) -> m), environment())).eval(env, given);
            * */

            FNCExpressionNode mape = map.buildAST(l);
            Recrec recrec = new Recrec(mape);
            FNCExpressionNode m = recrec.buildM();
            recrec.acc = accum(scope((aaa) -> m, decl), seq(setForwards((aa) -> m), environment())).buildAST(l);
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
//        return (env, given) -> ((Fwd)fwd.eval(env, given)).follow();
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST followIfFwd(FNCBuildAST fwd) {
//        return (env, given) -> {
//            IValue v = fwd.eval(env, given);
//            if (v instanceof Fwd) {
//                return ((Fwd)v).follow();
//            }
//            return v;
//        };
//        return new FollowIfFwd(fwd);
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

    class FreshFwds implements FNCBuildAST {
        private final FNCBuildAST idList;

        public FreshFwds(FNCBuildAST idList) {
            this.idList = idList;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new RecursiveFreshFwdsNode(idList.buildAST(l));
        }
    }

    class Reclose implements FNCBuildAST {
        private final FNCBuildAST map;
        private final FNCBuildAST decl;
        private final TruffleRecursiveFactory alg;


        public Reclose(FNCBuildAST map, FNCBuildAST decl, TruffleRecursiveFactory alg) {
            this.map = map;
            this.decl = decl;
            this.alg = alg;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return alg.accum(alg.scope(map, decl), alg.seq(alg.setForwards(map), alg.environment())).buildAST(l);
        }
    }




    @NodeInfo(description = "Recursive FollowIfFwd Node")
    class RecursiveFollowIfFwdNode extends FNCExpressionNode {

        private final FNCDispatchNode dispatchNode;
        @Child
        private FNCExpressionNode fwde;

        public RecursiveFollowIfFwdNode(FNCExpressionNode fwde) {
            this.fwde = fwde;
            this.dispatchNode = FNCDispatchNodeGen.create();
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            final Object v = fwde.executeGeneric(frame);
            if (v instanceof Fwd) {
                return ((Fwd) v).follow();
            } else if (v instanceof FNCFunction) {
                try {
                    final RootCallTarget callTarget = ((FNCFunction) v).getCallTarget();

                    final VirtualFrame virtualFrame = Truffle.getRuntime().createVirtualFrame(
                            frame.getArguments(), frame.getFrameDescriptor());

                    try {
                        for (FrameSlot s : frame.getFrameDescriptor().getSlots()) {
//                            System.out.println("FNCFONCTION");
                            final Object val = frame.getObject(s);
                            virtualFrame.setObject(s, val);
                        }
                    } catch (FrameSlotTypeException e) {
                        e.printStackTrace();
                    }


                    final Object execute = callTarget.getRootNode().execute(virtualFrame);
                    if (execute instanceof Abs) {
                        return ((Abs) execute).body();
                    }
                    return execute;
                } catch (FNCUndefinedNameException e) {
                    return null;
                }
            } else if (v instanceof FunctionAbsNode) {
                // FIXME: hack
                return ((FunctionAbsNode) v).executeGeneric(frame);
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
            final IList idListVal = (IList) idListe.executeGeneric(frame);
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
            return lw.done();
        }
    }
}