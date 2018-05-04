package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IReal;

@NodeInfo(description = "Float Float Negate Node")
@NodeChild("a")
public abstract class FloatFloatNegateNode extends FNCExpressionNode {


    @Specialization
    public IReal negate(IReal x) {
        return x.negate();
    }
}
