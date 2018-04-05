package funcons.truffle.collections;

import funcons.truffle.nodes.FNCExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.entities.AssignAlg;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Vector vectore Node 2")
public class VectorVectorNode2 extends Node implements FNCExecuteNode {

    private final AssignAlg<FNCExecuteNode> aalg;
    ValueFactory vf = ValueFactory.getInstance();

    @Node.Child
    private FNCExecuteNode val;

    public VectorVectorNode2(FNCExecuteNode val, AssignAlg<FNCExecuteNode> aalg) {
        this.val = val;
        this.aalg = aalg;
    }
//
//    @Override
//    public CLExecuteNode buildAST() throws FunconException {
//        return vf.list((IValue) aalg.alloc(val).buildAST());
//    }
}
