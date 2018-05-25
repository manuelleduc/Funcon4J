package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;

@NodeInfo(description = "Int IntSubstract Node")
@NodeChildren({@NodeChild("a"), @NodeChild("b")})
public abstract class IntIntSubstractNode extends FNCExpressionNode {

    @Specialization
    public IInteger add(IInteger a, IInteger b) {
        return a.subtract(b);
    }


}
