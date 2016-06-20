package funcons.interpreter;

import funcons.carriers.IEval;
import funcons.interpreter.commands.PrintFactory;
import funcons.interpreter.functions.CurryFactory;
import funcons.interpreter.functions.FunctionFactory;
import funcons.interpreter.functions.PatternFactory;
import funcons.interpreter.controlflow.ExceptionFactory;
import funcons.interpreter.controlflow.LogicControlFactory;
import funcons.interpreter.recursion.RecursiveFactory;
import funcons.interpreter.storage.AssignFactory;
import funcons.interpreter.storage.BindFactory;
import funcons.interpreter.types.PolyTypeFactory;
import funcons.interpreter.types.TypeFactory;
import funcons.interpreter.values.*;

public interface AllFactory extends funcons.algebras.AllAlg<IEval>,
        AssignFactory,
        BindFactory,
        BoolFactory,
        CurryFactory,
        PatternFactory,
        ExceptionFactory,
        FloatCalcFactory,
        FunctionFactory,
        IntCalcFactory,
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
