package funcons.truffle.collections;

import camllight.truffle.nodes.CLExecuteNode;
import com.oracle.truffle.api.nodes.Node;
import com.oracle.truffle.api.nodes.NodeInfo;
import funcons.algebras.entities.AssignAlg;
import funcons.values.signals.FunconException;
import io.usethesource.vallang.IMap;
import io.usethesource.vallang.IValue;
import io.usethesource.vallang.impl.persistent.ValueFactory;

@NodeInfo(description = "Vector vectore Node 2")
public class VectorVectorNode2 extends Node implements CLExecuteNode {

    private final AssignAlg<CLExecuteNode> aalg;
    ValueFactory vf = ValueFactory.getInstance();

    @Node.Child
    private CLExecuteNode val;

    public VectorVectorNode2(CLExecuteNode val, AssignAlg<CLExecuteNode> aalg) {
        this.val = val;
        this.aalg = aalg;
    }

    @Override
    public IValue buildAST(IMap env, IValue given) throws FunconException {
        return vf.list((IValue) aalg.alloc(val).buildAST(env, given));
    }
}
