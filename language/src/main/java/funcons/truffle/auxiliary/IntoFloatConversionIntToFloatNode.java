package funcons.truffle.auxiliary;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IReal;

@NodeInfo(description = "IntoFloatConversion IntToFloat Node")
@NodeChildren({@NodeChild("i")})
public abstract class IntoFloatConversionIntToFloatNode extends FNCExpressionNode {

    @Specialization
    public IReal conversion(IInteger i) {
        return i.toReal(5);
    }

}
