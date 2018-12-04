package funcons.truffle.auxiliary;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IReal;

@NodeInfo(description = "IntoFloatConversion FloatToInto Node")
@NodeChildren({@NodeChild("f")})
public abstract class IntoFloatConversionFloatToIntoNode extends FNCExpressionNode {


    public Object executeGeneric(IReal x) {
        return x.toInteger();
    }
}
