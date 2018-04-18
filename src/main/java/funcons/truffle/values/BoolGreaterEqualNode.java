package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IBool;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.IReal;

@NodeInfo(description = "Bool GreaterEqual Node")
@NodeChildren({@NodeChild("a"), @NodeChild("b")})
public abstract class BoolGreaterEqualNode extends FNCExpressionNode {

    @Specialization
    public IBool greateEqual(IInteger a, IInteger b) {
        return a.greaterEqual(b);
    }

    @Specialization
    public IBool greateEqual(IReal a, IReal b) {
        return a.greaterEqual(b);
    }

    @Specialization
    public IBool greateEqual(IInteger a, IReal b) {
        return a.greaterEqual(b);
    }

    @Specialization
    public IBool greateEqual(IReal a, IInteger b) {
        return a.greaterEqual(b);
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        if (((IBool) alg.greater(a, b).buildAST()).getValue()) {
//            return alg.bool(true).buildAST();
//        }
//        return alg.equal(a, b).buildAST();
//    }
}
