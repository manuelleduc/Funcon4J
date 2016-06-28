package funcons.interpreter;

import funcons.carriers.IEval;
import funcons.interpreter.auxiliary.IntoFloatConversionFactory;
import funcons.interpreter.auxiliary.PrintFactory;
import funcons.interpreter.collections.*;
import funcons.interpreter.controlflow.ExceptionFactory;
import funcons.interpreter.controlflow.LogicControlFactory;
import funcons.interpreter.entities.AssignFactory;
import funcons.interpreter.entities.BindingFactory;
import funcons.interpreter.entities.SupplyGivenFactory;
import funcons.interpreter.functions.CurryFactory;
import funcons.interpreter.functions.FunctionFactory;
import funcons.interpreter.functions.PatternFactory;
import funcons.interpreter.recursion.RecursiveFactory;
import funcons.interpreter.types.PolyTypeFactory;
import funcons.interpreter.types.TupleTypeFactory;
import funcons.interpreter.types.TypeFactory;
import funcons.interpreter.values.*;

public interface AllFactory extends funcons.algebras.AllAlg<IEval>,
        AssignFactory,
        BindingFactory,
        SupplyGivenFactory,
        BoolFactory,
        CurryFactory,
        PatternFactory,
        ExceptionFactory,
        FloatFactory,
        FunctionFactory,
        IntFactory,
        IntoFloatConversionFactory,
        ListFactory,
        LogicControlFactory,
        MapFactory,
        NullFactory,
        PolyTypeFactory,
        PrintFactory,
        RecordFactory,
        RecursiveFactory,
        StringFactory,
        TupleFactory,
        TupleTypeFactory,
        TypeFactory,
        VectorFactory
{}
