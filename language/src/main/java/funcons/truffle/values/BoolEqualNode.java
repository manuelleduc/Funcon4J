package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IBool;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

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
        if(a instanceof IMap) {
            IMap set = ((IMap) a);
            Iterator<IValue> iterator = set.iterator();
            IValue tmp = iterator.next();
            return vf.bool(Objects.equals(set.get(tmp), b));
        }
        return vf.bool(Objects.equals(a, b));
    }

}
