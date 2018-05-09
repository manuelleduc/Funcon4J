package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IReal;

@NodeChildren({@NodeChild("a"), @NodeChild("b")})
public abstract class FloatFloatPowerOf extends FNCExpressionNode {
//    @Specialization
//    public IInteger pow(IInteger a, IInteger b) {
//
//        return a.toReal(5).pow(b.toReal(5), 5).toInteger();
//    }

    @Specialization
    public IReal pow(IReal a, IReal b) {
        return a.pow(b, 5);
    }

    @Specialization
    public IReal pow(IInteger a, IReal b) {
        return a.toReal(5).pow(b, 5);
    }
//
//    @Specialization
//    public IReal pow(IReal a, IInteger b) {
//        return a.pow(b.toReal(5), 5);
//    }
}
