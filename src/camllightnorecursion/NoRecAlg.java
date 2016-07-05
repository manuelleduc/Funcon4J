package camllightnorecursion;

import camllight.algebras.toplevel.TestableModuleAlg;
import funcons.algebras.AllAlg;

public interface NoRecAlg<E> extends
        TestableModuleAlg<E, AllAlg<E>>,

        camllight.algebras.constants.ConstantsAlg<E, funcons.algebras.AllAlg<E>>,

        camllight.algebras.decls.BindAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.decls.GlobalAlg<E, funcons.algebras.AllAlg<E>>,
        //camllight.algebras.decls.RecBindAlg<E, funcons.algebras.AllAlg<E>>,

        camllight.algebras.exprs.ArrayAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.exprs.BoolLogicAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.exprs.ControlAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.exprs.ExceptionAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.exprs.ExpAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.exprs.FloatCalcAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.exprs.FunctionAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.exprs.IntCalcAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.exprs.LetAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.exprs.ListAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.exprs.RecordAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.exprs.RefAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.exprs.StringAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.exprs.TupleAlg<E, funcons.algebras.AllAlg<E>>,

        camllight.algebras.patts.ListPattAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.patts.PattAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.patts.PattMatchAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.patts.RecordPattAlg<E, funcons.algebras.AllAlg<E>>,
        camllight.algebras.patts.TuplePattAlg<E, funcons.algebras.AllAlg<E>>,

        camllight.algebras.typeexprs.TypeExpAlg<E, funcons.algebras.AllAlg<E>>
{
    @Override
    funcons.algebras.AllAlg<E> alg();
}
