package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.helper.RascalValueComperator;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.*;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Bool Greater Node ")
@NodeChildren({@NodeChild("a"), @NodeChild("b")})
public abstract class BoolGreaterNode extends FNCExpressionNode {

    private IValueFactory vf = ValueFactory.getInstance();

    @Specialization
    public IBool greateEqual(IInteger a, IInteger b) {
        return a.greater(b);
    }

    @Specialization
    public IBool greateEqual(IReal a, IReal b) {
        return a.greater(b);
    }

    @Specialization
    public IBool greateEqual(IInteger a, IReal b) {
        return a.greater(b);
    }

    @Specialization
    public IBool greateEqual(IReal a, IInteger b) {
        return a.greater(b);
    }

    @Specialization
    public IBool greateEqual(Object a, Object b) {
        final IValue aVal = (IValue) a;
        IValue bVal = (IValue) b;
        return vf.bool(RascalValueComperator.compare(aVal, bVal) == 1);
    }
}
