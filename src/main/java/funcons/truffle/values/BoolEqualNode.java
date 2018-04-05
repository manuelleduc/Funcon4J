package funcons.truffle.values;

import funcons.truffle.nodes.FNCExecuteNode;
import funcons.truffle.nodes.FNCExpressionNode;
import com.oracle.truffle.api.dsl.NodeChild;
import com.oracle.truffle.api.dsl.NodeChildren;
import com.oracle.truffle.api.dsl.Specialization;
import com.oracle.truffle.api.nodes.NodeInfo;
import io.usethesource.vallang.IBool;
import io.usethesource.vallang.IInteger;
import io.usethesource.vallang.impl.persistent.ValueFactory;

import java.util.Objects;

@NodeInfo(description = "Bool Equal Node")
@NodeChildren({
        @NodeChild("e1"),
        @NodeChild("e2")
})
public abstract class BoolEqualNode extends FNCExpressionNode implements FNCExecuteNode {
    ValueFactory vf = ValueFactory.getInstance();

//    @Child
//    private CLExecuteNode e1;
//
//    @Child
//    private CLExecuteNode e2;

//    public BoolEqualNode(CLExecuteNode e1, CLExecuteNode e2) {
//        this.e1 = e1;
//        this.e2 = e2;
//    }

    @Specialization
    protected IBool equal(IInteger a, IInteger b) {
        return vf.bool(a.isEqual(b));
    }

    @Specialization
    protected IBool equal(Object a, Object b) {
        return vf.bool(Objects.equals(a, b));
    }


//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.bool(e1.buildAST().isEqual(e2.buildAST()));
//    }
}
