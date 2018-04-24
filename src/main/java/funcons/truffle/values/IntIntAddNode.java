package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IReal;


@NodeInfo(description = "Int IntAdd Node")
@NodeChildren({
        @NodeChild("a"), @NodeChild("b")
})
public abstract class IntIntAddNode extends FNCExpressionNode {

    @Specialization
    public IInteger addIInteger(IInteger a, IInteger b) {
        return a.add(b);
    }

    @Specialization
    public IReal addIInteger(IReal a, IReal b) {
        return a.add(b);
    }

    @Specialization
    public IReal addIInteger(IInteger a, IReal b) {
        return a.add(b);
    }

    @Specialization
    public IReal addIInteger(IReal a, IInteger b) {
        return a.add(b.toReal(5));
    }

}
