package funcons.interpreter;

import funcons.carriers.IEval;
import funcons.interpreter.commands.PrintFactory;
import funcons.interpreter.controlflow.ExceptionFactory;
import funcons.interpreter.controlflow.LogicControlFactory;
import funcons.interpreter.functions.CurryFactory;
import funcons.interpreter.functions.FunctionFactory;
import funcons.interpreter.functions.PatternFactory;
import funcons.interpreter.recursion.RecursiveFactory;
import funcons.interpreter.storage.EnvironmentFactory;
import funcons.interpreter.storage.StoreFactory;
import funcons.interpreter.storage.SupplyGivenFactory;
import funcons.interpreter.types.PolyTypeFactory;
import funcons.interpreter.types.TypeFactory;
import funcons.interpreter.values.*;

public interface AllFactory extends funcons.algebras.AllAlg<IEval>,
        StoreFactory,
        EnvironmentFactory,
        SupplyGivenFactory,
        BoolFactory,
        CurryFactory,
        PatternFactory,
        ExceptionFactory,
        FloatFactory,
        FunctionFactory,
        IntFactory,
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
        TypeFactory,
        VectorFactory
{}
