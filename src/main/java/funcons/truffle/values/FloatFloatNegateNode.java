package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IReal;

@NodeChild("a")
public abstract class FloatFloatNegateNode extends FNCExpressionNode {


    @Specialization
    public IReal negate(IReal x) {
        return x.negate();
    }
}
