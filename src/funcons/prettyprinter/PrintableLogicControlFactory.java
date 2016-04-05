package funcons.prettyprinter;

import funcons.algebras.LogicIfTrueAlg;
import funcons.algebras.LogicWhileTrueAlg;
import funcons.algebras.SeqAlg;
import funcons.sorts.IPrint;
import funcons.types.String;

public interface PrintableLogicControlFactory extends
        LogicIfTrueAlg<IPrint>,
        SeqAlg<IPrint>,
        LogicWhileTrueAlg<IPrint> {

    @Override
    default IPrint bool(Boolean b) {
        return () -> new String(b);
    }

    @Override
    default IPrint ifTrue(IPrint e, IPrint c1, IPrint c2) {
        return () -> new String("(" + e.print().stringValue() + " ? " + c1.print().stringValue() + " : " + c2.print().stringValue() + ")");
    }

    @Override
    default IPrint seq(IPrint c, IPrint e) {
        return () -> new String("(" + c.print().stringValue() + " -> " + e.print().stringValue() + ")");
    }

    @Override
    default IPrint whileTrue(IPrint e, IPrint c) {
        return () -> new String("(While " + e.print().stringValue() + " do " + c.print().stringValue() + ")");
    }
}
