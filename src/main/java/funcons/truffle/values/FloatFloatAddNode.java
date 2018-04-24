package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import funcons.truffle.nodes.FNCExpressionNode;
import funcons.truffle.nodes.FNCStatementNode;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IReal;

@NodeChildren({@NodeChild("a"), @NodeChild("b")})
public abstract class FloatFloatAddNode extends FNCExpressionNode {


    @Specialization
    public IInteger add(IInteger a, IInteger b) {
        return a.add(b);
    }

    @Specialization
    public IReal add(IReal a, IReal b) {
        return a.add(b);
    }

    @Specialization
    public IReal add(IInteger a, IReal b) {
        return a.add(b);
    }

    @Specialization
    public IReal add(IReal a, IInteger b) {
        return a.add(b.toReal(5));
    }


}
