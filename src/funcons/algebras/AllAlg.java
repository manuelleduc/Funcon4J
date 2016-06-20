package funcons.algebras;

import funcons.algebras.commands.PrintAlg;
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
        FloatCalcAlg<E>,
        FunctionAlg<E>,
        IntCalcAlg<E>,
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
