package funcons.prettyprinter;

import funcons.algebras.IntCalcAlg;
import funcons.sorts.IPrint;
import funcons.types.String;

public interface PrintableIntCalcFactory extends IntCalcAlg<IPrint> {

    @Override
    default IPrint lit(Integer i) {
        return () -> new String(i);
    }

    @Override
    default IPrint bool(Boolean b) {
        return () -> new String(b);
    }

    @Override
    default IPrint add(IPrint a, IPrint b) {
        return () -> new String("(" + a.print().stringValue() + " + " + b.print().stringValue() + ")");
    }

    @Override
    default IPrint subtract(IPrint a, IPrint b) {
        return () -> new String("(" + a.print().stringValue() + " - " + b.print().stringValue() + ")");
    }

    @Override
    default IPrint multiply(IPrint a, IPrint b) {
        return () -> new String("(" + a.print().stringValue() + " * " + b.print().stringValue() + ")");
    }

    @Override
    default IPrint divide(IPrint a, IPrint b) {
        return () -> new String("(" + a.print().stringValue() + " / " + b.print().stringValue() + ")");
    }
}
