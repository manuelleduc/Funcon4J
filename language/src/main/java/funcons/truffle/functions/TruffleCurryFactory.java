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
import io.usethesource.vallang.IInteger;

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
    default FNCBuildAST curryN(FNCBuildAST value, FNCBuildAST fct) {
        return l -> {

            FNCExpressionNode vn = value.buildAST(l);
            FNCExpressionNode vfct = fct.buildAST(l);

            CurryNNode curryNNode = new CurryNNode(vn, vfct);
            /*FNCExpressionNode fncExpressionNode1 = new CurryNSubnode1();
            FNCExpressionNode fncExpressionNode = curryNNode.buildA();
            curryNNode.child = ifTrue(
                    equal(z -> fncExpressionNode, lit(0)),
                    apply(fct, tuple()),
                    abs((p) -> abs(q -> curryN(intSubtract(value, lit(1)), partialApp(fct, r -> fncExpressionNode)).buildAST(q)).buildAST(p)))
                    .buildAST(l);*/
            return curryNNode;
        };
    }

    @Override
    default FNCBuildAST uncurry(FNCBuildAST f) {
        return abs(apply(apply(f, project(lit(0), given())), project(lit(1), given())));
    }

    class CurryNNode extends FNCExpressionNode {

        /**
         * Number of parameters of the function
         */
        @Child
        private FNCExpressionNode patternSize;
        @Child
        public FNCExpressionNode fct;


        public CurryNNode(FNCExpressionNode patternSize, FNCExpressionNode vfct) {
            this.patternSize = patternSize;
            this.fct = vfct;
        }


        @Override
        public Object executeGeneric(VirtualFrame frame) {
            Object res = patternSize.executeGeneric(frame);
            int nb = ((IInteger) res).intValue();
            for (int i = 0; i < nb; i++) {
                Object tmp = fct.executeGeneric(frame);
                System.out.println(tmp);
            }

            final FrameSlot given = frame.getFrameDescriptor().findOrAddFrameSlot("given");

            System.err.println("get given @" + this);
            try {
                return frame.getObject(given);
            } catch (FrameSlotTypeException e) {
                e.printStackTrace();
            }

            return null;
        }

        class CurryNSubnode1 extends FNCExpressionNode {
            @Override
            public Object executeGeneric(VirtualFrame frame) {
                final FrameSlot given = frame.getFrameDescriptor().findOrAddFrameSlot("given");
                System.err.println("get given @" + this);
                try {
                    return frame.getObject(given);
                } catch (FrameSlotTypeException e) {
                    throw new RuntimeException("Given not found", e);

                }
            }
        }
    }
}
