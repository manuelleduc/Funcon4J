package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IReal;


@NodeChildren({@NodeChild("l"), @NodeChild("b")})
public abstract class FloatFloatMultiplyNode extends FNCExpressionNode {


//    @Specialization
//    public IInteger addIInteger(IInteger a, IInteger b) {
//        return a.multiply(b);
//    }

    @Specialization
    public IReal addIInteger(IReal a, IReal b) {
        return a.multiply(b);
    }

//    @Specialization
//    public IReal addIInteger(IInteger a, IReal b) {
//        return a.multiply(b);
//    }
//
//    @Specialization
//    public IReal addIInteger(IReal a, IInteger b) {
//        return a.multiply(b.toReal(5));
//    }

}
