package camllightnosideeffects;

public interface NoSEAlg<E> extends
    camllight.algebras.toplevel.NoSEModuleAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.constants.ConstantsAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.decls.BindAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.decls.GlobalAlg<E, NoSEFunconAlg<E>>,

    camllight.algebras.exprs.BoolLogicAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.exprs.ControlAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.exprs.ExceptionAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.exprs.ExpAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.exprs.FloatCalcAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.exprs.FunctionAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.exprs.IntCalcAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.exprs.LetAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.exprs.ListAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.exprs.StringAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.exprs.TupleAlg<E, NoSEFunconAlg<E>>,

    camllight.algebras.patts.ListPattAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.patts.PattAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.patts.PattMatchAlg<E, NoSEFunconAlg<E>>,
    camllight.algebras.patts.TuplePattAlg<E, NoSEFunconAlg<E>>,

    camllight.algebras.typeexprs.TypeExpAlg<E, NoSEFunconAlg<E>>

        //camllight.algebras.exprs.ArrayAlg<E, CLNoSEFunconAlg<E>>,
        //camllight.algebras.exprs.RecordAlg<E, CLNoSEFunconAlg<E>>,
        //camllight.algebras.exprs.RefAlg<E, CLNoSEFunconAlg<E>>,
{

    @Override
    NoSEFunconAlg<E> alg();
}
