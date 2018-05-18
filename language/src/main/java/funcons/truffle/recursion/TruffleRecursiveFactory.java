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
import funcons.truffle.functions.FunctionAbsNode;
import funcons.truffle.nodes.*;
import funcons.values.Abs;
import funcons.values.recursion.Fwd;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IValue;

public interface TruffleRecursiveFactory extends
        NullAlg<FNCExecuteNode>,
        LogicControlAlg<FNCExecuteNode>,
        BindingAlg<FNCExecuteNode>,
        MapAlg<FNCExecuteNode>,
        ListAlg<FNCExecuteNode>,
        IntAlg<FNCExecuteNode>,
        RecursiveAlg<FNCExecuteNode> {

    @Override
    default FNCExecuteNode freshFwd() {
//        return (env, given) -> new Fwd();
        return new FreshFwd();
    }

    @Override
    default FNCExecuteNode freshFwds(FNCExecuteNode idList) {
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

        throw new RuntimeException("Not implemented");
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
        private FNCExpressionNode idExec; // projectList(lit(i), (e,g)->idListVal).eval(env, given)

        @Child
        private FNCExpressionNode fwdExec; //freshFwd().eval(env, given)

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
            int length = ((IInteger) lengthNode.executeGeneric(frame)).intValue();
            IValue undefined = (IValue) undef.executeGeneric(frame);


            for (int i = 0; i < length; i++) {
                IValue id = (IValue) idExec.executeGeneric(frame);
                Fwd fwd = (Fwd) fwdExec.executeGeneric(frame);
                fwd.add(undefined);

                envEval = envEvalN.executeGeneric(frame);
            }

            return null;
//            return envEval.executeGeneric(frame);
        }

        public FNCExpressionNode buildL() {

            return new FNCExpressionNode() {
                @Override
                public Object executeGeneric(VirtualFrame frame) {
                    return isListVal;
                }
            };
        }
    }

    @Override
    default FNCExecuteNode setForwards(FNCExecuteNode idFwdMap) {
        return new SetForwards(idFwdMap);
    }

    @Override
    default FNCExecuteNode reclose(FNCExecuteNode map, FNCExecuteNode decl) {
        return new Reclose(map, decl, this);
    }

    @Override
    default FNCExecuteNode recursive(FNCExecuteNode idList, FNCExecuteNode decl) {
        return reclose(freshFwds(idList), decl);
    }

    @Override
    default FNCExecuteNode recursiveTyped(FNCExecuteNode idTypeMap, FNCExecuteNode decl) {
        return recursive(mapDomain(idTypeMap), decl);
    }

    @Override
    default FNCExecuteNode followFwd(FNCExecuteNode fwd) {
//        return (env, given) -> ((Fwd)fwd.eval(env, given)).follow();
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCExecuteNode followIfFwd(FNCExecuteNode fwd) {
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
            return new FNCExpressionNode() {
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
                                    final Object val = frame.getObject(s);
                                    final FrameSlot s2 = virtualFrame.getFrameDescriptor().findOrAddFrameSlot(s.getIdentifier());
                                    virtualFrame.setObject(s2, val);
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
                    } else if(v instanceof FunctionAbsNode) {
                        // FIXME: hack
                        return ((FunctionAbsNode) v).executeGeneric(frame);
                    } else if (v instanceof Abs) {
                        return ((Abs)v).body();
                    }
                    return v;
                }
            };
        };
    }

    class FreshFwd implements FNCExecuteNode {
        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new RecursiveFwdNode();
        }
    }

    class FreshFwds implements FNCExecuteNode {
        private final FNCExecuteNode idList;

        public FreshFwds(FNCExecuteNode idList) {
            this.idList = idList;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new RecursiveFreshFwdsNode(idList.buildAST(l));
        }
    }

    class SetForwards implements FNCExecuteNode {
        private final FNCExecuteNode idFwdMap;

        public SetForwards(FNCExecuteNode idFwdMap) {
            this.idFwdMap = idFwdMap;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return new RecursiveSetForwardsNode(idFwdMap.buildAST(l));
        }
    }

    class Reclose implements FNCExecuteNode {
        private final FNCExecuteNode map;
        private final FNCExecuteNode decl;
        private final TruffleRecursiveFactory alg;


        public Reclose(FNCExecuteNode map, FNCExecuteNode decl, TruffleRecursiveFactory alg) {
            this.map = map;
            this.decl = decl;
            this.alg = alg;
        }

        @Override
        public FNCExpressionNode buildAST(FNCLanguage l) throws funcons.values.signals.RunTimeFunconException {
            return alg.accum(alg.scope(map, decl), alg.seq(alg.setForwards(map), alg.environment())).buildAST(l);
        }
    }


}