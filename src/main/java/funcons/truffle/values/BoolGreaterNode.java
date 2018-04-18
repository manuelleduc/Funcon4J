package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.frame.VirtualFrame;
import com.oracle.truffle.api.nodes.NodeInfo;
import com.oracle.truffle.api.nodes.UnexpectedResultException;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IBool;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IReal;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Bool Greater Node ")
@NodeChildren({@NodeChild("a"), @NodeChild("b")})
public abstract class BoolGreaterNode extends FNCExpressionNode {

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
}
