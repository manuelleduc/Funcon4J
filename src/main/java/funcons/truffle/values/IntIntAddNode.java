package funcons.truffle.values;

import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import io.usethesource.vallang.IInteger;


@NodeInfo(description = "Int IntAdd Node")
@NodeChildren({
        @NodeChild("a"), @NodeChild("b")
})
public abstract class IntIntAddNode extends FNCExpressionNode implements FNCExecuteNode {

    @Specialization
    public IInteger addIInteger(IInteger a, IInteger b) {
        return a.add(b);
    }

//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return ((INumber) a.buildAST()).toInteger()
//                .add(((INumber) b.buildAST()).toInteger());
//    }
}
