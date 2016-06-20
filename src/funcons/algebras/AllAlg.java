package funcons.algebras;

import funcons.algebras.auxiliary.IntFloatConversionAlg;
import funcons.algebras.auxiliary.PrintAlg;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.functions.CurryAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.storage.EnvironmentAlg;
import funcons.algebras.storage.StoreAlg;
import funcons.algebras.storage.SupplyGivenAlg;
import funcons.algebras.types.PolyTypeAlg;
import funcons.algebras.types.TypeAlg;
import funcons.algebras.values.*;

public interface AllAlg<E> extends
        StoreAlg<E>,
        EnvironmentAlg<E>,
        SupplyGivenAlg<E>,
        BoolAlg<E>,
        CurryAlg<E>,
        PatternAlg<E>,
        ExceptionAlg<E>,
        FloatAlg<E>,
        FunctionAlg<E>,
        IntAlg<E>,
        IntFloatConversionAlg<E>,
        ListAlg<E>,
        LogicControlAlg<E>,
        MapAlg<E>,
        NullAlg<E>,
        PolyTypeAlg<E>,
        PrintAlg<E>,
        RecordAlg<E>,
        RecursiveAlg<E>,
        StringAlg<E>,
        TupleAlg<E>,
        TypeAlg<E>,
        VectorAlg<E>
{}
