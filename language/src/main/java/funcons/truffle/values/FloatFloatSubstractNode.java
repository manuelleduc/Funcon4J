package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IReal;

@NodeInfo(description = "Int IntSubstract Node")

@NodeChildren({@NodeChild("a"), @NodeChild("b")})
public abstract class FloatFloatSubstractNode extends FNCExpressionNode {


    @Specialization
    public IReal add(IReal a, IReal b) {
        return a.subtract(b);
    }


}
