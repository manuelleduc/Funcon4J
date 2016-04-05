package funcons.prettyprinter;

import funcons.algebras.LogicIfTrueAlg;
import funcons.algebras.LogicWhileTrueAlg;
import funcons.algebras.SeqAlg;
import funcons.sorts.IEval;
import funcons.types.String;

public class PrintableLogicControlFactory implements
        LogicIfTrueAlg<IEval<String>, IEval<String>>,
        SeqAlg<IEval<String>, IEval<String>>,
        LogicWhileTrueAlg<IEval<String>, IEval<String>> {

    @Override
    public IEval<String> bool(Boolean b) {
        return () -> new String(b);
    }

    @Override
    public IEval<String> command(IEval c) {
        return () -> new String(c.eval().toString()); // TODO seems hacky?
    }

    @Override
    public IEval<String> ifTrue(IEval<String> e, IEval<String> c1, IEval<String> c2) {
        return () -> new String("(" + e.eval().stringValue() + " ? " + c1.eval().stringValue() + " : " + c2.eval().stringValue() + ")");
    }

    @Override
    public IEval<String> seq(IEval<String> c, IEval<String> e) {
        return () -> new String("(" + c.eval().stringValue() + " -> " + e.eval().stringValue() + ")");
    }

    @Override
    public IEval<String> whileTrue(IEval<String> e, IEval<String> c) {
        return () -> new String("(While " + e.eval().stringValue() + " do " + c.eval().s);
    }
}
