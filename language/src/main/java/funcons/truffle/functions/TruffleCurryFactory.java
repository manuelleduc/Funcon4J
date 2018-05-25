package funcons.truffle.functions;

import com.oracle.truffle.api.frame.FrameSlot;
import com.oracle.truffle.api.frame.FrameSlotTypeException;
import com.oracle.truffle.api.frame.VirtualFrame;
import funcons.algebras.collections.TupleAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.CurryAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.values.BoolAlg;
import funcons.algebras.values.IntAlg;
import funcons.truffle.entities.SupplyGivenGivenNode;
import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCLanguage;
import funcons.values.signals.RunTimeFunconException;
import io.usethesource.vallang.IValue;

public interface TruffleCurryFactory extends
        FunctionAlg<FNCBuildAST>,
        TupleAlg<FNCBuildAST>,
        IntAlg<FNCBuildAST>,
        SupplyGivenAlg<FNCBuildAST>,
        BoolAlg<FNCBuildAST>,
        LogicControlAlg<FNCBuildAST>,
        CurryAlg<FNCBuildAST> {

    @Override
    default FNCBuildAST partialApp(FNCBuildAST f, FNCBuildAST x) {
        return abs(apply(f, tuple(x, given())));
    }

    @Override
    default FNCBuildAST partialAppN(FNCBuildAST f, FNCBuildAST x) {
//        return abs(apply(f, tuplePrefix(x, given())));
        throw new RuntimeException("Not implemented");
    }

    @Override
    default FNCBuildAST curry(FNCBuildAST a) {
        SupplyGivenGivenNode supplyGivenGivenNode = new SupplyGivenGivenNode();
        return l -> abs(m -> {
            return partialApp(a, n -> {
                return supplyGivenGivenNode;
            }).buildAST(l);
        }).buildAST(l);
    }

    @Override
    default FNCBuildAST curryN(FNCBuildAST n, FNCBuildAST a) {
        return l -> {
            CurryNNode curryNNode = new CurryNNode(n.buildAST(l));
            FNCExpressionNode fncExpressionNode1 = new CurryNSubnode1();
            FNCExpressionNode fncExpressionNode = curryNNode.buildA();
            curryNNode.child = ifTrue(
                    equal(z -> fncExpressionNode, lit(0)),
                    apply(a, tuple()),
                    abs((p) -> abs(q -> curryN(intSubtract(n, lit(1)), partialApp(a, r -> fncExpressionNode)).buildAST(q)).buildAST(p)))
                    .buildAST(l);
            return curryNNode;
        };
    }

    @Override
    default FNCBuildAST uncurry(FNCBuildAST f) {
        return abs(apply(apply(f, project(lit(0), given())), project(lit(1), given())));
    }

    class CurryNNode extends FNCExpressionNode {
        @Child
        private FNCExpressionNode n;
        @Child
        public FNCExpressionNode child;
        private IValue index;

        public CurryNNode(FNCExpressionNode n) {
            this.n = n;
        }

        @Override
        public Object executeGeneric(VirtualFrame frame) {
            this.index = (IValue) n.executeGeneric(frame);
            return child.executeGeneric(frame);
        }

        public FNCExpressionNode buildA() {
            return new CurryNSubnode();
        }

        private class CurryNSubnode extends FNCExpressionNode {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                return index;
            }
        }
    }

    class CurryNSubnode1 extends FNCExpressionNode {
        @Override
        public Object executeGeneric(VirtualFrame frame) {
            final FrameSlot given = frame.getFrameDescriptor().findOrAddFrameSlot("given");
            try {
                return frame.getObject(given);
            } catch (FrameSlotTypeException e) {
                throw new RuntimeException("Given not found", e);

            }
        }
    }
}
