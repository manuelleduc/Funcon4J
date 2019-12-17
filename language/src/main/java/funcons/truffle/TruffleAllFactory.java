package funcons.truffle;

import funcons.truffle.nodes.FNCBuildAST;
import funcons.truffle.auxiliary.TruffleIntoFloatConversionFactory;
import funcons.truffle.auxiliary.TrufflePrintFactory;
import funcons.truffle.collections.*;
import funcons.truffle.controlflow.TruffleExceptionFactory;
import funcons.truffle.controlflow.TruffleLogicControlFactory;
import funcons.truffle.entities.TruffleAssignFactory;
import funcons.truffle.entities.TruffleBindingFactory;
import funcons.truffle.entities.TruffleSupplyGivenFactory;
import funcons.truffle.functions.TruffleCurryFactory;
import funcons.truffle.functions.TruffleFunctionFactory;
import funcons.truffle.functions.TrufflePatternFactory;
import funcons.truffle.recursion.TruffleRecursiveFactory;
import funcons.truffle.types.TrufflePolyTypeFactory;
import funcons.truffle.types.TruffleTupleTypeFactory;
import funcons.truffle.types.TruffleTypeFactory;
import funcons.truffle.values.*;

public interface TruffleAllFactory extends funcons.algebras.AllAlg<FNCBuildAST>,
        TruffleAssignFactory,
        TruffleBindingFactory,
        TruffleSupplyGivenFactory,
        TruffleBoolFactory,
        TruffleCurryFactory,
        TrufflePatternFactory,
        TruffleExceptionFactory,
        TruffleFloatFactory,
        TruffleFunctionFactory,
        TruffleIntFactory,
        TruffleIntoFloatConversionFactory,
        TruffleListFactory,
        TruffleLogicControlFactory,
        TruffleMapFactory,
        TruffleNullFactory,
        TrufflePolyTypeFactory,
        TrufflePrintFactory,
        TruffleRecordFactory,
        TruffleRecursiveFactory,
        TruffleStringFactory,
        TruffleTupleFactory,
        TruffleTupleTypeFactory,
        TruffleTypeFactory,
        TruffleVectorFactory {
}

