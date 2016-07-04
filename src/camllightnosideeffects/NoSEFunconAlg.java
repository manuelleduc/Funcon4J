package camllightnosideeffects;

import funcons.algebras.auxiliary.IntFloatConversionAlg;
import funcons.algebras.collections.ListAlg;
import funcons.algebras.collections.MapAlg;
import funcons.algebras.collections.TupleAlg;
import funcons.algebras.controlflow.ExceptionAlg;
import funcons.algebras.controlflow.LogicControlAlg;
import funcons.algebras.entities.BindingAlg;
import funcons.algebras.entities.SupplyGivenAlg;
import funcons.algebras.functions.CurryAlg;
import funcons.algebras.functions.FunctionAlg;
import funcons.algebras.functions.PatternAlg;
import funcons.algebras.recursion.RecursiveAlg;
import funcons.algebras.types.PolyTypeAlg;
import funcons.algebras.types.TupleTypeAlg;
import funcons.algebras.types.TypeAlg;
import funcons.algebras.values.*;

public interface NoSEFunconAlg<E> extends
        BindingAlg<E>,
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
        RecursiveAlg<E>,
        StringAlg<E>,
        TupleAlg<E>,
        TupleTypeAlg<E>,
        TypeAlg<E>
//        AssignAlg<E>,
//        PrintAlg<E>,
//        RecordAlg<E>,
//        VectorAlg<E>
{}
