package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IBool;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.impl.persistent.ValueFactory;

import java.util.Objects;

@NodeInfo(description = "Bool Equal Node")
@NodeChildren({@NodeChild("e1"), @NodeChild("e2")})
public abstract class BoolEqualNode extends FNCExpressionNode {
    private final ValueFactory vf = ValueFactory.getInstance();

    @Specialization
    protected IBool equal(IInteger a, IInteger b) {
        return vf.bool(a.isEqual(b));
    }

    @Specialization
    protected IBool equal(Object a, Object b) {
        return vf.bool(Objects.equals(a, b));
    }

}
