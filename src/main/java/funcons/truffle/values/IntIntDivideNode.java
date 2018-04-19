package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IReal;


/**
 * return (env, given) ->
 * //                ((INumber) a.eval(env, given)).toInteger()
 * //                        .divide(((INumber) b.eval(env, given)).toInteger());
 */
@NodeChildren({@NodeChild("a"), @NodeChild("b")})
public abstract class IntIntDivideNode extends FNCExpressionNode {
    @Specialization
    public IInteger addIInteger(IInteger a, IInteger b) {
        return a.divide(b);
    }

    @Specialization
    public IReal addIInteger(IReal a, IReal b) {
        return a.divide(b, 5).toReal(5);
    }

    @Specialization
    public IInteger addIInteger(IInteger a, IReal b) {
        return a.divide(b.toInteger());

    }

    @Specialization
    public IReal addIInteger(IReal a, IInteger b) {
        return a.divide(b, 5).toReal(5);
    }
}
