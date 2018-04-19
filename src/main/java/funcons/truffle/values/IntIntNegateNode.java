package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.Specialization;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.INumber;

@NodeChild("a")
public abstract class IntIntNegateNode extends FNCExpressionNode {


    @Specialization
    public IInteger negate(INumber x) {
        return x.toInteger().negate();
    }
}
